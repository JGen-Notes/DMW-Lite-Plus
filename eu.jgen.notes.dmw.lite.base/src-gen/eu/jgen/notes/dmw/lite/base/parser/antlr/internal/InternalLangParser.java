package eu.jgen.notes.dmw.lite.base.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import eu.jgen.notes.dmw.lite.base.services.LangGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalLangParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_INT", "RULE_STRING", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'package'", "';'", "'class'", "':'", "'=>'", "'{'", "'}'", "'var'", "'?'", "'<'", "','", "'>'", "'func'", "'('", "')'", "'->'", "'='", "'return'", "'if'", "'else'", "'switch'", "'default'", "'case'", "'.'", "'||'", "'&&'", "'=='", "'!='", "'>='", "'<='", "'+'", "'-'", "'*'", "'/'", "'!'", "'true'", "'false'", "'self'", "'super'", "'null'", "'new'", "'db-read'", "'success'", "'not'", "'found'", "'db-read-each'", "'target'", "'db-create'", "'already'", "'exist'", "'db-update'", "'db-delete'", "'db-associate'", "'with'", "'db-disassociate'", "'from'", "'join'", "'where'", "'while'", "'repeat'", "'for'", "'in'", "'import'", "'@entity'", "'@attribute'", "'@relationship'", "'<-'", "'@identifier'", "'['", "']'", "'@td'", "'database'", "'@table'", "'as'", "'VARCHAR'", "'CHAR'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'DECIMAL'", "'TIME'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", "'@column'", "'@primary'", "'@foreign'", "'@java'", "'uses'", "'@swift'", "'module'", "'@database'", "'.*'", "'private'", "'protected'", "'public'"
    };
    public static final int T__50=50;
    public static final int T__59=59;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int RULE_ID=6;
    public static final int RULE_INT=4;
    public static final int T__66=66;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
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
    public static final int T__91=91;
    public static final int T__100=100;
    public static final int T__92=92;
    public static final int T__93=93;
    public static final int T__102=102;
    public static final int T__94=94;
    public static final int T__101=101;
    public static final int T__90=90;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__99=99;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int T__95=95;
    public static final int T__96=96;
    public static final int T__97=97;
    public static final int T__98=98;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__73=73;
    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int T__84=84;
    public static final int T__104=104;
    public static final int T__85=85;
    public static final int T__103=103;
    public static final int T__86=86;
    public static final int T__106=106;
    public static final int T__87=87;
    public static final int T__105=105;

    // delegates
    // delegators


        public InternalLangParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalLangParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalLangParser.tokenNames; }
    public String getGrammarFileName() { return "InternalLang.g"; }



     	private LangGrammarAccess grammarAccess;

        public InternalLangParser(TokenStream input, LangGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "YWidget";
       	}

       	@Override
       	protected LangGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleYWidget"
    // InternalLang.g:65:1: entryRuleYWidget returns [EObject current=null] : iv_ruleYWidget= ruleYWidget EOF ;
    public final EObject entryRuleYWidget() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYWidget = null;


        try {
            // InternalLang.g:65:48: (iv_ruleYWidget= ruleYWidget EOF )
            // InternalLang.g:66:2: iv_ruleYWidget= ruleYWidget EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYWidgetRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYWidget=ruleYWidget();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYWidget; 
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
    // $ANTLR end "entryRuleYWidget"


    // $ANTLR start "ruleYWidget"
    // InternalLang.g:72:1: ruleYWidget returns [EObject current=null] : (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_classes_4_0= ruleYClass ) )* ) ;
    public final EObject ruleYWidget() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        EObject lv_imports_3_0 = null;

        EObject lv_classes_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:78:2: ( (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_classes_4_0= ruleYClass ) )* ) )
            // InternalLang.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_classes_4_0= ruleYClass ) )* )
            {
            // InternalLang.g:79:2: (otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_classes_4_0= ruleYClass ) )* )
            // InternalLang.g:80:3: otherlv_0= 'package' ( (lv_name_1_0= ruleQualifiedName ) ) (otherlv_2= ';' )? ( (lv_imports_3_0= ruleYImport ) )* ( (lv_classes_4_0= ruleYClass ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYWidgetAccess().getPackageKeyword_0());
              		
            }
            // InternalLang.g:84:3: ( (lv_name_1_0= ruleQualifiedName ) )
            // InternalLang.g:85:4: (lv_name_1_0= ruleQualifiedName )
            {
            // InternalLang.g:85:4: (lv_name_1_0= ruleQualifiedName )
            // InternalLang.g:86:5: lv_name_1_0= ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYWidgetAccess().getNameQualifiedNameParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_4);
            lv_name_1_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYWidgetRule());
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

            // InternalLang.g:103:3: (otherlv_2= ';' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==12) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalLang.g:104:4: otherlv_2= ';'
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_5); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYWidgetAccess().getSemicolonKeyword_2());
                      			
                    }

                    }
                    break;

            }

            // InternalLang.g:109:3: ( (lv_imports_3_0= ruleYImport ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==73) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalLang.g:110:4: (lv_imports_3_0= ruleYImport )
            	    {
            	    // InternalLang.g:110:4: (lv_imports_3_0= ruleYImport )
            	    // InternalLang.g:111:5: lv_imports_3_0= ruleYImport
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYWidgetAccess().getImportsYImportParserRuleCall_3_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_5);
            	    lv_imports_3_0=ruleYImport();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYWidgetRule());
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

            // InternalLang.g:128:3: ( (lv_classes_4_0= ruleYClass ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalLang.g:129:4: (lv_classes_4_0= ruleYClass )
            	    {
            	    // InternalLang.g:129:4: (lv_classes_4_0= ruleYClass )
            	    // InternalLang.g:130:5: lv_classes_4_0= ruleYClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYWidgetAccess().getClassesYClassParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_6);
            	    lv_classes_4_0=ruleYClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYWidgetRule());
            	      					}
            	      					add(
            	      						current,
            	      						"classes",
            	      						lv_classes_4_0,
            	      						"eu.jgen.notes.dmw.lite.base.Lang.YClass");
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
    // $ANTLR end "ruleYWidget"


    // $ANTLR start "entryRuleYParameter"
    // InternalLang.g:151:1: entryRuleYParameter returns [EObject current=null] : iv_ruleYParameter= ruleYParameter EOF ;
    public final EObject entryRuleYParameter() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYParameter = null;


        try {
            // InternalLang.g:151:51: (iv_ruleYParameter= ruleYParameter EOF )
            // InternalLang.g:152:2: iv_ruleYParameter= ruleYParameter EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYParameterRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYParameter=ruleYParameter();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYParameter; 
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
    // $ANTLR end "entryRuleYParameter"


    // $ANTLR start "ruleYParameter"
    // InternalLang.g:158:1: ruleYParameter returns [EObject current=null] : (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] | this_YJoinDef_1= ruleYJoinDef ) ;
    public final EObject ruleYParameter() throws RecognitionException {
        EObject current = null;

        EObject this_YTypedDeclaration_0 = null;

        EObject this_YJoinDef_1 = null;



        	enterRule();

        try {
            // InternalLang.g:164:2: ( (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] | this_YJoinDef_1= ruleYJoinDef ) )
            // InternalLang.g:165:2: (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] | this_YJoinDef_1= ruleYJoinDef )
            {
            // InternalLang.g:165:2: (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] | this_YJoinDef_1= ruleYJoinDef )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==RULE_ID) ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1==14) ) {
                    alt4=1;
                }
                else if ( (LA4_1==26) ) {
                    alt4=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;
                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalLang.g:166:3: this_YTypedDeclaration_0= ruleYTypedDeclaration[$current]
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      				current = createModelElement(grammarAccess.getYParameterRule());
                      			}
                      			newCompositeNode(grammarAccess.getYParameterAccess().getYTypedDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YTypedDeclaration_0=ruleYTypedDeclaration(current);

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YTypedDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:178:3: this_YJoinDef_1= ruleYJoinDef
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYParameterAccess().getYJoinDefParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YJoinDef_1=ruleYJoinDef();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YJoinDef_1;
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
    // $ANTLR end "ruleYParameter"


    // $ANTLR start "entryRuleYArgumentValue"
    // InternalLang.g:190:1: entryRuleYArgumentValue returns [String current=null] : iv_ruleYArgumentValue= ruleYArgumentValue EOF ;
    public final String entryRuleYArgumentValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleYArgumentValue = null;


        try {
            // InternalLang.g:190:54: (iv_ruleYArgumentValue= ruleYArgumentValue EOF )
            // InternalLang.g:191:2: iv_ruleYArgumentValue= ruleYArgumentValue EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYArgumentValueRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYArgumentValue=ruleYArgumentValue();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYArgumentValue.getText(); 
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
    // $ANTLR end "entryRuleYArgumentValue"


    // $ANTLR start "ruleYArgumentValue"
    // InternalLang.g:197:1: ruleYArgumentValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) ;
    public final AntlrDatatypeRuleToken ruleYArgumentValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token this_STRING_1=null;


        	enterRule();

        try {
            // InternalLang.g:203:2: ( (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING ) )
            // InternalLang.g:204:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            {
            // InternalLang.g:204:2: (this_INT_0= RULE_INT | this_STRING_1= RULE_STRING )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_INT) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_STRING) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalLang.g:205:3: this_INT_0= RULE_INT
                    {
                    this_INT_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_INT_0);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_INT_0, grammarAccess.getYArgumentValueAccess().getINTTerminalRuleCall_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:213:3: this_STRING_1= RULE_STRING
                    {
                    this_STRING_1=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(this_STRING_1);
                      		
                    }
                    if ( state.backtracking==0 ) {

                      			newLeafNode(this_STRING_1, grammarAccess.getYArgumentValueAccess().getSTRINGTerminalRuleCall_1());
                      		
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
    // $ANTLR end "ruleYArgumentValue"


    // $ANTLR start "entryRuleYClass"
    // InternalLang.g:224:1: entryRuleYClass returns [EObject current=null] : iv_ruleYClass= ruleYClass EOF ;
    public final EObject entryRuleYClass() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYClass = null;


        try {
            // InternalLang.g:224:47: (iv_ruleYClass= ruleYClass EOF )
            // InternalLang.g:225:2: iv_ruleYClass= ruleYClass EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYClassRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYClass=ruleYClass();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYClass; 
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
    // $ANTLR end "entryRuleYClass"


    // $ANTLR start "ruleYClass"
    // InternalLang.g:231:1: ruleYClass returns [EObject current=null] : ( () otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_inners_8_0= ruleYClass ) )* ( (lv_members_9_0= ruleYMember ) )* otherlv_10= '}' ) ;
    public final EObject ruleYClass() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_10=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_inners_8_0 = null;

        EObject lv_members_9_0 = null;



        	enterRule();

        try {
            // InternalLang.g:237:2: ( ( () otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_inners_8_0= ruleYClass ) )* ( (lv_members_9_0= ruleYMember ) )* otherlv_10= '}' ) )
            // InternalLang.g:238:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_inners_8_0= ruleYClass ) )* ( (lv_members_9_0= ruleYMember ) )* otherlv_10= '}' )
            {
            // InternalLang.g:238:2: ( () otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_inners_8_0= ruleYClass ) )* ( (lv_members_9_0= ruleYMember ) )* otherlv_10= '}' )
            // InternalLang.g:239:3: () otherlv_1= 'class' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ':' ( ( ruleQualifiedName ) ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= '{' ( (lv_inners_8_0= ruleYClass ) )* ( (lv_members_9_0= ruleYMember ) )* otherlv_10= '}'
            {
            // InternalLang.g:239:3: ()
            // InternalLang.g:240:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYClassAccess().getYClassAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,13,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYClassAccess().getClassKeyword_1());
              		
            }
            // InternalLang.g:250:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:251:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:251:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:252:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYClassAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_7);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYClassRule());
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

            // InternalLang.g:269:3: (otherlv_3= ':' ( ( ruleQualifiedName ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==14) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalLang.g:270:4: otherlv_3= ':' ( ( ruleQualifiedName ) )
                    {
                    otherlv_3=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getYClassAccess().getColonKeyword_3_0());
                      			
                    }
                    // InternalLang.g:274:4: ( ( ruleQualifiedName ) )
                    // InternalLang.g:275:5: ( ruleQualifiedName )
                    {
                    // InternalLang.g:275:5: ( ruleQualifiedName )
                    // InternalLang.g:276:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYClassAccess().getSuperclassYClassCrossReference_3_1_0());
                      					
                    }
                    pushFollow(FOLLOW_8);
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

            // InternalLang.g:291:3: (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==15) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalLang.g:292:4: otherlv_5= '=>' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getYClassAccess().getEqualsSignGreaterThanSignKeyword_4_0());
                      			
                    }
                    // InternalLang.g:296:4: ( ( ruleQualifiedName ) )
                    // InternalLang.g:297:5: ( ruleQualifiedName )
                    {
                    // InternalLang.g:297:5: ( ruleQualifiedName )
                    // InternalLang.g:298:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYClassRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYClassAccess().getEntityRefYAnnotEntityCrossReference_4_1_0());
                      					
                    }
                    pushFollow(FOLLOW_9);
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

            otherlv_7=(Token)match(input,16,FOLLOW_10); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYClassAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalLang.g:317:3: ( (lv_inners_8_0= ruleYClass ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==13) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalLang.g:318:4: (lv_inners_8_0= ruleYClass )
            	    {
            	    // InternalLang.g:318:4: (lv_inners_8_0= ruleYClass )
            	    // InternalLang.g:319:5: lv_inners_8_0= ruleYClass
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYClassAccess().getInnersYClassParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_10);
            	    lv_inners_8_0=ruleYClass();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"inners",
            	      						lv_inners_8_0,
            	      						"eu.jgen.notes.dmw.lite.base.Lang.YClass");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalLang.g:336:3: ( (lv_members_9_0= ruleYMember ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==18||LA9_0==23||(LA9_0>=104 && LA9_0<=106)) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalLang.g:337:4: (lv_members_9_0= ruleYMember )
            	    {
            	    // InternalLang.g:337:4: (lv_members_9_0= ruleYMember )
            	    // InternalLang.g:338:5: lv_members_9_0= ruleYMember
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYClassAccess().getMembersYMemberParserRuleCall_7_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_11);
            	    lv_members_9_0=ruleYMember();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYClassRule());
            	      					}
            	      					add(
            	      						current,
            	      						"members",
            	      						lv_members_9_0,
            	      						"eu.jgen.notes.dmw.lite.base.Lang.YMember");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_10, grammarAccess.getYClassAccess().getRightCurlyBracketKeyword_8());
              		
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
    // $ANTLR end "ruleYClass"


    // $ANTLR start "entryRuleYMember"
    // InternalLang.g:363:1: entryRuleYMember returns [EObject current=null] : iv_ruleYMember= ruleYMember EOF ;
    public final EObject entryRuleYMember() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYMember = null;


        try {
            // InternalLang.g:363:48: (iv_ruleYMember= ruleYMember EOF )
            // InternalLang.g:364:2: iv_ruleYMember= ruleYMember EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYMemberRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYMember=ruleYMember();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYMember; 
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
    // $ANTLR end "entryRuleYMember"


    // $ANTLR start "ruleYMember"
    // InternalLang.g:370:1: ruleYMember returns [EObject current=null] : (this_YProperty_0= ruleYProperty | this_YFunction_1= ruleYFunction ) ;
    public final EObject ruleYMember() throws RecognitionException {
        EObject current = null;

        EObject this_YProperty_0 = null;

        EObject this_YFunction_1 = null;



        	enterRule();

        try {
            // InternalLang.g:376:2: ( (this_YProperty_0= ruleYProperty | this_YFunction_1= ruleYFunction ) )
            // InternalLang.g:377:2: (this_YProperty_0= ruleYProperty | this_YFunction_1= ruleYFunction )
            {
            // InternalLang.g:377:2: (this_YProperty_0= ruleYProperty | this_YFunction_1= ruleYFunction )
            int alt10=2;
            switch ( input.LA(1) ) {
            case 104:
                {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==18) ) {
                    alt10=1;
                }
                else if ( (LA10_1==23) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;
                }
                }
                break;
            case 105:
                {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==18) ) {
                    alt10=1;
                }
                else if ( (LA10_2==23) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;
                }
                }
                break;
            case 106:
                {
                int LA10_3 = input.LA(2);

                if ( (LA10_3==18) ) {
                    alt10=1;
                }
                else if ( (LA10_3==23) ) {
                    alt10=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return current;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 3, input);

                    throw nvae;
                }
                }
                break;
            case 18:
                {
                alt10=1;
                }
                break;
            case 23:
                {
                alt10=2;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;
            }

            switch (alt10) {
                case 1 :
                    // InternalLang.g:378:3: this_YProperty_0= ruleYProperty
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYMemberAccess().getYPropertyParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YProperty_0=ruleYProperty();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YProperty_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:387:3: this_YFunction_1= ruleYFunction
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYMemberAccess().getYFunctionParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YFunction_1=ruleYFunction();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YFunction_1;
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
    // $ANTLR end "ruleYMember"


    // $ANTLR start "ruleYTypedDeclaration"
    // InternalLang.g:400:1: ruleYTypedDeclaration[EObject in_current] returns [EObject current=in_current] : ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) ;
    public final EObject ruleYTypedDeclaration(EObject in_current) throws RecognitionException {
        EObject current = in_current;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;



        	enterRule();

        try {
            // InternalLang.g:406:2: ( ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) ) )
            // InternalLang.g:407:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            {
            // InternalLang.g:407:2: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) ) )
            // InternalLang.g:408:3: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= ':' ( ( ruleQualifiedName ) )
            {
            // InternalLang.g:408:3: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:409:4: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:409:4: (lv_name_0_0= ruleValidID )
            // InternalLang.g:410:5: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYTypedDeclarationAccess().getNameValidIDParserRuleCall_0_0());
              				
            }
            pushFollow(FOLLOW_12);
            lv_name_0_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYTypedDeclarationRule());
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

            otherlv_1=(Token)match(input,14,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYTypedDeclarationAccess().getColonKeyword_1());
              		
            }
            // InternalLang.g:431:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:432:4: ( ruleQualifiedName )
            {
            // InternalLang.g:432:4: ( ruleQualifiedName )
            // InternalLang.g:433:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYTypedDeclarationRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYTypedDeclarationAccess().getTypeYClassCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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
    // $ANTLR end "ruleYTypedDeclaration"


    // $ANTLR start "entryRuleYProperty"
    // InternalLang.g:451:1: entryRuleYProperty returns [EObject current=null] : iv_ruleYProperty= ruleYProperty EOF ;
    public final EObject entryRuleYProperty() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYProperty = null;


        try {
            // InternalLang.g:451:50: (iv_ruleYProperty= ruleYProperty EOF )
            // InternalLang.g:452:2: iv_ruleYProperty= ruleYProperty EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYPropertyRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYProperty=ruleYProperty();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYProperty; 
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
    // $ANTLR end "entryRuleYProperty"


    // $ANTLR start "ruleYProperty"
    // InternalLang.g:458:1: ruleYProperty returns [EObject current=null] : ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'var' this_YTypedDeclaration_2= ruleYTypedDeclaration[$current] ( (lv_tuples_3_0= ruleYTuples ) )? ( (lv_optional_4_0= '?' ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= ';' ) ;
    public final EObject ruleYProperty() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_optional_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Enumerator lv_access_0_0 = null;

        EObject this_YTypedDeclaration_2 = null;

        EObject lv_tuples_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:464:2: ( ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'var' this_YTypedDeclaration_2= ruleYTypedDeclaration[$current] ( (lv_tuples_3_0= ruleYTuples ) )? ( (lv_optional_4_0= '?' ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= ';' ) )
            // InternalLang.g:465:2: ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'var' this_YTypedDeclaration_2= ruleYTypedDeclaration[$current] ( (lv_tuples_3_0= ruleYTuples ) )? ( (lv_optional_4_0= '?' ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= ';' )
            {
            // InternalLang.g:465:2: ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'var' this_YTypedDeclaration_2= ruleYTypedDeclaration[$current] ( (lv_tuples_3_0= ruleYTuples ) )? ( (lv_optional_4_0= '?' ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= ';' )
            // InternalLang.g:466:3: ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'var' this_YTypedDeclaration_2= ruleYTypedDeclaration[$current] ( (lv_tuples_3_0= ruleYTuples ) )? ( (lv_optional_4_0= '?' ) )? (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )? otherlv_7= ';'
            {
            // InternalLang.g:466:3: ( (lv_access_0_0= ruleYAccessLevel ) )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=104 && LA11_0<=106)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalLang.g:467:4: (lv_access_0_0= ruleYAccessLevel )
                    {
                    // InternalLang.g:467:4: (lv_access_0_0= ruleYAccessLevel )
                    // InternalLang.g:468:5: lv_access_0_0= ruleYAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYPropertyAccess().getAccessYAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_13);
                    lv_access_0_0=ruleYAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYPropertyRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YAccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,18,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYPropertyAccess().getVarKeyword_1());
              		
            }
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getYPropertyRule());
              			}
              			newCompositeNode(grammarAccess.getYPropertyAccess().getYTypedDeclarationParserRuleCall_2());
              		
            }
            pushFollow(FOLLOW_14);
            this_YTypedDeclaration_2=ruleYTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YTypedDeclaration_2;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:500:3: ( (lv_tuples_3_0= ruleYTuples ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==20) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalLang.g:501:4: (lv_tuples_3_0= ruleYTuples )
                    {
                    // InternalLang.g:501:4: (lv_tuples_3_0= ruleYTuples )
                    // InternalLang.g:502:5: lv_tuples_3_0= ruleYTuples
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYPropertyAccess().getTuplesYTuplesParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_15);
                    lv_tuples_3_0=ruleYTuples();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYPropertyRule());
                      					}
                      					set(
                      						current,
                      						"tuples",
                      						lv_tuples_3_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YTuples");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:519:3: ( (lv_optional_4_0= '?' ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==19) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalLang.g:520:4: (lv_optional_4_0= '?' )
                    {
                    // InternalLang.g:520:4: (lv_optional_4_0= '?' )
                    // InternalLang.g:521:5: lv_optional_4_0= '?'
                    {
                    lv_optional_4_0=(Token)match(input,19,FOLLOW_16); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_optional_4_0, grammarAccess.getYPropertyAccess().getOptionalQuestionMarkKeyword_4_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYPropertyRule());
                      					}
                      					setWithLastConsumed(current, "optional", true, "?");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:533:3: (otherlv_5= '=>' ( ( ruleQualifiedName ) ) )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==15) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalLang.g:534:4: otherlv_5= '=>' ( ( ruleQualifiedName ) )
                    {
                    otherlv_5=(Token)match(input,15,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getYPropertyAccess().getEqualsSignGreaterThanSignKeyword_5_0());
                      			
                    }
                    // InternalLang.g:538:4: ( ( ruleQualifiedName ) )
                    // InternalLang.g:539:5: ( ruleQualifiedName )
                    {
                    // InternalLang.g:539:5: ( ruleQualifiedName )
                    // InternalLang.g:540:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYPropertyRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYPropertyAccess().getAttrRefYAnnotAttributeCrossReference_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_17);
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

            otherlv_7=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYPropertyAccess().getSemicolonKeyword_6());
              		
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
    // $ANTLR end "ruleYProperty"


    // $ANTLR start "entryRuleYTuples"
    // InternalLang.g:563:1: entryRuleYTuples returns [EObject current=null] : iv_ruleYTuples= ruleYTuples EOF ;
    public final EObject entryRuleYTuples() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYTuples = null;


        try {
            // InternalLang.g:563:48: (iv_ruleYTuples= ruleYTuples EOF )
            // InternalLang.g:564:2: iv_ruleYTuples= ruleYTuples EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYTuplesRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYTuples=ruleYTuples();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYTuples; 
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
    // $ANTLR end "entryRuleYTuples"


    // $ANTLR start "ruleYTuples"
    // InternalLang.g:570:1: ruleYTuples returns [EObject current=null] : ( () otherlv_1= '<' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= '>' ) ;
    public final EObject ruleYTuples() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;


        	enterRule();

        try {
            // InternalLang.g:576:2: ( ( () otherlv_1= '<' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= '>' ) )
            // InternalLang.g:577:2: ( () otherlv_1= '<' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= '>' )
            {
            // InternalLang.g:577:2: ( () otherlv_1= '<' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= '>' )
            // InternalLang.g:578:3: () otherlv_1= '<' ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )? otherlv_5= '>'
            {
            // InternalLang.g:578:3: ()
            // InternalLang.g:579:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYTuplesAccess().getYTuplesAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,20,FOLLOW_18); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYTuplesAccess().getLessThanSignKeyword_1());
              		
            }
            // InternalLang.g:589:3: ( ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_ID) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalLang.g:590:4: ( (otherlv_2= RULE_ID ) ) (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    {
                    // InternalLang.g:590:4: ( (otherlv_2= RULE_ID ) )
                    // InternalLang.g:591:5: (otherlv_2= RULE_ID )
                    {
                    // InternalLang.g:591:5: (otherlv_2= RULE_ID )
                    // InternalLang.g:592:6: otherlv_2= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYTuplesRule());
                      						}
                      					
                    }
                    otherlv_2=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_2, grammarAccess.getYTuplesAccess().getIncludesYPropertyCrossReference_2_0_0());
                      					
                    }

                    }


                    }

                    // InternalLang.g:603:4: (otherlv_3= ',' ( (otherlv_4= RULE_ID ) ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==21) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // InternalLang.g:604:5: otherlv_3= ',' ( (otherlv_4= RULE_ID ) )
                    	    {
                    	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_3, grammarAccess.getYTuplesAccess().getCommaKeyword_2_1_0());
                    	      				
                    	    }
                    	    // InternalLang.g:608:5: ( (otherlv_4= RULE_ID ) )
                    	    // InternalLang.g:609:6: (otherlv_4= RULE_ID )
                    	    {
                    	    // InternalLang.g:609:6: (otherlv_4= RULE_ID )
                    	    // InternalLang.g:610:7: otherlv_4= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElement(grammarAccess.getYTuplesRule());
                    	      							}
                    	      						
                    	    }
                    	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_19); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							newLeafNode(otherlv_4, grammarAccess.getYTuplesAccess().getIncludesYPropertyCrossReference_2_1_1_0());
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_5=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYTuplesAccess().getGreaterThanSignKeyword_3());
              		
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
    // $ANTLR end "ruleYTuples"


    // $ANTLR start "entryRuleYFunction"
    // InternalLang.g:631:1: entryRuleYFunction returns [EObject current=null] : iv_ruleYFunction= ruleYFunction EOF ;
    public final EObject entryRuleYFunction() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYFunction = null;


        try {
            // InternalLang.g:631:50: (iv_ruleYFunction= ruleYFunction EOF )
            // InternalLang.g:632:2: iv_ruleYFunction= ruleYFunction EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYFunctionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYFunction=ruleYFunction();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYFunction; 
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
    // $ANTLR end "entryRuleYFunction"


    // $ANTLR start "ruleYFunction"
    // InternalLang.g:638:1: ruleYFunction returns [EObject current=null] : ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )? otherlv_7= ')' ( (lv_returnvalue_8_0= '->' ) )? ( ( ruleQualifiedName ) )? ( (lv_body_10_0= ruleYBlock ) ) ) ;
    public final EObject ruleYFunction() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token lv_returnvalue_8_0=null;
        Enumerator lv_access_0_0 = null;

        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_params_4_0 = null;

        EObject lv_params_6_0 = null;

        EObject lv_body_10_0 = null;



        	enterRule();

        try {
            // InternalLang.g:644:2: ( ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )? otherlv_7= ')' ( (lv_returnvalue_8_0= '->' ) )? ( ( ruleQualifiedName ) )? ( (lv_body_10_0= ruleYBlock ) ) ) )
            // InternalLang.g:645:2: ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )? otherlv_7= ')' ( (lv_returnvalue_8_0= '->' ) )? ( ( ruleQualifiedName ) )? ( (lv_body_10_0= ruleYBlock ) ) )
            {
            // InternalLang.g:645:2: ( ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )? otherlv_7= ')' ( (lv_returnvalue_8_0= '->' ) )? ( ( ruleQualifiedName ) )? ( (lv_body_10_0= ruleYBlock ) ) )
            // InternalLang.g:646:3: ( (lv_access_0_0= ruleYAccessLevel ) )? otherlv_1= 'func' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )? otherlv_7= ')' ( (lv_returnvalue_8_0= '->' ) )? ( ( ruleQualifiedName ) )? ( (lv_body_10_0= ruleYBlock ) )
            {
            // InternalLang.g:646:3: ( (lv_access_0_0= ruleYAccessLevel ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( ((LA17_0>=104 && LA17_0<=106)) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalLang.g:647:4: (lv_access_0_0= ruleYAccessLevel )
                    {
                    // InternalLang.g:647:4: (lv_access_0_0= ruleYAccessLevel )
                    // InternalLang.g:648:5: lv_access_0_0= ruleYAccessLevel
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYFunctionAccess().getAccessYAccessLevelEnumRuleCall_0_0());
                      				
                    }
                    pushFollow(FOLLOW_20);
                    lv_access_0_0=ruleYAccessLevel();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYFunctionRule());
                      					}
                      					set(
                      						current,
                      						"access",
                      						lv_access_0_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YAccessLevel");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_1=(Token)match(input,23,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYFunctionAccess().getFuncKeyword_1());
              		
            }
            // InternalLang.g:669:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:670:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:670:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:671:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYFunctionAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_21);
            lv_name_2_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYFunctionRule());
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

            otherlv_3=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYFunctionAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalLang.g:692:3: ( ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )* )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==RULE_ID) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalLang.g:693:4: ( (lv_params_4_0= ruleYParameter ) ) (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )*
                    {
                    // InternalLang.g:693:4: ( (lv_params_4_0= ruleYParameter ) )
                    // InternalLang.g:694:5: (lv_params_4_0= ruleYParameter )
                    {
                    // InternalLang.g:694:5: (lv_params_4_0= ruleYParameter )
                    // InternalLang.g:695:6: lv_params_4_0= ruleYParameter
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYFunctionAccess().getParamsYParameterParserRuleCall_4_0_0());
                      					
                    }
                    pushFollow(FOLLOW_23);
                    lv_params_4_0=ruleYParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYFunctionRule());
                      						}
                      						add(
                      							current,
                      							"params",
                      							lv_params_4_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YParameter");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    // InternalLang.g:712:4: (otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) ) )*
                    loop18:
                    do {
                        int alt18=2;
                        int LA18_0 = input.LA(1);

                        if ( (LA18_0==21) ) {
                            alt18=1;
                        }


                        switch (alt18) {
                    	case 1 :
                    	    // InternalLang.g:713:5: otherlv_5= ',' ( (lv_params_6_0= ruleYParameter ) )
                    	    {
                    	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      					newLeafNode(otherlv_5, grammarAccess.getYFunctionAccess().getCommaKeyword_4_1_0());
                    	      				
                    	    }
                    	    // InternalLang.g:717:5: ( (lv_params_6_0= ruleYParameter ) )
                    	    // InternalLang.g:718:6: (lv_params_6_0= ruleYParameter )
                    	    {
                    	    // InternalLang.g:718:6: (lv_params_6_0= ruleYParameter )
                    	    // InternalLang.g:719:7: lv_params_6_0= ruleYParameter
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      							newCompositeNode(grammarAccess.getYFunctionAccess().getParamsYParameterParserRuleCall_4_1_1_0());
                    	      						
                    	    }
                    	    pushFollow(FOLLOW_23);
                    	    lv_params_6_0=ruleYParameter();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      							if (current==null) {
                    	      								current = createModelElementForParent(grammarAccess.getYFunctionRule());
                    	      							}
                    	      							add(
                    	      								current,
                    	      								"params",
                    	      								lv_params_6_0,
                    	      								"eu.jgen.notes.dmw.lite.base.Lang.YParameter");
                    	      							afterParserOrEnumRuleCall();
                    	      						
                    	    }

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop18;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,25,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYFunctionAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalLang.g:742:3: ( (lv_returnvalue_8_0= '->' ) )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==26) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalLang.g:743:4: (lv_returnvalue_8_0= '->' )
                    {
                    // InternalLang.g:743:4: (lv_returnvalue_8_0= '->' )
                    // InternalLang.g:744:5: lv_returnvalue_8_0= '->'
                    {
                    lv_returnvalue_8_0=(Token)match(input,26,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(lv_returnvalue_8_0, grammarAccess.getYFunctionAccess().getReturnvalueHyphenMinusGreaterThanSignKeyword_6_0());
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYFunctionRule());
                      					}
                      					setWithLastConsumed(current, "returnvalue", true, "->");
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:756:3: ( ( ruleQualifiedName ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==RULE_ID) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalLang.g:757:4: ( ruleQualifiedName )
                    {
                    // InternalLang.g:757:4: ( ruleQualifiedName )
                    // InternalLang.g:758:5: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElement(grammarAccess.getYFunctionRule());
                      					}
                      				
                    }
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYFunctionAccess().getTypeYClassCrossReference_7_0());
                      				
                    }
                    pushFollow(FOLLOW_24);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:772:3: ( (lv_body_10_0= ruleYBlock ) )
            // InternalLang.g:773:4: (lv_body_10_0= ruleYBlock )
            {
            // InternalLang.g:773:4: (lv_body_10_0= ruleYBlock )
            // InternalLang.g:774:5: lv_body_10_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYFunctionAccess().getBodyYBlockParserRuleCall_8_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_10_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYFunctionRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_10_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYFunction"


    // $ANTLR start "entryRuleYBlock"
    // InternalLang.g:795:1: entryRuleYBlock returns [EObject current=null] : iv_ruleYBlock= ruleYBlock EOF ;
    public final EObject entryRuleYBlock() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYBlock = null;


        try {
            // InternalLang.g:795:47: (iv_ruleYBlock= ruleYBlock EOF )
            // InternalLang.g:796:2: iv_ruleYBlock= ruleYBlock EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYBlockRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYBlock=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYBlock; 
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
    // $ANTLR end "entryRuleYBlock"


    // $ANTLR start "ruleYBlock"
    // InternalLang.g:802:1: ruleYBlock returns [EObject current=null] : ( () otherlv_1= '{' ( (lv_statements_2_0= ruleYStatement ) )* otherlv_3= '}' ) ;
    public final EObject ruleYBlock() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_statements_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:808:2: ( ( () otherlv_1= '{' ( (lv_statements_2_0= ruleYStatement ) )* otherlv_3= '}' ) )
            // InternalLang.g:809:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleYStatement ) )* otherlv_3= '}' )
            {
            // InternalLang.g:809:2: ( () otherlv_1= '{' ( (lv_statements_2_0= ruleYStatement ) )* otherlv_3= '}' )
            // InternalLang.g:810:3: () otherlv_1= '{' ( (lv_statements_2_0= ruleYStatement ) )* otherlv_3= '}'
            {
            // InternalLang.g:810:3: ()
            // InternalLang.g:811:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYBlockAccess().getYBlockAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,16,FOLLOW_25); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYBlockAccess().getLeftCurlyBracketKeyword_1());
              		
            }
            // InternalLang.g:821:3: ( (lv_statements_2_0= ruleYStatement ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=RULE_INT && LA22_0<=RULE_ID)||(LA22_0>=28 && LA22_0<=29)||LA22_0==31||(LA22_0>=46 && LA22_0<=52)||LA22_0==56||LA22_0==58||(LA22_0>=61 && LA22_0<=63)||LA22_0==65||(LA22_0>=69 && LA22_0<=71)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // InternalLang.g:822:4: (lv_statements_2_0= ruleYStatement )
            	    {
            	    // InternalLang.g:822:4: (lv_statements_2_0= ruleYStatement )
            	    // InternalLang.g:823:5: lv_statements_2_0= ruleYStatement
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYBlockAccess().getStatementsYStatementParserRuleCall_2_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_25);
            	    lv_statements_2_0=ruleYStatement();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYBlockRule());
            	      					}
            	      					add(
            	      						current,
            	      						"statements",
            	      						lv_statements_2_0,
            	      						"eu.jgen.notes.dmw.lite.base.Lang.YStatement");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);

            otherlv_3=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYBlockAccess().getRightCurlyBracketKeyword_3());
              		
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
    // $ANTLR end "ruleYBlock"


    // $ANTLR start "entryRuleYStatement"
    // InternalLang.g:848:1: entryRuleYStatement returns [EObject current=null] : iv_ruleYStatement= ruleYStatement EOF ;
    public final EObject entryRuleYStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYStatement = null;


        try {
            // InternalLang.g:848:51: (iv_ruleYStatement= ruleYStatement EOF )
            // InternalLang.g:849:2: iv_ruleYStatement= ruleYStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYStatement=ruleYStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYStatement; 
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
    // $ANTLR end "entryRuleYStatement"


    // $ANTLR start "ruleYStatement"
    // InternalLang.g:855:1: ruleYStatement returns [EObject current=null] : (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YReturn_1= ruleYReturn | this_YReadStatement_2= ruleYReadStatement | this_YCreateStatement_3= ruleYCreateStatement | this_YUpdateStatement_4= ruleYUpdateStatement | this_YAssociateStatement_5= ruleYAssociateStatement | this_YDisassociateStatement_6= ruleYDisassociateStatement | this_YDeleteStatement_7= ruleYDeleteStatement | this_YReadEachStatement_8= ruleYReadEachStatement | this_YWhileStatement_9= ruleYWhileStatement | this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement | this_YForInStatement_11= ruleYForInStatement | (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? ) | this_YIfStatement_14= ruleYIfStatement | this_YSwitchStatement_15= ruleYSwitchStatement ) ;
    public final EObject ruleYStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_13=null;
        EObject this_YVariableDeclaration_0 = null;

        EObject this_YReturn_1 = null;

        EObject this_YReadStatement_2 = null;

        EObject this_YCreateStatement_3 = null;

        EObject this_YUpdateStatement_4 = null;

        EObject this_YAssociateStatement_5 = null;

        EObject this_YDisassociateStatement_6 = null;

        EObject this_YDeleteStatement_7 = null;

        EObject this_YReadEachStatement_8 = null;

        EObject this_YWhileStatement_9 = null;

        EObject this_YRepeatWhileStatement_10 = null;

        EObject this_YForInStatement_11 = null;

        EObject this_YExpression_12 = null;

        EObject this_YIfStatement_14 = null;

        EObject this_YSwitchStatement_15 = null;



        	enterRule();

        try {
            // InternalLang.g:861:2: ( (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YReturn_1= ruleYReturn | this_YReadStatement_2= ruleYReadStatement | this_YCreateStatement_3= ruleYCreateStatement | this_YUpdateStatement_4= ruleYUpdateStatement | this_YAssociateStatement_5= ruleYAssociateStatement | this_YDisassociateStatement_6= ruleYDisassociateStatement | this_YDeleteStatement_7= ruleYDeleteStatement | this_YReadEachStatement_8= ruleYReadEachStatement | this_YWhileStatement_9= ruleYWhileStatement | this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement | this_YForInStatement_11= ruleYForInStatement | (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? ) | this_YIfStatement_14= ruleYIfStatement | this_YSwitchStatement_15= ruleYSwitchStatement ) )
            // InternalLang.g:862:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YReturn_1= ruleYReturn | this_YReadStatement_2= ruleYReadStatement | this_YCreateStatement_3= ruleYCreateStatement | this_YUpdateStatement_4= ruleYUpdateStatement | this_YAssociateStatement_5= ruleYAssociateStatement | this_YDisassociateStatement_6= ruleYDisassociateStatement | this_YDeleteStatement_7= ruleYDeleteStatement | this_YReadEachStatement_8= ruleYReadEachStatement | this_YWhileStatement_9= ruleYWhileStatement | this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement | this_YForInStatement_11= ruleYForInStatement | (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? ) | this_YIfStatement_14= ruleYIfStatement | this_YSwitchStatement_15= ruleYSwitchStatement )
            {
            // InternalLang.g:862:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YReturn_1= ruleYReturn | this_YReadStatement_2= ruleYReadStatement | this_YCreateStatement_3= ruleYCreateStatement | this_YUpdateStatement_4= ruleYUpdateStatement | this_YAssociateStatement_5= ruleYAssociateStatement | this_YDisassociateStatement_6= ruleYDisassociateStatement | this_YDeleteStatement_7= ruleYDeleteStatement | this_YReadEachStatement_8= ruleYReadEachStatement | this_YWhileStatement_9= ruleYWhileStatement | this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement | this_YForInStatement_11= ruleYForInStatement | (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? ) | this_YIfStatement_14= ruleYIfStatement | this_YSwitchStatement_15= ruleYSwitchStatement )
            int alt24=15;
            alt24 = dfa24.predict(input);
            switch (alt24) {
                case 1 :
                    // InternalLang.g:863:3: this_YVariableDeclaration_0= ruleYVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YVariableDeclaration_0=ruleYVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:872:3: this_YReturn_1= ruleYReturn
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYReturnParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YReturn_1=ruleYReturn();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YReturn_1;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLang.g:881:3: this_YReadStatement_2= ruleYReadStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYReadStatementParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YReadStatement_2=ruleYReadStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YReadStatement_2;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLang.g:890:3: this_YCreateStatement_3= ruleYCreateStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYCreateStatementParserRuleCall_3());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YCreateStatement_3=ruleYCreateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YCreateStatement_3;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 5 :
                    // InternalLang.g:899:3: this_YUpdateStatement_4= ruleYUpdateStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYUpdateStatementParserRuleCall_4());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YUpdateStatement_4=ruleYUpdateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YUpdateStatement_4;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 6 :
                    // InternalLang.g:908:3: this_YAssociateStatement_5= ruleYAssociateStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYAssociateStatementParserRuleCall_5());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YAssociateStatement_5=ruleYAssociateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YAssociateStatement_5;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 7 :
                    // InternalLang.g:917:3: this_YDisassociateStatement_6= ruleYDisassociateStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYDisassociateStatementParserRuleCall_6());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YDisassociateStatement_6=ruleYDisassociateStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YDisassociateStatement_6;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 8 :
                    // InternalLang.g:926:3: this_YDeleteStatement_7= ruleYDeleteStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYDeleteStatementParserRuleCall_7());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YDeleteStatement_7=ruleYDeleteStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YDeleteStatement_7;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 9 :
                    // InternalLang.g:935:3: this_YReadEachStatement_8= ruleYReadEachStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYReadEachStatementParserRuleCall_8());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YReadEachStatement_8=ruleYReadEachStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YReadEachStatement_8;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 10 :
                    // InternalLang.g:944:3: this_YWhileStatement_9= ruleYWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYWhileStatementParserRuleCall_9());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YWhileStatement_9=ruleYWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YWhileStatement_9;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 11 :
                    // InternalLang.g:953:3: this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYRepeatWhileStatementParserRuleCall_10());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YRepeatWhileStatement_10=ruleYRepeatWhileStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YRepeatWhileStatement_10;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 12 :
                    // InternalLang.g:962:3: this_YForInStatement_11= ruleYForInStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYForInStatementParserRuleCall_11());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YForInStatement_11=ruleYForInStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YForInStatement_11;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 13 :
                    // InternalLang.g:971:3: (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? )
                    {
                    // InternalLang.g:971:3: (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? )
                    // InternalLang.g:972:4: this_YExpression_12= ruleYExpression (otherlv_13= ';' )?
                    {
                    if ( state.backtracking==0 ) {

                      				newCompositeNode(grammarAccess.getYStatementAccess().getYExpressionParserRuleCall_12_0());
                      			
                    }
                    pushFollow(FOLLOW_26);
                    this_YExpression_12=ruleYExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = this_YExpression_12;
                      				afterParserOrEnumRuleCall();
                      			
                    }
                    // InternalLang.g:980:4: (otherlv_13= ';' )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==12) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // InternalLang.g:981:5: otherlv_13= ';'
                            {
                            otherlv_13=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              					newLeafNode(otherlv_13, grammarAccess.getYStatementAccess().getSemicolonKeyword_12_1());
                              				
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 14 :
                    // InternalLang.g:988:3: this_YIfStatement_14= ruleYIfStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYIfStatementParserRuleCall_13());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YIfStatement_14=ruleYIfStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YIfStatement_14;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 15 :
                    // InternalLang.g:997:3: this_YSwitchStatement_15= ruleYSwitchStatement
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYStatementAccess().getYSwitchStatementParserRuleCall_14());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YSwitchStatement_15=ruleYSwitchStatement();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YSwitchStatement_15;
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
    // $ANTLR end "ruleYStatement"


    // $ANTLR start "entryRuleYVariableDeclaration"
    // InternalLang.g:1009:1: entryRuleYVariableDeclaration returns [EObject current=null] : iv_ruleYVariableDeclaration= ruleYVariableDeclaration EOF ;
    public final EObject entryRuleYVariableDeclaration() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYVariableDeclaration = null;


        try {
            // InternalLang.g:1009:61: (iv_ruleYVariableDeclaration= ruleYVariableDeclaration EOF )
            // InternalLang.g:1010:2: iv_ruleYVariableDeclaration= ruleYVariableDeclaration EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYVariableDeclarationRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYVariableDeclaration=ruleYVariableDeclaration();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYVariableDeclaration; 
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
    // $ANTLR end "entryRuleYVariableDeclaration"


    // $ANTLR start "ruleYVariableDeclaration"
    // InternalLang.g:1016:1: ruleYVariableDeclaration returns [EObject current=null] : (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleYVariableDeclaration() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject this_YTypedDeclaration_0 = null;

        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1022:2: ( (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ';' ) )
            // InternalLang.g:1023:2: (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ';' )
            {
            // InternalLang.g:1023:2: (this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ';' )
            // InternalLang.g:1024:3: this_YTypedDeclaration_0= ruleYTypedDeclaration[$current] otherlv_1= '=' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ';'
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              				current = createModelElement(grammarAccess.getYVariableDeclarationRule());
              			}
              			newCompositeNode(grammarAccess.getYVariableDeclarationAccess().getYTypedDeclarationParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_27);
            this_YTypedDeclaration_0=ruleYTypedDeclaration(current);

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YTypedDeclaration_0;
              			afterParserOrEnumRuleCall();
              		
            }
            otherlv_1=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYVariableDeclarationAccess().getEqualsSignKeyword_1());
              		
            }
            // InternalLang.g:1039:3: ( (lv_expression_2_0= ruleYOrExpression ) )
            // InternalLang.g:1040:4: (lv_expression_2_0= ruleYOrExpression )
            {
            // InternalLang.g:1040:4: (lv_expression_2_0= ruleYOrExpression )
            // InternalLang.g:1041:5: lv_expression_2_0= ruleYOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYVariableDeclarationAccess().getExpressionYOrExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_expression_2_0=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYVariableDeclarationRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYVariableDeclarationAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleYVariableDeclaration"


    // $ANTLR start "entryRuleYReturn"
    // InternalLang.g:1066:1: entryRuleYReturn returns [EObject current=null] : iv_ruleYReturn= ruleYReturn EOF ;
    public final EObject entryRuleYReturn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYReturn = null;


        try {
            // InternalLang.g:1066:48: (iv_ruleYReturn= ruleYReturn EOF )
            // InternalLang.g:1067:2: iv_ruleYReturn= ruleYReturn EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYReturnRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYReturn=ruleYReturn();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYReturn; 
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
    // $ANTLR end "entryRuleYReturn"


    // $ANTLR start "ruleYReturn"
    // InternalLang.g:1073:1: ruleYReturn returns [EObject current=null] : ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleYOrExpression ) )? otherlv_3= ';' ) ;
    public final EObject ruleYReturn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1079:2: ( ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleYOrExpression ) )? otherlv_3= ';' ) )
            // InternalLang.g:1080:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleYOrExpression ) )? otherlv_3= ';' )
            {
            // InternalLang.g:1080:2: ( () otherlv_1= 'return' ( (lv_expression_2_0= ruleYOrExpression ) )? otherlv_3= ';' )
            // InternalLang.g:1081:3: () otherlv_1= 'return' ( (lv_expression_2_0= ruleYOrExpression ) )? otherlv_3= ';'
            {
            // InternalLang.g:1081:3: ()
            // InternalLang.g:1082:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYReturnAccess().getYReturnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,28,FOLLOW_29); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYReturnAccess().getReturnKeyword_1());
              		
            }
            // InternalLang.g:1092:3: ( (lv_expression_2_0= ruleYOrExpression ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( ((LA25_0>=RULE_INT && LA25_0<=RULE_ID)||LA25_0==24||(LA25_0>=45 && LA25_0<=51)) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // InternalLang.g:1093:4: (lv_expression_2_0= ruleYOrExpression )
                    {
                    // InternalLang.g:1093:4: (lv_expression_2_0= ruleYOrExpression )
                    // InternalLang.g:1094:5: lv_expression_2_0= ruleYOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYReturnAccess().getExpressionYOrExpressionParserRuleCall_2_0());
                      				
                    }
                    pushFollow(FOLLOW_17);
                    lv_expression_2_0=ruleYOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYReturnRule());
                      					}
                      					set(
                      						current,
                      						"expression",
                      						lv_expression_2_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYReturnAccess().getSemicolonKeyword_3());
              		
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
    // $ANTLR end "ruleYReturn"


    // $ANTLR start "entryRuleYIfStatement"
    // InternalLang.g:1119:1: entryRuleYIfStatement returns [EObject current=null] : iv_ruleYIfStatement= ruleYIfStatement EOF ;
    public final EObject entryRuleYIfStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYIfStatement = null;


        try {
            // InternalLang.g:1119:53: (iv_ruleYIfStatement= ruleYIfStatement EOF )
            // InternalLang.g:1120:2: iv_ruleYIfStatement= ruleYIfStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYIfStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYIfStatement=ruleYIfStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYIfStatement; 
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
    // $ANTLR end "entryRuleYIfStatement"


    // $ANTLR start "ruleYIfStatement"
    // InternalLang.g:1126:1: ruleYIfStatement returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleYBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )? ) ;
    public final EObject ruleYIfStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_2_0 = null;

        EObject lv_thenBlock_4_0 = null;

        EObject lv_elseBlock_6_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1132:2: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleYBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )? ) )
            // InternalLang.g:1133:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleYBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )? )
            {
            // InternalLang.g:1133:2: (otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleYBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )? )
            // InternalLang.g:1134:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_thenBlock_4_0= ruleYBlock ) ) ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )?
            {
            otherlv_0=(Token)match(input,29,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYIfStatementAccess().getIfKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYIfStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLang.g:1142:3: ( (lv_expression_2_0= ruleYOrExpression ) )
            // InternalLang.g:1143:4: (lv_expression_2_0= ruleYOrExpression )
            {
            // InternalLang.g:1143:4: (lv_expression_2_0= ruleYOrExpression )
            // InternalLang.g:1144:5: lv_expression_2_0= ruleYOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYIfStatementAccess().getExpressionYOrExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_expression_2_0=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYIfStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYIfStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalLang.g:1165:3: ( (lv_thenBlock_4_0= ruleYBlock ) )
            // InternalLang.g:1166:4: (lv_thenBlock_4_0= ruleYBlock )
            {
            // InternalLang.g:1166:4: (lv_thenBlock_4_0= ruleYBlock )
            // InternalLang.g:1167:5: lv_thenBlock_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYIfStatementAccess().getThenBlockYBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_31);
            lv_thenBlock_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYIfStatementRule());
              					}
              					set(
              						current,
              						"thenBlock",
              						lv_thenBlock_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:1184:3: ( ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==30) && (synpred1_InternalLang())) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // InternalLang.g:1185:4: ( ( 'else' )=>otherlv_5= 'else' ) ( (lv_elseBlock_6_0= ruleYBlock ) )
                    {
                    // InternalLang.g:1185:4: ( ( 'else' )=>otherlv_5= 'else' )
                    // InternalLang.g:1186:5: ( 'else' )=>otherlv_5= 'else'
                    {
                    otherlv_5=(Token)match(input,30,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_5, grammarAccess.getYIfStatementAccess().getElseKeyword_5_0());
                      				
                    }

                    }

                    // InternalLang.g:1192:4: ( (lv_elseBlock_6_0= ruleYBlock ) )
                    // InternalLang.g:1193:5: (lv_elseBlock_6_0= ruleYBlock )
                    {
                    // InternalLang.g:1193:5: (lv_elseBlock_6_0= ruleYBlock )
                    // InternalLang.g:1194:6: lv_elseBlock_6_0= ruleYBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYIfStatementAccess().getElseBlockYBlockParserRuleCall_5_1_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_elseBlock_6_0=ruleYBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYIfStatementRule());
                      						}
                      						set(
                      							current,
                      							"elseBlock",
                      							lv_elseBlock_6_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleYIfStatement"


    // $ANTLR start "entryRuleYSwitchStatement"
    // InternalLang.g:1216:1: entryRuleYSwitchStatement returns [EObject current=null] : iv_ruleYSwitchStatement= ruleYSwitchStatement EOF ;
    public final EObject entryRuleYSwitchStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYSwitchStatement = null;


        try {
            // InternalLang.g:1216:57: (iv_ruleYSwitchStatement= ruleYSwitchStatement EOF )
            // InternalLang.g:1217:2: iv_ruleYSwitchStatement= ruleYSwitchStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYSwitchStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYSwitchStatement=ruleYSwitchStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYSwitchStatement; 
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
    // $ANTLR end "entryRuleYSwitchStatement"


    // $ANTLR start "ruleYSwitchStatement"
    // InternalLang.g:1223:1: ruleYSwitchStatement returns [EObject current=null] : ( () otherlv_1= 'switch' ( (lv_switchExpression_2_0= ruleYExpression ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleYSwitchCase ) )* (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )? otherlv_8= '}' ) ;
    public final EObject ruleYSwitchStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject lv_switchExpression_2_0 = null;

        EObject lv_cases_4_0 = null;

        EObject lv_default_7_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1229:2: ( ( () otherlv_1= 'switch' ( (lv_switchExpression_2_0= ruleYExpression ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleYSwitchCase ) )* (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )? otherlv_8= '}' ) )
            // InternalLang.g:1230:2: ( () otherlv_1= 'switch' ( (lv_switchExpression_2_0= ruleYExpression ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleYSwitchCase ) )* (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )? otherlv_8= '}' )
            {
            // InternalLang.g:1230:2: ( () otherlv_1= 'switch' ( (lv_switchExpression_2_0= ruleYExpression ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleYSwitchCase ) )* (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )? otherlv_8= '}' )
            // InternalLang.g:1231:3: () otherlv_1= 'switch' ( (lv_switchExpression_2_0= ruleYExpression ) ) otherlv_3= '{' ( (lv_cases_4_0= ruleYSwitchCase ) )* (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )? otherlv_8= '}'
            {
            // InternalLang.g:1231:3: ()
            // InternalLang.g:1232:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYSwitchStatementAccess().getYSwitchStatementAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,31,FOLLOW_32); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYSwitchStatementAccess().getSwitchKeyword_1());
              		
            }
            // InternalLang.g:1242:3: ( (lv_switchExpression_2_0= ruleYExpression ) )
            // InternalLang.g:1243:4: (lv_switchExpression_2_0= ruleYExpression )
            {
            // InternalLang.g:1243:4: (lv_switchExpression_2_0= ruleYExpression )
            // InternalLang.g:1244:5: lv_switchExpression_2_0= ruleYExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYSwitchStatementAccess().getSwitchExpressionYExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            lv_switchExpression_2_0=ruleYExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYSwitchStatementRule());
              					}
              					set(
              						current,
              						"switchExpression",
              						lv_switchExpression_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_33); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYSwitchStatementAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalLang.g:1265:3: ( (lv_cases_4_0= ruleYSwitchCase ) )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==14||LA27_0==33) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // InternalLang.g:1266:4: (lv_cases_4_0= ruleYSwitchCase )
            	    {
            	    // InternalLang.g:1266:4: (lv_cases_4_0= ruleYSwitchCase )
            	    // InternalLang.g:1267:5: lv_cases_4_0= ruleYSwitchCase
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYSwitchStatementAccess().getCasesYSwitchCaseParserRuleCall_4_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_33);
            	    lv_cases_4_0=ruleYSwitchCase();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElementForParent(grammarAccess.getYSwitchStatementRule());
            	      					}
            	      					add(
            	      						current,
            	      						"cases",
            	      						lv_cases_4_0,
            	      						"eu.jgen.notes.dmw.lite.base.Lang.YSwitchCase");
            	      					afterParserOrEnumRuleCall();
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);

            // InternalLang.g:1284:3: (otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==32) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalLang.g:1285:4: otherlv_5= 'default' otherlv_6= ':' ( (lv_default_7_0= ruleYBlock ) )
                    {
                    otherlv_5=(Token)match(input,32,FOLLOW_12); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getYSwitchStatementAccess().getDefaultKeyword_5_0());
                      			
                    }
                    otherlv_6=(Token)match(input,14,FOLLOW_24); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_6, grammarAccess.getYSwitchStatementAccess().getColonKeyword_5_1());
                      			
                    }
                    // InternalLang.g:1293:4: ( (lv_default_7_0= ruleYBlock ) )
                    // InternalLang.g:1294:5: (lv_default_7_0= ruleYBlock )
                    {
                    // InternalLang.g:1294:5: (lv_default_7_0= ruleYBlock )
                    // InternalLang.g:1295:6: lv_default_7_0= ruleYBlock
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYSwitchStatementAccess().getDefaultYBlockParserRuleCall_5_2_0());
                      					
                    }
                    pushFollow(FOLLOW_34);
                    lv_default_7_0=ruleYBlock();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYSwitchStatementRule());
                      						}
                      						set(
                      							current,
                      							"default",
                      							lv_default_7_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_8=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getYSwitchStatementAccess().getRightCurlyBracketKeyword_6());
              		
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
    // $ANTLR end "ruleYSwitchStatement"


    // $ANTLR start "entryRuleYSwitchCase"
    // InternalLang.g:1321:1: entryRuleYSwitchCase returns [EObject current=null] : iv_ruleYSwitchCase= ruleYSwitchCase EOF ;
    public final EObject entryRuleYSwitchCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYSwitchCase = null;


        try {
            // InternalLang.g:1321:52: (iv_ruleYSwitchCase= ruleYSwitchCase EOF )
            // InternalLang.g:1322:2: iv_ruleYSwitchCase= ruleYSwitchCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYSwitchCaseRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYSwitchCase=ruleYSwitchCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYSwitchCase; 
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
    // $ANTLR end "entryRuleYSwitchCase"


    // $ANTLR start "ruleYSwitchCase"
    // InternalLang.g:1328:1: ruleYSwitchCase returns [EObject current=null] : ( () (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleYBlock ) ) ) ;
    public final EObject ruleYSwitchCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_caseExpression_2_0 = null;

        EObject lv_then_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1334:2: ( ( () (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleYBlock ) ) ) )
            // InternalLang.g:1335:2: ( () (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleYBlock ) ) )
            {
            // InternalLang.g:1335:2: ( () (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleYBlock ) ) )
            // InternalLang.g:1336:3: () (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )? otherlv_3= ':' ( (lv_then_4_0= ruleYBlock ) )
            {
            // InternalLang.g:1336:3: ()
            // InternalLang.g:1337:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYSwitchCaseAccess().getYSwitchCaseAction_0(),
              					current);
              			
            }

            }

            // InternalLang.g:1343:3: (otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==33) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // InternalLang.g:1344:4: otherlv_1= 'case' ( (lv_caseExpression_2_0= ruleYExpression ) )
                    {
                    otherlv_1=(Token)match(input,33,FOLLOW_32); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getYSwitchCaseAccess().getCaseKeyword_1_0());
                      			
                    }
                    // InternalLang.g:1348:4: ( (lv_caseExpression_2_0= ruleYExpression ) )
                    // InternalLang.g:1349:5: (lv_caseExpression_2_0= ruleYExpression )
                    {
                    // InternalLang.g:1349:5: (lv_caseExpression_2_0= ruleYExpression )
                    // InternalLang.g:1350:6: lv_caseExpression_2_0= ruleYExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYSwitchCaseAccess().getCaseExpressionYExpressionParserRuleCall_1_1_0());
                      					
                    }
                    pushFollow(FOLLOW_12);
                    lv_caseExpression_2_0=ruleYExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYSwitchCaseRule());
                      						}
                      						set(
                      							current,
                      							"caseExpression",
                      							lv_caseExpression_2_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_3=(Token)match(input,14,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYSwitchCaseAccess().getColonKeyword_2());
              		
            }
            // InternalLang.g:1372:3: ( (lv_then_4_0= ruleYBlock ) )
            // InternalLang.g:1373:4: (lv_then_4_0= ruleYBlock )
            {
            // InternalLang.g:1373:4: (lv_then_4_0= ruleYBlock )
            // InternalLang.g:1374:5: lv_then_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYSwitchCaseAccess().getThenYBlockParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_then_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYSwitchCaseRule());
              					}
              					set(
              						current,
              						"then",
              						lv_then_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYSwitchCase"


    // $ANTLR start "entryRuleYSymbol"
    // InternalLang.g:1395:1: entryRuleYSymbol returns [EObject current=null] : iv_ruleYSymbol= ruleYSymbol EOF ;
    public final EObject entryRuleYSymbol() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYSymbol = null;


        try {
            // InternalLang.g:1395:48: (iv_ruleYSymbol= ruleYSymbol EOF )
            // InternalLang.g:1396:2: iv_ruleYSymbol= ruleYSymbol EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYSymbolRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYSymbol=ruleYSymbol();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYSymbol; 
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
    // $ANTLR end "entryRuleYSymbol"


    // $ANTLR start "ruleYSymbol"
    // InternalLang.g:1402:1: ruleYSymbol returns [EObject current=null] : (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YParameter_1= ruleYParameter ) ;
    public final EObject ruleYSymbol() throws RecognitionException {
        EObject current = null;

        EObject this_YVariableDeclaration_0 = null;

        EObject this_YParameter_1 = null;



        	enterRule();

        try {
            // InternalLang.g:1408:2: ( (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YParameter_1= ruleYParameter ) )
            // InternalLang.g:1409:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YParameter_1= ruleYParameter )
            {
            // InternalLang.g:1409:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YParameter_1= ruleYParameter )
            int alt30=2;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // InternalLang.g:1410:3: this_YVariableDeclaration_0= ruleYVariableDeclaration
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYSymbolAccess().getYVariableDeclarationParserRuleCall_0());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YVariableDeclaration_0=ruleYVariableDeclaration();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YVariableDeclaration_0;
                      			afterParserOrEnumRuleCall();
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:1419:3: this_YParameter_1= ruleYParameter
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYSymbolAccess().getYParameterParserRuleCall_1());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YParameter_1=ruleYParameter();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YParameter_1;
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
    // $ANTLR end "ruleYSymbol"


    // $ANTLR start "entryRuleYExpression"
    // InternalLang.g:1431:1: entryRuleYExpression returns [EObject current=null] : iv_ruleYExpression= ruleYExpression EOF ;
    public final EObject entryRuleYExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYExpression = null;


        try {
            // InternalLang.g:1431:52: (iv_ruleYExpression= ruleYExpression EOF )
            // InternalLang.g:1432:2: iv_ruleYExpression= ruleYExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYExpression=ruleYExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYExpression; 
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
    // $ANTLR end "entryRuleYExpression"


    // $ANTLR start "ruleYExpression"
    // InternalLang.g:1438:1: ruleYExpression returns [EObject current=null] : this_YAssignment_0= ruleYAssignment ;
    public final EObject ruleYExpression() throws RecognitionException {
        EObject current = null;

        EObject this_YAssignment_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1444:2: (this_YAssignment_0= ruleYAssignment )
            // InternalLang.g:1445:2: this_YAssignment_0= ruleYAssignment
            {
            if ( state.backtracking==0 ) {

              		newCompositeNode(grammarAccess.getYExpressionAccess().getYAssignmentParserRuleCall());
              	
            }
            pushFollow(FOLLOW_2);
            this_YAssignment_0=ruleYAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current = this_YAssignment_0;
              		afterParserOrEnumRuleCall();
              	
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
    // $ANTLR end "ruleYExpression"


    // $ANTLR start "entryRuleYAssignment"
    // InternalLang.g:1456:1: entryRuleYAssignment returns [EObject current=null] : iv_ruleYAssignment= ruleYAssignment EOF ;
    public final EObject entryRuleYAssignment() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAssignment = null;


        try {
            // InternalLang.g:1456:52: (iv_ruleYAssignment= ruleYAssignment EOF )
            // InternalLang.g:1457:2: iv_ruleYAssignment= ruleYAssignment EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAssignmentRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAssignment=ruleYAssignment();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAssignment; 
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
    // $ANTLR end "entryRuleYAssignment"


    // $ANTLR start "ruleYAssignment"
    // InternalLang.g:1463:1: ruleYAssignment returns [EObject current=null] : (this_YSelectionExpression_0= ruleYSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )? ) ;
    public final EObject ruleYAssignment() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_YSelectionExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1469:2: ( (this_YSelectionExpression_0= ruleYSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )? ) )
            // InternalLang.g:1470:2: (this_YSelectionExpression_0= ruleYSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )? )
            {
            // InternalLang.g:1470:2: (this_YSelectionExpression_0= ruleYSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )? )
            // InternalLang.g:1471:3: this_YSelectionExpression_0= ruleYSelectionExpression ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYAssignmentAccess().getYSelectionExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_35);
            this_YSelectionExpression_0=ruleYSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YSelectionExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1479:3: ( () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) ) )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==27) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalLang.g:1480:4: () otherlv_2= '=' ( (lv_right_3_0= ruleYOrExpression ) )
                    {
                    // InternalLang.g:1480:4: ()
                    // InternalLang.g:1481:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElementAndSet(
                      						grammarAccess.getYAssignmentAccess().getYAssignmentLeftAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_2=(Token)match(input,27,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYAssignmentAccess().getEqualsSignKeyword_1_1());
                      			
                    }
                    // InternalLang.g:1491:4: ( (lv_right_3_0= ruleYOrExpression ) )
                    // InternalLang.g:1492:5: (lv_right_3_0= ruleYOrExpression )
                    {
                    // InternalLang.g:1492:5: (lv_right_3_0= ruleYOrExpression )
                    // InternalLang.g:1493:6: lv_right_3_0= ruleYOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAssignmentAccess().getRightYOrExpressionParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_right_3_0=ruleYOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYAssignmentRule());
                      						}
                      						set(
                      							current,
                      							"right",
                      							lv_right_3_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


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
    // $ANTLR end "ruleYAssignment"


    // $ANTLR start "entryRuleYSelectionExpression"
    // InternalLang.g:1515:1: entryRuleYSelectionExpression returns [EObject current=null] : iv_ruleYSelectionExpression= ruleYSelectionExpression EOF ;
    public final EObject entryRuleYSelectionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYSelectionExpression = null;


        try {
            // InternalLang.g:1515:61: (iv_ruleYSelectionExpression= ruleYSelectionExpression EOF )
            // InternalLang.g:1516:2: iv_ruleYSelectionExpression= ruleYSelectionExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYSelectionExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYSelectionExpression=ruleYSelectionExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYSelectionExpression; 
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
    // $ANTLR end "entryRuleYSelectionExpression"


    // $ANTLR start "ruleYSelectionExpression"
    // InternalLang.g:1522:1: ruleYSelectionExpression returns [EObject current=null] : (this_YTerminalExpression_0= ruleYTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )* ) ;
    public final EObject ruleYSelectionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_functioninvocation_4_0=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        EObject this_YTerminalExpression_0 = null;

        EObject lv_args_5_0 = null;

        EObject lv_args_7_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1528:2: ( (this_YTerminalExpression_0= ruleYTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )* ) )
            // InternalLang.g:1529:2: (this_YTerminalExpression_0= ruleYTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            {
            // InternalLang.g:1529:2: (this_YTerminalExpression_0= ruleYTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )* )
            // InternalLang.g:1530:3: this_YTerminalExpression_0= ruleYTerminalExpression ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYSelectionExpressionAccess().getYTerminalExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_YTerminalExpression_0=ruleYTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YTerminalExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1538:3: ( () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )? )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==34) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalLang.g:1539:4: () otherlv_2= '.' ( (otherlv_3= RULE_ID ) ) ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )?
            	    {
            	    // InternalLang.g:1539:4: ()
            	    // InternalLang.g:1540:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYSelectionExpressionAccess().getYMemberSelectionReceiverAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    otherlv_2=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getYSelectionExpressionAccess().getFullStopKeyword_1_1());
            	      			
            	    }
            	    // InternalLang.g:1550:4: ( (otherlv_3= RULE_ID ) )
            	    // InternalLang.g:1551:5: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLang.g:1551:5: (otherlv_3= RULE_ID )
            	    // InternalLang.g:1552:6: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getYSelectionExpressionRule());
            	      						}
            	      					
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_37); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_3, grammarAccess.getYSelectionExpressionAccess().getMemberYMemberCrossReference_1_2_0());
            	      					
            	    }

            	    }


            	    }

            	    // InternalLang.g:1563:4: ( ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')' )?
            	    int alt34=2;
            	    int LA34_0 = input.LA(1);

            	    if ( (LA34_0==24) ) {
            	        alt34=1;
            	    }
            	    switch (alt34) {
            	        case 1 :
            	            // InternalLang.g:1564:5: ( (lv_functioninvocation_4_0= '(' ) ) ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )? otherlv_8= ')'
            	            {
            	            // InternalLang.g:1564:5: ( (lv_functioninvocation_4_0= '(' ) )
            	            // InternalLang.g:1565:6: (lv_functioninvocation_4_0= '(' )
            	            {
            	            // InternalLang.g:1565:6: (lv_functioninvocation_4_0= '(' )
            	            // InternalLang.g:1566:7: lv_functioninvocation_4_0= '('
            	            {
            	            lv_functioninvocation_4_0=(Token)match(input,24,FOLLOW_38); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_functioninvocation_4_0, grammarAccess.getYSelectionExpressionAccess().getFunctioninvocationLeftParenthesisKeyword_1_3_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getYSelectionExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "functioninvocation", true, "(");
            	              						
            	            }

            	            }


            	            }

            	            // InternalLang.g:1578:5: ( ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )* )?
            	            int alt33=2;
            	            int LA33_0 = input.LA(1);

            	            if ( ((LA33_0>=RULE_INT && LA33_0<=RULE_ID)||LA33_0==24||(LA33_0>=45 && LA33_0<=51)) ) {
            	                alt33=1;
            	            }
            	            switch (alt33) {
            	                case 1 :
            	                    // InternalLang.g:1579:6: ( (lv_args_5_0= ruleYOrExpression ) ) (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )*
            	                    {
            	                    // InternalLang.g:1579:6: ( (lv_args_5_0= ruleYOrExpression ) )
            	                    // InternalLang.g:1580:7: (lv_args_5_0= ruleYOrExpression )
            	                    {
            	                    // InternalLang.g:1580:7: (lv_args_5_0= ruleYOrExpression )
            	                    // InternalLang.g:1581:8: lv_args_5_0= ruleYOrExpression
            	                    {
            	                    if ( state.backtracking==0 ) {

            	                      								newCompositeNode(grammarAccess.getYSelectionExpressionAccess().getArgsYOrExpressionParserRuleCall_1_3_1_0_0());
            	                      							
            	                    }
            	                    pushFollow(FOLLOW_23);
            	                    lv_args_5_0=ruleYOrExpression();

            	                    state._fsp--;
            	                    if (state.failed) return current;
            	                    if ( state.backtracking==0 ) {

            	                      								if (current==null) {
            	                      									current = createModelElementForParent(grammarAccess.getYSelectionExpressionRule());
            	                      								}
            	                      								add(
            	                      									current,
            	                      									"args",
            	                      									lv_args_5_0,
            	                      									"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
            	                      								afterParserOrEnumRuleCall();
            	                      							
            	                    }

            	                    }


            	                    }

            	                    // InternalLang.g:1598:6: (otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) ) )*
            	                    loop32:
            	                    do {
            	                        int alt32=2;
            	                        int LA32_0 = input.LA(1);

            	                        if ( (LA32_0==21) ) {
            	                            alt32=1;
            	                        }


            	                        switch (alt32) {
            	                    	case 1 :
            	                    	    // InternalLang.g:1599:7: otherlv_6= ',' ( (lv_args_7_0= ruleYOrExpression ) )
            	                    	    {
            	                    	    otherlv_6=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      							newLeafNode(otherlv_6, grammarAccess.getYSelectionExpressionAccess().getCommaKeyword_1_3_1_1_0());
            	                    	      						
            	                    	    }
            	                    	    // InternalLang.g:1603:7: ( (lv_args_7_0= ruleYOrExpression ) )
            	                    	    // InternalLang.g:1604:8: (lv_args_7_0= ruleYOrExpression )
            	                    	    {
            	                    	    // InternalLang.g:1604:8: (lv_args_7_0= ruleYOrExpression )
            	                    	    // InternalLang.g:1605:9: lv_args_7_0= ruleYOrExpression
            	                    	    {
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									newCompositeNode(grammarAccess.getYSelectionExpressionAccess().getArgsYOrExpressionParserRuleCall_1_3_1_1_1_0());
            	                    	      								
            	                    	    }
            	                    	    pushFollow(FOLLOW_23);
            	                    	    lv_args_7_0=ruleYOrExpression();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return current;
            	                    	    if ( state.backtracking==0 ) {

            	                    	      									if (current==null) {
            	                    	      										current = createModelElementForParent(grammarAccess.getYSelectionExpressionRule());
            	                    	      									}
            	                    	      									add(
            	                    	      										current,
            	                    	      										"args",
            	                    	      										lv_args_7_0,
            	                    	      										"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
            	                    	      									afterParserOrEnumRuleCall();
            	                    	      								
            	                    	    }

            	                    	    }


            	                    	    }


            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop32;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }

            	            otherlv_8=(Token)match(input,25,FOLLOW_36); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              					newLeafNode(otherlv_8, grammarAccess.getYSelectionExpressionAccess().getRightParenthesisKeyword_1_3_2());
            	              				
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop35;
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
    // $ANTLR end "ruleYSelectionExpression"


    // $ANTLR start "entryRuleYOrExpression"
    // InternalLang.g:1634:1: entryRuleYOrExpression returns [EObject current=null] : iv_ruleYOrExpression= ruleYOrExpression EOF ;
    public final EObject entryRuleYOrExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYOrExpression = null;


        try {
            // InternalLang.g:1634:54: (iv_ruleYOrExpression= ruleYOrExpression EOF )
            // InternalLang.g:1635:2: iv_ruleYOrExpression= ruleYOrExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYOrExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYOrExpression=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYOrExpression; 
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
    // $ANTLR end "entryRuleYOrExpression"


    // $ANTLR start "ruleYOrExpression"
    // InternalLang.g:1641:1: ruleYOrExpression returns [EObject current=null] : (this_YAndExpression_0= ruleYAndExpression ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )* ) ;
    public final EObject ruleYOrExpression() throws RecognitionException {
        EObject current = null;

        EObject this_YAndExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1647:2: ( (this_YAndExpression_0= ruleYAndExpression ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )* ) )
            // InternalLang.g:1648:2: (this_YAndExpression_0= ruleYAndExpression ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )* )
            {
            // InternalLang.g:1648:2: (this_YAndExpression_0= ruleYAndExpression ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )* )
            // InternalLang.g:1649:3: this_YAndExpression_0= ruleYAndExpression ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYOrExpressionAccess().getYAndExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_39);
            this_YAndExpression_0=ruleYAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YAndExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1657:3: ( () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) ) )*
            loop36:
            do {
                int alt36=2;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==35) ) {
                    alt36=1;
                }


                switch (alt36) {
            	case 1 :
            	    // InternalLang.g:1658:4: () ruleOpOr ( (lv_right_3_0= ruleYAndExpression ) )
            	    {
            	    // InternalLang.g:1658:4: ()
            	    // InternalLang.g:1659:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYOrExpressionAccess().getYOrExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getYOrExpressionAccess().getOpOrParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    ruleOpOr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalLang.g:1672:4: ( (lv_right_3_0= ruleYAndExpression ) )
            	    // InternalLang.g:1673:5: (lv_right_3_0= ruleYAndExpression )
            	    {
            	    // InternalLang.g:1673:5: (lv_right_3_0= ruleYAndExpression )
            	    // InternalLang.g:1674:6: lv_right_3_0= ruleYAndExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYOrExpressionAccess().getRightYAndExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_39);
            	    lv_right_3_0=ruleYAndExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYOrExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YAndExpression");
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
    // $ANTLR end "ruleYOrExpression"


    // $ANTLR start "entryRuleOpOr"
    // InternalLang.g:1696:1: entryRuleOpOr returns [String current=null] : iv_ruleOpOr= ruleOpOr EOF ;
    public final String entryRuleOpOr() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpOr = null;


        try {
            // InternalLang.g:1696:44: (iv_ruleOpOr= ruleOpOr EOF )
            // InternalLang.g:1697:2: iv_ruleOpOr= ruleOpOr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpOrRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpOr=ruleOpOr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpOr.getText(); 
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
    // $ANTLR end "entryRuleOpOr"


    // $ANTLR start "ruleOpOr"
    // InternalLang.g:1703:1: ruleOpOr returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '||' ;
    public final AntlrDatatypeRuleToken ruleOpOr() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:1709:2: (kw= '||' )
            // InternalLang.g:1710:2: kw= '||'
            {
            kw=(Token)match(input,35,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpOrAccess().getVerticalLineVerticalLineKeyword());
              	
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
    // $ANTLR end "ruleOpOr"


    // $ANTLR start "entryRuleYAndExpression"
    // InternalLang.g:1718:1: entryRuleYAndExpression returns [EObject current=null] : iv_ruleYAndExpression= ruleYAndExpression EOF ;
    public final EObject entryRuleYAndExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAndExpression = null;


        try {
            // InternalLang.g:1718:55: (iv_ruleYAndExpression= ruleYAndExpression EOF )
            // InternalLang.g:1719:2: iv_ruleYAndExpression= ruleYAndExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAndExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAndExpression=ruleYAndExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAndExpression; 
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
    // $ANTLR end "entryRuleYAndExpression"


    // $ANTLR start "ruleYAndExpression"
    // InternalLang.g:1725:1: ruleYAndExpression returns [EObject current=null] : (this_YEqualityExpression_0= ruleYEqualityExpression ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )* ) ;
    public final EObject ruleYAndExpression() throws RecognitionException {
        EObject current = null;

        EObject this_YEqualityExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1731:2: ( (this_YEqualityExpression_0= ruleYEqualityExpression ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )* ) )
            // InternalLang.g:1732:2: (this_YEqualityExpression_0= ruleYEqualityExpression ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )* )
            {
            // InternalLang.g:1732:2: (this_YEqualityExpression_0= ruleYEqualityExpression ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )* )
            // InternalLang.g:1733:3: this_YEqualityExpression_0= ruleYEqualityExpression ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYAndExpressionAccess().getYEqualityExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_40);
            this_YEqualityExpression_0=ruleYEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YEqualityExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1741:3: ( () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) ) )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==36) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // InternalLang.g:1742:4: () ruleOpAnd ( (lv_right_3_0= ruleYEqualityExpression ) )
            	    {
            	    // InternalLang.g:1742:4: ()
            	    // InternalLang.g:1743:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYAndExpressionAccess().getYAndExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getYAndExpressionAccess().getOpAndParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_28);
            	    ruleOpAnd();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				afterParserOrEnumRuleCall();
            	      			
            	    }
            	    // InternalLang.g:1756:4: ( (lv_right_3_0= ruleYEqualityExpression ) )
            	    // InternalLang.g:1757:5: (lv_right_3_0= ruleYEqualityExpression )
            	    {
            	    // InternalLang.g:1757:5: (lv_right_3_0= ruleYEqualityExpression )
            	    // InternalLang.g:1758:6: lv_right_3_0= ruleYEqualityExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYAndExpressionAccess().getRightYEqualityExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_40);
            	    lv_right_3_0=ruleYEqualityExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYAndExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YEqualityExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop37;
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
    // $ANTLR end "ruleYAndExpression"


    // $ANTLR start "entryRuleOpAnd"
    // InternalLang.g:1780:1: entryRuleOpAnd returns [String current=null] : iv_ruleOpAnd= ruleOpAnd EOF ;
    public final String entryRuleOpAnd() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpAnd = null;


        try {
            // InternalLang.g:1780:45: (iv_ruleOpAnd= ruleOpAnd EOF )
            // InternalLang.g:1781:2: iv_ruleOpAnd= ruleOpAnd EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpAndRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpAnd=ruleOpAnd();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpAnd.getText(); 
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
    // $ANTLR end "entryRuleOpAnd"


    // $ANTLR start "ruleOpAnd"
    // InternalLang.g:1787:1: ruleOpAnd returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : kw= '&&' ;
    public final AntlrDatatypeRuleToken ruleOpAnd() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:1793:2: (kw= '&&' )
            // InternalLang.g:1794:2: kw= '&&'
            {
            kw=(Token)match(input,36,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(kw);
              		newLeafNode(kw, grammarAccess.getOpAndAccess().getAmpersandAmpersandKeyword());
              	
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
    // $ANTLR end "ruleOpAnd"


    // $ANTLR start "entryRuleYEqualityExpression"
    // InternalLang.g:1802:1: entryRuleYEqualityExpression returns [EObject current=null] : iv_ruleYEqualityExpression= ruleYEqualityExpression EOF ;
    public final EObject entryRuleYEqualityExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYEqualityExpression = null;


        try {
            // InternalLang.g:1802:60: (iv_ruleYEqualityExpression= ruleYEqualityExpression EOF )
            // InternalLang.g:1803:2: iv_ruleYEqualityExpression= ruleYEqualityExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYEqualityExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYEqualityExpression=ruleYEqualityExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYEqualityExpression; 
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
    // $ANTLR end "entryRuleYEqualityExpression"


    // $ANTLR start "ruleYEqualityExpression"
    // InternalLang.g:1809:1: ruleYEqualityExpression returns [EObject current=null] : (this_YComparisonExpression_0= ruleYComparisonExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )* ) ;
    public final EObject ruleYEqualityExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_YComparisonExpression_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1815:2: ( (this_YComparisonExpression_0= ruleYComparisonExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )* ) )
            // InternalLang.g:1816:2: (this_YComparisonExpression_0= ruleYComparisonExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )* )
            {
            // InternalLang.g:1816:2: (this_YComparisonExpression_0= ruleYComparisonExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )* )
            // InternalLang.g:1817:3: this_YComparisonExpression_0= ruleYComparisonExpression ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYEqualityExpressionAccess().getYComparisonExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_41);
            this_YComparisonExpression_0=ruleYComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YComparisonExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1825:3: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) ) )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( ((LA39_0>=37 && LA39_0<=38)) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // InternalLang.g:1826:4: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleYComparisonExpression ) )
            	    {
            	    // InternalLang.g:1826:4: ()
            	    // InternalLang.g:1827:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYEqualityExpressionAccess().getYEqualityExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalLang.g:1833:4: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // InternalLang.g:1834:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // InternalLang.g:1834:5: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // InternalLang.g:1835:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // InternalLang.g:1835:6: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt38=2;
            	    int LA38_0 = input.LA(1);

            	    if ( (LA38_0==37) ) {
            	        alt38=1;
            	    }
            	    else if ( (LA38_0==38) ) {
            	        alt38=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 38, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt38) {
            	        case 1 :
            	            // InternalLang.g:1836:7: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,37,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getYEqualityExpressionAccess().getOpEqualsSignEqualsSignKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getYEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalLang.g:1847:7: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,38,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getYEqualityExpressionAccess().getOpExclamationMarkEqualsSignKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getYEqualityExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLang.g:1860:4: ( (lv_right_3_0= ruleYComparisonExpression ) )
            	    // InternalLang.g:1861:5: (lv_right_3_0= ruleYComparisonExpression )
            	    {
            	    // InternalLang.g:1861:5: (lv_right_3_0= ruleYComparisonExpression )
            	    // InternalLang.g:1862:6: lv_right_3_0= ruleYComparisonExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYEqualityExpressionAccess().getRightYComparisonExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_41);
            	    lv_right_3_0=ruleYComparisonExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYEqualityExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YComparisonExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop39;
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
    // $ANTLR end "ruleYEqualityExpression"


    // $ANTLR start "entryRuleYComparisonExpression"
    // InternalLang.g:1884:1: entryRuleYComparisonExpression returns [EObject current=null] : iv_ruleYComparisonExpression= ruleYComparisonExpression EOF ;
    public final EObject entryRuleYComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYComparisonExpression = null;


        try {
            // InternalLang.g:1884:62: (iv_ruleYComparisonExpression= ruleYComparisonExpression EOF )
            // InternalLang.g:1885:2: iv_ruleYComparisonExpression= ruleYComparisonExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYComparisonExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYComparisonExpression=ruleYComparisonExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYComparisonExpression; 
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
    // $ANTLR end "entryRuleYComparisonExpression"


    // $ANTLR start "ruleYComparisonExpression"
    // InternalLang.g:1891:1: ruleYComparisonExpression returns [EObject current=null] : (this_YAdditiveExpression_0= ruleYAdditiveExpression ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )* ) ;
    public final EObject ruleYComparisonExpression() throws RecognitionException {
        EObject current = null;

        EObject this_YAdditiveExpression_0 = null;

        AntlrDatatypeRuleToken lv_op_2_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:1897:2: ( (this_YAdditiveExpression_0= ruleYAdditiveExpression ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )* ) )
            // InternalLang.g:1898:2: (this_YAdditiveExpression_0= ruleYAdditiveExpression ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )* )
            {
            // InternalLang.g:1898:2: (this_YAdditiveExpression_0= ruleYAdditiveExpression ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )* )
            // InternalLang.g:1899:3: this_YAdditiveExpression_0= ruleYAdditiveExpression ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYComparisonExpressionAccess().getYAdditiveExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_42);
            this_YAdditiveExpression_0=ruleYAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YAdditiveExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:1907:3: ( () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) ) )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==20||LA40_0==22||(LA40_0>=39 && LA40_0<=40)) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalLang.g:1908:4: () ( (lv_op_2_0= ruleOpCompare ) ) ( (lv_right_3_0= ruleYAdditiveExpression ) )
            	    {
            	    // InternalLang.g:1908:4: ()
            	    // InternalLang.g:1909:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYComparisonExpressionAccess().getYComparisonExpressionLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalLang.g:1915:4: ( (lv_op_2_0= ruleOpCompare ) )
            	    // InternalLang.g:1916:5: (lv_op_2_0= ruleOpCompare )
            	    {
            	    // InternalLang.g:1916:5: (lv_op_2_0= ruleOpCompare )
            	    // InternalLang.g:1917:6: lv_op_2_0= ruleOpCompare
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYComparisonExpressionAccess().getOpOpCompareParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_28);
            	    lv_op_2_0=ruleOpCompare();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYComparisonExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"op",
            	      							lv_op_2_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.OpCompare");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }

            	    // InternalLang.g:1934:4: ( (lv_right_3_0= ruleYAdditiveExpression ) )
            	    // InternalLang.g:1935:5: (lv_right_3_0= ruleYAdditiveExpression )
            	    {
            	    // InternalLang.g:1935:5: (lv_right_3_0= ruleYAdditiveExpression )
            	    // InternalLang.g:1936:6: lv_right_3_0= ruleYAdditiveExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYComparisonExpressionAccess().getRightYAdditiveExpressionParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_42);
            	    lv_right_3_0=ruleYAdditiveExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYComparisonExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YAdditiveExpression");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
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
    // $ANTLR end "ruleYComparisonExpression"


    // $ANTLR start "entryRuleOpCompare"
    // InternalLang.g:1958:1: entryRuleOpCompare returns [String current=null] : iv_ruleOpCompare= ruleOpCompare EOF ;
    public final String entryRuleOpCompare() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleOpCompare = null;


        try {
            // InternalLang.g:1958:49: (iv_ruleOpCompare= ruleOpCompare EOF )
            // InternalLang.g:1959:2: iv_ruleOpCompare= ruleOpCompare EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOpCompareRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleOpCompare=ruleOpCompare();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOpCompare.getText(); 
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
    // $ANTLR end "entryRuleOpCompare"


    // $ANTLR start "ruleOpCompare"
    // InternalLang.g:1965:1: ruleOpCompare returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) ;
    public final AntlrDatatypeRuleToken ruleOpCompare() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;


        	enterRule();

        try {
            // InternalLang.g:1971:2: ( (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' ) )
            // InternalLang.g:1972:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            {
            // InternalLang.g:1972:2: (kw= '>=' | kw= '<=' | kw= '>' | kw= '<' )
            int alt41=4;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt41=1;
                }
                break;
            case 40:
                {
                alt41=2;
                }
                break;
            case 22:
                {
                alt41=3;
                }
                break;
            case 20:
                {
                alt41=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;
            }

            switch (alt41) {
                case 1 :
                    // InternalLang.g:1973:3: kw= '>='
                    {
                    kw=(Token)match(input,39,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignEqualsSignKeyword_0());
                      		
                    }

                    }
                    break;
                case 2 :
                    // InternalLang.g:1979:3: kw= '<='
                    {
                    kw=(Token)match(input,40,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignEqualsSignKeyword_1());
                      		
                    }

                    }
                    break;
                case 3 :
                    // InternalLang.g:1985:3: kw= '>'
                    {
                    kw=(Token)match(input,22,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getGreaterThanSignKeyword_2());
                      		
                    }

                    }
                    break;
                case 4 :
                    // InternalLang.g:1991:3: kw= '<'
                    {
                    kw=(Token)match(input,20,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current.merge(kw);
                      			newLeafNode(kw, grammarAccess.getOpCompareAccess().getLessThanSignKeyword_3());
                      		
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
    // $ANTLR end "ruleOpCompare"


    // $ANTLR start "entryRuleYAdditiveExpression"
    // InternalLang.g:2000:1: entryRuleYAdditiveExpression returns [EObject current=null] : iv_ruleYAdditiveExpression= ruleYAdditiveExpression EOF ;
    public final EObject entryRuleYAdditiveExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAdditiveExpression = null;


        try {
            // InternalLang.g:2000:60: (iv_ruleYAdditiveExpression= ruleYAdditiveExpression EOF )
            // InternalLang.g:2001:2: iv_ruleYAdditiveExpression= ruleYAdditiveExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAdditiveExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAdditiveExpression=ruleYAdditiveExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAdditiveExpression; 
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
    // $ANTLR end "entryRuleYAdditiveExpression"


    // $ANTLR start "ruleYAdditiveExpression"
    // InternalLang.g:2007:1: ruleYAdditiveExpression returns [EObject current=null] : (this_YMultiplicativeExpression_0= ruleYMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )* ) ;
    public final EObject ruleYAdditiveExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_YMultiplicativeExpression_0 = null;

        EObject lv_right_5_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2013:2: ( (this_YMultiplicativeExpression_0= ruleYMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )* ) )
            // InternalLang.g:2014:2: (this_YMultiplicativeExpression_0= ruleYMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )* )
            {
            // InternalLang.g:2014:2: (this_YMultiplicativeExpression_0= ruleYMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )* )
            // InternalLang.g:2015:3: this_YMultiplicativeExpression_0= ruleYMultiplicativeExpression ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYAdditiveExpressionAccess().getYMultiplicativeExpressionParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_43);
            this_YMultiplicativeExpression_0=ruleYMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YMultiplicativeExpression_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:2023:3: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) ) )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( ((LA43_0>=41 && LA43_0<=42)) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalLang.g:2024:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleYMultiplicativeExpression ) )
            	    {
            	    // InternalLang.g:2024:4: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt42=2;
            	    int LA42_0 = input.LA(1);

            	    if ( (LA42_0==41) ) {
            	        alt42=1;
            	    }
            	    else if ( (LA42_0==42) ) {
            	        alt42=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 42, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt42) {
            	        case 1 :
            	            // InternalLang.g:2025:5: ( () otherlv_2= '+' )
            	            {
            	            // InternalLang.g:2025:5: ( () otherlv_2= '+' )
            	            // InternalLang.g:2026:6: () otherlv_2= '+'
            	            {
            	            // InternalLang.g:2026:6: ()
            	            // InternalLang.g:2027:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getYAdditiveExpressionAccess().getYPlusLeftAction_1_0_0_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_2=(Token)match(input,41,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_2, grammarAccess.getYAdditiveExpressionAccess().getPlusSignKeyword_1_0_0_1());
            	              					
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // InternalLang.g:2039:5: ( () otherlv_4= '-' )
            	            {
            	            // InternalLang.g:2039:5: ( () otherlv_4= '-' )
            	            // InternalLang.g:2040:6: () otherlv_4= '-'
            	            {
            	            // InternalLang.g:2040:6: ()
            	            // InternalLang.g:2041:7: 
            	            {
            	            if ( state.backtracking==0 ) {

            	              							current = forceCreateModelElementAndSet(
            	              								grammarAccess.getYAdditiveExpressionAccess().getYMinusLeftAction_1_0_1_0(),
            	              								current);
            	              						
            	            }

            	            }

            	            otherlv_4=(Token)match(input,42,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              						newLeafNode(otherlv_4, grammarAccess.getYAdditiveExpressionAccess().getHyphenMinusKeyword_1_0_1_1());
            	              					
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // InternalLang.g:2053:4: ( (lv_right_5_0= ruleYMultiplicativeExpression ) )
            	    // InternalLang.g:2054:5: (lv_right_5_0= ruleYMultiplicativeExpression )
            	    {
            	    // InternalLang.g:2054:5: (lv_right_5_0= ruleYMultiplicativeExpression )
            	    // InternalLang.g:2055:6: lv_right_5_0= ruleYMultiplicativeExpression
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYAdditiveExpressionAccess().getRightYMultiplicativeExpressionParserRuleCall_1_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_43);
            	    lv_right_5_0=ruleYMultiplicativeExpression();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYAdditiveExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_5_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YMultiplicativeExpression");
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
    // $ANTLR end "ruleYAdditiveExpression"


    // $ANTLR start "entryRuleYMultiplicativeExpression"
    // InternalLang.g:2077:1: entryRuleYMultiplicativeExpression returns [EObject current=null] : iv_ruleYMultiplicativeExpression= ruleYMultiplicativeExpression EOF ;
    public final EObject entryRuleYMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYMultiplicativeExpression = null;


        try {
            // InternalLang.g:2077:66: (iv_ruleYMultiplicativeExpression= ruleYMultiplicativeExpression EOF )
            // InternalLang.g:2078:2: iv_ruleYMultiplicativeExpression= ruleYMultiplicativeExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYMultiplicativeExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYMultiplicativeExpression=ruleYMultiplicativeExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYMultiplicativeExpression; 
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
    // $ANTLR end "entryRuleYMultiplicativeExpression"


    // $ANTLR start "ruleYMultiplicativeExpression"
    // InternalLang.g:2084:1: ruleYMultiplicativeExpression returns [EObject current=null] : (this_YPrimary_0= ruleYPrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )* ) ;
    public final EObject ruleYMultiplicativeExpression() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_YPrimary_0 = null;

        EObject lv_right_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2090:2: ( (this_YPrimary_0= ruleYPrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )* ) )
            // InternalLang.g:2091:2: (this_YPrimary_0= ruleYPrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )* )
            {
            // InternalLang.g:2091:2: (this_YPrimary_0= ruleYPrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )* )
            // InternalLang.g:2092:3: this_YPrimary_0= ruleYPrimary ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getYMultiplicativeExpressionAccess().getYPrimaryParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_44);
            this_YPrimary_0=ruleYPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current = this_YPrimary_0;
              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:2100:3: ( () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) ) )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( ((LA45_0>=43 && LA45_0<=44)) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalLang.g:2101:4: () ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) ) ( (lv_right_3_0= ruleYPrimary ) )
            	    {
            	    // InternalLang.g:2101:4: ()
            	    // InternalLang.g:2102:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	      					current = forceCreateModelElementAndSet(
            	      						grammarAccess.getYMultiplicativeExpressionAccess().getYMulOrDivLeftAction_1_0(),
            	      						current);
            	      				
            	    }

            	    }

            	    // InternalLang.g:2108:4: ( ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) ) )
            	    // InternalLang.g:2109:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    {
            	    // InternalLang.g:2109:5: ( (lv_op_2_1= '*' | lv_op_2_2= '/' ) )
            	    // InternalLang.g:2110:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    {
            	    // InternalLang.g:2110:6: (lv_op_2_1= '*' | lv_op_2_2= '/' )
            	    int alt44=2;
            	    int LA44_0 = input.LA(1);

            	    if ( (LA44_0==43) ) {
            	        alt44=1;
            	    }
            	    else if ( (LA44_0==44) ) {
            	        alt44=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 44, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt44) {
            	        case 1 :
            	            // InternalLang.g:2111:7: lv_op_2_1= '*'
            	            {
            	            lv_op_2_1=(Token)match(input,43,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_1, grammarAccess.getYMultiplicativeExpressionAccess().getOpAsteriskKeyword_1_1_0_0());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getYMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_1, null);
            	              						
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // InternalLang.g:2122:7: lv_op_2_2= '/'
            	            {
            	            lv_op_2_2=(Token)match(input,44,FOLLOW_28); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              							newLeafNode(lv_op_2_2, grammarAccess.getYMultiplicativeExpressionAccess().getOpSolidusKeyword_1_1_0_1());
            	              						
            	            }
            	            if ( state.backtracking==0 ) {

            	              							if (current==null) {
            	              								current = createModelElement(grammarAccess.getYMultiplicativeExpressionRule());
            	              							}
            	              							setWithLastConsumed(current, "op", lv_op_2_2, null);
            	              						
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }

            	    // InternalLang.g:2135:4: ( (lv_right_3_0= ruleYPrimary ) )
            	    // InternalLang.g:2136:5: (lv_right_3_0= ruleYPrimary )
            	    {
            	    // InternalLang.g:2136:5: (lv_right_3_0= ruleYPrimary )
            	    // InternalLang.g:2137:6: lv_right_3_0= ruleYPrimary
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYMultiplicativeExpressionAccess().getRightYPrimaryParserRuleCall_1_2_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_44);
            	    lv_right_3_0=ruleYPrimary();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYMultiplicativeExpressionRule());
            	      						}
            	      						set(
            	      							current,
            	      							"right",
            	      							lv_right_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YPrimary");
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
    // $ANTLR end "ruleYMultiplicativeExpression"


    // $ANTLR start "entryRuleYPrimary"
    // InternalLang.g:2159:1: entryRuleYPrimary returns [EObject current=null] : iv_ruleYPrimary= ruleYPrimary EOF ;
    public final EObject entryRuleYPrimary() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYPrimary = null;


        try {
            // InternalLang.g:2159:49: (iv_ruleYPrimary= ruleYPrimary EOF )
            // InternalLang.g:2160:2: iv_ruleYPrimary= ruleYPrimary EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYPrimaryRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYPrimary=ruleYPrimary();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYPrimary; 
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
    // $ANTLR end "entryRuleYPrimary"


    // $ANTLR start "ruleYPrimary"
    // InternalLang.g:2166:1: ruleYPrimary returns [EObject current=null] : ( ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) ) | this_YSelectionExpression_7= ruleYSelectionExpression ) ;
    public final EObject ruleYPrimary() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_a_2_0 = null;

        EObject lv_expression_6_0 = null;

        EObject this_YSelectionExpression_7 = null;



        	enterRule();

        try {
            // InternalLang.g:2172:2: ( ( ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) ) | this_YSelectionExpression_7= ruleYSelectionExpression ) )
            // InternalLang.g:2173:2: ( ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) ) | this_YSelectionExpression_7= ruleYSelectionExpression )
            {
            // InternalLang.g:2173:2: ( ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' ) | ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) ) | this_YSelectionExpression_7= ruleYSelectionExpression )
            int alt46=3;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt46=1;
                }
                break;
            case 45:
                {
                alt46=2;
                }
                break;
            case RULE_INT:
            case RULE_STRING:
            case RULE_ID:
            case 46:
            case 47:
            case 48:
            case 49:
            case 50:
            case 51:
                {
                alt46=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;
            }

            switch (alt46) {
                case 1 :
                    // InternalLang.g:2174:3: ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' )
                    {
                    // InternalLang.g:2174:3: ( () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')' )
                    // InternalLang.g:2175:4: () otherlv_1= '(' ( (lv_a_2_0= ruleYOrExpression ) ) otherlv_3= ')'
                    {
                    // InternalLang.g:2175:4: ()
                    // InternalLang.g:2176:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYPrimaryAccess().getYParentiesAction_0_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_1=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_1, grammarAccess.getYPrimaryAccess().getLeftParenthesisKeyword_0_1());
                      			
                    }
                    // InternalLang.g:2186:4: ( (lv_a_2_0= ruleYOrExpression ) )
                    // InternalLang.g:2187:5: (lv_a_2_0= ruleYOrExpression )
                    {
                    // InternalLang.g:2187:5: (lv_a_2_0= ruleYOrExpression )
                    // InternalLang.g:2188:6: lv_a_2_0= ruleYOrExpression
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYPrimaryAccess().getAYOrExpressionParserRuleCall_0_2_0());
                      					
                    }
                    pushFollow(FOLLOW_30);
                    lv_a_2_0=ruleYOrExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"a",
                      							lv_a_2_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_3=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_3, grammarAccess.getYPrimaryAccess().getRightParenthesisKeyword_0_3());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:2211:3: ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) )
                    {
                    // InternalLang.g:2211:3: ( () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) ) )
                    // InternalLang.g:2212:4: () otherlv_5= '!' ( (lv_expression_6_0= ruleYPrimary ) )
                    {
                    // InternalLang.g:2212:4: ()
                    // InternalLang.g:2213:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYPrimaryAccess().getYNotAction_1_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_5=(Token)match(input,45,FOLLOW_28); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_5, grammarAccess.getYPrimaryAccess().getExclamationMarkKeyword_1_1());
                      			
                    }
                    // InternalLang.g:2223:4: ( (lv_expression_6_0= ruleYPrimary ) )
                    // InternalLang.g:2224:5: (lv_expression_6_0= ruleYPrimary )
                    {
                    // InternalLang.g:2224:5: (lv_expression_6_0= ruleYPrimary )
                    // InternalLang.g:2225:6: lv_expression_6_0= ruleYPrimary
                    {
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYPrimaryAccess().getExpressionYPrimaryParserRuleCall_1_2_0());
                      					
                    }
                    pushFollow(FOLLOW_2);
                    lv_expression_6_0=ruleYPrimary();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElementForParent(grammarAccess.getYPrimaryRule());
                      						}
                      						set(
                      							current,
                      							"expression",
                      							lv_expression_6_0,
                      							"eu.jgen.notes.dmw.lite.base.Lang.YPrimary");
                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:2244:3: this_YSelectionExpression_7= ruleYSelectionExpression
                    {
                    if ( state.backtracking==0 ) {

                      			newCompositeNode(grammarAccess.getYPrimaryAccess().getYSelectionExpressionParserRuleCall_2());
                      		
                    }
                    pushFollow(FOLLOW_2);
                    this_YSelectionExpression_7=ruleYSelectionExpression();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			current = this_YSelectionExpression_7;
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
    // $ANTLR end "ruleYPrimary"


    // $ANTLR start "entryRuleYTerminalExpression"
    // InternalLang.g:2256:1: entryRuleYTerminalExpression returns [EObject current=null] : iv_ruleYTerminalExpression= ruleYTerminalExpression EOF ;
    public final EObject entryRuleYTerminalExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYTerminalExpression = null;


        try {
            // InternalLang.g:2256:60: (iv_ruleYTerminalExpression= ruleYTerminalExpression EOF )
            // InternalLang.g:2257:2: iv_ruleYTerminalExpression= ruleYTerminalExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYTerminalExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYTerminalExpression=ruleYTerminalExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYTerminalExpression; 
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
    // $ANTLR end "entryRuleYTerminalExpression"


    // $ANTLR start "ruleYTerminalExpression"
    // InternalLang.g:2263:1: ruleYTerminalExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'self' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' ) ) ;
    public final EObject ruleYTerminalExpression() throws RecognitionException {
        EObject current = null;

        Token lv_value_1_0=null;
        Token lv_value_3_0=null;
        Token lv_value_5_1=null;
        Token lv_value_5_2=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        EObject lv_arguments_18_0 = null;

        EObject lv_arguments_20_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2269:2: ( ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'self' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' ) ) )
            // InternalLang.g:2270:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'self' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' ) )
            {
            // InternalLang.g:2270:2: ( ( () ( (lv_value_1_0= RULE_STRING ) ) ) | ( () ( (lv_value_3_0= RULE_INT ) ) ) | ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) ) | ( () otherlv_7= 'self' ) | ( () otherlv_9= 'super' ) | ( () otherlv_11= 'null' ) | ( () ( (otherlv_13= RULE_ID ) ) ) | ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' ) )
            int alt50=8;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt50=1;
                }
                break;
            case RULE_INT:
                {
                alt50=2;
                }
                break;
            case 46:
            case 47:
                {
                alt50=3;
                }
                break;
            case 48:
                {
                alt50=4;
                }
                break;
            case 49:
                {
                alt50=5;
                }
                break;
            case 50:
                {
                alt50=6;
                }
                break;
            case RULE_ID:
                {
                alt50=7;
                }
                break;
            case 51:
                {
                alt50=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 50, 0, input);

                throw nvae;
            }

            switch (alt50) {
                case 1 :
                    // InternalLang.g:2271:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    {
                    // InternalLang.g:2271:3: ( () ( (lv_value_1_0= RULE_STRING ) ) )
                    // InternalLang.g:2272:4: () ( (lv_value_1_0= RULE_STRING ) )
                    {
                    // InternalLang.g:2272:4: ()
                    // InternalLang.g:2273:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYStringConstantAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:2279:4: ( (lv_value_1_0= RULE_STRING ) )
                    // InternalLang.g:2280:5: (lv_value_1_0= RULE_STRING )
                    {
                    // InternalLang.g:2280:5: (lv_value_1_0= RULE_STRING )
                    // InternalLang.g:2281:6: lv_value_1_0= RULE_STRING
                    {
                    lv_value_1_0=(Token)match(input,RULE_STRING,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_1_0, grammarAccess.getYTerminalExpressionAccess().getValueSTRINGTerminalRuleCall_0_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_1_0,
                      							"org.eclipse.xtext.common.Terminals.STRING");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:2299:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    {
                    // InternalLang.g:2299:3: ( () ( (lv_value_3_0= RULE_INT ) ) )
                    // InternalLang.g:2300:4: () ( (lv_value_3_0= RULE_INT ) )
                    {
                    // InternalLang.g:2300:4: ()
                    // InternalLang.g:2301:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYIntConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:2307:4: ( (lv_value_3_0= RULE_INT ) )
                    // InternalLang.g:2308:5: (lv_value_3_0= RULE_INT )
                    {
                    // InternalLang.g:2308:5: (lv_value_3_0= RULE_INT )
                    // InternalLang.g:2309:6: lv_value_3_0= RULE_INT
                    {
                    lv_value_3_0=(Token)match(input,RULE_INT,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(lv_value_3_0, grammarAccess.getYTerminalExpressionAccess().getValueINTTerminalRuleCall_1_1_0());
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                      						}
                      						setWithLastConsumed(
                      							current,
                      							"value",
                      							lv_value_3_0,
                      							"org.eclipse.xtext.common.Terminals.INT");
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:2327:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    {
                    // InternalLang.g:2327:3: ( () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) ) )
                    // InternalLang.g:2328:4: () ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    {
                    // InternalLang.g:2328:4: ()
                    // InternalLang.g:2329:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYBoolConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:2335:4: ( ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) ) )
                    // InternalLang.g:2336:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    {
                    // InternalLang.g:2336:5: ( (lv_value_5_1= 'true' | lv_value_5_2= 'false' ) )
                    // InternalLang.g:2337:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    {
                    // InternalLang.g:2337:6: (lv_value_5_1= 'true' | lv_value_5_2= 'false' )
                    int alt47=2;
                    int LA47_0 = input.LA(1);

                    if ( (LA47_0==46) ) {
                        alt47=1;
                    }
                    else if ( (LA47_0==47) ) {
                        alt47=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 47, 0, input);

                        throw nvae;
                    }
                    switch (alt47) {
                        case 1 :
                            // InternalLang.g:2338:7: lv_value_5_1= 'true'
                            {
                            lv_value_5_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_1, grammarAccess.getYTerminalExpressionAccess().getValueTrueKeyword_2_1_0_0());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_1, null);
                              						
                            }

                            }
                            break;
                        case 2 :
                            // InternalLang.g:2349:7: lv_value_5_2= 'false'
                            {
                            lv_value_5_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							newLeafNode(lv_value_5_2, grammarAccess.getYTerminalExpressionAccess().getValueFalseKeyword_2_1_0_1());
                              						
                            }
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                              							}
                              							setWithLastConsumed(current, "value", lv_value_5_2, null);
                              						
                            }

                            }
                            break;

                    }


                    }


                    }


                    }


                    }
                    break;
                case 4 :
                    // InternalLang.g:2364:3: ( () otherlv_7= 'self' )
                    {
                    // InternalLang.g:2364:3: ( () otherlv_7= 'self' )
                    // InternalLang.g:2365:4: () otherlv_7= 'self'
                    {
                    // InternalLang.g:2365:4: ()
                    // InternalLang.g:2366:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYSelfAction_3_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_7=(Token)match(input,48,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getYTerminalExpressionAccess().getSelfKeyword_3_1());
                      			
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalLang.g:2378:3: ( () otherlv_9= 'super' )
                    {
                    // InternalLang.g:2378:3: ( () otherlv_9= 'super' )
                    // InternalLang.g:2379:4: () otherlv_9= 'super'
                    {
                    // InternalLang.g:2379:4: ()
                    // InternalLang.g:2380:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYSuperAction_4_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_9=(Token)match(input,49,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_9, grammarAccess.getYTerminalExpressionAccess().getSuperKeyword_4_1());
                      			
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalLang.g:2392:3: ( () otherlv_11= 'null' )
                    {
                    // InternalLang.g:2392:3: ( () otherlv_11= 'null' )
                    // InternalLang.g:2393:4: () otherlv_11= 'null'
                    {
                    // InternalLang.g:2393:4: ()
                    // InternalLang.g:2394:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYNullAction_5_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_11=(Token)match(input,50,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getYTerminalExpressionAccess().getNullKeyword_5_1());
                      			
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalLang.g:2406:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    {
                    // InternalLang.g:2406:3: ( () ( (otherlv_13= RULE_ID ) ) )
                    // InternalLang.g:2407:4: () ( (otherlv_13= RULE_ID ) )
                    {
                    // InternalLang.g:2407:4: ()
                    // InternalLang.g:2408:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYSymbolRefAction_6_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:2414:4: ( (otherlv_13= RULE_ID ) )
                    // InternalLang.g:2415:5: (otherlv_13= RULE_ID )
                    {
                    // InternalLang.g:2415:5: (otherlv_13= RULE_ID )
                    // InternalLang.g:2416:6: otherlv_13= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                      						}
                      					
                    }
                    otherlv_13=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_13, grammarAccess.getYTerminalExpressionAccess().getSymbolYSymbolCrossReference_6_1_0());
                      					
                    }

                    }


                    }


                    }


                    }
                    break;
                case 8 :
                    // InternalLang.g:2429:3: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' )
                    {
                    // InternalLang.g:2429:3: ( () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')' )
                    // InternalLang.g:2430:4: () otherlv_15= 'new' ( ( ruleQualifiedName ) ) otherlv_17= '(' ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )? otherlv_21= ')'
                    {
                    // InternalLang.g:2430:4: ()
                    // InternalLang.g:2431:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYTerminalExpressionAccess().getYNewAction_7_0(),
                      						current);
                      				
                    }

                    }

                    otherlv_15=(Token)match(input,51,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_15, grammarAccess.getYTerminalExpressionAccess().getNewKeyword_7_1());
                      			
                    }
                    // InternalLang.g:2441:4: ( ( ruleQualifiedName ) )
                    // InternalLang.g:2442:5: ( ruleQualifiedName )
                    {
                    // InternalLang.g:2442:5: ( ruleQualifiedName )
                    // InternalLang.g:2443:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYTerminalExpressionRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYTerminalExpressionAccess().getTypeYClassCrossReference_7_2_0());
                      					
                    }
                    pushFollow(FOLLOW_21);
                    ruleQualifiedName();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						afterParserOrEnumRuleCall();
                      					
                    }

                    }


                    }

                    otherlv_17=(Token)match(input,24,FOLLOW_38); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_17, grammarAccess.getYTerminalExpressionAccess().getLeftParenthesisKeyword_7_3());
                      			
                    }
                    // InternalLang.g:2461:4: ( ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )* )?
                    int alt49=2;
                    int LA49_0 = input.LA(1);

                    if ( ((LA49_0>=RULE_INT && LA49_0<=RULE_ID)||LA49_0==24||(LA49_0>=45 && LA49_0<=51)) ) {
                        alt49=1;
                    }
                    switch (alt49) {
                        case 1 :
                            // InternalLang.g:2462:5: ( (lv_arguments_18_0= ruleYOrExpression ) ) (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )*
                            {
                            // InternalLang.g:2462:5: ( (lv_arguments_18_0= ruleYOrExpression ) )
                            // InternalLang.g:2463:6: (lv_arguments_18_0= ruleYOrExpression )
                            {
                            // InternalLang.g:2463:6: (lv_arguments_18_0= ruleYOrExpression )
                            // InternalLang.g:2464:7: lv_arguments_18_0= ruleYOrExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYTerminalExpressionAccess().getArgumentsYOrExpressionParserRuleCall_7_4_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
                            lv_arguments_18_0=ruleYOrExpression();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              							if (current==null) {
                              								current = createModelElementForParent(grammarAccess.getYTerminalExpressionRule());
                              							}
                              							add(
                              								current,
                              								"arguments",
                              								lv_arguments_18_0,
                              								"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
                              							afterParserOrEnumRuleCall();
                              						
                            }

                            }


                            }

                            // InternalLang.g:2481:5: (otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) ) )*
                            loop48:
                            do {
                                int alt48=2;
                                int LA48_0 = input.LA(1);

                                if ( (LA48_0==21) ) {
                                    alt48=1;
                                }


                                switch (alt48) {
                            	case 1 :
                            	    // InternalLang.g:2482:6: otherlv_19= ',' ( (lv_arguments_20_0= ruleYOrExpression ) )
                            	    {
                            	    otherlv_19=(Token)match(input,21,FOLLOW_28); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_19, grammarAccess.getYTerminalExpressionAccess().getCommaKeyword_7_4_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:2486:6: ( (lv_arguments_20_0= ruleYOrExpression ) )
                            	    // InternalLang.g:2487:7: (lv_arguments_20_0= ruleYOrExpression )
                            	    {
                            	    // InternalLang.g:2487:7: (lv_arguments_20_0= ruleYOrExpression )
                            	    // InternalLang.g:2488:8: lv_arguments_20_0= ruleYOrExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYTerminalExpressionAccess().getArgumentsYOrExpressionParserRuleCall_7_4_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
                            	    lv_arguments_20_0=ruleYOrExpression();

                            	    state._fsp--;
                            	    if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      								if (current==null) {
                            	      									current = createModelElementForParent(grammarAccess.getYTerminalExpressionRule());
                            	      								}
                            	      								add(
                            	      									current,
                            	      									"arguments",
                            	      									lv_arguments_20_0,
                            	      									"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
                            	      								afterParserOrEnumRuleCall();
                            	      							
                            	    }

                            	    }


                            	    }


                            	    }
                            	    break;

                            	default :
                            	    break loop48;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_21=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_21, grammarAccess.getYTerminalExpressionAccess().getRightParenthesisKeyword_7_5());
                      			
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
    // $ANTLR end "ruleYTerminalExpression"


    // $ANTLR start "entryRuleYReadStatement"
    // InternalLang.g:2516:1: entryRuleYReadStatement returns [EObject current=null] : iv_ruleYReadStatement= ruleYReadStatement EOF ;
    public final EObject entryRuleYReadStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYReadStatement = null;


        try {
            // InternalLang.g:2516:55: (iv_ruleYReadStatement= ruleYReadStatement EOF )
            // InternalLang.g:2517:2: iv_ruleYReadStatement= ruleYReadStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYReadStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYReadStatement=ruleYReadStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYReadStatement; 
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
    // $ANTLR end "entryRuleYReadStatement"


    // $ANTLR start "ruleYReadStatement"
    // InternalLang.g:2523:1: ruleYReadStatement returns [EObject current=null] : (otherlv_0= 'db-read' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'success' ( (lv_success_7_0= ruleYBlock ) ) otherlv_8= 'not' otherlv_9= 'found' ( (lv_notfound_10_0= ruleYBlock ) ) ) ;
    public final EObject ruleYReadStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        EObject lv_structs_1_0 = null;

        EObject lv_structs_3_0 = null;

        EObject lv_joinclause_4_0 = null;

        EObject lv_whereclause_5_0 = null;

        EObject lv_success_7_0 = null;

        EObject lv_notfound_10_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2529:2: ( (otherlv_0= 'db-read' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'success' ( (lv_success_7_0= ruleYBlock ) ) otherlv_8= 'not' otherlv_9= 'found' ( (lv_notfound_10_0= ruleYBlock ) ) ) )
            // InternalLang.g:2530:2: (otherlv_0= 'db-read' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'success' ( (lv_success_7_0= ruleYBlock ) ) otherlv_8= 'not' otherlv_9= 'found' ( (lv_notfound_10_0= ruleYBlock ) ) )
            {
            // InternalLang.g:2530:2: (otherlv_0= 'db-read' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'success' ( (lv_success_7_0= ruleYBlock ) ) otherlv_8= 'not' otherlv_9= 'found' ( (lv_notfound_10_0= ruleYBlock ) ) )
            // InternalLang.g:2531:3: otherlv_0= 'db-read' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'success' ( (lv_success_7_0= ruleYBlock ) ) otherlv_8= 'not' otherlv_9= 'found' ( (lv_notfound_10_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,52,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYReadStatementAccess().getDbReadKeyword_0());
              		
            }
            // InternalLang.g:2535:3: ( (lv_structs_1_0= ruleYStructRefPair ) )
            // InternalLang.g:2536:4: (lv_structs_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:2536:4: (lv_structs_1_0= ruleYStructRefPair )
            // InternalLang.g:2537:5: lv_structs_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYReadStatementAccess().getStructsYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_45);
            lv_structs_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYReadStatementRule());
              					}
              					add(
              						current,
              						"structs",
              						lv_structs_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:2554:3: (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )*
            loop51:
            do {
                int alt51=2;
                int LA51_0 = input.LA(1);

                if ( (LA51_0==21) ) {
                    alt51=1;
                }


                switch (alt51) {
            	case 1 :
            	    // InternalLang.g:2555:4: otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getYReadStatementAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalLang.g:2559:4: ( (lv_structs_3_0= ruleYStructRefPair ) )
            	    // InternalLang.g:2560:5: (lv_structs_3_0= ruleYStructRefPair )
            	    {
            	    // InternalLang.g:2560:5: (lv_structs_3_0= ruleYStructRefPair )
            	    // InternalLang.g:2561:6: lv_structs_3_0= ruleYStructRefPair
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYReadStatementAccess().getStructsYStructRefPairParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_45);
            	    lv_structs_3_0=ruleYStructRefPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYReadStatementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"structs",
            	      							lv_structs_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop51;
                }
            } while (true);

            // InternalLang.g:2579:3: ( (lv_joinclause_4_0= ruleYJoin ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==67) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalLang.g:2580:4: (lv_joinclause_4_0= ruleYJoin )
                    {
                    // InternalLang.g:2580:4: (lv_joinclause_4_0= ruleYJoin )
                    // InternalLang.g:2581:5: lv_joinclause_4_0= ruleYJoin
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYReadStatementAccess().getJoinclauseYJoinParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_46);
                    lv_joinclause_4_0=ruleYJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYReadStatementRule());
                      					}
                      					set(
                      						current,
                      						"joinclause",
                      						lv_joinclause_4_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YJoin");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:2598:3: ( (lv_whereclause_5_0= ruleYWhere ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==68) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // InternalLang.g:2599:4: (lv_whereclause_5_0= ruleYWhere )
                    {
                    // InternalLang.g:2599:4: (lv_whereclause_5_0= ruleYWhere )
                    // InternalLang.g:2600:5: lv_whereclause_5_0= ruleYWhere
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYReadStatementAccess().getWhereclauseYWhereParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_47);
                    lv_whereclause_5_0=ruleYWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYReadStatementRule());
                      					}
                      					set(
                      						current,
                      						"whereclause",
                      						lv_whereclause_5_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YWhere");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYReadStatementAccess().getSuccessKeyword_5());
              		
            }
            // InternalLang.g:2621:3: ( (lv_success_7_0= ruleYBlock ) )
            // InternalLang.g:2622:4: (lv_success_7_0= ruleYBlock )
            {
            // InternalLang.g:2622:4: (lv_success_7_0= ruleYBlock )
            // InternalLang.g:2623:5: lv_success_7_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYReadStatementAccess().getSuccessYBlockParserRuleCall_6_0());
              				
            }
            pushFollow(FOLLOW_48);
            lv_success_7_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYReadStatementRule());
              					}
              					set(
              						current,
              						"success",
              						lv_success_7_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_8=(Token)match(input,54,FOLLOW_49); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getYReadStatementAccess().getNotKeyword_7());
              		
            }
            otherlv_9=(Token)match(input,55,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_9, grammarAccess.getYReadStatementAccess().getFoundKeyword_8());
              		
            }
            // InternalLang.g:2648:3: ( (lv_notfound_10_0= ruleYBlock ) )
            // InternalLang.g:2649:4: (lv_notfound_10_0= ruleYBlock )
            {
            // InternalLang.g:2649:4: (lv_notfound_10_0= ruleYBlock )
            // InternalLang.g:2650:5: lv_notfound_10_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYReadStatementAccess().getNotfoundYBlockParserRuleCall_9_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_notfound_10_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYReadStatementRule());
              					}
              					set(
              						current,
              						"notfound",
              						lv_notfound_10_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYReadStatement"


    // $ANTLR start "entryRuleYReadEachStatement"
    // InternalLang.g:2671:1: entryRuleYReadEachStatement returns [EObject current=null] : iv_ruleYReadEachStatement= ruleYReadEachStatement EOF ;
    public final EObject entryRuleYReadEachStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYReadEachStatement = null;


        try {
            // InternalLang.g:2671:59: (iv_ruleYReadEachStatement= ruleYReadEachStatement EOF )
            // InternalLang.g:2672:2: iv_ruleYReadEachStatement= ruleYReadEachStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYReadEachStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYReadEachStatement=ruleYReadEachStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYReadEachStatement; 
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
    // $ANTLR end "entryRuleYReadEachStatement"


    // $ANTLR start "ruleYReadEachStatement"
    // InternalLang.g:2678:1: ruleYReadEachStatement returns [EObject current=null] : (otherlv_0= 'db-read-each' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) ( (lv_success_8_0= ruleYBlock ) ) ) ;
    public final EObject ruleYReadEachStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        EObject lv_structs_1_0 = null;

        EObject lv_structs_3_0 = null;

        EObject lv_joinclause_4_0 = null;

        EObject lv_whereclause_5_0 = null;

        EObject lv_success_8_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2684:2: ( (otherlv_0= 'db-read-each' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) ( (lv_success_8_0= ruleYBlock ) ) ) )
            // InternalLang.g:2685:2: (otherlv_0= 'db-read-each' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) ( (lv_success_8_0= ruleYBlock ) ) )
            {
            // InternalLang.g:2685:2: (otherlv_0= 'db-read-each' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) ( (lv_success_8_0= ruleYBlock ) ) )
            // InternalLang.g:2686:3: otherlv_0= 'db-read-each' ( (lv_structs_1_0= ruleYStructRefPair ) ) (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )* ( (lv_joinclause_4_0= ruleYJoin ) )? ( (lv_whereclause_5_0= ruleYWhere ) )? otherlv_6= 'target' ( (otherlv_7= RULE_ID ) ) ( (lv_success_8_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,56,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYReadEachStatementAccess().getDbReadEachKeyword_0());
              		
            }
            // InternalLang.g:2690:3: ( (lv_structs_1_0= ruleYStructRefPair ) )
            // InternalLang.g:2691:4: (lv_structs_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:2691:4: (lv_structs_1_0= ruleYStructRefPair )
            // InternalLang.g:2692:5: lv_structs_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYReadEachStatementAccess().getStructsYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_50);
            lv_structs_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYReadEachStatementRule());
              					}
              					add(
              						current,
              						"structs",
              						lv_structs_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:2709:3: (otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==21) ) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // InternalLang.g:2710:4: otherlv_2= ',' ( (lv_structs_3_0= ruleYStructRefPair ) )
            	    {
            	    otherlv_2=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_2, grammarAccess.getYReadEachStatementAccess().getCommaKeyword_2_0());
            	      			
            	    }
            	    // InternalLang.g:2714:4: ( (lv_structs_3_0= ruleYStructRefPair ) )
            	    // InternalLang.g:2715:5: (lv_structs_3_0= ruleYStructRefPair )
            	    {
            	    // InternalLang.g:2715:5: (lv_structs_3_0= ruleYStructRefPair )
            	    // InternalLang.g:2716:6: lv_structs_3_0= ruleYStructRefPair
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYReadEachStatementAccess().getStructsYStructRefPairParserRuleCall_2_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_50);
            	    lv_structs_3_0=ruleYStructRefPair();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYReadEachStatementRule());
            	      						}
            	      						add(
            	      							current,
            	      							"structs",
            	      							lv_structs_3_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);

            // InternalLang.g:2734:3: ( (lv_joinclause_4_0= ruleYJoin ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==67) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // InternalLang.g:2735:4: (lv_joinclause_4_0= ruleYJoin )
                    {
                    // InternalLang.g:2735:4: (lv_joinclause_4_0= ruleYJoin )
                    // InternalLang.g:2736:5: lv_joinclause_4_0= ruleYJoin
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYReadEachStatementAccess().getJoinclauseYJoinParserRuleCall_3_0());
                      				
                    }
                    pushFollow(FOLLOW_51);
                    lv_joinclause_4_0=ruleYJoin();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYReadEachStatementRule());
                      					}
                      					set(
                      						current,
                      						"joinclause",
                      						lv_joinclause_4_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YJoin");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            // InternalLang.g:2753:3: ( (lv_whereclause_5_0= ruleYWhere ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==68) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // InternalLang.g:2754:4: (lv_whereclause_5_0= ruleYWhere )
                    {
                    // InternalLang.g:2754:4: (lv_whereclause_5_0= ruleYWhere )
                    // InternalLang.g:2755:5: lv_whereclause_5_0= ruleYWhere
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYReadEachStatementAccess().getWhereclauseYWhereParserRuleCall_4_0());
                      				
                    }
                    pushFollow(FOLLOW_52);
                    lv_whereclause_5_0=ruleYWhere();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					if (current==null) {
                      						current = createModelElementForParent(grammarAccess.getYReadEachStatementRule());
                      					}
                      					set(
                      						current,
                      						"whereclause",
                      						lv_whereclause_5_0,
                      						"eu.jgen.notes.dmw.lite.base.Lang.YWhere");
                      					afterParserOrEnumRuleCall();
                      				
                    }

                    }


                    }
                    break;

            }

            otherlv_6=(Token)match(input,57,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYReadEachStatementAccess().getTargetKeyword_5());
              		
            }
            // InternalLang.g:2776:3: ( (otherlv_7= RULE_ID ) )
            // InternalLang.g:2777:4: (otherlv_7= RULE_ID )
            {
            // InternalLang.g:2777:4: (otherlv_7= RULE_ID )
            // InternalLang.g:2778:5: otherlv_7= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYReadEachStatementRule());
              					}
              				
            }
            otherlv_7=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_7, grammarAccess.getYReadEachStatementAccess().getTargetYPropertyCrossReference_6_0());
              				
            }

            }


            }

            // InternalLang.g:2789:3: ( (lv_success_8_0= ruleYBlock ) )
            // InternalLang.g:2790:4: (lv_success_8_0= ruleYBlock )
            {
            // InternalLang.g:2790:4: (lv_success_8_0= ruleYBlock )
            // InternalLang.g:2791:5: lv_success_8_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYReadEachStatementAccess().getSuccessYBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_success_8_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYReadEachStatementRule());
              					}
              					set(
              						current,
              						"success",
              						lv_success_8_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYReadEachStatement"


    // $ANTLR start "entryRuleYCreateStatement"
    // InternalLang.g:2812:1: entryRuleYCreateStatement returns [EObject current=null] : iv_ruleYCreateStatement= ruleYCreateStatement EOF ;
    public final EObject entryRuleYCreateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYCreateStatement = null;


        try {
            // InternalLang.g:2812:57: (iv_ruleYCreateStatement= ruleYCreateStatement EOF )
            // InternalLang.g:2813:2: iv_ruleYCreateStatement= ruleYCreateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYCreateStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYCreateStatement=ruleYCreateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYCreateStatement; 
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
    // $ANTLR end "entryRuleYCreateStatement"


    // $ANTLR start "ruleYCreateStatement"
    // InternalLang.g:2819:1: ruleYCreateStatement returns [EObject current=null] : (otherlv_0= 'db-create' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) otherlv_5= 'already' otherlv_6= 'exist' ( (lv_alreadyExist_7_0= ruleYBlock ) ) ) ;
    public final EObject ruleYCreateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        EObject lv_struct_1_0 = null;

        EObject lv_setBlock_2_0 = null;

        EObject lv_success_4_0 = null;

        EObject lv_alreadyExist_7_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2825:2: ( (otherlv_0= 'db-create' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) otherlv_5= 'already' otherlv_6= 'exist' ( (lv_alreadyExist_7_0= ruleYBlock ) ) ) )
            // InternalLang.g:2826:2: (otherlv_0= 'db-create' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) otherlv_5= 'already' otherlv_6= 'exist' ( (lv_alreadyExist_7_0= ruleYBlock ) ) )
            {
            // InternalLang.g:2826:2: (otherlv_0= 'db-create' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) otherlv_5= 'already' otherlv_6= 'exist' ( (lv_alreadyExist_7_0= ruleYBlock ) ) )
            // InternalLang.g:2827:3: otherlv_0= 'db-create' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) otherlv_5= 'already' otherlv_6= 'exist' ( (lv_alreadyExist_7_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYCreateStatementAccess().getDbCreateKeyword_0());
              		
            }
            // InternalLang.g:2831:3: ( (lv_struct_1_0= ruleYStructRefPair ) )
            // InternalLang.g:2832:4: (lv_struct_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:2832:4: (lv_struct_1_0= ruleYStructRefPair )
            // InternalLang.g:2833:5: lv_struct_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYCreateStatementAccess().getStructYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_struct_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYCreateStatementRule());
              					}
              					set(
              						current,
              						"struct",
              						lv_struct_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:2850:3: ( (lv_setBlock_2_0= ruleYBlock ) )
            // InternalLang.g:2851:4: (lv_setBlock_2_0= ruleYBlock )
            {
            // InternalLang.g:2851:4: (lv_setBlock_2_0= ruleYBlock )
            // InternalLang.g:2852:5: lv_setBlock_2_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYCreateStatementAccess().getSetBlockYBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_setBlock_2_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYCreateStatementRule());
              					}
              					set(
              						current,
              						"setBlock",
              						lv_setBlock_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYCreateStatementAccess().getSuccessKeyword_3());
              		
            }
            // InternalLang.g:2873:3: ( (lv_success_4_0= ruleYBlock ) )
            // InternalLang.g:2874:4: (lv_success_4_0= ruleYBlock )
            {
            // InternalLang.g:2874:4: (lv_success_4_0= ruleYBlock )
            // InternalLang.g:2875:5: lv_success_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYCreateStatementAccess().getSuccessYBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_53);
            lv_success_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYCreateStatementRule());
              					}
              					set(
              						current,
              						"success",
              						lv_success_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,59,FOLLOW_54); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYCreateStatementAccess().getAlreadyKeyword_5());
              		
            }
            otherlv_6=(Token)match(input,60,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYCreateStatementAccess().getExistKeyword_6());
              		
            }
            // InternalLang.g:2900:3: ( (lv_alreadyExist_7_0= ruleYBlock ) )
            // InternalLang.g:2901:4: (lv_alreadyExist_7_0= ruleYBlock )
            {
            // InternalLang.g:2901:4: (lv_alreadyExist_7_0= ruleYBlock )
            // InternalLang.g:2902:5: lv_alreadyExist_7_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYCreateStatementAccess().getAlreadyExistYBlockParserRuleCall_7_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_alreadyExist_7_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYCreateStatementRule());
              					}
              					set(
              						current,
              						"alreadyExist",
              						lv_alreadyExist_7_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYCreateStatement"


    // $ANTLR start "entryRuleYUpdateStatement"
    // InternalLang.g:2923:1: entryRuleYUpdateStatement returns [EObject current=null] : iv_ruleYUpdateStatement= ruleYUpdateStatement EOF ;
    public final EObject entryRuleYUpdateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYUpdateStatement = null;


        try {
            // InternalLang.g:2923:57: (iv_ruleYUpdateStatement= ruleYUpdateStatement EOF )
            // InternalLang.g:2924:2: iv_ruleYUpdateStatement= ruleYUpdateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYUpdateStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYUpdateStatement=ruleYUpdateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYUpdateStatement; 
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
    // $ANTLR end "entryRuleYUpdateStatement"


    // $ANTLR start "ruleYUpdateStatement"
    // InternalLang.g:2930:1: ruleYUpdateStatement returns [EObject current=null] : (otherlv_0= 'db-update' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) ) ;
    public final EObject ruleYUpdateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_3=null;
        EObject lv_struct_1_0 = null;

        EObject lv_setBlock_2_0 = null;

        EObject lv_success_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:2936:2: ( (otherlv_0= 'db-update' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) ) )
            // InternalLang.g:2937:2: (otherlv_0= 'db-update' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) )
            {
            // InternalLang.g:2937:2: (otherlv_0= 'db-update' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) ) )
            // InternalLang.g:2938:3: otherlv_0= 'db-update' ( (lv_struct_1_0= ruleYStructRefPair ) ) ( (lv_setBlock_2_0= ruleYBlock ) ) otherlv_3= 'success' ( (lv_success_4_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,61,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYUpdateStatementAccess().getDbUpdateKeyword_0());
              		
            }
            // InternalLang.g:2942:3: ( (lv_struct_1_0= ruleYStructRefPair ) )
            // InternalLang.g:2943:4: (lv_struct_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:2943:4: (lv_struct_1_0= ruleYStructRefPair )
            // InternalLang.g:2944:5: lv_struct_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYUpdateStatementAccess().getStructYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_24);
            lv_struct_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYUpdateStatementRule());
              					}
              					set(
              						current,
              						"struct",
              						lv_struct_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:2961:3: ( (lv_setBlock_2_0= ruleYBlock ) )
            // InternalLang.g:2962:4: (lv_setBlock_2_0= ruleYBlock )
            {
            // InternalLang.g:2962:4: (lv_setBlock_2_0= ruleYBlock )
            // InternalLang.g:2963:5: lv_setBlock_2_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYUpdateStatementAccess().getSetBlockYBlockParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_47);
            lv_setBlock_2_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYUpdateStatementRule());
              					}
              					set(
              						current,
              						"setBlock",
              						lv_setBlock_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,53,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYUpdateStatementAccess().getSuccessKeyword_3());
              		
            }
            // InternalLang.g:2984:3: ( (lv_success_4_0= ruleYBlock ) )
            // InternalLang.g:2985:4: (lv_success_4_0= ruleYBlock )
            {
            // InternalLang.g:2985:4: (lv_success_4_0= ruleYBlock )
            // InternalLang.g:2986:5: lv_success_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYUpdateStatementAccess().getSuccessYBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_success_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYUpdateStatementRule());
              					}
              					set(
              						current,
              						"success",
              						lv_success_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYUpdateStatement"


    // $ANTLR start "entryRuleYDeleteStatement"
    // InternalLang.g:3007:1: entryRuleYDeleteStatement returns [EObject current=null] : iv_ruleYDeleteStatement= ruleYDeleteStatement EOF ;
    public final EObject entryRuleYDeleteStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYDeleteStatement = null;


        try {
            // InternalLang.g:3007:57: (iv_ruleYDeleteStatement= ruleYDeleteStatement EOF )
            // InternalLang.g:3008:2: iv_ruleYDeleteStatement= ruleYDeleteStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYDeleteStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYDeleteStatement=ruleYDeleteStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYDeleteStatement; 
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
    // $ANTLR end "entryRuleYDeleteStatement"


    // $ANTLR start "ruleYDeleteStatement"
    // InternalLang.g:3014:1: ruleYDeleteStatement returns [EObject current=null] : (otherlv_0= 'db-delete' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= ';' ) ;
    public final EObject ruleYDeleteStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject lv_struct_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3020:2: ( (otherlv_0= 'db-delete' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= ';' ) )
            // InternalLang.g:3021:2: (otherlv_0= 'db-delete' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= ';' )
            {
            // InternalLang.g:3021:2: (otherlv_0= 'db-delete' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= ';' )
            // InternalLang.g:3022:3: otherlv_0= 'db-delete' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,62,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYDeleteStatementAccess().getDbDeleteKeyword_0());
              		
            }
            // InternalLang.g:3026:3: ( (lv_struct_1_0= ruleYStructRefPair ) )
            // InternalLang.g:3027:4: (lv_struct_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:3027:4: (lv_struct_1_0= ruleYStructRefPair )
            // InternalLang.g:3028:5: lv_struct_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYDeleteStatementAccess().getStructYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_struct_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYDeleteStatementRule());
              					}
              					set(
              						current,
              						"struct",
              						lv_struct_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYDeleteStatementAccess().getSemicolonKeyword_2());
              		
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
    // $ANTLR end "ruleYDeleteStatement"


    // $ANTLR start "entryRuleYAssociateStatement"
    // InternalLang.g:3053:1: entryRuleYAssociateStatement returns [EObject current=null] : iv_ruleYAssociateStatement= ruleYAssociateStatement EOF ;
    public final EObject entryRuleYAssociateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAssociateStatement = null;


        try {
            // InternalLang.g:3053:60: (iv_ruleYAssociateStatement= ruleYAssociateStatement EOF )
            // InternalLang.g:3054:2: iv_ruleYAssociateStatement= ruleYAssociateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYAssociateStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYAssociateStatement=ruleYAssociateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYAssociateStatement; 
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
    // $ANTLR end "entryRuleYAssociateStatement"


    // $ANTLR start "ruleYAssociateStatement"
    // InternalLang.g:3060:1: ruleYAssociateStatement returns [EObject current=null] : (otherlv_0= 'db-associate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'with' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' ) ;
    public final EObject ruleYAssociateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_struct_1_0 = null;

        EObject lv_joinref_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3066:2: ( (otherlv_0= 'db-associate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'with' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' ) )
            // InternalLang.g:3067:2: (otherlv_0= 'db-associate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'with' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' )
            {
            // InternalLang.g:3067:2: (otherlv_0= 'db-associate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'with' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' )
            // InternalLang.g:3068:3: otherlv_0= 'db-associate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'with' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,63,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYAssociateStatementAccess().getDbAssociateKeyword_0());
              		
            }
            // InternalLang.g:3072:3: ( (lv_struct_1_0= ruleYStructRefPair ) )
            // InternalLang.g:3073:4: (lv_struct_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:3073:4: (lv_struct_1_0= ruleYStructRefPair )
            // InternalLang.g:3074:5: lv_struct_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAssociateStatementAccess().getStructYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_55);
            lv_struct_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAssociateStatementRule());
              					}
              					set(
              						current,
              						"struct",
              						lv_struct_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,64,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAssociateStatementAccess().getWithKeyword_2());
              		
            }
            // InternalLang.g:3095:3: ( (lv_joinref_3_0= ruleYJoinDef ) )
            // InternalLang.g:3096:4: (lv_joinref_3_0= ruleYJoinDef )
            {
            // InternalLang.g:3096:4: (lv_joinref_3_0= ruleYJoinDef )
            // InternalLang.g:3097:5: lv_joinref_3_0= ruleYJoinDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAssociateStatementAccess().getJoinrefYJoinDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_joinref_3_0=ruleYJoinDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYAssociateStatementRule());
              					}
              					set(
              						current,
              						"joinref",
              						lv_joinref_3_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YJoinDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYAssociateStatementAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleYAssociateStatement"


    // $ANTLR start "entryRuleYDisassociateStatement"
    // InternalLang.g:3122:1: entryRuleYDisassociateStatement returns [EObject current=null] : iv_ruleYDisassociateStatement= ruleYDisassociateStatement EOF ;
    public final EObject entryRuleYDisassociateStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYDisassociateStatement = null;


        try {
            // InternalLang.g:3122:63: (iv_ruleYDisassociateStatement= ruleYDisassociateStatement EOF )
            // InternalLang.g:3123:2: iv_ruleYDisassociateStatement= ruleYDisassociateStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYDisassociateStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYDisassociateStatement=ruleYDisassociateStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYDisassociateStatement; 
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
    // $ANTLR end "entryRuleYDisassociateStatement"


    // $ANTLR start "ruleYDisassociateStatement"
    // InternalLang.g:3129:1: ruleYDisassociateStatement returns [EObject current=null] : (otherlv_0= 'db-disassociate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'from' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' ) ;
    public final EObject ruleYDisassociateStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_struct_1_0 = null;

        EObject lv_joinref_3_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3135:2: ( (otherlv_0= 'db-disassociate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'from' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' ) )
            // InternalLang.g:3136:2: (otherlv_0= 'db-disassociate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'from' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' )
            {
            // InternalLang.g:3136:2: (otherlv_0= 'db-disassociate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'from' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';' )
            // InternalLang.g:3137:3: otherlv_0= 'db-disassociate' ( (lv_struct_1_0= ruleYStructRefPair ) ) otherlv_2= 'from' ( (lv_joinref_3_0= ruleYJoinDef ) ) otherlv_4= ';'
            {
            otherlv_0=(Token)match(input,65,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYDisassociateStatementAccess().getDbDisassociateKeyword_0());
              		
            }
            // InternalLang.g:3141:3: ( (lv_struct_1_0= ruleYStructRefPair ) )
            // InternalLang.g:3142:4: (lv_struct_1_0= ruleYStructRefPair )
            {
            // InternalLang.g:3142:4: (lv_struct_1_0= ruleYStructRefPair )
            // InternalLang.g:3143:5: lv_struct_1_0= ruleYStructRefPair
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYDisassociateStatementAccess().getStructYStructRefPairParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_56);
            lv_struct_1_0=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYDisassociateStatementRule());
              					}
              					set(
              						current,
              						"struct",
              						lv_struct_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YStructRefPair");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,66,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYDisassociateStatementAccess().getFromKeyword_2());
              		
            }
            // InternalLang.g:3164:3: ( (lv_joinref_3_0= ruleYJoinDef ) )
            // InternalLang.g:3165:4: (lv_joinref_3_0= ruleYJoinDef )
            {
            // InternalLang.g:3165:4: (lv_joinref_3_0= ruleYJoinDef )
            // InternalLang.g:3166:5: lv_joinref_3_0= ruleYJoinDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYDisassociateStatementAccess().getJoinrefYJoinDefParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_17);
            lv_joinref_3_0=ruleYJoinDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYDisassociateStatementRule());
              					}
              					set(
              						current,
              						"joinref",
              						lv_joinref_3_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YJoinDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_4=(Token)match(input,12,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYDisassociateStatementAccess().getSemicolonKeyword_4());
              		
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
    // $ANTLR end "ruleYDisassociateStatement"


    // $ANTLR start "entryRuleYStructRefPair"
    // InternalLang.g:3191:1: entryRuleYStructRefPair returns [EObject current=null] : iv_ruleYStructRefPair= ruleYStructRefPair EOF ;
    public final EObject entryRuleYStructRefPair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYStructRefPair = null;


        try {
            // InternalLang.g:3191:55: (iv_ruleYStructRefPair= ruleYStructRefPair EOF )
            // InternalLang.g:3192:2: iv_ruleYStructRefPair= ruleYStructRefPair EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYStructRefPairRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYStructRefPair=ruleYStructRefPair();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYStructRefPair; 
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
    // $ANTLR end "entryRuleYStructRefPair"


    // $ANTLR start "ruleYStructRefPair"
    // InternalLang.g:3198:1: ruleYStructRefPair returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) ;
    public final EObject ruleYStructRefPair() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;


        	enterRule();

        try {
            // InternalLang.g:3204:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) ) )
            // InternalLang.g:3205:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            {
            // InternalLang.g:3205:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) ) )
            // InternalLang.g:3206:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( (otherlv_2= RULE_ID ) )
            {
            // InternalLang.g:3206:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:3207:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:3207:4: (otherlv_0= RULE_ID )
            // InternalLang.g:3208:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYStructRefPairRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getYStructRefPairAccess().getStructpropertyYPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYStructRefPairAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLang.g:3223:3: ( (otherlv_2= RULE_ID ) )
            // InternalLang.g:3224:4: (otherlv_2= RULE_ID )
            {
            // InternalLang.g:3224:4: (otherlv_2= RULE_ID )
            // InternalLang.g:3225:5: otherlv_2= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYStructRefPairRule());
              					}
              				
            }
            otherlv_2=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_2, grammarAccess.getYStructRefPairAccess().getStructclassYAnnotEntityCrossReference_2_0());
              				
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
    // $ANTLR end "ruleYStructRefPair"


    // $ANTLR start "entryRuleYJoin"
    // InternalLang.g:3240:1: entryRuleYJoin returns [EObject current=null] : iv_ruleYJoin= ruleYJoin EOF ;
    public final EObject entryRuleYJoin() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYJoin = null;


        try {
            // InternalLang.g:3240:46: (iv_ruleYJoin= ruleYJoin EOF )
            // InternalLang.g:3241:2: iv_ruleYJoin= ruleYJoin EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYJoinRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYJoin=ruleYJoin();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYJoin; 
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
    // $ANTLR end "entryRuleYJoin"


    // $ANTLR start "ruleYJoin"
    // InternalLang.g:3247:1: ruleYJoin returns [EObject current=null] : ( () otherlv_1= 'join' ( (lv_joindefs_2_0= ruleYJoinDef ) ) (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )* ) ;
    public final EObject ruleYJoin() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_joindefs_2_0 = null;

        EObject lv_joindefs_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3253:2: ( ( () otherlv_1= 'join' ( (lv_joindefs_2_0= ruleYJoinDef ) ) (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )* ) )
            // InternalLang.g:3254:2: ( () otherlv_1= 'join' ( (lv_joindefs_2_0= ruleYJoinDef ) ) (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )* )
            {
            // InternalLang.g:3254:2: ( () otherlv_1= 'join' ( (lv_joindefs_2_0= ruleYJoinDef ) ) (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )* )
            // InternalLang.g:3255:3: () otherlv_1= 'join' ( (lv_joindefs_2_0= ruleYJoinDef ) ) (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )*
            {
            // InternalLang.g:3255:3: ()
            // InternalLang.g:3256:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYJoinAccess().getYJoinAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,67,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYJoinAccess().getJoinKeyword_1());
              		
            }
            // InternalLang.g:3266:3: ( (lv_joindefs_2_0= ruleYJoinDef ) )
            // InternalLang.g:3267:4: (lv_joindefs_2_0= ruleYJoinDef )
            {
            // InternalLang.g:3267:4: (lv_joindefs_2_0= ruleYJoinDef )
            // InternalLang.g:3268:5: lv_joindefs_2_0= ruleYJoinDef
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYJoinAccess().getJoindefsYJoinDefParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_58);
            lv_joindefs_2_0=ruleYJoinDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYJoinRule());
              					}
              					add(
              						current,
              						"joindefs",
              						lv_joindefs_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YJoinDef");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:3285:3: (otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) ) )*
            loop57:
            do {
                int alt57=2;
                int LA57_0 = input.LA(1);

                if ( (LA57_0==21) ) {
                    alt57=1;
                }


                switch (alt57) {
            	case 1 :
            	    // InternalLang.g:3286:4: otherlv_3= ',' ( (lv_joindefs_4_0= ruleYJoinDef ) )
            	    {
            	    otherlv_3=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_3, grammarAccess.getYJoinAccess().getCommaKeyword_3_0());
            	      			
            	    }
            	    // InternalLang.g:3290:4: ( (lv_joindefs_4_0= ruleYJoinDef ) )
            	    // InternalLang.g:3291:5: (lv_joindefs_4_0= ruleYJoinDef )
            	    {
            	    // InternalLang.g:3291:5: (lv_joindefs_4_0= ruleYJoinDef )
            	    // InternalLang.g:3292:6: lv_joindefs_4_0= ruleYJoinDef
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYJoinAccess().getJoindefsYJoinDefParserRuleCall_3_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_58);
            	    lv_joindefs_4_0=ruleYJoinDef();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElementForParent(grammarAccess.getYJoinRule());
            	      						}
            	      						add(
            	      							current,
            	      							"joindefs",
            	      							lv_joindefs_4_0,
            	      							"eu.jgen.notes.dmw.lite.base.Lang.YJoinDef");
            	      						afterParserOrEnumRuleCall();
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop57;
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
    // $ANTLR end "ruleYJoin"


    // $ANTLR start "entryRuleYJoinDef"
    // InternalLang.g:3314:1: entryRuleYJoinDef returns [EObject current=null] : iv_ruleYJoinDef= ruleYJoinDef EOF ;
    public final EObject entryRuleYJoinDef() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYJoinDef = null;


        try {
            // InternalLang.g:3314:49: (iv_ruleYJoinDef= ruleYJoinDef EOF )
            // InternalLang.g:3315:2: iv_ruleYJoinDef= ruleYJoinDef EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYJoinDefRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYJoinDef=ruleYJoinDef();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYJoinDef; 
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
    // $ANTLR end "entryRuleYJoinDef"


    // $ANTLR start "ruleYJoinDef"
    // InternalLang.g:3321:1: ruleYJoinDef returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) ;
    public final EObject ruleYJoinDef() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLang.g:3327:2: ( ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) ) )
            // InternalLang.g:3328:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            {
            // InternalLang.g:3328:2: ( ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) ) )
            // InternalLang.g:3329:3: ( (otherlv_0= RULE_ID ) ) otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= '->' ( (otherlv_4= RULE_ID ) )
            {
            // InternalLang.g:3329:3: ( (otherlv_0= RULE_ID ) )
            // InternalLang.g:3330:4: (otherlv_0= RULE_ID )
            {
            // InternalLang.g:3330:4: (otherlv_0= RULE_ID )
            // InternalLang.g:3331:5: otherlv_0= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYJoinDefRule());
              					}
              				
            }
            otherlv_0=(Token)match(input,RULE_ID,FOLLOW_57); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_0, grammarAccess.getYJoinDefAccess().getFromViewYPropertyCrossReference_0_0());
              				
            }

            }


            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYJoinDefAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLang.g:3346:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:3347:4: ( ruleQualifiedName )
            {
            // InternalLang.g:3347:4: ( ruleQualifiedName )
            // InternalLang.g:3348:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYJoinDefRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYJoinDefAccess().getRelRefYAnnotRelationshipCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_57);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYJoinDefAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalLang.g:3366:3: ( (otherlv_4= RULE_ID ) )
            // InternalLang.g:3367:4: (otherlv_4= RULE_ID )
            {
            // InternalLang.g:3367:4: (otherlv_4= RULE_ID )
            // InternalLang.g:3368:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYJoinDefRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getYJoinDefAccess().getToViewYPropertyCrossReference_4_0());
              				
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
    // $ANTLR end "ruleYJoinDef"


    // $ANTLR start "entryRuleYWhere"
    // InternalLang.g:3383:1: entryRuleYWhere returns [EObject current=null] : iv_ruleYWhere= ruleYWhere EOF ;
    public final EObject entryRuleYWhere() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYWhere = null;


        try {
            // InternalLang.g:3383:47: (iv_ruleYWhere= ruleYWhere EOF )
            // InternalLang.g:3384:2: iv_ruleYWhere= ruleYWhere EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYWhereRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYWhere=ruleYWhere();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYWhere; 
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
    // $ANTLR end "entryRuleYWhere"


    // $ANTLR start "ruleYWhere"
    // InternalLang.g:3390:1: ruleYWhere returns [EObject current=null] : ( () otherlv_1= 'where' ( (lv_expression_2_0= ruleYOrExpression ) ) ) ;
    public final EObject ruleYWhere() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_expression_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3396:2: ( ( () otherlv_1= 'where' ( (lv_expression_2_0= ruleYOrExpression ) ) ) )
            // InternalLang.g:3397:2: ( () otherlv_1= 'where' ( (lv_expression_2_0= ruleYOrExpression ) ) )
            {
            // InternalLang.g:3397:2: ( () otherlv_1= 'where' ( (lv_expression_2_0= ruleYOrExpression ) ) )
            // InternalLang.g:3398:3: () otherlv_1= 'where' ( (lv_expression_2_0= ruleYOrExpression ) )
            {
            // InternalLang.g:3398:3: ()
            // InternalLang.g:3399:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYWhereAccess().getYWhereAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,68,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYWhereAccess().getWhereKeyword_1());
              		
            }
            // InternalLang.g:3409:3: ( (lv_expression_2_0= ruleYOrExpression ) )
            // InternalLang.g:3410:4: (lv_expression_2_0= ruleYOrExpression )
            {
            // InternalLang.g:3410:4: (lv_expression_2_0= ruleYOrExpression )
            // InternalLang.g:3411:5: lv_expression_2_0= ruleYOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYWhereAccess().getExpressionYOrExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_expression_2_0=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYWhereRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
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
    // $ANTLR end "ruleYWhere"


    // $ANTLR start "entryRuleYWhileStatement"
    // InternalLang.g:3432:1: entryRuleYWhileStatement returns [EObject current=null] : iv_ruleYWhileStatement= ruleYWhileStatement EOF ;
    public final EObject entryRuleYWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYWhileStatement = null;


        try {
            // InternalLang.g:3432:56: (iv_ruleYWhileStatement= ruleYWhileStatement EOF )
            // InternalLang.g:3433:2: iv_ruleYWhileStatement= ruleYWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYWhileStatement=ruleYWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYWhileStatement; 
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
    // $ANTLR end "entryRuleYWhileStatement"


    // $ANTLR start "ruleYWhileStatement"
    // InternalLang.g:3439:1: ruleYWhileStatement returns [EObject current=null] : (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleYBlock ) ) ) ;
    public final EObject ruleYWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        EObject lv_expression_2_0 = null;

        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3445:2: ( (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleYBlock ) ) ) )
            // InternalLang.g:3446:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleYBlock ) ) )
            {
            // InternalLang.g:3446:2: (otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleYBlock ) ) )
            // InternalLang.g:3447:3: otherlv_0= 'while' otherlv_1= '(' ( (lv_expression_2_0= ruleYOrExpression ) ) otherlv_3= ')' ( (lv_body_4_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,69,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYWhileStatementAccess().getWhileKeyword_0());
              		
            }
            otherlv_1=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYWhileStatementAccess().getLeftParenthesisKeyword_1());
              		
            }
            // InternalLang.g:3455:3: ( (lv_expression_2_0= ruleYOrExpression ) )
            // InternalLang.g:3456:4: (lv_expression_2_0= ruleYOrExpression )
            {
            // InternalLang.g:3456:4: (lv_expression_2_0= ruleYOrExpression )
            // InternalLang.g:3457:5: lv_expression_2_0= ruleYOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYWhileStatementAccess().getExpressionYOrExpressionParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_expression_2_0=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYWhileStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_2_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,25,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYWhileStatementAccess().getRightParenthesisKeyword_3());
              		
            }
            // InternalLang.g:3478:3: ( (lv_body_4_0= ruleYBlock ) )
            // InternalLang.g:3479:4: (lv_body_4_0= ruleYBlock )
            {
            // InternalLang.g:3479:4: (lv_body_4_0= ruleYBlock )
            // InternalLang.g:3480:5: lv_body_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYWhileStatementAccess().getBodyYBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYWhileStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYWhileStatement"


    // $ANTLR start "entryRuleYRepeatWhileStatement"
    // InternalLang.g:3501:1: entryRuleYRepeatWhileStatement returns [EObject current=null] : iv_ruleYRepeatWhileStatement= ruleYRepeatWhileStatement EOF ;
    public final EObject entryRuleYRepeatWhileStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYRepeatWhileStatement = null;


        try {
            // InternalLang.g:3501:62: (iv_ruleYRepeatWhileStatement= ruleYRepeatWhileStatement EOF )
            // InternalLang.g:3502:2: iv_ruleYRepeatWhileStatement= ruleYRepeatWhileStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYRepeatWhileStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYRepeatWhileStatement=ruleYRepeatWhileStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYRepeatWhileStatement; 
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
    // $ANTLR end "entryRuleYRepeatWhileStatement"


    // $ANTLR start "ruleYRepeatWhileStatement"
    // InternalLang.g:3508:1: ruleYRepeatWhileStatement returns [EObject current=null] : (otherlv_0= 'repeat' ( (lv_body_1_0= ruleYBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleYOrExpression ) ) otherlv_5= ')' ) ;
    public final EObject ruleYRepeatWhileStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_body_1_0 = null;

        EObject lv_expression_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3514:2: ( (otherlv_0= 'repeat' ( (lv_body_1_0= ruleYBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleYOrExpression ) ) otherlv_5= ')' ) )
            // InternalLang.g:3515:2: (otherlv_0= 'repeat' ( (lv_body_1_0= ruleYBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleYOrExpression ) ) otherlv_5= ')' )
            {
            // InternalLang.g:3515:2: (otherlv_0= 'repeat' ( (lv_body_1_0= ruleYBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleYOrExpression ) ) otherlv_5= ')' )
            // InternalLang.g:3516:3: otherlv_0= 'repeat' ( (lv_body_1_0= ruleYBlock ) ) otherlv_2= 'while' otherlv_3= '(' ( (lv_expression_4_0= ruleYOrExpression ) ) otherlv_5= ')'
            {
            otherlv_0=(Token)match(input,70,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYRepeatWhileStatementAccess().getRepeatKeyword_0());
              		
            }
            // InternalLang.g:3520:3: ( (lv_body_1_0= ruleYBlock ) )
            // InternalLang.g:3521:4: (lv_body_1_0= ruleYBlock )
            {
            // InternalLang.g:3521:4: (lv_body_1_0= ruleYBlock )
            // InternalLang.g:3522:5: lv_body_1_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYRepeatWhileStatementAccess().getBodyYBlockParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_59);
            lv_body_1_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYRepeatWhileStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_1_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_2=(Token)match(input,69,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYRepeatWhileStatementAccess().getWhileKeyword_2());
              		
            }
            otherlv_3=(Token)match(input,24,FOLLOW_28); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYRepeatWhileStatementAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalLang.g:3547:3: ( (lv_expression_4_0= ruleYOrExpression ) )
            // InternalLang.g:3548:4: (lv_expression_4_0= ruleYOrExpression )
            {
            // InternalLang.g:3548:4: (lv_expression_4_0= ruleYOrExpression )
            // InternalLang.g:3549:5: lv_expression_4_0= ruleYOrExpression
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYRepeatWhileStatementAccess().getExpressionYOrExpressionParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_30);
            lv_expression_4_0=ruleYOrExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYRepeatWhileStatementRule());
              					}
              					set(
              						current,
              						"expression",
              						lv_expression_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YOrExpression");
              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,25,FOLLOW_2); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYRepeatWhileStatementAccess().getRightParenthesisKeyword_5());
              		
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
    // $ANTLR end "ruleYRepeatWhileStatement"


    // $ANTLR start "entryRuleYForInStatement"
    // InternalLang.g:3574:1: entryRuleYForInStatement returns [EObject current=null] : iv_ruleYForInStatement= ruleYForInStatement EOF ;
    public final EObject entryRuleYForInStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYForInStatement = null;


        try {
            // InternalLang.g:3574:56: (iv_ruleYForInStatement= ruleYForInStatement EOF )
            // InternalLang.g:3575:2: iv_ruleYForInStatement= ruleYForInStatement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getYForInStatementRule()); 
            }
            pushFollow(FOLLOW_1);
            iv_ruleYForInStatement=ruleYForInStatement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleYForInStatement; 
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
    // $ANTLR end "entryRuleYForInStatement"


    // $ANTLR start "ruleYForInStatement"
    // InternalLang.g:3581:1: ruleYForInStatement returns [EObject current=null] : (otherlv_0= 'for' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ( (lv_body_4_0= ruleYBlock ) ) ) ;
    public final EObject ruleYForInStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        EObject lv_body_4_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3587:2: ( (otherlv_0= 'for' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ( (lv_body_4_0= ruleYBlock ) ) ) )
            // InternalLang.g:3588:2: (otherlv_0= 'for' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ( (lv_body_4_0= ruleYBlock ) ) )
            {
            // InternalLang.g:3588:2: (otherlv_0= 'for' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ( (lv_body_4_0= ruleYBlock ) ) )
            // InternalLang.g:3589:3: otherlv_0= 'for' ( (otherlv_1= RULE_ID ) ) otherlv_2= 'in' ( (otherlv_3= RULE_ID ) ) ( (lv_body_4_0= ruleYBlock ) )
            {
            otherlv_0=(Token)match(input,71,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYForInStatementAccess().getForKeyword_0());
              		
            }
            // InternalLang.g:3593:3: ( (otherlv_1= RULE_ID ) )
            // InternalLang.g:3594:4: (otherlv_1= RULE_ID )
            {
            // InternalLang.g:3594:4: (otherlv_1= RULE_ID )
            // InternalLang.g:3595:5: otherlv_1= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYForInStatementRule());
              					}
              				
            }
            otherlv_1=(Token)match(input,RULE_ID,FOLLOW_60); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getYForInStatementAccess().getItemYPropertyCrossReference_1_0());
              				
            }

            }


            }

            otherlv_2=(Token)match(input,72,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYForInStatementAccess().getInKeyword_2());
              		
            }
            // InternalLang.g:3610:3: ( (otherlv_3= RULE_ID ) )
            // InternalLang.g:3611:4: (otherlv_3= RULE_ID )
            {
            // InternalLang.g:3611:4: (otherlv_3= RULE_ID )
            // InternalLang.g:3612:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYForInStatementRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_24); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getYForInStatementAccess().getCollectionYPropertyCrossReference_3_0());
              				
            }

            }


            }

            // InternalLang.g:3623:3: ( (lv_body_4_0= ruleYBlock ) )
            // InternalLang.g:3624:4: (lv_body_4_0= ruleYBlock )
            {
            // InternalLang.g:3624:4: (lv_body_4_0= ruleYBlock )
            // InternalLang.g:3625:5: lv_body_4_0= ruleYBlock
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYForInStatementAccess().getBodyYBlockParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_2);
            lv_body_4_0=ruleYBlock();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElementForParent(grammarAccess.getYForInStatementRule());
              					}
              					set(
              						current,
              						"body",
              						lv_body_4_0,
              						"eu.jgen.notes.dmw.lite.base.Lang.YBlock");
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
    // $ANTLR end "ruleYForInStatement"


    // $ANTLR start "entryRuleYImport"
    // InternalLang.g:3646:1: entryRuleYImport returns [EObject current=null] : iv_ruleYImport= ruleYImport EOF ;
    public final EObject entryRuleYImport() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYImport = null;


        try {
            // InternalLang.g:3646:48: (iv_ruleYImport= ruleYImport EOF )
            // InternalLang.g:3647:2: iv_ruleYImport= ruleYImport EOF
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
    // InternalLang.g:3653:1: ruleYImport returns [EObject current=null] : (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) ;
    public final EObject ruleYImport() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_importedNamespace_1_0 = null;



        	enterRule();

        try {
            // InternalLang.g:3659:2: ( (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' ) )
            // InternalLang.g:3660:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            {
            // InternalLang.g:3660:2: (otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';' )
            // InternalLang.g:3661:3: otherlv_0= 'import' ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) ) otherlv_2= ';'
            {
            otherlv_0=(Token)match(input,73,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_0, grammarAccess.getYImportAccess().getImportKeyword_0());
              		
            }
            // InternalLang.g:3665:3: ( (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard ) )
            // InternalLang.g:3666:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            {
            // InternalLang.g:3666:4: (lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard )
            // InternalLang.g:3667:5: lv_importedNamespace_1_0= ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0());
              				
            }
            pushFollow(FOLLOW_17);
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
    // InternalLang.g:3692:1: entryRuleYAnnotation returns [EObject current=null] : iv_ruleYAnnotation= ruleYAnnotation EOF ;
    public final EObject entryRuleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotation = null;


        try {
            // InternalLang.g:3692:52: (iv_ruleYAnnotation= ruleYAnnotation EOF )
            // InternalLang.g:3693:2: iv_ruleYAnnotation= ruleYAnnotation EOF
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
    // InternalLang.g:3699:1: ruleYAnnotation returns [EObject current=null] : (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) ;
    public final EObject ruleYAnnotation() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotEntity_0 = null;

        EObject this_YAnnotTechnicalDesign_1 = null;

        EObject this_YAnnotDatabase_2 = null;

        EObject this_YAnnotJava_3 = null;

        EObject this_YAnnotSwift_4 = null;



        	enterRule();

        try {
            // InternalLang.g:3705:2: ( (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift ) )
            // InternalLang.g:3706:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            {
            // InternalLang.g:3706:2: (this_YAnnotEntity_0= ruleYAnnotEntity | this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign | this_YAnnotDatabase_2= ruleYAnnotDatabase | this_YAnnotJava_3= ruleYAnnotJava | this_YAnnotSwift_4= ruleYAnnotSwift )
            int alt58=5;
            switch ( input.LA(1) ) {
            case 74:
                {
                alt58=1;
                }
                break;
            case 81:
                {
                alt58=2;
                }
                break;
            case 102:
                {
                alt58=3;
                }
                break;
            case 98:
                {
                alt58=4;
                }
                break;
            case 100:
                {
                alt58=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 58, 0, input);

                throw nvae;
            }

            switch (alt58) {
                case 1 :
                    // InternalLang.g:3707:3: this_YAnnotEntity_0= ruleYAnnotEntity
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
                    // InternalLang.g:3716:3: this_YAnnotTechnicalDesign_1= ruleYAnnotTechnicalDesign
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
                    // InternalLang.g:3725:3: this_YAnnotDatabase_2= ruleYAnnotDatabase
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
                    // InternalLang.g:3734:3: this_YAnnotJava_3= ruleYAnnotJava
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
                    // InternalLang.g:3743:3: this_YAnnotSwift_4= ruleYAnnotSwift
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
    // InternalLang.g:3755:1: entryRuleYAnnotEntity returns [EObject current=null] : iv_ruleYAnnotEntity= ruleYAnnotEntity EOF ;
    public final EObject entryRuleYAnnotEntity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntity = null;


        try {
            // InternalLang.g:3755:53: (iv_ruleYAnnotEntity= ruleYAnnotEntity EOF )
            // InternalLang.g:3756:2: iv_ruleYAnnotEntity= ruleYAnnotEntity EOF
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
    // InternalLang.g:3762:1: ruleYAnnotEntity returns [EObject current=null] : ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) ;
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
            // InternalLang.g:3768:2: ( ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' ) )
            // InternalLang.g:3769:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            {
            // InternalLang.g:3769:2: ( () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}' )
            // InternalLang.g:3770:3: () otherlv_1= '@entity' ( (lv_name_2_0= ruleValidID ) ) ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )? otherlv_8= '{' ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )* otherlv_10= '}'
            {
            // InternalLang.g:3770:3: ()
            // InternalLang.g:3771:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotEntityAccess().getYAnnotEntityAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,74,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotEntityAccess().getEntityKeyword_1());
              		
            }
            // InternalLang.g:3781:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:3782:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:3782:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:3783:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotEntityAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_61);
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

            // InternalLang.g:3800:3: ( ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')' )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==24) && (synpred2_InternalLang())) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // InternalLang.g:3801:4: ( ( '(' )=>otherlv_3= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_7= ')'
                    {
                    // InternalLang.g:3801:4: ( ( '(' )=>otherlv_3= '(' )
                    // InternalLang.g:3802:5: ( '(' )=>otherlv_3= '('
                    {
                    otherlv_3=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_3, grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0());
                      				
                    }

                    }

                    // InternalLang.g:3808:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt60=2;
                    int LA60_0 = input.LA(1);

                    if ( (LA60_0==RULE_ID) && (synpred3_InternalLang())) {
                        alt60=1;
                    }
                    switch (alt60) {
                        case 1 :
                            // InternalLang.g:3809:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) ) (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalLang.g:3809:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair ) )
                            // InternalLang.g:3810:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalLang.g:3819:6: (lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair )
                            // InternalLang.g:3820:7: lv_elementValuePairs_4_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalLang.g:3837:5: (otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) ) )*
                            loop59:
                            do {
                                int alt59=2;
                                int LA59_0 = input.LA(1);

                                if ( (LA59_0==21) ) {
                                    alt59=1;
                                }


                                switch (alt59) {
                            	case 1 :
                            	    // InternalLang.g:3838:6: otherlv_5= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:3842:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalLang.g:3843:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalLang.g:3852:7: (lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair )
                            	    // InternalLang.g:3853:8: lv_elementValuePairs_6_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop59;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_7=(Token)match(input,25,FOLLOW_9); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_7, grammarAccess.getYAnnotEntityAccess().getRightParenthesisKeyword_3_2());
                      			
                    }

                    }
                    break;

            }

            otherlv_8=(Token)match(input,16,FOLLOW_62); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_8, grammarAccess.getYAnnotEntityAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalLang.g:3881:3: ( (lv_annotations_9_0= ruleYAnnotEntityInner ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( ((LA62_0>=75 && LA62_0<=76)||LA62_0==78) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // InternalLang.g:3882:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    {
            	    // InternalLang.g:3882:4: (lv_annotations_9_0= ruleYAnnotEntityInner )
            	    // InternalLang.g:3883:5: lv_annotations_9_0= ruleYAnnotEntityInner
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotEntityAccess().getAnnotationsYAnnotEntityInnerParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_62);
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
            	    break loop62;
                }
            } while (true);

            otherlv_10=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalLang.g:3908:1: entryRuleYAnnotAttribute returns [EObject current=null] : iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF ;
    public final EObject entryRuleYAnnotAttribute() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAttribute = null;


        try {
            // InternalLang.g:3908:56: (iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF )
            // InternalLang.g:3909:2: iv_ruleYAnnotAttribute= ruleYAnnotAttribute EOF
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
    // InternalLang.g:3915:1: ruleYAnnotAttribute returns [EObject current=null] : ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) ;
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
            // InternalLang.g:3921:2: ( ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? ) )
            // InternalLang.g:3922:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            {
            // InternalLang.g:3922:2: ( () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )? )
            // InternalLang.g:3923:3: () otherlv_1= '@attribute' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )? (otherlv_9= ';' )?
            {
            // InternalLang.g:3923:3: ()
            // InternalLang.g:3924:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotAttributeAccess().getYAnnotAttributeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,75,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotAttributeAccess().getAttributeKeyword_1());
              		
            }
            // InternalLang.g:3934:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:3935:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:3935:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:3936:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_63);
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

            // InternalLang.g:3953:3: ( (lv_optional_3_0= '?' ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==19) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // InternalLang.g:3954:4: (lv_optional_3_0= '?' )
                    {
                    // InternalLang.g:3954:4: (lv_optional_3_0= '?' )
                    // InternalLang.g:3955:5: lv_optional_3_0= '?'
                    {
                    lv_optional_3_0=(Token)match(input,19,FOLLOW_64); if (state.failed) return current;
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

            // InternalLang.g:3967:3: ( ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')' )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==24) && (synpred5_InternalLang())) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // InternalLang.g:3968:4: ( ( '(' )=>otherlv_4= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_8= ')'
                    {
                    // InternalLang.g:3968:4: ( ( '(' )=>otherlv_4= '(' )
                    // InternalLang.g:3969:5: ( '(' )=>otherlv_4= '('
                    {
                    otherlv_4=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_4, grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0());
                      				
                    }

                    }

                    // InternalLang.g:3975:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==RULE_ID) && (synpred6_InternalLang())) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // InternalLang.g:3976:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) ) (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalLang.g:3976:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair ) )
                            // InternalLang.g:3977:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalLang.g:3986:6: (lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair )
                            // InternalLang.g:3987:7: lv_elementValuePairs_5_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalLang.g:4004:5: (otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) )*
                            loop64:
                            do {
                                int alt64=2;
                                int LA64_0 = input.LA(1);

                                if ( (LA64_0==21) ) {
                                    alt64=1;
                                }


                                switch (alt64) {
                            	case 1 :
                            	    // InternalLang.g:4005:6: otherlv_6= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_6=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:4009:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalLang.g:4010:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalLang.g:4019:7: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            	    // InternalLang.g:4020:8: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop64;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_8=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_8, grammarAccess.getYAnnotAttributeAccess().getRightParenthesisKeyword_4_2());
                      			
                    }

                    }
                    break;

            }

            // InternalLang.g:4044:3: (otherlv_9= ';' )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==12) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // InternalLang.g:4045:4: otherlv_9= ';'
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
    // InternalLang.g:4054:1: entryRuleYAnnotRelationship returns [EObject current=null] : iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF ;
    public final EObject entryRuleYAnnotRelationship() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotRelationship = null;


        try {
            // InternalLang.g:4054:59: (iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF )
            // InternalLang.g:4055:2: iv_ruleYAnnotRelationship= ruleYAnnotRelationship EOF
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
    // InternalLang.g:4061:1: ruleYAnnotRelationship returns [EObject current=null] : ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) ;
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
            // InternalLang.g:4067:2: ( ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? ) )
            // InternalLang.g:4068:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            {
            // InternalLang.g:4068:2: ( () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )? )
            // InternalLang.g:4069:3: () otherlv_1= '@relationship' ( (lv_name_2_0= ruleValidID ) ) ( (lv_optional_3_0= '?' ) )? otherlv_4= '->' ( ( ruleQualifiedName ) ) ( (lv_many_6_0= '*' ) )? ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )? (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )? (otherlv_14= ';' )?
            {
            // InternalLang.g:4069:3: ()
            // InternalLang.g:4070:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotRelationshipAccess().getYAnnotRelationshipAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,76,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotRelationshipAccess().getRelationshipKeyword_1());
              		
            }
            // InternalLang.g:4080:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:4081:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:4081:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:4082:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_65);
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

            // InternalLang.g:4099:3: ( (lv_optional_3_0= '?' ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==19) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // InternalLang.g:4100:4: (lv_optional_3_0= '?' )
                    {
                    // InternalLang.g:4100:4: (lv_optional_3_0= '?' )
                    // InternalLang.g:4101:5: lv_optional_3_0= '?'
                    {
                    lv_optional_3_0=(Token)match(input,19,FOLLOW_57); if (state.failed) return current;
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

            otherlv_4=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYAnnotRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_4());
              		
            }
            // InternalLang.g:4117:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:4118:4: ( ruleQualifiedName )
            {
            // InternalLang.g:4118:4: ( ruleQualifiedName )
            // InternalLang.g:4119:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityCrossReference_5_0());
              				
            }
            pushFollow(FOLLOW_66);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:4133:3: ( (lv_many_6_0= '*' ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==43) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // InternalLang.g:4134:4: (lv_many_6_0= '*' )
                    {
                    // InternalLang.g:4134:4: (lv_many_6_0= '*' )
                    // InternalLang.g:4135:5: lv_many_6_0= '*'
                    {
                    lv_many_6_0=(Token)match(input,43,FOLLOW_67); if (state.failed) return current;
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

            // InternalLang.g:4147:3: ( ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')' )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==24) && (synpred8_InternalLang())) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // InternalLang.g:4148:4: ( ( '(' )=>otherlv_7= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_11= ')'
                    {
                    // InternalLang.g:4148:4: ( ( '(' )=>otherlv_7= '(' )
                    // InternalLang.g:4149:5: ( '(' )=>otherlv_7= '('
                    {
                    otherlv_7=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_7, grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0());
                      				
                    }

                    }

                    // InternalLang.g:4155:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==RULE_ID) && (synpred9_InternalLang())) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // InternalLang.g:4156:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) ) (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalLang.g:4156:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair ) )
                            // InternalLang.g:4157:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalLang.g:4166:6: (lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair )
                            // InternalLang.g:4167:7: lv_elementValuePairs_8_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalLang.g:4184:5: (otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) ) )*
                            loop70:
                            do {
                                int alt70=2;
                                int LA70_0 = input.LA(1);

                                if ( (LA70_0==21) ) {
                                    alt70=1;
                                }


                                switch (alt70) {
                            	case 1 :
                            	    // InternalLang.g:4185:6: otherlv_9= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_9=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_9, grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:4189:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalLang.g:4190:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalLang.g:4199:7: (lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair )
                            	    // InternalLang.g:4200:8: lv_elementValuePairs_10_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop70;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_11=(Token)match(input,25,FOLLOW_68); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_11, grammarAccess.getYAnnotRelationshipAccess().getRightParenthesisKeyword_7_2());
                      			
                    }

                    }
                    break;

            }

            // InternalLang.g:4224:3: (otherlv_12= '<-' ( ( ruleQualifiedName ) ) )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==77) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // InternalLang.g:4225:4: otherlv_12= '<-' ( ( ruleQualifiedName ) )
                    {
                    otherlv_12=(Token)match(input,77,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_12, grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0());
                      			
                    }
                    // InternalLang.g:4229:4: ( ( ruleQualifiedName ) )
                    // InternalLang.g:4230:5: ( ruleQualifiedName )
                    {
                    // InternalLang.g:4230:5: ( ruleQualifiedName )
                    // InternalLang.g:4231:6: ruleQualifiedName
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotRelationshipRule());
                      						}
                      					
                    }
                    if ( state.backtracking==0 ) {

                      						newCompositeNode(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipCrossReference_8_1_0());
                      					
                    }
                    pushFollow(FOLLOW_26);
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

            // InternalLang.g:4246:3: (otherlv_14= ';' )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==12) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // InternalLang.g:4247:4: otherlv_14= ';'
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
    // InternalLang.g:4256:1: entryRuleYAnnotIdentifier returns [EObject current=null] : iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF ;
    public final EObject entryRuleYAnnotIdentifier() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotIdentifier = null;


        try {
            // InternalLang.g:4256:57: (iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF )
            // InternalLang.g:4257:2: iv_ruleYAnnotIdentifier= ruleYAnnotIdentifier EOF
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
    // InternalLang.g:4263:1: ruleYAnnotIdentifier returns [EObject current=null] : ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) ;
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
            // InternalLang.g:4269:2: ( ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? ) )
            // InternalLang.g:4270:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            {
            // InternalLang.g:4270:2: ( () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )? )
            // InternalLang.g:4271:3: () otherlv_1= '@identifier' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '(' ( (otherlv_4= RULE_ID ) ) (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )* otherlv_7= ')' (otherlv_8= ';' )?
            {
            // InternalLang.g:4271:3: ()
            // InternalLang.g:4272:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotIdentifierAccess().getYAnnotIdentifierAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,78,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotIdentifierAccess().getIdentifierKeyword_1());
              		
            }
            // InternalLang.g:4282:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:4283:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:4283:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:4284:5: lv_name_2_0= ruleValidID
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

            otherlv_3=(Token)match(input,24,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotIdentifierAccess().getLeftParenthesisKeyword_3());
              		
            }
            // InternalLang.g:4305:3: ( (otherlv_4= RULE_ID ) )
            // InternalLang.g:4306:4: (otherlv_4= RULE_ID )
            {
            // InternalLang.g:4306:4: (otherlv_4= RULE_ID )
            // InternalLang.g:4307:5: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotIdentifierRule());
              					}
              				
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_4, grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_4_0());
              				
            }

            }


            }

            // InternalLang.g:4318:3: (otherlv_5= ',' ( (otherlv_6= RULE_ID ) ) )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==21) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // InternalLang.g:4319:4: otherlv_5= ',' ( (otherlv_6= RULE_ID ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalLang.g:4323:4: ( (otherlv_6= RULE_ID ) )
            	    // InternalLang.g:4324:5: (otherlv_6= RULE_ID )
            	    {
            	    // InternalLang.g:4324:5: (otherlv_6= RULE_ID )
            	    // InternalLang.g:4325:6: otherlv_6= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getYAnnotIdentifierRule());
            	      						}
            	      					
            	    }
            	    otherlv_6=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_6, grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_5_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop75;
                }
            } while (true);

            otherlv_7=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotIdentifierAccess().getRightParenthesisKeyword_6());
              		
            }
            // InternalLang.g:4341:3: (otherlv_8= ';' )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==12) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // InternalLang.g:4342:4: otherlv_8= ';'
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
    // InternalLang.g:4351:1: entryRuleYAnnotationElementValuePair returns [EObject current=null] : iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF ;
    public final EObject entryRuleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotationElementValuePair = null;


        try {
            // InternalLang.g:4351:68: (iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF )
            // InternalLang.g:4352:2: iv_ruleYAnnotationElementValuePair= ruleYAnnotationElementValuePair EOF
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
    // InternalLang.g:4358:1: ruleYAnnotationElementValuePair returns [EObject current=null] : ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) ;
    public final EObject ruleYAnnotationElementValuePair() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_value_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:4364:2: ( ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) ) )
            // InternalLang.g:4365:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            {
            // InternalLang.g:4365:2: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) ) )
            // InternalLang.g:4366:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) ) ( (lv_value_2_0= ruleYAnnotExpression ) )
            {
            // InternalLang.g:4366:3: ( ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' ) )
            // InternalLang.g:4367:4: ( ( ( ( ruleValidID ) ) '=' ) )=> ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            {
            // InternalLang.g:4376:4: ( ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '=' )
            // InternalLang.g:4377:5: ( (lv_name_0_0= ruleValidID ) ) otherlv_1= '='
            {
            // InternalLang.g:4377:5: ( (lv_name_0_0= ruleValidID ) )
            // InternalLang.g:4378:6: (lv_name_0_0= ruleValidID )
            {
            // InternalLang.g:4378:6: (lv_name_0_0= ruleValidID )
            // InternalLang.g:4379:7: lv_name_0_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              							newCompositeNode(grammarAccess.getYAnnotationElementValuePairAccess().getNameValidIDParserRuleCall_0_0_0_0());
              						
            }
            pushFollow(FOLLOW_27);
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

            otherlv_1=(Token)match(input,27,FOLLOW_69); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_1, grammarAccess.getYAnnotationElementValuePairAccess().getEqualsSignKeyword_0_0_1());
              				
            }

            }


            }

            // InternalLang.g:4402:3: ( (lv_value_2_0= ruleYAnnotExpression ) )
            // InternalLang.g:4403:4: (lv_value_2_0= ruleYAnnotExpression )
            {
            // InternalLang.g:4403:4: (lv_value_2_0= ruleYAnnotExpression )
            // InternalLang.g:4404:5: lv_value_2_0= ruleYAnnotExpression
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
    // InternalLang.g:4425:1: entryRuleYAnnotEntityInner returns [EObject current=null] : iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF ;
    public final EObject entryRuleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotEntityInner = null;


        try {
            // InternalLang.g:4425:58: (iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF )
            // InternalLang.g:4426:2: iv_ruleYAnnotEntityInner= ruleYAnnotEntityInner EOF
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
    // InternalLang.g:4432:1: ruleYAnnotEntityInner returns [EObject current=null] : (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) ;
    public final EObject ruleYAnnotEntityInner() throws RecognitionException {
        EObject current = null;

        EObject this_YAnnotAttribute_0 = null;

        EObject this_YAnnotRelationship_1 = null;

        EObject this_YAnnotIdentifier_2 = null;



        	enterRule();

        try {
            // InternalLang.g:4438:2: ( (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier ) )
            // InternalLang.g:4439:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            {
            // InternalLang.g:4439:2: (this_YAnnotAttribute_0= ruleYAnnotAttribute | this_YAnnotRelationship_1= ruleYAnnotRelationship | this_YAnnotIdentifier_2= ruleYAnnotIdentifier )
            int alt77=3;
            switch ( input.LA(1) ) {
            case 75:
                {
                alt77=1;
                }
                break;
            case 76:
                {
                alt77=2;
                }
                break;
            case 78:
                {
                alt77=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }

            switch (alt77) {
                case 1 :
                    // InternalLang.g:4440:3: this_YAnnotAttribute_0= ruleYAnnotAttribute
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
                    // InternalLang.g:4449:3: this_YAnnotRelationship_1= ruleYAnnotRelationship
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
                    // InternalLang.g:4458:3: this_YAnnotIdentifier_2= ruleYAnnotIdentifier
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
    // InternalLang.g:4470:1: entryRuleYAnnotExpression returns [EObject current=null] : iv_ruleYAnnotExpression= ruleYAnnotExpression EOF ;
    public final EObject entryRuleYAnnotExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotExpression = null;


        try {
            // InternalLang.g:4470:57: (iv_ruleYAnnotExpression= ruleYAnnotExpression EOF )
            // InternalLang.g:4471:2: iv_ruleYAnnotExpression= ruleYAnnotExpression EOF
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
    // InternalLang.g:4477:1: ruleYAnnotExpression returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) ;
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
            // InternalLang.g:4483:2: ( ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) ) )
            // InternalLang.g:4484:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            {
            // InternalLang.g:4484:2: ( ( () ( (lv_value_1_0= ruleValidID ) ) ) | ( () ( (lv_value_3_0= RULE_STRING ) ) ) | ( () ( (lv_value_5_0= ruleNumber ) ) ) | ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) ) | ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' ) )
            int alt81=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt81=1;
                }
                break;
            case RULE_STRING:
                {
                alt81=2;
                }
                break;
            case RULE_INT:
                {
                alt81=3;
                }
                break;
            case 46:
            case 47:
                {
                alt81=4;
                }
                break;
            case 79:
                {
                alt81=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // InternalLang.g:4485:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    {
                    // InternalLang.g:4485:3: ( () ( (lv_value_1_0= ruleValidID ) ) )
                    // InternalLang.g:4486:4: () ( (lv_value_1_0= ruleValidID ) )
                    {
                    // InternalLang.g:4486:4: ()
                    // InternalLang.g:4487:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:4493:4: ( (lv_value_1_0= ruleValidID ) )
                    // InternalLang.g:4494:5: (lv_value_1_0= ruleValidID )
                    {
                    // InternalLang.g:4494:5: (lv_value_1_0= ruleValidID )
                    // InternalLang.g:4495:6: lv_value_1_0= ruleValidID
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
                    // InternalLang.g:4514:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    {
                    // InternalLang.g:4514:3: ( () ( (lv_value_3_0= RULE_STRING ) ) )
                    // InternalLang.g:4515:4: () ( (lv_value_3_0= RULE_STRING ) )
                    {
                    // InternalLang.g:4515:4: ()
                    // InternalLang.g:4516:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:4522:4: ( (lv_value_3_0= RULE_STRING ) )
                    // InternalLang.g:4523:5: (lv_value_3_0= RULE_STRING )
                    {
                    // InternalLang.g:4523:5: (lv_value_3_0= RULE_STRING )
                    // InternalLang.g:4524:6: lv_value_3_0= RULE_STRING
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
                    // InternalLang.g:4542:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    {
                    // InternalLang.g:4542:3: ( () ( (lv_value_5_0= ruleNumber ) ) )
                    // InternalLang.g:4543:4: () ( (lv_value_5_0= ruleNumber ) )
                    {
                    // InternalLang.g:4543:4: ()
                    // InternalLang.g:4544:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:4550:4: ( (lv_value_5_0= ruleNumber ) )
                    // InternalLang.g:4551:5: (lv_value_5_0= ruleNumber )
                    {
                    // InternalLang.g:4551:5: (lv_value_5_0= ruleNumber )
                    // InternalLang.g:4552:6: lv_value_5_0= ruleNumber
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
                    // InternalLang.g:4571:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    {
                    // InternalLang.g:4571:3: ( () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) ) )
                    // InternalLang.g:4572:4: () ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    {
                    // InternalLang.g:4572:4: ()
                    // InternalLang.g:4573:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:4579:4: ( ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) ) )
                    // InternalLang.g:4580:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    {
                    // InternalLang.g:4580:5: ( (lv_value_7_1= 'true' | lv_value_7_2= 'false' ) )
                    // InternalLang.g:4581:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    {
                    // InternalLang.g:4581:6: (lv_value_7_1= 'true' | lv_value_7_2= 'false' )
                    int alt78=2;
                    int LA78_0 = input.LA(1);

                    if ( (LA78_0==46) ) {
                        alt78=1;
                    }
                    else if ( (LA78_0==47) ) {
                        alt78=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return current;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 78, 0, input);

                        throw nvae;
                    }
                    switch (alt78) {
                        case 1 :
                            // InternalLang.g:4582:7: lv_value_7_1= 'true'
                            {
                            lv_value_7_1=(Token)match(input,46,FOLLOW_2); if (state.failed) return current;
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
                            // InternalLang.g:4593:7: lv_value_7_2= 'false'
                            {
                            lv_value_7_2=(Token)match(input,47,FOLLOW_2); if (state.failed) return current;
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
                    // InternalLang.g:4608:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    {
                    // InternalLang.g:4608:3: ( () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']' )
                    // InternalLang.g:4609:4: () ( ( '[' )=>otherlv_9= '[' ) ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )? otherlv_13= ']'
                    {
                    // InternalLang.g:4609:4: ()
                    // InternalLang.g:4610:5: 
                    {
                    if ( state.backtracking==0 ) {

                      					current = forceCreateModelElement(
                      						grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0(),
                      						current);
                      				
                    }

                    }

                    // InternalLang.g:4616:4: ( ( '[' )=>otherlv_9= '[' )
                    // InternalLang.g:4617:5: ( '[' )=>otherlv_9= '['
                    {
                    otherlv_9=(Token)match(input,79,FOLLOW_70); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_9, grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0());
                      				
                    }

                    }

                    // InternalLang.g:4624:4: ( ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )* )?
                    int alt80=2;
                    int LA80_0 = input.LA(1);

                    if ( ((LA80_0>=RULE_INT && LA80_0<=RULE_ID)||(LA80_0>=46 && LA80_0<=47)||LA80_0==79) ) {
                        alt80=1;
                    }
                    switch (alt80) {
                        case 1 :
                            // InternalLang.g:4625:5: ( (lv_elements_10_0= ruleYAnnotExpression ) ) (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            {
                            // InternalLang.g:4625:5: ( (lv_elements_10_0= ruleYAnnotExpression ) )
                            // InternalLang.g:4626:6: (lv_elements_10_0= ruleYAnnotExpression )
                            {
                            // InternalLang.g:4626:6: (lv_elements_10_0= ruleYAnnotExpression )
                            // InternalLang.g:4627:7: lv_elements_10_0= ruleYAnnotExpression
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_0_0());
                              						
                            }
                            pushFollow(FOLLOW_71);
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

                            // InternalLang.g:4644:5: (otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) ) )*
                            loop79:
                            do {
                                int alt79=2;
                                int LA79_0 = input.LA(1);

                                if ( (LA79_0==21) ) {
                                    alt79=1;
                                }


                                switch (alt79) {
                            	case 1 :
                            	    // InternalLang.g:4645:6: otherlv_11= ',' ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    {
                            	    otherlv_11=(Token)match(input,21,FOLLOW_69); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_11, grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:4649:6: ( (lv_elements_12_0= ruleYAnnotExpression ) )
                            	    // InternalLang.g:4650:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    {
                            	    // InternalLang.g:4650:7: (lv_elements_12_0= ruleYAnnotExpression )
                            	    // InternalLang.g:4651:8: lv_elements_12_0= ruleYAnnotExpression
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_71);
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
                            	    break loop79;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_13=(Token)match(input,80,FOLLOW_2); if (state.failed) return current;
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
    // InternalLang.g:4679:1: entryRuleYAnnotTechnicalDesign returns [EObject current=null] : iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF ;
    public final EObject entryRuleYAnnotTechnicalDesign() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTechnicalDesign = null;


        try {
            // InternalLang.g:4679:62: (iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF )
            // InternalLang.g:4680:2: iv_ruleYAnnotTechnicalDesign= ruleYAnnotTechnicalDesign EOF
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
    // InternalLang.g:4686:1: ruleYAnnotTechnicalDesign returns [EObject current=null] : ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) ;
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
            // InternalLang.g:4692:2: ( ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' ) )
            // InternalLang.g:4693:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            {
            // InternalLang.g:4693:2: ( () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}' )
            // InternalLang.g:4694:3: () otherlv_1= '@td' otherlv_2= 'database' ( (otherlv_3= RULE_ID ) ) otherlv_4= '{' ( (lv_features_5_0= ruleYAnnotTable ) )* otherlv_6= '}'
            {
            // InternalLang.g:4694:3: ()
            // InternalLang.g:4695:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,81,FOLLOW_72); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTechnicalDesignAccess().getTdKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,82,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseKeyword_2());
              		
            }
            // InternalLang.g:4709:3: ( (otherlv_3= RULE_ID ) )
            // InternalLang.g:4710:4: (otherlv_3= RULE_ID )
            {
            // InternalLang.g:4710:4: (otherlv_3= RULE_ID )
            // InternalLang.g:4711:5: otherlv_3= RULE_ID
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotTechnicalDesignRule());
              					}
              				
            }
            otherlv_3=(Token)match(input,RULE_ID,FOLLOW_9); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					newLeafNode(otherlv_3, grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseCrossReference_3_0());
              				
            }

            }


            }

            otherlv_4=(Token)match(input,16,FOLLOW_73); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_4, grammarAccess.getYAnnotTechnicalDesignAccess().getLeftCurlyBracketKeyword_4());
              		
            }
            // InternalLang.g:4726:3: ( (lv_features_5_0= ruleYAnnotTable ) )*
            loop82:
            do {
                int alt82=2;
                int LA82_0 = input.LA(1);

                if ( (LA82_0==83) ) {
                    alt82=1;
                }


                switch (alt82) {
            	case 1 :
            	    // InternalLang.g:4727:4: (lv_features_5_0= ruleYAnnotTable )
            	    {
            	    // InternalLang.g:4727:4: (lv_features_5_0= ruleYAnnotTable )
            	    // InternalLang.g:4728:5: lv_features_5_0= ruleYAnnotTable
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesYAnnotTableParserRuleCall_5_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_73);
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
            	    break loop82;
                }
            } while (true);

            otherlv_6=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalLang.g:4753:1: entryRuleYAnnotTable returns [EObject current=null] : iv_ruleYAnnotTable= ruleYAnnotTable EOF ;
    public final EObject entryRuleYAnnotTable() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotTable = null;


        try {
            // InternalLang.g:4753:52: (iv_ruleYAnnotTable= ruleYAnnotTable EOF )
            // InternalLang.g:4754:2: iv_ruleYAnnotTable= ruleYAnnotTable EOF
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
    // InternalLang.g:4760:1: ruleYAnnotTable returns [EObject current=null] : ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) ;
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
            // InternalLang.g:4766:2: ( ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' ) )
            // InternalLang.g:4767:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            {
            // InternalLang.g:4767:2: ( () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}' )
            // InternalLang.g:4768:3: () otherlv_1= '@table' ( (lv_name_2_0= ruleValidID ) ) otherlv_3= '->' ( ( ruleQualifiedName ) ) otherlv_5= '{' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )* ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )? ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )* otherlv_9= '}'
            {
            // InternalLang.g:4768:3: ()
            // InternalLang.g:4769:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,83,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotTableAccess().getTableKeyword_1());
              		
            }
            // InternalLang.g:4779:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:4780:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:4780:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:4781:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotTableAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_57);
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

            otherlv_3=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotTableAccess().getHyphenMinusGreaterThanSignKeyword_3());
              		
            }
            // InternalLang.g:4802:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:4803:4: ( ruleQualifiedName )
            {
            // InternalLang.g:4803:4: ( ruleQualifiedName )
            // InternalLang.g:4804:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotTableRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityCrossReference_4_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_74); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_5, grammarAccess.getYAnnotTableAccess().getLeftCurlyBracketKeyword_5());
              		
            }
            // InternalLang.g:4822:3: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )*
            loop83:
            do {
                int alt83=2;
                int LA83_0 = input.LA(1);

                if ( (LA83_0==95) ) {
                    alt83=1;
                }


                switch (alt83) {
            	case 1 :
            	    // InternalLang.g:4823:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalLang.g:4823:4: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalLang.g:4824:5: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getColumnsYAnnotAbstractColumnParserRuleCall_6_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_74);
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
            	    break loop83;
                }
            } while (true);

            // InternalLang.g:4841:3: ( (lv_primarykey_7_0= ruleYAnnotPrimaryKey ) )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==96) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // InternalLang.g:4842:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    {
                    // InternalLang.g:4842:4: (lv_primarykey_7_0= ruleYAnnotPrimaryKey )
                    // InternalLang.g:4843:5: lv_primarykey_7_0= ruleYAnnotPrimaryKey
                    {
                    if ( state.backtracking==0 ) {

                      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getPrimarykeyYAnnotPrimaryKeyParserRuleCall_7_0());
                      				
                    }
                    pushFollow(FOLLOW_75);
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

            // InternalLang.g:4860:3: ( (lv_foreignkeys_8_0= ruleYAnnotForeignKey ) )*
            loop85:
            do {
                int alt85=2;
                int LA85_0 = input.LA(1);

                if ( (LA85_0==97) ) {
                    alt85=1;
                }


                switch (alt85) {
            	case 1 :
            	    // InternalLang.g:4861:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    {
            	    // InternalLang.g:4861:4: (lv_foreignkeys_8_0= ruleYAnnotForeignKey )
            	    // InternalLang.g:4862:5: lv_foreignkeys_8_0= ruleYAnnotForeignKey
            	    {
            	    if ( state.backtracking==0 ) {

            	      					newCompositeNode(grammarAccess.getYAnnotTableAccess().getForeignkeysYAnnotForeignKeyParserRuleCall_8_0());
            	      				
            	    }
            	    pushFollow(FOLLOW_75);
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
            	    break loop85;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_2); if (state.failed) return current;
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
    // InternalLang.g:4887:1: entryRuleYAnnotColumn returns [EObject current=null] : iv_ruleYAnnotColumn= ruleYAnnotColumn EOF ;
    public final EObject entryRuleYAnnotColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumn = null;


        try {
            // InternalLang.g:4887:53: (iv_ruleYAnnotColumn= ruleYAnnotColumn EOF )
            // InternalLang.g:4888:2: iv_ruleYAnnotColumn= ruleYAnnotColumn EOF
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
    // InternalLang.g:4894:1: ruleYAnnotColumn returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) ;
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
            // InternalLang.g:4900:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? ) )
            // InternalLang.g:4901:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            {
            // InternalLang.g:4901:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )? )
            // InternalLang.g:4902:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) otherlv_3= 'as' ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) ) ( (lv_optional_5_0= '?' ) )? ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )? (otherlv_11= ';' )?
            {
            // InternalLang.g:4902:3: ()
            // InternalLang.g:4903:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotColumnAccess().getYAnnotColumnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotColumnAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLang.g:4913:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:4914:4: ( ruleQualifiedName )
            {
            // InternalLang.g:4914:4: ( ruleQualifiedName )
            // InternalLang.g:4915:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotColumnRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_76);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,84,FOLLOW_77); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotColumnAccess().getAsKeyword_3());
              		
            }
            // InternalLang.g:4933:3: ( ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) ) )
            // InternalLang.g:4934:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            {
            // InternalLang.g:4934:4: ( (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' ) )
            // InternalLang.g:4935:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            {
            // InternalLang.g:4935:5: (lv_type_4_1= 'VARCHAR' | lv_type_4_2= 'CHAR' | lv_type_4_3= 'INTEGER' | lv_type_4_4= 'BIGINT' | lv_type_4_5= 'SMALLINT' | lv_type_4_6= 'DECIMAL' | lv_type_4_7= 'TIME' | lv_type_4_8= 'DATE' | lv_type_4_9= 'TIMESTAMP' | lv_type_4_10= 'BOOLEAN' )
            int alt86=10;
            switch ( input.LA(1) ) {
            case 85:
                {
                alt86=1;
                }
                break;
            case 86:
                {
                alt86=2;
                }
                break;
            case 87:
                {
                alt86=3;
                }
                break;
            case 88:
                {
                alt86=4;
                }
                break;
            case 89:
                {
                alt86=5;
                }
                break;
            case 90:
                {
                alt86=6;
                }
                break;
            case 91:
                {
                alt86=7;
                }
                break;
            case 92:
                {
                alt86=8;
                }
                break;
            case 93:
                {
                alt86=9;
                }
                break;
            case 94:
                {
                alt86=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 86, 0, input);

                throw nvae;
            }

            switch (alt86) {
                case 1 :
                    // InternalLang.g:4936:6: lv_type_4_1= 'VARCHAR'
                    {
                    lv_type_4_1=(Token)match(input,85,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:4947:6: lv_type_4_2= 'CHAR'
                    {
                    lv_type_4_2=(Token)match(input,86,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:4958:6: lv_type_4_3= 'INTEGER'
                    {
                    lv_type_4_3=(Token)match(input,87,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:4969:6: lv_type_4_4= 'BIGINT'
                    {
                    lv_type_4_4=(Token)match(input,88,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:4980:6: lv_type_4_5= 'SMALLINT'
                    {
                    lv_type_4_5=(Token)match(input,89,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:4991:6: lv_type_4_6= 'DECIMAL'
                    {
                    lv_type_4_6=(Token)match(input,90,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:5002:6: lv_type_4_7= 'TIME'
                    {
                    lv_type_4_7=(Token)match(input,91,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:5013:6: lv_type_4_8= 'DATE'
                    {
                    lv_type_4_8=(Token)match(input,92,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:5024:6: lv_type_4_9= 'TIMESTAMP'
                    {
                    lv_type_4_9=(Token)match(input,93,FOLLOW_63); if (state.failed) return current;
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
                    // InternalLang.g:5035:6: lv_type_4_10= 'BOOLEAN'
                    {
                    lv_type_4_10=(Token)match(input,94,FOLLOW_63); if (state.failed) return current;
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

            // InternalLang.g:5048:3: ( (lv_optional_5_0= '?' ) )?
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==19) ) {
                alt87=1;
            }
            switch (alt87) {
                case 1 :
                    // InternalLang.g:5049:4: (lv_optional_5_0= '?' )
                    {
                    // InternalLang.g:5049:4: (lv_optional_5_0= '?' )
                    // InternalLang.g:5050:5: lv_optional_5_0= '?'
                    {
                    lv_optional_5_0=(Token)match(input,19,FOLLOW_64); if (state.failed) return current;
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

            // InternalLang.g:5062:3: ( ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')' )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==24) && (synpred13_InternalLang())) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // InternalLang.g:5063:4: ( ( '(' )=>otherlv_6= '(' ) ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )? otherlv_10= ')'
                    {
                    // InternalLang.g:5063:4: ( ( '(' )=>otherlv_6= '(' )
                    // InternalLang.g:5064:5: ( '(' )=>otherlv_6= '('
                    {
                    otherlv_6=(Token)match(input,24,FOLLOW_22); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      					newLeafNode(otherlv_6, grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0());
                      				
                    }

                    }

                    // InternalLang.g:5070:4: ( ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )* )?
                    int alt89=2;
                    int LA89_0 = input.LA(1);

                    if ( (LA89_0==RULE_ID) && (synpred14_InternalLang())) {
                        alt89=1;
                    }
                    switch (alt89) {
                        case 1 :
                            // InternalLang.g:5071:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) ) (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            {
                            // InternalLang.g:5071:5: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair ) )
                            // InternalLang.g:5072:6: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            {
                            // InternalLang.g:5081:6: (lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair )
                            // InternalLang.g:5082:7: lv_elementValuePairs_7_0= ruleYAnnotationElementValuePair
                            {
                            if ( state.backtracking==0 ) {

                              							newCompositeNode(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_0_0());
                              						
                            }
                            pushFollow(FOLLOW_23);
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

                            // InternalLang.g:5099:5: (otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) ) )*
                            loop88:
                            do {
                                int alt88=2;
                                int LA88_0 = input.LA(1);

                                if ( (LA88_0==21) ) {
                                    alt88=1;
                                }


                                switch (alt88) {
                            	case 1 :
                            	    // InternalLang.g:5100:6: otherlv_8= ',' ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    {
                            	    otherlv_8=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
                            	    if ( state.backtracking==0 ) {

                            	      						newLeafNode(otherlv_8, grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0());
                            	      					
                            	    }
                            	    // InternalLang.g:5104:6: ( ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair ) )
                            	    // InternalLang.g:5105:7: ( ( ( ( ruleValidID ) ) '=' ) )=> (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    {
                            	    // InternalLang.g:5114:7: (lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair )
                            	    // InternalLang.g:5115:8: lv_elementValuePairs_9_0= ruleYAnnotationElementValuePair
                            	    {
                            	    if ( state.backtracking==0 ) {

                            	      								newCompositeNode(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_1_1_0());
                            	      							
                            	    }
                            	    pushFollow(FOLLOW_23);
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
                            	    break loop88;
                                }
                            } while (true);


                            }
                            break;

                    }

                    otherlv_10=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_10, grammarAccess.getYAnnotColumnAccess().getRightParenthesisKeyword_6_2());
                      			
                    }

                    }
                    break;

            }

            // InternalLang.g:5139:3: (otherlv_11= ';' )?
            int alt91=2;
            int LA91_0 = input.LA(1);

            if ( (LA91_0==12) ) {
                alt91=1;
            }
            switch (alt91) {
                case 1 :
                    // InternalLang.g:5140:4: otherlv_11= ';'
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
    // InternalLang.g:5149:1: entryRuleYAnnotColumnLike returns [EObject current=null] : iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF ;
    public final EObject entryRuleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotColumnLike = null;


        try {
            // InternalLang.g:5149:57: (iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF )
            // InternalLang.g:5150:2: iv_ruleYAnnotColumnLike= ruleYAnnotColumnLike EOF
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
    // InternalLang.g:5156:1: ruleYAnnotColumnLike returns [EObject current=null] : ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotColumnLike() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;


        	enterRule();

        try {
            // InternalLang.g:5162:2: ( ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? ) )
            // InternalLang.g:5163:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            {
            // InternalLang.g:5163:2: ( () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )? )
            // InternalLang.g:5164:3: () otherlv_1= '->' ( ( ruleQualifiedName ) ) (otherlv_3= ';' )?
            {
            // InternalLang.g:5164:3: ()
            // InternalLang.g:5165:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotColumnLikeAccess().getYAnnotColumnLikeAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,26,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotColumnLikeAccess().getHyphenMinusGreaterThanSignKeyword_1());
              		
            }
            // InternalLang.g:5175:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:5176:4: ( ruleQualifiedName )
            {
            // InternalLang.g:5176:4: ( ruleQualifiedName )
            // InternalLang.g:5177:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotColumnLikeRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_26);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            // InternalLang.g:5191:3: (otherlv_3= ';' )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==12) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // InternalLang.g:5192:4: otherlv_3= ';'
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
    // InternalLang.g:5201:1: entryRuleYAnnotAbstractColumn returns [EObject current=null] : iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF ;
    public final EObject entryRuleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotAbstractColumn = null;


        try {
            // InternalLang.g:5201:61: (iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF )
            // InternalLang.g:5202:2: iv_ruleYAnnotAbstractColumn= ruleYAnnotAbstractColumn EOF
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
    // InternalLang.g:5208:1: ruleYAnnotAbstractColumn returns [EObject current=null] : ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) ;
    public final EObject ruleYAnnotAbstractColumn() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_type_3_1 = null;

        EObject lv_type_3_2 = null;



        	enterRule();

        try {
            // InternalLang.g:5214:2: ( ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) ) )
            // InternalLang.g:5215:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            {
            // InternalLang.g:5215:2: ( () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) ) )
            // InternalLang.g:5216:3: () otherlv_1= '@column' ( (lv_name_2_0= ruleValidID ) ) ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            {
            // InternalLang.g:5216:3: ()
            // InternalLang.g:5217:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,95,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1());
              		
            }
            // InternalLang.g:5227:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:5228:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:5228:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:5229:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotAbstractColumnAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_57);
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

            // InternalLang.g:5246:3: ( ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) ) )
            // InternalLang.g:5247:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            {
            // InternalLang.g:5247:4: ( (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike ) )
            // InternalLang.g:5248:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            {
            // InternalLang.g:5248:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )
            int alt93=2;
            alt93 = dfa93.predict(input);
            switch (alt93) {
                case 1 :
                    // InternalLang.g:5249:6: lv_type_3_1= ruleYAnnotColumn
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
                    // InternalLang.g:5265:6: lv_type_3_2= ruleYAnnotColumnLike
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
    // InternalLang.g:5287:1: entryRuleYAnnotPrimaryKey returns [EObject current=null] : iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF ;
    public final EObject entryRuleYAnnotPrimaryKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotPrimaryKey = null;


        try {
            // InternalLang.g:5287:57: (iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF )
            // InternalLang.g:5288:2: iv_ruleYAnnotPrimaryKey= ruleYAnnotPrimaryKey EOF
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
    // InternalLang.g:5294:1: ruleYAnnotPrimaryKey returns [EObject current=null] : ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) ;
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
            // InternalLang.g:5300:2: ( ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? ) )
            // InternalLang.g:5301:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            {
            // InternalLang.g:5301:2: ( () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )? )
            // InternalLang.g:5302:3: () otherlv_1= '@primary' otherlv_2= '(' ( (otherlv_3= RULE_ID ) )* (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )* otherlv_6= ')' (otherlv_7= ';' )?
            {
            // InternalLang.g:5302:3: ()
            // InternalLang.g:5303:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,96,FOLLOW_21); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,24,FOLLOW_78); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotPrimaryKeyAccess().getLeftParenthesisKeyword_2());
              		
            }
            // InternalLang.g:5317:3: ( (otherlv_3= RULE_ID ) )*
            loop94:
            do {
                int alt94=2;
                int LA94_0 = input.LA(1);

                if ( (LA94_0==RULE_ID) ) {
                    alt94=1;
                }


                switch (alt94) {
            	case 1 :
            	    // InternalLang.g:5318:4: (otherlv_3= RULE_ID )
            	    {
            	    // InternalLang.g:5318:4: (otherlv_3= RULE_ID )
            	    // InternalLang.g:5319:5: otherlv_3= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      					if (current==null) {
            	      						current = createModelElement(grammarAccess.getYAnnotPrimaryKeyRule());
            	      					}
            	      				
            	    }
            	    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_78); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					newLeafNode(otherlv_3, grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0());
            	      				
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop94;
                }
            } while (true);

            // InternalLang.g:5330:3: (otherlv_4= ',' ( (otherlv_5= RULE_ID ) ) )*
            loop95:
            do {
                int alt95=2;
                int LA95_0 = input.LA(1);

                if ( (LA95_0==21) ) {
                    alt95=1;
                }


                switch (alt95) {
            	case 1 :
            	    // InternalLang.g:5331:4: otherlv_4= ',' ( (otherlv_5= RULE_ID ) )
            	    {
            	    otherlv_4=(Token)match(input,21,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_4, grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0());
            	      			
            	    }
            	    // InternalLang.g:5335:4: ( (otherlv_5= RULE_ID ) )
            	    // InternalLang.g:5336:5: (otherlv_5= RULE_ID )
            	    {
            	    // InternalLang.g:5336:5: (otherlv_5= RULE_ID )
            	    // InternalLang.g:5337:6: otherlv_5= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      						if (current==null) {
            	      							current = createModelElement(grammarAccess.getYAnnotPrimaryKeyRule());
            	      						}
            	      					
            	    }
            	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_23); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      						newLeafNode(otherlv_5, grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_4_1_0());
            	      					
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop95;
                }
            } while (true);

            otherlv_6=(Token)match(input,25,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_6, grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5());
              		
            }
            // InternalLang.g:5353:3: (otherlv_7= ';' )?
            int alt96=2;
            int LA96_0 = input.LA(1);

            if ( (LA96_0==12) ) {
                alt96=1;
            }
            switch (alt96) {
                case 1 :
                    // InternalLang.g:5354:4: otherlv_7= ';'
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
    // InternalLang.g:5363:1: entryRuleYAnnotForeignKey returns [EObject current=null] : iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF ;
    public final EObject entryRuleYAnnotForeignKey() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotForeignKey = null;


        try {
            // InternalLang.g:5363:57: (iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF )
            // InternalLang.g:5364:2: iv_ruleYAnnotForeignKey= ruleYAnnotForeignKey EOF
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
    // InternalLang.g:5370:1: ruleYAnnotForeignKey returns [EObject current=null] : ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) ;
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
            // InternalLang.g:5376:2: ( ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? ) )
            // InternalLang.g:5377:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            {
            // InternalLang.g:5377:2: ( () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )? )
            // InternalLang.g:5378:3: () otherlv_1= '@foreign' ( ( ruleQualifiedName ) ) otherlv_3= '{' ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) ) (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )* otherlv_7= '}' (otherlv_8= ';' )?
            {
            // InternalLang.g:5378:3: ()
            // InternalLang.g:5379:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,97,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1());
              		
            }
            // InternalLang.g:5389:3: ( ( ruleQualifiedName ) )
            // InternalLang.g:5390:4: ( ruleQualifiedName )
            {
            // InternalLang.g:5390:4: ( ruleQualifiedName )
            // InternalLang.g:5391:5: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {

              					if (current==null) {
              						current = createModelElement(grammarAccess.getYAnnotForeignKeyRule());
              					}
              				
            }
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipCrossReference_2_0());
              				
            }
            pushFollow(FOLLOW_9);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              					afterParserOrEnumRuleCall();
              				
            }

            }


            }

            otherlv_3=(Token)match(input,16,FOLLOW_79); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_3, grammarAccess.getYAnnotForeignKeyAccess().getLeftCurlyBracketKeyword_3());
              		
            }
            // InternalLang.g:5409:3: ( (lv_columns_4_0= ruleYAnnotAbstractColumn ) )
            // InternalLang.g:5410:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            {
            // InternalLang.g:5410:4: (lv_columns_4_0= ruleYAnnotAbstractColumn )
            // InternalLang.g:5411:5: lv_columns_4_0= ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_4_0());
              				
            }
            pushFollow(FOLLOW_80);
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

            // InternalLang.g:5428:3: (otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) ) )*
            loop97:
            do {
                int alt97=2;
                int LA97_0 = input.LA(1);

                if ( (LA97_0==21) ) {
                    alt97=1;
                }


                switch (alt97) {
            	case 1 :
            	    // InternalLang.g:5429:4: otherlv_5= ',' ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    {
            	    otherlv_5=(Token)match(input,21,FOLLOW_79); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      				newLeafNode(otherlv_5, grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0());
            	      			
            	    }
            	    // InternalLang.g:5433:4: ( (lv_columns_6_0= ruleYAnnotAbstractColumn ) )
            	    // InternalLang.g:5434:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    {
            	    // InternalLang.g:5434:5: (lv_columns_6_0= ruleYAnnotAbstractColumn )
            	    // InternalLang.g:5435:6: lv_columns_6_0= ruleYAnnotAbstractColumn
            	    {
            	    if ( state.backtracking==0 ) {

            	      						newCompositeNode(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_5_1_0());
            	      					
            	    }
            	    pushFollow(FOLLOW_80);
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
            	    break loop97;
                }
            } while (true);

            otherlv_7=(Token)match(input,17,FOLLOW_26); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_7, grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6());
              		
            }
            // InternalLang.g:5457:3: (otherlv_8= ';' )?
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==12) ) {
                alt98=1;
            }
            switch (alt98) {
                case 1 :
                    // InternalLang.g:5458:4: otherlv_8= ';'
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
    // InternalLang.g:5467:1: entryRuleYAnnotJava returns [EObject current=null] : iv_ruleYAnnotJava= ruleYAnnotJava EOF ;
    public final EObject entryRuleYAnnotJava() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotJava = null;


        try {
            // InternalLang.g:5467:51: (iv_ruleYAnnotJava= ruleYAnnotJava EOF )
            // InternalLang.g:5468:2: iv_ruleYAnnotJava= ruleYAnnotJava EOF
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
    // InternalLang.g:5474:1: ruleYAnnotJava returns [EObject current=null] : ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) ;
    public final EObject ruleYAnnotJava() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;


        	enterRule();

        try {
            // InternalLang.g:5480:2: ( ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? ) )
            // InternalLang.g:5481:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            {
            // InternalLang.g:5481:2: ( () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )? )
            // InternalLang.g:5482:3: () otherlv_1= '@java' (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )? (otherlv_4= ';' )?
            {
            // InternalLang.g:5482:3: ()
            // InternalLang.g:5483:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotJavaAccess().getYAnnotJavaAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,98,FOLLOW_81); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotJavaAccess().getJavaKeyword_1());
              		
            }
            // InternalLang.g:5493:3: (otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) ) )?
            int alt99=2;
            int LA99_0 = input.LA(1);

            if ( (LA99_0==99) ) {
                alt99=1;
            }
            switch (alt99) {
                case 1 :
                    // InternalLang.g:5494:4: otherlv_2= 'uses' ( (otherlv_3= RULE_ID ) )
                    {
                    otherlv_2=(Token)match(input,99,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_2, grammarAccess.getYAnnotJavaAccess().getUsesKeyword_2_0());
                      			
                    }
                    // InternalLang.g:5498:4: ( (otherlv_3= RULE_ID ) )
                    // InternalLang.g:5499:5: (otherlv_3= RULE_ID )
                    {
                    // InternalLang.g:5499:5: (otherlv_3= RULE_ID )
                    // InternalLang.g:5500:6: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotJavaRule());
                      						}
                      					
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_3, grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseCrossReference_2_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLang.g:5512:3: (otherlv_4= ';' )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==12) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // InternalLang.g:5513:4: otherlv_4= ';'
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
    // InternalLang.g:5522:1: entryRuleYAnnotSwift returns [EObject current=null] : iv_ruleYAnnotSwift= ruleYAnnotSwift EOF ;
    public final EObject entryRuleYAnnotSwift() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotSwift = null;


        try {
            // InternalLang.g:5522:52: (iv_ruleYAnnotSwift= ruleYAnnotSwift EOF )
            // InternalLang.g:5523:2: iv_ruleYAnnotSwift= ruleYAnnotSwift EOF
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
    // InternalLang.g:5529:1: ruleYAnnotSwift returns [EObject current=null] : ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) ;
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
            // InternalLang.g:5535:2: ( ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? ) )
            // InternalLang.g:5536:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            {
            // InternalLang.g:5536:2: ( () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )? )
            // InternalLang.g:5537:3: () otherlv_1= '@swift' otherlv_2= 'module' ( (lv_name_3_0= ruleValidID ) ) (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )? (otherlv_6= ';' )?
            {
            // InternalLang.g:5537:3: ()
            // InternalLang.g:5538:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotSwiftAccess().getYAnnotSwiftAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,100,FOLLOW_82); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotSwiftAccess().getSwiftKeyword_1());
              		
            }
            otherlv_2=(Token)match(input,101,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_2, grammarAccess.getYAnnotSwiftAccess().getModuleKeyword_2());
              		
            }
            // InternalLang.g:5552:3: ( (lv_name_3_0= ruleValidID ) )
            // InternalLang.g:5553:4: (lv_name_3_0= ruleValidID )
            {
            // InternalLang.g:5553:4: (lv_name_3_0= ruleValidID )
            // InternalLang.g:5554:5: lv_name_3_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotSwiftAccess().getNameValidIDParserRuleCall_3_0());
              				
            }
            pushFollow(FOLLOW_81);
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

            // InternalLang.g:5571:3: (otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) ) )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==99) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // InternalLang.g:5572:4: otherlv_4= 'uses' ( (otherlv_5= RULE_ID ) )
                    {
                    otherlv_4=(Token)match(input,99,FOLLOW_3); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				newLeafNode(otherlv_4, grammarAccess.getYAnnotSwiftAccess().getUsesKeyword_4_0());
                      			
                    }
                    // InternalLang.g:5576:4: ( (otherlv_5= RULE_ID ) )
                    // InternalLang.g:5577:5: (otherlv_5= RULE_ID )
                    {
                    // InternalLang.g:5577:5: (otherlv_5= RULE_ID )
                    // InternalLang.g:5578:6: otherlv_5= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      						if (current==null) {
                      							current = createModelElement(grammarAccess.getYAnnotSwiftRule());
                      						}
                      					
                    }
                    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_26); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      						newLeafNode(otherlv_5, grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseCrossReference_4_1_0());
                      					
                    }

                    }


                    }


                    }
                    break;

            }

            // InternalLang.g:5590:3: (otherlv_6= ';' )?
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==12) ) {
                alt102=1;
            }
            switch (alt102) {
                case 1 :
                    // InternalLang.g:5591:4: otherlv_6= ';'
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
    // InternalLang.g:5600:1: entryRuleYAnnotDatabase returns [EObject current=null] : iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF ;
    public final EObject entryRuleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleYAnnotDatabase = null;


        try {
            // InternalLang.g:5600:55: (iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF )
            // InternalLang.g:5601:2: iv_ruleYAnnotDatabase= ruleYAnnotDatabase EOF
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
    // InternalLang.g:5607:1: ruleYAnnotDatabase returns [EObject current=null] : ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) ;
    public final EObject ruleYAnnotDatabase() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;



        	enterRule();

        try {
            // InternalLang.g:5613:2: ( ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? ) )
            // InternalLang.g:5614:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            {
            // InternalLang.g:5614:2: ( () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )? )
            // InternalLang.g:5615:3: () otherlv_1= '@database' ( (lv_name_2_0= ruleValidID ) ) (otherlv_3= ';' )?
            {
            // InternalLang.g:5615:3: ()
            // InternalLang.g:5616:4: 
            {
            if ( state.backtracking==0 ) {

              				current = forceCreateModelElement(
              					grammarAccess.getYAnnotDatabaseAccess().getYAnnotDatabaseAction_0(),
              					current);
              			
            }

            }

            otherlv_1=(Token)match(input,102,FOLLOW_3); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(otherlv_1, grammarAccess.getYAnnotDatabaseAccess().getDatabaseKeyword_1());
              		
            }
            // InternalLang.g:5626:3: ( (lv_name_2_0= ruleValidID ) )
            // InternalLang.g:5627:4: (lv_name_2_0= ruleValidID )
            {
            // InternalLang.g:5627:4: (lv_name_2_0= ruleValidID )
            // InternalLang.g:5628:5: lv_name_2_0= ruleValidID
            {
            if ( state.backtracking==0 ) {

              					newCompositeNode(grammarAccess.getYAnnotDatabaseAccess().getNameValidIDParserRuleCall_2_0());
              				
            }
            pushFollow(FOLLOW_26);
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

            // InternalLang.g:5645:3: (otherlv_3= ';' )?
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==12) ) {
                alt103=1;
            }
            switch (alt103) {
                case 1 :
                    // InternalLang.g:5646:4: otherlv_3= ';'
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
    // InternalLang.g:5655:1: entryRuleQualifiedName returns [String current=null] : iv_ruleQualifiedName= ruleQualifiedName EOF ;
    public final String entryRuleQualifiedName() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedName = null;


        try {
            // InternalLang.g:5655:53: (iv_ruleQualifiedName= ruleQualifiedName EOF )
            // InternalLang.g:5656:2: iv_ruleQualifiedName= ruleQualifiedName EOF
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
    // InternalLang.g:5662:1: ruleQualifiedName returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedName() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_ValidID_0 = null;

        AntlrDatatypeRuleToken this_ValidID_2 = null;



        	enterRule();

        try {
            // InternalLang.g:5668:2: ( (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* ) )
            // InternalLang.g:5669:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            {
            // InternalLang.g:5669:2: (this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )* )
            // InternalLang.g:5670:3: this_ValidID_0= ruleValidID ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_36);
            this_ValidID_0=ruleValidID();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_ValidID_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:5680:3: ( ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID )*
            loop104:
            do {
                int alt104=2;
                int LA104_0 = input.LA(1);

                if ( (LA104_0==34) && (synpred16_InternalLang())) {
                    alt104=1;
                }


                switch (alt104) {
            	case 1 :
            	    // InternalLang.g:5681:4: ( ( '.' )=>kw= '.' ) this_ValidID_2= ruleValidID
            	    {
            	    // InternalLang.g:5681:4: ( ( '.' )=>kw= '.' )
            	    // InternalLang.g:5682:5: ( '.' )=>kw= '.'
            	    {
            	    kw=(Token)match(input,34,FOLLOW_3); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      					current.merge(kw);
            	      					newLeafNode(kw, grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0());
            	      				
            	    }

            	    }

            	    if ( state.backtracking==0 ) {

            	      				newCompositeNode(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1());
            	      			
            	    }
            	    pushFollow(FOLLOW_36);
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
            	    break loop104;
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
    // InternalLang.g:5704:1: entryRuleQualifiedNameWithWildcard returns [String current=null] : iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF ;
    public final String entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQualifiedNameWithWildcard = null;


        try {
            // InternalLang.g:5704:65: (iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF )
            // InternalLang.g:5705:2: iv_ruleQualifiedNameWithWildcard= ruleQualifiedNameWithWildcard EOF
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
    // InternalLang.g:5711:1: ruleQualifiedNameWithWildcard returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) ;
    public final AntlrDatatypeRuleToken ruleQualifiedNameWithWildcard() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        AntlrDatatypeRuleToken this_QualifiedName_0 = null;



        	enterRule();

        try {
            // InternalLang.g:5717:2: ( (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? ) )
            // InternalLang.g:5718:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            {
            // InternalLang.g:5718:2: (this_QualifiedName_0= ruleQualifiedName (kw= '.*' )? )
            // InternalLang.g:5719:3: this_QualifiedName_0= ruleQualifiedName (kw= '.*' )?
            {
            if ( state.backtracking==0 ) {

              			newCompositeNode(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0());
              		
            }
            pushFollow(FOLLOW_83);
            this_QualifiedName_0=ruleQualifiedName();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_QualifiedName_0);
              		
            }
            if ( state.backtracking==0 ) {

              			afterParserOrEnumRuleCall();
              		
            }
            // InternalLang.g:5729:3: (kw= '.*' )?
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==103) ) {
                alt105=1;
            }
            switch (alt105) {
                case 1 :
                    // InternalLang.g:5730:4: kw= '.*'
                    {
                    kw=(Token)match(input,103,FOLLOW_2); if (state.failed) return current;
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
    // InternalLang.g:5740:1: entryRuleValidID returns [String current=null] : iv_ruleValidID= ruleValidID EOF ;
    public final String entryRuleValidID() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValidID = null;


        try {
            // InternalLang.g:5740:47: (iv_ruleValidID= ruleValidID EOF )
            // InternalLang.g:5741:2: iv_ruleValidID= ruleValidID EOF
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
    // InternalLang.g:5747:1: ruleValidID returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_ID_0= RULE_ID ;
    public final AntlrDatatypeRuleToken ruleValidID() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;


        	enterRule();

        try {
            // InternalLang.g:5753:2: (this_ID_0= RULE_ID )
            // InternalLang.g:5754:2: this_ID_0= RULE_ID
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
    // InternalLang.g:5764:1: entryRuleNumber returns [String current=null] : iv_ruleNumber= ruleNumber EOF ;
    public final String entryRuleNumber() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleNumber = null;



        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalLang.g:5766:2: (iv_ruleNumber= ruleNumber EOF )
            // InternalLang.g:5767:2: iv_ruleNumber= ruleNumber EOF
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
    // InternalLang.g:5776:1: ruleNumber returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleNumber() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_INT_0=null;
        Token kw=null;
        Token this_INT_2=null;


        	enterRule();
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalLang.g:5783:2: ( (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? ) )
            // InternalLang.g:5784:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            {
            // InternalLang.g:5784:2: (this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )? )
            // InternalLang.g:5785:3: this_INT_0= RULE_INT (kw= '.' this_INT_2= RULE_INT )?
            {
            this_INT_0=(Token)match(input,RULE_INT,FOLLOW_36); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			current.merge(this_INT_0);
              		
            }
            if ( state.backtracking==0 ) {

              			newLeafNode(this_INT_0, grammarAccess.getNumberAccess().getINTTerminalRuleCall_0());
              		
            }
            // InternalLang.g:5792:3: (kw= '.' this_INT_2= RULE_INT )?
            int alt106=2;
            int LA106_0 = input.LA(1);

            if ( (LA106_0==34) ) {
                alt106=1;
            }
            switch (alt106) {
                case 1 :
                    // InternalLang.g:5793:4: kw= '.' this_INT_2= RULE_INT
                    {
                    kw=(Token)match(input,34,FOLLOW_84); if (state.failed) return current;
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


    // $ANTLR start "ruleYAccessLevel"
    // InternalLang.g:5813:1: ruleYAccessLevel returns [Enumerator current=null] : ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) ;
    public final Enumerator ruleYAccessLevel() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;


        	enterRule();

        try {
            // InternalLang.g:5819:2: ( ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) ) )
            // InternalLang.g:5820:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            {
            // InternalLang.g:5820:2: ( (enumLiteral_0= 'private' ) | (enumLiteral_1= 'protected' ) | (enumLiteral_2= 'public' ) )
            int alt107=3;
            switch ( input.LA(1) ) {
            case 104:
                {
                alt107=1;
                }
                break;
            case 105:
                {
                alt107=2;
                }
                break;
            case 106:
                {
                alt107=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 107, 0, input);

                throw nvae;
            }

            switch (alt107) {
                case 1 :
                    // InternalLang.g:5821:3: (enumLiteral_0= 'private' )
                    {
                    // InternalLang.g:5821:3: (enumLiteral_0= 'private' )
                    // InternalLang.g:5822:4: enumLiteral_0= 'private'
                    {
                    enumLiteral_0=(Token)match(input,104,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getYAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_0, grammarAccess.getYAccessLevelAccess().getPRIVATEEnumLiteralDeclaration_0());
                      			
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalLang.g:5829:3: (enumLiteral_1= 'protected' )
                    {
                    // InternalLang.g:5829:3: (enumLiteral_1= 'protected' )
                    // InternalLang.g:5830:4: enumLiteral_1= 'protected'
                    {
                    enumLiteral_1=(Token)match(input,105,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getYAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_1, grammarAccess.getYAccessLevelAccess().getPROTECTEDEnumLiteralDeclaration_1());
                      			
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalLang.g:5837:3: (enumLiteral_2= 'public' )
                    {
                    // InternalLang.g:5837:3: (enumLiteral_2= 'public' )
                    // InternalLang.g:5838:4: enumLiteral_2= 'public'
                    {
                    enumLiteral_2=(Token)match(input,106,FOLLOW_2); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      				current = grammarAccess.getYAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                      				newLeafNode(enumLiteral_2, grammarAccess.getYAccessLevelAccess().getPUBLICEnumLiteralDeclaration_2());
                      			
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
    // $ANTLR end "ruleYAccessLevel"

    // $ANTLR start synpred1_InternalLang
    public final void synpred1_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:1186:5: ( 'else' )
        // InternalLang.g:1186:6: 'else'
        {
        match(input,30,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred1_InternalLang

    // $ANTLR start synpred2_InternalLang
    public final void synpred2_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:3802:5: ( '(' )
        // InternalLang.g:3802:6: '('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred2_InternalLang

    // $ANTLR start synpred3_InternalLang
    public final void synpred3_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:3810:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalLang.g:3810:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalLang.g:3810:7: ( ( ( ruleValidID ) ) '=' )
        // InternalLang.g:3811:7: ( ( ruleValidID ) ) '='
        {
        // InternalLang.g:3811:7: ( ( ruleValidID ) )
        // InternalLang.g:3812:8: ( ruleValidID )
        {
        // InternalLang.g:3812:8: ( ruleValidID )
        // InternalLang.g:3813:9: ruleValidID
        {
        pushFollow(FOLLOW_27);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred3_InternalLang

    // $ANTLR start synpred5_InternalLang
    public final void synpred5_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:3969:5: ( '(' )
        // InternalLang.g:3969:6: '('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred5_InternalLang

    // $ANTLR start synpred6_InternalLang
    public final void synpred6_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:3977:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalLang.g:3977:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalLang.g:3977:7: ( ( ( ruleValidID ) ) '=' )
        // InternalLang.g:3978:7: ( ( ruleValidID ) ) '='
        {
        // InternalLang.g:3978:7: ( ( ruleValidID ) )
        // InternalLang.g:3979:8: ( ruleValidID )
        {
        // InternalLang.g:3979:8: ( ruleValidID )
        // InternalLang.g:3980:9: ruleValidID
        {
        pushFollow(FOLLOW_27);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred6_InternalLang

    // $ANTLR start synpred8_InternalLang
    public final void synpred8_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:4149:5: ( '(' )
        // InternalLang.g:4149:6: '('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred8_InternalLang

    // $ANTLR start synpred9_InternalLang
    public final void synpred9_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:4157:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalLang.g:4157:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalLang.g:4157:7: ( ( ( ruleValidID ) ) '=' )
        // InternalLang.g:4158:7: ( ( ruleValidID ) ) '='
        {
        // InternalLang.g:4158:7: ( ( ruleValidID ) )
        // InternalLang.g:4159:8: ( ruleValidID )
        {
        // InternalLang.g:4159:8: ( ruleValidID )
        // InternalLang.g:4160:9: ruleValidID
        {
        pushFollow(FOLLOW_27);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred9_InternalLang

    // $ANTLR start synpred13_InternalLang
    public final void synpred13_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:5064:5: ( '(' )
        // InternalLang.g:5064:6: '('
        {
        match(input,24,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred13_InternalLang

    // $ANTLR start synpred14_InternalLang
    public final void synpred14_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:5072:6: ( ( ( ( ruleValidID ) ) '=' ) )
        // InternalLang.g:5072:7: ( ( ( ruleValidID ) ) '=' )
        {
        // InternalLang.g:5072:7: ( ( ( ruleValidID ) ) '=' )
        // InternalLang.g:5073:7: ( ( ruleValidID ) ) '='
        {
        // InternalLang.g:5073:7: ( ( ruleValidID ) )
        // InternalLang.g:5074:8: ( ruleValidID )
        {
        // InternalLang.g:5074:8: ( ruleValidID )
        // InternalLang.g:5075:9: ruleValidID
        {
        pushFollow(FOLLOW_27);
        ruleValidID();

        state._fsp--;
        if (state.failed) return ;

        }


        }

        match(input,27,FOLLOW_2); if (state.failed) return ;

        }


        }
    }
    // $ANTLR end synpred14_InternalLang

    // $ANTLR start synpred16_InternalLang
    public final void synpred16_InternalLang_fragment() throws RecognitionException {   
        // InternalLang.g:5682:5: ( '.' )
        // InternalLang.g:5682:6: '.'
        {
        match(input,34,FOLLOW_2); if (state.failed) return ;

        }
    }
    // $ANTLR end synpred16_InternalLang

    // Delegated rules

    public final boolean synpred8_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred9_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred13_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred14_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred16_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_InternalLang() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_InternalLang_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA24 dfa24 = new DFA24(this);
    protected DFA30 dfa30 = new DFA30(this);
    protected DFA93 dfa93 = new DFA93(this);
    static final String dfa_1s = "\21\uffff";
    static final String dfa_2s = "\1\uffff\1\15\17\uffff";
    static final String dfa_3s = "\2\4\17\uffff";
    static final String dfa_4s = "\2\107\17\uffff";
    static final String dfa_5s = "\2\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\1";
    static final String dfa_6s = "\21\uffff}>";
    static final String[] dfa_7s = {
            "\2\15\1\1\25\uffff\1\2\1\16\1\uffff\1\17\16\uffff\6\15\1\3\3\uffff\1\11\1\uffff\1\4\2\uffff\1\5\1\10\1\6\1\uffff\1\7\3\uffff\1\12\1\13\1\14",
            "\3\15\5\uffff\1\15\1\uffff\1\20\2\uffff\1\15\11\uffff\3\15\1\uffff\1\15\2\uffff\1\15\13\uffff\7\15\3\uffff\1\15\1\uffff\1\15\2\uffff\3\15\1\uffff\1\15\3\uffff\3\15",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA24 extends DFA {

        public DFA24(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 24;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "862:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YReturn_1= ruleYReturn | this_YReadStatement_2= ruleYReadStatement | this_YCreateStatement_3= ruleYCreateStatement | this_YUpdateStatement_4= ruleYUpdateStatement | this_YAssociateStatement_5= ruleYAssociateStatement | this_YDisassociateStatement_6= ruleYDisassociateStatement | this_YDeleteStatement_7= ruleYDeleteStatement | this_YReadEachStatement_8= ruleYReadEachStatement | this_YWhileStatement_9= ruleYWhileStatement | this_YRepeatWhileStatement_10= ruleYRepeatWhileStatement | this_YForInStatement_11= ruleYForInStatement | (this_YExpression_12= ruleYExpression (otherlv_13= ';' )? ) | this_YIfStatement_14= ruleYIfStatement | this_YSwitchStatement_15= ruleYSwitchStatement )";
        }
    }
    static final String dfa_8s = "\10\uffff";
    static final String dfa_9s = "\4\uffff\1\3\2\uffff\1\3";
    static final String dfa_10s = "\1\6\1\16\1\6\1\uffff\1\33\1\6\1\uffff\1\33";
    static final String dfa_11s = "\1\6\1\32\1\6\1\uffff\1\42\1\6\1\uffff\1\42";
    static final String dfa_12s = "\3\uffff\1\2\2\uffff\1\1\1\uffff";
    static final String dfa_13s = "\10\uffff}>";
    static final String[] dfa_14s = {
            "\1\1",
            "\1\2\13\uffff\1\3",
            "\1\4",
            "",
            "\1\6\6\uffff\1\5",
            "\1\7",
            "",
            "\1\6\6\uffff\1\5"
    };

    static final short[] dfa_8 = DFA.unpackEncodedString(dfa_8s);
    static final short[] dfa_9 = DFA.unpackEncodedString(dfa_9s);
    static final char[] dfa_10 = DFA.unpackEncodedStringToUnsignedChars(dfa_10s);
    static final char[] dfa_11 = DFA.unpackEncodedStringToUnsignedChars(dfa_11s);
    static final short[] dfa_12 = DFA.unpackEncodedString(dfa_12s);
    static final short[] dfa_13 = DFA.unpackEncodedString(dfa_13s);
    static final short[][] dfa_14 = unpackEncodedStringArray(dfa_14s);

    class DFA30 extends DFA {

        public DFA30(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 30;
            this.eot = dfa_8;
            this.eof = dfa_9;
            this.min = dfa_10;
            this.max = dfa_11;
            this.accept = dfa_12;
            this.special = dfa_13;
            this.transition = dfa_14;
        }
        public String getDescription() {
            return "1409:2: (this_YVariableDeclaration_0= ruleYVariableDeclaration | this_YParameter_1= ruleYParameter )";
        }
    }
    static final String dfa_15s = "\7\uffff";
    static final String dfa_16s = "\2\uffff\1\5\3\uffff\1\5";
    static final String dfa_17s = "\1\32\1\6\1\14\1\6\2\uffff\1\14";
    static final String dfa_18s = "\1\32\1\6\1\141\1\6\2\uffff\1\141";
    static final String dfa_19s = "\4\uffff\1\1\1\2\1\uffff";
    static final String dfa_20s = "\7\uffff}>";
    static final String[] dfa_21s = {
            "\1\1",
            "\1\2",
            "\1\5\4\uffff\1\5\3\uffff\1\5\14\uffff\1\3\61\uffff\1\4\12\uffff\3\5",
            "\1\6",
            "",
            "",
            "\1\5\4\uffff\1\5\3\uffff\1\5\14\uffff\1\3\61\uffff\1\4\12\uffff\3\5"
    };

    static final short[] dfa_15 = DFA.unpackEncodedString(dfa_15s);
    static final short[] dfa_16 = DFA.unpackEncodedString(dfa_16s);
    static final char[] dfa_17 = DFA.unpackEncodedStringToUnsignedChars(dfa_17s);
    static final char[] dfa_18 = DFA.unpackEncodedStringToUnsignedChars(dfa_18s);
    static final short[] dfa_19 = DFA.unpackEncodedString(dfa_19s);
    static final short[] dfa_20 = DFA.unpackEncodedString(dfa_20s);
    static final short[][] dfa_21 = unpackEncodedStringArray(dfa_21s);

    class DFA93 extends DFA {

        public DFA93(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 93;
            this.eot = dfa_15;
            this.eof = dfa_16;
            this.min = dfa_17;
            this.max = dfa_18;
            this.accept = dfa_19;
            this.special = dfa_20;
            this.transition = dfa_21;
        }
        public String getDescription() {
            return "5248:5: (lv_type_3_1= ruleYAnnotColumn | lv_type_3_2= ruleYAnnotColumnLike )";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000003002L,0x0000000000000200L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000002002L,0x0000000000000200L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000862000L,0x0000070000000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000860000L,0x0000070000000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000189000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000089000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000009000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000004010040L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0xE51FC000B0020070L,0x00000000000000E2L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000001002L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000FE00001000070L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x000FE00001001070L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000040000002L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x000FC00000000070L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000300024000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000000400000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000000401000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x000FE00003000070L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000000800000002L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000006000000002L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000018000500002L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000060000000002L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000180000000002L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0020000000200000L,0x0000000000000018L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0200000000200000L,0x0000000000000018L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0200000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_55 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_57 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_58 = new BitSet(new long[]{0x0000000000200002L});
    public static final BitSet FOLLOW_59 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_60 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_61 = new BitSet(new long[]{0x0000000001010000L});
    public static final BitSet FOLLOW_62 = new BitSet(new long[]{0x0000000000020000L,0x0000000000005800L});
    public static final BitSet FOLLOW_63 = new BitSet(new long[]{0x0000000001081002L});
    public static final BitSet FOLLOW_64 = new BitSet(new long[]{0x0000000001001002L});
    public static final BitSet FOLLOW_65 = new BitSet(new long[]{0x0000000004080000L});
    public static final BitSet FOLLOW_66 = new BitSet(new long[]{0x0000080001001002L,0x0000000000002000L});
    public static final BitSet FOLLOW_67 = new BitSet(new long[]{0x0000000001001002L,0x0000000000002000L});
    public static final BitSet FOLLOW_68 = new BitSet(new long[]{0x0000000000001002L,0x0000000000002000L});
    public static final BitSet FOLLOW_69 = new BitSet(new long[]{0x0000C00000000070L,0x0000000000008000L});
    public static final BitSet FOLLOW_70 = new BitSet(new long[]{0x0000C00000000070L,0x0000000000018000L});
    public static final BitSet FOLLOW_71 = new BitSet(new long[]{0x0000000000200000L,0x0000000000010000L});
    public static final BitSet FOLLOW_72 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_73 = new BitSet(new long[]{0x0000000000020000L,0x0000000000080000L});
    public static final BitSet FOLLOW_74 = new BitSet(new long[]{0x0000000000020000L,0x0000000380000000L});
    public static final BitSet FOLLOW_75 = new BitSet(new long[]{0x0000000000020000L,0x0000000200000000L});
    public static final BitSet FOLLOW_76 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_77 = new BitSet(new long[]{0x0000000000000000L,0x000000007FE00000L});
    public static final BitSet FOLLOW_78 = new BitSet(new long[]{0x0000000002200040L});
    public static final BitSet FOLLOW_79 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_80 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_81 = new BitSet(new long[]{0x0000000000001002L,0x0000000800000000L});
    public static final BitSet FOLLOW_82 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_83 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static final BitSet FOLLOW_84 = new BitSet(new long[]{0x0000000000000010L});

}