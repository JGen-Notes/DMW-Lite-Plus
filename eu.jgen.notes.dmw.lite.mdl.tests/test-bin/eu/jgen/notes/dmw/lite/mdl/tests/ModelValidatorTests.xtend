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
 

@RunWith(XtextRunner)
@InjectWith(ModelInjectorProvider)
class ModelValidatorTests {

	@Inject extension ParseHelper<YModel>
	@Inject extension ValidationTestHelper
	@Inject Provider<ResourceSet> resourceSetProvider;
	

	@Test def void testAttributeTypesCorrect() {
		'''
			@entity E {
				@attribute a (type=String);
				@attribute b (type= Short);
				@attribute c (type= Int);
				@attribute d (type= Long);
				@attribute e (type= Double);
				@attribute f (type= Date);
				@attribute g (type= Time);
				@attribute h (type= Timestamp);
				@attribute i (type= Bool);
				@attribute j (type= Blob);
				 
			}
		'''.parse.assertNoErrors
	}

	@Test def void testEntityNameCorrect() {
		val result = '''
			@entity c {}
		'''

		result.parse.assertError(ModelPackage.eINSTANCE.YAnnotEntity,
			ModelValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL, "Entity name should start with a capital letter")
	}

	@Test def void testAttributeNameCorrect() {
		val result = '''
			@entity C {
				@attribute F (type= String);
			}
		'''

		result.parse.assertError(ModelPackage.eINSTANCE.YAnnotAttribute,
			ModelValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Attribute name should start with a lower case letter")
	}

	@Test def void testIdentifierNameCorrect() {
		val result = '''
			@entity C {
				@attribute f (type= String);
				@identifier I (f);
			}
		'''

		result.parse.assertError(ModelPackage.eINSTANCE.YAnnotIdentifier,
			ModelValidator.IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Identifier name should start with a lower case letter")
	}

	@Test def void testRelationshipNameCorrect() {
		val result = '''
			@entity C {
				@attribute f (type= String);
				@relationship Has -> C * <- D.isFor;
				@identifier i(f);
			}  
						
			@entity D {
				@attribute f (type= String);
				@relationship isFor -> C <- C.Has;
				@identifier i(f);
			} 
		'''

		result.parse.assertError(ModelPackage.eINSTANCE.YAnnotRelationship,
			ModelValidator.RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE,
			"Relationship name should start with a lower case letter")
	}

	@Test def void testDuplicateEntities() {
		'''
			@entity C {}
			@entity C {}
		'''.toString.assertDuplicate(ModelPackage.eINSTANCE.YAnnotEntity, "entity", "C")
	}

	@Test def void testDuplicateEntityAcrossFiles() {
		val first = '''
		package my.pack;
		
		@entity C {}'''.parse

		'''
			package my.pack;
			@entity D {}
			@entity C {}
		'''.parse(first.eResource.resourceSet).assertError(
			ModelPackage.eINSTANCE.YAnnotEntity,
			ModelValidator.DUPLICATE_ENTITY,
			"The entity my.pack.C is already defined"
		)

		first.assertError(
			ModelPackage.eINSTANCE.YAnnotEntity,
			ModelValidator.DUPLICATE_ENTITY,
			"The entity my.pack.C is already defined"
		)
	}

	@Test def void testDuplicateAttribute() {
		'''
			@entity C {
				@attribute f (type= String);
				@attribute f (type= String);
			}
		'''.toString.assertDuplicate(ModelPackage.eINSTANCE.YAnnotAttribute, "attribute", "f")
	}

	@Test def void testDuplicateIdentifier() {
		'''
			@entity C {
				@attribute f (type= String);
				@identifier myid(f);
				@identifier myid(f);
			}
		'''.toString.assertDuplicate(ModelPackage.eINSTANCE.YAnnotIdentifier, "identifier", "myid")
	}

	@Test def void testPropertyAttributeRef1() {
		'''
			@entity C {
				@attribute f (type= String);
				@relationship isFor -> D * <- D.has;
				@identifier i (f);
			}
			
			@entity D {
				@attribute f (type= String, length = 30);
				@relationship has -> C  <- C.isFor;
				@identifier i (f);
			}
			
			@entity E {
				@attribute name  ? (type= Date);
			}
				 
		'''.parse.assertNoErrors
	}

	/*
	 *  Testing relationships
	 */
	@Test
	def void testRelationshipTest1() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has? -> A*  
			}
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship, ModelValidator.MISSING_INVERSE_REALTIONSHIP,
			"Inverse relationship for this relationship not yet defined.")
	}

	@Test
	def void testRelationshipTest3() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has? -> A* <- A.has
			}
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship,
			ModelValidator.INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF,
			"Matching Inverse relationship cannot be the same relationship.")
	}

	@Test def void testRelationshipTest4() {
		'''
			@entity C {
			@attribute f  (type= String);
			@relationship isFor -> C * <- D.has;
			@identifier i(f);
			}  
			
			@entity D {
			@attribute f  (type= String);
			@relationship has -> C * <- C.isFor;
			@relationship has -> C * <- C.isFor;
			@identifier i(f);
			} 
		'''.toString.assertDuplicate(ModelPackage.eINSTANCE.YAnnotRelationship, "relationship", "has")
	}

	@Test
	def void testRelationshipTest5() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has? -> B* <- B.isFor
			}
			
			
			@entity B {
				@attribute seqno (type= Int);
				@identifier myid(seqno);  
				@relationship isFor -> A*  <- A.has;
			}
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship, ModelValidator.MANY_TO_MANY_NOT_SUPPORTED,
			"Many-to-many relationship type not supported yet.")
	}

	@Test
	def void testRelationshipTest6() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has -> B <- B.isFor
			}
			
			
			@entity B {
				@attribute seqno (type= Int);
				@identifier myid(seqno);  
				@relationship isFor -> A  <- A.has;
			}
			
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship, ModelValidator.ONE_TO_ONE_MANDATORY_NOT_SUPPORTED,
			"A fully mandatory 1-to-1 relationship is unusual and supported.")
	}

	@Test
	def void testRelationshipTest7() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has -> B <- B.isFor
			}
			
			
			@entity B {
				@attribute seqno (type= Int);
				@identifier myid(seqno);  
				@relationship isFor? -> A (foreignkey=true) <- A.has;
			}
			
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship, ModelValidator.NO_DESGNATED_FOREIGNKEY,
			"Relation pair (has,isFor) does not have designated parent.")
	}

	@Test
	def void testRelationshipTest8() {
		val result = '''
			package log.sample.project;
			
			@entity A {
				@attribute id (type= Int);
				@identifier myid(id);
				@relationship has -> B <- B.isFor
			}
			
			
			@entity B {
				@attribute seqno (type= Int);
				@identifier myid(seqno);  
				@relationship isFor? -> A (foreignkey=true) <- A.has;
			}
			
		'''.parse

		result.assertError(ModelPackage.eINSTANCE.YAnnotRelationship, ModelValidator.WRONGLY_DESGNATED_FOREIGNKEY,
			"Relation pair (has,isFor) can have  only one designated parent.")
	}

	/*******************************************************
	 *  Validation helpers
	 *******************************************************/
	def private void assertDuplicate(String input, EClass type, String desc, String name) {
		input.parse => [
			assertError(type, ModelValidator.DUPLICATE_ELEMENT, input.lastIndexOf(name), name.length,
				"Duplicate " + desc + " '" + name + "'")
		]
	}

}
