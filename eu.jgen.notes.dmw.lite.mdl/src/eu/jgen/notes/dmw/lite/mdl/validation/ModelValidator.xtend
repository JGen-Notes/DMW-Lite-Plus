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
package eu.jgen.notes.dmw.lite.mdl.validation

import com.google.common.collect.HashMultimap
import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import eu.jgen.notes.dmw.lite.mdl.model.YModel
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.validation.Check
import org.eclipse.xtext.validation.CheckType
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign

class ModelValidator extends AbstractModelValidator {

	protected static val ISSUE_CODE_PREFIX = " eu.jgen.notes.dmw.lite."
	public static val DUPLICATE_ELEMENT = ISSUE_CODE_PREFIX + "DuplicateElement"
	public static val UNSUPPORTED_DATABASE = ISSUE_CODE_PREFIX + "UnsupportedDatabase"
	public static val MISSING_INVERSE_REALTIONSHIP = ISSUE_CODE_PREFIX + "MissingInverseRelationship"
	public static val DUPLICATE_ENTITY = ISSUE_CODE_PREFIX + "DuplicateEntity"
	public static val ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL = ISSUE_CODE_PREFIX + "EntityNameFirstCharacterNotCapital"
	public static val ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE = ISSUE_CODE_PREFIX +
		"AttributeNameFirstCharacterNotLowercase"
	public static val RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE = ISSUE_CODE_PREFIX +
		"RelationshipNameFirstCharacterNotLowercase"
	public static val IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE = ISSUE_CODE_PREFIX +
		"IdentifierNameFirstCharacterNotLowercase"
	public static val ATTRIBUTE_NO_TECH_DESIGN = ISSUE_CODE_PREFIX + "AttributeNoTechDesign"
	public static val ENTITY_NO_TECH_DESIGN = ISSUE_CODE_PREFIX + "EntityNoTechDesign"
	public static val TABLE_DOES_NOT_HAVE_COLUMNS = ISSUE_CODE_PREFIX + "TableDoesNotHaveColumns"
	public static val COLUMN_NAME_NOT_UNIQUE = ISSUE_CODE_PREFIX + "ColumnNameNotUnique"
	public static val RELATIONSSHIP_NOT_IMPLEMENTED = ISSUE_CODE_PREFIX + "RelationshipNotImplemented"
	public static val IDENTIFIER_NO_TECH_DESIGN = ISSUE_CODE_PREFIX + "IdentifgierNoTechDesign"
	public static val NO_DESGNATED_FOREIGNKEY = ISSUE_CODE_PREFIX + "NoDesignatedForeignKey"
	public static val INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF = ISSUE_CODE_PREFIX + "MatchingInverseCannotMatchItself"
	public static val WRONGLY_DESGNATED_FOREIGNKEY = ISSUE_CODE_PREFIX + "WronglyDesignatedForeignKey"
	public static val MANY_TO_MANY_NOT_SUPPORTED = ISSUE_CODE_PREFIX + "ManyToManyNotSuported"
	public static val ONE_TO_ONE_MANDATORY_NOT_SUPPORTED = ISSUE_CODE_PREFIX + "OneToOneMandatoryNotSuported"
	public static val ANNOATION_NOT_SUPPORTED = ISSUE_CODE_PREFIX + "AnnotationNotSuported"
	public static val ANNOATION_VALUE_HAS_WRONG_VALUE = ISSUE_CODE_PREFIX + "AnnotationValueWrongFormat"
	public static val ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE = "The declared attribute type does not match column type"

	@Inject extension ModelUtil
	@Inject extension ModelIndex
	@Inject extension IQualifiedNameProvider

	@Check
	def void checkAttributeColumnTypeMatching(YAnnotAttribute annotAttribute) {
		if (annotAttribute.isAttributeImplemented) {
			val annotColumn = annotAttribute.attributeImplementation
			if (areTypesCompatible(annotColumn.type,
				annotAttribute.elementValuePairs.extractAnnotValueKeyword(KW_TYPE))) {
				return
			} else {
				warning("The declared attribute type does not match column type", annotAttribute,
					ModelPackage.Literals.YANNOT_ATTRIBUTE__NAME, ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE)
			}
		}
	}

	@Check
	def void checkColumnAttributeTypeMatching(YAnnotColumn annotColumn) {
		val annotAttribute = annotColumn.attrref
			if (areTypesCompatible(annotColumn.type,
				annotAttribute.elementValuePairs.extractAnnotValueKeyword(KW_TYPE))) {
				return
			} else {
				warning("The declared attribute type does not match column type", annotColumn,
					ModelPackage.Literals.YANNOT_COLUMN__TYPE, ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE)
			}		
	}

