/*
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.ide.contentassist.antlr;

import com.google.common.collect.ImmutableMap;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import eu.jgen.notes.dmw.lite.mdl.ide.contentassist.antlr.internal.InternalModelParser;
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess;
import java.util.Map;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ide.editor.contentassist.antlr.AbstractContentAssistParser;

public class ModelParser extends AbstractContentAssistParser {

	@Singleton
	public static final class NameMappings {
		
		private final Map<AbstractElement, String> mappings;
		
		@Inject
		public NameMappings(ModelGrammarAccess grammarAccess) {
			ImmutableMap.Builder<AbstractElement, String> builder = ImmutableMap.builder();
			init(builder, grammarAccess);
			this.mappings = builder.build();
		}
		
		public String getRuleName(AbstractElement element) {
			return mappings.get(element);
		}
		
		private static void init(ImmutableMap.Builder<AbstractElement, String> builder, ModelGrammarAccess grammarAccess) {
			builder.put(grammarAccess.getYAnnotationAccess().getAlternatives(), "rule__YAnnotation__Alternatives");
			builder.put(grammarAccess.getYAnnotIdInnerAccess().getAlternatives(), "rule__YAnnotIdInner__Alternatives");
			builder.put(grammarAccess.getYAnnotEntityInnerAccess().getAlternatives(), "rule__YAnnotEntityInner__Alternatives");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getAlternatives(), "rule__YAnnotExpression__Alternatives");
			builder.put(grammarAccess.getYAnnotExpressionAccess().getValueAlternatives_3_1_0(), "rule__YAnnotExpression__ValueAlternatives_3_1_0");
			builder.put(grammarAccess.getYAnnotColumnAccess().getTypeAlternatives_4_0(), "rule__YAnnotColumn__TypeAlternatives_4_0");
			builder.put(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAlternatives_3_0(), "rule__YAnnotAbstractColumn__TypeAlternatives_3_0");
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
	private ModelGrammarAccess grammarAccess;

	@Override
	protected InternalModelParser createParser() {
		InternalModelParser result = new InternalModelParser(null);
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

	public ModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
	public NameMappings getNameMappings() {
		return nameMappings;
	}
	
	public void setNameMappings(NameMappings nameMappings) {
		this.nameMappings = nameMappings;
	}
}