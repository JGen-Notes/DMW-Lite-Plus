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
package eu.jgen.notes.dmw.lite.mdl.ui.quickfix

import com.google.inject.Inject
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

import eu.jgen.notes.dmw.lite.mdl.validation.ModelValidator
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil

class ModelQuickfixProvider extends DefaultQuickfixProvider {

	@Inject extension ModelUtil
	@Inject extension ModelIndex

	@Fix(ModelValidator.ENTITY_NO_TECH_DESIGN)
	def createTableForEntityType(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create missing table', 'Creates table implementing entity type.', 'table.gif') [ element, context |
			val technicalDesign = getTechnicalDesign(element, ModelPackage.Literals.YANNOT_TECHNICAL_DESIGN)
			val entity = element as YAnnotEntity
			technicalDesign.features.add(
				converEntityIntoTable(entity)
			)
		]
	}

	@Fix(ModelValidator.ATTRIBUTE_NO_TECH_DESIGN)
	def createColumnForAttributeType(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create missing column', 'Creates column implementing attribute type.', 'column.gif') [ element, context |
			if (element instanceof YAnnotAttribute) {
				val attribute = element as YAnnotAttribute
				val table = getImplementingTable(attribute.eContainer as YAnnotEntity)
				val abstractColumn = attribute.converAttributeIntoAbstractColumn
				table.columns.add(abstractColumn)
				table.eResource.save(null)
			}
		]
	}

	@Fix(ModelValidator.RELATIONSSHIP_NOT_IMPLEMENTED)
	def createFKColumnForAttributeType(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create missing foreign key', 'Adds foreign key column implementing relationship.',
			'relationship.png') [ element, context |
			if (element instanceof YAnnotRelationship) {
				val relationship = element as YAnnotRelationship
				val table = getImplementingTable(relationship.eContainer as YAnnotEntity)
				val foreignKey = relationship.converRelationshipIntoForeignKeys
				table.foreignkeys.add(foreignKey)
				table.eResource.save(null)
			}
		]
	}

	@Fix(ModelValidator.IDENTIFIER_NO_TECH_DESIGN)
	def createPrimaryKeyForIdentifier(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Create missing primary key', 'Creates primary key implementing identifier.',
			'identifier.gif') [ element, context |
			if (element instanceof YAnnotIdentifier) {
				val identifier = element as YAnnotIdentifier
				val table = getImplementingTable(identifier.eContainer as YAnnotEntity)
				val primaryKey = identifier.converIdentifierIntoPrimaryKey
				table.primarykey = primaryKey
				table.eResource.save(null)
			}
		]
	}

	@Fix(ModelValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL)
	def capitalizeEntityNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize first letter', "Capitalize first letter", 'entity.gif') [ element, context |
			element.visibleExternalEntitiesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstUpper)
			]
		]
	}

	@Fix(ModelValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercaseAttributeNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter",
			'attribute.gif') [ element, context |
			element.visibleExternalEntitiesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}

	@Fix(ModelValidator.RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercaseRelationshipNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter",
			'relationship.gif') [ element, context |
			element.visibleExternalEntitiesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}

	@Fix(ModelValidator.IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercaseIdentifierNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter",
			'identifier.gif') [ element, context |
			element.visibleExternalEntitiesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}

	@Fix(ModelValidator.TABLE_DOES_NOT_HAVE_COLUMNS)
	def addingColumnToTable(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Add all missing columns using list of attributes',
			"Add all missing columns using related list of attributes", 'column.gif') [ element, context |
			if (element instanceof YAnnotTable && (element as YAnnotTable).entityref !== null) {
				val table = element as YAnnotTable
				val list = (element as YAnnotTable).entityref.annotations
				list.forEach [ entityInner |
					if (entityInner instanceof YAnnotAttribute) {
						val attribute = entityInner as YAnnotAttribute
						val abstractColumn = attribute.converAttributeIntoAbstractColumn
						table.columns.add(abstractColumn)
					}
				]
			}
		]
	}

}