	@Check
	def void checkTechnicalDesignAnnotations(YAnnotTechnicalDesign technicalDesign) {
		if (technicalDesign.elementValuePairs.size == 0) {
			return
		}
		val pair = technicalDesign.findUnsupportedAnnotation
		if (pair === null) {
			return
		} else {
			error("This annotation is not supported in this context.", pair,
				ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_NOT_SUPPORTED);
		}
	}

	@Check
	def void checkAttributeAnnotations(YAnnotAttribute annotAttr) {
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		val pair = annotAttr.findUnsupportedAnnotation
		if (pair === null) {
			return
		} else {
			error("This annotation is not supported in this context.", pair,
				ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_NOT_SUPPORTED);
		}
	}

	@Check
	def void checkAttributeAnnotationsForInt(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType !== null && annotAttr.extractAttributeType != KW_INT) {
			return
		}
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				val valueText = annotAttr.elementValuePairs.extractAnnotValueNumber(KW_LENGTH)
				val message = valueText.isIntFormatCorrect(annotAttr.extractAttributeType)
				if (message !== null) {
					error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_LENGTH),
						ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
				}
			}
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				val valueText = annotAttr.elementValuePairs.extractAnnotValueNumber(KW_DEFAULT)
				val message = valueText.isIntDefaultCorrect
				if (message !== null) {
					error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_DEFAULT),
						ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
				}
			}
		}
	}

	@Check
	def void checkAttributeAnnotationsForShort(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType !== null && annotAttr.extractAttributeType != KW_SHORT) {
			return
		}
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				val valueText = annotAttr.elementValuePairs.extractAnnotValueNumber(KW_LENGTH)
				val message = valueText.isShortFormatCorrect
				if (message === null) {
					return
				} else {
					error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_LENGTH),
						ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
				}
			}
		}
	}

	@Check
	def void checkAttributeAnnotationsForDate(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType !== null && annotAttr.extractAttributeType != KW_DATE) {
			return
		}
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
			val dateText = annotAttr.elementValuePairs.extractAnnotValueString(KW_DEFAULT);
			var formatText = FORMAT_DATE
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				formatText = annotAttr.elementValuePairs.extractAnnotValueString(KW_FORMAT)
			}
			val message = dateText.isDateFormatCorrect(formatText)
			if (message !== null) {
				error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_DEFAULT),
					ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
			}
		}
	}

	@Check
	def void checkAttributeAnnotationsForTime(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType !== null && annotAttr.extractAttributeType != KW_TIME) {
			return
		}
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
			val timestampText = annotAttr.elementValuePairs.extractAnnotValueString(KW_DEFAULT);
			var formatText = FORMAT_TIME
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				formatText = annotAttr.elementValuePairs.extractAnnotValueString(KW_FORMAT)
			}
			val message = timestampText.isTimeFormatCorrect(formatText)
			if (message !== null) {
				error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_DEFAULT),
					ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
			}
		}
	}

	@Check
	def void checkAttributeAnnotationsForTimestamp(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType !== null && annotAttr.extractAttributeType != KW_TIMESTAMP) {
			return
		}
		if (annotAttr.elementValuePairs.size == 0) {
			return
		}
		if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
			val timeText = annotAttr.elementValuePairs.extractAnnotValueString(KW_DEFAULT);
			var formatText = FORMAT_TIMESTAMP
			if (annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				formatText = annotAttr.elementValuePairs.extractAnnotValueString(KW_FORMAT)
			}
			val message = timeText.isTimestampFormatCorrect(formatText)
			if (message !== null) {
				error(message, annotAttr.elementValuePairs.getPairHavingSpecificName(KW_DEFAULT),
					ModelPackage.eINSTANCE.YAnnotationElementValuePair_Name, ANNOATION_VALUE_HAS_WRONG_VALUE);
			}
		}
	}

	/*********************************************************
	 * Validate Entities, Attributes, Identifiers and Relationships
	 ********************************************************/
	@Check
	def void checkEntityNameStartsWithCapital(YAnnotEntity annotEntity) {
		if (annotEntity.name.toFirstUpper != annotEntity.name) {
			error("Entity name should start with a capital letter", annotEntity,
				ModelPackage.eINSTANCE.YAnnotation_Name, ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL);
		}
	}

	@Check
	def void checkAttributeNameStartsWithLowecase(YAnnotAttribute annotAttr) {
		if (annotAttr.name.toFirstLower != annotAttr.name) {
			error("Attribute name should start with a lower case letter", annotAttr,
				ModelPackage.eINSTANCE.YAnnotAttribute_Name, ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
		}
	}

	@Check
	def void checkIdentifierNameStartsWithLowecase(YAnnotIdentifier annotIdentifier) {
		if (annotIdentifier.name.toFirstLower != annotIdentifier.name) {
			error("Identifier name should start with a lower case letter", annotIdentifier,
				ModelPackage.eINSTANCE.YAnnotIdentifier_Name, IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
		}
	}

	@Check
	def void checkRelationshipNameStartsWithLowecase(YAnnotRelationship annotRelationship) {
		if (annotRelationship.name.toFirstLower != annotRelationship.name) {
			error("Relationship name should start with a lower case letter", annotRelationship,
				ModelPackage.eINSTANCE.YAnnotRelationship_Name, RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
		}
	}

	@Check def void checkNoDuplicateEntities(YModel model) {
		val multiMap = HashMultimap.create()
		for (annotEntity : model.annotations.filter[it instanceof YAnnotEntity]) {
			multiMap.put((annotEntity as YAnnotEntity).name, annotEntity)
		}
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (d : duplicates)
					error("Duplicate " + "entity" + " '" + (d as YAnnotEntity).name + "'", d,
						ModelPackage.eINSTANCE.YAnnotation_Name, DUPLICATE_ELEMENT)
			}
		}
	}

	// perform this check only on file save
	@Check(CheckType.NORMAL)
	def checkDuplicateEntitiesAcrossFiles(YModel model) {
		val externalEntities = model.getVisibleExternalEntitiesDescriptions
		for (annotation : model.annotations) {
			if (annotation instanceof YAnnotEntity) {
				val annotEntity = annotation as YAnnotEntity
				val annotName = annotEntity.fullyQualifiedName
				if (externalEntities.containsKey(annotName)) {
					error("The entity " + annotName + " is already defined", annotation,
						ModelPackage.eINSTANCE.YAnnotation_Name, DUPLICATE_ENTITY)
				}
			}
		}
	}

	@Check
	def void checkNoDuplicateAttributes(YAnnotEntity annotEntity) {
		val multiMap = HashMultimap.create()
		for (annotEntityInner : annotEntity.annotations) {
			if (annotEntityInner instanceof YAnnotAttribute) {
				multiMap.put((annotEntityInner as YAnnotAttribute).name, annotEntityInner)
			}
		}
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (duplicate : duplicates)
					error("Duplicate " + "attribute" + " '" + (duplicate as YAnnotAttribute).name + "'", duplicate,
						ModelPackage.eINSTANCE.YAnnotAttribute_Name, DUPLICATE_ELEMENT)
			}
		}
	}

	@Check
	def void checkNoDuplicateIdentifiers(YAnnotEntity annotEntity) {
		val multiMap = HashMultimap.create()
		for (annotEntityInner : annotEntity.annotations) {
			if (annotEntityInner instanceof YAnnotIdentifier) {
				multiMap.put((annotEntityInner as YAnnotIdentifier).name, annotEntityInner)
			}
		}
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (duplicate : duplicates)
					error("Duplicate " + "identifier" + " '" + (duplicate as YAnnotIdentifier).name + "'", duplicate,
						ModelPackage.eINSTANCE.YAnnotIdentifier_Name, DUPLICATE_ELEMENT)
			}
		}
	}

	@Check
	def void checkNoDuplicateRelationship(YAnnotEntity annotEntity) {
		val multiMap = HashMultimap.create()
		for (annotEntityInner : annotEntity.annotations) {
			if (annotEntityInner instanceof YAnnotRelationship) {
				multiMap.put((annotEntityInner as YAnnotRelationship).name +
					(annotEntityInner as YAnnotRelationship).target.name, annotEntityInner)
			}
		}
		for (entry : multiMap.asMap.entrySet) {
			val duplicates = entry.value
			if (duplicates.size > 1) {
				for (duplicate : duplicates)
					error("Duplicate " + "relationship" + " '" + (duplicate as YAnnotRelationship).name + "'",
						duplicate, ModelPackage.eINSTANCE.YAnnotRelationship_Name, DUPLICATE_ELEMENT)
			}
		}
	}

	@Check
	def void checkInverseRelationship(YAnnotEntity annotEntity) {
		for (annotEntityInner : annotEntity.annotations) {
			if (annotEntityInner instanceof YAnnotRelationship) {
				doCheckRelationshipCorrectness(annotEntityInner as YAnnotRelationship)
			}
		}
	}

	/*
	 * Check if there is technical design and issue warning in case technical 
	 * design is defined and there is no table implementing entity type.
	 */
	@Check
	def void checkEntityImplemented(YAnnotEntity entity) {
		if (entity.isEntityImplemented) {
			return
		} else {
			warning("The declared entity is not yet implemented as table", entity,
				ModelPackage.Literals.YANNOTATION__NAME, ENTITY_NO_TECH_DESIGN)
		}
	}

	@Check
	def void checkAttributeHasTechDesign(YAnnotAttribute attribute) {
		val entity = attribute.eContainer as YAnnotEntity
		val table = getImplementingTable(entity)
		if (table === null) {
			return
		}
		for (YAnnotAbstractColumn abstractColumn : table.columns) {
			if (abstractColumn.type instanceof YAnnotColumn) {
				val column = abstractColumn.type as YAnnotColumn
				if (column.attrref.name == attribute.name) {
					return
				}
			}
		}
		warning("The declared attribute is not yet implemented as a column", attribute,
			ModelPackage.Literals.YANNOT_ATTRIBUTE__NAME, ATTRIBUTE_NO_TECH_DESIGN)
	}

	@Check
	def void checkTableIfComplete(YAnnotTable table) {
		var count = table.columns.size
		for (foreignKey : table.foreignkeys) {
			count += foreignKey.getColumns.size
		}
		if (count == 0) {
			error("Table does not have any columns.", table, ModelPackage.Literals.YANNOT_TABLE__NAME,
				TABLE_DOES_NOT_HAVE_COLUMNS);
			return
		}
	}

	@Check
	def void checkDuplicateColumnName(YAnnotColumn column) {
		var count = 0
		if (column.eContainer.eContainer instanceof YAnnotTable) {
			val table = column.eContainer.eContainer as YAnnotTable
			for (abstractColumn : table.columns) {
				if (abstractColumn.name == (column.eContainer as YAnnotAbstractColumn).name) {
					count++
				}
			}
		}
		if (column.eContainer.eContainer.eContainer instanceof YAnnotTable) {
			val table = column.eContainer.eContainer.eContainer as YAnnotTable
			for (foreignKey : table.foreignkeys) {
				for (abstractColumn : foreignKey.columns) {
					if (abstractColumn.name == (column.eContainer as YAnnotAbstractColumn).name) {
						count++
					}
				}
			}
		}
		if (count > 1) {
			error("Table column name is not unique.", column.eContainer,
				ModelPackage.Literals.YANNOT_ABSTRACT_COLUMN__NAME, ModelValidator.COLUMN_NAME_NOT_UNIQUE);
			return
		}
	}

	/*
	 * 
	 */
	@Check
	def void checkDuplicateFKColumnName(YAnnotColumnLike column) {
		var count = 0
		val table = column.eContainer.eContainer.eContainer as YAnnotTable
		for (abstractColumn : table.columns) {
			if (abstractColumn.name == (column.eContainer as YAnnotAbstractColumn).name) {
				count++
			}
		}
		for (foreignKey : table.foreignkeys) {
			for (abstractColumn : foreignKey.columns) {
				if (abstractColumn.name == (column.eContainer as YAnnotAbstractColumn).name) {
					count++
				}
			}
		}
		if (count > 1) {
			error("Table foreign key column name is not unique.", column.eContainer,
				ModelPackage.Literals.YANNOT_ABSTRACT_COLUMN__NAME, COLUMN_NAME_NOT_UNIQUE);
			return
		}
	}

	@Check
	def void checkIdentifierHasTechDesign(YAnnotIdentifier identifier) {
		if (isTechnicalDesign(identifier.eContainer as YAnnotEntity)) {
			val table = getImplementingTable(identifier.eContainer as YAnnotEntity)
			if (table.primarykey === null) {
				warning("The declared identifier is not yet implemented as primary key", identifier,
					ModelPackage.Literals.YANNOT_IDENTIFIER__NAME, IDENTIFIER_NO_TECH_DESIGN)
			}
		}
	}

	@Check
	def void checkRelationshipHasTechDesign(YAnnotRelationship relationship) {
		if (isTechnicalDesign(relationship.eContainer as YAnnotEntity)) {
			if (relationship.isMany) {
				return
			}
			if (relationship.inverse.isMany) {
				val table = getImplementingTable(relationship.eContainer as YAnnotEntity)
				if (table !== null) {
					for (foreignKey : table.foreignkeys) {
						if (foreignKey.relationship == relationship) {
							return
						}
					}
					warning("The declared relationship is not yet implemented as a foreign key", relationship,
						ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, RELATIONSSHIP_NOT_IMPLEMENTED)
				}
			}
		}
	}

	// TODO
	@Check
	def void checkRelationshipHasDesignatedForeignKey(YAnnotRelationship relationship) {
		if (!relationship.isMany && relationship.inverse !== null && !relationship.inverse.isMany) {
			// This is case when generator has to know where foreign key should be located.
			if (relationship.isForeignKeyDesignated && !relationship.inverse.isForeignKeyDesignated) {
				return
			}
			if (!relationship.isForeignKeyDesignated && relationship.inverse.isForeignKeyDesignated) {
				return
			}
			error("Relation pair (" + relationship.name + "," + relationship.inverse.name +
				") does not have designated foreign key.", relationship,
				ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, NO_DESGNATED_FOREIGNKEY);
		}
	}

	@Check
	def void checkRelationshipTypeManyHasCorrectForeignKeyDesignation1(YAnnotRelationship relationship) {
		if (relationship.isMany && relationship.inverse !== null && !relationship.inverse.isMany) {
			// This is case when relation is of type many and foreign key must be in correct side when many
			if ((relationship.elementValuePairs.isAnnotHavingSpecificName(KW_FOREIGNKEY) &&
				relationship.isForeignKeyDesignated) ||
				!relationship.elementValuePairs.isAnnotHavingSpecificName(KW_FOREIGNKEY)) {
				return
			}
			error("Relation pair (" + relationship.name + "," + relationship.inverse.name +
				") has wrongly designated foreign key.", relationship, ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME,
				WRONGLY_DESGNATED_FOREIGNKEY);
		}
	}

	@Check
	def void checkRelationshipTypeManyHasCorrectForeignKeyDesignation2(YAnnotRelationship relationship) {
		if (!relationship.isMany && relationship.inverse !== null && !relationship.inverse.isMany) {
			// This is case when relation is of type many and foreign key must be in correct side when many
			if (!relationship.elementValuePairs.isAnnotHavingSpecificName(KW_FOREIGNKEY) &&
				!relationship.inverse.elementValuePairs.isAnnotHavingSpecificName(KW_FOREIGNKEY)) {
				error("Relation pair (" + relationship.name + "," + relationship.inverse.name +
					") has wrongly designated foreign key.", relationship,
					ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, WRONGLY_DESGNATED_FOREIGNKEY);
			}
		}
	}

	@Check
	def void checkRelationshipTypeManyHasCorrectForeignKeyDesignation3(YAnnotRelationship relationship) {
		if (relationship.isMany && relationship.inverse !== null && !relationship.inverse.isMany) {
			// This is case when relation is of type many and foreign key must be in correct side when many
			if (relationship.inverse.elementValuePairs.isAnnotHavingSpecificName(KW_FOREIGNKEY)) {
				error("Relation pair (" + relationship.name + "," + relationship.inverse.name +
					") has wrongly designated foreign key.", relationship,
					ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, WRONGLY_DESGNATED_FOREIGNKEY);
			}
		}
	}

	@Check
	def doCheckRelationshipCorrectness(YAnnotRelationship forwardRel) {
		val backwardRel = forwardRel.inverse

		// Check if inverse defined.
		if (forwardRel.inverse === null) {
			error("Inverse relationship for this relationship not yet defined.", forwardRel,
				ModelPackage.eINSTANCE.YAnnotRelationship_Name, MISSING_INVERSE_REALTIONSHIP)
			return
		}

//TODO
		// Check if inverse relationship exists in target
//		if (!backwardRel.isInverseRelationshipDefinedInTarget) {
//			error("Inverse relationship does not exists in target entity.", backwardRel,
//				ModelPackage.eINSTANCE.YAnnotRelationship_Name, INVERSE_RELATIONSHIP_DOES_NOT_EXIST_IN_TAGET)
//			return
//		}
		// Check if matching to itself.
		if (forwardRel == backwardRel) {
			error("Matching Inverse relationship cannot be the same relationship.", forwardRel,
				ModelPackage.eINSTANCE.YAnnotRelationship_Name, ModelValidator.INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF)
			return
		}

		// Check if many-to-many
		if (forwardRel.many && backwardRel.many) {
			error("Many-to-many relationship type not supported yet.", forwardRel,
				ModelPackage.eINSTANCE.YAnnotRelationship_Name, MANY_TO_MANY_NOT_SUPPORTED)
			return
		}

		// Check if both  one-to-one and mandatory
		if (!forwardRel.many && !backwardRel.many && !forwardRel.optional && !backwardRel.optional) {
			error("A fully mandatory 1-to-1 relationship is unusual and supported.", forwardRel,
				ModelPackage.eINSTANCE.YAnnotRelationship_Name, ONE_TO_ONE_MANDATORY_NOT_SUPPORTED)
			return
		}
	}

}
