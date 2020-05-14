/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang.impl;

import eu.jgen.notes.dmw.lite.base.lang.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class LangFactoryImpl extends EFactoryImpl implements LangFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static LangFactory init()
  {
    try
    {
      LangFactory theLangFactory = (LangFactory)EPackage.Registry.INSTANCE.getEFactory(LangPackage.eNS_URI);
      if (theLangFactory != null)
      {
        return theLangFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new LangFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LangFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case LangPackage.YWIDGET: return createYWidget();
      case LangPackage.YPARAMETER: return createYParameter();
      case LangPackage.YARGUMENT: return createYArgument();
      case LangPackage.YENUMERATION: return createYEnumeration();
      case LangPackage.YENUMERATION_CASE: return createYEnumerationCase();
      case LangPackage.YCLASS: return createYClass();
      case LangPackage.YMEMBER: return createYMember();
      case LangPackage.YPROPERTY: return createYProperty();
      case LangPackage.YTUPLES: return createYTuples();
      case LangPackage.YFUNCTION: return createYFunction();
      case LangPackage.YBLOCK: return createYBlock();
      case LangPackage.YSTATEMENT: return createYStatement();
      case LangPackage.YDO_STATEMENT: return createYDoStatement();
      case LangPackage.YCATCH: return createYCatch();
      case LangPackage.YCATCH_BLOCK: return createYCatchBlock();
      case LangPackage.YVARIABLE_DECLARATION: return createYVariableDeclaration();
      case LangPackage.YTHROW: return createYThrow();
      case LangPackage.YRETURN: return createYReturn();
      case LangPackage.YIF_STATEMENT: return createYIfStatement();
      case LangPackage.YSWITCH_STATEMENT: return createYSwitchStatement();
      case LangPackage.YSWITCH_CASE: return createYSwitchCase();
      case LangPackage.YSYMBOL: return createYSymbol();
      case LangPackage.YNAMED_ELEMENT: return createYNamedElement();
      case LangPackage.YEXPRESSION: return createYExpression();
      case LangPackage.YREAD_STATEMENT: return createYReadStatement();
      case LangPackage.YREAD_EACH_STATEMENT: return createYReadEachStatement();
      case LangPackage.YCREATE_STATEMENT: return createYCreateStatement();
      case LangPackage.YUPDATE_STATEMENT: return createYUpdateStatement();
      case LangPackage.YDELETE_STATEMENT: return createYDeleteStatement();
      case LangPackage.YASSOCIATE_STATEMENT: return createYAssociateStatement();
      case LangPackage.YDISASSOCIATE_STATEMENT: return createYDisassociateStatement();
      case LangPackage.YSTRUCT_REF_PAIR: return createYStructRefPair();
      case LangPackage.YJOIN: return createYJoin();
      case LangPackage.YJOIN_DEF: return createYJoinDef();
      case LangPackage.YWHERE: return createYWhere();
      case LangPackage.YWHILE_STATEMENT: return createYWhileStatement();
      case LangPackage.YREPEAT_WHILE_STATEMENT: return createYRepeatWhileStatement();
      case LangPackage.YFOR_IN_STATEMENT: return createYForInStatement();
      case LangPackage.YASSIGNMENT: return createYAssignment();
      case LangPackage.YMEMBER_SELECTION: return createYMemberSelection();
      case LangPackage.YOR_EXPRESSION: return createYOrExpression();
      case LangPackage.YAND_EXPRESSION: return createYAndExpression();
      case LangPackage.YEQUALITY_EXPRESSION: return createYEqualityExpression();
      case LangPackage.YCOMPARISON_EXPRESSION: return createYComparisonExpression();
      case LangPackage.YPLUS: return createYPlus();
      case LangPackage.YMINUS: return createYMinus();
      case LangPackage.YMUL_OR_DIV: return createYMulOrDiv();
      case LangPackage.YPARENTIES: return createYParenties();
      case LangPackage.YNOT: return createYNot();
      case LangPackage.YSTRING_CONSTANT: return createYStringConstant();
      case LangPackage.YINT_CONSTANT: return createYIntConstant();
      case LangPackage.YBOOL_CONSTANT: return createYBoolConstant();
      case LangPackage.YSELF: return createYSelf();
      case LangPackage.YSUPER: return createYSuper();
      case LangPackage.YNULL: return createYNull();
      case LangPackage.YSYMBOL_REF: return createYSymbolRef();
      case LangPackage.YNEW: return createYNew();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LangPackage.YACCESS_LEVEL:
        return createYAccessLevelFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case LangPackage.YACCESS_LEVEL:
        return convertYAccessLevelToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YWidget createYWidget()
  {
    YWidgetImpl yWidget = new YWidgetImpl();
    return yWidget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YParameter createYParameter()
  {
    YParameterImpl yParameter = new YParameterImpl();
    return yParameter;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YArgument createYArgument()
  {
    YArgumentImpl yArgument = new YArgumentImpl();
    return yArgument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YEnumeration createYEnumeration()
  {
    YEnumerationImpl yEnumeration = new YEnumerationImpl();
    return yEnumeration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YEnumerationCase createYEnumerationCase()
  {
    YEnumerationCaseImpl yEnumerationCase = new YEnumerationCaseImpl();
    return yEnumerationCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YClass createYClass()
  {
    YClassImpl yClass = new YClassImpl();
    return yClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YMember createYMember()
  {
    YMemberImpl yMember = new YMemberImpl();
    return yMember;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YProperty createYProperty()
  {
    YPropertyImpl yProperty = new YPropertyImpl();
    return yProperty;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YTuples createYTuples()
  {
    YTuplesImpl yTuples = new YTuplesImpl();
    return yTuples;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YFunction createYFunction()
  {
    YFunctionImpl yFunction = new YFunctionImpl();
    return yFunction;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YBlock createYBlock()
  {
    YBlockImpl yBlock = new YBlockImpl();
    return yBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YStatement createYStatement()
  {
    YStatementImpl yStatement = new YStatementImpl();
    return yStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YDoStatement createYDoStatement()
  {
    YDoStatementImpl yDoStatement = new YDoStatementImpl();
    return yDoStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YCatch createYCatch()
  {
    YCatchImpl yCatch = new YCatchImpl();
    return yCatch;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YCatchBlock createYCatchBlock()
  {
    YCatchBlockImpl yCatchBlock = new YCatchBlockImpl();
    return yCatchBlock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YVariableDeclaration createYVariableDeclaration()
  {
    YVariableDeclarationImpl yVariableDeclaration = new YVariableDeclarationImpl();
    return yVariableDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YThrow createYThrow()
  {
    YThrowImpl yThrow = new YThrowImpl();
    return yThrow;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YReturn createYReturn()
  {
    YReturnImpl yReturn = new YReturnImpl();
    return yReturn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YIfStatement createYIfStatement()
  {
    YIfStatementImpl yIfStatement = new YIfStatementImpl();
    return yIfStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSwitchStatement createYSwitchStatement()
  {
    YSwitchStatementImpl ySwitchStatement = new YSwitchStatementImpl();
    return ySwitchStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSwitchCase createYSwitchCase()
  {
    YSwitchCaseImpl ySwitchCase = new YSwitchCaseImpl();
    return ySwitchCase;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSymbol createYSymbol()
  {
    YSymbolImpl ySymbol = new YSymbolImpl();
    return ySymbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YNamedElement createYNamedElement()
  {
    YNamedElementImpl yNamedElement = new YNamedElementImpl();
    return yNamedElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YExpression createYExpression()
  {
    YExpressionImpl yExpression = new YExpressionImpl();
    return yExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YReadStatement createYReadStatement()
  {
    YReadStatementImpl yReadStatement = new YReadStatementImpl();
    return yReadStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YReadEachStatement createYReadEachStatement()
  {
    YReadEachStatementImpl yReadEachStatement = new YReadEachStatementImpl();
    return yReadEachStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YCreateStatement createYCreateStatement()
  {
    YCreateStatementImpl yCreateStatement = new YCreateStatementImpl();
    return yCreateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YUpdateStatement createYUpdateStatement()
  {
    YUpdateStatementImpl yUpdateStatement = new YUpdateStatementImpl();
    return yUpdateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YDeleteStatement createYDeleteStatement()
  {
    YDeleteStatementImpl yDeleteStatement = new YDeleteStatementImpl();
    return yDeleteStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YAssociateStatement createYAssociateStatement()
  {
    YAssociateStatementImpl yAssociateStatement = new YAssociateStatementImpl();
    return yAssociateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YDisassociateStatement createYDisassociateStatement()
  {
    YDisassociateStatementImpl yDisassociateStatement = new YDisassociateStatementImpl();
    return yDisassociateStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YStructRefPair createYStructRefPair()
  {
    YStructRefPairImpl yStructRefPair = new YStructRefPairImpl();
    return yStructRefPair;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YJoin createYJoin()
  {
    YJoinImpl yJoin = new YJoinImpl();
    return yJoin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YJoinDef createYJoinDef()
  {
    YJoinDefImpl yJoinDef = new YJoinDefImpl();
    return yJoinDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YWhere createYWhere()
  {
    YWhereImpl yWhere = new YWhereImpl();
    return yWhere;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YWhileStatement createYWhileStatement()
  {
    YWhileStatementImpl yWhileStatement = new YWhileStatementImpl();
    return yWhileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YRepeatWhileStatement createYRepeatWhileStatement()
  {
    YRepeatWhileStatementImpl yRepeatWhileStatement = new YRepeatWhileStatementImpl();
    return yRepeatWhileStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YForInStatement createYForInStatement()
  {
    YForInStatementImpl yForInStatement = new YForInStatementImpl();
    return yForInStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YAssignment createYAssignment()
  {
    YAssignmentImpl yAssignment = new YAssignmentImpl();
    return yAssignment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YMemberSelection createYMemberSelection()
  {
    YMemberSelectionImpl yMemberSelection = new YMemberSelectionImpl();
    return yMemberSelection;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YOrExpression createYOrExpression()
  {
    YOrExpressionImpl yOrExpression = new YOrExpressionImpl();
    return yOrExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YAndExpression createYAndExpression()
  {
    YAndExpressionImpl yAndExpression = new YAndExpressionImpl();
    return yAndExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YEqualityExpression createYEqualityExpression()
  {
    YEqualityExpressionImpl yEqualityExpression = new YEqualityExpressionImpl();
    return yEqualityExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YComparisonExpression createYComparisonExpression()
  {
    YComparisonExpressionImpl yComparisonExpression = new YComparisonExpressionImpl();
    return yComparisonExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YPlus createYPlus()
  {
    YPlusImpl yPlus = new YPlusImpl();
    return yPlus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YMinus createYMinus()
  {
    YMinusImpl yMinus = new YMinusImpl();
    return yMinus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YMulOrDiv createYMulOrDiv()
  {
    YMulOrDivImpl yMulOrDiv = new YMulOrDivImpl();
    return yMulOrDiv;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YParenties createYParenties()
  {
    YParentiesImpl yParenties = new YParentiesImpl();
    return yParenties;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YNot createYNot()
  {
    YNotImpl yNot = new YNotImpl();
    return yNot;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YStringConstant createYStringConstant()
  {
    YStringConstantImpl yStringConstant = new YStringConstantImpl();
    return yStringConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YIntConstant createYIntConstant()
  {
    YIntConstantImpl yIntConstant = new YIntConstantImpl();
    return yIntConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YBoolConstant createYBoolConstant()
  {
    YBoolConstantImpl yBoolConstant = new YBoolConstantImpl();
    return yBoolConstant;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSelf createYSelf()
  {
    YSelfImpl ySelf = new YSelfImpl();
    return ySelf;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSuper createYSuper()
  {
    YSuperImpl ySuper = new YSuperImpl();
    return ySuper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YNull createYNull()
  {
    YNullImpl yNull = new YNullImpl();
    return yNull;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YSymbolRef createYSymbolRef()
  {
    YSymbolRefImpl ySymbolRef = new YSymbolRefImpl();
    return ySymbolRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YNew createYNew()
  {
    YNewImpl yNew = new YNewImpl();
    return yNew;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAccessLevel createYAccessLevelFromString(EDataType eDataType, String initialValue)
  {
    YAccessLevel result = YAccessLevel.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertYAccessLevelToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public LangPackage getLangPackage()
  {
    return (LangPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static LangPackage getPackage()
  {
    return LangPackage.eINSTANCE;
  }

} //LangFactoryImpl
