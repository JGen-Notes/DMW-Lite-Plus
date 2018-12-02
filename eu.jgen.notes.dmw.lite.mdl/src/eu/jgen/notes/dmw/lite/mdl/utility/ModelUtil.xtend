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
package eu.jgen.notes.dmw.lite.mdl.utility

import com.google.common.base.CaseFormat

import java.util.List
import javax.inject.Inject
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.ModelFactory
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider
import org.eclipse.xtext.resource.IContainer
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage
import org.eclipse.xtext.resource.IEObjectDescription
import org.eclipse.xtext.EcoreUtil2
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EClass
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotBoolConstant
import org.eclipse.emf.common.util.EList
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotStringConstant
import eu.jgen.notes.dmw.lite.mdl.DMWRuntimeException
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotNumberConstant
import java.util.ArrayList
import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.LocalTime
import java.text.SimpleDateFormat
import java.text.ParseException
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotKeyword

class ModelUtil {

	public val KW_DERBY = "Derby"
	public val KW_MYSQL = "MySQL"
	public val KW_SQLITE = "SQLite"
	public val KW_POSTGRESQL = "PostgreSQL"
	public val KW_MONGODB = "MongoDB"
	
	public val KW_INT = "Int"
	public val KW_SHORT = "Short"
	public val KW_LONG = "Long"
	public val KW_DOUBLE = "Double"
	public val KW_STRING = "String"
	public val KW_DATE = "Date"
	public val KW_TIME = "Time"
	public val KW_TIMESTAMP = "Timestamp"
	public val KW_BLOB = "Blob"	
	public val KW_BOOL = "Bool"

	
	public val KWUP_INT = "INTEGER"
	public val KWUP_SMALLINT = "SMALLINT"
	public val KWUP_DECIMAL = "DECIMAL"
	public val KWUP_CHAR = "CHAR"
	public val KWUP_DATE = "DATE"
	public val KWUP_TIME = "TIME"
	public val KWUP_BIGINT = "INTEGER"
	public val KWUP_TIMESTAMP = "TIMESTAMP"
	public val KWUP_BLOB = "BLOB"	
	public val KWUP_BOOLEAN = "BOOLEAN"
	 
	
	public val KW_TYPE = "type"
	public val KW_LENGTH = "length"
	public val KW_DEFAULT = "default"
	public val KW_DECIMAL = "decimal"
	public val KW_FORMAT = "format"
	public val KW_FOREIGNKEY = "foreignkey"
	
	public val KW_OPTONAL = "?"
	
	public val DEFAULT_INT = 0
	public val DEFAULT_SHORT = 0
	public val DEFAULT_DECIMAL = 0.0
	
	public val FORMAT_TIMESTAMP = "yyyy.MM.dd.HH:mm:ss.nnn"
	public val FORMAT_TIME = "HH:mm:ss"
	public val FORMAT_DATE = "yyyy-MM-dd"
	
	@Inject ResourceDescriptionsProvider resourceDescriptionsProvider;
	@Inject IContainer.Manager containerManager;

	def String isIntFormatCorrect(String textValue, String textType) {
		try {
			val valueInt = Integer.parseUnsignedInt(textValue)
			if (valueInt < 1 || valueInt > 9) {
				return "Value of Int should in the range of 1 and 9."
			}
			return null
		} catch (NumberFormatException e) {
			return "Format " + textValue + " as Int is incorrect."
		}
	}

	def String isIntDefaultCorrect(String textValue) {
		try {
			Integer.parseInt(textValue)
			return null
		} catch (NumberFormatException e) {
			return "Default value format " + textValue + " as Int is incorrect."
		} 
	}

	def String isShortFormatCorrect(String textValue) {
		try {
			val valueInt = Short.parseShort(textValue)
			if (valueInt < 1 || valueInt > 4) {
				return "Value of Short should in the range of 1 and 4."
			}
			return null
		} catch (NumberFormatException e) {
			return "Format " + textValue + " as Short is incorrect."
		}
	}

	def String isDateFormatCorrect(String dateText, String formatText) {
		try {
			val format = new SimpleDateFormat(formatText);
			try {
				format.setLenient(false)
				format.parse(dateText);
				return null
			} catch (ParseException e) {
				return "Date " + dateText + " is not valid according to " + (format as SimpleDateFormat).toPattern() +
					" pattern."
			}

		} catch (IllegalArgumentException e) {
			return "Format " + formatText + ": " + e.message
		}
	}

