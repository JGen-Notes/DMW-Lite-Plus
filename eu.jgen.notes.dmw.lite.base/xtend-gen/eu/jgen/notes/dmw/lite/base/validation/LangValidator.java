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
package eu.jgen.notes.dmw.lite.base.validation;

import com.google.common.base.Objects;
import com.google.common.collect.HashMultimap;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.LangPackage;
import eu.jgen.notes.dmw.lite.base.lang.YAccessLevel;
import eu.jgen.notes.dmw.lite.base.lang.YBlock;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YExpression;
import eu.jgen.notes.dmw.lite.base.lang.YFunction;
import eu.jgen.notes.dmw.lite.base.lang.YMember;
import eu.jgen.notes.dmw.lite.base.lang.YMemberSelection;
import eu.jgen.notes.dmw.lite.base.lang.YNamedElement;
import eu.jgen.notes.dmw.lite.base.lang.YParameter;
import eu.jgen.notes.dmw.lite.base.lang.YProperty;
import eu.jgen.notes.dmw.lite.base.lang.YReturn;
import eu.jgen.notes.dmw.lite.base.lang.YStatement;
import eu.jgen.notes.dmw.lite.base.lang.YSuper;
import eu.jgen.notes.dmw.lite.base.lang.YVariableDeclaration;
import eu.jgen.notes.dmw.lite.base.lang.YWidget;
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex;
import eu.jgen.notes.dmw.lite.base.validation.AbstractLangValidator;
import eu.jgen.notes.dmw.lite.base.validation.LangAccessibility;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.typing.LangTypeComputer;
import eu.jgen.notes.dmw.lite.typing.LangTypeConformance;
import eu.jgen.notes.dmw.lite.utility.LangUtil;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.StringExtensions;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class LangValidator extends AbstractLangValidator {
  protected final static String ISSUE_CODE_PREFIX = " eu.jgen.notes.dmw.lite.";
  
  public final static String HIERARCHY_CYCLE = (LangValidator.ISSUE_CODE_PREFIX + "HierarchyCycle");
  
  public final static String PROPERTY_SELECTION_ON_FUNCTION = (LangValidator.ISSUE_CODE_PREFIX + "FieldSelectionOnMethod");
  
  public final static String FUNCTION_INVOCATION_ON_PROPERTY = (LangValidator.ISSUE_CODE_PREFIX + "FunctionInvocationOnProperty");
  
  public final static String UNREACHABLE_CODE = (LangValidator.ISSUE_CODE_PREFIX + "UnreachableCode");
  
  public final static String FUNCTION_FINAL_RETURN = (LangValidator.ISSUE_CODE_PREFIX + "MissingFinalReturn");
  
  public final static String DUPLICATE_ELEMENT = (LangValidator.ISSUE_CODE_PREFIX + "DuplicateElement");
  
  public final static String INCOMPATIBLE_TYPES = (LangValidator.ISSUE_CODE_PREFIX + "IncompatibleTypes");
  
  public final static String INVALID_ARGS = (LangValidator.ISSUE_CODE_PREFIX + "InvalidArgs");
  
  public final static String WRONG_FUNCTION_OVERRIDE = (LangValidator.ISSUE_CODE_PREFIX + "WrongFunctionOverride");
  
  public final static String MEMBER_NOT_ACCESSIBLE = (LangValidator.ISSUE_CODE_PREFIX + "MemberNotAccessible");
  
  public final static String DUPLICATE_CLASS = (LangValidator.ISSUE_CODE_PREFIX + "DuplicateClass");
  
  public final static String DUPLICATE_ENTITY = (LangValidator.ISSUE_CODE_PREFIX + "DuplicateEntity");
  
  public final static String WRONG_SUPER_USAGE = (LangValidator.ISSUE_CODE_PREFIX + "WrongSuperUsage");
  
  public final static String REDUCED_ACCESSIBILITY = (LangValidator.ISSUE_CODE_PREFIX + "ReducedAccessibility");
  
  public final static String MISSING_ENTITY_REFERENCE = (LangValidator.ISSUE_CODE_PREFIX + "MissingEntityReference");
  
  public final static String WRONG_TYPE = (LangValidator.ISSUE_CODE_PREFIX + "WrongType");
  
  public final static String WRONG_CROSS_REFERENCE = (LangValidator.ISSUE_CODE_PREFIX + "WrongCrossReference");
  
  public final static String WRONG_INVERT_REFERENCE = (LangValidator.ISSUE_CODE_PREFIX + "WrongInvertReference");
  
  public final static String ATTRIBUTE_NO_TECH_DESIGN = (LangValidator.ISSUE_CODE_PREFIX + "AttributeNoTechDesign");
  
  public final static String ENTITY_NO_TECH_DESIGN = (LangValidator.ISSUE_CODE_PREFIX + "EntityNoTechDesign");
  
  public final static String TABLE_DOES_NOT_HAVE_COLUMNS = (LangValidator.ISSUE_CODE_PREFIX + "TableDoesNotHaveColumns");
  
  public final static String TABLE_NAME_NOT_UNIQUE = (LangValidator.ISSUE_CODE_PREFIX + "TableNameNotUnique");
  
  public final static String COLUMN_NAME_NOT_UNIQUE = (LangValidator.ISSUE_CODE_PREFIX + "ColumnNameNotUnique");
  
  public final static String IDENTIFIER_NO_TECH_DESIGN = (LangValidator.ISSUE_CODE_PREFIX + "IdentifgierNoTechDesign");
  
  public final static String RELATIONSSHIP_NOT_IMPLEMENTED = (LangValidator.ISSUE_CODE_PREFIX + "RelationshipNotImplemented");
  
  public final static String UNSUPPORTED_DATABASE = (LangValidator.ISSUE_CODE_PREFIX + "UnsupportedDatabase");
  
  public final static String MISSING_INVERSE_REALTIONSHIP = (LangValidator.ISSUE_CODE_PREFIX + "MissingInverseRelationship");
  
  public final static String MANY_TO_MANY_NOT_SUPPORTED = (LangValidator.ISSUE_CODE_PREFIX + "ManyToManyNotSuported");
  
  public final static String ONE_TO_ONE_MANDATORY_NOT_SUPPORTED = (LangValidator.ISSUE_CODE_PREFIX + "OneToOneMandatoryNotSuported");
  
  public final static String INVERSE_RELATIONSHIP_CANNOT_BE_ITSELF = (LangValidator.ISSUE_CODE_PREFIX + "MatchingInverseCannotMatchItself");
  
  public final static String INVERSE_RELATIONSHIP_DOES_NOT_EXIST_IN_TAGET = (LangValidator.ISSUE_CODE_PREFIX + "InverseDoesNotExistInTarget");
  
  public final static String NO_DESGNATED_PARENT = (LangValidator.ISSUE_CODE_PREFIX + "NoDesignatedParent");
  
  public final static String ONLY_ONE_DESGNATED_PARENT = (LangValidator.ISSUE_CODE_PREFIX + "OnlyOneDesignatedParent");
  
  public final static String CLASS_NEED_TO_HAVE_PROPERTIES = (LangValidator.ISSUE_CODE_PREFIX + "ClassNeedToHaveProperties");
  
  public final static String CLASS_NAME_FIRST_CHARACTER_NOT_CAPITAL = (LangValidator.ISSUE_CODE_PREFIX + "ClassNameFirstCharacterNotCapital");
  
  public final static String ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL = (LangValidator.ISSUE_CODE_PREFIX + "EntityNameFirstCharacterNotCapital");
  
  public final static String ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (LangValidator.ISSUE_CODE_PREFIX + 
    "AttributeNameFirstCharacterNotLowercase");
  
  public final static String FUNCTION_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (LangValidator.ISSUE_CODE_PREFIX + 
    "FunctionNameFirstCharacterNotLowercase");
  
  public final static String PROPERTY_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (LangValidator.ISSUE_CODE_PREFIX + 
    "PropertyNameFirstCharacterNotLowercase");
  
  public final static String VARIABLE_NAME_FIRST_CHARACTER_NOT_LOWERCASE = (LangValidator.ISSUE_CODE_PREFIX + 
    "VariableNameFirstCharacterNotLowercase");
  
  public final static String ATTRIBUTE_TYPE_NOT_COMP_WITH_DEFAULT = (LangValidator.ISSUE_CODE_PREFIX + "AttributeTypeNotCompatibleWithDefault");
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  @Extension
  private LangUtil _langUtil;
  
  @Inject
  @Extension
  private LangTypeComputer _langTypeComputer;
  
  @Inject
  @Extension
  private LangTypeConformance _langTypeConformance;
  
  @Inject
  @Extension
  private LangAccessibility _langAccessibility;
  
  @Inject
  @Extension
  private LangIndex _langIndex;
  
  @Inject
  @Extension
  private IQualifiedNameProvider _iQualifiedNameProvider;
  
  /**
   * Classes YMemberSelection
   */
  @Check
  public void checkPropertyReferenceToAtttribute(final YProperty property) {
    YAnnotAttribute _attrRef = property.getAttrRef();
    boolean _tripleEquals = (_attrRef == null);
    if (_tripleEquals) {
      return;
    }
    EObject _eContainer = property.eContainer();
    final YClass parent = ((YClass) _eContainer);
    YAnnotEntity _entityRef = parent.getEntityRef();
    boolean _tripleEquals_1 = (_entityRef == null);
    if (_tripleEquals_1) {
      this.error("Entity has to implement entity type before pointing to attribute", 
        LangPackage.eINSTANCE.getYProperty_AttrRef(), LangValidator.MISSING_ENTITY_REFERENCE, property.getName());
      return;
    }
    String _name = property.getAttrRef().getName();
    String _name_1 = property.getName();
    boolean _equals = Objects.equal(_name, _name_1);
    if (_equals) {
      String _name_2 = property.getType().getName();
      String _extractAttributeType = this._modelUtil.extractAttributeType(property.getAttrRef());
      boolean _notEquals = (!Objects.equal(_name_2, _extractAttributeType));
      if (_notEquals) {
        this.error("Attribute type does not match property type", LangPackage.eINSTANCE.getYMember_Type(), LangValidator.WRONG_TYPE, 
          property.getType().getName());
      }
      EObject _eContainer_1 = property.getAttrRef().eContainer();
      final String name = ((YAnnotEntity) _eContainer_1).getName();
      String _name_3 = parent.getEntityRef().getName();
      boolean _notEquals_1 = (!Objects.equal(name, _name_3));
      if (_notEquals_1) {
        this.error("Attribute does not belong to the chosen entity", LangPackage.eINSTANCE.getYProperty_AttrRef(), 
          LangValidator.WRONG_CROSS_REFERENCE, property.getName());
      }
    } else {
      this.error("Cannot find matching attribute for selected entity type", LangPackage.eINSTANCE.getYProperty_AttrRef(), 
        LangValidator.MISSING_ENTITY_REFERENCE, property.getName());
    }
  }
  
  @Check
  public void checkClassHierarchy(final YClass yclass) {
    boolean _contains = this._langUtil.classHierarchy(yclass).contains(yclass);
    if (_contains) {
      String _name = yclass.getName();
      String _plus = ("cycle in hierarchy of class \'" + _name);
      String _plus_1 = (_plus + "\'");
      this.error(_plus_1, LangPackage.eINSTANCE.getYClass_Superclass(), 
        LangValidator.HIERARCHY_CYCLE, yclass.getSuperclass().getName());
    }
  }
  
  @Check
  public void checkMemberSelection(final YMemberSelection memberSelection) {
    final YMember member = memberSelection.getMember();
    if (((member instanceof YProperty) && memberSelection.isFunctioninvocation())) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("Function invocation on a property");
      this.error(_builder.toString(), LangPackage.eINSTANCE.getYMemberSelection_Functioninvocation(), 
        LangValidator.FUNCTION_INVOCATION_ON_PROPERTY);
    } else {
      if (((member instanceof YFunction) && (!memberSelection.isFunctioninvocation()))) {
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("Property selection on a function");
        this.error(_builder_1.toString(), 
          LangPackage.eINSTANCE.getYMemberSelection_Member(), 
          LangValidator.PROPERTY_SELECTION_ON_FUNCTION);
      }
    }
  }
  
  @Check
  public void checkUnreachableCode(final YBlock block) {
    final EList<YStatement> statements = block.getStatements();
    for (int i = 0; (i < (((Object[])Conversions.unwrapArray(statements, Object.class)).length - 1)); i++) {
      YStatement _get = statements.get(i);
      if ((_get instanceof YReturn)) {
        this.error("Unreachable code", statements.get((i + 1)), null, 
          LangValidator.UNREACHABLE_CODE);
        return;
      }
    }
  }
  
  public void checkMethodEndsWithReturn(final YFunction function) {
    boolean _isReturnvalue = function.isReturnvalue();
    if (_isReturnvalue) {
      YReturn _returnStatement = this._langUtil.returnStatement(function);
      boolean _tripleEquals = (_returnStatement == null);
      if (_tripleEquals) {
        this.error(
          "Function must end with a return statement", 
          LangPackage.eINSTANCE.getYFunction_Body(), 
          LangValidator.FUNCTION_FINAL_RETURN);
      }
    }
  }
  
  @Check
  public void checkNoDuplicateClasses(final YWidget widget) {
    this.checkNoDuplicateElements(widget.getClasses(), "class");
  }
  
  @Check
  public void checkNoDuplicateMembers(final YClass yclass) {
    this.checkNoDuplicateElements(this._langUtil.properties(yclass), "property");
    this.checkNoDuplicateElements(this._langUtil.functions(yclass), "function");
  }
  
  @Check
  public void checkNoDuplicateSymbols(final YFunction function) {
    this.checkNoDuplicateElements(function.getParams(), "parameter");
    this.checkNoDuplicateElements(EcoreUtil2.<YVariableDeclaration>getAllContentsOfType(function.getBody(), YVariableDeclaration.class), "variable");
  }
  
  @Check
  public void checkConformance(final YExpression expression) {
    final YClass actualType = this._langTypeComputer.typeFor(expression);
    final YClass expectedType = this._langTypeComputer.expectedType(expression);
    if (((expectedType == null) || (actualType == null))) {
      return;
    }
    boolean _isConformant = this._langTypeConformance.isConformant(actualType, expectedType);
    boolean _not = (!_isConformant);
    if (_not) {
      String _name = expectedType.getName();
      String _plus = ("Incompatible types. Expected \'" + _name);
      String _plus_1 = (_plus + "\' but was \'");
      String _name_1 = actualType.getName();
      String _plus_2 = (_plus_1 + _name_1);
      String _plus_3 = (_plus_2 + "\'");
      this.error(_plus_3, null, 
        LangValidator.INCOMPATIBLE_TYPES);
    }
  }
  
  @Check
  public void checkFunctionInvocationArguments(final YMemberSelection selection) {
    final YMember method = selection.getMember();
    if ((method instanceof YFunction)) {
      int _size = ((YFunction)method).getParams().size();
      int _size_1 = selection.getArgs().size();
      boolean _notEquals = (_size != _size_1);
      if (_notEquals) {
        int _size_2 = ((YFunction)method).getParams().size();
        String _plus = ("Invalid number of arguments: expected " + Integer.valueOf(_size_2));
        String _plus_1 = (_plus + " but was ");
        int _size_3 = selection.getArgs().size();
        String _plus_2 = (_plus_1 + Integer.valueOf(_size_3));
        this.error(_plus_2, 
          LangPackage.eINSTANCE.getYMemberSelection_Member(), LangValidator.INVALID_ARGS);
      }
    }
  }
  
  @Check
  public void checkFunctionOverride(final YClass yclass) {
    final Map<String, YFunction> hierarchyMethods = this._langUtil.classHierarchyMethods(yclass);
    Iterable<YFunction> _functions = this._langUtil.functions(yclass);
    for (final YFunction function : _functions) {
      {
        final YFunction overridden = hierarchyMethods.get(function.getName());
        if (((overridden != null) && ((!this._langTypeConformance.isConformant(function.getType(), overridden.getType())) || 
          (!IterableExtensions.elementsEqual(ListExtensions.<YParameter, YClass>map(function.getParams(), ((Function1<YParameter, YClass>) (YParameter it) -> {
            return it.getType();
          })), ListExtensions.<YParameter, YClass>map(overridden.getParams(), ((Function1<YParameter, YClass>) (YParameter it) -> {
            return it.getType();
          }))))))) {
          String _name = function.getName();
          String _plus = ("The function \'" + _name);
          String _plus_1 = (_plus + "\' must override a superclass function");
          this.error(_plus_1, function, 
            LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.WRONG_FUNCTION_OVERRIDE);
        } else {
          YAccessLevel _access = function.getAccess();
          YAccessLevel _access_1 = overridden.getAccess();
          boolean _lessThan = (_access.compareTo(_access_1) < 0);
          if (_lessThan) {
            YAccessLevel _access_2 = overridden.getAccess();
            String _plus_2 = ("Cannot reduce access from " + _access_2);
            String _plus_3 = (_plus_2 + " to ");
            YAccessLevel _access_3 = function.getAccess();
            String _plus_4 = (_plus_3 + _access_3);
            this.error(_plus_4, function, 
              LangPackage.eINSTANCE.getYMember_Access(), LangValidator.REDUCED_ACCESSIBILITY);
          }
        }
      }
    }
  }
  
  @Check
  public void checkAccessibility(final YMemberSelection selection) {
    final YMember member = selection.getMember();
    if (((member.getName() != null) && (!this._langAccessibility.isAccessibleFrom(member, selection)))) {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("The ");
      YAccessLevel _access = member.getAccess();
      _builder.append(_access);
      _builder.append(" member ");
      String _name = member.getName();
      _builder.append(_name);
      _builder.append(" is not accessible here");
      this.error(_builder.toString(), 
        LangPackage.eINSTANCE.getYMemberSelection_Member(), 
        LangValidator.MEMBER_NOT_ACCESSIBLE);
    }
  }
  
  @Check
  public void checkDuplicateClassesInFiles(final YWidget widget) {
    final Map<QualifiedName, IEObjectDescription> externalClasses = this._langIndex.getVisibleExternalClassesDescriptions(widget);
    EList<YClass> _classes = widget.getClasses();
    for (final YClass clazz : _classes) {
      {
        final QualifiedName className = this._iQualifiedNameProvider.getFullyQualifiedName(clazz);
        boolean _containsKey = externalClasses.containsKey(className);
        if (_containsKey) {
          String _name = clazz.getName();
          String _plus = ("The type " + _name);
          String _plus_1 = (_plus + " is already defined");
          this.error(_plus_1, clazz, LangPackage.eINSTANCE.getYNamedElement_Name(), 
            LangValidator.DUPLICATE_CLASS);
        }
      }
    }
  }
  
  @Check
  public void checkSuper(final YSuper ysuper) {
    EStructuralFeature _eContainingFeature = ysuper.eContainingFeature();
    EReference _yMemberSelection_Receiver = LangPackage.eINSTANCE.getYMemberSelection_Receiver();
    boolean _notEquals = (!Objects.equal(_eContainingFeature, _yMemberSelection_Receiver));
    if (_notEquals) {
      this.error("\'super\' can be used only as member selection receiver", null, LangValidator.WRONG_SUPER_USAGE);
    }
  }
  
  private void checkNoDuplicateElements(final Iterable<? extends YNamedElement> elements, final String desc) {
    final HashMultimap<String, YNamedElement> multiMap = HashMultimap.<String, YNamedElement>create();
    for (final YNamedElement element : elements) {
      multiMap.put(element.getName(), element);
    }
    Set<Map.Entry<String, Collection<YNamedElement>>> _entrySet = multiMap.asMap().entrySet();
    for (final Map.Entry<String, Collection<YNamedElement>> entry : _entrySet) {
      {
        final Collection<YNamedElement> duplicates = entry.getValue();
        int _size = duplicates.size();
        boolean _greaterThan = (_size > 1);
        if (_greaterThan) {
          for (final YNamedElement duplicate : duplicates) {
            String _name = duplicate.getName();
            String _plus = ((("Duplicate " + desc) + " \'") + _name);
            String _plus_1 = (_plus + "\'");
            this.error(_plus_1, duplicate, 
              LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.DUPLICATE_ELEMENT);
          }
        }
      }
    }
  }
  
  @Check
  public void checkClassExtendingStructureHasProperties(final YClass clazz) {
    String _name = clazz.getName();
    boolean _equals = Objects.equal(_name, "Object");
    if (_equals) {
      return;
    }
    if ((Objects.equal(clazz.getSuperclass().getName(), "Structure") && (clazz.getMembers().size() == 0))) {
      String _name_1 = clazz.getName();
      String _plus = ("Class " + _name_1);
      String _plus_1 = (_plus + " does not have any properties yet.");
      this.error(_plus_1, clazz, 
        LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.CLASS_NEED_TO_HAVE_PROPERTIES);
    }
  }
  
  @Check
  public void checkClassNameStartsWithCapital(final YClass clazz) {
    String _firstUpper = StringExtensions.toFirstUpper(clazz.getName());
    String _name = clazz.getName();
    boolean _notEquals = (!Objects.equal(_firstUpper, _name));
    if (_notEquals) {
      this.error("Class name should start with a capital letter", clazz, LangPackage.eINSTANCE.getYNamedElement_Name(), 
        LangValidator.CLASS_NAME_FIRST_CHARACTER_NOT_CAPITAL);
    }
  }
  
  @Check
  public void checkFunctionNameStartsWithLowecase(final YFunction function) {
    String _firstLower = StringExtensions.toFirstLower(function.getName());
    String _name = function.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Function name should start with a lower case letter", function, 
        LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.FUNCTION_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
  
  @Check
  public void checkPropertyNameStartsWithLowecase(final YProperty property) {
    String _firstLower = StringExtensions.toFirstLower(property.getName());
    String _name = property.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Property name should start with a lower case letter", property, 
        LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.PROPERTY_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
  
  @Check
  public void checkVariableNameStartsWithLowecase(final YVariableDeclaration variableDeclaration) {
    String _firstLower = StringExtensions.toFirstLower(variableDeclaration.getName());
    String _name = variableDeclaration.getName();
    boolean _notEquals = (!Objects.equal(_firstLower, _name));
    if (_notEquals) {
      this.error("Variable name should start with a lower case letter", variableDeclaration, 
        LangPackage.eINSTANCE.getYNamedElement_Name(), LangValidator.VARIABLE_NAME_FIRST_CHARACTER_NOT_LOWERCASE);
    }
  }
}
