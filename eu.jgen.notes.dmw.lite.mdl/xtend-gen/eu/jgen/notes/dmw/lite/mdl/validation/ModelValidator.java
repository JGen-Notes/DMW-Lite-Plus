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
package eu.jgen.notes.dmw.lite.mdl.validation;

import com.google.common.base.Objects;
import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
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
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.mdl.validation.AbstractModelValidator;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckType;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class ModelValidator extends AbstractModelValidator {
  protected final static String ISSUE_CODE_PREFIX = " eu.jgen.notes.dmw.lite.";
  
  public final static String DUPLICATE_ELEMENT = (ModelValidator.ISSUE_CODE_PREFIX + "DuplicateElement");
  
  public final static String UNSUPPORTED_DATABASE = (ModelValidator.ISSUE_CODE_PREFIX + "UnsupportedDatabase");
  
  public final static String MISSING_INVERSE_REALTIONSHIP = (ModelValidator.ISSUE_CODE_PREFIX + "MissingInverseRelationship");
  
  public final static String DUPLICATE_ENTITY = (ModelValidator.ISSUE_CODE_PREFIX + "DuplicateEntity");
  
  public final static String ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL = (ModelValidator.ISSUE_CODE_PREFIX + "EntityNameFirstCharacterNotCapital");
  
  public final static String ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (ModelValidator.ISSUE_CODE_PREFIX + 
    "AttributeNameFirstCharacterNotLowercase");
  
  public final static String RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (ModelValidator.ISSUE_CODE_PREFIX + 
    "RelationshipNameFirstCharacterNotLowercase");
  
  public final static String IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (ModelValidator.ISSUE_CODE_PREFIX + 
    "IdentifierNameFirstCharacterNotLowercase");
  
  public final static String ATTRIBUTE_NO_TECH_DESIGN = (ModelValidator.ISSUE_CODE_PREFIX + "AttributeNoTechDesign");
  
  public final static String ENTITY_NO_TECH_DESIGN = (ModelValidator.ISSUE_CODE_PREFIX + "EntityNoTechDesign");
  
  public final static String TABLE_DOES_NOT_HAVE_COLUMNS = (ModelValidator.ISSUE_CODE_PREFIX + "TableDoesNotHaveColumns");
  
  public final static String COLUMN_NAME_NOT_UNIQUE = (ModelValidator.ISSUE_CODE_PREFIX + "ColumnNameNotUnique");
  
  public final static String RELATIONSSHIP_NOT_IMPLEMENTED = (ModelValidator.ISSUE_CODE_PREFIX + "RelationshipNotImplemented");
  
  public final static String IDENTIFIER_NO_TECH_DESIGN = (ModelValidator.ISSUE_CODE_PREFIX + "IdentifgierNoTechDesign");
  
  public final static String NO_DESGNATED_FOREIGNKEY = (ModelValidator.ISSUE_CODE_PREFIX + "NoDesignatedForeignKey");
  
  public final static String INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF = (ModelValidator.ISSUE_CODE_PREFIX + "MatchingInverseCannotMatchItself");
  
  public final static String WRONGLY_DESGNATED_FOREIGNKEY = (ModelValidator.ISSUE_CODE_PREFIX + "WronglyDesignatedForeignKey");
  
  public final static String MANY_TO_MANY_NOT_SUPPORTED = (ModelValidator.ISSUE_CODE_PREFIX + "ManyToManyNotSuported");
  
  public final static String ONE_TO_ONE_MANDATORY_NOT_SUPPORTED = (ModelValidator.ISSUE_CODE_PREFIX + "OneToOneMandatoryNotSuported");
  
  public final static String ANNOATION_NOT_SUPPORTED = (ModelValidator.ISSUE_CODE_PREFIX + "AnnotationNotSuported");
  
  public final static String ANNOATION_VALUE_HAS_WRONG_VALUE = (ModelValidator.ISSUE_CODE_PREFIX + "AnnotationValueWrongFormat");
  
  public final static String ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE = "The declared attribute type does not match column type";
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  @Extension
  private ModelIndex _modelIndex;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  @Check
  public void checkAttributeColumnTypeMatching(final YAnnotAttribute annotAttribute) {
    boolean _isAttributeImplemented = this._modelUtil.isAttributeImplemented(annotAttribute);
    if (_isAttributeImplemented) {
      final YAnnotColumn annotColumn = this._modelUtil.getAttributeImplementation(annotAttribute);
      boolean _areTypesCompatible = this._modelUtil.areTypesCompatible(annotColumn.getType(), 
        this._modelUtil.extractAnnotValueKeyword(annotAttribute.getElementValuePairs(), this._modelUtil.KW_TYPE));
      if (_areTypesCompatible) {
        return;
      } else {
        this.warning("The declared attribute type does not match column type", annotAttribute, 
          ModelPackage.Literals.YANNOT_ATTRIBUTE__NAME, ModelValidator.ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE);
      }
    }
  }
  
  @Check
  public void checkColumnAttributeTypeMatching(final YAnnotColumn annotColumn) {
    final YAnnotAttribute annotAttribute = annotColumn.getAttrref();
    boolean _areTypesCompatible = this._modelUtil.areTypesCompatible(annotColumn.getType(), 
      this._modelUtil.extractAnnotValueKeyword(annotAttribute.getElementValuePairs(), this._modelUtil.KW_TYPE));
    if (_areTypesCompatible) {
      return;
    } else {
      this.warning("The declared attribute type does not match column type", annotColumn, 
        ModelPackage.Literals.YANNOT_COLUMN__TYPE, ModelValidator.ATTRIBUTE_TYPE_NOT_MATCH_COMUMN_TYPE);
    }
  }
  
  @Check
  public void checkTechnicalDesignAnnotations(final YAnnotTechnicalDesign technicalDesign) {
    int _size = technicalDesign.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    final YAnnotationElementValuePair pair = this._modelUtil.findUnsupportedAnnotation(technicalDesign);
    if ((pair == null)) {
      return;
    } else {
      this.error("This annotation is not supported in this context.", pair, 
        ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_NOT_SUPPORTED);
    }
  }
  
  @Check
  public void checkAttributeAnnotations(final YAnnotAttribute annotAttr) {
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    final YAnnotationElementValuePair pair = this._modelUtil.findUnsupportedAnnotation(annotAttr);
    if ((pair == null)) {
      return;
    } else {
      this.error("This annotation is not supported in this context.", pair, 
        ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_NOT_SUPPORTED);
    }
  }
  
  @Check
  public void checkAttributeAnnotationsForInt(final YAnnotAttribute annotAttr) {
    if (((this._modelUtil.extractAttributeType(annotAttr) != null) && (!Objects.equal(this._modelUtil.extractAttributeType(annotAttr), this._modelUtil.KW_INT)))) {
      return;
    }
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
    if (_isAnnotHavingSpecificName) {
      boolean _isAnnotHavingSpecificName_1 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
      if (_isAnnotHavingSpecificName_1) {
        final String valueText = this._modelUtil.extractAnnotValueNumber(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
        final String message = this._modelUtil.isIntFormatCorrect(valueText, this._modelUtil.extractAttributeType(annotAttr));
        if ((message != null)) {
          this.error(message, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH), 
            ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
        }
      }
    }
    boolean _isAnnotHavingSpecificName_2 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
    if (_isAnnotHavingSpecificName_2) {
      boolean _isAnnotHavingSpecificName_3 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
      if (_isAnnotHavingSpecificName_3) {
        final String valueText_1 = this._modelUtil.extractAnnotValueNumber(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
        final String message_1 = this._modelUtil.isIntDefaultCorrect(valueText_1);
        if ((message_1 != null)) {
          this.error(message_1, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT), 
            ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
        }
      }
    }
  }
  
  @Check
  public void checkAttributeAnnotationsForShort(final YAnnotAttribute annotAttr) {
    if (((this._modelUtil.extractAttributeType(annotAttr) != null) && (!Objects.equal(this._modelUtil.extractAttributeType(annotAttr), this._modelUtil.KW_SHORT)))) {
      return;
    }
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
    if (_isAnnotHavingSpecificName) {
      boolean _isAnnotHavingSpecificName_1 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
      if (_isAnnotHavingSpecificName_1) {
        final String valueText = this._modelUtil.extractAnnotValueNumber(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH);
        final String message = this._modelUtil.isShortFormatCorrect(valueText);
        if ((message == null)) {
          return;
        } else {
          this.error(message, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_LENGTH), 
            ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
        }
      }
    }
  }
  
  @Check
  public void checkAttributeAnnotationsForDate(final YAnnotAttribute annotAttr) {
    if (((this._modelUtil.extractAttributeType(annotAttr) != null) && (!Objects.equal(this._modelUtil.extractAttributeType(annotAttr), this._modelUtil.KW_DATE)))) {
      return;
    }
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
    if (_isAnnotHavingSpecificName) {
      final String dateText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
      String formatText = this._modelUtil.FORMAT_DATE;
      boolean _isAnnotHavingSpecificName_1 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      if (_isAnnotHavingSpecificName_1) {
        formatText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      }
      final String message = this._modelUtil.isDateFormatCorrect(dateText, formatText);
      if ((message != null)) {
        this.error(message, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT), 
          ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
      }
    }
  }
  
  @Check
  public void checkAttributeAnnotationsForTime(final YAnnotAttribute annotAttr) {
    if (((this._modelUtil.extractAttributeType(annotAttr) != null) && (!Objects.equal(this._modelUtil.extractAttributeType(annotAttr), this._modelUtil.KW_TIME)))) {
      return;
    }
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
    if (_isAnnotHavingSpecificName) {
      final String timestampText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
      String formatText = this._modelUtil.FORMAT_TIME;
      boolean _isAnnotHavingSpecificName_1 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      if (_isAnnotHavingSpecificName_1) {
        formatText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      }
      final String message = this._modelUtil.isTimeFormatCorrect(timestampText, formatText);
      if ((message != null)) {
        this.error(message, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT), 
          ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
      }
    }
  }
  
  @Check
  public void checkAttributeAnnotationsForTimestamp(final YAnnotAttribute annotAttr) {
    if (((this._modelUtil.extractAttributeType(annotAttr) != null) && (!Objects.equal(this._modelUtil.extractAttributeType(annotAttr), this._modelUtil.KW_TIMESTAMP)))) {
      return;
    }
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      return;
    }
    boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
    if (_isAnnotHavingSpecificName) {
      final String timeText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT);
      String formatText = this._modelUtil.FORMAT_TIMESTAMP;
      boolean _isAnnotHavingSpecificName_1 = this._modelUtil.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      if (_isAnnotHavingSpecificName_1) {
        formatText = this._modelUtil.extractAnnotValueString(annotAttr.getElementValuePairs(), this._modelUtil.KW_FORMAT);
      }
      final String message = this._modelUtil.isTimestampFormatCorrect(timeText, formatText);
      if ((message != null)) {
        this.error(message, this._modelUtil.getPairHavingSpecificName(annotAttr.getElementValuePairs(), this._modelUtil.KW_DEFAULT), 
          ModelPackage.eINSTANCE.getYAnnotationElementValuePair_Name(), ModelValidator.ANNOATION_VALUE_HAS_WRONG_VALUE);
      }
    }
  }
  
  /**
   * Validate Entities, Attributes, Identifiers and Relationships
   */
  @Check
  public void checkEntityNameStartsWithCapital(final YAnnotEntity annotEntity) {
    String _firstUpper = StringExtensions.toFirstUpper(annotEntity.getName());
    String _name = annotEntity.getName();
    boolean _notEquals = (!Objects.equal(_firstUpper, _name));
    if (_notEquals) {
      this.error("Entity name should start with a capital letter", annotEntity, 
        ModelPackage.eINSTANCE.getYAnnotation_Name(), ModelValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL);
    }
  }
  
  @Check
  public void checkAttributeNameStartsWithLowecase(final YAnnotAttribute annotAttr) {
    String _firstLower = StringExtensions.toFirstLower(annotAttr.getName());
    String _name = annotAttr.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Attribute name should start with a lower case letter", annotAttr, 
        ModelPackage.eINSTANCE.getYAnnotAttribute_Name(), ModelValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
  
  @Check
  public void checkIdentifierNameStartsWithLowecase(final YAnnotIdentifier annotIdentifier) {
    String _firstLower = StringExtensions.toFirstLower(annotIdentifier.getName());
    String _name = annotIdentifier.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Identifier name should start with a lower case letter", annotIdentifier, 
        ModelPackage.eINSTANCE.getYAnnotIdentifier_Name(), ModelValidator.IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
  
  @Check
  public void checkRelationshipNameStartsWithLowecase(final YAnnotRelationship annotRelationship) {
    String _firstLower = StringExtensions.toFirstLower(annotRelationship.getName());
    String _name = annotRelationship.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Relationship name should start with a lower case letter", annotRelationship, 
        ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
  
  @Check
  public void checkNoDuplicateEntities(final YModel model) {
    final HashMultimap<String, YAnnotation> multiMap = HashMultimap.<String, YAnnotation>create();
    final Function1<YAnnotation, Boolean> _function = (YAnnotation it) -> {
      return Boolean.valueOf((it instanceof YAnnotEntity));
    };
    Iterable<YAnnotation> _filter = IterableExtensions.<YAnnotation>filter(model.getAnnotations(), _function);
    for (final YAnnotation annotEntity : _filter) {
      multiMap.put(((YAnnotEntity) annotEntity).getName(), annotEntity);
    }
    Set<Map.Entry<String, Collection<YAnnotation>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<YAnnotation>> entry : _entrySet) {
      {
        final Collection<YAnnotation> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final YAnnotation d : duplicates) {
            String _name = ((YAnnotEntity) d).getName();
            String _plus = ((("Duplicate " + "entity") + " \'") + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, d, 
              ModelPackage.eINSTANCE.getYAnnotation_Name(), ModelValidator.DUPLICATE_ELEMENT);
          }
        }
      }
    }
  }
  
  @Check(CheckType.NORMAL)
  public void checkDuplicateEntitiesAcrossFiles(final YModel model) {
    final Map<QualifiedName, IEObjectDescription> externalEntities = this._modelIndex.getVisibleExternalEntitiesDescriptions(model);
    EList<YAnnotation> _annotations = model.getAnnotations();
    for (final YAnnotation annotation : _annotations) {
      if ((annotation instanceof YAnnotEntity)) {
        final YAnnotEntity annotEntity = ((YAnnotEntity) annotation);
        final QualifiedName annotName = this._iQualifiedNameProvider.getFullyQualifiedName(annotEntity);
        boolean _containsKey = externalEntities.containsKey(annotName);
        if (_containsKey) {
          this.error((("The entity " + annotName) + " is already defined"), annotation, 
            ModelPackage.eINSTANCE.getYAnnotation_Name(), ModelValidator.DUPLICATE_ENTITY);
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateAttributes(final YAnnotEntity annotEntity) {
    final HashMultimap<String, YAnnotAttribute> multiMap = HashMultimap.<String, YAnnotAttribute>create();
    EList<YAnnotEntityInner> _annotations = annotEntity.getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotAttribute)) {
        multiMap.put(((YAnnotAttribute) annotEntityInner).getName(), ((YAnnotAttribute)annotEntityInner));
      }
    }
    Set<Map.Entry<String, Collection<YAnnotAttribute>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<YAnnotAttribute>> entry : _entrySet) {
      {
        final Collection<YAnnotAttribute> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final YAnnotAttribute duplicate : duplicates) {
            String _name = ((YAnnotAttribute) duplicate).getName();
            String _plus = ((("Duplicate " + "attribute") + " \'") + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, duplicate, 
              ModelPackage.eINSTANCE.getYAnnotAttribute_Name(), ModelValidator.DUPLICATE_ELEMENT);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateIdentifiers(final YAnnotEntity annotEntity) {
    final HashMultimap<String, YAnnotIdentifier> multiMap = HashMultimap.<String, YAnnotIdentifier>create();
    EList<YAnnotEntityInner> _annotations = annotEntity.getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotIdentifier)) {
        multiMap.put(((YAnnotIdentifier) annotEntityInner).getName(), ((YAnnotIdentifier)annotEntityInner));
      }
    }
    Set<Map.Entry<String, Collection<YAnnotIdentifier>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<YAnnotIdentifier>> entry : _entrySet) {
      {
        final Collection<YAnnotIdentifier> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final YAnnotIdentifier duplicate : duplicates) {
            String _name = ((YAnnotIdentifier) duplicate).getName();
            String _plus = ((("Duplicate " + "identifier") + " \'") + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, duplicate, 
              ModelPackage.eINSTANCE.getYAnnotIdentifier_Name(), ModelValidator.DUPLICATE_ELEMENT);
          }
        }
      }
    }
  }
  
  @Check
  public void checkNoDuplicateRelationship(final YAnnotEntity annotEntity) {
    final HashMultimap<String, YAnnotRelationship> multiMap = HashMultimap.<String, YAnnotRelationship>create();
    EList<YAnnotEntityInner> _annotations = annotEntity.getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotRelationship)) {
        String _name = ((YAnnotRelationship) annotEntityInner).getName();
        String _name_1 = ((YAnnotRelationship) annotEntityInner).getTarget().getName();
        String _plus = (_name + _name_1);
        multiMap.put(_plus, ((YAnnotRelationship)annotEntityInner));
      }
    }
    Set<Map.Entry<String, Collection<YAnnotRelationship>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<YAnnotRelationship>> entry : _entrySet) {
      {
        final Collection<YAnnotRelationship> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final YAnnotRelationship duplicate : duplicates) {
            String _name_2 = ((YAnnotRelationship) duplicate).getName();
            String _plus_1 = ((("Duplicate " + "relationship") + " \'") + _name_2);
            String _plus_2 = (_plus_1 + "\'");
            this.error(_plus_2, duplicate, ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.DUPLICATE_ELEMENT);
          }
        }
      }
    }
  }
  
  @Check
  public void checkInverseRelationship(final YAnnotEntity annotEntity) {
    EList<YAnnotEntityInner> _annotations = annotEntity.getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotRelationship)) {
        this.doCheckRelationshipCorrectness(((YAnnotRelationship) annotEntityInner));
      }
    }
  }
  
  /**
   * Check if there is technical design and issue warning in case technical
   * design is defined and there is no table implementing entity type.
   */
  @Check
  public void checkEntityImplemented(final YAnnotEntity entity) {
    boolean _isEntityImplemented = this._modelUtil.isEntityImplemented(entity);
    if (_isEntityImplemented) {
      return;
    } else {
      this.warning("The declared entity is not yet implemented as table", entity, 
        ModelPackage.Literals.YANNOTATION__NAME, ModelValidator.ENTITY_NO_TECH_DESIGN);
    }
  }
  
  @Check
  public void checkAttributeHasTechDesign(final YAnnotAttribute attribute) {
    EObject _eContainer = attribute.eContainer();
    final YAnnotEntity entity = ((YAnnotEntity) _eContainer);
    final YAnnotTable table = this._modelUtil.getImplementingTable(entity);
    if ((table == null)) {
      return;
    }
    EList<YAnnotAbstractColumn> _columns = table.getColumns();
    for (final YAnnotAbstractColumn abstractColumn : _columns) {
      EObject _type = abstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = abstractColumn.getType();
        final YAnnotColumn column = ((YAnnotColumn) _type_1);
        String _name = column.getAttrref().getName();
        String _name_1 = attribute.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          return;
        }
      }
    }
    this.warning("The declared attribute is not yet implemented as a column", attribute, 
      ModelPackage.Literals.YANNOT_ATTRIBUTE__NAME, ModelValidator.ATTRIBUTE_NO_TECH_DESIGN);
  }
  
  @Check
  public void checkTableIfComplete(final YAnnotTable table) {
    int count = table.getColumns().size();
    EList<YAnnotForeignKey> _foreignkeys = table.getForeignkeys();
    for (final YAnnotForeignKey foreignKey : _foreignkeys) {
      int _count = count;
      int _size = foreignKey.getColumns().size();
      count = (_count + _size);
    }
    if ((count == 0)) {
      this.error("Table does not have any columns.", table, ModelPackage.Literals.YANNOT_TABLE__NAME, 
        ModelValidator.TABLE_DOES_NOT_HAVE_COLUMNS);
      return;
    }
  }
  
  @Check
  public void checkDuplicateColumnName(final YAnnotColumn column) {
    int count = 0;
    EObject _eContainer = column.eContainer().eContainer();
    if ((_eContainer instanceof YAnnotTable)) {
      EObject _eContainer_1 = column.eContainer().eContainer();
      final YAnnotTable table = ((YAnnotTable) _eContainer_1);
      EList<YAnnotAbstractColumn> _columns = table.getColumns();
      for (final YAnnotAbstractColumn abstractColumn : _columns) {
        String _name = abstractColumn.getName();
        EObject _eContainer_2 = column.eContainer();
        String _name_1 = ((YAnnotAbstractColumn) _eContainer_2).getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          count++;
        }
      }
    }
    EObject _eContainer_3 = column.eContainer().eContainer().eContainer();
    if ((_eContainer_3 instanceof YAnnotTable)) {
      EObject _eContainer_4 = column.eContainer().eContainer().eContainer();
      final YAnnotTable table_1 = ((YAnnotTable) _eContainer_4);
      EList<YAnnotForeignKey> _foreignkeys = table_1.getForeignkeys();
      for (final YAnnotForeignKey foreignKey : _foreignkeys) {
        EList<YAnnotAbstractColumn> _columns_1 = foreignKey.getColumns();
        for (final YAnnotAbstractColumn abstractColumn_1 : _columns_1) {
          String _name_2 = abstractColumn_1.getName();
          EObject _eContainer_5 = column.eContainer();
          String _name_3 = ((YAnnotAbstractColumn) _eContainer_5).getName();
          boolean _equals_1 = Objects.equal(_name_2, _name_3);
          if (_equals_1) {
            count++;
          }
        }
      }
    }
    if ((count > 1)) {
      this.error("Table column name is not unique.", column.eContainer(), 
        ModelPackage.Literals.YANNOT_ABSTRACT_COLUMN__NAME, ModelValidator.COLUMN_NAME_NOT_UNIQUE);
      return;
    }
  }
  
  @Check
  public void checkDuplicateFKColumnName(final YAnnotColumnLike column) {
    int count = 0;
    EObject _eContainer = column.eContainer().eContainer().eContainer();
    final YAnnotTable table = ((YAnnotTable) _eContainer);
    EList<YAnnotAbstractColumn> _columns = table.getColumns();
    for (final YAnnotAbstractColumn abstractColumn : _columns) {
      String _name = abstractColumn.getName();
      EObject _eContainer_1 = column.eContainer();
      String _name_1 = ((YAnnotAbstractColumn) _eContainer_1).getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        count++;
      }
    }
    EList<YAnnotForeignKey> _foreignkeys = table.getForeignkeys();
    for (final YAnnotForeignKey foreignKey : _foreignkeys) {
      EList<YAnnotAbstractColumn> _columns_1 = foreignKey.getColumns();
      for (final YAnnotAbstractColumn abstractColumn_1 : _columns_1) {
        String _name_2 = abstractColumn_1.getName();
        EObject _eContainer_2 = column.eContainer();
        String _name_3 = ((YAnnotAbstractColumn) _eContainer_2).getName();
        boolean _equals_1 = Objects.equal(_name_2, _name_3);
        if (_equals_1) {
          count++;
        }
      }
    }
    if ((count > 1)) {
      this.error("Table foreign key column name is not unique.", column.eContainer(), 
        ModelPackage.Literals.YANNOT_ABSTRACT_COLUMN__NAME, ModelValidator.COLUMN_NAME_NOT_UNIQUE);
      return;
    }
  }
  
  @Check
  public void checkIdentifierHasTechDesign(final YAnnotIdentifier identifier) {
    EObject _eContainer = identifier.eContainer();
    boolean _isTechnicalDesign = this._modelUtil.isTechnicalDesign(((YAnnotEntity) _eContainer));
    if (_isTechnicalDesign) {
      EObject _eContainer_1 = identifier.eContainer();
      final YAnnotTable table = this._modelUtil.getImplementingTable(((YAnnotEntity) _eContainer_1));
      YAnnotPrimaryKey _primarykey = table.getPrimarykey();
      boolean _tripleEquals = (_primarykey == null);
      if (_tripleEquals) {
        this.warning("The declared identifier is not yet implemented as primary key", identifier, 
          ModelPackage.Literals.YANNOT_IDENTIFIER__NAME, ModelValidator.IDENTIFIER_NO_TECH_DESIGN);
      }
    }
  }
  
  @Check
  public void checkRelationshipHasTechDesign(final YAnnotRelationship relationship) {
    EObject _eContainer = relationship.eContainer();
    boolean _isTechnicalDesign = this._modelUtil.isTechnicalDesign(((YAnnotEntity) _eContainer));
    if (_isTechnicalDesign) {
      boolean _isMany = relationship.isMany();
      if (_isMany) {
        return;
      }
      boolean _isMany_1 = relationship.getInverse().isMany();
      if (_isMany_1) {
        EObject _eContainer_1 = relationship.eContainer();
        final YAnnotTable table = this._modelUtil.getImplementingTable(((YAnnotEntity) _eContainer_1));
        if ((table != null)) {
          EList<YAnnotForeignKey> _foreignkeys = table.getForeignkeys();
          for (final YAnnotForeignKey foreignKey : _foreignkeys) {
            YAnnotRelationship _relationship = foreignKey.getRelationship();
            boolean _equals = Objects.equal(_relationship, relationship);
            if (_equals) {
              return;
            }
          }
          this.warning("The declared relationship is not yet implemented as a foreign key", relationship, 
            ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, ModelValidator.RELATIONSSHIP_NOT_IMPLEMENTED);
        }
      }
    }
  }
  
  @Check
  public void checkRelationshipHasDesignatedForeignKey(final YAnnotRelationship relationship) {
    if ((((!relationship.isMany()) && (relationship.getInverse() != null)) && (!relationship.getInverse().isMany()))) {
      if ((this._modelUtil.isForeignKeyDesignated(relationship) && (!this._modelUtil.isForeignKeyDesignated(relationship.getInverse())))) {
        return;
      }
      if (((!this._modelUtil.isForeignKeyDesignated(relationship)) && this._modelUtil.isForeignKeyDesignated(relationship.getInverse()))) {
        return;
      }
      String _name = relationship.getName();
      String _plus = ("Relation pair (" + _name);
      String _plus_1 = (_plus + ",");
      String _name_1 = relationship.getInverse().getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + 
        ") does not have designated foreign key.");
      this.error(_plus_3, relationship, 
        ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, ModelValidator.NO_DESGNATED_FOREIGNKEY);
    }
  }
  
  @Check
  public void checkRelationshipTypeManyHasCorrectForeignKeyDesignation1(final YAnnotRelationship relationship) {
    if (((relationship.isMany() && (relationship.getInverse() != null)) && (!relationship.getInverse().isMany()))) {
      if (((this._modelUtil.isAnnotHavingSpecificName(relationship.getElementValuePairs(), this._modelUtil.KW_FOREIGNKEY) && 
        this._modelUtil.isForeignKeyDesignated(relationship)) || 
        (!this._modelUtil.isAnnotHavingSpecificName(relationship.getElementValuePairs(), this._modelUtil.KW_FOREIGNKEY)))) {
        return;
      }
      String _name = relationship.getName();
      String _plus = ("Relation pair (" + _name);
      String _plus_1 = (_plus + ",");
      String _name_1 = relationship.getInverse().getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + 
        ") has wrongly designated foreign key.");
      this.error(_plus_3, relationship, ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, 
        ModelValidator.WRONGLY_DESGNATED_FOREIGNKEY);
    }
  }
  
  @Check
  public void checkRelationshipTypeManyHasCorrectForeignKeyDesignation2(final YAnnotRelationship relationship) {
    if ((((!relationship.isMany()) && (relationship.getInverse() != null)) && (!relationship.getInverse().isMany()))) {
      if (((!this._modelUtil.isAnnotHavingSpecificName(relationship.getElementValuePairs(), this._modelUtil.KW_FOREIGNKEY)) && 
        (!this._modelUtil.isAnnotHavingSpecificName(relationship.getInverse().getElementValuePairs(), this._modelUtil.KW_FOREIGNKEY)))) {
        String _name = relationship.getName();
        String _plus = ("Relation pair (" + _name);
        String _plus_1 = (_plus + ",");
        String _name_1 = relationship.getInverse().getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + 
          ") has wrongly designated foreign key.");
        this.error(_plus_3, relationship, 
          ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, ModelValidator.WRONGLY_DESGNATED_FOREIGNKEY);
      }
    }
  }
  
  @Check
  public void checkRelationshipTypeManyHasCorrectForeignKeyDesignation3(final YAnnotRelationship relationship) {
    if (((relationship.isMany() && (relationship.getInverse() != null)) && (!relationship.getInverse().isMany()))) {
      boolean _isAnnotHavingSpecificName = this._modelUtil.isAnnotHavingSpecificName(relationship.getInverse().getElementValuePairs(), this._modelUtil.KW_FOREIGNKEY);
      if (_isAnnotHavingSpecificName) {
        String _name = relationship.getName();
        String _plus = ("Relation pair (" + _name);
        String _plus_1 = (_plus + ",");
        String _name_1 = relationship.getInverse().getName();
        String _plus_2 = (_plus_1 + _name_1);
        String _plus_3 = (_plus_2 + 
          ") has wrongly designated foreign key.");
        this.error(_plus_3, relationship, 
          ModelPackage.Literals.YANNOT_RELATIONSHIP__NAME, ModelValidator.WRONGLY_DESGNATED_FOREIGNKEY);
      }
    }
  }
  
  @Check
  public void doCheckRelationshipCorrectness(final YAnnotRelationship forwardRel) {
    final YAnnotRelationship backwardRel = forwardRel.getInverse();
    YAnnotRelationship _inverse = forwardRel.getInverse();
    boolean _tripleEquals = (_inverse == null);
    if (_tripleEquals) {
      this.error("Inverse relationship for this relationship not yet defined.", forwardRel, 
        ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.MISSING_INVERSE_REALTIONSHIP);
      return;
    }
    boolean _equals = Objects.equal(forwardRel, backwardRel);
    if (_equals) {
      this.error("Matching Inverse relationship cannot be the same relationship.", forwardRel, 
        ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF);
      return;
    }
    if ((forwardRel.isMany() && backwardRel.isMany())) {
      this.error("Many-to-many relationship type not supported yet.", forwardRel, 
        ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.MANY_TO_MANY_NOT_SUPPORTED);
      return;
    }
    if (((((!forwardRel.isMany()) && (!backwardRel.isMany())) && (!forwardRel.isOptional())) && (!backwardRel.isOptional()))) {
      this.error("A fully mandatory 1-to-1 relationship is unusual and supported.", forwardRel, 
        ModelPackage.eINSTANCE.getYAnnotRelationship_Name(), ModelValidator.ONE_TO_ONE_MANDATORY_NOT_SUPPORTED);
      return;
    }
  }
}
