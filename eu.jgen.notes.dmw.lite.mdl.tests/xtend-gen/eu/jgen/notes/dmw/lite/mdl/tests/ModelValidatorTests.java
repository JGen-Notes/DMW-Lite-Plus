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
 */
package eu.jgen.notes.dmw.lite.mdl.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.tests.ModelInjectorProvider;
import eu.jgen.notes.dmw.lite.mdl.validation.ModelValidator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ModelInjectorProvider.class)
@SuppressWarnings("all")
public class ModelValidatorTests {
  @Inject
  @Extension
  private ParseHelper<YModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testAttributeTypesCorrect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity E {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute a (type=String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute b (type= Short);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute c (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute d (type= Long);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute e (type= Double);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= Date);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute g (type= Time);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute h (type= Timestamp);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute i (type= Bool);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute j (type= Blob);");
      _builder.newLine();
      _builder.append("\t ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEntityNameCorrect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity c {}");
      _builder.newLine();
      final String result = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(result), ModelPackage.eINSTANCE.getYAnnotEntity(), 
        ModelValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL, "Entity name should start with a capital letter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAttributeNameCorrect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute F (type= String);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String result = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(result), ModelPackage.eINSTANCE.getYAnnotAttribute(), 
        ModelValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE, 
        "Attribute name should start with a lower case letter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testIdentifierNameCorrect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier I (f);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final String result = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(result), ModelPackage.eINSTANCE.getYAnnotIdentifier(), 
        ModelValidator.IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE, 
        "Identifier name should start with a lower case letter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipNameCorrect() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship Has -> C * <- D.isFor;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier i(f);");
      _builder.newLine();
      _builder.append("}  ");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.newLine();
      _builder.append("@entity D {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor -> C <- C.Has;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier i(f);");
      _builder.newLine();
      _builder.append("} ");
      _builder.newLine();
      final String result = _builder.toString();
      this._validationTestHelper.assertError(this._parseHelper.parse(result), ModelPackage.eINSTANCE.getYAnnotRelationship(), 
        ModelValidator.RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE, 
        "Relationship name should start with a lower case letter");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateEntities() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@entity C {}");
    _builder.newLine();
    _builder.append("@entity C {}");
    _builder.newLine();
    this.assertDuplicate(_builder.toString(), ModelPackage.eINSTANCE.getYAnnotEntity(), "entity", "C");
  }
  
  @Test
  public void testDuplicateEntityAcrossFiles() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package my.pack;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity C {}");
      final YModel first = this._parseHelper.parse(_builder);
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("package my.pack;");
      _builder_1.newLine();
      _builder_1.append("@entity D {}");
      _builder_1.newLine();
      _builder_1.append("@entity C {}");
      _builder_1.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder_1, first.eResource().getResourceSet()), 
        ModelPackage.eINSTANCE.getYAnnotEntity(), 
        ModelValidator.DUPLICATE_ENTITY, 
        "The entity my.pack.C is already defined");
      this._validationTestHelper.assertError(first, 
        ModelPackage.eINSTANCE.getYAnnotEntity(), 
        ModelValidator.DUPLICATE_ENTITY, 
        "The entity my.pack.C is already defined");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDuplicateAttribute() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@entity C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@attribute f (type= String);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@attribute f (type= String);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicate(_builder.toString(), ModelPackage.eINSTANCE.getYAnnotAttribute(), "attribute", "f");
  }
  
  @Test
  public void testDuplicateIdentifier() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@entity C {");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@attribute f (type= String);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@identifier myid(f);");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("@identifier myid(f);");
    _builder.newLine();
    _builder.append("}");
    _builder.newLine();
    this.assertDuplicate(_builder.toString(), ModelPackage.eINSTANCE.getYAnnotIdentifier(), "identifier", "myid");
  }
  
  @Test
  public void testPropertyAttributeRef1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor -> D * <- D.has;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier i (f);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity D {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type= String, length = 30);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has -> C  <- C.isFor;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier i (f);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity E {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute name  ? (type= Date);");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.newLine();
      this._validationTestHelper.assertNoErrors(this._parseHelper.parse(_builder));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Testing relationships
   */
  @Test
  public void testRelationshipTest1() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has? -> A*  ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), ModelValidator.MISSING_INVERSE_REALTIONSHIP, 
        "Inverse relationship for this relationship not yet defined.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipTest3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has? -> A* <- A.has");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), 
        ModelValidator.INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF, 
        "Matching Inverse relationship cannot be the same relationship.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipTest4() {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("@entity C {");
    _builder.newLine();
    _builder.append("@attribute f  (type= String);");
    _builder.newLine();
    _builder.append("@relationship isFor -> C * <- D.has;");
    _builder.newLine();
    _builder.append("@identifier i(f);");
    _builder.newLine();
    _builder.append("}  ");
    _builder.newLine();
    _builder.newLine();
    _builder.append("@entity D {");
    _builder.newLine();
    _builder.append("@attribute f  (type= String);");
    _builder.newLine();
    _builder.append("@relationship has -> C * <- C.isFor;");
    _builder.newLine();
    _builder.append("@relationship has -> C * <- C.isFor;");
    _builder.newLine();
    _builder.append("@identifier i(f);");
    _builder.newLine();
    _builder.append("} ");
    _builder.newLine();
    this.assertDuplicate(_builder.toString(), ModelPackage.eINSTANCE.getYAnnotRelationship(), "relationship", "has");
  }
  
  @Test
  public void testRelationshipTest5() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has? -> B* <- B.isFor");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute seqno (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(seqno);  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor -> A*  <- A.has;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), ModelValidator.MANY_TO_MANY_NOT_SUPPORTED, 
        "Many-to-many relationship type not supported yet.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipTest6() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has -> B <- B.isFor");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute seqno (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(seqno);  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor -> A  <- A.has;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), ModelValidator.ONE_TO_ONE_MANDATORY_NOT_SUPPORTED, 
        "A fully mandatory 1-to-1 relationship is unusual and supported.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipTest7() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has -> B <- B.isFor");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute seqno (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(seqno);  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor? -> A (foreignkey=true) <- A.has;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), ModelValidator.NO_DESGNATED_FOREIGNKEY, 
        "Relation pair (has,isFor) does not have designated parent.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testRelationshipTest8() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package log.sample.project;");
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity A {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute id (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(id);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship has -> B <- B.isFor");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("@entity B {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute seqno (type= Int);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@identifier myid(seqno);  ");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship isFor? -> A (foreignkey=true) <- A.has;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final YModel result = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(result, ModelPackage.eINSTANCE.getYAnnotRelationship(), ModelValidator.WRONGLY_DESGNATED_FOREIGNKEY, 
        "Relation pair (has,isFor) can have  only one designated parent.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Validation helpers
   */
  private void assertDuplicate(final String input, final EClass type, final String desc, final String name) {
    try {
      YModel _parse = this._parseHelper.parse(input);
      final Procedure1<YModel> _function = (YModel it) -> {
        this._validationTestHelper.assertError(it, type, ModelValidator.DUPLICATE_ELEMENT, input.lastIndexOf(name), name.length(), 
          (((("Duplicate " + desc) + " \'") + name) + "\'"));
      };
      ObjectExtensions.<YModel>operator_doubleArrow(_parse, _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
