/*
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.serializer;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.services.LangGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class LangSyntacticSequencer extends AbstractSyntacticSequencer {

	protected LangGrammarAccess grammarAccess;
	protected AbstractElementAlias match_YAnnotAttribute_SemicolonKeyword_5_q;
	protected AbstractElementAlias match_YAnnotAttribute___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q;
	protected AbstractElementAlias match_YAnnotColumnLike_SemicolonKeyword_3_q;
	protected AbstractElementAlias match_YAnnotColumn_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_YAnnotColumn___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q;
	protected AbstractElementAlias match_YAnnotEntity___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_YAnnotForeignKey_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_YAnnotIdentifier_SemicolonKeyword_7_q;
	protected AbstractElementAlias match_YAnnotPrimaryKey_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_YAnnotRelationship_SemicolonKeyword_9_q;
	protected AbstractElementAlias match_YAnnotRelationship___LeftParenthesisKeyword_7_0_RightParenthesisKeyword_7_2__q;
	protected AbstractElementAlias match_YEnumerationCase___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q;
	protected AbstractElementAlias match_YModel_SemicolonKeyword_2_q;
	protected AbstractElementAlias match_YStatement_SemicolonKeyword_12_1_q;
	protected AbstractElementAlias match_YThrow_SemicolonKeyword_6_q;
	protected AbstractElementAlias match_YWidget_SemicolonKeyword_2_q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (LangGrammarAccess) access;
		match_YAnnotAttribute_SemicolonKeyword_5_q = new TokenAlias(false, true, grammarAccess.getYAnnotAttributeAccess().getSemicolonKeyword_5());
		match_YAnnotAttribute___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0()), new TokenAlias(false, false, grammarAccess.getYAnnotAttributeAccess().getRightParenthesisKeyword_4_2()));
		match_YAnnotColumnLike_SemicolonKeyword_3_q = new TokenAlias(false, true, grammarAccess.getYAnnotColumnLikeAccess().getSemicolonKeyword_3());
		match_YAnnotColumn_SemicolonKeyword_7_q = new TokenAlias(false, true, grammarAccess.getYAnnotColumnAccess().getSemicolonKeyword_7());
		match_YAnnotColumn___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getYAnnotColumnAccess().getRightParenthesisKeyword_6_2()));
		match_YAnnotEntity___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getYAnnotEntityAccess().getRightParenthesisKeyword_3_2()));
		match_YAnnotForeignKey_SemicolonKeyword_7_q = new TokenAlias(false, true, grammarAccess.getYAnnotForeignKeyAccess().getSemicolonKeyword_7());
		match_YAnnotIdentifier_SemicolonKeyword_7_q = new TokenAlias(false, true, grammarAccess.getYAnnotIdentifierAccess().getSemicolonKeyword_7());
		match_YAnnotPrimaryKey_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getYAnnotPrimaryKeyAccess().getSemicolonKeyword_6());
		match_YAnnotRelationship_SemicolonKeyword_9_q = new TokenAlias(false, true, grammarAccess.getYAnnotRelationshipAccess().getSemicolonKeyword_9());
		match_YAnnotRelationship___LeftParenthesisKeyword_7_0_RightParenthesisKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getYAnnotRelationshipAccess().getRightParenthesisKeyword_7_2()));
		match_YEnumerationCase___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getYEnumerationCaseAccess().getLeftParenthesisKeyword_3_0()), new TokenAlias(false, false, grammarAccess.getYEnumerationCaseAccess().getRightParenthesisKeyword_3_2()));
		match_YModel_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getYModelAccess().getSemicolonKeyword_2());
		match_YStatement_SemicolonKeyword_12_1_q = new TokenAlias(false, true, grammarAccess.getYStatementAccess().getSemicolonKeyword_12_1());
		match_YThrow_SemicolonKeyword_6_q = new TokenAlias(false, true, grammarAccess.getYThrowAccess().getSemicolonKeyword_6());
		match_YWidget_SemicolonKeyword_2_q = new TokenAlias(false, true, grammarAccess.getYWidgetAccess().getSemicolonKeyword_2());
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (ruleCall.getRule() == grammarAccess.getOpAndRule())
			return getOpAndToken(semanticObject, ruleCall, node);
		else if (ruleCall.getRule() == grammarAccess.getOpOrRule())
			return getOpOrToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * OpAnd:
	 * 	'&&';
	 */
	protected String getOpAndToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "&&";
	}
	
	/**
	 * OpOr:
	 * 	'||';
	 */
	protected String getOpOrToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "||";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if (match_YAnnotAttribute_SemicolonKeyword_5_q.equals(syntax))
				emit_YAnnotAttribute_SemicolonKeyword_5_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotAttribute___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q.equals(syntax))
				emit_YAnnotAttribute___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotColumnLike_SemicolonKeyword_3_q.equals(syntax))
				emit_YAnnotColumnLike_SemicolonKeyword_3_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotColumn_SemicolonKeyword_7_q.equals(syntax))
				emit_YAnnotColumn_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotColumn___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q.equals(syntax))
				emit_YAnnotColumn___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotEntity___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_YAnnotEntity___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotForeignKey_SemicolonKeyword_7_q.equals(syntax))
				emit_YAnnotForeignKey_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotIdentifier_SemicolonKeyword_7_q.equals(syntax))
				emit_YAnnotIdentifier_SemicolonKeyword_7_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotPrimaryKey_SemicolonKeyword_6_q.equals(syntax))
				emit_YAnnotPrimaryKey_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotRelationship_SemicolonKeyword_9_q.equals(syntax))
				emit_YAnnotRelationship_SemicolonKeyword_9_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YAnnotRelationship___LeftParenthesisKeyword_7_0_RightParenthesisKeyword_7_2__q.equals(syntax))
				emit_YAnnotRelationship___LeftParenthesisKeyword_7_0_RightParenthesisKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YEnumerationCase___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q.equals(syntax))
				emit_YEnumerationCase___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YModel_SemicolonKeyword_2_q.equals(syntax))
				emit_YModel_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YStatement_SemicolonKeyword_12_1_q.equals(syntax))
				emit_YStatement_SemicolonKeyword_12_1_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YThrow_SemicolonKeyword_6_q.equals(syntax))
				emit_YThrow_SemicolonKeyword_6_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if (match_YWidget_SemicolonKeyword_2_q.equals(syntax))
				emit_YWidget_SemicolonKeyword_2_q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementValuePairs+=YAnnotationElementValuePair ')' (ambiguity) (rule end)
	 *     name=ValidID ('(' ')')? (ambiguity) (rule end)
	 *     optional='?' ('(' ')')? (ambiguity) (rule end)
	 */
	protected void emit_YAnnotAttribute_SemicolonKeyword_5_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ValidID (ambiguity) ';'? (rule end)
	 *     optional='?' (ambiguity) ';'? (rule end)
	 */
	protected void emit_YAnnotAttribute___LeftParenthesisKeyword_4_0_RightParenthesisKeyword_4_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     columnref=[YAnnotAbstractColumn|QualifiedName] (ambiguity) (rule end)
	 */
	protected void emit_YAnnotColumnLike_SemicolonKeyword_3_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementValuePairs+=YAnnotationElementValuePair ')' (ambiguity) (rule end)
	 *     optional='?' ('(' ')')? (ambiguity) (rule end)
	 *     type='BIGINT' ('(' ')')? (ambiguity) (rule end)
	 *     type='BOOLEAN' ('(' ')')? (ambiguity) (rule end)
	 *     type='CHAR' ('(' ')')? (ambiguity) (rule end)
	 *     type='DATE' ('(' ')')? (ambiguity) (rule end)
	 *     type='DECIMAL' ('(' ')')? (ambiguity) (rule end)
	 *     type='INTEGER' ('(' ')')? (ambiguity) (rule end)
	 *     type='SMALLINT' ('(' ')')? (ambiguity) (rule end)
	 *     type='TIME' ('(' ')')? (ambiguity) (rule end)
	 *     type='TIMESTAMP' ('(' ')')? (ambiguity) (rule end)
	 *     type='VARCHAR' ('(' ')')? (ambiguity) (rule end)
	 */
	protected void emit_YAnnotColumn_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     optional='?' (ambiguity) ';'? (rule end)
	 *     type='BIGINT' (ambiguity) ';'? (rule end)
	 *     type='BOOLEAN' (ambiguity) ';'? (rule end)
	 *     type='CHAR' (ambiguity) ';'? (rule end)
	 *     type='DATE' (ambiguity) ';'? (rule end)
	 *     type='DECIMAL' (ambiguity) ';'? (rule end)
	 *     type='INTEGER' (ambiguity) ';'? (rule end)
	 *     type='SMALLINT' (ambiguity) ';'? (rule end)
	 *     type='TIME' (ambiguity) ';'? (rule end)
	 *     type='TIMESTAMP' (ambiguity) ';'? (rule end)
	 *     type='VARCHAR' (ambiguity) ';'? (rule end)
	 */
	protected void emit_YAnnotColumn___LeftParenthesisKeyword_6_0_RightParenthesisKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ValidID (ambiguity) '{' '}' (rule end)
	 *     name=ValidID (ambiguity) '{' annotations+=YAnnotEntityInner
	 */
	protected void emit_YAnnotEntity___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     columns+=YAnnotAbstractColumn '}' (ambiguity) (rule end)
	 */
	protected void emit_YAnnotForeignKey_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     annots+=[YAnnotIdInner|ID] ')' (ambiguity) (rule end)
	 */
	protected void emit_YAnnotIdentifier_SemicolonKeyword_7_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) '@primary' '(' ')' (ambiguity) (rule start)
	 *     columns+=[YAnnotAbstractColumn|ID] ')' (ambiguity) (rule end)
	 */
	protected void emit_YAnnotPrimaryKey_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     elementValuePairs+=YAnnotationElementValuePair ')' (ambiguity) (rule end)
	 *     inverse=[YAnnotRelationship|QualifiedName] (ambiguity) (rule end)
	 *     many?='*' ('(' ')')? (ambiguity) (rule end)
	 *     target=[YAnnotEntity|QualifiedName] ('(' ')')? (ambiguity) (rule end)
	 */
	protected void emit_YAnnotRelationship_SemicolonKeyword_9_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     many?='*' (ambiguity) ';'? (rule end)
	 *     many?='*' (ambiguity) '<-' inverse=[YAnnotRelationship|QualifiedName]
	 *     target=[YAnnotEntity|QualifiedName] (ambiguity) ';'? (rule end)
	 *     target=[YAnnotEntity|QualifiedName] (ambiguity) '<-' inverse=[YAnnotRelationship|QualifiedName]
	 */
	protected void emit_YAnnotRelationship___LeftParenthesisKeyword_7_0_RightParenthesisKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ('(' ')')?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=ValidID (ambiguity) (rule end)
	 */
	protected void emit_YEnumerationCase___LeftParenthesisKeyword_3_0_RightParenthesisKeyword_3_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName (ambiguity) (rule end)
	 *     name=QualifiedName (ambiguity) annotations+=YAnnotation
	 *     name=QualifiedName (ambiguity) imports+=YImport
	 */
	protected void emit_YModel_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     (rule start) 'null' (ambiguity) (rule start)
	 *     (rule start) 'self' (ambiguity) (rule start)
	 *     (rule start) 'super' (ambiguity) (rule start)
	 *     args+=YOrExpression ')' (ambiguity) (rule end)
	 *     arguments+=YOrExpression ')' (ambiguity) (rule end)
	 *     functioninvocation?='(' ')' (ambiguity) (rule end)
	 *     member=[YMember|ID] (ambiguity) (rule end)
	 *     right=YOrExpression (ambiguity) (rule end)
	 *     symbol=[YSymbol|ID] (ambiguity) (rule end)
	 *     type=[YClass|QualifiedName] '(' ')' (ambiguity) (rule end)
	 *     value='false' (ambiguity) (rule end)
	 *     value='true' (ambiguity) (rule end)
	 *     value=INT (ambiguity) (rule end)
	 *     value=STRING (ambiguity) (rule end)
	 */
	protected void emit_YStatement_SemicolonKeyword_12_1_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     arguments+=YOrExpression ')' (ambiguity) (rule end)
	 *     exception=[YEnumerationCase|QualifiedName] '(' ')' (ambiguity) (rule end)
	 */
	protected void emit_YThrow_SemicolonKeyword_6_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Ambiguous syntax:
	 *     ';'?
	 *
	 * This ambiguous syntax occurs at:
	 *     name=QualifiedName (ambiguity) (rule end)
	 *     name=QualifiedName (ambiguity) classes+=YClass
	 *     name=QualifiedName (ambiguity) enums+=YEnumeration
	 *     name=QualifiedName (ambiguity) imports+=YImport
	 */
	protected void emit_YWidget_SemicolonKeyword_2_q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
