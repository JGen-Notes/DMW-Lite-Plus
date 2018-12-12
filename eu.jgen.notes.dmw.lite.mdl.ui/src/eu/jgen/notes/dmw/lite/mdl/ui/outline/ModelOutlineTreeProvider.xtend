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
package eu.jgen.notes.dmw.lite.mdl.ui.outline

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
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YModel
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier
import eu.jgen.notes.dmw.lite.mdl.model.YImport
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil

class ModelOutlineTreeProvider extends DefaultOutlineTreeProvider {

	@Inject extension ModelUtil ;

	@Inject PluginImageHelper imageHelper;

	@Inject StylerFactory stylerFactory;

	def void _createChildren(DocumentRootNode outlineNode, YModel model) {
		createNode(outlineNode, model);
		model.imports.forEach[element|createNode(outlineNode, element)]
		model.annotations.forEach[element|createNode(outlineNode, element)]
	}

	def void _createChildren(DocumentRootNode outlineNode, YAnnotEntity annotEntity) {
		for (YAnnotEntityInner annotEntityInner : annotEntity.annotations) {
			if (annotEntityInner instanceof YAnnotAttribute) {
				createNode(outlineNode, annotEntityInner as YAnnotAttribute)
			} else if (annotEntityInner instanceof YAnnotRelationship) {
				createNode(outlineNode, annotEntityInner as YAnnotRelationship)
			} else if (annotEntityInner instanceof YAnnotIdentifier) {
				createNode(outlineNode, annotEntityInner as YAnnotIdentifier)
			}
		}
	}

	def boolean _isLeaf(YModel element) {
		return true
	}

	def Object _text(YModel widget) {
		if (widget.name !== null) {
			return widget.name
		}
	}

	/*
	 * Model
	 */
	def Object _image(YModel widget) {
		if (widget.name !== null) {
			return imageHelper.getImage("package.gif")
		}
	}

	/*
	 * Database
	 */
//	def Object _text(YAnnotDatabase annotDatabase) {
//		if (annotDatabase.name !== null) {
//			return annotDatabase.name
//		}
//	}

//	def Object _image(YAnnotDatabase annotDatabase) {
//		if (annotDatabase.name !== null) {
//			return imageHelper.getImage("database.gif")
//		}
//	}

	/*
	 * Swift
	 */
//	def Object _text(YAnnotSwift annotSwift) {
//		if (annotSwift.name !== null) {
//			if (annotSwift.database !== null)
//				return "Swift " + annotSwift.name + " + " + annotSwift.database.name
//		}
//	}

//	def Object _image(YAnnotSwift annotSwift) {
//		return imageHelper.getImage("swift.png")
//	}

	/*
	 * Java
	 */
//	def Object _text(YAnnotJava annotJava) {
//		if (annotJava.database !== null) {
//			return "Java + " + annotJava.database.name
//		} else {
//			return "Java"
//		}
//	}

//	def Object _image(YAnnotJava annotJava) {
//		return imageHelper.getImage("java.png")
//	}

	/*
	 *  Technical Design
	 */
	def Object _text(YAnnotTechnicalDesign element) {
		element.name
	}

	def Object _image(YAnnotTechnicalDesign element) {
		return imageHelper.getImage("td.gif")
	}

	/*
	 *  Table
	 */
	def Object _text(YAnnotTable element) {
		if (element.name !== null) {
			if (element.entityref !== null) {
				return element.name + " -> " + element.entityref.name
			} else {
				return element.name
			}
		}
		return ""
	}

	def Object _image(YAnnotTable element) {
		return imageHelper.getImage("table.gif")
	}

	/*
	 *  Table Column
	 */
	def Object _text(YAnnotAbstractColumn element) {
		if (element.name !== null) {
			if (element.type !== null && element.type instanceof YAnnotColumn) {
				val annotColumn = element.type as YAnnotColumn
				return element.name + " -> " + annotColumn.attrref.name
			} else if (element.type !== null && element.type instanceof YAnnotColumn) {
				val annotColumnLike = element.type as YAnnotColumnLike
				return element.name + " as -> " + annotColumnLike.columnref.name
			} else {
				return element.name
			}
		}
		return ""

	}

	def Object _image(YAnnotAbstractColumn element) {
		if (element.eContainer instanceof YAnnotForeignKey) {
			return imageHelper.getImage("foreignKey.gif")
		} else if (element.eContainer instanceof YAnnotTable) {
			val pk = (element.eContainer as YAnnotTable).primarykey
			if (pk !== null) {
				for (column : pk.columns) {
					if (column.name == element.name) {
						return imageHelper.getImage("column_pkey.gif")
					}
				}
			}
		}
		return imageHelper.getImage("column.gif")
	}

	def boolean _isLeaf(YAnnotAbstractColumn element) {
		return true
	}

	/*
	 * Foreign Key
	 */
	def void _createChildren(DocumentRootNode outlineNode, YAnnotForeignKey element) {
		element.columns.forEach [ column |
			createNode(outlineNode, column)
		]
	}

	def Object _text(YAnnotForeignKey element) {
		if (element.relationship !== null) {
			if (element.relationship.target !== null) {
				return element.relationship.name + " -> " + element.relationship.target.name
			} else {
				return element.relationship.name
			}
		}
	}

	def Object _image(YAnnotForeignKey element) {
		return imageHelper.getImage("fk.gif")
	}

	/*
	 * Entity
	 */
	def Object _text(YAnnotEntity element) {
		return element.name
	}

	def Object _text(YAnnotAttribute element) {
		if (element.extractAttributeType !== null) {
			return element.name + " : " + element.extractAttributeType
		} else {
			return element.name
		}
	}

	def Object _text(YAnnotRelationship element) {
		var opt = ""
		if (element.optional) {
			opt = "?"
		}
		var desc = ""
		if (element.many) {
			if (element.target !== null) {
				desc = element.name + opt + " -> " + element.target.name + "*"
			} else {
				desc = element.name + opt
			}
		} else {
			if (element.target !== null) {
				desc = element.name + opt + " -> " + element.target.name
			} else {
				desc = element.name + opt
			}
		}
		return prepareText(element, desc)
	}

	def Object _image(YAnnotEntity element) {
		return imageHelper.getImage("entity.gif")
	}

	def Object _image(YImport element) {
		return imageHelper.getImage("import.gif")
	}

	def Object _image(YAnnotAttribute element) {
		return imageHelper.getImage("attribute.gif")
	}

	def boolean _isLeaf(YAnnotAttribute element) {
		return true
	}

	def Object _image(YAnnotRelationship element) {
		if (element.many) {
			return imageHelper.getImage("onetomany.gif")
		} else {
			return imageHelper.getImage("onetoone.gif")
		}
	}

	def boolean _isLeaf(YAnnotRelationship element) {
		return true
	}

	def Object _image(YAnnotIdentifier element) {
		return imageHelper.getImage("identifier.gif")
	}

	def boolean _isLeaf(YAnnotIdentifier element) {
		return true
	}

	def Object prepareText(YAnnotRelationship relationship, String description) {
		var parent = ""
		if ((relationship.elementValuePairs.isAnnotHavingSpecificName("foreignkey") &&
			relationship.isForeignKeyDesignated) ||
			(!relationship.elementValuePairs.isAnnotHavingSpecificName("foreignkey") && relationship.isMany)) {
			parent = "has fk "
		}
		return new StyledString(parent, stylerFactory.createXtextStyleAdapterStyler(getTypeKeywordStyleText())).append(
			new StyledString(description, stylerFactory.createXtextStyleAdapterStyler(getTypeTextStyleParameter())))
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
