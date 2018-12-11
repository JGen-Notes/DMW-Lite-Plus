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
package eu.jgen.notes.dmw.lite.utility

import com.google.inject.Inject

import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.EcoreUtil2
import org.eclipse.xtext.resource.IContainer
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import eu.jgen.notes.dmw.lite.base.lang.YClass
import eu.jgen.notes.dmw.lite.base.lang.YProperty
import eu.jgen.notes.dmw.lite.base.lang.YFunction
import eu.jgen.notes.dmw.lite.base.lang.YReturn
import eu.jgen.notes.dmw.lite.base.lang.YBlock
import eu.jgen.notes.dmw.lite.base.lang.YMember
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.base.lang.LangFactory
import eu.jgen.notes.dmw.lite.base.lang.YAccessLevel
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex
import eu.jgen.notes.dmw.lite.base.lang.LangPackage

class LangUtil {

	@Inject extension LangIndex

	@Inject extension LangLib
	@Inject extension ModelUtil
	@Inject ResourceDescriptionsProvider resourceDescriptionsProvider;
	@Inject IContainer.Manager containerManager;

	def properties(YClass c) {
		c.members.filter(YProperty)
	}

	def functions(YClass c) {
		c.members.filter(YFunction)
	}

	def returnStatement(YFunction m) {
		m.body.returnStatement
	}

	def returnStatement(YBlock block) {
		block.statements.filter(YReturn).head
	}

	def classHierarchy(YClass c) {
		val visited = newLinkedHashSet()

		var current = c.superclass
		while (current !== null && !visited.contains(current)) {
			visited.add(current)
			current = current.superclass
		}

		val object = c.getLangObjectClass
		if (object !== null)
			visited.add(object)

		visited
	}

	def classHierarchyMethods(YClass c) {
		// reverse the list so that methods in subclasses
		// will be added later to the map, thus overriding
		// the one already present in the superclasses
		// if the methods have the same name
		// do something
		c.classHierarchy.toList.reverseView.map[functions].flatten.toMap[name]
	}

	def classHierarchyMembers(YClass c) {
		c.classHierarchy.map[members].flatten
	}

	def memberAsString(YMember m) {
		val a = m.eContainer as YClass
		a.name + if (m instanceof YFunction)
			"(" + m.params.map[type.name].join(", ") + ")"
		else
			""
	}

	def memberAsStringWithType(YMember m) {

		// println(m)
		m.memberAsString + " : " // + m.type.name
	}

	def getMemberName(YMember member) {
		member
	}

	def YProperty converAttributeIntoPropertyPublic(YAnnotAttribute annotAttribute) {
		val property = LangFactory.eINSTANCE.createYProperty => [
			attrRef = annotAttribute
			name = annotAttribute.name
			access = YAccessLevel.PUBLIC
			type = getLangObjectClass(annotAttribute, "eu.jgen.notes.lib.dmw." + annotAttribute.extractAttributeType)
		]
		return property
	}

	def getLangObjectClass(EObject context, String className) {
		val desc = context.getVisibleClassesDescriptions.findFirst[qualifiedName.toString == className]
		if (desc === null)
			return null
		var o = desc.getEObjectOrProxy
		if (o.eIsProxy)
			o = context.eResource.resourceSet.getEObject(desc.getEObjectURI, true)
		o as YClass
	}

	def YProperty converAttributeIntoPropertyPrivate(YAnnotAttribute annotAttr) {
		val property = LangFactory.eINSTANCE.createYProperty => [
			attrRef = annotAttr
			type = LangFactory.eINSTANCE.createYClass => [name = annotAttr.extractAttributeType]
			name = annotAttr.name
			access = YAccessLevel.PRIVATE
		]
		return property
	}

}
