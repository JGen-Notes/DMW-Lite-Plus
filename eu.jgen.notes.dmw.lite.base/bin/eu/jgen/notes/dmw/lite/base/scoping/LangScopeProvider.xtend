/**
 * [The "BSD license"]
 * Copyright (c) 2016, JGen Notes
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions 
 *    and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, 
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS 
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package eu.jgen.notes.dmw.lite.base.scoping


import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EReference
import org.eclipse.xtext.scoping.IScope

import org.eclipse.xtext.scoping.Scopes

import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.utility.LangUtil
import eu.jgen.notes.dmw.lite.typing.LangTypeComputer
import eu.jgen.notes.dmw.lite.base.lang.LangPackage
import eu.jgen.notes.dmw.lite.base.lang.YMemberSelection
import eu.jgen.notes.dmw.lite.base.lang.YFunction
import eu.jgen.notes.dmw.lite.base.lang.YBlock
import eu.jgen.notes.dmw.lite.base.lang.YVariableDeclaration
import eu.jgen.notes.dmw.lite.base.lang.YEnumerationCase
import eu.jgen.notes.dmw.lite.base.lang.YCatchBlock
import eu.jgen.notes.dmw.lite.base.lang.YCatch

class LangScopeProvider extends AbstractLangScopeProvider {

	val epackage = LangPackage.eINSTANCE
	@Inject extension LangUtil
	@Inject extension LangTypeComputer

	override getScope(EObject context, EReference reference) {
		
		if (reference == epackage.YSymbolRef_Symbol) {
			return scopeForSymbolRef(context)
		} else if (context instanceof YMemberSelection) {
			return scopeForMemberSelection(context,reference)
		} 
		return super.getScope(context, reference)
	}

	def protected IScope scopeForSymbolRef(EObject context) {
		val container = context.eContainer
		return switch (container) {
			YCatchBlock:
			   Scopes.scopeFor(((container.eContainer as YCatch).exception as YEnumerationCase).params)
			YFunction:
				Scopes.scopeFor(container.params)
			YBlock:
				Scopes.scopeFor(
					container.statements.takeWhile[it != context].filter(YVariableDeclaration),
					scopeForSymbolRef(container)  			
				)
			default:
				scopeForSymbolRef(container)
		}
	}

	def protected IScope scopeForMemberSelection(YMemberSelection selection, EReference reference) {		
		val type = selection.receiver.typeFor
		if (type === null || type.isPrimitive)
			return IScope.NULLSCOPE
		val grouped = type.
			classHierarchyMembers.groupBy[it instanceof YFunction]  
		val inheritedMethods = grouped.get(true) ?: emptyList
		val inheritedFields = grouped.get(false) ?: emptyList
		if (selection.functioninvocation) {
			return Scopes.scopeFor(
				type.functions + type.properties,
				Scopes.scopeFor(inheritedMethods + inheritedFields)
			)
		} else {
			return Scopes.scopeFor(
				type.properties + type.functions,
				Scopes.scopeFor(inheritedFields + inheritedMethods)
			)
		}
	}

}
