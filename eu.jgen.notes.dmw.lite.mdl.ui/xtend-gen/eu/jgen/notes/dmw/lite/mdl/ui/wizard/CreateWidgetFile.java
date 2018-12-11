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
package eu.jgen.notes.dmw.lite.mdl.ui.wizard;

import com.google.common.base.Objects;
import eu.jgen.notes.dmw.lite.mdl.utility.Util;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringSelectionTemplateVariable;

@FileTemplate(label = "Create Widget File", icon = "widget.gif", description = "Create a new widget file.")
@SuppressWarnings("all")
public final class CreateWidgetFile extends AbstractFileTemplate {
  private final Util util = new Util();
  
  private final StringSelectionTemplateVariable widgetTypeSelection = this.combo("Type of widget:", new String[] { "Widget", "ExitState", "Command" }, "The type of widget");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    String _folder = this.getFolder();
    boolean _tripleNotEquals = (_folder != null);
    if (_tripleNotEquals) {
      final String packageName = this.util.guessPackageName(this.getFolder());
      if ((packageName != null)) {
        String _value = this.widgetTypeSelection.getValue();
        boolean _equals = Objects.equal(_value, "Widget");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          String _folder_1 = this.getFolder();
          _builder.append(_folder_1);
          _builder.append("/");
          String _name = this.getName();
          _builder.append(_name);
          _builder.append(".dmw");
          StringConcatenation _builder_1 = new StringConcatenation();
          _builder_1.append("package ");
          _builder_1.append(packageName);
          _builder_1.append(";");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("import ");
          _builder_1.append(packageName);
          _builder_1.append(".*;");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("/*");
          _builder_1.newLine();
          _builder_1.append("* This is ");
          String _value_1 = this.widgetTypeSelection.getValue();
          _builder_1.append(_value_1);
          _builder_1.append(" ");
          String _name_1 = this.getName();
          _builder_1.append(_name_1);
          _builder_1.append(" fragment.");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("*/");
          _builder_1.newLine();
          _builder_1.append("\t\t\t\t\t ");
          _builder_1.newLine();
          _builder_1.append("@class ");
          String _name_2 = this.getName();
          _builder_1.append(_name_2);
          _builder_1.append(" -> Widget {");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("\t\t\t\t\t\t");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          generator.generate(_builder, _builder_1);
          return;
        }
      }
    }
  }
}
