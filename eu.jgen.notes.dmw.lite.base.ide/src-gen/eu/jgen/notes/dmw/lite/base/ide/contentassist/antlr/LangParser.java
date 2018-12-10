/*
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import eu.jgen.notes.dmw.lite.base.ide.contentassist.antlr.internal.InternalLangParser;
import eu.jgen.notes.dmw.lite.base.services.LangGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class LangParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(LangGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, LangGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getYParameterAccess().getAlternatives(), "rule__YParameter__Alternatives");
			builder.put(grammarAccess.getYArgumentValueAccess().getAlternatives(), "rule__YArgumentValue__Alternatives");
			builder.put(grammarAccess.getYMemberAccess().getAlternatives(), "rule__YMember__Alternatives");
			builder.put(grammarAccess.getYStatementAccess().getAlternatives(), "rule__YStatement__Alternatives");
			builder.put(grammarAccess.getYSymbolAccess().getAlternatives(), "rule__YSymbol__Alternatives");
			builder.put(grammarAccess.getYNamedElementAccess().getAlternatives(), "rule__YNamedElement__Alternatives");
			builder.put(grammarAccess.getYEqualityExpressionAccess().getOpAlternatives_1_1_0(), "rule__YEqualityExpression__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getOpCompareAccess().getAlternatives(), "rule__OpCompare__Alternatives");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getAlternatives_1_0(), "rule__YAdditiveExpression__Alternatives_1_0");
			builder.put(grammarAccess.getOpAddAccess().getAlternatives(), "rule__OpAdd__Alternatives");
			builder.put(grammarAccess.getYMultiplicativeExpressionAccess().getOpAlternatives_1_1_0(), "rule__YMultiplicativeExpression__OpAlternatives_1_1_0");
			builder.put(grammarAccess.getYPrimaryAccess().getAlternatives(), "rule__YPrimary__Alternatives");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getAlternatives(), "rule__YTerminalExpression__Alternatives");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getValueAlternatives_2_1_0(), "rule__YTerminalExpression__ValueAlternatives_2_1_0");
			builder.put(grammarAccess.getYAnnotationAccess().getAlternatives(), "rule__YAnnotation__Alternatives");
			builder.put(grammarAccess.getYAnnotIdInnerAccess().getAlternatives(), "rule__YAnnotIdInner__Alternatives");
			builder.put(grammarAccess.getYAnnotEntityInnerAccess().getAlternatives(), "rule__YAnnotEntityInner__Alternatives");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getAlternatives(), "rule__YAnnotExpression__Alternatives");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAlternatives_3_1_0(), "rule__YAnnotExpression__ValueAlternatives_3_1_0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getTypeAlternatives_4_0(), "rule__YAnnotColumn__TypeAlternatives_4_0");
			builder.put(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAlternatives_3_0(), "rule__YAnnotAbstractColumn__TypeAlternatives_3_0");
			builder.put(grammarAccess.getYAccessLevelAccess().getAlternatives(), "rule__YAccessLevel__Alternatives");
			builder.put(grammarAccess.getYWidgetAccess().getGroup(), "rule__YWidget__Group__0");
			builder.put(grammarAccess.getYWidgetAccess().getGroup_0(), "rule__YWidget__Group_0__0");
			builder.put(grammarAccess.getYArgumentAccess().getGroup(), "rule__YArgument__Group__0");
			builder.put(grammarAccess.getYClassAccess().getGroup(), "rule__YClass__Group__0");
			builder.put(grammarAccess.getYClassAccess().getGroup_3(), "rule__YClass__Group_3__0");
			builder.put(grammarAccess.getYClassAccess().getGroup_4(), "rule__YClass__Group_4__0");
			builder.put(grammarAccess.getYTypedDeclarationAccess().getGroup(), "rule__YTypedDeclaration__Group__0");
			builder.put(grammarAccess.getYPropertyAccess().getGroup(), "rule__YProperty__Group__0");
			builder.put(grammarAccess.getYPropertyAccess().getGroup_5(), "rule__YProperty__Group_5__0");
			builder.put(grammarAccess.getYTuplesAccess().getGroup(), "rule__YTuples__Group__0");
			builder.put(grammarAccess.getYTuplesAccess().getGroup_2(), "rule__YTuples__Group_2__0");
			builder.put(grammarAccess.getYTuplesAccess().getGroup_2_1(), "rule__YTuples__Group_2_1__0");
			builder.put(grammarAccess.getYFunctionAccess().getGroup(), "rule__YFunction__Group__0");
			builder.put(grammarAccess.getYFunctionAccess().getGroup_4(), "rule__YFunction__Group_4__0");
			builder.put(grammarAccess.getYFunctionAccess().getGroup_4_1(), "rule__YFunction__Group_4_1__0");
			builder.put(grammarAccess.getYBlockAccess().getGroup(), "rule__YBlock__Group__0");
			builder.put(grammarAccess.getYStatementAccess().getGroup_12(), "rule__YStatement__Group_12__0");
			builder.put(grammarAccess.getYVariableDeclarationAccess().getGroup(), "rule__YVariableDeclaration__Group__0");
			builder.put(grammarAccess.getYReturnAccess().getGroup(), "rule__YReturn__Group__0");
			builder.put(grammarAccess.getYIfStatementAccess().getGroup(), "rule__YIfStatement__Group__0");
			builder.put(grammarAccess.getYIfStatementAccess().getGroup_5(), "rule__YIfStatement__Group_5__0");
			builder.put(grammarAccess.getYSwitchStatementAccess().getGroup(), "rule__YSwitchStatement__Group__0");
			builder.put(grammarAccess.getYSwitchStatementAccess().getGroup_5(), "rule__YSwitchStatement__Group_5__0");
			builder.put(grammarAccess.getYSwitchCaseAccess().getGroup(), "rule__YSwitchCase__Group__0");
			builder.put(grammarAccess.getYSwitchCaseAccess().getGroup_1(), "rule__YSwitchCase__Group_1__0");
			builder.put(grammarAccess.getYAssignmentAccess().getGroup(), "rule__YAssignment__Group__0");
			builder.put(grammarAccess.getYAssignmentAccess().getGroup_1(), "rule__YAssignment__Group_1__0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getGroup(), "rule__YSelectionExpression__Group__0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getGroup_1(), "rule__YSelectionExpression__Group_1__0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getGroup_1_3(), "rule__YSelectionExpression__Group_1_3__0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getGroup_1_3_1(), "rule__YSelectionExpression__Group_1_3_1__0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getGroup_1_3_1_1(), "rule__YSelectionExpression__Group_1_3_1_1__0");
			builder.put(grammarAccess.getYOrExpressionAccess().getGroup(), "rule__YOrExpression__Group__0");
			builder.put(grammarAccess.getYOrExpressionAccess().getGroup_1(), "rule__YOrExpression__Group_1__0");
			builder.put(grammarAccess.getYAndExpressionAccess().getGroup(), "rule__YAndExpression__Group__0");
			builder.put(grammarAccess.getYAndExpressionAccess().getGroup_1(), "rule__YAndExpression__Group_1__0");
			builder.put(grammarAccess.getYEqualityExpressionAccess().getGroup(), "rule__YEqualityExpression__Group__0");
			builder.put(grammarAccess.getYEqualityExpressionAccess().getGroup_1(), "rule__YEqualityExpression__Group_1__0");
			builder.put(grammarAccess.getYComparisonExpressionAccess().getGroup(), "rule__YComparisonExpression__Group__0");
			builder.put(grammarAccess.getYComparisonExpressionAccess().getGroup_1(), "rule__YComparisonExpression__Group_1__0");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getGroup(), "rule__YAdditiveExpression__Group__0");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getGroup_1(), "rule__YAdditiveExpression__Group_1__0");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getGroup_1_0_0(), "rule__YAdditiveExpression__Group_1_0_0__0");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getGroup_1_0_1(), "rule__YAdditiveExpression__Group_1_0_1__0");
			builder.put(grammarAccess.getYMultiplicativeExpressionAccess().getGroup(), "rule__YMultiplicativeExpression__Group__0");
			builder.put(grammarAccess.getYMultiplicativeExpressionAccess().getGroup_1(), "rule__YMultiplicativeExpression__Group_1__0");
			builder.put(grammarAccess.getYPrimaryAccess().getGroup_0(), "rule__YPrimary__Group_0__0");
			builder.put(grammarAccess.getYPrimaryAccess().getGroup_1(), "rule__YPrimary__Group_1__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_0(), "rule__YTerminalExpression__Group_0__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_1(), "rule__YTerminalExpression__Group_1__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_2(), "rule__YTerminalExpression__Group_2__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_3(), "rule__YTerminalExpression__Group_3__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_4(), "rule__YTerminalExpression__Group_4__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_5(), "rule__YTerminalExpression__Group_5__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_6(), "rule__YTerminalExpression__Group_6__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_7(), "rule__YTerminalExpression__Group_7__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_7_4(), "rule__YTerminalExpression__Group_7_4__0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getGroup_7_4_1(), "rule__YTerminalExpression__Group_7_4_1__0");
			builder.put(grammarAccess.getYReadStatementAccess().getGroup(), "rule__YReadStatement__Group__0");
			builder.put(grammarAccess.getYReadStatementAccess().getGroup_2(), "rule__YReadStatement__Group_2__0");
			builder.put(grammarAccess.getYReadEachStatementAccess().getGroup(), "rule__YReadEachStatement__Group__0");
			builder.put(grammarAccess.getYReadEachStatementAccess().getGroup_2(), "rule__YReadEachStatement__Group_2__0");
			builder.put(grammarAccess.getYCreateStatementAccess().getGroup(), "rule__YCreateStatement__Group__0");
			builder.put(grammarAccess.getYUpdateStatementAccess().getGroup(), "rule__YUpdateStatement__Group__0");
			builder.put(grammarAccess.getYDeleteStatementAccess().getGroup(), "rule__YDeleteStatement__Group__0");
			builder.put(grammarAccess.getYAssociateStatementAccess().getGroup(), "rule__YAssociateStatement__Group__0");
			builder.put(grammarAccess.getYDisassociateStatementAccess().getGroup(), "rule__YDisassociateStatement__Group__0");
			builder.put(grammarAccess.getYStructRefPairAccess().getGroup(), "rule__YStructRefPair__Group__0");
			builder.put(grammarAccess.getYJoinAccess().getGroup(), "rule__YJoin__Group__0");
			builder.put(grammarAccess.getYJoinAccess().getGroup_3(), "rule__YJoin__Group_3__0");
			builder.put(grammarAccess.getYJoinDefAccess().getGroup(), "rule__YJoinDef__Group__0");
			builder.put(grammarAccess.getYWhereAccess().getGroup(), "rule__YWhere__Group__0");
			builder.put(grammarAccess.getYWhileStatementAccess().getGroup(), "rule__YWhileStatement__Group__0");
			builder.put(grammarAccess.getYRepeatWhileStatementAccess().getGroup(), "rule__YRepeatWhileStatement__Group__0");
			builder.put(grammarAccess.getYForInStatementAccess().getGroup(), "rule__YForInStatement__Group__0");
			builder.put(grammarAccess.getYModelAccess().getGroup(), "rule__YModel__Group__0");
			builder.put(grammarAccess.getYModelAccess().getGroup_0(), "rule__YModel__Group_0__0");
			builder.put(grammarAccess.getYImportAccess().getGroup(), "rule__YImport__Group__0");
			builder.put(grammarAccess.getYAnnotEntityAccess().getGroup(), "rule__YAnnotEntity__Group__0");
			builder.put(grammarAccess.getYAnnotEntityAccess().getGroup_3(), "rule__YAnnotEntity__Group_3__0");
			builder.put(grammarAccess.getYAnnotEntityAccess().getGroup_3_1(), "rule__YAnnotEntity__Group_3_1__0");
			builder.put(grammarAccess.getYAnnotEntityAccess().getGroup_3_1_1(), "rule__YAnnotEntity__Group_3_1_1__0");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getGroup(), "rule__YAnnotAttribute__Group__0");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getGroup_4(), "rule__YAnnotAttribute__Group_4__0");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1(), "rule__YAnnotAttribute__Group_4_1__0");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1_1(), "rule__YAnnotAttribute__Group_4_1_1__0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getGroup(), "rule__YAnnotRelationship__Group__0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getGroup_7(), "rule__YAnnotRelationship__Group_7__0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1(), "rule__YAnnotRelationship__Group_7_1__0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1_1(), "rule__YAnnotRelationship__Group_7_1_1__0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getGroup_8(), "rule__YAnnotRelationship__Group_8__0");
			builder.put(grammarAccess.getYAnnotIdentifierAccess().getGroup(), "rule__YAnnotIdentifier__Group__0");
			builder.put(grammarAccess.getYAnnotIdentifierAccess().getGroup_5(), "rule__YAnnotIdentifier__Group_5__0");
			builder.put(grammarAccess.getYAnnotationElementValuePairAccess().getGroup(), "rule__YAnnotationElementValuePair__Group__0");
			builder.put(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0(), "rule__YAnnotationElementValuePair__Group_0__0");
			builder.put(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0_0(), "rule__YAnnotationElementValuePair__Group_0_0__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_0(), "rule__YAnnotExpression__Group_0__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_1(), "rule__YAnnotExpression__Group_1__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_2(), "rule__YAnnotExpression__Group_2__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_3(), "rule__YAnnotExpression__Group_3__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_4(), "rule__YAnnotExpression__Group_4__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_4_1(), "rule__YAnnotExpression__Group_4_1__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2(), "rule__YAnnotExpression__Group_4_2__0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2_1(), "rule__YAnnotExpression__Group_4_2_1__0");
			builder.put(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup(), "rule__YAnnotTechnicalDesign__Group__0");
			builder.put(grammarAccess.getYAnnotTableAccess().getGroup(), "rule__YAnnotTable__Group__0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getGroup(), "rule__YAnnotColumn__Group__0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getGroup_6(), "rule__YAnnotColumn__Group_6__0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getGroup_6_1(), "rule__YAnnotColumn__Group_6_1__0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getGroup_6_1_1(), "rule__YAnnotColumn__Group_6_1_1__0");
			builder.put(grammarAccess.getYAnnotColumnLikeAccess().getGroup(), "rule__YAnnotColumnLike__Group__0");
			builder.put(grammarAccess.getYAnnotAbstractColumnAccess().getGroup(), "rule__YAnnotAbstractColumn__Group__0");
			builder.put(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup(), "rule__YAnnotPrimaryKey__Group__0");
			builder.put(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup_4(), "rule__YAnnotPrimaryKey__Group_4__0");
			builder.put(grammarAccess.getYAnnotForeignKeyAccess().getGroup(), "rule__YAnnotForeignKey__Group__0");
			builder.put(grammarAccess.getYAnnotForeignKeyAccess().getGroup_5(), "rule__YAnnotForeignKey__Group_5__0");
			builder.put(grammarAccess.getYAnnotJavaAccess().getGroup(), "rule__YAnnotJava__Group__0");
			builder.put(grammarAccess.getYAnnotJavaAccess().getGroup_2(), "rule__YAnnotJava__Group_2__0");
			builder.put(grammarAccess.getYAnnotSwiftAccess().getGroup(), "rule__YAnnotSwift__Group__0");
			builder.put(grammarAccess.getYAnnotSwiftAccess().getGroup_4(), "rule__YAnnotSwift__Group_4__0");
			builder.put(grammarAccess.getYAnnotDatabaseAccess().getGroup(), "rule__YAnnotDatabase__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup(), "rule__QualifiedName__Group__0");
			builder.put(grammarAccess.getQualifiedNameAccess().getGroup_1(), "rule__QualifiedName__Group_1__0");
			builder.put(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup(), "rule__QualifiedNameWithWildcard__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup(), "rule__Number__Group__0");
			builder.put(grammarAccess.getNumberAccess().getGroup_1(), "rule__Number__Group_1__0");
			builder.put(grammarAccess.getYWidgetAccess().getNameAssignment_0_1(), "rule__YWidget__NameAssignment_0_1");
			builder.put(grammarAccess.getYWidgetAccess().getImportsAssignment_1(), "rule__YWidget__ImportsAssignment_1");
			builder.put(grammarAccess.getYWidgetAccess().getClassesAssignment_2(), "rule__YWidget__ClassesAssignment_2");
			builder.put(grammarAccess.getYArgumentAccess().getNameAssignment_0(), "rule__YArgument__NameAssignment_0");
			builder.put(grammarAccess.getYArgumentAccess().getValueAssignment_2(), "rule__YArgument__ValueAssignment_2");
			builder.put(grammarAccess.getYClassAccess().getNameAssignment_2(), "rule__YClass__NameAssignment_2");
			builder.put(grammarAccess.getYClassAccess().getSuperclassAssignment_3_1(), "rule__YClass__SuperclassAssignment_3_1");
			builder.put(grammarAccess.getYClassAccess().getEntityRefAssignment_4_1(), "rule__YClass__EntityRefAssignment_4_1");
			builder.put(grammarAccess.getYClassAccess().getInnersAssignment_6(), "rule__YClass__InnersAssignment_6");
			builder.put(grammarAccess.getYClassAccess().getMembersAssignment_7(), "rule__YClass__MembersAssignment_7");
			builder.put(grammarAccess.getYTypedDeclarationAccess().getNameAssignment_0(), "rule__YTypedDeclaration__NameAssignment_0");
			builder.put(grammarAccess.getYTypedDeclarationAccess().getTypeAssignment_2(), "rule__YTypedDeclaration__TypeAssignment_2");
			builder.put(grammarAccess.getYPropertyAccess().getAccessAssignment_0(), "rule__YProperty__AccessAssignment_0");
			builder.put(grammarAccess.getYPropertyAccess().getTuplesAssignment_3(), "rule__YProperty__TuplesAssignment_3");
			builder.put(grammarAccess.getYPropertyAccess().getOptionalAssignment_4(), "rule__YProperty__OptionalAssignment_4");
			builder.put(grammarAccess.getYPropertyAccess().getAttrRefAssignment_5_1(), "rule__YProperty__AttrRefAssignment_5_1");
			builder.put(grammarAccess.getYTuplesAccess().getIncludesAssignment_2_0(), "rule__YTuples__IncludesAssignment_2_0");
			builder.put(grammarAccess.getYTuplesAccess().getIncludesAssignment_2_1_1(), "rule__YTuples__IncludesAssignment_2_1_1");
			builder.put(grammarAccess.getYFunctionAccess().getAccessAssignment_0(), "rule__YFunction__AccessAssignment_0");
			builder.put(grammarAccess.getYFunctionAccess().getNameAssignment_2(), "rule__YFunction__NameAssignment_2");
			builder.put(grammarAccess.getYFunctionAccess().getParamsAssignment_4_0(), "rule__YFunction__ParamsAssignment_4_0");
			builder.put(grammarAccess.getYFunctionAccess().getParamsAssignment_4_1_1(), "rule__YFunction__ParamsAssignment_4_1_1");
			builder.put(grammarAccess.getYFunctionAccess().getReturnvalueAssignment_6(), "rule__YFunction__ReturnvalueAssignment_6");
			builder.put(grammarAccess.getYFunctionAccess().getTypeAssignment_7(), "rule__YFunction__TypeAssignment_7");
			builder.put(grammarAccess.getYFunctionAccess().getBodyAssignment_8(), "rule__YFunction__BodyAssignment_8");
			builder.put(grammarAccess.getYBlockAccess().getStatementsAssignment_2(), "rule__YBlock__StatementsAssignment_2");
			builder.put(grammarAccess.getYVariableDeclarationAccess().getExpressionAssignment_2(), "rule__YVariableDeclaration__ExpressionAssignment_2");
			builder.put(grammarAccess.getYReturnAccess().getExpressionAssignment_2(), "rule__YReturn__ExpressionAssignment_2");
			builder.put(grammarAccess.getYIfStatementAccess().getExpressionAssignment_2(), "rule__YIfStatement__ExpressionAssignment_2");
			builder.put(grammarAccess.getYIfStatementAccess().getThenBlockAssignment_4(), "rule__YIfStatement__ThenBlockAssignment_4");
			builder.put(grammarAccess.getYIfStatementAccess().getElseBlockAssignment_5_1(), "rule__YIfStatement__ElseBlockAssignment_5_1");
			builder.put(grammarAccess.getYSwitchStatementAccess().getSwitchExpressionAssignment_2(), "rule__YSwitchStatement__SwitchExpressionAssignment_2");
			builder.put(grammarAccess.getYSwitchStatementAccess().getCasesAssignment_4(), "rule__YSwitchStatement__CasesAssignment_4");
			builder.put(grammarAccess.getYSwitchStatementAccess().getDefaultAssignment_5_2(), "rule__YSwitchStatement__DefaultAssignment_5_2");
			builder.put(grammarAccess.getYSwitchCaseAccess().getCaseExpressionAssignment_1_1(), "rule__YSwitchCase__CaseExpressionAssignment_1_1");
			builder.put(grammarAccess.getYSwitchCaseAccess().getThenAssignment_3(), "rule__YSwitchCase__ThenAssignment_3");
			builder.put(grammarAccess.getYAssignmentAccess().getRightAssignment_1_2(), "rule__YAssignment__RightAssignment_1_2");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getMemberAssignment_1_2(), "rule__YSelectionExpression__MemberAssignment_1_2");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getFunctioninvocationAssignment_1_3_0(), "rule__YSelectionExpression__FunctioninvocationAssignment_1_3_0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getArgsAssignment_1_3_1_0(), "rule__YSelectionExpression__ArgsAssignment_1_3_1_0");
			builder.put(grammarAccess.getYSelectionExpressionAccess().getArgsAssignment_1_3_1_1_1(), "rule__YSelectionExpression__ArgsAssignment_1_3_1_1_1");
			builder.put(grammarAccess.getYOrExpressionAccess().getRightAssignment_1_2(), "rule__YOrExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getYAndExpressionAccess().getRightAssignment_1_2(), "rule__YAndExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getYEqualityExpressionAccess().getOpAssignment_1_1(), "rule__YEqualityExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getYEqualityExpressionAccess().getRightAssignment_1_2(), "rule__YEqualityExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getYComparisonExpressionAccess().getOpAssignment_1_1(), "rule__YComparisonExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getYComparisonExpressionAccess().getRightAssignment_1_2(), "rule__YComparisonExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getYAdditiveExpressionAccess().getRightAssignment_1_1(), "rule__YAdditiveExpression__RightAssignment_1_1");
			builder.put(grammarAccess.getYMultiplicativeExpressionAccess().getOpAssignment_1_1(), "rule__YMultiplicativeExpression__OpAssignment_1_1");
			builder.put(grammarAccess.getYMultiplicativeExpressionAccess().getRightAssignment_1_2(), "rule__YMultiplicativeExpression__RightAssignment_1_2");
			builder.put(grammarAccess.getYPrimaryAccess().getAAssignment_0_2(), "rule__YPrimary__AAssignment_0_2");
			builder.put(grammarAccess.getYPrimaryAccess().getExpressionAssignment_1_2(), "rule__YPrimary__ExpressionAssignment_1_2");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getValueAssignment_0_1(), "rule__YTerminalExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getValueAssignment_1_1(), "rule__YTerminalExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getValueAssignment_2_1(), "rule__YTerminalExpression__ValueAssignment_2_1");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getSymbolAssignment_6_1(), "rule__YTerminalExpression__SymbolAssignment_6_1");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getTypeAssignment_7_2(), "rule__YTerminalExpression__TypeAssignment_7_2");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getArgumentsAssignment_7_4_0(), "rule__YTerminalExpression__ArgumentsAssignment_7_4_0");
			builder.put(grammarAccess.getYTerminalExpressionAccess().getArgumentsAssignment_7_4_1_1(), "rule__YTerminalExpression__ArgumentsAssignment_7_4_1_1");
			builder.put(grammarAccess.getYReadStatementAccess().getStructsAssignment_1(), "rule__YReadStatement__StructsAssignment_1");
			builder.put(grammarAccess.getYReadStatementAccess().getStructsAssignment_2_1(), "rule__YReadStatement__StructsAssignment_2_1");
			builder.put(grammarAccess.getYReadStatementAccess().getJoinclauseAssignment_3(), "rule__YReadStatement__JoinclauseAssignment_3");
			builder.put(grammarAccess.getYReadStatementAccess().getWhereclauseAssignment_4(), "rule__YReadStatement__WhereclauseAssignment_4");
			builder.put(grammarAccess.getYReadStatementAccess().getSuccessAssignment_6(), "rule__YReadStatement__SuccessAssignment_6");
			builder.put(grammarAccess.getYReadStatementAccess().getNotfoundAssignment_9(), "rule__YReadStatement__NotfoundAssignment_9");
			builder.put(grammarAccess.getYReadEachStatementAccess().getStructsAssignment_1(), "rule__YReadEachStatement__StructsAssignment_1");
			builder.put(grammarAccess.getYReadEachStatementAccess().getStructsAssignment_2_1(), "rule__YReadEachStatement__StructsAssignment_2_1");
			builder.put(grammarAccess.getYReadEachStatementAccess().getJoinclauseAssignment_3(), "rule__YReadEachStatement__JoinclauseAssignment_3");
			builder.put(grammarAccess.getYReadEachStatementAccess().getWhereclauseAssignment_4(), "rule__YReadEachStatement__WhereclauseAssignment_4");
			builder.put(grammarAccess.getYReadEachStatementAccess().getTargetAssignment_6(), "rule__YReadEachStatement__TargetAssignment_6");
			builder.put(grammarAccess.getYReadEachStatementAccess().getSuccessAssignment_7(), "rule__YReadEachStatement__SuccessAssignment_7");
			builder.put(grammarAccess.getYCreateStatementAccess().getStructAssignment_1(), "rule__YCreateStatement__StructAssignment_1");
			builder.put(grammarAccess.getYCreateStatementAccess().getSetBlockAssignment_2(), "rule__YCreateStatement__SetBlockAssignment_2");
			builder.put(grammarAccess.getYCreateStatementAccess().getSuccessAssignment_4(), "rule__YCreateStatement__SuccessAssignment_4");
			builder.put(grammarAccess.getYCreateStatementAccess().getAlreadyExistAssignment_7(), "rule__YCreateStatement__AlreadyExistAssignment_7");
			builder.put(grammarAccess.getYUpdateStatementAccess().getStructAssignment_1(), "rule__YUpdateStatement__StructAssignment_1");
			builder.put(grammarAccess.getYUpdateStatementAccess().getSetBlockAssignment_2(), "rule__YUpdateStatement__SetBlockAssignment_2");
			builder.put(grammarAccess.getYUpdateStatementAccess().getSuccessAssignment_4(), "rule__YUpdateStatement__SuccessAssignment_4");
			builder.put(grammarAccess.getYDeleteStatementAccess().getStructAssignment_1(), "rule__YDeleteStatement__StructAssignment_1");
			builder.put(grammarAccess.getYAssociateStatementAccess().getStructAssignment_1(), "rule__YAssociateStatement__StructAssignment_1");
			builder.put(grammarAccess.getYAssociateStatementAccess().getJoinrefAssignment_3(), "rule__YAssociateStatement__JoinrefAssignment_3");
			builder.put(grammarAccess.getYDisassociateStatementAccess().getStructAssignment_1(), "rule__YDisassociateStatement__StructAssignment_1");
			builder.put(grammarAccess.getYDisassociateStatementAccess().getJoinrefAssignment_3(), "rule__YDisassociateStatement__JoinrefAssignment_3");
			builder.put(grammarAccess.getYStructRefPairAccess().getStructpropertyAssignment_0(), "rule__YStructRefPair__StructpropertyAssignment_0");
			builder.put(grammarAccess.getYStructRefPairAccess().getStructclassAssignment_2(), "rule__YStructRefPair__StructclassAssignment_2");
			builder.put(grammarAccess.getYJoinAccess().getJoindefsAssignment_2(), "rule__YJoin__JoindefsAssignment_2");
			builder.put(grammarAccess.getYJoinAccess().getJoindefsAssignment_3_1(), "rule__YJoin__JoindefsAssignment_3_1");
			builder.put(grammarAccess.getYJoinDefAccess().getFromViewAssignment_0(), "rule__YJoinDef__FromViewAssignment_0");
			builder.put(grammarAccess.getYJoinDefAccess().getRelRefAssignment_2(), "rule__YJoinDef__RelRefAssignment_2");
			builder.put(grammarAccess.getYJoinDefAccess().getToViewAssignment_4(), "rule__YJoinDef__ToViewAssignment_4");
			builder.put(grammarAccess.getYWhereAccess().getExpressionAssignment_2(), "rule__YWhere__ExpressionAssignment_2");
			builder.put(grammarAccess.getYWhileStatementAccess().getExpressionAssignment_2(), "rule__YWhileStatement__ExpressionAssignment_2");
			builder.put(grammarAccess.getYWhileStatementAccess().getBodyAssignment_4(), "rule__YWhileStatement__BodyAssignment_4");
			builder.put(grammarAccess.getYRepeatWhileStatementAccess().getBodyAssignment_1(), "rule__YRepeatWhileStatement__BodyAssignment_1");
			builder.put(grammarAccess.getYRepeatWhileStatementAccess().getExpressionAssignment_4(), "rule__YRepeatWhileStatement__ExpressionAssignment_4");
			builder.put(grammarAccess.getYForInStatementAccess().getItemAssignment_1(), "rule__YForInStatement__ItemAssignment_1");
			builder.put(grammarAccess.getYForInStatementAccess().getCollectionAssignment_3(), "rule__YForInStatement__CollectionAssignment_3");
			builder.put(grammarAccess.getYForInStatementAccess().getBodyAssignment_4(), "rule__YForInStatement__BodyAssignment_4");
			builder.put(grammarAccess.getYModelAccess().getNameAssignment_0_1(), "rule__YModel__NameAssignment_0_1");
			builder.put(grammarAccess.getYModelAccess().getImportsAssignment_1(), "rule__YModel__ImportsAssignment_1");
			builder.put(grammarAccess.getYModelAccess().getAnnotationsAssignment_2(), "rule__YModel__AnnotationsAssignment_2");
			builder.put(grammarAccess.getYImportAccess().getImportedNamespaceAssignment_1(), "rule__YImport__ImportedNamespaceAssignment_1");
			builder.put(grammarAccess.getYAnnotEntityAccess().getNameAssignment_2(), "rule__YAnnotEntity__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_0(), "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0");
			builder.put(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_1_1(), "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1");
			builder.put(grammarAccess.getYAnnotEntityAccess().getAnnotationsAssignment_5(), "rule__YAnnotEntity__AnnotationsAssignment_5");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getNameAssignment_2(), "rule__YAnnotAttribute__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getOptionalAssignment_3(), "rule__YAnnotAttribute__OptionalAssignment_3");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_0(), "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0");
			builder.put(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_1_1(), "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getNameAssignment_2(), "rule__YAnnotRelationship__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getOptionalAssignment_3(), "rule__YAnnotRelationship__OptionalAssignment_3");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getTargetAssignment_5(), "rule__YAnnotRelationship__TargetAssignment_5");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getManyAssignment_6(), "rule__YAnnotRelationship__ManyAssignment_6");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_0(), "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_1_1(), "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1");
			builder.put(grammarAccess.getYAnnotRelationshipAccess().getInverseAssignment_8_1(), "rule__YAnnotRelationship__InverseAssignment_8_1");
			builder.put(grammarAccess.getYAnnotIdentifierAccess().getNameAssignment_2(), "rule__YAnnotIdentifier__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_4(), "rule__YAnnotIdentifier__AnnotsAssignment_4");
			builder.put(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_5_1(), "rule__YAnnotIdentifier__AnnotsAssignment_5_1");
			builder.put(grammarAccess.getYAnnotationElementValuePairAccess().getNameAssignment_0_0_0(), "rule__YAnnotationElementValuePair__NameAssignment_0_0_0");
			builder.put(grammarAccess.getYAnnotationElementValuePairAccess().getValueAssignment_1(), "rule__YAnnotationElementValuePair__ValueAssignment_1");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_0_1(), "rule__YAnnotExpression__ValueAssignment_0_1");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_1_1(), "rule__YAnnotExpression__ValueAssignment_1_1");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_2_1(), "rule__YAnnotExpression__ValueAssignment_2_1");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_3_1(), "rule__YAnnotExpression__ValueAssignment_3_1");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_0(), "rule__YAnnotExpression__ElementsAssignment_4_2_0");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_1_1(), "rule__YAnnotExpression__ElementsAssignment_4_2_1_1");
			builder.put(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseAssignment_3(), "rule__YAnnotTechnicalDesign__DatabaseAssignment_3");
			builder.put(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesAssignment_5(), "rule__YAnnotTechnicalDesign__FeaturesAssignment_5");
			builder.put(grammarAccess.getYAnnotTableAccess().getNameAssignment_2(), "rule__YAnnotTable__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotTableAccess().getEntityrefAssignment_4(), "rule__YAnnotTable__EntityrefAssignment_4");
			builder.put(grammarAccess.getYAnnotTableAccess().getColumnsAssignment_6(), "rule__YAnnotTable__ColumnsAssignment_6");
			builder.put(grammarAccess.getYAnnotTableAccess().getPrimarykeyAssignment_7(), "rule__YAnnotTable__PrimarykeyAssignment_7");
			builder.put(grammarAccess.getYAnnotTableAccess().getForeignkeysAssignment_8(), "rule__YAnnotTable__ForeignkeysAssignment_8");
			builder.put(grammarAccess.getYAnnotColumnAccess().getAttrrefAssignment_2(), "rule__YAnnotColumn__AttrrefAssignment_2");
			builder.put(grammarAccess.getYAnnotColumnAccess().getTypeAssignment_4(), "rule__YAnnotColumn__TypeAssignment_4");
			builder.put(grammarAccess.getYAnnotColumnAccess().getOptionalAssignment_5(), "rule__YAnnotColumn__OptionalAssignment_5");
			builder.put(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_0(), "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_1_1(), "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1");
			builder.put(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefAssignment_2(), "rule__YAnnotColumnLike__ColumnrefAssignment_2");
			builder.put(grammarAccess.getYAnnotAbstractColumnAccess().getNameAssignment_2(), "rule__YAnnotAbstractColumn__NameAssignment_2");
			builder.put(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAssignment_3(), "rule__YAnnotAbstractColumn__TypeAssignment_3");
			builder.put(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_3(), "rule__YAnnotPrimaryKey__ColumnsAssignment_3");
			builder.put(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_4_1(), "rule__YAnnotPrimaryKey__ColumnsAssignment_4_1");
			builder.put(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipAssignment_2(), "rule__YAnnotForeignKey__RelationshipAssignment_2");
			builder.put(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_4(), "rule__YAnnotForeignKey__ColumnsAssignment_4");
			builder.put(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_5_1(), "rule__YAnnotForeignKey__ColumnsAssignment_5_1");
			builder.put(grammarAccess.getYAnnotJavaAccess().getDatabaseAssignment_2_1(), "rule__YAnnotJava__DatabaseAssignment_2_1");
			builder.put(grammarAccess.getYAnnotSwiftAccess().getNameAssignment_3(), "rule__YAnnotSwift__NameAssignment_3");
			builder.put(grammarAccess.getYAnnotSwiftAccess().getDatabaseAssignment_4_1(), "rule__YAnnotSwift__DatabaseAssignment_4_1");
			builder.put(grammarAccess.getYAnnotDatabaseAccess().getNameAssignment_2(), "rule__YAnnotDatabase__NameAssignment_2");
		}
	}
	
	@Inject
	private NameMappings nameMappings;

	@Inject
	private LangGrammarAccess grammarAccess;

	@Override
	protected InternalLangParser createParser() {
		InternalLangParser result = new InternalLangParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}

	@Override
	protected String getRuleName(AbstractElement element) {
		return nameMappings.getRuleName(element);
	}

	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}

	public LangGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(LangGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}