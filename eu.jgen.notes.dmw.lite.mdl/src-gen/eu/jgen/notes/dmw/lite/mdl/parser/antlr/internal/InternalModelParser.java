package eu.jgen.notes.dmw.lite.mdl.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModelParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'@entity'", "'('", "','", "')'", "'{'", "'}'", "'@attribute'", "'?'", "'@relationship'", "'->'", "'*'", "'<-'", "'@identifier'", "'='", "'true'", "'false'", "'['", "']'", "'@td'", "'@table'", "'as'", "'VARCHAR'", "'CHAR'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'DECIMAL'", "'TIME'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", "'@column'", "'@primary'", "'@foreign'", "'.'", "'.*'"
    };
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int RULE_ID=4;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;

    // delegates
    // delegators


        public InternalModelParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalModelParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalModelParser.tokenNames; }
    public String getGrammarFileName() { return "InternalModel.g"; }



     	private ModelGrammarAccess grammarAccess;

        public InternalModelParser(TokenStream input, ModelGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "YModel";
       	}

       	@Override
       	protected ModelGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleYModel"
    // InternalModel.g:64:1: entryRuleYModel returns [EObject current=null] : iv_ruleYModel= ruleYModel EOF ;
    public final EObject entryRuleYModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYModel = null;


        try {
            // InternalModel.g:64:47: (iv_ruleYModel= ruleYModel EOF )
            // InternalModel.g:65:2: iv_ruleYModel= ruleYModel EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYModelRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYModel=ruleYModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYModel; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYModel"


    // $ANTLR start "ruleYModel"
    // InternalModel.g:71:1: ruleYModel returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* ) ;
    public final EObject ruleYModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalModel.g:77:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* ) )
            // InternalModel.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* )
            {
            // InternalModel.g:78:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* )
            // InternalModel.g:79:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYModelAccess().getPackageKeyword_0());
              		
            }
            // InternalModel.g:83:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalModel.g:84:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalModel.g:84:4: (lv_name_1_0= ruleQualifiedName )
            // InternalModel.g:85:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYModelAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYModelRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_1_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.QualifiedName");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:102:3: (otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalModel.g:103:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYModelAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalModel.g:108:3: ( (lv_imports_3_0= ruleYImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalModel.g:109:4: (lv_imports_3_0= ruleYImport )
            	    {
            	    // InternalModel.g:109:4: (lv_imports_3_0= ruleYImport )
            	    // InternalModel.g:110:5: lv_imports_3_0= ruleYImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYModelAccess().getImportsYImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleYImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"imports",
            	      						lv_imports_3_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YImport");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            // InternalModel.g:127:3: ( (lv_annotations_4_0= ruleYAnnotation ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14||LA3_0==32) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModel.g:128:4: (lv_annotations_4_0= ruleYAnnotation )
            	    {
            	    // InternalModel.g:128:4: (lv_annotations_4_0= ruleYAnnotation )
            	    // InternalModel.g:129:5: lv_annotations_4_0= ruleYAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYModelAccess().getAnnotationsYAnnotationParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_annotations_4_0=ruleYAnnotation();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYModelRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_4_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotation");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYModel"


    // $ANTLR start "entryRuleYImport"
    // InternalModel.g:150:1: entryRuleYImport returns [EObject current=null] : iv_ruleYImport= ruleYImport EOF ;
    public final EObject entryRuleYImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYImport = null;


        try {
            // InternalModel.g:150:48: (iv_ruleYImport= ruleYImport EOF )
            // InternalModel.g:151:2: iv_ruleYImport= ruleYImport EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYImportRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYImport=ruleYImport();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYImport; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYImport"


    // $ANTLR start "ruleYImport"
    // InternalModel.g:157:1: ruleYImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleYImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalModel.g:163:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalModel.g:164:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalModel.g:164:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalModel.g:165:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYImportAccess().getImportKeyword_0());
              		
            }
            // InternalModel.g:169:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalModel.g:170:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalModel.g:170:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalModel.g:171:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_importedNamespace_1_0=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYImportRule());
              					}
              					set(
              						current,
              						"importedNamespace",
              						lv_importedNamespace_1_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.QualifiedNameWithWildcard");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYImportAccess().getSemicolonKeyword_2());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYImport"


    // $ANTLR start "entryRuleYAnnotation"
    // InternalModel.g:196:1: entryRuleYAnnotation returns [EObject current=null] : iv_ruleYAnnotation= ruleYAnnotation EOF ;
    public final EObject entryRuleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotation = null;


        try {
            // InternalModel.g:196:52: (iv_ruleYAnnotation= ruleYAnnotation EOF )
            // InternalModel.g:197:2: iv_ruleYAnnotation= ruleYAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotation=ruleYAnnotation();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotation; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotation"


    // $ANTLR start "ruleYAnnotation"
    // InternalModel.g:203:1: ruleYAnnotation returns [EObject current=null] : (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign ) ;
    public final EObject ruleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotEntity_0 = null;

        EObject this_YAnnotTechnicalDesign_1 = null;



        	enterRule();

        try {
            // InternalModel.g:209:2: ( (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign ) )
            // InternalModel.g:210:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign )
            {
            // InternalModel.g:210:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            else if ( (LA4_0==32) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModel.g:211:3: this_YAnnotEntity_0= ruleYAnnotEntity
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotationAccess().getYAnnotEntityParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotEntity_0=ruleYAnnotEntity();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotEntity_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalModel.g:220:3: this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotationAccess().getYAnnotTechnicalDesignParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotTechnicalDesign_1=ruleYAnnotTechnicalDesign();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotTechnicalDesign_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotation"


    // $ANTLR start "entryRuleYAnnotEntity"
    // InternalModel.g:232:1: entryRuleYAnnotEntity returns [EObject current=null] : iv_ruleYAnnotEntity= ruleYAnnotEntity EOF ;
    public final EObject entryRuleYAnnotEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntity = null;


        try {
            // InternalModel.g:232:53: (iv_ruleYAnnotEntity= ruleYAnnotEntity EOF )
            // InternalModel.g:233:2: iv_ruleYAnnotEntity= ruleYAnnotEntity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotEntity=ruleYAnnotEntity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotEntity; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotEntity"


    // $ANTLR start "ruleYAnnotEntity"
    // InternalModel.g:239:1: ruleYAnnotEntity returns [EObject current=null] : ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) ;
    public final EObject ruleYAnnotEntity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elementValuePairs_4_0 = null;

        EObject lv_elementValuePairs_6_0 = null;

        EObject lv_annotations_9_0 = null;



        	enterRule();

        try {
            // InternalModel.g:245:2: ( ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) )
            // InternalModel.g:246:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            {
            // InternalModel.g:246:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            // InternalModel.g:247:3: () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}'
            {
            // InternalModel.g:247:3: ()
            // InternalModel.g:248:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotEntityAccess().getYAnnotEntityAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotEntityAccess().getEntityKeyword_1());
              		
            }
            // InternalModel.g:258:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:259:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:259:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:260:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotEntityAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_8);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotEntityRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:277:3: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) && (synpred1_InternalModel())) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModel.g:278:4: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')'
                    {
                    // InternalModel.g:278:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalModel.g:279:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0());
                      				
                    }

                    }

                    // InternalModel.g:285:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) && (synpred2_InternalModel())) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalModel.g:286:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:286:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:287:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:296:6: (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:297:7: lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_elementValuePairs_4_0=ruleYAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYAnnotEntityRule());
                              							}
                              							add(
                              								current,
                              								"elementValuePairs",
                              								lv_elementValuePairs_4_0,
                              								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalModel.g:314:5: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==16) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalModel.g:315:6: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:319:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:320:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:329:7: (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:330:8: lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    lv_elementValuePairs_6_0=ruleYAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYAnnotEntityRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"elementValuePairs",
                            	      									lv_elementValuePairs_6_0,
                            	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getYAnnotEntityAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,18,FOLLOW_12); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getYAnnotEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalModel.g:358:3: ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||LA8_0==22||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModel.g:359:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    {
            	    // InternalModel.g:359:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    // InternalModel.g:360:5: lv_annotations_9_0= ruleYAnnotEntityInner
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotEntityAccess().getAnnotationsYAnnotEntityInnerParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_12);
            	    lv_annotations_9_0=ruleYAnnotEntityInner();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYAnnotEntityRule());
            	      					}
            	      					add(
            	      						current,
            	      						"annotations",
            	      						lv_annotations_9_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotEntityInner");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getYAnnotEntityAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotEntity"


    // $ANTLR start "entryRuleYAnnotAttribute"
    // InternalModel.g:385:1: entryRuleYAnnotAttribute returns [EObject current=null] : iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF ;
    public final EObject entryRuleYAnnotAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAttribute = null;


        try {
            // InternalModel.g:385:56: (iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF )
            // InternalModel.g:386:2: iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotAttribute=ruleYAnnotAttribute();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotAttribute; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotAttribute"


    // $ANTLR start "ruleYAnnotAttribute"
    // InternalModel.g:392:1: ruleYAnnotAttribute returns [EObject current=null] : ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) ;
    public final EObject ruleYAnnotAttribute() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_optional_3_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elementValuePairs_5_0 = null;

        EObject lv_elementValuePairs_7_0 = null;



        	enterRule();

        try {
            // InternalModel.g:398:2: ( ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) )
            // InternalModel.g:399:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            {
            // InternalModel.g:399:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            // InternalModel.g:400:3: () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )?
            {
            // InternalModel.g:400:3: ()
            // InternalModel.g:401:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotAttributeAccess().getYAnnotAttributeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotAttributeAccess().getAttributeKeyword_1());
              		
            }
            // InternalModel.g:411:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:412:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:412:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:413:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_13);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotAttributeRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:430:3: ( (lv_optional_3_0= '?' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModel.g:431:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:431:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:432:5: lv_optional_3_0= '?'
                    {
                    lv_optional_3_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_3_0, grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYAnnotAttributeRule());
                      					}
                      					setWithLastConsumed(current, "optional", lv_optional_3_0, "?");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalModel.g:444:3: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) && (synpred4_InternalModel())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModel.g:445:4: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')'
                    {
                    // InternalModel.g:445:4: ( ( '(' )=>otherlv_4= '(' )
                    // InternalModel.g:446:5: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0());
                      				
                    }

                    }

                    // InternalModel.g:452:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) && (synpred5_InternalModel())) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalModel.g:453:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:453:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:454:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:463:6: (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:464:7: lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_elementValuePairs_5_0=ruleYAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYAnnotAttributeRule());
                              							}
                              							add(
                              								current,
                              								"elementValuePairs",
                              								lv_elementValuePairs_5_0,
                              								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalModel.g:481:5: (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==16) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalModel.g:482:6: otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:486:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:487:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:496:7: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:497:8: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    lv_elementValuePairs_7_0=ruleYAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYAnnotAttributeRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"elementValuePairs",
                            	      									lv_elementValuePairs_7_0,
                            	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop10;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getYAnnotAttributeAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalModel.g:521:3: (otherlv_9= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModel.g:522:4: otherlv_9= ';'
                    {
                    otherlv_9=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getYAnnotAttributeAccess().getSemicolonKeyword_5());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotAttribute"


    // $ANTLR start "entryRuleYAnnotRelationship"
    // InternalModel.g:531:1: entryRuleYAnnotRelationship returns [EObject current=null] : iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF ;
    public final EObject entryRuleYAnnotRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotRelationship = null;


        try {
            // InternalModel.g:531:59: (iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF )
            // InternalModel.g:532:2: iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotRelationship=ruleYAnnotRelationship();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotRelationship; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotRelationship"


    // $ANTLR start "ruleYAnnotRelationship"
    // InternalModel.g:538:1: ruleYAnnotRelationship returns [EObject current=null] : ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) ;
    public final EObject ruleYAnnotRelationship() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_optional_3_0=null;
        Token otherlv_4=null;
        Token lv_many_6_0=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elementValuePairs_8_0 = null;

        EObject lv_elementValuePairs_10_0 = null;



        	enterRule();

        try {
            // InternalModel.g:544:2: ( ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) )
            // InternalModel.g:545:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            {
            // InternalModel.g:545:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            // InternalModel.g:546:3: () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )?
            {
            // InternalModel.g:546:3: ()
            // InternalModel.g:547:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotRelationshipAccess().getYAnnotRelationshipAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,22,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotRelationshipAccess().getRelationshipKeyword_1());
              		
            }
            // InternalModel.g:557:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:558:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:558:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:559:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_16);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotRelationshipRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:576:3: ( (lv_optional_3_0= '?' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModel.g:577:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:577:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:578:5: lv_optional_3_0= '?'
                    {
                    lv_optional_3_0=(Token)match(input,21,FOLLOW_17); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_3_0, grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "optional", true, "?");
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYAnnotRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalModel.g:594:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:595:4: ( ruleQualifiedName )
            {
            // InternalModel.g:595:4: ( ruleQualifiedName )
            // InternalModel.g:596:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_18);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:610:3: ( (lv_many_6_0= '*' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModel.g:611:4: (lv_many_6_0= '*' )
                    {
                    // InternalModel.g:611:4: (lv_many_6_0= '*' )
                    // InternalModel.g:612:5: lv_many_6_0= '*'
                    {
                    lv_many_6_0=(Token)match(input,24,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_many_6_0, grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
                      					}
                      					setWithLastConsumed(current, "many", true, "*");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalModel.g:624:3: ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) && (synpred7_InternalModel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModel.g:625:4: ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')'
                    {
                    // InternalModel.g:625:4: ( ( '(' )=>otherlv_7= '(' )
                    // InternalModel.g:626:5: ( '(' )=>otherlv_7= '('
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0());
                      				
                    }

                    }

                    // InternalModel.g:632:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) && (synpred8_InternalModel())) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalModel.g:633:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:633:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:634:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:643:6: (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:644:7: lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_elementValuePairs_8_0=ruleYAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYAnnotRelationshipRule());
                              							}
                              							add(
                              								current,
                              								"elementValuePairs",
                              								lv_elementValuePairs_8_0,
                              								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalModel.g:661:5: (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalModel.g:662:6: otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_9=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_9, grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:666:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:667:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:676:7: (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:677:8: lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    lv_elementValuePairs_10_0=ruleYAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYAnnotRelationshipRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"elementValuePairs",
                            	      									lv_elementValuePairs_10_0,
                            	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop16;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,17,FOLLOW_20); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getYAnnotRelationshipAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }
                    break;

            }

            // InternalModel.g:701:3: (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModel.g:702:4: otherlv_12= '<-' ( ( ruleQualifiedName ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0());
                      			
                    }
                    // InternalModel.g:706:4: ( ( ruleQualifiedName ) )
                    // InternalModel.g:707:5: ( ruleQualifiedName )
                    {
                    // InternalModel.g:707:5: ( ruleQualifiedName )
                    // InternalModel.g:708:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipCrossReference_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_15);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalModel.g:723:3: (otherlv_14= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModel.g:724:4: otherlv_14= ';'
                    {
                    otherlv_14=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_14, grammarAccess.getYAnnotRelationshipAccess().getSemicolonKeyword_9());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotRelationship"


    // $ANTLR start "entryRuleYAnnotIdentifier"
    // InternalModel.g:733:1: entryRuleYAnnotIdentifier returns [EObject current=null] : iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF ;
    public final EObject entryRuleYAnnotIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotIdentifier = null;


        try {
            // InternalModel.g:733:57: (iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF )
            // InternalModel.g:734:2: iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotIdentifier=ruleYAnnotIdentifier();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotIdentifier; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotIdentifier"


    // $ANTLR start "ruleYAnnotIdentifier"
    // InternalModel.g:740:1: ruleYAnnotIdentifier returns [EObject current=null] : ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) ;
    public final EObject ruleYAnnotIdentifier() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:746:2: ( ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) )
            // InternalModel.g:747:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            {
            // InternalModel.g:747:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            // InternalModel.g:748:3: () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )?
            {
            // InternalModel.g:748:3: ()
            // InternalModel.g:749:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotIdentifierAccess().getYAnnotIdentifierAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotIdentifierAccess().getIdentifierKeyword_1());
              		
            }
            // InternalModel.g:759:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:760:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:760:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:761:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotIdentifierAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotIdentifierRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotIdentifierAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalModel.g:782:3: ( (otherlv_4= RULE_ID ) )
            // InternalModel.g:783:4: (otherlv_4= RULE_ID )
            {
            // InternalModel.g:783:4: (otherlv_4= RULE_ID )
            // InternalModel.g:784:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotIdentifierRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_4_0());
              				
            }

            }


            }

            // InternalModel.g:795:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModel.g:796:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:800:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalModel.g:801:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalModel.g:801:5: (otherlv_6= RULE_ID )
            	    // InternalModel.g:802:6: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getYAnnotIdentifierRule());
            	      						}
            	      					
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotIdentifierAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalModel.g:818:3: (otherlv_8= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModel.g:819:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getYAnnotIdentifierAccess().getSemicolonKeyword_7());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotIdentifier"


    // $ANTLR start "entryRuleYAnnotationElementValuePair"
    // InternalModel.g:828:1: entryRuleYAnnotationElementValuePair returns [EObject current=null] : iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF ;
    public final EObject entryRuleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotationElementValuePair = null;


        try {
            // InternalModel.g:828:68: (iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF )
            // InternalModel.g:829:2: iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotationElementValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotationElementValuePair=ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotationElementValuePair; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotationElementValuePair"


    // $ANTLR start "ruleYAnnotationElementValuePair"
    // InternalModel.g:835:1: ruleYAnnotationElementValuePair returns [EObject current=null] : ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) ;
    public final EObject ruleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:841:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) )
            // InternalModel.g:842:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            {
            // InternalModel.g:842:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            // InternalModel.g:843:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) )
            {
            // InternalModel.g:843:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) )
            // InternalModel.g:844:4: ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            {
            // InternalModel.g:853:4: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            // InternalModel.g:854:5: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '='
            {
            // InternalModel.g:854:5: ( (lv_name_0_0= ruleValidID ) )
            // InternalModel.g:855:6: (lv_name_0_0= ruleValidID )
            {
            // InternalModel.g:855:6: (lv_name_0_0= ruleValidID )
            // InternalModel.g:856:7: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getYAnnotationElementValuePairAccess().getNameValidIDParserRuleCall_0_0_0_0());
              						
            }
            pushFollow(FOLLOW_22);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              							if (current==null) {
              								current = createModelElementForParent(grammarAccess.getYAnnotationElementValuePairRule());
              							}
              							set(
              								current,
              								"name",
              								lv_name_0_0,
              								"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              							afterParserOrEnumRuleCall();
              						
            }

            }


            }

            otherlv_1=(Token)match(input,27,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getYAnnotationElementValuePairAccess().getEqualsSignKeyword_0_0_1());
              				
            }

            }


            }

            // InternalModel.g:879:3: ( (lv_value_2_0= ruleYAnnotExpression ) )
            // InternalModel.g:880:4: (lv_value_2_0= ruleYAnnotExpression )
            {
            // InternalModel.g:880:4: (lv_value_2_0= ruleYAnnotExpression )
            // InternalModel.g:881:5: lv_value_2_0= ruleYAnnotExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotationElementValuePairAccess().getValueYAnnotExpressionParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_value_2_0=ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotationElementValuePairRule());
              					}
              					set(
              						current,
              						"value",
              						lv_value_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotationElementValuePair"


    // $ANTLR start "entryRuleYAnnotEntityInner"
    // InternalModel.g:902:1: entryRuleYAnnotEntityInner returns [EObject current=null] : iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF ;
    public final EObject entryRuleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntityInner = null;


        try {
            // InternalModel.g:902:58: (iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF )
            // InternalModel.g:903:2: iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotEntityInnerRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotEntityInner=ruleYAnnotEntityInner();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotEntityInner; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotEntityInner"


    // $ANTLR start "ruleYAnnotEntityInner"
    // InternalModel.g:909:1: ruleYAnnotEntityInner returns [EObject current=null] : (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) ;
    public final EObject ruleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotAttribute_0 = null;

        EObject this_YAnnotRelationship_1 = null;

        EObject this_YAnnotIdentifier_2 = null;



        	enterRule();

        try {
            // InternalModel.g:915:2: ( (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) )
            // InternalModel.g:916:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            {
            // InternalModel.g:916:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            int alt23=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt23=1;
                }
                break;
            case 22:
                {
                alt23=2;
                }
                break;
            case 26:
                {
                alt23=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;
            }

            switch (alt23) {
                case 1 :
                    // InternalModel.g:917:3: this_YAnnotAttribute_0= ruleYAnnotAttribute
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotAttributeParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotAttribute_0=ruleYAnnotAttribute();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotAttribute_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalModel.g:926:3: this_YAnnotRelationship_1= ruleYAnnotRelationship
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotRelationshipParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotRelationship_1=ruleYAnnotRelationship();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotRelationship_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalModel.g:935:3: this_YAnnotIdentifier_2= ruleYAnnotIdentifier
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotIdentifierParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotIdentifier_2=ruleYAnnotIdentifier();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotIdentifier_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotEntityInner"


    // $ANTLR start "entryRuleYAnnotExpression"
    // InternalModel.g:947:1: entryRuleYAnnotExpression returns [EObject current=null] : iv_ruleYAnnotExpression= ruleYAnnotExpression EOF ;
    public final EObject entryRuleYAnnotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotExpression = null;


        try {
            // InternalModel.g:947:57: (iv_ruleYAnnotExpression= ruleYAnnotExpression EOF )
            // InternalModel.g:948:2: iv_ruleYAnnotExpression= ruleYAnnotExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotExpression=ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotExpression; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotExpression"


    // $ANTLR start "ruleYAnnotExpression"
    // InternalModel.g:954:1: ruleYAnnotExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) ;
    public final EObject ruleYAnnotExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_3_0=null;
        Token lv_value_7_1=null;
        Token lv_value_7_2=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_value_1_0 = null;

        AntlrDatatypeRuleToken lv_value_5_0 = null;

        EObject lv_elements_10_0 = null;

        EObject lv_elements_12_0 = null;



        	enterRule();

        try {
            // InternalModel.g:960:2: ( ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) )
            // InternalModel.g:961:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            {
            // InternalModel.g:961:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            int alt27=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt27=1;
                }
                break;
            case RULE_STRING:
                {
                alt27=2;
                }
                break;
            case RULE_INT:
                {
                alt27=3;
                }
                break;
            case 28:
            case 29:
                {
                alt27=4;
                }
                break;
            case 30:
                {
                alt27=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // InternalModel.g:962:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    {
                    // InternalModel.g:962:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    // InternalModel.g:963:4: () ( (lv_value_1_0= ruleValidID ) )
                    {
                    // InternalModel.g:963:4: ()
                    // InternalModel.g:964:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:970:4: ( (lv_value_1_0= ruleValidID ) )
                    // InternalModel.g:971:5: (lv_value_1_0= ruleValidID )
                    {
                    // InternalModel.g:971:5: (lv_value_1_0= ruleValidID )
                    // InternalModel.g:972:6: lv_value_1_0= ruleValidID
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getValueValidIDParserRuleCall_0_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_1_0=ruleValidID();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYAnnotExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:991:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalModel.g:991:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalModel.g:992:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalModel.g:992:4: ()
                    // InternalModel.g:993:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:999:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalModel.g:1000:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalModel.g:1000:5: (lv_value_3_0= RULE_STRING )
                    // InternalModel.g:1001:6: lv_value_3_0= RULE_STRING
                    {
                    lv_value_3_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getYAnnotExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalModel.g:1019:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    {
                    // InternalModel.g:1019:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    // InternalModel.g:1020:4: () ( (lv_value_5_0= ruleNumber ) )
                    {
                    // InternalModel.g:1020:4: ()
                    // InternalModel.g:1021:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1027:4: ( (lv_value_5_0= ruleNumber ) )
                    // InternalModel.g:1028:5: (lv_value_5_0= ruleNumber )
                    {
                    // InternalModel.g:1028:5: (lv_value_5_0= ruleNumber )
                    // InternalModel.g:1029:6: lv_value_5_0= ruleNumber
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getValueNumberParserRuleCall_2_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_value_5_0=ruleNumber();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYAnnotExpressionRule());
                      						}
                      						set(
                      							current,
                      							"value",
                      							lv_value_5_0,
                      							"eu.jgen.notes.dmw.lite.mdl.Model.Number");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalModel.g:1048:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalModel.g:1048:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalModel.g:1049:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalModel.g:1049:4: ()
                    // InternalModel.g:1050:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1056:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalModel.g:1057:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalModel.g:1057:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalModel.g:1058:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalModel.g:1058:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==28) ) {
                        alt24=1;
                    }
                    else if ( (LA24_0==29) ) {
                        alt24=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 24, 0, input);

                        throw nvae;
                    }
                    switch (alt24) {
                        case 1 :
                            // InternalModel.g:1059:7: lv_value_7_1= 'true'
                            {
                            lv_value_7_1=(Token)match(input,28,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_7_1, grammarAccess.getYAnnotExpressionAccess().getValueTrueKeyword_3_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getYAnnotExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_7_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalModel.g:1070:7: lv_value_7_2= 'false'
                            {
                            lv_value_7_2=(Token)match(input,29,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_7_2, grammarAccess.getYAnnotExpressionAccess().getValueFalseKeyword_3_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getYAnnotExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_7_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 5 :
                    // InternalModel.g:1085:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    {
                    // InternalModel.g:1085:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    // InternalModel.g:1086:4: () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']'
                    {
                    // InternalModel.g:1086:4: ()
                    // InternalModel.g:1087:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1093:4: ( ( '[' )=>otherlv_9= '[' )
                    // InternalModel.g:1094:5: ( '[' )=>otherlv_9= '['
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0());
                      				
                    }

                    }

                    // InternalModel.g:1101:4: ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||(LA26_0>=28 && LA26_0<=30)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModel.g:1102:5: ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            {
                            // InternalModel.g:1102:5: ( (lv_elements_10_0= ruleYAnnotExpression ) )
                            // InternalModel.g:1103:6: (lv_elements_10_0= ruleYAnnotExpression )
                            {
                            // InternalModel.g:1103:6: (lv_elements_10_0= ruleYAnnotExpression )
                            // InternalModel.g:1104:7: lv_elements_10_0= ruleYAnnotExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_25);
                            lv_elements_10_0=ruleYAnnotExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYAnnotExpressionRule());
                              							}
                              							add(
                              								current,
                              								"elements",
                              								lv_elements_10_0,
                              								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalModel.g:1121:5: (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==16) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalModel.g:1122:6: otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_11, grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1126:6: ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    // InternalModel.g:1127:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    {
                            	    // InternalModel.g:1127:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    // InternalModel.g:1128:8: lv_elements_12_0= ruleYAnnotExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_25);
                            	    lv_elements_12_0=ruleYAnnotExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYAnnotExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"elements",
                            	      									lv_elements_12_0,
                            	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,31,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_13, grammarAccess.getYAnnotExpressionAccess().getRightSquareBracketKeyword_4_3());
                      			
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotExpression"


    // $ANTLR start "entryRuleYAnnotTechnicalDesign"
    // InternalModel.g:1156:1: entryRuleYAnnotTechnicalDesign returns [EObject current=null] : iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF ;
    public final EObject entryRuleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTechnicalDesign = null;


        try {
            // InternalModel.g:1156:62: (iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF )
            // InternalModel.g:1157:2: iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotTechnicalDesignRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotTechnicalDesign=ruleYAnnotTechnicalDesign();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotTechnicalDesign; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotTechnicalDesign"


    // $ANTLR start "ruleYAnnotTechnicalDesign"
    // InternalModel.g:1163:1: ruleYAnnotTechnicalDesign returns [EObject current=null] : ( () otherlv_1= '@td' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' ) otherlv_8= '{' ( (lv_features_9_0= ruleYAnnotTable ) )* otherlv_10= '}' ) ;
    public final EObject ruleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_elementValuePairs_4_0 = null;

        EObject lv_elementValuePairs_6_0 = null;

        EObject lv_features_9_0 = null;



        	enterRule();

        try {
            // InternalModel.g:1169:2: ( ( () otherlv_1= '@td' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' ) otherlv_8= '{' ( (lv_features_9_0= ruleYAnnotTable ) )* otherlv_10= '}' ) )
            // InternalModel.g:1170:2: ( () otherlv_1= '@td' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' ) otherlv_8= '{' ( (lv_features_9_0= ruleYAnnotTable ) )* otherlv_10= '}' )
            {
            // InternalModel.g:1170:2: ( () otherlv_1= '@td' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' ) otherlv_8= '{' ( (lv_features_9_0= ruleYAnnotTable ) )* otherlv_10= '}' )
            // InternalModel.g:1171:3: () otherlv_1= '@td' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' ) otherlv_8= '{' ( (lv_features_9_0= ruleYAnnotTable ) )* otherlv_10= '}'
            {
            // InternalModel.g:1171:3: ()
            // InternalModel.g:1172:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTechnicalDesignAccess().getTdKeyword_1());
              		
            }
            // InternalModel.g:1182:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1183:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1183:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1184:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotTechnicalDesignRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:1201:3: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )
            // InternalModel.g:1202:4: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')'
            {
            // InternalModel.g:1202:4: ( ( '(' )=>otherlv_3= '(' )
            // InternalModel.g:1203:5: ( '(' )=>otherlv_3= '('
            {
            otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getYAnnotTechnicalDesignAccess().getLeftParenthesisKeyword_3_0());
              				
            }

            }

            // InternalModel.g:1209:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==RULE_ID) && (synpred13_InternalModel())) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalModel.g:1210:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                    {
                    // InternalModel.g:1210:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) )
                    // InternalModel.g:1211:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                    {
                    // InternalModel.g:1220:6: (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                    // InternalModel.g:1221:7: lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair
                    {
                    if ( state.backtracking==0 ) {

                      							newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0());
                      						
                    }
                    pushFollow(FOLLOW_10);
                    lv_elementValuePairs_4_0=ruleYAnnotationElementValuePair();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      							if (current==null) {
                      								current = createModelElementForParent(grammarAccess.getYAnnotTechnicalDesignRule());
                      							}
                      							add(
                      								current,
                      								"elementValuePairs",
                      								lv_elementValuePairs_4_0,
                      								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                      							afterParserOrEnumRuleCall();
                      						
                    }

                    }


                    }

                    // InternalModel.g:1238:5: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                    loop28:
                    do {
                        int alt28=2;
                        int LA28_0 = input.LA(1);

                        if ( (LA28_0==16) ) {
                            alt28=1;
                        }


                        switch (alt28) {
                    	case 1 :
                    	    // InternalModel.g:1239:6: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                    	    {
                    	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotTechnicalDesignAccess().getCommaKeyword_3_1_1_0());
                    	      					
                    	    }
                    	    // InternalModel.g:1243:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                    	    // InternalModel.g:1244:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                    	    {
                    	    // InternalModel.g:1253:7: (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                    	    // InternalModel.g:1254:8: lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      								newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0());
                    	      							
                    	    }
                    	    pushFollow(FOLLOW_10);
                    	    lv_elementValuePairs_6_0=ruleYAnnotationElementValuePair();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      								if (current==null) {
                    	      									current = createModelElementForParent(grammarAccess.getYAnnotTechnicalDesignRule());
                    	      								}
                    	      								add(
                    	      									current,
                    	      									"elementValuePairs",
                    	      									lv_elementValuePairs_6_0,
                    	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                    	      								afterParserOrEnumRuleCall();
                    	      							
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop28;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,17,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              				newLeafNode(otherlv_7, grammarAccess.getYAnnotTechnicalDesignAccess().getRightParenthesisKeyword_3_2());
              			
            }

            }

            otherlv_8=(Token)match(input,18,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getYAnnotTechnicalDesignAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalModel.g:1282:3: ( (lv_features_9_0= ruleYAnnotTable ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==33) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalModel.g:1283:4: (lv_features_9_0= ruleYAnnotTable )
            	    {
            	    // InternalModel.g:1283:4: (lv_features_9_0= ruleYAnnotTable )
            	    // InternalModel.g:1284:5: lv_features_9_0= ruleYAnnotTable
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesYAnnotTableParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_26);
            	    lv_features_9_0=ruleYAnnotTable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYAnnotTechnicalDesignRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_9_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotTable");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            otherlv_10=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getYAnnotTechnicalDesignAccess().getRightCurlyBracketKeyword_6());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotTechnicalDesign"


    // $ANTLR start "entryRuleYAnnotTable"
    // InternalModel.g:1309:1: entryRuleYAnnotTable returns [EObject current=null] : iv_ruleYAnnotTable= ruleYAnnotTable EOF ;
    public final EObject entryRuleYAnnotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTable = null;


        try {
            // InternalModel.g:1309:52: (iv_ruleYAnnotTable= ruleYAnnotTable EOF )
            // InternalModel.g:1310:2: iv_ruleYAnnotTable= ruleYAnnotTable EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotTableRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotTable=ruleYAnnotTable();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotTable; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotTable"


    // $ANTLR start "ruleYAnnotTable"
    // InternalModel.g:1316:1: ruleYAnnotTable returns [EObject current=null] : ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) ;
    public final EObject ruleYAnnotTable() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_columns_6_0 = null;

        EObject lv_primarykey_7_0 = null;

        EObject lv_foreignkeys_8_0 = null;



        	enterRule();

        try {
            // InternalModel.g:1322:2: ( ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) )
            // InternalModel.g:1323:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            {
            // InternalModel.g:1323:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            // InternalModel.g:1324:3: () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}'
            {
            // InternalModel.g:1324:3: ()
            // InternalModel.g:1325:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTableAccess().getTableKeyword_1());
              		
            }
            // InternalModel.g:1335:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1336:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1336:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1337:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotTableAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotTableRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotTableAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalModel.g:1358:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1359:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1359:4: ( ruleQualifiedName )
            // InternalModel.g:1360:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotTableRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYAnnotTableAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalModel.g:1378:3: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==45) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalModel.g:1379:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1379:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1380:5: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getColumnsYAnnotAbstractColumnParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_columns_6_0=ruleYAnnotAbstractColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYAnnotTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"columns",
            	      						lv_columns_6_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotAbstractColumn");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            // InternalModel.g:1397:3: ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==46) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModel.g:1398:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    {
                    // InternalModel.g:1398:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    // InternalModel.g:1399:5: lv_primarykey_7_0= ruleYAnnotPrimaryKey
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getPrimarykeyYAnnotPrimaryKeyParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_28);
                    lv_primarykey_7_0=ruleYAnnotPrimaryKey();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYAnnotTableRule());
                      					}
                      					set(
                      						current,
                      						"primarykey",
                      						lv_primarykey_7_0,
                      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotPrimaryKey");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalModel.g:1416:3: ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==47) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalModel.g:1417:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    {
            	    // InternalModel.g:1417:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    // InternalModel.g:1418:5: lv_foreignkeys_8_0= ruleYAnnotForeignKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getForeignkeysYAnnotForeignKeyParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_foreignkeys_8_0=ruleYAnnotForeignKey();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYAnnotTableRule());
            	      					}
            	      					add(
            	      						current,
            	      						"foreignkeys",
            	      						lv_foreignkeys_8_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotForeignKey");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            otherlv_9=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getYAnnotTableAccess().getRightCurlyBracketKeyword_9());
              		
            }

            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotTable"


    // $ANTLR start "entryRuleYAnnotColumn"
    // InternalModel.g:1443:1: entryRuleYAnnotColumn returns [EObject current=null] : iv_ruleYAnnotColumn= ruleYAnnotColumn EOF ;
    public final EObject entryRuleYAnnotColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumn = null;


        try {
            // InternalModel.g:1443:53: (iv_ruleYAnnotColumn= ruleYAnnotColumn EOF )
            // InternalModel.g:1444:2: iv_ruleYAnnotColumn= ruleYAnnotColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotColumn=ruleYAnnotColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotColumn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotColumn"


    // $ANTLR start "ruleYAnnotColumn"
    // InternalModel.g:1450:1: ruleYAnnotColumn returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) ;
    public final EObject ruleYAnnotColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token lv_type_4_1=null;
        Token lv_type_4_2=null;
        Token lv_type_4_3=null;
        Token lv_type_4_4=null;
        Token lv_type_4_5=null;
        Token lv_type_4_6=null;
        Token lv_type_4_7=null;
        Token lv_type_4_8=null;
        Token lv_type_4_9=null;
        Token lv_type_4_10=null;
        Token lv_optional_5_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_elementValuePairs_7_0 = null;

        EObject lv_elementValuePairs_9_0 = null;



        	enterRule();

        try {
            // InternalModel.g:1456:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            // InternalModel.g:1457:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            {
            // InternalModel.g:1457:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            // InternalModel.g:1458:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )?
            {
            // InternalModel.g:1458:3: ()
            // InternalModel.g:1459:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotColumnAccess().getYAnnotColumnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotColumnAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalModel.g:1469:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1470:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1470:4: ( ruleQualifiedName )
            // InternalModel.g:1471:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotColumnRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_29);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,34,FOLLOW_30); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotColumnAccess().getAsKeyword_3());
              		
            }
            // InternalModel.g:1489:3: ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) )
            // InternalModel.g:1490:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            {
            // InternalModel.g:1490:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            // InternalModel.g:1491:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            {
            // InternalModel.g:1491:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            int alt34=10;
            switch ( input.LA(1) ) {
            case 35:
                {
                alt34=1;
                }
                break;
            case 36:
                {
                alt34=2;
                }
                break;
            case 37:
                {
                alt34=3;
                }
                break;
            case 38:
                {
                alt34=4;
                }
                break;
            case 39:
                {
                alt34=5;
                }
                break;
            case 40:
                {
                alt34=6;
                }
                break;
            case 41:
                {
                alt34=7;
                }
                break;
            case 42:
                {
                alt34=8;
                }
                break;
            case 43:
                {
                alt34=9;
                }
                break;
            case 44:
                {
                alt34=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;
            }

            switch (alt34) {
                case 1 :
                    // InternalModel.g:1492:6: lv_type_4_1= 'VARCHAR'
                    {
                    lv_type_4_1=(Token)match(input,35,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_1, grammarAccess.getYAnnotColumnAccess().getTypeVARCHARKeyword_4_0_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_1, null);
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalModel.g:1503:6: lv_type_4_2= 'CHAR'
                    {
                    lv_type_4_2=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_2, grammarAccess.getYAnnotColumnAccess().getTypeCHARKeyword_4_0_1());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_2, null);
                      					
                    }

                    }
                    break;
                case 3 :
                    // InternalModel.g:1514:6: lv_type_4_3= 'INTEGER'
                    {
                    lv_type_4_3=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_3, grammarAccess.getYAnnotColumnAccess().getTypeINTEGERKeyword_4_0_2());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_3, null);
                      					
                    }

                    }
                    break;
                case 4 :
                    // InternalModel.g:1525:6: lv_type_4_4= 'BIGINT'
                    {
                    lv_type_4_4=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_4, grammarAccess.getYAnnotColumnAccess().getTypeBIGINTKeyword_4_0_3());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_4, null);
                      					
                    }

                    }
                    break;
                case 5 :
                    // InternalModel.g:1536:6: lv_type_4_5= 'SMALLINT'
                    {
                    lv_type_4_5=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_5, grammarAccess.getYAnnotColumnAccess().getTypeSMALLINTKeyword_4_0_4());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_5, null);
                      					
                    }

                    }
                    break;
                case 6 :
                    // InternalModel.g:1547:6: lv_type_4_6= 'DECIMAL'
                    {
                    lv_type_4_6=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_6, grammarAccess.getYAnnotColumnAccess().getTypeDECIMALKeyword_4_0_5());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_6, null);
                      					
                    }

                    }
                    break;
                case 7 :
                    // InternalModel.g:1558:6: lv_type_4_7= 'TIME'
                    {
                    lv_type_4_7=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_7, grammarAccess.getYAnnotColumnAccess().getTypeTIMEKeyword_4_0_6());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_7, null);
                      					
                    }

                    }
                    break;
                case 8 :
                    // InternalModel.g:1569:6: lv_type_4_8= 'DATE'
                    {
                    lv_type_4_8=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_8, grammarAccess.getYAnnotColumnAccess().getTypeDATEKeyword_4_0_7());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_8, null);
                      					
                    }

                    }
                    break;
                case 9 :
                    // InternalModel.g:1580:6: lv_type_4_9= 'TIMESTAMP'
                    {
                    lv_type_4_9=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_9, grammarAccess.getYAnnotColumnAccess().getTypeTIMESTAMPKeyword_4_0_8());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_9, null);
                      					
                    }

                    }
                    break;
                case 10 :
                    // InternalModel.g:1591:6: lv_type_4_10= 'BOOLEAN'
                    {
                    lv_type_4_10=(Token)match(input,44,FOLLOW_13); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_type_4_10, grammarAccess.getYAnnotColumnAccess().getTypeBOOLEANKeyword_4_0_9());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      						}
                      						setWithLastConsumed(current, "type", lv_type_4_10, null);
                      					
                    }

                    }
                    break;

            }


            }


            }

            // InternalModel.g:1604:3: ( (lv_optional_5_0= '?' ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==21) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModel.g:1605:4: (lv_optional_5_0= '?' )
                    {
                    // InternalModel.g:1605:4: (lv_optional_5_0= '?' )
                    // InternalModel.g:1606:5: lv_optional_5_0= '?'
                    {
                    lv_optional_5_0=(Token)match(input,21,FOLLOW_14); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_5_0, grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYAnnotColumnRule());
                      					}
                      					setWithLastConsumed(current, "optional", lv_optional_5_0, "?");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalModel.g:1618:3: ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==15) && (synpred15_InternalModel())) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModel.g:1619:4: ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')'
                    {
                    // InternalModel.g:1619:4: ( ( '(' )=>otherlv_6= '(' )
                    // InternalModel.g:1620:5: ( '(' )=>otherlv_6= '('
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0());
                      				
                    }

                    }

                    // InternalModel.g:1626:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==RULE_ID) && (synpred16_InternalModel())) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // InternalModel.g:1627:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:1627:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:1628:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:1637:6: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:1638:7: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_10);
                            lv_elementValuePairs_7_0=ruleYAnnotationElementValuePair();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYAnnotColumnRule());
                              							}
                              							add(
                              								current,
                              								"elementValuePairs",
                              								lv_elementValuePairs_7_0,
                              								"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalModel.g:1655:5: (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            loop36:
                            do {
                                int alt36=2;
                                int LA36_0 = input.LA(1);

                                if ( (LA36_0==16) ) {
                                    alt36=1;
                                }


                                switch (alt36) {
                            	case 1 :
                            	    // InternalModel.g:1656:6: otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_8=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_8, grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1660:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:1661:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:1670:7: (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:1671:8: lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_10);
                            	    lv_elementValuePairs_9_0=ruleYAnnotationElementValuePair();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYAnnotColumnRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"elementValuePairs",
                            	      									lv_elementValuePairs_9_0,
                            	      									"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotationElementValuePair");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop36;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getYAnnotColumnAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }
                    break;

            }

            // InternalModel.g:1695:3: (otherlv_11= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModel.g:1696:4: otherlv_11= ';'
                    {
                    otherlv_11=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getYAnnotColumnAccess().getSemicolonKeyword_7());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotColumn"


    // $ANTLR start "entryRuleYAnnotColumnLike"
    // InternalModel.g:1705:1: entryRuleYAnnotColumnLike returns [EObject current=null] : iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF ;
    public final EObject entryRuleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumnLike = null;


        try {
            // InternalModel.g:1705:57: (iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF )
            // InternalModel.g:1706:2: iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotColumnLikeRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotColumnLike=ruleYAnnotColumnLike();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotColumnLike; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotColumnLike"


    // $ANTLR start "ruleYAnnotColumnLike"
    // InternalModel.g:1712:1: ruleYAnnotColumnLike returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModel.g:1718:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) )
            // InternalModel.g:1719:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            {
            // InternalModel.g:1719:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            // InternalModel.g:1720:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )?
            {
            // InternalModel.g:1720:3: ()
            // InternalModel.g:1721:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotColumnLikeAccess().getYAnnotColumnLikeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotColumnLikeAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalModel.g:1731:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1732:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1732:4: ( ruleQualifiedName )
            // InternalModel.g:1733:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotColumnLikeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:1747:3: (otherlv_3= ';' )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==12) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // InternalModel.g:1748:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getYAnnotColumnLikeAccess().getSemicolonKeyword_3());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotColumnLike"


    // $ANTLR start "entryRuleYAnnotAbstractColumn"
    // InternalModel.g:1757:1: entryRuleYAnnotAbstractColumn returns [EObject current=null] : iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF ;
    public final EObject entryRuleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAbstractColumn = null;


        try {
            // InternalModel.g:1757:61: (iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF )
            // InternalModel.g:1758:2: iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotAbstractColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotAbstractColumn=ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotAbstractColumn; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotAbstractColumn"


    // $ANTLR start "ruleYAnnotAbstractColumn"
    // InternalModel.g:1764:1: ruleYAnnotAbstractColumn returns [EObject current=null] : ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) ;
    public final EObject ruleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_3_1 = null;

        EObject lv_type_3_2 = null;



        	enterRule();

        try {
            // InternalModel.g:1770:2: ( ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) )
            // InternalModel.g:1771:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            {
            // InternalModel.g:1771:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            // InternalModel.g:1772:3: () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            {
            // InternalModel.g:1772:3: ()
            // InternalModel.g:1773:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,45,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1());
              		
            }
            // InternalModel.g:1783:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1784:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1784:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1785:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotAbstractColumnAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotAbstractColumnRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_2_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:1802:3: ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            // InternalModel.g:1803:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            {
            // InternalModel.g:1803:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            // InternalModel.g:1804:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            {
            // InternalModel.g:1804:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // InternalModel.g:1805:6: lv_type_3_1= ruleYAnnotColumn
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnParserRuleCall_3_0_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_1=ruleYAnnotColumn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYAnnotAbstractColumnRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_1,
                      							"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotColumn");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;
                case 2 :
                    // InternalModel.g:1821:6: lv_type_3_2= ruleYAnnotColumnLike
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnLikeParserRuleCall_3_0_1());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_type_3_2=ruleYAnnotColumnLike();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYAnnotAbstractColumnRule());
                      						}
                      						set(
                      							current,
                      							"type",
                      							lv_type_3_2,
                      							"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotColumnLike");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }
                    break;

            }


            }


            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotAbstractColumn"


    // $ANTLR start "entryRuleYAnnotPrimaryKey"
    // InternalModel.g:1843:1: entryRuleYAnnotPrimaryKey returns [EObject current=null] : iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF ;
    public final EObject entryRuleYAnnotPrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotPrimaryKey = null;


        try {
            // InternalModel.g:1843:57: (iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF )
            // InternalModel.g:1844:2: iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotPrimaryKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotPrimaryKey=ruleYAnnotPrimaryKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotPrimaryKey; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotPrimaryKey"


    // $ANTLR start "ruleYAnnotPrimaryKey"
    // InternalModel.g:1850:1: ruleYAnnotPrimaryKey returns [EObject current=null] : ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) ;
    public final EObject ruleYAnnotPrimaryKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_7=null;


        	enterRule();

        try {
            // InternalModel.g:1856:2: ( ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) )
            // InternalModel.g:1857:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            {
            // InternalModel.g:1857:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            // InternalModel.g:1858:3: () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )?
            {
            // InternalModel.g:1858:3: ()
            // InternalModel.g:1859:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotPrimaryKeyAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalModel.g:1873:3: ( (otherlv_3= RULE_ID ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModel.g:1874:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalModel.g:1874:4: (otherlv_3= RULE_ID )
            	    // InternalModel.g:1875:5: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getYAnnotPrimaryKeyRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_31); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop42;
                }
            } while (true);

            // InternalModel.g:1886:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==16) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalModel.g:1887:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalModel.g:1891:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalModel.g:1892:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalModel.g:1892:5: (otherlv_5= RULE_ID )
            	    // InternalModel.g:1893:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getYAnnotPrimaryKeyRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_10); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalModel.g:1909:3: (otherlv_7= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModel.g:1910:4: otherlv_7= ';'
                    {
                    otherlv_7=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getYAnnotPrimaryKeyAccess().getSemicolonKeyword_6());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotPrimaryKey"


    // $ANTLR start "entryRuleYAnnotForeignKey"
    // InternalModel.g:1919:1: entryRuleYAnnotForeignKey returns [EObject current=null] : iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF ;
    public final EObject entryRuleYAnnotForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotForeignKey = null;


        try {
            // InternalModel.g:1919:57: (iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF )
            // InternalModel.g:1920:2: iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotForeignKey=ruleYAnnotForeignKey();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotForeignKey; 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleYAnnotForeignKey"


    // $ANTLR start "ruleYAnnotForeignKey"
    // InternalModel.g:1926:1: ruleYAnnotForeignKey returns [EObject current=null] : ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ;
    public final EObject ruleYAnnotForeignKey() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        EObject lv_columns_4_0 = null;

        EObject lv_columns_6_0 = null;



        	enterRule();

        try {
            // InternalModel.g:1932:2: ( ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            // InternalModel.g:1933:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            {
            // InternalModel.g:1933:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            // InternalModel.g:1934:3: () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
            {
            // InternalModel.g:1934:3: ()
            // InternalModel.g:1935:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1());
              		
            }
            // InternalModel.g:1945:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1946:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1946:4: ( ruleQualifiedName )
            // InternalModel.g:1947:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotForeignKeyRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_11);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,18,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotForeignKeyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalModel.g:1965:3: ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) )
            // InternalModel.g:1966:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:1966:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            // InternalModel.g:1967:5: lv_columns_4_0= ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_33);
            lv_columns_4_0=ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotForeignKeyRule());
              					}
              					add(
              						current,
              						"columns",
              						lv_columns_4_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotAbstractColumn");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:1984:3: (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==16) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalModel.g:1985:4: otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:1989:4: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    // InternalModel.g:1990:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1990:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1991:6: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_columns_6_0=ruleYAnnotAbstractColumn();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYAnnotForeignKeyRule());
            	      						}
            	      						add(
            	      							current,
            	      							"columns",
            	      							lv_columns_6_0,
            	      							"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotAbstractColumn");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop45;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6());
              		
            }
            // InternalModel.g:2013:3: (otherlv_8= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModel.g:2014:4: otherlv_8= ';'
                    {
                    otherlv_8=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getYAnnotForeignKeyAccess().getSemicolonKeyword_7());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleYAnnotForeignKey"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModel.g:2023:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalModel.g:2023:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalModel.g:2024:2: iv_ruleQualifiedName= ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedName=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedName.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalModel.g:2030:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalModel.g:2036:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalModel.g:2037:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalModel.g:2037:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalModel.g:2038:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_34);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalModel.g:2048:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==48) && (synpred18_InternalModel())) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalModel.g:2049:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalModel.g:2049:4: ( ( '.' )=>kw= '.' )
            	    // InternalModel.g:2050:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_34);
            	    this_ValidID_2=ruleValidID();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				current.merge(this_ValidID_2);
            	      			
            	    }
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }

            	    }
            	    break;

            	default :
            	    break loop47;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalModel.g:2072:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalModel.g:2072:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalModel.g:2073:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleQualifiedNameWithWildcard=ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQualifiedNameWithWildcard.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalModel.g:2079:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2085:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalModel.g:2086:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalModel.g:2086:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalModel.g:2087:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalModel.g:2097:3: (kw= '.*' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==49) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModel.g:2098:4: kw= '.*'
                    {
                    kw=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalModel.g:2108:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalModel.g:2108:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalModel.g:2109:2: iv_ruleValidID= ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleValidID=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValidID.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalModel.g:2115:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalModel.g:2121:2: (this_ID_0= RULE_ID )
            // InternalModel.g:2122:2: this_ID_0= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
              	
            }
            if ( state.backtracking==0 ) {

              		newLeafNode(this_ID_0, grammarAccess.getValidIDAccess().getIDTerminalRuleCall());
              	
            }

            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNumber"
    // InternalModel.g:2132:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2134:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalModel.g:2135:2: iv_ruleNumber= ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleNumber=ruleNumber();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNumber.getText(); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return current;

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalModel.g:2144:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2151:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalModel.g:2152:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalModel.g:2152:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalModel.g:2153:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_34); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalModel.g:2160:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==48) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalModel.g:2161:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,48,FOLLOW_36); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(kw);
                      				newLeafNode(kw, grammarAccess.getNumberAccess().getFullStopKeyword_1_0());
                      			
                    }
                    this_INT_2=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current.merge(this_INT_2);
                      			
                    }
                    if ( state.backtracking==0 ) {

                      				newLeafNode(this_INT_2, grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1());
                      			
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {

              	leaveRule();

            }
        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {

            	myHiddenTokenState.restore();

        }
        return current;
    }
    // $ANTLR end "ruleNumber"

    // $ANTLR start synpred1_InternalModel
    public final void synpred1_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:279:5: ( '(' )
        // InternalModel.g:279:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalModel

    // $ANTLR start synpred2_InternalModel
    public final void synpred2_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:287:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:287:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:287:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:288:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:288:7: ( ( ruleValidID ) )
        // InternalModel.g:289:8: ( ruleValidID )
        {
        // InternalModel.g:289:8: ( ruleValidID )
        // InternalModel.g:290:9: ruleValidID
        {
        pushFollow(FOLLOW_22);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred2_InternalModel

    // $ANTLR start synpred4_InternalModel
    public final void synpred4_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:446:5: ( '(' )
        // InternalModel.g:446:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalModel

    // $ANTLR start synpred5_InternalModel
    public final void synpred5_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:454:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:454:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:454:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:455:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:455:7: ( ( ruleValidID ) )
        // InternalModel.g:456:8: ( ruleValidID )
        {
        // InternalModel.g:456:8: ( ruleValidID )
        // InternalModel.g:457:9: ruleValidID
        {
        pushFollow(FOLLOW_22);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred5_InternalModel

    // $ANTLR start synpred7_InternalModel
    public final void synpred7_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:626:5: ( '(' )
        // InternalModel.g:626:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalModel

    // $ANTLR start synpred8_InternalModel
    public final void synpred8_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:634:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:634:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:634:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:635:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:635:7: ( ( ruleValidID ) )
        // InternalModel.g:636:8: ( ruleValidID )
        {
        // InternalModel.g:636:8: ( ruleValidID )
        // InternalModel.g:637:9: ruleValidID
        {
        pushFollow(FOLLOW_22);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred8_InternalModel

    // $ANTLR start synpred13_InternalModel
    public final void synpred13_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1211:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:1211:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:1211:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:1212:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:1212:7: ( ( ruleValidID ) )
        // InternalModel.g:1213:8: ( ruleValidID )
        {
        // InternalModel.g:1213:8: ( ruleValidID )
        // InternalModel.g:1214:9: ruleValidID
        {
        pushFollow(FOLLOW_22);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred13_InternalModel

    // $ANTLR start synpred15_InternalModel
    public final void synpred15_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1620:5: ( '(' )
        // InternalModel.g:1620:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalModel

    // $ANTLR start synpred16_InternalModel
    public final void synpred16_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1628:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:1628:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:1628:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:1629:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:1629:7: ( ( ruleValidID ) )
        // InternalModel.g:1630:8: ( ruleValidID )
        {
        // InternalModel.g:1630:8: ( ruleValidID )
        // InternalModel.g:1631:9: ruleValidID
        {
        pushFollow(FOLLOW_22);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred16_InternalModel

    // $ANTLR start synpred18_InternalModel
    public final void synpred18_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:2050:5: ( '.' )
        // InternalModel.g:2050:6: '.'
        {
        match(input,48,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred18_InternalModel

    // Delegated rules

    public final boolean synpred7_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred18_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred15_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalModel_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA41 dfa41 = new DFA41(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\27\1\4\1\14\1\4\2\uffff\1\14";
    static final String dfa_4s = "\1\27\1\4\1\60\1\4\2\uffff\1\60";
    static final String dfa_5s = "\4\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\5\3\uffff\1\5\2\uffff\1\5\16\uffff\1\4\12\uffff\3\5\1\3",
            "\1\6",
            "",
            "",
            "\1\5\3\uffff\1\5\2\uffff\1\5\16\uffff\1\4\12\uffff\3\5\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1804:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000100007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000100006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000100004002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000048000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020010L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000004580000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000209002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000009002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000A00000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000003009002L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002009002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000002001002L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000070000070L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x00000000F0000070L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200080000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000E00000080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000800000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x00001FF800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0002000000000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000000000040L});

}