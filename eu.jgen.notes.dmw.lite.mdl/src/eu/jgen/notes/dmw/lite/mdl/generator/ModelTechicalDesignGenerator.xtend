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
package eu.jgen.notes.dmw.lite.mdl.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil

class ModelTechicalDesignGenerator implements IGenerator {
	
		@Inject extension ModelUtil

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.allContents.filter[element|element instanceof YAnnotTechnicalDesign].forEach [ element |
			val technicalDesign = element as YAnnotTechnicalDesign
			generateDDLForDerby(fsa, technicalDesign)
		]   
	}

//	protected def String generateDDLString(IFileSystemAccess fsa, YAnnotTechnicalDesign technicalDesign) {
//		'''			
//			«FOR table : technicalDesign.features»
//				«generateTables(table)»
//			«ENDFOR»
//		'''
//	}

	protected def void generateDDLForDerby(IFileSystemAccess fsa, YAnnotTechnicalDesign technicalDesign) {
		for (table : technicalDesign.features) {
			generateTableForDerby(fsa, table)
		}
	}

	def private void generateTableForDerby(IFileSystemAccess fsa, YAnnotTable table) {
		val text = '''
			CREATE TABLE "«table.name»" (
				«FOR abstractColumn : table.columns  SEPARATOR ',' »
					«generateColumnForDerby(abstractColumn)»
				«ENDFOR»
				«FOR foreignKey : table.foreignkeys BEFORE ',' SEPARATOR ',' »
					BEFORE ','«generateForeignKeyColumns(foreignKey)»
				«ENDFOR»
				«IF table.primarykey !== null»,«generatePrimaryKey(table)»«ENDIF»
			)
		'''
		fsa.generateFile(
			"derby/" + table.name + ".ddl",
			ModelOutputProvider.DDL,
			text
		)

	}

	def private String generateColumnForDerby(YAnnotAbstractColumn abstractColumn) {
		val text = '''
			"«abstractColumn.name.toUpperCase»" «generateColumnTypeForDerby(abstractColumn)»
		'''
		return text
	}

	def private String generateForeignKeyColumns(YAnnotForeignKey foreignKey) {
		val text = '''
			«FOR abstractColumn : foreignKey.columns»
				"«abstractColumn.name.toUpperCase»" «generateColumnTypeForDerby(abstractColumn)»
			«ENDFOR»					
		'''
		return text
	}

	def private String generateColumnTypeForDerby(YAnnotAbstractColumn abstractColumn) {
		if (abstractColumn.type instanceof YAnnotColumn) {
			val column = abstractColumn.type as YAnnotColumn
			val text = '''
				«column.type»«IF column.type == "CHAR" ||  column.type == "VARCHAR"»(«column.generateLengthForDerby»)«ENDIF» «column.generateNullFlag»
			'''
			return text
		} else {
			generateColumnTypeForDerby((abstractColumn.type as YAnnotColumnLike).columnref)
		}
	}

	def private String generateLengthForDerby(YAnnotColumn column) {
		//TODO 
		
		

		return ""
	}

	def private String generateNullFlag(YAnnotColumn column) {
		if (column.optional != "?") {
			return "NOT NULL"
		}
	}

	def private String generatePrimaryKey(YAnnotTable table) {
		val text = '''
			CONSTRAINT "«"PK_" + table.name»"
			PRIMARY KEY («FOR abstractColumn : table.primarykey.columns SEPARATOR ','»"«abstractColumn.name.toUpperCase»"«ENDFOR»)
		'''
		return text
	}

}
