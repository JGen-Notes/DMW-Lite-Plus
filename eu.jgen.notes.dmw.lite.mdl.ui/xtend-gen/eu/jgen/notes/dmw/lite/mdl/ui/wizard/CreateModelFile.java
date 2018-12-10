/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.ui.wizard;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.ui.wizard.template.AbstractFileTemplate;
import org.eclipse.xtext.ui.wizard.template.FileTemplate;
import org.eclipse.xtext.ui.wizard.template.IFileGenerator;
import org.eclipse.xtext.ui.wizard.template.StringSelectionTemplateVariable;

@FileTemplate(label = "Create Model File", icon = "model_file.gif", description = "Create a new model file.")
@SuppressWarnings("all")
public final class CreateModelFile extends AbstractFileTemplate {
  private final StringSelectionTemplateVariable helloName = this.combo("Type of model element:", new String[] { "Entity", "Technical Design", "Database", "Java", "Swift" }, "The type of model element");
  
  @Override
  public void generateFiles(final IFileGenerator generator) {
    StringConcatenation _builder = new StringConcatenation();
    String _folder = this.getFolder();
    _builder.append(_folder);
    _builder.append("/");
    String _name = this.getName();
    _builder.append(_name);
    _builder.append(".mdl");
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("/*");
    _builder_1.newLine();
    _builder_1.append("* This is an example model");
    _builder_1.newLine();
    _builder_1.append("*/");
    _builder_1.newLine();
    _builder_1.append("\t\t\t\t ");
    _builder_1.newLine();
    _builder_1.append("@entity ");
    String _name_1 = this.getName();
    _builder_1.append(_name_1);
    _builder_1.append(" {");
    _builder_1.newLineIfNotEmpty();
    _builder_1.append("\t\t\t\t\t");
    _builder_1.newLine();
    _builder_1.append("}");
    _builder_1.newLine();
    generator.generate(_builder, _builder_1);
  }
}