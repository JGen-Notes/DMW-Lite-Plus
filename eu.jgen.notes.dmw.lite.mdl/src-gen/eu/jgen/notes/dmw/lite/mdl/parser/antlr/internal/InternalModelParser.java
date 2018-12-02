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
    // InternalModel.g:71:1: ruleYModel returns [EObject current=null] : ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* ) ;
    public final EObject ruleYModel() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_annotations_4_0 = null;



        	enterRule();

        try {
            // InternalModel.g:77:2: ( ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* ) )
            // InternalModel.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* )
            {
            // InternalModel.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )* )
            // InternalModel.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_annotations_4_0= ruleYAnnotation ) )*
            {
            // InternalModel.g:79:3: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==11) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // InternalModel.g:80:4: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )?
                    {
                    otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_0, grammarAccess.getYModelAccess().getPackageKeyword_0_0());
                      			
                    }
                    // InternalModel.g:84:4: ( (lv_name_1_0= ruleQualifiedName ) )
                    // InternalModel.g:85:5: (lv_name_1_0= ruleQualifiedName )
                    {
                    // InternalModel.g:85:5: (lv_name_1_0= ruleQualifiedName )
                    // InternalModel.g:86:6: lv_name_1_0= ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYModelAccess().getNameQualifiedNameParserRuleCall_0_1_0());
                      					
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

                    // InternalModel.g:103:4: (otherlv_2= ';' )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==12) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // InternalModel.g:104:5: otherlv_2= ';'
                            {
                            otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_2, grammarAccess.getYModelAccess().getSemicolonKeyword_0_2());
                              				
                            }

                            }
                            break;

                    }


                    }
                    break;

            }

            // InternalModel.g:110:3: ( (lv_imports_3_0= ruleYImport ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalModel.g:111:4: (lv_imports_3_0= ruleYImport )
            	    {
            	    // InternalModel.g:111:4: (lv_imports_3_0= ruleYImport )
            	    // InternalModel.g:112:5: lv_imports_3_0= ruleYImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYModelAccess().getImportsYImportParserRuleCall_1_0());
            	      				
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
            	    break loop3;
                }
            } while (true);

            // InternalModel.g:129:3: ( (lv_annotations_4_0= ruleYAnnotation ) )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==14||LA4_0==32||LA4_0==49||LA4_0==51||LA4_0==53) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalModel.g:130:4: (lv_annotations_4_0= ruleYAnnotation )
            	    {
            	    // InternalModel.g:130:4: (lv_annotations_4_0= ruleYAnnotation )
            	    // InternalModel.g:131:5: lv_annotations_4_0= ruleYAnnotation
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYModelAccess().getAnnotationsYAnnotationParserRuleCall_2_0());
            	      				
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
            	    break loop4;
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
    // InternalModel.g:152:1: entryRuleYImport returns [EObject current=null] : iv_ruleYImport= ruleYImport EOF ;
    public final EObject entryRuleYImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYImport = null;


        try {
            // InternalModel.g:152:48: (iv_ruleYImport= ruleYImport EOF )
            // InternalModel.g:153:2: iv_ruleYImport= ruleYImport EOF
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
    // InternalModel.g:159:1: ruleYImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleYImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalModel.g:165:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalModel.g:166:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalModel.g:166:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalModel.g:167:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYImportAccess().getImportKeyword_0());
              		
            }
            // InternalModel.g:171:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalModel.g:172:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalModel.g:172:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalModel.g:173:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
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
    // InternalModel.g:198:1: entryRuleYAnnotation returns [EObject current=null] : iv_ruleYAnnotation= ruleYAnnotation EOF ;
    public final EObject entryRuleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotation = null;


        try {
            // InternalModel.g:198:52: (iv_ruleYAnnotation= ruleYAnnotation EOF )
            // InternalModel.g:199:2: iv_ruleYAnnotation= ruleYAnnotation EOF
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
    // InternalModel.g:205:1: ruleYAnnotation returns [EObject current=null] : (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) ;
    public final EObject ruleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotEntity_0 = null;

        EObject this_YAnnotTechnicalDesign_1 = null;

        EObject this_YAnnotDatabase_2 = null;

        EObject this_YAnnotJava_3 = null;

        EObject this_YAnnotSwift_4 = null;



        	enterRule();

        try {
            // InternalModel.g:211:2: ( (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) )
            // InternalModel.g:212:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            {
            // InternalModel.g:212:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            int alt5=5;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt5=1;
                }
                break;
            case 32:
                {
                alt5=2;
                }
                break;
            case 53:
                {
                alt5=3;
                }
                break;
            case 49:
                {
                alt5=4;
                }
                break;
            case 51:
                {
                alt5=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalModel.g:213:3: this_YAnnotEntity_0= ruleYAnnotEntity
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
                    // InternalModel.g:222:3: this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign
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
                    // InternalModel.g:231:3: this_YAnnotDatabase_2= ruleYAnnotDatabase
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
                    // InternalModel.g:240:3: this_YAnnotJava_3= ruleYAnnotJava
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
                    // InternalModel.g:249:3: this_YAnnotSwift_4= ruleYAnnotSwift
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
    // InternalModel.g:261:1: entryRuleYAnnotEntity returns [EObject current=null] : iv_ruleYAnnotEntity= ruleYAnnotEntity EOF ;
    public final EObject entryRuleYAnnotEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntity = null;


        try {
            // InternalModel.g:261:53: (iv_ruleYAnnotEntity= ruleYAnnotEntity EOF )
            // InternalModel.g:262:2: iv_ruleYAnnotEntity= ruleYAnnotEntity EOF
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
    // InternalModel.g:268:1: ruleYAnnotEntity returns [EObject current=null] : ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) ;
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
            // InternalModel.g:274:2: ( ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) )
            // InternalModel.g:275:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            {
            // InternalModel.g:275:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            // InternalModel.g:276:3: () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}'
            {
            // InternalModel.g:276:3: ()
            // InternalModel.g:277:4: 
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
            // InternalModel.g:287:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:288:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:288:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:289:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:306:3: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==15) && (synpred1_InternalModel())) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalModel.g:307:4: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')'
                    {
                    // InternalModel.g:307:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalModel.g:308:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0());
                      				
                    }

                    }

                    // InternalModel.g:314:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==RULE_ID) && (synpred2_InternalModel())) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // InternalModel.g:315:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:315:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:316:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:325:6: (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:326:7: lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:343:5: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            loop6:
                            do {
                                int alt6=2;
                                int LA6_0 = input.LA(1);

                                if ( (LA6_0==16) ) {
                                    alt6=1;
                                }


                                switch (alt6) {
                            	case 1 :
                            	    // InternalModel.g:344:6: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:348:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:349:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:358:7: (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:359:8: lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair
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
                            	    break loop6;
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
            // InternalModel.g:387:3: ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==20||LA9_0==22||LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModel.g:388:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    {
            	    // InternalModel.g:388:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    // InternalModel.g:389:5: lv_annotations_9_0= ruleYAnnotEntityInner
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
            	    break loop9;
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
    // InternalModel.g:414:1: entryRuleYAnnotAttribute returns [EObject current=null] : iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF ;
    public final EObject entryRuleYAnnotAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAttribute = null;


        try {
            // InternalModel.g:414:56: (iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF )
            // InternalModel.g:415:2: iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF
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
    // InternalModel.g:421:1: ruleYAnnotAttribute returns [EObject current=null] : ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) ;
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
            // InternalModel.g:427:2: ( ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) )
            // InternalModel.g:428:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            {
            // InternalModel.g:428:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            // InternalModel.g:429:3: () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )?
            {
            // InternalModel.g:429:3: ()
            // InternalModel.g:430:4: 
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
            // InternalModel.g:440:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:441:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:441:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:442:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:459:3: ( (lv_optional_3_0= '?' ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==21) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModel.g:460:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:460:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:461:5: lv_optional_3_0= '?'
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

            // InternalModel.g:473:3: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==15) && (synpred4_InternalModel())) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalModel.g:474:4: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')'
                    {
                    // InternalModel.g:474:4: ( ( '(' )=>otherlv_4= '(' )
                    // InternalModel.g:475:5: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0());
                      				
                    }

                    }

                    // InternalModel.g:481:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==RULE_ID) && (synpred5_InternalModel())) {
                        alt12=1;
                    }
                    switch (alt12) {
                        case 1 :
                            // InternalModel.g:482:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:482:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:483:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:492:6: (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:493:7: lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:510:5: (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            loop11:
                            do {
                                int alt11=2;
                                int LA11_0 = input.LA(1);

                                if ( (LA11_0==16) ) {
                                    alt11=1;
                                }


                                switch (alt11) {
                            	case 1 :
                            	    // InternalModel.g:511:6: otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_6=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:515:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:516:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:525:7: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:526:8: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
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
                            	    break loop11;
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

            // InternalModel.g:550:3: (otherlv_9= ';' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==12) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModel.g:551:4: otherlv_9= ';'
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
    // InternalModel.g:560:1: entryRuleYAnnotRelationship returns [EObject current=null] : iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF ;
    public final EObject entryRuleYAnnotRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotRelationship = null;


        try {
            // InternalModel.g:560:59: (iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF )
            // InternalModel.g:561:2: iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF
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
    // InternalModel.g:567:1: ruleYAnnotRelationship returns [EObject current=null] : ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) ;
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
            // InternalModel.g:573:2: ( ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) )
            // InternalModel.g:574:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            {
            // InternalModel.g:574:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            // InternalModel.g:575:3: () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )?
            {
            // InternalModel.g:575:3: ()
            // InternalModel.g:576:4: 
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
            // InternalModel.g:586:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:587:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:587:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:588:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:605:3: ( (lv_optional_3_0= '?' ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==21) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModel.g:606:4: (lv_optional_3_0= '?' )
                    {
                    // InternalModel.g:606:4: (lv_optional_3_0= '?' )
                    // InternalModel.g:607:5: lv_optional_3_0= '?'
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
            // InternalModel.g:623:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:624:4: ( ruleQualifiedName )
            {
            // InternalModel.g:624:4: ( ruleQualifiedName )
            // InternalModel.g:625:5: ruleQualifiedName
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

            // InternalModel.g:639:3: ( (lv_many_6_0= '*' ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModel.g:640:4: (lv_many_6_0= '*' )
                    {
                    // InternalModel.g:640:4: (lv_many_6_0= '*' )
                    // InternalModel.g:641:5: lv_many_6_0= '*'
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

            // InternalModel.g:653:3: ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==15) && (synpred7_InternalModel())) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModel.g:654:4: ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')'
                    {
                    // InternalModel.g:654:4: ( ( '(' )=>otherlv_7= '(' )
                    // InternalModel.g:655:5: ( '(' )=>otherlv_7= '('
                    {
                    otherlv_7=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0());
                      				
                    }

                    }

                    // InternalModel.g:661:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==RULE_ID) && (synpred8_InternalModel())) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // InternalModel.g:662:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:662:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:663:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:672:6: (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:673:7: lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:690:5: (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            loop17:
                            do {
                                int alt17=2;
                                int LA17_0 = input.LA(1);

                                if ( (LA17_0==16) ) {
                                    alt17=1;
                                }


                                switch (alt17) {
                            	case 1 :
                            	    // InternalModel.g:691:6: otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_9=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_9, grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:695:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:696:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:705:7: (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:706:8: lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair
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
                            	    break loop17;
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

            // InternalModel.g:730:3: (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==25) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModel.g:731:4: otherlv_12= '<-' ( ( ruleQualifiedName ) )
                    {
                    otherlv_12=(Token)match(input,25,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0());
                      			
                    }
                    // InternalModel.g:735:4: ( ( ruleQualifiedName ) )
                    // InternalModel.g:736:5: ( ruleQualifiedName )
                    {
                    // InternalModel.g:736:5: ( ruleQualifiedName )
                    // InternalModel.g:737:6: ruleQualifiedName
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

            // InternalModel.g:752:3: (otherlv_14= ';' )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModel.g:753:4: otherlv_14= ';'
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
    // InternalModel.g:762:1: entryRuleYAnnotIdentifier returns [EObject current=null] : iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF ;
    public final EObject entryRuleYAnnotIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotIdentifier = null;


        try {
            // InternalModel.g:762:57: (iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF )
            // InternalModel.g:763:2: iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF
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
    // InternalModel.g:769:1: ruleYAnnotIdentifier returns [EObject current=null] : ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) ;
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
            // InternalModel.g:775:2: ( ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) )
            // InternalModel.g:776:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            {
            // InternalModel.g:776:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            // InternalModel.g:777:3: () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )?
            {
            // InternalModel.g:777:3: ()
            // InternalModel.g:778:4: 
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
            // InternalModel.g:788:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:789:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:789:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:790:5: lv_name_2_0= ruleValidID
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
            // InternalModel.g:811:3: ( (otherlv_4= RULE_ID ) )
            // InternalModel.g:812:4: (otherlv_4= RULE_ID )
            {
            // InternalModel.g:812:4: (otherlv_4= RULE_ID )
            // InternalModel.g:813:5: otherlv_4= RULE_ID
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

            // InternalModel.g:824:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==16) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalModel.g:825:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:829:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalModel.g:830:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalModel.g:830:5: (otherlv_6= RULE_ID )
            	    // InternalModel.g:831:6: otherlv_6= RULE_ID
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
            	    break loop22;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotIdentifierAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalModel.g:847:3: (otherlv_8= ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==12) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModel.g:848:4: otherlv_8= ';'
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
    // InternalModel.g:857:1: entryRuleYAnnotationElementValuePair returns [EObject current=null] : iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF ;
    public final EObject entryRuleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotationElementValuePair = null;


        try {
            // InternalModel.g:857:68: (iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF )
            // InternalModel.g:858:2: iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF
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
    // InternalModel.g:864:1: ruleYAnnotationElementValuePair returns [EObject current=null] : ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) ;
    public final EObject ruleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:870:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) )
            // InternalModel.g:871:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            {
            // InternalModel.g:871:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            // InternalModel.g:872:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) )
            {
            // InternalModel.g:872:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) )
            // InternalModel.g:873:4: ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            {
            // InternalModel.g:882:4: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            // InternalModel.g:883:5: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '='
            {
            // InternalModel.g:883:5: ( (lv_name_0_0= ruleValidID ) )
            // InternalModel.g:884:6: (lv_name_0_0= ruleValidID )
            {
            // InternalModel.g:884:6: (lv_name_0_0= ruleValidID )
            // InternalModel.g:885:7: lv_name_0_0= ruleValidID
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

            // InternalModel.g:908:3: ( (lv_value_2_0= ruleYAnnotExpression ) )
            // InternalModel.g:909:4: (lv_value_2_0= ruleYAnnotExpression )
            {
            // InternalModel.g:909:4: (lv_value_2_0= ruleYAnnotExpression )
            // InternalModel.g:910:5: lv_value_2_0= ruleYAnnotExpression
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
    // InternalModel.g:931:1: entryRuleYAnnotEntityInner returns [EObject current=null] : iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF ;
    public final EObject entryRuleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntityInner = null;


        try {
            // InternalModel.g:931:58: (iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF )
            // InternalModel.g:932:2: iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF
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
    // InternalModel.g:938:1: ruleYAnnotEntityInner returns [EObject current=null] : (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) ;
    public final EObject ruleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotAttribute_0 = null;

        EObject this_YAnnotRelationship_1 = null;

        EObject this_YAnnotIdentifier_2 = null;



        	enterRule();

        try {
            // InternalModel.g:944:2: ( (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) )
            // InternalModel.g:945:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            {
            // InternalModel.g:945:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            int alt24=3;
            switch ( input.LA(1) ) {
            case 20:
                {
                alt24=1;
                }
                break;
            case 22:
                {
                alt24=2;
                }
                break;
            case 26:
                {
                alt24=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }

            switch (alt24) {
                case 1 :
                    // InternalModel.g:946:3: this_YAnnotAttribute_0= ruleYAnnotAttribute
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
                    // InternalModel.g:955:3: this_YAnnotRelationship_1= ruleYAnnotRelationship
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
                    // InternalModel.g:964:3: this_YAnnotIdentifier_2= ruleYAnnotIdentifier
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
    // InternalModel.g:976:1: entryRuleYAnnotExpression returns [EObject current=null] : iv_ruleYAnnotExpression= ruleYAnnotExpression EOF ;
    public final EObject entryRuleYAnnotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotExpression = null;


        try {
            // InternalModel.g:976:57: (iv_ruleYAnnotExpression= ruleYAnnotExpression EOF )
            // InternalModel.g:977:2: iv_ruleYAnnotExpression= ruleYAnnotExpression EOF
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
    // InternalModel.g:983:1: ruleYAnnotExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) ;
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
            // InternalModel.g:989:2: ( ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) )
            // InternalModel.g:990:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            {
            // InternalModel.g:990:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            int alt28=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt28=1;
                }
                break;
            case RULE_STRING:
                {
                alt28=2;
                }
                break;
            case RULE_INT:
                {
                alt28=3;
                }
                break;
            case 28:
            case 29:
                {
                alt28=4;
                }
                break;
            case 30:
                {
                alt28=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;
            }

            switch (alt28) {
                case 1 :
                    // InternalModel.g:991:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    {
                    // InternalModel.g:991:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    // InternalModel.g:992:4: () ( (lv_value_1_0= ruleValidID ) )
                    {
                    // InternalModel.g:992:4: ()
                    // InternalModel.g:993:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:999:4: ( (lv_value_1_0= ruleValidID ) )
                    // InternalModel.g:1000:5: (lv_value_1_0= ruleValidID )
                    {
                    // InternalModel.g:1000:5: (lv_value_1_0= ruleValidID )
                    // InternalModel.g:1001:6: lv_value_1_0= ruleValidID
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
                    // InternalModel.g:1020:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalModel.g:1020:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalModel.g:1021:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalModel.g:1021:4: ()
                    // InternalModel.g:1022:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1028:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalModel.g:1029:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalModel.g:1029:5: (lv_value_3_0= RULE_STRING )
                    // InternalModel.g:1030:6: lv_value_3_0= RULE_STRING
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
                    // InternalModel.g:1048:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    {
                    // InternalModel.g:1048:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    // InternalModel.g:1049:4: () ( (lv_value_5_0= ruleNumber ) )
                    {
                    // InternalModel.g:1049:4: ()
                    // InternalModel.g:1050:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1056:4: ( (lv_value_5_0= ruleNumber ) )
                    // InternalModel.g:1057:5: (lv_value_5_0= ruleNumber )
                    {
                    // InternalModel.g:1057:5: (lv_value_5_0= ruleNumber )
                    // InternalModel.g:1058:6: lv_value_5_0= ruleNumber
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
                    // InternalModel.g:1077:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalModel.g:1077:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalModel.g:1078:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalModel.g:1078:4: ()
                    // InternalModel.g:1079:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1085:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalModel.g:1086:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalModel.g:1086:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalModel.g:1087:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalModel.g:1087:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==28) ) {
                        alt25=1;
                    }
                    else if ( (LA25_0==29) ) {
                        alt25=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 25, 0, input);

                        throw nvae;
                    }
                    switch (alt25) {
                        case 1 :
                            // InternalModel.g:1088:7: lv_value_7_1= 'true'
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
                            // InternalModel.g:1099:7: lv_value_7_2= 'false'
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
                    // InternalModel.g:1114:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    {
                    // InternalModel.g:1114:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    // InternalModel.g:1115:4: () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']'
                    {
                    // InternalModel.g:1115:4: ()
                    // InternalModel.g:1116:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalModel.g:1122:4: ( ( '[' )=>otherlv_9= '[' )
                    // InternalModel.g:1123:5: ( '[' )=>otherlv_9= '['
                    {
                    otherlv_9=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0());
                      				
                    }

                    }

                    // InternalModel.g:1130:4: ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( ((LA27_0>=RULE_ID && LA27_0<=RULE_INT)||(LA27_0>=28 && LA27_0<=30)) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // InternalModel.g:1131:5: ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            {
                            // InternalModel.g:1131:5: ( (lv_elements_10_0= ruleYAnnotExpression ) )
                            // InternalModel.g:1132:6: (lv_elements_10_0= ruleYAnnotExpression )
                            {
                            // InternalModel.g:1132:6: (lv_elements_10_0= ruleYAnnotExpression )
                            // InternalModel.g:1133:7: lv_elements_10_0= ruleYAnnotExpression
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

                            // InternalModel.g:1150:5: (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            loop26:
                            do {
                                int alt26=2;
                                int LA26_0 = input.LA(1);

                                if ( (LA26_0==16) ) {
                                    alt26=1;
                                }


                                switch (alt26) {
                            	case 1 :
                            	    // InternalModel.g:1151:6: otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,16,FOLLOW_23); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_11, grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1155:6: ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    // InternalModel.g:1156:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    {
                            	    // InternalModel.g:1156:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    // InternalModel.g:1157:8: lv_elements_12_0= ruleYAnnotExpression
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
                            	    break loop26;
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
    // InternalModel.g:1185:1: entryRuleYAnnotTechnicalDesign returns [EObject current=null] : iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF ;
    public final EObject entryRuleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTechnicalDesign = null;


        try {
            // InternalModel.g:1185:62: (iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF )
            // InternalModel.g:1186:2: iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF
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
    // InternalModel.g:1192:1: ruleYAnnotTechnicalDesign returns [EObject current=null] : ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) ;
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
            // InternalModel.g:1198:2: ( ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) )
            // InternalModel.g:1199:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            {
            // InternalModel.g:1199:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            // InternalModel.g:1200:3: () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}'
            {
            // InternalModel.g:1200:3: ()
            // InternalModel.g:1201:4: 
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
            // InternalModel.g:1215:3: ( (otherlv_3= RULE_ID ) )
            // InternalModel.g:1216:4: (otherlv_3= RULE_ID )
            {
            // InternalModel.g:1216:4: (otherlv_3= RULE_ID )
            // InternalModel.g:1217:5: otherlv_3= RULE_ID
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
            // InternalModel.g:1232:3: ( (lv_features_5_0= ruleYAnnotTable ) )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==34) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModel.g:1233:4: (lv_features_5_0= ruleYAnnotTable )
            	    {
            	    // InternalModel.g:1233:4: (lv_features_5_0= ruleYAnnotTable )
            	    // InternalModel.g:1234:5: lv_features_5_0= ruleYAnnotTable
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
            	    break loop29;
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
    // InternalModel.g:1259:1: entryRuleYAnnotTable returns [EObject current=null] : iv_ruleYAnnotTable= ruleYAnnotTable EOF ;
    public final EObject entryRuleYAnnotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTable = null;


        try {
            // InternalModel.g:1259:52: (iv_ruleYAnnotTable= ruleYAnnotTable EOF )
            // InternalModel.g:1260:2: iv_ruleYAnnotTable= ruleYAnnotTable EOF
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
    // InternalModel.g:1266:1: ruleYAnnotTable returns [EObject current=null] : ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) ;
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
            // InternalModel.g:1272:2: ( ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) )
            // InternalModel.g:1273:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            {
            // InternalModel.g:1273:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            // InternalModel.g:1274:3: () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}'
            {
            // InternalModel.g:1274:3: ()
            // InternalModel.g:1275:4: 
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
            // InternalModel.g:1285:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1286:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1286:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1287:5: lv_name_2_0= ruleValidID
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
            // InternalModel.g:1308:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1309:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1309:4: ( ruleQualifiedName )
            // InternalModel.g:1310:5: ruleQualifiedName
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
            // InternalModel.g:1328:3: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==46) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalModel.g:1329:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1329:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1330:5: lv_columns_6_0= ruleYAnnotAbstractColumn
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
            	    break loop30;
                }
            } while (true);

            // InternalModel.g:1347:3: ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==47) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModel.g:1348:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    {
                    // InternalModel.g:1348:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    // InternalModel.g:1349:5: lv_primarykey_7_0= ruleYAnnotPrimaryKey
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

            // InternalModel.g:1366:3: ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==48) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalModel.g:1367:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    {
            	    // InternalModel.g:1367:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    // InternalModel.g:1368:5: lv_foreignkeys_8_0= ruleYAnnotForeignKey
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
            	    break loop32;
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
    // InternalModel.g:1393:1: entryRuleYAnnotColumn returns [EObject current=null] : iv_ruleYAnnotColumn= ruleYAnnotColumn EOF ;
    public final EObject entryRuleYAnnotColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumn = null;


        try {
            // InternalModel.g:1393:53: (iv_ruleYAnnotColumn= ruleYAnnotColumn EOF )
            // InternalModel.g:1394:2: iv_ruleYAnnotColumn= ruleYAnnotColumn EOF
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
    // InternalModel.g:1400:1: ruleYAnnotColumn returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) ;
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
            // InternalModel.g:1406:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            // InternalModel.g:1407:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            {
            // InternalModel.g:1407:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            // InternalModel.g:1408:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )?
            {
            // InternalModel.g:1408:3: ()
            // InternalModel.g:1409:4: 
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
            // InternalModel.g:1419:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1420:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1420:4: ( ruleQualifiedName )
            // InternalModel.g:1421:5: ruleQualifiedName
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
            // InternalModel.g:1439:3: ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) )
            // InternalModel.g:1440:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            {
            // InternalModel.g:1440:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            // InternalModel.g:1441:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            {
            // InternalModel.g:1441:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            int alt33=10;
            switch ( input.LA(1) ) {
            case 36:
                {
                alt33=1;
                }
                break;
            case 37:
                {
                alt33=2;
                }
                break;
            case 38:
                {
                alt33=3;
                }
                break;
            case 39:
                {
                alt33=4;
                }
                break;
            case 40:
                {
                alt33=5;
                }
                break;
            case 41:
                {
                alt33=6;
                }
                break;
            case 42:
                {
                alt33=7;
                }
                break;
            case 43:
                {
                alt33=8;
                }
                break;
            case 44:
                {
                alt33=9;
                }
                break;
            case 45:
                {
                alt33=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;
            }

            switch (alt33) {
                case 1 :
                    // InternalModel.g:1442:6: lv_type_4_1= 'VARCHAR'
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
                    // InternalModel.g:1453:6: lv_type_4_2= 'CHAR'
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
                    // InternalModel.g:1464:6: lv_type_4_3= 'INTEGER'
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
                    // InternalModel.g:1475:6: lv_type_4_4= 'BIGINT'
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
                    // InternalModel.g:1486:6: lv_type_4_5= 'SMALLINT'
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
                    // InternalModel.g:1497:6: lv_type_4_6= 'DECIMAL'
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
                    // InternalModel.g:1508:6: lv_type_4_7= 'TIME'
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
                    // InternalModel.g:1519:6: lv_type_4_8= 'DATE'
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
                    // InternalModel.g:1530:6: lv_type_4_9= 'TIMESTAMP'
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
                    // InternalModel.g:1541:6: lv_type_4_10= 'BOOLEAN'
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

            // InternalModel.g:1554:3: ( (lv_optional_5_0= '?' ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==21) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModel.g:1555:4: (lv_optional_5_0= '?' )
                    {
                    // InternalModel.g:1555:4: (lv_optional_5_0= '?' )
                    // InternalModel.g:1556:5: lv_optional_5_0= '?'
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

            // InternalModel.g:1568:3: ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==15) && (synpred12_InternalModel())) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModel.g:1569:4: ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')'
                    {
                    // InternalModel.g:1569:4: ( ( '(' )=>otherlv_6= '(' )
                    // InternalModel.g:1570:5: ( '(' )=>otherlv_6= '('
                    {
                    otherlv_6=(Token)match(input,15,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0());
                      				
                    }

                    }

                    // InternalModel.g:1576:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==RULE_ID) && (synpred13_InternalModel())) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // InternalModel.g:1577:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalModel.g:1577:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            // InternalModel.g:1578:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalModel.g:1587:6: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            // InternalModel.g:1588:7: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
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

                            // InternalModel.g:1605:5: (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            loop35:
                            do {
                                int alt35=2;
                                int LA35_0 = input.LA(1);

                                if ( (LA35_0==16) ) {
                                    alt35=1;
                                }


                                switch (alt35) {
                            	case 1 :
                            	    // InternalModel.g:1606:6: otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_8=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_8, grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0());
                            	      					
                            	    }
                            	    // InternalModel.g:1610:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalModel.g:1611:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalModel.g:1620:7: (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    // InternalModel.g:1621:8: lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair
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
                            	    break loop35;
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

            // InternalModel.g:1645:3: (otherlv_11= ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==12) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModel.g:1646:4: otherlv_11= ';'
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
    // InternalModel.g:1655:1: entryRuleYAnnotColumnLike returns [EObject current=null] : iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF ;
    public final EObject entryRuleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumnLike = null;


        try {
            // InternalModel.g:1655:57: (iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF )
            // InternalModel.g:1656:2: iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF
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
    // InternalModel.g:1662:1: ruleYAnnotColumnLike returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalModel.g:1668:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) )
            // InternalModel.g:1669:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            {
            // InternalModel.g:1669:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            // InternalModel.g:1670:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )?
            {
            // InternalModel.g:1670:3: ()
            // InternalModel.g:1671:4: 
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
            // InternalModel.g:1681:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1682:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1682:4: ( ruleQualifiedName )
            // InternalModel.g:1683:5: ruleQualifiedName
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

            // InternalModel.g:1697:3: (otherlv_3= ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==12) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModel.g:1698:4: otherlv_3= ';'
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
    // InternalModel.g:1707:1: entryRuleYAnnotAbstractColumn returns [EObject current=null] : iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF ;
    public final EObject entryRuleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAbstractColumn = null;


        try {
            // InternalModel.g:1707:61: (iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF )
            // InternalModel.g:1708:2: iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF
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
    // InternalModel.g:1714:1: ruleYAnnotAbstractColumn returns [EObject current=null] : ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) ;
    public final EObject ruleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_3_1 = null;

        EObject lv_type_3_2 = null;



        	enterRule();

        try {
            // InternalModel.g:1720:2: ( ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) )
            // InternalModel.g:1721:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            {
            // InternalModel.g:1721:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            // InternalModel.g:1722:3: () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            {
            // InternalModel.g:1722:3: ()
            // InternalModel.g:1723:4: 
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
            // InternalModel.g:1733:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:1734:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:1734:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:1735:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:1752:3: ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            // InternalModel.g:1753:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            {
            // InternalModel.g:1753:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            // InternalModel.g:1754:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            {
            // InternalModel.g:1754:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            int alt40=2;
            alt40 = dfa40.predict(input);
            switch (alt40) {
                case 1 :
                    // InternalModel.g:1755:6: lv_type_3_1= ruleYAnnotColumn
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
                    // InternalModel.g:1771:6: lv_type_3_2= ruleYAnnotColumnLike
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
    // InternalModel.g:1793:1: entryRuleYAnnotPrimaryKey returns [EObject current=null] : iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF ;
    public final EObject entryRuleYAnnotPrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotPrimaryKey = null;


        try {
            // InternalModel.g:1793:57: (iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF )
            // InternalModel.g:1794:2: iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF
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
    // InternalModel.g:1800:1: ruleYAnnotPrimaryKey returns [EObject current=null] : ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) ;
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
            // InternalModel.g:1806:2: ( ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) )
            // InternalModel.g:1807:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            {
            // InternalModel.g:1807:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            // InternalModel.g:1808:3: () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )?
            {
            // InternalModel.g:1808:3: ()
            // InternalModel.g:1809:4: 
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
            // InternalModel.g:1823:3: ( (otherlv_3= RULE_ID ) )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==RULE_ID) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalModel.g:1824:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalModel.g:1824:4: (otherlv_3= RULE_ID )
            	    // InternalModel.g:1825:5: otherlv_3= RULE_ID
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
            	    break loop41;
                }
            } while (true);

            // InternalModel.g:1836:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==16) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModel.g:1837:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,16,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalModel.g:1841:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalModel.g:1842:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalModel.g:1842:5: (otherlv_5= RULE_ID )
            	    // InternalModel.g:1843:6: otherlv_5= RULE_ID
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
            	    break loop42;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalModel.g:1859:3: (otherlv_7= ';' )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==12) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // InternalModel.g:1860:4: otherlv_7= ';'
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
    // InternalModel.g:1869:1: entryRuleYAnnotForeignKey returns [EObject current=null] : iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF ;
    public final EObject entryRuleYAnnotForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotForeignKey = null;


        try {
            // InternalModel.g:1869:57: (iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF )
            // InternalModel.g:1870:2: iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF
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
    // InternalModel.g:1876:1: ruleYAnnotForeignKey returns [EObject current=null] : ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ;
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
            // InternalModel.g:1882:2: ( ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            // InternalModel.g:1883:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            {
            // InternalModel.g:1883:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            // InternalModel.g:1884:3: () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
            {
            // InternalModel.g:1884:3: ()
            // InternalModel.g:1885:4: 
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
            // InternalModel.g:1895:3: ( ( ruleQualifiedName ) )
            // InternalModel.g:1896:4: ( ruleQualifiedName )
            {
            // InternalModel.g:1896:4: ( ruleQualifiedName )
            // InternalModel.g:1897:5: ruleQualifiedName
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
            // InternalModel.g:1915:3: ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) )
            // InternalModel.g:1916:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:1916:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            // InternalModel.g:1917:5: lv_columns_4_0= ruleYAnnotAbstractColumn
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

            // InternalModel.g:1934:3: (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )*
            loop44:
            do {
                int alt44=2;
                int LA44_0 = input.LA(1);

                if ( (LA44_0==16) ) {
                    alt44=1;
                }


                switch (alt44) {
            	case 1 :
            	    // InternalModel.g:1935:4: otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,16,FOLLOW_33); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalModel.g:1939:4: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    // InternalModel.g:1940:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalModel.g:1940:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalModel.g:1941:6: lv_columns_6_0= ruleYAnnotAbstractColumn
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
            	    break loop44;
                }
            } while (true);

            otherlv_7=(Token)match(input,19,FOLLOW_15); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6());
              		
            }
            // InternalModel.g:1963:3: (otherlv_8= ';' )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==12) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalModel.g:1964:4: otherlv_8= ';'
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
    // InternalModel.g:1973:1: entryRuleYAnnotJava returns [EObject current=null] : iv_ruleYAnnotJava= ruleYAnnotJava EOF ;
    public final EObject entryRuleYAnnotJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotJava = null;


        try {
            // InternalModel.g:1973:51: (iv_ruleYAnnotJava= ruleYAnnotJava EOF )
            // InternalModel.g:1974:2: iv_ruleYAnnotJava= ruleYAnnotJava EOF
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
    // InternalModel.g:1980:1: ruleYAnnotJava returns [EObject current=null] : ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleYAnnotJava() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalModel.g:1986:2: ( ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) )
            // InternalModel.g:1987:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            {
            // InternalModel.g:1987:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            // InternalModel.g:1988:3: () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )?
            {
            // InternalModel.g:1988:3: ()
            // InternalModel.g:1989:4: 
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
            // InternalModel.g:1999:3: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==50) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModel.g:2000:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYAnnotJavaAccess().getUsesKeyword_2_0());
                      			
                    }
                    // InternalModel.g:2004:4: ( (otherlv_3= RULE_ID ) )
                    // InternalModel.g:2005:5: (otherlv_3= RULE_ID )
                    {
                    // InternalModel.g:2005:5: (otherlv_3= RULE_ID )
                    // InternalModel.g:2006:6: otherlv_3= RULE_ID
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

            // InternalModel.g:2018:3: (otherlv_4= ';' )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==12) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalModel.g:2019:4: otherlv_4= ';'
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
    // InternalModel.g:2028:1: entryRuleYAnnotSwift returns [EObject current=null] : iv_ruleYAnnotSwift= ruleYAnnotSwift EOF ;
    public final EObject entryRuleYAnnotSwift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotSwift = null;


        try {
            // InternalModel.g:2028:52: (iv_ruleYAnnotSwift= ruleYAnnotSwift EOF )
            // InternalModel.g:2029:2: iv_ruleYAnnotSwift= ruleYAnnotSwift EOF
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
    // InternalModel.g:2035:1: ruleYAnnotSwift returns [EObject current=null] : ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) ;
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
            // InternalModel.g:2041:2: ( ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) )
            // InternalModel.g:2042:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            {
            // InternalModel.g:2042:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            // InternalModel.g:2043:3: () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )?
            {
            // InternalModel.g:2043:3: ()
            // InternalModel.g:2044:4: 
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
            // InternalModel.g:2058:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalModel.g:2059:4: (lv_name_3_0= ruleValidID )
            {
            // InternalModel.g:2059:4: (lv_name_3_0= ruleValidID )
            // InternalModel.g:2060:5: lv_name_3_0= ruleValidID
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

            // InternalModel.g:2077:3: (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==50) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModel.g:2078:4: otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,50,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getYAnnotSwiftAccess().getUsesKeyword_4_0());
                      			
                    }
                    // InternalModel.g:2082:4: ( (otherlv_5= RULE_ID ) )
                    // InternalModel.g:2083:5: (otherlv_5= RULE_ID )
                    {
                    // InternalModel.g:2083:5: (otherlv_5= RULE_ID )
                    // InternalModel.g:2084:6: otherlv_5= RULE_ID
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

            // InternalModel.g:2096:3: (otherlv_6= ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==12) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalModel.g:2097:4: otherlv_6= ';'
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
    // InternalModel.g:2106:1: entryRuleYAnnotDatabase returns [EObject current=null] : iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF ;
    public final EObject entryRuleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotDatabase = null;


        try {
            // InternalModel.g:2106:55: (iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF )
            // InternalModel.g:2107:2: iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF
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
    // InternalModel.g:2113:1: ruleYAnnotDatabase returns [EObject current=null] : ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2119:2: ( ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) )
            // InternalModel.g:2120:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            {
            // InternalModel.g:2120:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            // InternalModel.g:2121:3: () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )?
            {
            // InternalModel.g:2121:3: ()
            // InternalModel.g:2122:4: 
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
            // InternalModel.g:2132:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalModel.g:2133:4: (lv_name_2_0= ruleValidID )
            {
            // InternalModel.g:2133:4: (lv_name_2_0= ruleValidID )
            // InternalModel.g:2134:5: lv_name_2_0= ruleValidID
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

            // InternalModel.g:2151:3: (otherlv_3= ';' )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==12) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // InternalModel.g:2152:4: otherlv_3= ';'
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
    // InternalModel.g:2161:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalModel.g:2161:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalModel.g:2162:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalModel.g:2168:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalModel.g:2174:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalModel.g:2175:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalModel.g:2175:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalModel.g:2176:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
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
            // InternalModel.g:2186:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==54) && (synpred15_InternalModel())) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalModel.g:2187:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalModel.g:2187:4: ( ( '.' )=>kw= '.' )
            	    // InternalModel.g:2188:5: ( '.' )=>kw= '.'
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
            	    break loop51;
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
    // InternalModel.g:2210:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalModel.g:2210:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalModel.g:2211:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalModel.g:2217:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalModel.g:2223:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalModel.g:2224:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalModel.g:2224:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalModel.g:2225:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
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
            // InternalModel.g:2235:3: (kw= '.*' )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==55) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalModel.g:2236:4: kw= '.*'
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
    // InternalModel.g:2246:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalModel.g:2246:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalModel.g:2247:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalModel.g:2253:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalModel.g:2259:2: (this_ID_0= RULE_ID )
            // InternalModel.g:2260:2: this_ID_0= RULE_ID
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
    // InternalModel.g:2270:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2272:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalModel.g:2273:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalModel.g:2282:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:2289:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalModel.g:2290:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalModel.g:2290:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalModel.g:2291:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_37); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalModel.g:2298:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==54) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalModel.g:2299:4: kw= '.' this_INT_2= RULE_INT
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
        // InternalModel.g:308:5: ( '(' )
        // InternalModel.g:308:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalModel

    // $ANTLR start synpred2_InternalModel
    public final void synpred2_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:316:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:316:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:316:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:317:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:317:7: ( ( ruleValidID ) )
        // InternalModel.g:318:8: ( ruleValidID )
        {
        // InternalModel.g:318:8: ( ruleValidID )
        // InternalModel.g:319:9: ruleValidID
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
        // InternalModel.g:475:5: ( '(' )
        // InternalModel.g:475:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred4_InternalModel

    // $ANTLR start synpred5_InternalModel
    public final void synpred5_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:483:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:483:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:483:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:484:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:484:7: ( ( ruleValidID ) )
        // InternalModel.g:485:8: ( ruleValidID )
        {
        // InternalModel.g:485:8: ( ruleValidID )
        // InternalModel.g:486:9: ruleValidID
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
        // InternalModel.g:655:5: ( '(' )
        // InternalModel.g:655:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred7_InternalModel

    // $ANTLR start synpred8_InternalModel
    public final void synpred8_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:663:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:663:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:663:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:664:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:664:7: ( ( ruleValidID ) )
        // InternalModel.g:665:8: ( ruleValidID )
        {
        // InternalModel.g:665:8: ( ruleValidID )
        // InternalModel.g:666:9: ruleValidID
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
        // InternalModel.g:1570:5: ( '(' )
        // InternalModel.g:1570:6: '('
        {
        match(input,15,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred12_InternalModel

    // $ANTLR start synpred13_InternalModel
    public final void synpred13_InternalModel_fragment() throws RecognitionException {   
        // InternalModel.g:1578:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalModel.g:1578:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalModel.g:1578:7: ( ( ( ruleValidID ) ) '=' )
        // InternalModel.g:1579:7: ( ( ruleValidID ) ) '='
        {
        // InternalModel.g:1579:7: ( ( ruleValidID ) )
        // InternalModel.g:1580:8: ( ruleValidID )
        {
        // InternalModel.g:1580:8: ( ruleValidID )
        // InternalModel.g:1581:9: ruleValidID
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
        // InternalModel.g:2188:5: ( '.' )
        // InternalModel.g:2188:6: '.'
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


    protected DFA40 dfa40 = new DFA40(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\27\1\4\1\14\1\4\2\uffff\1\14";
    static final String dfa_4s = "\1\27\1\4\1\66\1\4\2\uffff\1\66";
    static final String dfa_5s = "\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\3\uffff\1\4\2\uffff\1\4\17\uffff\1\5\12\uffff\3\4\5\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\3\uffff\1\4\2\uffff\1\4\17\uffff\1\5\12\uffff\3\4\5\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "1754:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )";
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