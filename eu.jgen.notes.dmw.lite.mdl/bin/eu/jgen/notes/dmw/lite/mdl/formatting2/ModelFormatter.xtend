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
package eu.jgen.notes.dmw.lite.mdl.formatting2

import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign
import eu.jgen.notes.dmw.lite.mdl.model.YImport
import eu.jgen.notes.dmw.lite.mdl.model.YModel
import org.eclipse.xtext.formatting2.AbstractFormatter2
import org.eclipse.xtext.formatting2.IFormattableDocument
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess
import com.google.inject.Inject

class ModelFormatter extends AbstractFormatter2 {

	@Inject extension ModelGrammarAccess

	def dispatch void format(YModel model, extension IFormattableDocument document) {
		model.regionFor.keyword("package").append[oneSpace]
		model.regionFor.feature(ModelPackage.eINSTANCE.YModel_Name).append[noSpace]

		for (YImport yImport : model.getImports()) {
			yImport.format;
		}
		for (annotation : model.getAnnotations()) {
			if (annotation instanceof YAnnotEntity) {
				(annotation as YAnnotEntity).format
			} else if (annotation instanceof YAnnotTechnicalDesign) {
				(annotation as YAnnotTechnicalDesign).format
			} else {
				annotation.format;
			}

		}

	}

	def dispatch void format(YImport imp, extension IFormattableDocument document) {
		imp.regionFor.keyword("import").prepend[newLine].append[oneSpace]
		imp.regionFor.feature(ModelPackage.eINSTANCE.YImport_ImportedNamespace)
	}

//	def dispatch void format(YAnnotDatabase annotDatabase, extension IFormattableDocument document) {
//		annotDatabase.regionFor.keyword("@database").prepend[newLines = 2].append[oneSpace]
//		annotDatabase.regionFor.feature(ModelPackage.eINSTANCE.YImport_ImportedNamespace).prepend[oneSpace]
//		annotDatabase.regionFor.keyword(";").prepend[noSpace]
//	}
//
//	def dispatch void format(YAnnotSwift annotSwift, extension IFormattableDocument document) {
//		annotSwift.regionFor.keyword("@swift").prepend[newLines = 2].append[oneSpace]
//		annotSwift.regionFor.keyword("module").surround[oneSpace]
//		annotSwift.regionFor.keyword("uses").surround[oneSpace]
//		annotSwift.regionFor.keyword(";").prepend[noSpace]
//		annotSwift.regionFor.feature(ModelPackage.eINSTANCE.YAnnotSwift_Name).surround[oneSpace]
//	}
//
//	def dispatch void format(YAnnotJava annotJava, extension IFormattableDocument document) {
//		annotJava.regionFor.keyword("@java").prepend[newLines = 2].append[oneSpace]
//		annotJava.regionFor.keyword("uses").surround[oneSpace]
//		annotJava.regionFor.keyword(";").prepend[noSpace]
//		annotJava.regionFor.feature(ModelPackage.eINSTANCE.YAnnotSwift_Name).surround[oneSpace]
//	}

	def dispatch void format(YAnnotEntity annotEntity, extension IFormattableDocument document) {
		annotEntity.regionFor.keyword("@entity").prepend[newLines = 2].append[oneSpace]
		annotEntity.regionFor.keyword(":").surround[oneSpace]
		annotEntity.regionFor.feature(ModelPackage.eINSTANCE.YAnnotation_Name).surround[oneSpace]
		annotEntity.regionFor.keyword("{").prepend[oneSpace].append[newLine]
		annotEntity.interior[indent].annotations.forEach[format]
		annotEntity.regionFor.keyword("}").prepend[newLine]
	}

	def dispatch void format(YAnnotAttribute annotAttr, extension IFormattableDocument document) {
		annotAttr.regionFor.keyword("@attribute").prepend[newLine].append[oneSpace]
		annotAttr.regionFor.feature(ModelPackage.eINSTANCE.YAnnotAttribute_Name).surround[oneSpace]
		annotAttr.regionFor.keyword(":").surround[oneSpace]
		annotAttr.regionFor.keyword(";")
	}

	def dispatch void format(YAnnotRelationship annotRel, extension IFormattableDocument document) {
		annotRel.regionFor.keyword("@relationship").prepend[newLine].append[oneSpace]
		annotRel.regionFor.feature(ModelPackage.eINSTANCE.YAnnotRelationship_Name).surround[oneSpace]
		annotRel.regionFor.keyword("?").surround[oneSpace]
		annotRel.regionFor.keyword("->").surround[oneSpace]
		annotRel.regionFor.feature(ModelPackage.eINSTANCE.YAnnotRelationship_Target).surround[oneSpace]
		annotRel.regionFor.keyword("*").surround[oneSpace]
		annotRel.regionFor.keyword("<-").surround[oneSpace]
		annotRel.regionFor.feature(ModelPackage.eINSTANCE.YAnnotRelationship_Inverse).prepend[oneSpace].append[noSpace]
		annotRel.regionFor.keyword(";").prepend[noSpace]
	}

