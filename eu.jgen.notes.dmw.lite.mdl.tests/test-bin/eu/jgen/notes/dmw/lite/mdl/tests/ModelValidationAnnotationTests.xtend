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
package eu.jgen.notes.dmw.lite.mdl.tests

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
import eu.jgen.notes.dmw.lite.mdl.model.YModel
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import eu.jgen.notes.dmw.lite.mdl.validation.ModelValidator
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship

import static org.junit.jupiter.api.Assertions.*;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil

@RunWith(XtextRunner)
@InjectWith(ModelInjectorProvider)
class ModelValidationAnnotationTests {

    @Inject extension ModelUtil
	@Inject extension ParseHelper<YModel>
	@Inject extension ValidationTestHelper
	@Inject Provider<ResourceSet> resourceSetProvider;

@Test def void testAnnotForeignKey() {
		val model = '''
			@entity C {
				@attribute f : (type=String);
				@relationship @parent isFor -> D * (foreignkey=true) <- D.has;
				@identifier i (f);
			}
			
			@entity D {
				@attribute f :  (type=String,length = 30);
				@relationship has -> C  <- C.isFor;
				@identifier i (f);
			}
			
			@entity E {
				@attribute name : Date ?;
			}
				 
		'''.parse 
		
		val relationship = model.eAllContents.findFirst[it instanceof YAnnotRelationship] as YAnnotRelationship
		assertTrue(relationship.isForeignKeyDesignated)

		
	}
	
	/*
	 *  Testing annotations for different types
	 */
	
	
	// Type=Int
	@Test def void testAnnotLengthForInt() {
		val model = '''
			@entity C {
				@attribute f (type=Int,length=9);				
			}
		'''.parse 		
		 model.assertNoErrors		
	}
	
		
	@Test def void testAnnotLengthForInt2() {
		val model = '''
			@entity C {
				@attribute f (type=Int,length=1);				
			}
		'''.parse 		
		 model.assertNoErrors		
	}
	
			
	@Test def void testAnnotLengthForInt3() {
		val model = '''
			@entity C {
				@attribute f (type=Int,length=0);				
			}
		'''.parse 		
		model.assertError(ModelPackage.eINSTANCE.YAnnotationElementValuePair, ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE,
			"Value of Int should in the range of 1 and 9.")		
	}
	
				
	@Test def void testAnnotLengthForInt4() {
		val model = '''
			@entity C {
				@attribute f (type=Int,length=10);				
			}
		'''.parse 		
		model.assertError(ModelPackage.eINSTANCE.YAnnotationElementValuePair, ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE,
			"Value of Int should in the range of 1 and 9.")		
	}
					
	@Test def void testAnnotDefaultForInt() {
		val model = '''
			@entity C {
				@attribute f (type=Int,length=9,default=1.0);				
			}
		'''.parse 		
		model.assertError(ModelPackage.eINSTANCE.YAnnotationElementValuePair, ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE,
			"Default value format 1.0 as Int is incorrect.")		
	}

// Type =Short
	@Test def void testAnnotLengthForShort() {
		val model = '''
			@entity C {
				@attribute f (type=Short,length=4);				
			}
		'''.parse 		
		 model.assertNoErrors		
	}
	
	@Test def void testAnnotLengthForShort2() {
		val model = '''
			@entity C {
				@attribute f (type=Short,length=1);				
			}
		'''.parse 		
		 model.assertNoErrors		
	}
	
		
	@Test def void testAnnotLengthForShort3() {
		val model = '''
			@entity C {
				@attribute f (type=Short,length=0);				
			}
		'''.parse 		
				model.assertError(ModelPackage.eINSTANCE.YAnnotationElementValuePair, ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE,
	
			"Value of Short should in the range of 1 and 4.")			
	}
	@Test def void testAnnotLengthForShort4() {
		val model = '''
			@entity C {
				@attribute f (type=Short,(length=5);				
			}
		'''.parse 		
				model.assertError(ModelPackage.eINSTANCE.YAnnotationElementValuePair, ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE,
			"Value of Short should in the range of 1 and 4.")			
	}	
	
	/*
	 * 
	 */
	
	@Test def void testDateFormat() {		 
		assertNotNull("201x-11-08".isDateFormatCorrect( "dd/MM/yyyy"))
		assertNull("2018-11-08".isDateFormatCorrect( "yyyy-MM-dd"))	
	}
}
