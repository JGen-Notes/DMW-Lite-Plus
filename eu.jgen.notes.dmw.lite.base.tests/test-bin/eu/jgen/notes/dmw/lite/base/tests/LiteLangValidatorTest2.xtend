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
import eu.jgen.notes.dmw.lite.base.lang.LangPackage
import eu.jgen.notes.dmw.lite.base.validation.LangValidator
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage

@RunWith(XtextRunner)
@InjectWith(LangInjectorProvider)
class LiteLangValidatorTest2 {

	@Inject extension ParseHelper<YWidget>
	@Inject extension ValidationTestHelper
	@Inject extension LangLib
	@Inject Provider<ResourceSet> resourceSetProvider;


	@Test def void testCheckClassFirstCharacterNotCapital() {
		'''
			class c : Object {
				
			}
		'''.parse(loadLibInResourceSet).assertError(
			LangPackage.eINSTANCE.YClass,
			LangValidator.CLASS_NAME_FIRST_CHARACTER_NOT_CAPITAL,
			"Class name should start with a capital letter"
		)
	}

	@Test def void testCheckEntityFirstCharacterNotCapital() {
		'''
			@entity person {
				
			}
		'''.parse(loadLibInResourceSet).assertError(
			ModelPackage.eINSTANCE.YAnnotEntity,
			LangValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL,
			"Entity name should start with a capital letter"
		)
	}
	
	@Test def void testCheckAttributeFirstCharacterNotLowercase() {
		'''
			@entity person {
				@attr Number : Int;
			}
		'''.parse(loadLibInResourceSet).assertError(
			ModelPackage.eINSTANCE.YAnnotAttribute,
			LangValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Attribute name should start with a lower case letter"
		)
	}
	
	@Test def void testCheckPropertyFirstCharacterNotLowercase() {
		'''
			class C : Object {
				var D : Int;			
			}
		'''.parse(loadLibInResourceSet).assertError(
			LangPackage.eINSTANCE.YProperty,
			LangValidator.PROPERTY_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Property name should start with a lower case letter"
		)
	}
	
	@Test def void testCheckFunctionFirstCharacterNotLowercase() {
		'''
			class C : Object {
				var d : Int;
				
				func Start() {
					}			
			}
		'''.parse(loadLibInResourceSet).assertError(
			LangPackage.eINSTANCE.YFunction,
			LangValidator.FUNCTION_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Function name should start with a lower case letter"
		)
	}

	@Test def void testCheckVariableFirstCharacterNotLowercase() {
		'''
			class C : Object {
				var d : Int;
				
				func start() {
					I : Int = 0;
					}			
			}
		'''.parse(loadLibInResourceSet).assertError(
			LangPackage.eINSTANCE.YVariableDeclaration,
			LangValidator.VARIABLE_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Variable name should start with a lower case letter"
		)
	}

	def private loadLibInResourceSet() {
		resourceSetProvider.get => [loadLib]
	}
}
