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
package eu.jgen.notes.dmw.lite.base.tests

import com.google.inject.Inject
import com.google.inject.Provider
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.XtextRunner
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.Test
import org.junit.runner.RunWith

import static extension org.junit.Assert.*
import eu.jgen.notes.dmw.lite.base.lang.YWidget
import eu.jgen.notes.dmw.lite.utility.LangLib
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import eu.jgen.notes.dmw.lite.base.validation.LangValidator

@RunWith(XtextRunner)
@InjectWith(LangInjectorProvider)
class LiteLangValidatorTest3 {

	@Inject extension ParseHelper<YWidget>
	@Inject extension ValidationTestHelper
	@Inject extension LangLib
	@Inject Provider<ResourceSet> resourceSetProvider;


	@Test def void testCheckShortCompatibleWithDefaultValue() {
		'''
			package log.sample.project;
			@java
			@entity A {
				@attr number : Short @length (2) @default("z");   
			
			}   
		'''.parse(loadLibInResourceSet).assertError(
			ModelPackage.eINSTANCE.YAnnotAttribute,
			LangValidator.ATTRIBUTE_TYPE_NOT_COMP_WITH_DEFAULT,
			"Attribute type not compatible with default value"
		)
	}

	@Test def void testCheckStringCompatibleWithDefaultValue() {
		'''
			package log.sample.project;
			@java
			@entity A {
				@attr text : String @length (20) @default(5);   
			
			}   
		'''.parse(loadLibInResourceSet).assertError(
			ModelPackage.eINSTANCE.YAnnotAttribute,
			LangValidator.ATTRIBUTE_TYPE_NOT_COMP_WITH_DEFAULT,
			"Attribute type not compatible with default value"
		)
	}
	def private loadLibInResourceSet() {
		resourceSetProvider.get => [loadLib]
	}
}
