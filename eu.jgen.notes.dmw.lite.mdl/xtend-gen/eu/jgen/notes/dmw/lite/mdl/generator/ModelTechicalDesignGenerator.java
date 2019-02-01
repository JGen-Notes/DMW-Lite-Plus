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
package eu.jgen.notes.dmw.lite.mdl.generator;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.generator.ModelOutputProvider;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.IFileSystemAccess;
import org.eclipse.xtext.generator.IGenerator;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelTechicalDesignGenerator implements IGenerator {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Override
  public void doGenerate(final Resource input, final IFileSystemAccess fsa) {
    final Function1<EObject, Boolean> _function = (EObject element) -> {
      return Boolean.valueOf((element instanceof YAnnotTechnicalDesign));
    };
    final Procedure1<EObject> _function_1 = (EObject element) -> {
      final YAnnotTechnicalDesign technicalDesign = ((YAnnotTechnicalDesign) element);
      this.generateDDLForDerby(fsa, technicalDesign);
    };
    IteratorExtensions.<EObject>forEach(IteratorExtensions.<EObject>filter(input.getAllContents(), _function), _function_1);
  }
  
  protected void generateDDLForDerby(final IFileSystemAccess fsa, final YAnnotTechnicalDesign technicalDesign) {
    EList<YAnnotTable> _features = technicalDesign.getFeatures();
    for (final YAnnotTable table : _features) {
      this.generateTableForDerby(fsa, table);
    }
  }
  
  private void generateTableForDerby(final IFileSystemAccess fsa, final YAnnotTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CREATE TABLE \"");
    String _name = table.getName();
    _builder.append(_name);
    _builder.append("\" (");
    _builder.newLineIfNotEmpty();
    {
      EList<YAnnotAbstractColumn> _columns = table.getColumns();
      boolean _hasElements = false;
      for(final YAnnotAbstractColumn abstractColumn : _columns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        String _generateColumnForDerby = this.generateColumnForDerby(abstractColumn);
        _builder.append(_generateColumnForDerby, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<YAnnotForeignKey> _foreignkeys = table.getForeignkeys();
      boolean _hasElements_1 = false;
      for(final YAnnotForeignKey foreignKey : _foreignkeys) {
        if (!_hasElements_1) {
          _hasElements_1 = true;
          _builder.append(",", "\t");
        } else {
          _builder.appendImmediate(",", "\t");
        }
        _builder.append("\t");
        _builder.append("BEFORE \',\'");
        String _generateForeignKeyColumns = this.generateForeignKeyColumns(foreignKey);
        _builder.append(_generateForeignKeyColumns, "\t");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    {
      YAnnotPrimaryKey _primarykey = table.getPrimarykey();
      boolean _tripleNotEquals = (_primarykey != null);
      if (_tripleNotEquals) {
        _builder.append(",");
        String _generatePrimaryKey = this.generatePrimaryKey(table);
        _builder.append(_generatePrimaryKey, "\t");
      }
    }
    _builder.newLineIfNotEmpty();
    _builder.append(")");
    _builder.newLine();
    final String text = _builder.toString();
    String _name_1 = table.getName();
    String _plus = ("derby/" + _name_1);
    String _plus_1 = (_plus + ".ddl");
    fsa.generateFile(_plus_1, 
      ModelOutputProvider.DDL, text);
  }
  
  private String generateColumnForDerby(final YAnnotAbstractColumn abstractColumn) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("\"");
    String _upperCase = abstractColumn.getName().toUpperCase();
    _builder.append(_upperCase);
    _builder.append("\" ");
    String _generateColumnTypeForDerby = this.generateColumnTypeForDerby(abstractColumn);
    _builder.append(_generateColumnTypeForDerby);
    _builder.newLineIfNotEmpty();
    final String text = _builder.toString();
    return text;
  }
  
  private String generateForeignKeyColumns(final YAnnotForeignKey foreignKey) {
    StringConcatenation _builder = new StringConcatenation();
    {
      EList<YAnnotAbstractColumn> _columns = foreignKey.getColumns();
      for(final YAnnotAbstractColumn abstractColumn : _columns) {
        _builder.append("\"");
        String _upperCase = abstractColumn.getName().toUpperCase();
        _builder.append(_upperCase);
        _builder.append("\" ");
        String _generateColumnTypeForDerby = this.generateColumnTypeForDerby(abstractColumn);
        _builder.append(_generateColumnTypeForDerby);
        _builder.newLineIfNotEmpty();
      }
    }
    final String text = _builder.toString();
    return text;
  }
  
  private String generateColumnTypeForDerby(final YAnnotAbstractColumn abstractColumn) {
    String _xifexpression = null;
    EObject _type = abstractColumn.getType();
    if ((_type instanceof YAnnotColumn)) {
      EObject _type_1 = abstractColumn.getType();
      final YAnnotColumn column = ((YAnnotColumn) _type_1);
      StringConcatenation _builder = new StringConcatenation();
      String _type_2 = column.getType();
      _builder.append(_type_2);
      {
        if ((Objects.equal(column.getType(), "CHAR") || Objects.equal(column.getType(), "VARCHAR"))) {
          _builder.append("(");
          String _generateLengthForDerby = this.generateLengthForDerby(column);
          _builder.append(_generateLengthForDerby);
          _builder.append(")");
        }
      }
      _builder.append(" ");
      String _generateNullFlag = this.generateNullFlag(column);
      _builder.append(_generateNullFlag);
      _builder.newLineIfNotEmpty();
      final String text = _builder.toString();
      return text;
    } else {
      EObject _type_3 = abstractColumn.getType();
      _xifexpression = this.generateColumnTypeForDerby(((YAnnotColumnLike) _type_3).getColumnref());
    }
    return _xifexpression;
  }
  
  private String generateLengthForDerby(final YAnnotColumn column) {
    return "";
  }
  
  private String generateNullFlag(final YAnnotColumn column) {
    String _optional = column.getOptional();
    boolean _notEquals = (!Objects.equal(_optional, "?"));
    if (_notEquals) {
      return "NOT NULL";
    }
    return null;
  }
  
  private String generatePrimaryKey(final YAnnotTable table) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("CONSTRAINT \"");
    String _name = table.getName();
    String _plus = ("PK_" + _name);
    _builder.append(_plus);
    _builder.append("\"");
    _builder.newLineIfNotEmpty();
    _builder.append("PRIMARY KEY (");
    {
      EList<YAnnotAbstractColumn> _columns = table.getPrimarykey().getColumns();
      boolean _hasElements = false;
      for(final YAnnotAbstractColumn abstractColumn : _columns) {
        if (!_hasElements) {
          _hasElements = true;
        } else {
          _builder.appendImmediate(",", "");
        }
        _builder.append("\"");
        String _upperCase = abstractColumn.getName().toUpperCase();
        _builder.append(_upperCase);
        _builder.append("\"");
      }
    }
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    final String text = _builder.toString();
    return text;
  }
}