	def String isTimeFormatCorrect(String timeText, String formatText) {
		try {
			val format = SimpleDateFormat.getTimeInstance()
			try {
				format.setLenient(false)
				format.parse(timeText);
				return null
			} catch (ParseException e) {
				return "Time " + timeText + " is not valid according to " + (format as SimpleDateFormat).toPattern() +
					" pattern."
			}

		} catch (IllegalArgumentException e) {
			return "Format " + formatText + ": " + e.message
		}
	}

	def String isTimestampFormatCorrect(String timestampText, String formatText) {
		try {
			val format = new SimpleDateFormat(timestampText)
			try {
				format.setLenient(false)
				format.parse(timestampText);
				return null
			} catch (ParseException e) {
				return "Timestamp " + timestampText + " is not valid according to " +
					(format as SimpleDateFormat).toPattern() + " pattern."
			}

		} catch (IllegalArgumentException e) {
			return "Format " + formatText + ": " + e.message
		}
	}

	def ArrayList<String> createProposalAnnotationList(YAnnotAttribute annotAttr) {
		val list = newArrayList()
		if (annotAttr.extractAttributeType == KW_INT) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				list.add("length=9")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DOUBLE)) {
				list.add("decimal=2")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				list.add("default=0")
			}
		}
		if (annotAttr.extractAttributeType == KW_SHORT) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				list.add("length=4")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DOUBLE)) {
				list.add("decimal=2")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				list.add("default=0")
			}
		}
		if (annotAttr.extractAttributeType == KW_DOUBLE) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				list.add("length=16")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DOUBLE)) {
				list.add("decimal=2")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				list.add("default=0")
			}
		}
		if (annotAttr.extractAttributeType == KW_STRING) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_LENGTH)) {
				list.add("length=20")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				list.add("default=\"\"")
			}
		}
		if (annotAttr.extractAttributeType == KW_DATE) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE)
				list.add("default=\"" + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE) + "\"")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				list.add("format=\"" + FORMAT_DATE + "\"")
			}
		}
		if (annotAttr.extractAttributeType == KW_TIME) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_TIME)
				list.add("default=\"" + LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME).substring(0, 8) + "\"")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				list.add("format=\"" + FORMAT_TIME + "\"")
			}
		}
		if (annotAttr.extractAttributeType == KW_TIMESTAMP) {
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_DEFAULT)) {
				LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)
				list.add(
					"default=\"" + LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "." +
						LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + "\"")
			}
			if (!annotAttr.elementValuePairs.isAnnotHavingSpecificName(KW_FORMAT)) {
				list.add("format=\"" + FORMAT_TIMESTAMP + "\"")
			}
		}
		return list
	}

	def YAnnotationElementValuePair findUnsupportedAnnotation(YAnnotAttribute annotAttr) {
		if (annotAttr.extractAttributeType == KW_INT) {
			for (pair : annotAttr.elementValuePairs) {
				if (pair.name == KW_LENGTH && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_DOUBLE && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_DEFAULT && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_TYPE && pair.value instanceof YAnnotKeyword) {
				} else {
					return pair
				}
			}
			return null
		}
		if (annotAttr.extractAttributeType == KW_SHORT) {
			for (pair : annotAttr.elementValuePairs) {
				if (pair.name == KW_LENGTH && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_DOUBLE && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_DEFAULT && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_TYPE && pair.value instanceof YAnnotKeyword) {
				} else {
					return pair
				}
			}
			return null
		}
		if (annotAttr.extractAttributeType == KW_STRING) {
			for (pair : annotAttr.elementValuePairs) {
				if (pair.name == KW_LENGTH && pair.value instanceof YAnnotNumberConstant) {
				} else if (pair.name == KW_DEFAULT && pair.value instanceof YAnnotStringConstant) {
				} else if (pair.name == KW_TYPE && pair.value instanceof YAnnotKeyword) {
				} else {
					return pair
				}
			}
			return null
		}
		if (annotAttr.extractAttributeType == KW_DATE) {
			for (pair : annotAttr.elementValuePairs) {
				if (pair.name == KW_FORMAT && pair.value instanceof YAnnotStringConstant) {
				} else if (pair.name == KW_DEFAULT && pair.value instanceof YAnnotStringConstant) {
				} else if (pair.name == KW_TYPE && pair.value instanceof YAnnotKeyword) {
				} else {
					return pair
				}
			}
			return null
		}
	}

	def boolean isForeignKeyDesignated(YAnnotRelationship relationship) {
		if (relationship.elementValuePairs.isAnnotHavingSpecificName("foreignkey")) {
			return relationship.elementValuePairs.extractAnnotValueBoolean("foreignkey")
		}
		false // This is a default value.
	}

	def boolean extractAnnotValueBoolean(EList<YAnnotationElementValuePair> list, String name) {
		for (pair : list) {
			if (pair.name == name) {
				if (pair.value instanceof YAnnotBoolConstant) {
					val value = pair.value as YAnnotBoolConstant
					if (value.value == "true") {
						return true
					} else {
						return false
					}
				}
			}
		}
		throw new DMWRuntimeException("Cannot extract value because of not existent annotation pair")
	}

	def String extractAnnotValueString(EList<YAnnotationElementValuePair> list, String name) {
		for (pair : list) {
			if (pair.name == name) {
				if (pair.value instanceof YAnnotStringConstant) {
					val value = pair.value as YAnnotStringConstant
					return value.value
				}
			}
		}
		throw new DMWRuntimeException("Cannot extract value because of not existent annotation pair")
	}

	def String extractAnnotValueNumber(EList<YAnnotationElementValuePair> list, String name) {
		for (pair : list) {
			if (pair.name == name) {
				if (pair.value instanceof YAnnotNumberConstant) {
					val value = pair.value as YAnnotNumberConstant
					return value.value
				}
			}
		}
		throw new DMWRuntimeException("Cannot extract value because of not existent annotation pair")
	}

	def String extractAnnotValueKeyword(EList<YAnnotationElementValuePair> list, String name) {
		for (pair : list) {
			if (pair.name == name) {
				if (pair.value instanceof YAnnotKeyword) {
					val value = pair.value as YAnnotKeyword
					return value.value
				}
			}
		}
		throw new DMWRuntimeException("Cannot extract value because of not existent annotation pair")
	}

	def boolean isAnnotHavingSpecificName(EList<YAnnotationElementValuePair> list, String name) {
		for (annotationElementValuePair : list) {
			if (annotationElementValuePair.name == name) {
				return true
			}
		}
		return false
	}

	def YAnnotationElementValuePair getPairHavingSpecificName(EList<YAnnotationElementValuePair> list, String name) {
		for (annotationElementValuePair : list) {
			return annotationElementValuePair
		}
		throw new DMWRuntimeException("Cannot extract pair because of not existent annotation pair")
	}

	def String getColumnName(YAnnotColumn column) {
		(column.eContainer as YAnnotAbstractColumn).name
	}

	def String getColumnTypeName(YAnnotAbstractColumn abstractColumn) {
		if (abstractColumn.type instanceof YAnnotColumn) {
			return (abstractColumn.type as YAnnotColumn).type
		}
		// TODO like
		"yet unknown"
	}

