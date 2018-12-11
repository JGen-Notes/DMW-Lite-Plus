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

import com.google.common.collect.Iterables;
import java.util.Collections;
import java.util.List;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.XtextProjectHelper;
import org.eclipse.xtext.ui.util.PluginProjectFactory;
import org.eclipse.xtext.ui.wizard.template.AbstractProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.BooleanTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.GroupTemplateVariable;
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator;
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate;
import org.eclipse.xtext.ui.wizard.template.StringTemplateVariable;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@ProjectTemplate(label = "DMW Project", icon = "project_template.png", description = "<p><b>Creates DMW Project</b></p>\n<p>This project can be used to create model fragments and widgets</p>")
@SuppressWarnings("all")
public final class DMWProject extends AbstractProjectTemplate {
  private final BooleanTemplateVariable advanced = this.check("Extra contents:", true);
  
  private final GroupTemplateVariable advancedEntityGroup = this.group("Package and Entity Names");
  
  private final GroupTemplateVariable advancedTDGroup = this.group("Package name and defaults");
  
  private final StringTemplateVariable packEntity = this.text("Package Name:", "", "The package name to place the files in", this.advancedEntityGroup);
  
  private final StringTemplateVariable name = this.text("Entity Name:", "YourEntityName", "The name of first entity fragment", this.advancedEntityGroup);
  
  private final StringTemplateVariable packTD = this.text("Package Name:", "", "The package name to place the files in", this.advancedTDGroup);
  
  private final BooleanTemplateVariable td = this.check("Default Technical Design:", false, "Need generate default technical design fragment", 
    this.advancedTDGroup);
  
  @Override
  protected void updateVariables() {
    this.name.setEnabled(this.advanced.getValue());
    this.packEntity.setValue(this.getProjectInfo().getProjectName());
    this.packEntity.setEnabled(this.advanced.getValue());
    this.td.setEnabled(this.advanced.getValue());
    boolean _value = this.advanced.getValue();
    boolean _not = (!_value);
    if (_not) {
      this.name.setValue("");
      this.packEntity.setValue("");
      this.td.setValue(this.td.getValue());
    }
  }
  
  @Override
  protected IStatus validate() {
    Status _xifexpression = null;
    boolean _matches = this.packEntity.getValue().matches("[a-z][a-z0-9_]*(.[a-z][a-z0-9_]*)*");
    if (_matches) {
      Status _xifexpression_1 = null;
      boolean _matches_1 = this.packEntity.getValue().matches("[a-z][a-z0-9_]*(.[a-z][a-z0-9_]*)*");
      if (_matches_1) {
        _xifexpression_1 = null;
      } else {
        _xifexpression_1 = new Status(IStatus.ERROR, "Wizard", (("\'" + this.packEntity) + "\' is not a valid package name"));
      }
      _xifexpression = _xifexpression_1;
    } else {
      _xifexpression = new Status(IStatus.ERROR, "Wizard", (("\'" + this.packEntity) + "\' is not a valid package name"));
    }
    return _xifexpression;
  }
  
