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
package eu.jgen.notes.dmw.lite.mdl.ui.outline;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.DMWRuntimeException;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotation;
import eu.jgen.notes.dmw.lite.mdl.model.YImport;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModelOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  private PluginImageHelper imageHelper;
  
  @Inject
  private StylerFactory stylerFactory;
  
  public void _createChildren(final DocumentRootNode outlineNode, final YModel model) {
    this.createNode(outlineNode, model);
    final Consumer<YImport> _function = (YImport element) -> {
      this.createNode(outlineNode, element);
    };
    model.getImports().forEach(_function);
    final Consumer<YAnnotation> _function_1 = (YAnnotation element) -> {
      this.createNode(outlineNode, element);
    };
    model.getAnnotations().forEach(_function_1);
  }
  
  public void _createChildren(final DocumentRootNode outlineNode, final YAnnotEntity annotEntity) {
    EList<YAnnotEntityInner> _annotations = annotEntity.getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotAttribute)) {
        this.createNode(outlineNode, ((YAnnotAttribute) annotEntityInner));
      } else {
        if ((annotEntityInner instanceof YAnnotRelationship)) {
          this.createNode(outlineNode, ((YAnnotRelationship) annotEntityInner));
        } else {
          if ((annotEntityInner instanceof YAnnotIdentifier)) {
            this.createNode(outlineNode, ((YAnnotIdentifier) annotEntityInner));
          }
        }
      }
    }
  }
  
  public boolean _isLeaf(final YModel element) {
    return true;
  }
  
  public Object _text(final YModel widget) {
    String _name = widget.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      return widget.getName();
    }
    return null;
  }
  
  /**
   * Model
   */
  public Object _image(final YModel widget) {
    String _name = widget.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      return this.imageHelper.getImage("package.gif");
    }
    return null;
  }
  
  /**
   * Technical Design
   */
  public Object _text(final YAnnotTechnicalDesign element) {
    String _name = element.getName();
    return ("Technical Design: " + _name);
  }
  
  public Object _image(final YAnnotTechnicalDesign element) {
    return this.imageHelper.getImage("td.gif");
  }
  
  /**
   * Table
   */
  public Object _text(final YAnnotTable element) {
    String _name = element.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      YAnnotEntity _entityref = element.getEntityref();
      boolean _tripleNotEquals_1 = (_entityref != null);
      if (_tripleNotEquals_1) {
        String _name_1 = element.getName();
        String _plus = (_name_1 + " -> ");
        String _name_2 = element.getEntityref().getName();
        return (_plus + _name_2);
      } else {
        return element.getName();
      }
    }
    return "";
  }
  
  public Object _image(final YAnnotTable element) {
    return this.imageHelper.getImage("table.gif");
  }
  
  /**
   * Table Column
   */
  public Object _text(final YAnnotAbstractColumn element) {
    String _name = element.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      if (((element.getType() != null) && (element.getType() instanceof YAnnotColumn))) {
        EObject _type = element.getType();
        final YAnnotColumn annotColumn = ((YAnnotColumn) _type);
        String _name_1 = element.getName();
        String _plus = (_name_1 + " -> ");
        String _name_2 = annotColumn.getAttrref().getName();
        return (_plus + _name_2);
      } else {
        if (((element.getType() != null) && (element.getType() instanceof YAnnotColumn))) {
          EObject _type_1 = element.getType();
          final YAnnotColumnLike annotColumnLike = ((YAnnotColumnLike) _type_1);
          String _name_3 = element.getName();
          String _plus_1 = (_name_3 + " as -> ");
          String _name_4 = annotColumnLike.getColumnref().getName();
          return (_plus_1 + _name_4);
        } else {
          return element.getName();
        }
      }
    }
    return "";
  }
  
  public Object _image(final YAnnotAbstractColumn element) {
    EObject _eContainer = element.eContainer();
    if ((_eContainer instanceof YAnnotForeignKey)) {
      return this.imageHelper.getImage("foreignKey.gif");
    } else {
      EObject _eContainer_1 = element.eContainer();
      if ((_eContainer_1 instanceof YAnnotTable)) {
        EObject _eContainer_2 = element.eContainer();
        final YAnnotPrimaryKey pk = ((YAnnotTable) _eContainer_2).getPrimarykey();
        if ((pk != null)) {
          EList<YAnnotAbstractColumn> _columns = pk.getColumns();
          for (final YAnnotAbstractColumn column : _columns) {
            String _name = column.getName();
            String _name_1 = element.getName();
            boolean _equals = Objects.equal(_name, _name_1);
            if (_equals) {
              return this.imageHelper.getImage("column_pkey.gif");
            }
          }
        }
      }
    }
    return this.imageHelper.getImage("column.gif");
  }
  
  public boolean _isLeaf(final YAnnotAbstractColumn element) {
    return true;
  }
  
  public boolean _isLeaf(final YAnnotTechnicalDesign element) {
    return true;
  }
  
  /**
   * Foreign Key
   */
  public void _createChildren(final DocumentRootNode outlineNode, final YAnnotForeignKey element) {
    final Consumer<YAnnotAbstractColumn> _function = (YAnnotAbstractColumn column) -> {
      this.createNode(outlineNode, column);
    };
    element.getColumns().forEach(_function);
  }
  
  public Object _text(final YAnnotForeignKey element) {
    YAnnotRelationship _relationship = element.getRelationship();
    boolean _tripleNotEquals = (_relationship != null);
    if (_tripleNotEquals) {
      YAnnotEntity _target = element.getRelationship().getTarget();
      boolean _tripleNotEquals_1 = (_target != null);
      if (_tripleNotEquals_1) {
        String _name = element.getRelationship().getName();
        String _plus = (_name + " -> ");
        String _name_1 = element.getRelationship().getTarget().getName();
        return (_plus + _name_1);
      } else {
        return element.getRelationship().getName();
      }
    }
    return null;
  }
  
  public Object _image(final YAnnotForeignKey element) {
    return this.imageHelper.getImage("fk.gif");
  }
  
  /**
   * Entity
   */
  public Object _text(final YAnnotEntity element) {
    return element.getName();
  }
  
  public Object _text(final YAnnotAttribute element) {
    try {
      String _extractAttributeType = this._modelUtil.extractAttributeType(element);
      boolean _tripleNotEquals = (_extractAttributeType != null);
      if (_tripleNotEquals) {
        String _name = element.getName();
        String _plus = (_name + " : ");
        String _extractAttributeType_1 = this._modelUtil.extractAttributeType(element);
        return (_plus + _extractAttributeType_1);
      } else {
        return element.getName();
      }
    } catch (final Throwable _t) {
      if (_t instanceof DMWRuntimeException) {
        return "";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public Object _text(final YAnnotRelationship element) {
    String opt = "";
    boolean _isOptional = element.isOptional();
    if (_isOptional) {
      opt = "?";
    }
    String desc = "";
    boolean _isMany = element.isMany();
    if (_isMany) {
      YAnnotEntity _target = element.getTarget();
      boolean _tripleNotEquals = (_target != null);
      if (_tripleNotEquals) {
        String _name = element.getName();
        String _plus = (_name + opt);
        String _plus_1 = (_plus + " -> ");
        String _name_1 = element.getTarget().getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + "*");
        desc = _plus_3;
      } else {
        String _name_2 = element.getName();
        String _plus_4 = (_name_2 + opt);
        desc = _plus_4;
      }
    } else {
      YAnnotEntity _target_1 = element.getTarget();
      boolean _tripleNotEquals_1 = (_target_1 != null);
      if (_tripleNotEquals_1) {
        String _name_3 = element.getName();
        String _plus_5 = (_name_3 + opt);
        String _plus_6 = (_plus_5 + " -> ");
        String _name_4 = element.getTarget().getName();
        String _plus_7 = (_plus_6 + _name_4);
        desc = _plus_7;
      } else {
        String _name_5 = element.getName();
        String _plus_8 = (_name_5 + opt);
        desc = _plus_8;
      }
    }
    return this.prepareText(element, desc);
  }
  
  public Object _image(final YAnnotEntity element) {
    return this.imageHelper.getImage("entity.gif");
  }
  
  public Object _image(final YImport element) {
    return this.imageHelper.getImage("import.gif");
  }
  
  public Object _image(final YAnnotAttribute element) {
    return this.imageHelper.getImage("attribute.gif");
  }
  
  public boolean _isLeaf(final YAnnotAttribute element) {
    return true;
  }
  
  public Object _image(final YAnnotRelationship element) {
    boolean _isMany = element.isMany();
    if (_isMany) {
      return this.imageHelper.getImage("onetomany.gif");
    } else {
      return this.imageHelper.getImage("onetoone.gif");
    }
  }
  
  public boolean _isLeaf(final YAnnotRelationship element) {
    return true;
  }
  
  public Object _image(final YAnnotIdentifier element) {
    return this.imageHelper.getImage("identifier.gif");
  }
  
  public boolean _isLeaf(final YAnnotIdentifier element) {
    return true;
  }
  
  public Object prepareText(final YAnnotRelationship relationship, final String description) {
    String parent = "";
    if (((this._modelUtil.isAnnotHavingSpecificName(relationship.getElementValuePairs(), "foreignkey") && 
      this._modelUtil.isForeignKeyDesignated(relationship)) || ((!this._modelUtil.isAnnotHavingSpecificName(relationship.getElementValuePairs(), "foreignkey")) && relationship.isMany()))) {
      parent = "has fk ";
    }
    StyledString.Styler _createXtextStyleAdapterStyler = this.stylerFactory.createXtextStyleAdapterStyler(this.getTypeKeywordStyleText());
    StyledString _styledString = new StyledString(parent, _createXtextStyleAdapterStyler);
    StyledString.Styler _createXtextStyleAdapterStyler_1 = this.stylerFactory.createXtextStyleAdapterStyler(this.getTypeTextStyleParameter());
    StyledString _styledString_1 = new StyledString(description, _createXtextStyleAdapterStyler_1);
    return _styledString.append(_styledString_1);
  }
  
  public TextStyle getTypeKeywordStyleText() {
    final TextStyle textStyle = new TextStyle();
    textStyle.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY).getRGB());
    textStyle.setStyle(SWT.ITALIC);
    return textStyle;
  }
  
  public TextStyle getTypeTextStyleParameter() {
    final TextStyle textStyle = new TextStyle();
    textStyle.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_FOREGROUND).getRGB());
    textStyle.setStyle(SWT.NORMAL);
    return textStyle;
  }
}
