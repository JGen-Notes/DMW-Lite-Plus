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
package eu.jgen.notes.dmw.lite.base.tests;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.YWidget;
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex;
import eu.jgen.notes.dmw.lite.base.tests.LangInjectorProvider;
import java.util.Map;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(XtextRunner.class)
@InjectWith(LangInjectorProvider.class)
@SuppressWarnings("all")
public class Index {
  @Inject
  @Extension
  private ParseHelper<YWidget> _parseHelper;
  
  @Inject
  @Extension
  private LangIndex _langIndex;
  
  @Test
  public void testExportedEObjectDescriptions() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package eu.jgen.bee.misc;");
      _builder.newLine();
      _builder.append("import eu.jgen.notes.lib.dmw.*;  ");
      _builder.newLine();
      _builder.newLine();
      _builder.newLine();
      _builder.append("enum Db : XError {  \t");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t ");
      _builder.append("case Duplicate(msg : String) ");
      _builder.newLine();
      _builder.append("   ");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("class CreateProduct : XWidget {           \t\t\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("func start() throws {");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("do {");
      _builder.newLine();
      _builder.append("\t      ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("} catch Db.Duplicate  { ");
      _builder.newLine();
      _builder.append("\t\t\t ");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t ");
      _builder.newLine();
      _builder.append("\t");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}\t\t\t\t\t");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      this.assertExportedEObjectDescriptions(this._parseHelper.parse(_builder), "eu.jgen.bee.misc, eu.jgen.bee.misc.Db, eu.jgen.bee.misc.Db.Duplicate, eu.jgen.bee.misc.Db.Duplicate.msg, eu.jgen.bee.misc.CreateProduct, eu.jgen.bee.misc.CreateProduct.start");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  private void assertExportedEObjectDescriptions(final EObject o, final CharSequence expected) {
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    Assert.assertEquals(expected.toString(), 
      IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(this._langIndex.getExportedEObjectDescriptions(o), _function), ", "));
  }
  
  private void assertClassesInIndex(final EObject o, final String expected) {
    final Iterable<IEObjectDescription> visibleClassesDescriptions = this._langIndex.getVisibleClassesDescriptions(o);
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    Assert.assertEquals(expected, 
      IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(visibleClassesDescriptions, _function), ", "));
  }
  
  private void assertExternalClassesInIndex(final EObject o, final String expected) {
    final Map<QualifiedName, IEObjectDescription> visibleExternalClassesDescriptions = this._langIndex.getVisibleExternalClassesDescriptions(o);
    final Function1<IEObjectDescription, QualifiedName> _function = (IEObjectDescription it) -> {
      return it.getQualifiedName();
    };
    Assert.assertEquals(expected, 
      IterableExtensions.join(IterableExtensions.<IEObjectDescription, QualifiedName>map(visibleExternalClassesDescriptions.values(), _function), ", "));
  }
}
