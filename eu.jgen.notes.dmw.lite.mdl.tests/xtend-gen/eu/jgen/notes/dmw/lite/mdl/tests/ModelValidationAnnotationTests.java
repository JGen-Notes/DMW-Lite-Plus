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
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.tests.ModelInjectorProvider;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.mdl.validation.ModelValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(ModelInjectorProvider.class)
@SuppressWarnings("all")
public class ModelValidationAnnotationTests {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  @Extension
  private ParseHelper<YModel> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testAnnotForeignKey() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f : (type=String);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@relationship @parent isFor -> D * (foreignkey=true) <- D.has;");
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
      _builder.append("@attribute f :  (type=String,length = 30);");
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
      _builder.append("@attribute name : Date ?;");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t ");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      final Function1<EObject, Boolean> _function = (EObject it) -> {
        return Boolean.valueOf((it instanceof YAnnotRelationship));
      };
      EObject _findFirst = IteratorExtensions.<EObject>findFirst(model.eAllContents(), _function);
      final YAnnotRelationship relationship = ((YAnnotRelationship) _findFirst);
      Assertions.assertTrue(this._modelUtil.isForeignKeyDesignated(relationship));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  /**
   * Testing annotations for different types
   */
  @Test
  public void testAnnotLengthForInt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Int,length=9);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForInt2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Int,length=1);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForInt3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Int,length=0);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ModelPackage.eINSTANCE.getYAnnotationElementValuePair(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE, 
        "Value of Int should in the range of 1 and 9.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForInt4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Int,length=10);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ModelPackage.eINSTANCE.getYAnnotationElementValuePair(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE, 
        "Value of Int should in the range of 1 and 9.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotDefaultForInt() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Int,length=9,default=1.0);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ModelPackage.eINSTANCE.getYAnnotationElementValuePair(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE, 
        "Default value format 1.0 as Int is incorrect.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForShort() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Short,length=4);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForShort2() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Short,length=1);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertNoErrors(model);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForShort3() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Short,length=0);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ModelPackage.eINSTANCE.getYAnnotationElementValuePair(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE, 
        "Value of Short should in the range of 1 and 4.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotLengthForShort4() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("@entity C {");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("@attribute f (type=Short,(length=5);\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final YModel model = this._parseHelper.parse(_builder);
      this._validationTestHelper.assertError(model, ModelPackage.eINSTANCE.getYAnnotationElementValuePair(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE, 
        "Value of Short should in the range of 1 and 4.");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testDateFormat() {
    Assertions.assertNotNull(this._modelUtil.isDateFormatCorrect("201x-11-08", "dd/MM/yyyy"));
    Assertions.assertNull(this._modelUtil.isDateFormatCorrect("2018-11-08", "yyyy-MM-dd"));
  }
}
