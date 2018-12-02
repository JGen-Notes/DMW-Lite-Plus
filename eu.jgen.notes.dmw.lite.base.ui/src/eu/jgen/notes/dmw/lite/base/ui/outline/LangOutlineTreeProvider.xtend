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
 * 
 */
package eu.jgen.notes.dmw.lite.base.ui.outline

import com.google.inject.Inject

import org.eclipse.xtext.ui.PluginImageHelper
import org.eclipse.xtext.ui.editor.outline.impl.DefaultOutlineTreeProvider
import org.eclipse.xtext.ui.editor.outline.impl.DocumentRootNode
import org.eclipse.jface.viewers.StyledString
import org.eclipse.xtext.ui.label.StylerFactory
import org.eclipse.xtext.ui.editor.utils.TextStyle
import org.eclipse.swt.widgets.Display
import org.eclipse.swt.SWT
import org.eclipse.swt.graphics.RGB
import eu.jgen.notes.dmw.lite.base.lang.YWidget
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.base.lang.YProperty
import eu.jgen.notes.dmw.lite.base.lang.YFunction
import eu.jgen.notes.dmw.lite.base.lang.YClass
import eu.jgen.notes.dmw.lite.mdl.model.YImport

/**
 * Customization of the default outline structure.
 * 
 * See https://www.eclipse.org/Xtext/documentation/310_eclipse_support.html#outline
 */
class LangOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Inject
	private PluginImageHelper imageHelper;

	@Inject
	private StylerFactory stylerFactory;

	def void _createChildren(DocumentRootNode outlineNode, YWidget widget) {
		createNode(outlineNode, widget);
		widget.imports.forEach[element|createNode(outlineNode, element)]
		widget.classes.forEach[element|createNode(outlineNode, element)]
	}

	def boolean _isLeaf(YWidget element) {
		return true
	}

	def Object _text(YWidget widget) {
		if (widget.name !== null) {
			return widget.name
		}
	}

	/*
	 * Widget
	 */
	def Object _image(YWidget widget) {
		if (widget.name !== null) {
			return imageHelper.getImage("package.gif")
		}
	}


	def Object _text(YProperty element) {
		var tuple = ""
		if (element.tuples !== null) {
			tuple = "<>"
		}
		if (element.name !== null) {
			return element.name
		}
		if (element.type !== null) {
			return element.name + " : " + element.type.name + tuple
		}
		return ""
	}

	def Object _text(YFunction element) {
		return element.name + "()"
	}

	def Object _text(YClass element) {
		if (element.superclass !== null && element.superclass.name == "Widget") {
			element.name
		} else if (element.superclass !== null && element.superclass.name == "Structure") {
			if (element.entityRef !== null) {
				element.name + " -> " + element.entityRef.name
			} else {
				element.name
			}
		} else {
			return element.name
		}
	}

	def Object _image(YClass element) {
		if (element.superclass !== null && element.superclass.name == "Widget") {
			return imageHelper.getImage("widget.gif")
		} else if (element.superclass !== null && element.superclass.name == "Structure") {
			return imageHelper.getImage("structure.gif")
		} else {
			return imageHelper.getImage("class.gif")
		}
	}

	def Object _image(YAnnotEntity element) {
		return imageHelper.getImage("entity.gif")
	}

	def Object _image(YProperty element) {
		return imageHelper.getImage("property.gif")
	}

	def Object _image(YFunction element) {
		return imageHelper.getImage("function.gif")
	}

	def Object _image(YImport element) {
		return imageHelper.getImage("import.gif")
	}


	def boolean _isLeaf(YProperty element) {
		return true
	}

	def boolean _isLeaf(YFunction element) {
		return true
	}


	def TextStyle getTypeKeywordStyleText() {
		val textStyle = new TextStyle();
		textStyle.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_GRAY).RGB)
		textStyle.setStyle(SWT.ITALIC);
		return textStyle;
	}

	def TextStyle getTypeTextStyleParameter() {
		val textStyle = new TextStyle();
		textStyle.setColor(Display.getCurrent().getSystemColor(SWT.COLOR_TITLE_FOREGROUND).RGB);
		textStyle.setStyle(SWT.NORMAL);
		return textStyle;
	}

}
