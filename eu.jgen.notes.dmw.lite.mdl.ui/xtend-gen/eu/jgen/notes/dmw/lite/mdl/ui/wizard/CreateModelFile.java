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

@FileTemplate(label = "Create Model Fragment", icon = "model_file.gif", description = "Remember to select package in the source folder first. A new model file has to be created in the package.")
@SuppressWarnings("all")
public final class CreateModelFile extends AbstractFileTemplate {
  private final Util util = new Util();
  
  private final StringSelectionTemplateVariable type = this.combo("Type of model element:", new String[] { "Entity", "Technical Design", "Database", "Java", "Swift" }, 
    "The type of model fragment");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    String _folder = this.getFolder();
    boolean _tripleNotEquals = (_folder != null);
    if (_tripleNotEquals) {
      final String packageName = this.util.guessPackageName(this.getFolder());
      if ((packageName != null)) {
        String _value = this.type.getValue();
        boolean _equals = Objects.equal(_value, "Entity");
        if (_equals) {
          StringConcatenation _builder = new StringConcatenation();
          String _folder_1 = this.getFolder();
          _builder.append(_folder_1);
          _builder.append("/");
          String _name = this.getName();
          _builder.append(_name);
          _builder.append(".mdl");
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
          _builder_1.append(this.type);
          _builder_1.append(" ");
          String _name_1 = this.getName();
          _builder_1.append(_name_1);
          _builder_1.append(" fragment.");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("*/");
          _builder_1.newLine();
          _builder_1.append("\t\t\t\t\t ");
          _builder_1.newLine();
          _builder_1.append("@entity ");
          String _name_2 = this.getName();
          _builder_1.append(_name_2);
          _builder_1.append(" {");
          _builder_1.newLineIfNotEmpty();
          _builder_1.append("   ");
          _builder_1.append("@attribute id (length=9);\t\t\t\t\t\t");
          _builder_1.newLine();
          _builder_1.append("}");
          _builder_1.newLine();
          generator.generate(_builder, _builder_1);
          return;
        } else {
          String _value_1 = this.type.getValue();
          boolean _equals_1 = Objects.equal(_value_1, "Technical Design");
          if (_equals_1) {
            StringConcatenation _builder_2 = new StringConcatenation();
            String _folder_2 = this.getFolder();
            _builder_2.append(_folder_2);
            _builder_2.append("/");
            String _name_3 = this.getName();
            _builder_2.append(_name_3);
            _builder_2.append(".mdl");
            StringConcatenation _builder_3 = new StringConcatenation();
            _builder_3.append("package ");
            _builder_3.append(packageName);
            _builder_3.append(";");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("import ");
            _builder_3.append(packageName);
            _builder_3.append(".*;");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("/*");
            _builder_3.newLine();
            _builder_3.append("* This is ");
            _builder_3.append(this.type);
            _builder_3.append(" fragment.");
            _builder_3.newLineIfNotEmpty();
            _builder_3.append("*/");
            _builder_3.newLine();
            _builder_3.append("\t\t\t\t\t ");
            _builder_3.newLine();
            _builder_3.append("@database Derby;\t");
            _builder_3.newLine();
            _builder_3.append("@java;\t\t\t\t ");
            _builder_3.newLine();
            _builder_3.append("@td database Derby {");
            _builder_3.newLine();
            _builder_3.append("\t");
            _builder_3.newLine();
            _builder_3.append("}");
            _builder_3.newLine();
            generator.generate(_builder_2, _builder_3);
            return;
          } else {
            String _value_2 = this.type.getValue();
            boolean _equals_2 = Objects.equal(_value_2, "Database");
            if (_equals_2) {
              StringConcatenation _builder_4 = new StringConcatenation();
              String _folder_3 = this.getFolder();
              _builder_4.append(_folder_3);
              _builder_4.append("/");
              String _name_4 = this.getName();
              _builder_4.append(_name_4);
              _builder_4.append(".mdl");
              StringConcatenation _builder_5 = new StringConcatenation();
              _builder_5.append("package ");
              _builder_5.append(packageName);
              _builder_5.append(";");
              _builder_5.newLineIfNotEmpty();
              _builder_5.append("import ");
              _builder_5.append(packageName);
              _builder_5.append(".*;");
              _builder_5.newLineIfNotEmpty();
              _builder_5.append("/*");
              _builder_5.newLine();
              _builder_5.append("* This is ");
              _builder_5.append(this.type);
              _builder_5.append(" fragment.");
              _builder_5.newLineIfNotEmpty();
              _builder_5.append("*/");
              _builder_5.newLine();
              _builder_5.append("\t\t\t\t\t ");
              _builder_5.newLine();
              _builder_5.append("@database Derby;\t");
              _builder_5.newLine();
              _builder_5.newLine();
              generator.generate(_builder_4, _builder_5);
              return;
            } else {
              String _value_3 = this.type.getValue();
              boolean _equals_3 = Objects.equal(_value_3, "Java");
              if (_equals_3) {
                StringConcatenation _builder_6 = new StringConcatenation();
                String _folder_4 = this.getFolder();
                _builder_6.append(_folder_4);
                _builder_6.append("/");
                String _name_5 = this.getName();
                _builder_6.append(_name_5);
                _builder_6.append(".mdl");
                StringConcatenation _builder_7 = new StringConcatenation();
                _builder_7.append("package ");
                _builder_7.append(packageName);
                _builder_7.append(";");
                _builder_7.newLineIfNotEmpty();
                _builder_7.append("import ");
                _builder_7.append(packageName);
                _builder_7.append(".*;");
                _builder_7.newLineIfNotEmpty();
                _builder_7.append("/*");
                _builder_7.newLine();
                _builder_7.append("* This is ");
                _builder_7.append(this.type);
                _builder_7.append(" fragment.");
                _builder_7.newLineIfNotEmpty();
                _builder_7.append("*/");
                _builder_7.newLine();
                _builder_7.append("\t\t\t\t\t ");
                _builder_7.newLine();
                _builder_7.append("@java;\t");
                _builder_7.newLine();
                _builder_7.newLine();
                generator.generate(_builder_6, _builder_7);
                return;
              } else {
                String _value_4 = this.type.getValue();
                boolean _equals_4 = Objects.equal(_value_4, "Swift");
                if (_equals_4) {
                  StringConcatenation _builder_8 = new StringConcatenation();
                  String _folder_5 = this.getFolder();
                  _builder_8.append(_folder_5);
                  _builder_8.append("/");
                  String _name_6 = this.getName();
                  _builder_8.append(_name_6);
                  _builder_8.append(".mdl");
                  StringConcatenation _builder_9 = new StringConcatenation();
                  _builder_9.append("package ");
                  _builder_9.append(packageName);
                  _builder_9.append(";");
                  _builder_9.newLineIfNotEmpty();
                  _builder_9.append("import ");
                  _builder_9.append(packageName);
                  _builder_9.append(".*;");
                  _builder_9.newLineIfNotEmpty();
                  _builder_9.append("/*");
                  _builder_9.newLine();
                  _builder_9.append("* This is ");
                  _builder_9.append(this.type);
                  _builder_9.append(" fragment.");
                  _builder_9.newLineIfNotEmpty();
                  _builder_9.append("*/");
                  _builder_9.newLine();
                  _builder_9.append("\t\t\t\t\t ");
                  _builder_9.newLine();
                  _builder_9.append("@swift module ");
                  String _name_7 = this.getName();
                  _builder_9.append(_name_7);
                  _builder_9.append(" ;\t\t");
                  _builder_9.newLineIfNotEmpty();
                  _builder_9.newLine();
                  generator.generate(_builder_8, _builder_9);
                  return;
                }
              }
            }
          }
        }
      }
    }
  }
}
