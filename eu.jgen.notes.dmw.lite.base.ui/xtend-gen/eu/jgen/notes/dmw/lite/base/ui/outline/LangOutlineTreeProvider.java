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
package eu.jgen.notes.dmw.lite.base.ui.outline;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YFunction;
import eu.jgen.notes.dmw.lite.base.lang.YProperty;
import eu.jgen.notes.dmw.lite.base.lang.YTuples;
import eu.jgen.notes.dmw.lite.base.lang.YWidget;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YImport;
import java.util.function.Consumer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider;
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode;
import org.eclipse.xtext.ui.editor.utils.TextStyle;
import org.eclipse.xtext.ui.label.StylerFactory;

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
@SuppressWarnings("all")
public class LangOutlineTreeProvider extends DefaultOutlineTreeProvider {
  @Inject
  private PluginImageHelper imageHelper;
  
  @Inject
  private StylerFactory stylerFactory;
  
  public void _createChildren(final DocumentRootNode outlineNode, final YWidget widget) {
    this.createNode(outlineNode, widget);
    final Consumer<YImport> _function = (YImport element) -> {
      this.createNode(outlineNode, element);
    };
    widget.getImports().forEach(_function);
    final Consumer<YClass> _function_1 = (YClass element) -> {
      this.createNode(outlineNode, element);
    };
    widget.getClasses().forEach(_function_1);
  }
  
  public boolean _isLeaf(final YWidget element) {
    return true;
  }
  
  public Object _text(final YWidget widget) {
    String _name = widget.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      return widget.getName();
    }
    return null;
  }
  
  /**
   * Widget
   */
  public Object _image(final YWidget widget) {
    String _name = widget.getName();
    boolean _tripleNotEquals = (_name != null);
    if (_tripleNotEquals) {
      return this.imageHelper.getImage("package.gif");
    }
    return null;
  }
  
  public Object _text(final YProperty element) {
    String tuple = "";
    YTuples _tuples = element.getTuples();
    boolean _tripleNotEquals = (_tuples != null);
    if (_tripleNotEquals) {
      tuple = "<>";
    }
    String _name = element.getName();
    boolean _tripleNotEquals_1 = (_name != null);
    if (_tripleNotEquals_1) {
      return element.getName();
    }
    YClass _type = element.getType();
    boolean _tripleNotEquals_2 = (_type != null);
    if (_tripleNotEquals_2) {
      String _name_1 = element.getName();
      String _plus = (_name_1 + " : ");
      String _name_2 = element.getType().getName();
      String _plus_1 = (_plus + _name_2);
      return (_plus_1 + tuple);
    }
    return "";
  }
  
  public Object _text(final YFunction element) {
    String _name = element.getName();
    return (_name + "()");
  }
  
  public Object _text(final YClass element) {
    String _xifexpression = null;
    if (((element.getSuperclass() != null) && Objects.equal(element.getSuperclass().getName(), "Widget"))) {
      _xifexpression = element.getName();
    } else {
      String _xifexpression_1 = null;
      if (((element.getSuperclass() != null) && Objects.equal(element.getSuperclass().getName(), "Structure"))) {
        String _xifexpression_2 = null;
        YAnnotEntity _entityRef = element.getEntityRef();
        boolean _tripleNotEquals = (_entityRef != null);
        if (_tripleNotEquals) {
          String _name = element.getName();
          String _plus = (_name + " -> ");
          String _name_1 = element.getEntityRef().getName();
          _xifexpression_2 = (_plus + _name_1);
        } else {
          _xifexpression_2 = element.getName();
        }
        _xifexpression_1 = _xifexpression_2;
      } else {
        return element.getName();
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  public Object _image(final YClass element) {
    if (((element.getSuperclass() != null) && Objects.equal(element.getSuperclass().getName(), "Widget"))) {
      return this.imageHelper.getImage("widget.gif");
    } else {
      if (((element.getSuperclass() != null) && Objects.equal(element.getSuperclass().getName(), "Structure"))) {
        return this.imageHelper.getImage("structure.gif");
      } else {
        return this.imageHelper.getImage("class.gif");
      }
    }
  }
  
  public Object _image(final YAnnotEntity element) {
    return this.imageHelper.getImage("entity.gif");
  }
  
  public Object _image(final YProperty element) {
    return this.imageHelper.getImage("property.gif");
  }
  
  public Object _image(final YFunction element) {
    return this.imageHelper.getImage("function.gif");
  }
  
  public Object _image(final YImport element) {
    return this.imageHelper.getImage("import.gif");
  }
  
  public boolean _isLeaf(final YProperty element) {
    return true;
  }
  
  public boolean _isLeaf(final YFunction element) {
    return true;
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
