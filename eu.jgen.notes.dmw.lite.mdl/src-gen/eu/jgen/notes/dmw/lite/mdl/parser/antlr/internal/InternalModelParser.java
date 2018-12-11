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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'import'", "'@entity'", "'('", "','", "')'", "'{'", "'}'", "'@attribute'", "'?'", "'@relationship'", "'->'", "'*'", "'<-'", "'@identifier'", "'='", "'true'", "'false'", "'['", "']'", "'@td'", "'database'", "'@table'", "'as'", "'VARCHAR'", "'CHAR'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'DECIMAL'", "'TIME'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", "'@column'", "'@primary'", "'@foreign'", "'@java'", "'uses'", "'@swift'", "'module'", "'@database'", "'.'", "'.*'"
    };
    public static final int T__50=50;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__55=55;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
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

                if ( (LA3_0==14||LA3_0==32||LA3_0==49||LA3_0==51||LA3_0==53) ) {
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
    // InternalModel.g:203:1: ruleYAnnotation returns [EObject current=null] : (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) ;
    public final EObject ruleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotEntity_0 = null;

        EObject this_YAnnotTechnicalDesign_1 = null;

        EObject this_YAnnotDatabase_2 = null;

        EObject this_YAnnotJava_3 = null;

        EObject this_YAnnotSwift_4 = null;



        	enterRule();

        try {
            // InternalModel.g:209:2: ( (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) )
            // InternalModel.g:210:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            {
            // InternalModel.g:210:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            int alt4=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt4=1;
                }
                break;
            case 32:
                {
                alt4=2;
                }
                break;
            case 53:
                {
                alt4=3;
                }
                break;
            case 49:
                {
                alt4=4;
                }
                break;
            case 51:
                {
                alt4=5;
                }
                break;
            default:
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
                case 3 :
                    // InternalModel.g:229:3: this_YAnnotDatabase_2= ruleYAnnotDatabase
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotationAccess().getYAnnotDatabaseParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotDatabase_2=ruleYAnnotDatabase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotDatabase_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalModel.g:238:3: this_YAnnotJava_3= ruleYAnnotJava
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotationAccess().getYAnnotJavaParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotJava_3=ruleYAnnotJava();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotJava_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalModel.g:247:3: this_YAnnotSwift_4= ruleYAnnotSwift
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYAnnotationAccess().getYAnnotSwiftParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAnnotSwift_4=ruleYAnnotSwift();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAnnotSwift_4;
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
    // InternalModel.g:259:1: entryRuleYAnnotEntity returns [EObject current=null] : iv_ruleYAnnotEntity= ruleYAnnotEntity EOF ;
    public final EObject entryRuleYAnnotEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntity = null;


        try {
            // InternalModel.g:259:53: (iv_ruleYAnnotEntity= ruleYAnnotEntity EOF )
            // InternalModel.g:260:2: iv_ruleYAnnotEntity= ruleYAnnotEntity EOF
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
    // InternalModel.g:266:1: ruleYAnnotEntity returns [EObject current=null] : ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) ;
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
            // InternalModel.g:272:2: ( ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) )
            // InternalModel.g:273:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            {
            // InternalModel.g:273:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            // InternalModel.g:274:3: () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}'
            {
            // InternalModel.g:274:3: ()
            // InternalModel.g:275:4: 
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
            // InternalModel.g:285:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:286:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:286:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:287:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:304:3: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) && (synpred1_InternalModel())) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModel.g:305:4: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')'
                    {
                    // InternalModel.g:305:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalModel.g:306:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0());
                      				
                    }

                    }

                    // InternalModel.g:312:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==RULE_ID) && (synpred2_InternalModel())) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // InternalModel.g:313:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:313:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:314:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:323:6: (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:324:7: lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:341:5: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==16) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // InternalModel.g:342:6: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:346:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:347:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:356:7: (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:357:8: lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair
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
            // InternalModel.g:385:3: ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==20||LA8_0==22||LA8_0==26) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModel.g:386:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    {
            	    // InternalModel.g:386:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    // InternalModel.g:387:5: lv_annotations_9_0= ruleYAnnotEntityInner
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
    // InternalModel.g:412:1: entryRuleYAnnotAttribute returns [EObject current=null] : iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF ;
    public final EObject entryRuleYAnnotAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAttribute = null;


        try {
            // InternalModel.g:412:56: (iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF )
            // InternalModel.g:413:2: iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF
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
    // InternalModel.g:419:1: ruleYAnnotAttribute returns [EObject current=null] : ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) ;
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
            // InternalModel.g:425:2: ( ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) )
            // InternalModel.g:426:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            {
            // InternalModel.g:426:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            // InternalModel.g:427:3: () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )?
            {
            // InternalModel.g:427:3: ()
            // InternalModel.g:428:4: 
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
            // InternalModel.g:438:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:439:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:439:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:440:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:457:3: ( (lv_optional_3_0= '?' ) )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==21) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalModel.g:458:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:458:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:459:5: lv_optional_3_0= '?'
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

            // InternalModel.g:471:3: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==15) && (synpred4_InternalModel())) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModel.g:472:4: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')'
                    {
                    // InternalModel.g:472:4: ( ( '(' )=>otherlv_4= '(' )
                    // InternalModel.g:473:5: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0());
                      				
                    }

                    }

                    // InternalModel.g:479:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==RULE_ID) && (synpred5_InternalModel())) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalModel.g:480:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:480:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:481:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:490:6: (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:491:7: lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:508:5: (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            loop10:
                            do {
                                int alt10=2;
                                int LA10_0 = input.LA(1);

                                if ( (LA10_0==16) ) {
                                    alt10=1;
                                }


                                switch (alt10) {
                            	case 1 :
                            	    // InternalModel.g:509:6: otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:513:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:514:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:523:7: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:524:8: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
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

            // InternalModel.g:548:3: (otherlv_9= ';' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==12) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModel.g:549:4: otherlv_9= ';'
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
    // InternalModel.g:558:1: entryRuleYAnnotRelationship returns [EObject current=null] : iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF ;
    public final EObject entryRuleYAnnotRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotRelationship = null;


        try {
            // InternalModel.g:558:59: (iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF )
            // InternalModel.g:559:2: iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF
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
    // InternalModel.g:565:1: ruleYAnnotRelationship returns [EObject current=null] : ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) ;
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
            // InternalModel.g:571:2: ( ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) )
            // InternalModel.g:572:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            {
            // InternalModel.g:572:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            // InternalModel.g:573:3: () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )?
            {
            // InternalModel.g:573:3: ()
            // InternalModel.g:574:4: 
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
            // InternalModel.g:584:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:585:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:585:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:586:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:603:3: ( (lv_optional_3_0= '?' ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==21) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModel.g:604:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:604:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:605:5: lv_optional_3_0= '?'
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
            // InternalModel.g:621:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:622:4: ( ruleQualifiedName )
            {
            // InternalModel.g:622:4: ( ruleQualifiedName )
            // InternalModel.g:623:5: ruleQualifiedName
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

            // InternalModel.g:637:3: ( (lv_many_6_0= '*' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==24) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModel.g:638:4: (lv_many_6_0= '*' )
                    {
                    // InternalModel.g:638:4: (lv_many_6_0= '*' )
                    // InternalModel.g:639:5: lv_many_6_0= '*'
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

            // InternalModel.g:651:3: ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==15) && (synpred7_InternalModel())) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalModel.g:652:4: ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')'
                    {
                    // InternalModel.g:652:4: ( ( '(' )=>otherlv_7= '(' )
                    // InternalModel.g:653:5: ( '(' )=>otherlv_7= '('
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0());
                      				
                    }

                    }

                    // InternalModel.g:659:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==RULE_ID) && (synpred8_InternalModel())) {
                        alt17=1;
                    }
                    switch (alt17) {
                        case 1 :
                            // InternalModel.g:660:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:660:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:661:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:670:6: (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:671:7: lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:688:5: (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            loop16:
                            do {
                                int alt16=2;
                                int LA16_0 = input.LA(1);

                                if ( (LA16_0==16) ) {
                                    alt16=1;
                                }


                                switch (alt16) {
                            	case 1 :
                            	    // InternalModel.g:689:6: otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_9=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_9, grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:693:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:694:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:703:7: (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:704:8: lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair
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

            // InternalModel.g:728:3: (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==25) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModel.g:729:4: otherlv_12= '<-' ( ( ruleQualifiedName ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0());
                      			
                    }
                    // InternalModel.g:733:4: ( ( ruleQualifiedName ) )
                    // InternalModel.g:734:5: ( ruleQualifiedName )
                    {
                    // InternalModel.g:734:5: ( ruleQualifiedName )
                    // InternalModel.g:735:6: ruleQualifiedName
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

            // InternalModel.g:750:3: (otherlv_14= ';' )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==12) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModel.g:751:4: otherlv_14= ';'
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
    // InternalModel.g:760:1: entryRuleYAnnotIdentifier returns [EObject current=null] : iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF ;
    public final EObject entryRuleYAnnotIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotIdentifier = null;


        try {
            // InternalModel.g:760:57: (iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF )
            // InternalModel.g:761:2: iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF
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
    // InternalModel.g:767:1: ruleYAnnotIdentifier returns [EObject current=null] : ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) ;
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
            // InternalModel.g:773:2: ( ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) )
            // InternalModel.g:774:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            {
            // InternalModel.g:774:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            // InternalModel.g:775:3: () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )?
            {
            // InternalModel.g:775:3: ()
            // InternalModel.g:776:4: 
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
            // InternalModel.g:786:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:787:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:787:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:788:5: lv_name_2_0= ruleValidID
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
            // InternalModel.g:809:3: ( (otherlv_4= RULE_ID ) )
            // InternalModel.g:810:4: (otherlv_4= RULE_ID )
            {
            // InternalModel.g:810:4: (otherlv_4= RULE_ID )
            // InternalModel.g:811:5: otherlv_4= RULE_ID
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

            // InternalModel.g:822:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==16) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // InternalModel.g:823:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:827:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalModel.g:828:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalModel.g:828:5: (otherlv_6= RULE_ID )
            	    // InternalModel.g:829:6: otherlv_6= RULE_ID
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
            // InternalModel.g:845:3: (otherlv_8= ';' )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==12) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModel.g:846:4: otherlv_8= ';'
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
    // InternalModel.g:855:1: entryRuleYAnnotationElementValuePair returns [EObject current=null] : iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF ;
    public final EObject entryRuleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotationElementValuePair = null;


        try {
            // InternalModel.g:855:68: (iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF )
            // InternalModel.g:856:2: iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF
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
    // InternalModel.g:862:1: ruleYAnnotationElementValuePair returns [EObject current=null] : ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) ;
    public final EObject ruleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:868:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) )
            // InternalModel.g:869:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            {
            // InternalModel.g:869:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            // InternalModel.g:870:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) )
            {
            // InternalModel.g:870:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) )
            // InternalModel.g:871:4: ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            {
            // InternalModel.g:880:4: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            // InternalModel.g:881:5: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '='
            {
            // InternalModel.g:881:5: ( (lv_name_0_0= ruleValidID ) )
            // InternalModel.g:882:6: (lv_name_0_0= ruleValidID )
            {
            // InternalModel.g:882:6: (lv_name_0_0= ruleValidID )
            // InternalModel.g:883:7: lv_name_0_0= ruleValidID
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

            // InternalModel.g:906:3: ( (lv_value_2_0= ruleYAnnotExpression ) )
            // InternalModel.g:907:4: (lv_value_2_0= ruleYAnnotExpression )
            {
            // InternalModel.g:907:4: (lv_value_2_0= ruleYAnnotExpression )
            // InternalModel.g:908:5: lv_value_2_0= ruleYAnnotExpression
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
    // InternalModel.g:929:1: entryRuleYAnnotEntityInner returns [EObject current=null] : iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF ;
    public final EObject entryRuleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntityInner = null;


        try {
            // InternalModel.g:929:58: (iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF )
            // InternalModel.g:930:2: iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF
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
    // InternalModel.g:936:1: ruleYAnnotEntityInner returns [EObject current=null] : (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) ;
    public final EObject ruleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotAttribute_0 = null;

        EObject this_YAnnotRelationship_1 = null;

        EObject this_YAnnotIdentifier_2 = null;



        	enterRule();

        try {
            // InternalModel.g:942:2: ( (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) )
            // InternalModel.g:943:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            {
            // InternalModel.g:943:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
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
                    // InternalModel.g:944:3: this_YAnnotAttribute_0= ruleYAnnotAttribute
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
                    // InternalModel.g:953:3: this_YAnnotRelationship_1= ruleYAnnotRelationship
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
                    // InternalModel.g:962:3: this_YAnnotIdentifier_2= ruleYAnnotIdentifier
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
    // InternalModel.g:974:1: entryRuleYAnnotExpression returns [EObject current=null] : iv_ruleYAnnotExpression= ruleYAnnotExpression EOF ;
    public final EObject entryRuleYAnnotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotExpression = null;


        try {
            // InternalModel.g:974:57: (iv_ruleYAnnotExpression= ruleYAnnotExpression EOF )
            // InternalModel.g:975:2: iv_ruleYAnnotExpression= ruleYAnnotExpression EOF
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
    // InternalModel.g:981:1: ruleYAnnotExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) ;
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
            // InternalModel.g:987:2: ( ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) )
            // InternalModel.g:988:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            {
            // InternalModel.g:988:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
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
                    // InternalModel.g:989:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    {
                    // InternalModel.g:989:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    // InternalModel.g:990:4: () ( (lv_value_1_0= ruleValidID ) )
                    {
                    // InternalModel.g:990:4: ()
                    // InternalModel.g:991:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:997:4: ( (lv_value_1_0= ruleValidID ) )
                    // InternalModel.g:998:5: (lv_value_1_0= ruleValidID )
                    {
                    // InternalModel.g:998:5: (lv_value_1_0= ruleValidID )
                    // InternalModel.g:999:6: lv_value_1_0= ruleValidID
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
                    // InternalModel.g:1018:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalModel.g:1018:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalModel.g:1019:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalModel.g:1019:4: ()
                    // InternalModel.g:1020:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1026:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalModel.g:1027:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalModel.g:1027:5: (lv_value_3_0= RULE_STRING )
                    // InternalModel.g:1028:6: lv_value_3_0= RULE_STRING
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
                    // InternalModel.g:1046:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    {
                    // InternalModel.g:1046:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    // InternalModel.g:1047:4: () ( (lv_value_5_0= ruleNumber ) )
                    {
                    // InternalModel.g:1047:4: ()
                    // InternalModel.g:1048:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1054:4: ( (lv_value_5_0= ruleNumber ) )
                    // InternalModel.g:1055:5: (lv_value_5_0= ruleNumber )
                    {
                    // InternalModel.g:1055:5: (lv_value_5_0= ruleNumber )
                    // InternalModel.g:1056:6: lv_value_5_0= ruleNumber
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
                    // InternalModel.g:1075:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalModel.g:1075:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalModel.g:1076:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalModel.g:1076:4: ()
                    // InternalModel.g:1077:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1083:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalModel.g:1084:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalModel.g:1084:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalModel.g:1085:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalModel.g:1085:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
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
                            // InternalModel.g:1086:7: lv_value_7_1= 'true'
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
                            // InternalModel.g:1097:7: lv_value_7_2= 'false'
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
                    // InternalModel.g:1112:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    {
                    // InternalModel.g:1112:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    // InternalModel.g:1113:4: () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']'
                    {
                    // InternalModel.g:1113:4: ()
                    // InternalModel.g:1114:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1120:4: ( ( '[' )=>otherlv_9= '[' )
                    // InternalModel.g:1121:5: ( '[' )=>otherlv_9= '['
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0());
                      				
                    }

                    }

                    // InternalModel.g:1128:4: ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( ((LA26_0>=RULE_ID && LA26_0<=RULE_INT)||(LA26_0>=28 && LA26_0<=30)) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // InternalModel.g:1129:5: ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            {
                            // InternalModel.g:1129:5: ( (lv_elements_10_0= ruleYAnnotExpression ) )
                            // InternalModel.g:1130:6: (lv_elements_10_0= ruleYAnnotExpression )
                            {
                            // InternalModel.g:1130:6: (lv_elements_10_0= ruleYAnnotExpression )
                            // InternalModel.g:1131:7: lv_elements_10_0= ruleYAnnotExpression
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

                            // InternalModel.g:1148:5: (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            loop25:
                            do {
                                int alt25=2;
                                int LA25_0 = input.LA(1);

                                if ( (LA25_0==16) ) {
                                    alt25=1;
                                }


                                switch (alt25) {
                            	case 1 :
                            	    // InternalModel.g:1149:6: otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_11, grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1153:6: ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    // InternalModel.g:1154:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    {
                            	    // InternalModel.g:1154:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    // InternalModel.g:1155:8: lv_elements_12_0= ruleYAnnotExpression
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
    // InternalModel.g:1183:1: entryRuleYAnnotTechnicalDesign returns [EObject current=null] : iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF ;
    public final EObject entryRuleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTechnicalDesign = null;


        try {
            // InternalModel.g:1183:62: (iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF )
            // InternalModel.g:1184:2: iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF
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
    // InternalModel.g:1190:1: ruleYAnnotTechnicalDesign returns [EObject current=null] : ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) ;
    public final EObject ruleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_features_5_0 = null;



        	enterRule();

        try {
            // InternalModel.g:1196:2: ( ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) )
            // InternalModel.g:1197:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            {
            // InternalModel.g:1197:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            // InternalModel.g:1198:3: () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}'
            {
            // InternalModel.g:1198:3: ()
            // InternalModel.g:1199:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,32,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTechnicalDesignAccess().getTdKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,33,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseKeyword_2());
              		
            }
            // InternalModel.g:1213:3: ( (otherlv_3= RULE_ID ) )
            // InternalModel.g:1214:4: (otherlv_3= RULE_ID )
            {
            // InternalModel.g:1214:4: (otherlv_3= RULE_ID )
            // InternalModel.g:1215:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotTechnicalDesignRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_11); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,18,FOLLOW_27); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYAnnotTechnicalDesignAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalModel.g:1230:3: ( (lv_features_5_0= ruleYAnnotTable ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==34) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // InternalModel.g:1231:4: (lv_features_5_0= ruleYAnnotTable )
            	    {
            	    // InternalModel.g:1231:4: (lv_features_5_0= ruleYAnnotTable )
            	    // InternalModel.g:1232:5: lv_features_5_0= ruleYAnnotTable
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesYAnnotTableParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_27);
            	    lv_features_5_0=ruleYAnnotTable();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYAnnotTechnicalDesignRule());
            	      					}
            	      					add(
            	      						current,
            	      						"features",
            	      						lv_features_5_0,
            	      						"eu.jgen.notes.dmw.lite.mdl.Model.YAnnotTable");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);

            otherlv_6=(Token)match(input,19,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYAnnotTechnicalDesignAccess().getRightCurlyBracketKeyword_6());
              		
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
    // InternalModel.g:1257:1: entryRuleYAnnotTable returns [EObject current=null] : iv_ruleYAnnotTable= ruleYAnnotTable EOF ;
    public final EObject entryRuleYAnnotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTable = null;


        try {
            // InternalModel.g:1257:52: (iv_ruleYAnnotTable= ruleYAnnotTable EOF )
            // InternalModel.g:1258:2: iv_ruleYAnnotTable= ruleYAnnotTable EOF
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
    // InternalModel.g:1264:1: ruleYAnnotTable returns [EObject current=null] : ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) ;
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
            // InternalModel.g:1270:2: ( ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) )
            // InternalModel.g:1271:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            {
            // InternalModel.g:1271:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            // InternalModel.g:1272:3: () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}'
            {
            // InternalModel.g:1272:3: ()
            // InternalModel.g:1273:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTableAccess().getTableKeyword_1());
              		
            }
            // InternalModel.g:1283:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1284:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1284:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1285:5: lv_name_2_0= ruleValidID
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
            // InternalModel.g:1306:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1307:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1307:4: ( ruleQualifiedName )
            // InternalModel.g:1308:5: ruleQualifiedName
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

            otherlv_5=(Token)match(input,18,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYAnnotTableAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalModel.g:1326:3: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==46) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModel.g:1327:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1327:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1328:5: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getColumnsYAnnotAbstractColumnParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_28);
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
            	    break loop29;
                }
            } while (true);

            // InternalModel.g:1345:3: ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==47) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // InternalModel.g:1346:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    {
                    // InternalModel.g:1346:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    // InternalModel.g:1347:5: lv_primarykey_7_0= ruleYAnnotPrimaryKey
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getPrimarykeyYAnnotPrimaryKeyParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_29);
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

            // InternalModel.g:1364:3: ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==48) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalModel.g:1365:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    {
            	    // InternalModel.g:1365:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    // InternalModel.g:1366:5: lv_foreignkeys_8_0= ruleYAnnotForeignKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getForeignkeysYAnnotForeignKeyParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_29);
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
            	    break loop31;
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
    // InternalModel.g:1391:1: entryRuleYAnnotColumn returns [EObject current=null] : iv_ruleYAnnotColumn= ruleYAnnotColumn EOF ;
    public final EObject entryRuleYAnnotColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumn = null;


        try {
            // InternalModel.g:1391:53: (iv_ruleYAnnotColumn= ruleYAnnotColumn EOF )
            // InternalModel.g:1392:2: iv_ruleYAnnotColumn= ruleYAnnotColumn EOF
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
    // InternalModel.g:1398:1: ruleYAnnotColumn returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) ;
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
            // InternalModel.g:1404:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            // InternalModel.g:1405:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            {
            // InternalModel.g:1405:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            // InternalModel.g:1406:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )?
            {
            // InternalModel.g:1406:3: ()
            // InternalModel.g:1407:4: 
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
            // InternalModel.g:1417:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1418:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1418:4: ( ruleQualifiedName )
            // InternalModel.g:1419:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotColumnRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,35,FOLLOW_31); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotColumnAccess().getAsKeyword_3());
              		
            }
            // InternalModel.g:1437:3: ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) )
            // InternalModel.g:1438:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            {
            // InternalModel.g:1438:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            // InternalModel.g:1439:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            {
            // InternalModel.g:1439:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            int alt32=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt32=1;
                }
                break;
            case 37:
                {
                alt32=2;
                }
                break;
            case 38:
                {
                alt32=3;
                }
                break;
            case 39:
                {
                alt32=4;
                }
                break;
            case 40:
                {
                alt32=5;
                }
                break;
            case 41:
                {
                alt32=6;
                }
                break;
            case 42:
                {
                alt32=7;
                }
                break;
            case 43:
                {
                alt32=8;
                }
                break;
            case 44:
                {
                alt32=9;
                }
                break;
            case 45:
                {
                alt32=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }

            switch (alt32) {
                case 1 :
                    // InternalModel.g:1440:6: lv_type_4_1= 'VARCHAR'
                    {
                    lv_type_4_1=(Token)match(input,36,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1451:6: lv_type_4_2= 'CHAR'
                    {
                    lv_type_4_2=(Token)match(input,37,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1462:6: lv_type_4_3= 'INTEGER'
                    {
                    lv_type_4_3=(Token)match(input,38,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1473:6: lv_type_4_4= 'BIGINT'
                    {
                    lv_type_4_4=(Token)match(input,39,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1484:6: lv_type_4_5= 'SMALLINT'
                    {
                    lv_type_4_5=(Token)match(input,40,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1495:6: lv_type_4_6= 'DECIMAL'
                    {
                    lv_type_4_6=(Token)match(input,41,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1506:6: lv_type_4_7= 'TIME'
                    {
                    lv_type_4_7=(Token)match(input,42,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1517:6: lv_type_4_8= 'DATE'
                    {
                    lv_type_4_8=(Token)match(input,43,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1528:6: lv_type_4_9= 'TIMESTAMP'
                    {
                    lv_type_4_9=(Token)match(input,44,FOLLOW_13); if (state.failed) return current;
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
                    // InternalModel.g:1539:6: lv_type_4_10= 'BOOLEAN'
                    {
                    lv_type_4_10=(Token)match(input,45,FOLLOW_13); if (state.failed) return current;
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

            // InternalModel.g:1552:3: ( (lv_optional_5_0= '?' ) )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==21) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // InternalModel.g:1553:4: (lv_optional_5_0= '?' )
                    {
                    // InternalModel.g:1553:4: (lv_optional_5_0= '?' )
                    // InternalModel.g:1554:5: lv_optional_5_0= '?'
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

            // InternalModel.g:1566:3: ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==15) && (synpred12_InternalModel())) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModel.g:1567:4: ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')'
                    {
                    // InternalModel.g:1567:4: ( ( '(' )=>otherlv_6= '(' )
                    // InternalModel.g:1568:5: ( '(' )=>otherlv_6= '('
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0());
                      				
                    }

                    }

                    // InternalModel.g:1574:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==RULE_ID) && (synpred13_InternalModel())) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // InternalModel.g:1575:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:1575:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:1576:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:1585:6: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:1586:7: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:1603:5: (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            loop34:
                            do {
                                int alt34=2;
                                int LA34_0 = input.LA(1);

                                if ( (LA34_0==16) ) {
                                    alt34=1;
                                }


                                switch (alt34) {
                            	case 1 :
                            	    // InternalModel.g:1604:6: otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_8=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_8, grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1608:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:1609:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:1618:7: (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:1619:8: lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair
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
                            	    break loop34;
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

            // InternalModel.g:1643:3: (otherlv_11= ';' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==12) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModel.g:1644:4: otherlv_11= ';'
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
    // InternalModel.g:1653:1: entryRuleYAnnotColumnLike returns [EObject current=null] : iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF ;
    public final EObject entryRuleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumnLike = null;


        try {
            // InternalModel.g:1653:57: (iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF )
            // InternalModel.g:1654:2: iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF
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
    // InternalModel.g:1660:1: ruleYAnnotColumnLike returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModel.g:1666:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) )
            // InternalModel.g:1667:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            {
            // InternalModel.g:1667:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            // InternalModel.g:1668:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )?
            {
            // InternalModel.g:1668:3: ()
            // InternalModel.g:1669:4: 
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
            // InternalModel.g:1679:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1680:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1680:4: ( ruleQualifiedName )
            // InternalModel.g:1681:5: ruleQualifiedName
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

            // InternalModel.g:1695:3: (otherlv_3= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModel.g:1696:4: otherlv_3= ';'
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
    // InternalModel.g:1705:1: entryRuleYAnnotAbstractColumn returns [EObject current=null] : iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF ;
    public final EObject entryRuleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAbstractColumn = null;


        try {
            // InternalModel.g:1705:61: (iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF )
            // InternalModel.g:1706:2: iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF
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
    // InternalModel.g:1712:1: ruleYAnnotAbstractColumn returns [EObject current=null] : ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) ;
    public final EObject ruleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_3_1 = null;

        EObject lv_type_3_2 = null;



        	enterRule();

        try {
            // InternalModel.g:1718:2: ( ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) )
            // InternalModel.g:1719:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            {
            // InternalModel.g:1719:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            // InternalModel.g:1720:3: () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            {
            // InternalModel.g:1720:3: ()
            // InternalModel.g:1721:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,46,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1());
              		
            }
            // InternalModel.g:1731:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1732:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1732:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1733:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:1750:3: ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            // InternalModel.g:1751:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            {
            // InternalModel.g:1751:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            // InternalModel.g:1752:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            {
            // InternalModel.g:1752:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            int alt39=2;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // InternalModel.g:1753:6: lv_type_3_1= ruleYAnnotColumn
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
                    // InternalModel.g:1769:6: lv_type_3_2= ruleYAnnotColumnLike
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
    // InternalModel.g:1791:1: entryRuleYAnnotPrimaryKey returns [EObject current=null] : iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF ;
    public final EObject entryRuleYAnnotPrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotPrimaryKey = null;


        try {
            // InternalModel.g:1791:57: (iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF )
            // InternalModel.g:1792:2: iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF
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
    // InternalModel.g:1798:1: ruleYAnnotPrimaryKey returns [EObject current=null] : ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) ;
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
            // InternalModel.g:1804:2: ( ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) )
            // InternalModel.g:1805:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            {
            // InternalModel.g:1805:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            // InternalModel.g:1806:3: () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )?
            {
            // InternalModel.g:1806:3: ()
            // InternalModel.g:1807:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,47,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,15,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotPrimaryKeyAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalModel.g:1821:3: ( (otherlv_3= RULE_ID ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalModel.g:1822:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalModel.g:1822:4: (otherlv_3= RULE_ID )
            	    // InternalModel.g:1823:5: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getYAnnotPrimaryKeyRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_32); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            // InternalModel.g:1834:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==16) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalModel.g:1835:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalModel.g:1839:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalModel.g:1840:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalModel.g:1840:5: (otherlv_5= RULE_ID )
            	    // InternalModel.g:1841:6: otherlv_5= RULE_ID
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
            	    break loop41;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalModel.g:1857:3: (otherlv_7= ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==12) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalModel.g:1858:4: otherlv_7= ';'
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
    // InternalModel.g:1867:1: entryRuleYAnnotForeignKey returns [EObject current=null] : iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF ;
    public final EObject entryRuleYAnnotForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotForeignKey = null;


        try {
            // InternalModel.g:1867:57: (iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF )
            // InternalModel.g:1868:2: iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF
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
    // InternalModel.g:1874:1: ruleYAnnotForeignKey returns [EObject current=null] : ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ;
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
            // InternalModel.g:1880:2: ( ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            // InternalModel.g:1881:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            {
            // InternalModel.g:1881:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            // InternalModel.g:1882:3: () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
            {
            // InternalModel.g:1882:3: ()
            // InternalModel.g:1883:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,48,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1());
              		
            }
            // InternalModel.g:1893:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1894:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1894:4: ( ruleQualifiedName )
            // InternalModel.g:1895:5: ruleQualifiedName
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

            otherlv_3=(Token)match(input,18,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotForeignKeyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalModel.g:1913:3: ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) )
            // InternalModel.g:1914:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:1914:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            // InternalModel.g:1915:5: lv_columns_4_0= ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_34);
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

            // InternalModel.g:1932:3: (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==16) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalModel.g:1933:4: otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:1937:4: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    // InternalModel.g:1938:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1938:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1939:6: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_34);
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
            	    break loop43;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6());
              		
            }
            // InternalModel.g:1961:3: (otherlv_8= ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==12) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModel.g:1962:4: otherlv_8= ';'
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


    // $ANTLR start "entryRuleYAnnotJava"
    // InternalModel.g:1971:1: entryRuleYAnnotJava returns [EObject current=null] : iv_ruleYAnnotJava= ruleYAnnotJava EOF ;
    public final EObject entryRuleYAnnotJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotJava = null;


        try {
            // InternalModel.g:1971:51: (iv_ruleYAnnotJava= ruleYAnnotJava EOF )
            // InternalModel.g:1972:2: iv_ruleYAnnotJava= ruleYAnnotJava EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotJavaRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotJava=ruleYAnnotJava();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotJava; 
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
    // $ANTLR end "entryRuleYAnnotJava"


    // $ANTLR start "ruleYAnnotJava"
    // InternalModel.g:1978:1: ruleYAnnotJava returns [EObject current=null] : ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleYAnnotJava() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalModel.g:1984:2: ( ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) )
            // InternalModel.g:1985:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            {
            // InternalModel.g:1985:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            // InternalModel.g:1986:3: () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )?
            {
            // InternalModel.g:1986:3: ()
            // InternalModel.g:1987:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotJavaAccess().getYAnnotJavaAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,49,FOLLOW_35); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotJavaAccess().getJavaKeyword_1());
              		
            }
            // InternalModel.g:1997:3: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==50) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalModel.g:1998:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYAnnotJavaAccess().getUsesKeyword_2_0());
                      			
                    }
                    // InternalModel.g:2002:4: ( (otherlv_3= RULE_ID ) )
                    // InternalModel.g:2003:5: (otherlv_3= RULE_ID )
                    {
                    // InternalModel.g:2003:5: (otherlv_3= RULE_ID )
                    // InternalModel.g:2004:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotJavaRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalModel.g:2016:3: (otherlv_4= ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==12) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModel.g:2017:4: otherlv_4= ';'
                    {
                    otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getYAnnotJavaAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleYAnnotJava"


    // $ANTLR start "entryRuleYAnnotSwift"
    // InternalModel.g:2026:1: entryRuleYAnnotSwift returns [EObject current=null] : iv_ruleYAnnotSwift= ruleYAnnotSwift EOF ;
    public final EObject entryRuleYAnnotSwift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotSwift = null;


        try {
            // InternalModel.g:2026:52: (iv_ruleYAnnotSwift= ruleYAnnotSwift EOF )
            // InternalModel.g:2027:2: iv_ruleYAnnotSwift= ruleYAnnotSwift EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotSwiftRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotSwift=ruleYAnnotSwift();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotSwift; 
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
    // $ANTLR end "entryRuleYAnnotSwift"


    // $ANTLR start "ruleYAnnotSwift"
    // InternalModel.g:2033:1: ruleYAnnotSwift returns [EObject current=null] : ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) ;
    public final EObject ruleYAnnotSwift() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        AntlrDatatypeRuleToken lv_name_3_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2039:2: ( ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) )
            // InternalModel.g:2040:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            {
            // InternalModel.g:2040:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            // InternalModel.g:2041:3: () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )?
            {
            // InternalModel.g:2041:3: ()
            // InternalModel.g:2042:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotSwiftAccess().getYAnnotSwiftAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,51,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotSwiftAccess().getSwiftKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotSwiftAccess().getModuleKeyword_2());
              		
            }
            // InternalModel.g:2056:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalModel.g:2057:4: (lv_name_3_0= ruleValidID )
            {
            // InternalModel.g:2057:4: (lv_name_3_0= ruleValidID )
            // InternalModel.g:2058:5: lv_name_3_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotSwiftAccess().getNameValidIDParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_35);
            lv_name_3_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotSwiftRule());
              					}
              					set(
              						current,
              						"name",
              						lv_name_3_0,
              						"eu.jgen.notes.dmw.lite.mdl.Model.ValidID");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalModel.g:2075:3: (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==50) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalModel.g:2076:4: otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getYAnnotSwiftAccess().getUsesKeyword_4_0());
                      			
                    }
                    // InternalModel.g:2080:4: ( (otherlv_5= RULE_ID ) )
                    // InternalModel.g:2081:5: (otherlv_5= RULE_ID )
                    {
                    // InternalModel.g:2081:5: (otherlv_5= RULE_ID )
                    // InternalModel.g:2082:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotSwiftRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_15); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalModel.g:2094:3: (otherlv_6= ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==12) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModel.g:2095:4: otherlv_6= ';'
                    {
                    otherlv_6=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getYAnnotSwiftAccess().getSemicolonKeyword_5());
                      			
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
    // $ANTLR end "ruleYAnnotSwift"


    // $ANTLR start "entryRuleYAnnotDatabase"
    // InternalModel.g:2104:1: entryRuleYAnnotDatabase returns [EObject current=null] : iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF ;
    public final EObject entryRuleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotDatabase = null;


        try {
            // InternalModel.g:2104:55: (iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF )
            // InternalModel.g:2105:2: iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAnnotDatabaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAnnotDatabase=ruleYAnnotDatabase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAnnotDatabase; 
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
    // $ANTLR end "entryRuleYAnnotDatabase"


    // $ANTLR start "ruleYAnnotDatabase"
    // InternalModel.g:2111:1: ruleYAnnotDatabase returns [EObject current=null] : ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2117:2: ( ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) )
            // InternalModel.g:2118:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            {
            // InternalModel.g:2118:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            // InternalModel.g:2119:3: () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )?
            {
            // InternalModel.g:2119:3: ()
            // InternalModel.g:2120:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotDatabaseAccess().getYAnnotDatabaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,53,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotDatabaseAccess().getDatabaseKeyword_1());
              		
            }
            // InternalModel.g:2130:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:2131:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:2131:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:2132:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotDatabaseAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_15);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAnnotDatabaseRule());
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

            // InternalModel.g:2149:3: (otherlv_3= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalModel.g:2150:4: otherlv_3= ';'
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getYAnnotDatabaseAccess().getSemicolonKeyword_3());
                      			
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
    // $ANTLR end "ruleYAnnotDatabase"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModel.g:2159:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalModel.g:2159:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalModel.g:2160:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalModel.g:2166:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalModel.g:2172:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalModel.g:2173:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalModel.g:2173:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalModel.g:2174:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_37);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalModel.g:2184:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==54) && (synpred15_InternalModel())) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalModel.g:2185:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalModel.g:2185:4: ( ( '.' )=>kw= '.' )
            	    // InternalModel.g:2186:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,54,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_37);
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
            	    break loop50;
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
    // InternalModel.g:2208:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalModel.g:2208:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalModel.g:2209:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalModel.g:2215:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2221:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalModel.g:2222:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalModel.g:2222:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalModel.g:2223:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_38);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalModel.g:2233:3: (kw= '.*' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==55) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalModel.g:2234:4: kw= '.*'
                    {
                    kw=(Token)match(input,55,FOLLOW_2); if (state.failed) return current;
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
    // InternalModel.g:2244:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalModel.g:2244:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalModel.g:2245:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalModel.g:2251:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalModel.g:2257:2: (this_ID_0= RULE_ID )
            // InternalModel.g:2258:2: this_ID_0= RULE_ID
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
    // InternalModel.g:2268:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2270:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalModel.g:2271:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalModel.g:2280:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2287:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalModel.g:2288:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalModel.g:2288:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalModel.g:2289:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalModel.g:2296:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==54) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalModel.g:2297:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,54,FOLLOW_39); if (state.failed) return current;
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
        // InternalModel.g:306:5: ( '(' )
        // InternalModel.g:306:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalModel

    // $ANTLR start synpred2_InternalModel
    public final void synpred2_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:314:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:314:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:314:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:315:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:315:7: ( ( ruleValidID ) )
        // InternalModel.g:316:8: ( ruleValidID )
        {
        // InternalModel.g:316:8: ( ruleValidID )
        // InternalModel.g:317:9: ruleValidID
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
        // InternalModel.g:473:5: ( '(' )
        // InternalModel.g:473:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalModel

    // $ANTLR start synpred5_InternalModel
    public final void synpred5_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:481:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:481:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:481:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:482:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:482:7: ( ( ruleValidID ) )
        // InternalModel.g:483:8: ( ruleValidID )
        {
        // InternalModel.g:483:8: ( ruleValidID )
        // InternalModel.g:484:9: ruleValidID
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
        // InternalModel.g:653:5: ( '(' )
        // InternalModel.g:653:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalModel

    // $ANTLR start synpred8_InternalModel
    public final void synpred8_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:661:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:661:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:661:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:662:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:662:7: ( ( ruleValidID ) )
        // InternalModel.g:663:8: ( ruleValidID )
        {
        // InternalModel.g:663:8: ( ruleValidID )
        // InternalModel.g:664:9: ruleValidID
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

    // $ANTLR start synpred12_InternalModel
    public final void synpred12_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1568:5: ( '(' )
        // InternalModel.g:1568:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalModel

    // $ANTLR start synpred13_InternalModel
    public final void synpred13_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1576:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:1576:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:1576:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:1577:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:1577:7: ( ( ruleValidID ) )
        // InternalModel.g:1578:8: ( ruleValidID )
        {
        // InternalModel.g:1578:8: ( ruleValidID )
        // InternalModel.g:1579:9: ruleValidID
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
        // InternalModel.g:2186:5: ( '.' )
        // InternalModel.g:2186:6: '.'
        {
        match(input,54,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred15_InternalModel

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
    public final boolean synpred12_InternalModel() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_InternalModel_fragment(); // can never throw exception
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


    protected DFA39 dfa39 = new DFA39(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_3s = "\1\27\1\4\1\14\1\4\2\uffff\1\14";
    static final String dfa_4s = "\1\27\1\4\1\66\1\4\2\uffff\1\66";
    static final String dfa_5s = "\4\uffff\1\1\1\2\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\5\3\uffff\1\5\2\uffff\1\5\17\uffff\1\4\12\uffff\3\5\5\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\5\3\uffff\1\5\2\uffff\1\5\17\uffff\1\4\12\uffff\3\5\5\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1752:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x002A000100007002L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x002A000100006002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x002A000100004002L});
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
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400080000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0001C00000080000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0001000000080000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x00003FF000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000000000030010L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0004000000001002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000000000040L});

}