  @Override
  public void generateProjects(final IProjectGenerator generator) {
    boolean _value = this.advanced.getValue();
    if (_value) {
      PluginProjectFactory _pluginProjectFactory = new PluginProjectFactory();
      final Procedure1<PluginProjectFactory> _function = (PluginProjectFactory it) -> {
        it.setProjectName(this.getProjectInfo().getProjectName());
        it.setLocation(this.getProjectInfo().getLocationPath());
        List<String> _projectNatures = it.getProjectNatures();
        Iterables.<String>addAll(_projectNatures, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID)));
        List<String> _builderIds = it.getBuilderIds();
        Iterables.<String>addAll(_builderIds, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID)));
        List<String> _folders = it.getFolders();
        _folders.add("src");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("src/");
        String _replace = this.packEntity.getValue().replace(".", "/");
        _builder.append(_replace);
        _builder.append("/");
        String _value_1 = this.name.getValue();
        _builder.append(_value_1);
        _builder.append(".mdl");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package ");
        String _value_2 = this.packEntity.getValue();
        _builder_1.append(_value_2);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import ");
        String _value_3 = this.packEntity.getValue();
        _builder_1.append(_value_3);
        _builder_1.append(".*;");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        _builder_1.append("@database Derby;\t");
        _builder_1.newLine();
        _builder_1.append("@java;\t\t\t\t ");
        _builder_1.newLine();
        _builder_1.newLine();
        _builder_1.append("/*");
        _builder_1.newLine();
        _builder_1.append("* This is entity ");
        String _value_4 = this.name.getValue();
        _builder_1.append(_value_4);
        _builder_1.append(" fragment.");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("*/");
        _builder_1.newLine();
        _builder_1.append("\t\t\t\t\t\t\t\t\t\t\t ");
        _builder_1.newLine();
        _builder_1.append("@entity ");
        String _value_5 = this.name.getValue();
        _builder_1.append(_value_5);
        _builder_1.append(" {");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("\t");
        _builder_1.append("@attribute\tid (length=9);\t\t\t\t\t\t\t\t\t\t");
        _builder_1.newLine();
        _builder_1.append("}");
        _builder_1.newLine();
        this.addFile(it, _builder, _builder_1);
        boolean _value_6 = this.td.getValue();
        if (_value_6) {
          StringConcatenation _builder_2 = new StringConcatenation();
          _builder_2.append("src/");
          String _replace_1 = this.packTD.getValue().replace(".", "/");
          _builder_2.append(_replace_1);
          _builder_2.append("/td.mdl");
          StringConcatenation _builder_3 = new StringConcatenation();
          _builder_3.append("package ");
          String _value_7 = this.packEntity.getValue();
          _builder_3.append(_value_7);
          _builder_3.append(";");
          _builder_3.newLineIfNotEmpty();
          _builder_3.append("import ");
          String _value_8 = this.packEntity.getValue();
          _builder_3.append(_value_8);
          _builder_3.append(".*;");
          _builder_3.newLineIfNotEmpty();
          _builder_3.newLine();
          _builder_3.append("@database Derby;\t");
          _builder_3.newLine();
          _builder_3.append("@java;\t");
          _builder_3.newLine();
          _builder_3.newLine();
          _builder_3.append("@td database Derby {");
          _builder_3.newLine();
          _builder_3.append("\t");
          _builder_3.newLine();
          _builder_3.append("}");
          _builder_3.newLine();
          _builder_3.newLine();
          this.addFile(it, _builder_2, _builder_3);
        } else {
          StringConcatenation _builder_4 = new StringConcatenation();
          _builder_4.append("src/");
          String _replace_2 = this.packTD.getValue().replace(".", "/");
          _builder_4.append(_replace_2);
          _builder_4.append("/td.mdl");
          StringConcatenation _builder_5 = new StringConcatenation();
          _builder_5.append("package ");
          String _value_9 = this.packEntity.getValue();
          _builder_5.append(_value_9);
          _builder_5.append(";");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("import ");
          String _value_10 = this.packEntity.getValue();
          _builder_5.append(_value_10);
          _builder_5.append(".*;");
          _builder_5.newLineIfNotEmpty();
          _builder_5.append("\t\t\t\t\t");
          _builder_5.newLine();
          this.addFile(it, _builder_4, _builder_5);
        }
      };
      PluginProjectFactory _doubleArrow = ObjectExtensions.<PluginProjectFactory>operator_doubleArrow(_pluginProjectFactory, _function);
      generator.generate(_doubleArrow);
    } else {
      PluginProjectFactory _pluginProjectFactory_1 = new PluginProjectFactory();
      final Procedure1<PluginProjectFactory> _function_1 = (PluginProjectFactory it) -> {
        it.setProjectName(this.getProjectInfo().getProjectName());
        it.setLocation(this.getProjectInfo().getLocationPath());
        List<String> _projectNatures = it.getProjectNatures();
        Iterables.<String>addAll(_projectNatures, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID)));
        List<String> _builderIds = it.getBuilderIds();
        Iterables.<String>addAll(_builderIds, Collections.<String>unmodifiableList(CollectionLiterals.<String>newArrayList(JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID)));
        List<String> _folders = it.getFolders();
        _folders.add("src");
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("src/");
        String _replace = this.packEntity.getValue().replace(".", "/");
        _builder.append(_replace);
        _builder.append("/");
        String _value_1 = this.name.getValue();
        _builder.append(_value_1);
        _builder.append(".mdl");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package ");
        String _value_2 = this.packEntity.getValue();
        _builder_1.append(_value_2);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.append("import ");
        String _value_3 = this.packEntity.getValue();
        _builder_1.append(_value_3);
        _builder_1.append(".*;");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        this.addFile(it, _builder, _builder_1);
      };
      PluginProjectFactory _doubleArrow_1 = ObjectExtensions.<PluginProjectFactory>operator_doubleArrow(_pluginProjectFactory_1, _function_1);
      generator.generate(_doubleArrow_1);
    }
  }
}
