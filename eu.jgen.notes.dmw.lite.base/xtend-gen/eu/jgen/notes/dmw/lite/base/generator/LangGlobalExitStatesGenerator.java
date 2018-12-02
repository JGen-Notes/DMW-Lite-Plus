package eu.jgen.notes.dmw.lite.base.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.generator.LangOutputProvider;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YMember;
import eu.jgen.notes.dmw.lite.base.lang.YProperty;
import eu.jgen.notes.dmw.lite.base.lang.YWidget;
import eu.jgen.notes.dmw.lite.utility.LangGeneratorHelperForJava;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LangGlobalExitStatesGenerator implements IGenerator {
  @Inject
  @Extension
  private LangGeneratorHelperForJava _langGeneratorHelperForJava;
  
  private List<String> imports = CollectionLiterals.<String>newArrayList();
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    final Function1<EObject, Boolean> _function = (EObject element) -> {
      return Boolean.valueOf((element instanceof YWidget));
    };
    final Procedure1<EObject> _function_1 = (EObject element) -> {
      final YWidget widget = ((YWidget) element);
      this.generateWidget(fsa, widget);
    };
    IteratorExtensions.<EObject>forEach(IteratorExtensions.<EObject>filter(input.getAllContents(), _function), _function_1);
  }
  
  protected void generateWidget(final IFileSystemAccess fsa, final YWidget widget) {
    this.imports.clear();
    final Consumer<YClass> _function = (YClass clazz) -> {
      if (((clazz.getSuperclass() != null) && Objects.equal(clazz.getSuperclass().getName(), "GlobalExitStates"))) {
        this.imports.add("eu.jgen.notes.dmw.lite.runtimes.GlobalExitStates");
        this.imports.add("eu.jgen.notes.dmw.lite.runtimes.ExitState");
        StringConcatenation _builder = new StringConcatenation();
        String _documentation = this._langGeneratorHelperForJava.getDocumentation(clazz);
        _builder.append(_documentation);
        _builder.append("  ");
        _builder.newLineIfNotEmpty();
        _builder.append("public class ");
        String _name = clazz.getName();
        _builder.append(_name);
        _builder.append(" extends GlobalExitStates {");
        _builder.newLineIfNotEmpty();
        _builder.append("   ");
        String _generateExitStates = this.generateExitStates(clazz);
        _builder.append(_generateExitStates, "   ");
        _builder.newLineIfNotEmpty();
        _builder.append("}");
        _builder.newLine();
        final String body = _builder.toString();
        String _fileSystemPath = this._langGeneratorHelperForJava.getFileSystemPath(widget.getName());
        String _plus = (_fileSystemPath + "/");
        String _name_1 = clazz.getName();
        String _plus_1 = (_plus + _name_1);
        String _plus_2 = (_plus_1 + ".java");
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("package ");
        String _name_2 = widget.getName();
        _builder_1.append(_name_2);
        _builder_1.append(";");
        _builder_1.newLineIfNotEmpty();
        _builder_1.newLine();
        {
          for(final String imp : this.imports) {
            _builder_1.append("import ");
            _builder_1.append(imp);
            _builder_1.append(";");
            _builder_1.newLineIfNotEmpty();
          }
        }
        _builder_1.newLine();
        _builder_1.append(body);
        _builder_1.append("\t\t");
        _builder_1.newLineIfNotEmpty();
        fsa.generateFile(_plus_2, 
          LangOutputProvider.DEFAULT, _builder_1);
      }
    };
    widget.getClasses().forEach(_function);
  }
  
  protected String generateExitStates(final YClass clazz) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<YMember> _members = clazz.getMembers();
      for(final YMember member : _members) {
        {
          if ((member instanceof YProperty)) {
            String _generatePropertyForStructure = this.generatePropertyForStructure(((YProperty) member));
            _builder.append(_generatePropertyForStructure);
            _builder.newLineIfNotEmpty();
          }
        }
      }
    }
    return _builder.toString();
  }
  
  protected String generatePropertyForStructure(final YProperty property) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("public ExitState ");
    String _name = property.getName();
    _builder.append(_name);
    _builder.append(";");
    return _builder.toString();
  }
}
