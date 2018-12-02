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
package eu.jgen.notes.dmw.lite.tests.generators;

import com.google.inject.Inject;
import com.google.inject.Provider;
import eu.jgen.notes.dmw.lite.base.lang.YWidget;
import eu.jgen.notes.dmw.lite.base.tests.LangInjectorProvider;
import eu.jgen.notes.dmw.lite.utility.LangLib;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.util.IAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.testing.CompilationTestHelper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(LangInjectorProvider.class)
@SuppressWarnings("all")
public class TestLiteLangGeneratorExpressions {
  @Inject
  @Extension
  private ParseHelper<YWidget> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  @Extension
  private CompilationTestHelper _compilationTestHelper;
  
  @Inject
  @Extension
  private LangLib _langLib;
  
  @Inject
  private Provider<ResourceSet> resourceSetProvider;
  
  @Test
  public void testGenerateExpressionPlus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 3;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = a + b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}\t\t\t");
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionMinus() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 3;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = b - a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionMultiply() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 3;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = b * a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionDivide() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = b / a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionBrackets() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = ((b - a) * 1) / a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionEqual() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a == b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionNotEqual() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a != b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionLess() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a < b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionGreater() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a > b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionLessEqual() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a <= b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionGreaterEqual() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = a >= b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionOr() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = (a >= b) || (a == b);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionAnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = (a >= b) && (a == 2);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionTrue() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionFalse() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("var x : Int;\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("a : Int = 2;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("b : Int = 4;");
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Boolean = true;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionAllLiterals() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t   ");
      _builder.append("c : Int = (2 + 4) / (4 * 2);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testGenerateExpressionNot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package sample.project;\t\t\t\t\t\t");
      _builder.newLine();
      _builder.append("@java ");
      _builder.newLine();
      _builder.append("class A : Widget {\t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("public func start() {");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t    ");
      _builder.append("c : Boolean = !(1 < 3);");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      final String body = _builder.toString();
      final IAcceptor<CompilationTestHelper.Result> _function = (CompilationTestHelper.Result it) -> {
        Assert.assertFalse(this.checkIfIssues(it));
        InputOutput.<String>println(it.getGeneratedCode("sample.project.A"));
      };
      this._compilationTestHelper.compile(CollectionLiterals.<String>newArrayList(this._langLib.loadLibSource(), body), _function);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public boolean checkIfIssues(final CompilationTestHelper.Result result) {
    int _size = result.getErrorsAndWarnings().size();
    boolean _greaterThan = (_size > 0);
    if (_greaterThan) {
      final Consumer<Issue> _function = (Issue it) -> {
        InputOutput.<Issue>println(it);
      };
      result.getErrorsAndWarnings().forEach(_function);
      return true;
    }
    result.getCompiledClass();
    return false;
  }
}