//	def int getColumnLength(YAnnotAbstractColumn abstractColumn) {
//		if (abstractColumn.type instanceof YAnnotColumn) {
//			return (abstractColumn.type as YAnnotColumn).extractLength
//		}
//		// TODO like
//		0
//	}
	def boolean isColumnOptional(YAnnotAbstractColumn abstractColumn) {
		if (abstractColumn.type instanceof YAnnotColumn) {
			val column = abstractColumn.type as YAnnotColumn
			if (column.optional === null) {
				return false
			} else if (column.optional == KW_OPTONAL) {
				return true
			}
		}
		// TODO like
		false
	}

	def int getColumnDecimal(YAnnotAbstractColumn abstractColumn) {
		if (abstractColumn.type instanceof YAnnotColumn) {
			return (abstractColumn.type as YAnnotColumn).extractDecimal
		}
		0
	}

	def YAnnotAbstractColumn converAttributeIntoAbstractColumn(YAnnotAttribute attribute) {
		val abstractColumn = ModelFactory.eINSTANCE.createYAnnotAbstractColumn => [
			name = attribute.name.convertToTechnicalDesignName
			val column = ModelFactory.eINSTANCE.createYAnnotColumn => [
				attrref = attribute
			]
			type = column
			doSelectColumnProperties(column, attribute)
		]
		return abstractColumn
	}

	def private void doSelectColumnProperties(YAnnotColumn column, YAnnotAttribute attribute) {
		// Set default values in case annotation does not exist.
		if (attribute.extractAttributeType == KW_STRING) {
			column.type = KW_OPTONAL
		} else if (attribute.extractAttributeType == KW_STRING) {
			column.type = KW_OPTONAL
		} else if (attribute.extractAttributeType == KW_SHORT) {
			column.type = KWUP_SMALLINT
		} else if (attribute.extractAttributeType == KW_INT) {
			column.type = KWUP_INT
		} else if (attribute.extractAttributeType == KW_LONG) {
			column.type = KWUP_BIGINT
		} else if (attribute.extractAttributeType == KW_DOUBLE) {
			column.type = KWUP_DECIMAL
		} else if (attribute.extractAttributeType == KW_DATE) {
			column.type = KWUP_DECIMAL
		} else if (attribute.extractAttributeType == KW_TIME) {
			column.type = KWUP_TIME
		} else if (attribute.extractAttributeType == KW_TIMESTAMP) {
			column.type = KWUP_TIMESTAMP
		} else if (attribute.extractAttributeType == KW_BOOL) {
			column.type = KWUP_BOOLEAN
		} else if (attribute.extractAttributeType == KW_BLOB) {
			column.type = KWUP_BLOB
		}
		// TODO need to check this
		if (attribute.optional !== null && attribute.optional == KW_OPTONAL) {
			column.optional = KW_OPTONAL
		}
	}

	def YAnnotTable converEntityIntoTable(YAnnotEntity entity) {
		val table = ModelFactory.eINSTANCE.createYAnnotTable => [
			name = entity.name.convertToTechnicalDesignName
			entityref = entity
		]
		return table
	}

	def YAnnotForeignKey converRelationshipIntoForeignKeys(YAnnotRelationship relationship) {
		doCreateForeignKeyForRelationship(relationship, relationship.inverse)
	}

	def private YAnnotForeignKey doCreateForeignKeyForRelationship(YAnnotRelationship thisrelationship,
		YAnnotRelationship targetRelationship) {
		val foreignKey = ModelFactory.eINSTANCE.createYAnnotForeignKey => [
			val list = doConvertRelationshipIntoFKColumns(targetRelationship)
			for (abstractColumn : list) {
				columns.add(abstractColumn)
			}
			relationship = thisrelationship
		]
		return foreignKey
	}

	def private List<YAnnotAbstractColumn> doConvertRelationshipIntoFKColumns(YAnnotRelationship relationship) {
		val list = newArrayList()
		val parentEntity = relationship.eContainer as YAnnotEntity
		val parentTable = parentEntity.getImplementingTable
		if (parentTable === null || parentTable.primarykey === null) {
			return list
		}
		for (abstractColumn : parentTable.primarykey.columns) {
			val newAbstractColumn = ModelFactory.eINSTANCE.createYAnnotAbstractColumn => [
				name = "FK_" + parentTable.name + "__" + abstractColumn.name
				val annotColumnLike = ModelFactory.eINSTANCE.createYAnnotColumnLike => [
					// TODO need testing 
					columnref = abstractColumn
				]
				type = annotColumnLike
			]
			list.add(newAbstractColumn)
		}
		return list
	}

	def YAnnotPrimaryKey converIdentifierIntoPrimaryKey(YAnnotIdentifier identifier) {
		val primaryKey = ModelFactory.eINSTANCE.createYAnnotPrimaryKey => [
			val list = doConvertIdentifierIntoColumns(identifier)
			for (abstarctColumn : list) {
				columns.add(abstarctColumn)
			}

		]
		return primaryKey
	}

	def private List<YAnnotAbstractColumn> doConvertIdentifierIntoColumns(YAnnotIdentifier identifier) {
		val List<YAnnotAbstractColumn> list = newArrayList()
		for (identifierPart : identifier.annots) {
			if (identifierPart instanceof YAnnotAttribute) {
				val attribute = (identifierPart as YAnnotAttribute)
				val parentTable = (attribute.eContainer as YAnnotEntity).getImplementingTable
				for (abstractColumn : parentTable.columns) {
					if (abstractColumn.type instanceof YAnnotColumn) {
						val column = abstractColumn.type as YAnnotColumn
						if (column.attrref == attribute) {
							list.add(abstractColumn)
						}
					}
				}
			} else if (identifierPart instanceof YAnnotRelationship) {
				val relationship = (identifierPart as YAnnotRelationship)
				val parentTable = (relationship.eContainer as YAnnotEntity).getImplementingTable
				for (foreignKey : parentTable.foreignkeys) {
					if (foreignKey.relationship == relationship) {
						for (abstractColumn : foreignKey.columns) {
							if (abstractColumn.type instanceof YAnnotColumnLike) {
								list.add(abstractColumn)
							}
						}
					}
				}
			}
		}
		return list
	}

	def String convertToTechnicalDesignName(String name) {
		CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name)
	}

	def int extractLength(EList<YAnnotationElementValuePair> list, String name) {
		if (list.isAnnotHavingSpecificName(name)) {
			val lengthText = list.extractAnnotValueNumber(name)
		}
		return 0
	}

	def String extractAttributeType(YAnnotAttribute annotAttribute) {
		if (annotAttribute.elementValuePairs.isAnnotHavingSpecificName(KW_TYPE)) {
			return annotAttribute.elementValuePairs.extractAnnotValueKeyword(KW_TYPE)
		}
		return KW_STRING
	}

	def int extractDecimal(YAnnotColumn column) {

		return 0
	}

	def String getImplementingColumnName(YAnnotTable table, String name) {
		for (annotAbstractColumn : table.columns) {
			if (annotAbstractColumn.type instanceof YAnnotColumn) {
				if ((annotAbstractColumn.type as YAnnotColumn).attrref.name == name) {
					return annotAbstractColumn.name
				}
			} else {

				// need to review
				if ((((annotAbstractColumn.type as YAnnotColumnLike).columnref.type) as YAnnotAbstractColumn).name ==
					name) {
					return (((annotAbstractColumn.type as YAnnotColumnLike).columnref.type) as YAnnotAbstractColumn).
						name
				}
				return (((annotAbstractColumn.type as YAnnotColumnLike).columnref.type) as YAnnotAbstractColumn).name
			}
		}
		return ""
	}

	def YAnnotTable getImplementingTable(YAnnotEntity entity) {
		val entityName = entity.name
		var resourceDescriptions = resourceDescriptionsProvider.getResourceDescriptions(entity.eResource());
		var resourceDescription = resourceDescriptions.getResourceDescription(entity.eResource().getURI());
		for (IContainer c : containerManager.getVisibleContainers(resourceDescription, resourceDescriptions)) {
			for (IEObjectDescription objectDescription : c.getExportedObjectsByType(
				ModelPackage.Literals.YANNOT_TABLE)) {
				if (objectDescription.getEObjectOrProxy instanceof YAnnotTable) {
					var table = objectDescription.getEObjectOrProxy as YAnnotTable
					if (table.eIsProxy) {
						table = entity.eResource.resourceSet.getEObject(objectDescription.getEObjectURI,
							true) as YAnnotTable
					}
					if (table.entityref !== null && table.entityref.name == entityName) {
						return table
					}
				}
			}
		}
		return null
	}

	def boolean isTechnicalDesign(EObject context) {
		for (element : EcoreUtil2.getResourceSet(EcoreUtil2.getRoot(context, true)).allContents.toList) {
			if (element instanceof YAnnotTechnicalDesign) {
				return true
			}
		}
		return false
	}

	def boolean isAttributeImplemented(YAnnotTable table, YAnnotAttribute attribute) {
		for (abstractColumn : table.columns) {
			if (abstractColumn.type instanceof YAnnotColumn) {
				val column = abstractColumn.type as YAnnotColumn
				if (column.attrref.name == attribute.name) {
					return true
				}
			}
		}
		return false
	}

	def YAnnotTechnicalDesign getTechnicalDesign(EObject context, EClass clazz) {
		for (element : EcoreUtil2.getResourceSet(EcoreUtil2.getRoot(context, true)).allContents.toList) {
			if (element instanceof YAnnotTechnicalDesign) {
				return element
			}
		}
		return null
	}

	def boolean isInverseRelationshipDefinedInTarget(YAnnotRelationship annotRel) {

		return false
	}

	def boolean isTypeCompatibleWithDefault(YAnnotAttribute annotAttr) {

		return true
	}

}
