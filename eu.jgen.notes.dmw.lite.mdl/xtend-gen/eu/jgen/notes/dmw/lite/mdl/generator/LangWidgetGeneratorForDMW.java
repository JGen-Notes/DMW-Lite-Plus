package eu.jgen.notes.dmw.lite.mdl.generator;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.generator.ModelGenerator;
import eu.jgen.notes.dmw.lite.mdl.generator.ModelOutputProvider;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotation;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import java.util.function.Consumer;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LangWidgetGeneratorForDMW implements IGenerator {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    final Function1<Notifier, Boolean> _function = (Notifier element2) -> {
      return Boolean.valueOf((element2 instanceof YModel));
    };
    final Procedure1<Notifier> _function_1 = (Notifier element) -> {
      final YModel model = ((YModel) element);
      this.generateModelEntityClasses(fsa, model);
    };
    IteratorExtensions.<Notifier>forEach(IteratorExtensions.<Notifier>filter(input.getResourceSet().getAllContents(), _function), _function_1);
  }
  
  public void generateModelEntityClasses(final IFileSystemAccess fsa, final YModel model) {
    final Consumer<YAnnotation> _function = (YAnnotation annotation) -> {
      if ((annotation instanceof YAnnotEntity)) {
        final YAnnotEntity entity = ((YAnnotEntity) annotation);
        StringConcatenation _builder = new StringConcatenation();
        _builder.append(ModelGenerator.GENERATOR_NOTICE);
        _builder.newLineIfNotEmpty();
        _builder.append("  ");
        _builder.newLine();
        _builder.append("package ");
        String _name = model.getName();
        _builder.append(_name);
        _builder.append(".model;");
        _builder.newLineIfNotEmpty();
        _builder.append("import ");
        String _name_1 = model.getName();
        _builder.append(_name_1);
        _builder.append(".*;");
        _builder.newLineIfNotEmpty();
        _builder.append("import eu.jgen.notes.lib.dmw.*;");
        _builder.newLine();
        _builder.newLine();
        _builder.append("class ");
        String _name_2 = entity.getName();
        _builder.append(_name_2);
        _builder.append("All : Structure => ");
        String _name_3 = entity.getName();
        _builder.append(_name_3);
        _builder.append(" {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        String _generateVariablesUsingAttribute = this.generateVariablesUsingAttribute(entity);
        _builder.append(_generateVariablesUsingAttribute, "\t");
        _builder.append(" ");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        final String body = _builder.toString();
        String _fileSystemPath = this.getFileSystemPath(model.getName());
        String _plus = (_fileSystemPath + "/model/");
        String _name_4 = entity.getName();
        String _plus_1 = (_plus + _name_4);
        String _plus_2 = (_plus_1 + ".dmw");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append(body);
        _builder_1.newLineIfNotEmpty();
        fsa.generateFile(_plus_2, 
          ModelOutputProvider.SRC, _builder_1);
      }
    };
    model.getAnnotations().forEach(_function);
  }
  
  public String generateVariablesUsingAttribute(final YAnnotEntity entity) {
    final StringBuffer buffer = new StringBuffer();
    EList<YAnnotEntityInner> _annotations = entity.getAnnotations();
    for (final YAnnotEntityInner annotation : _annotations) {
      if ((annotation instanceof YAnnotAttribute)) {
        final YAnnotAttribute attribute = ((YAnnotAttribute) annotation);
        String _name = attribute.getName();
        String _plus = ("public var " + _name);
        String _plus_1 = (_plus + " : ");
        String _extractAttributeType = this._modelUtil.extractAttributeType(attribute);
        String _plus_2 = (_plus_1 + _extractAttributeType);
        String _plus_3 = (_plus_2 + " => ");
        String _name_1 = entity.getName();
        String _plus_4 = (_plus_3 + _name_1);
        String _plus_5 = (_plus_4 + ".");
        String _name_2 = attribute.getName();
        String _plus_6 = (_plus_5 + _name_2);
        String _plus_7 = (_plus_6 + ";\n");
        buffer.append(_plus_7);
      }
    }
    return buffer.toString();
  }
  
  public String getFileSystemPath(final String packname) {
    return packname.replace(".", "/");
  }
}