	def dispatch void format(YAnnotIdentifier annotId, extension IFormattableDocument document) {
		annotId.regionFor.keyword("@identifier").prepend[newLine].append[oneSpace]
		annotId.regionFor.feature(ModelPackage.eINSTANCE.YAnnotIdentifier_Name).prepend[oneSpace].append[noSpace]
		annotId.regionFor.keyword("(").surround[noSpace]
		annotId.regionFor.keyword(",").surround[noSpace]
		annotId.interior[indent].annots.forEach[format]
		annotId.regionFor.keyword(")").surround[noSpace]
		annotId.regionFor.keyword(";").prepend[noSpace]
	}

	def dispatch void format(YAnnotTechnicalDesign annotTechnicalDesign, extension IFormattableDocument document) {
		annotTechnicalDesign.regionFor.keyword("@td").prepend[newLines = 2].append[oneSpace]
		annotTechnicalDesign.regionFor.keyword("{").prepend[oneSpace].append[newLine]
		annotTechnicalDesign.interior[indent].features.forEach[format]
		annotTechnicalDesign.regionFor.keyword("}").prepend[newLine]
	}

	def dispatch void format(YAnnotTable annotTable, extension IFormattableDocument document) {
		annotTable.regionFor.keyword("@table").prepend[newLine].append[oneSpace]
		annotTable.regionFor.feature(ModelPackage.eINSTANCE.YAnnotTable_Name).surround[oneSpace]
		annotTable.regionFor.keyword("->").surround[oneSpace]
		annotTable.regionFor.feature(ModelPackage.eINSTANCE.YAnnotTable_Entityref).surround[oneSpace]
		annotTable.regionFor.keyword("{").prepend[oneSpace].append[newLine]
		annotTable.interior[indent].columns.forEach[format]
		annotTable.primarykey.format
		annotTable.regionFor.keyword("}").prepend[newLine].append[newLine]
	}

	def dispatch void format(YAnnotAbstractColumn annotAbstractColumn, extension IFormattableDocument document) {
		annotAbstractColumn.regionFor.keyword("@column").prepend[newLine].append[oneSpace]
		annotAbstractColumn.regionFor.feature(ModelPackage.eINSTANCE.YAnnotAbstractColumn_Name).surround[oneSpace]
		annotAbstractColumn.type.format
	}

	def dispatch void format(YAnnotColumn annotColumn, extension IFormattableDocument document) {
		annotColumn.regionFor.keyword("->").surround[oneSpace]
		annotColumn.regionFor.feature(ModelPackage.eINSTANCE.YAnnotColumn_Attrref).surround[oneSpace]
		annotColumn.regionFor.keyword("as").surround[oneSpace]
		annotColumn.regionFor.feature(ModelPackage.eINSTANCE.YAnnotColumn_Type).prepend[oneSpace]
		annotColumn.regionFor.keyword(";").prepend[noSpace]
	}

	def dispatch void format(YAnnotColumnLike annotColumnLike, extension IFormattableDocument document) {
		annotColumnLike.regionFor.keyword("->").surround[oneSpace]
		annotColumnLike.regionFor.feature(ModelPackage.eINSTANCE.YAnnotColumnLike_Columnref).prepend[oneSpace].append [
			noSpace
		]
		annotColumnLike.regionFor.keyword(";").prepend[noSpace]
	}

	def dispatch void format(YAnnotPrimaryKey annotPrimaryKey, extension IFormattableDocument document) {
		annotPrimaryKey.regionFor.keyword("@primary").prepend[newLine].append[oneSpace]
		annotPrimaryKey.regionFor.keyword("(").prepend[oneSpace].append[noSpace]
		annotPrimaryKey.regionFor.keyword(",").surround[noSpace]
		annotPrimaryKey.interior[].columns.forEach[name]
		annotPrimaryKey.regionFor.keyword(")").prepend[noSpace].append[noSpace]
		annotPrimaryKey.regionFor.keyword(";").prepend[noSpace]
	}

	def dispatch void format(YAnnotForeignKey annotForeignKey, extension IFormattableDocument document) {
		annotForeignKey.regionFor.keyword("@foreign").prepend[newLine].append[oneSpace]
		annotForeignKey.regionFor.feature(ModelPackage.eINSTANCE.YAnnotForeignKey_Relationship).prepend[oneSpace].append [
			noSpace
		]
		annotForeignKey.regionFor.keyword("(").prepend[oneSpace].append[noSpace]
		annotForeignKey.regionFor.keyword(",").surround[noSpace]
		annotForeignKey.interior[].columns.forEach[name]
		annotForeignKey.regionFor.keyword(")").prepend[noSpace].append[noSpace]
		annotForeignKey.regionFor.keyword(";").prepend[noSpace]
	}

}
