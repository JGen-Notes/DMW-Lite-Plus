package eu.jgen.notes.dmw.lite.mdl.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalModelParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'VARCHAR'", "'CHAR'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'DECIMAL'", "'TIME'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", "'package'", "';'", "'import'", "'@entity'", "'{'", "'}'", "'('", "')'", "','", "'@attribute'", "'@relationship'", "'->'", "'<-'", "'@identifier'", "'='", "']'", "'['", "'@td'", "'database'", "'@table'", "'as'", "'@column'", "'@primary'", "'@foreign'", "'@java'", "'uses'", "'@swift'", "'module'", "'@database'", "'.'", "'.*'", "'?'", "'*'"
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
    public static final int RULE_INT=5;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;
    public static final int RULE_STRING=6;
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

    	public void setGrammarAccess(ModelGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleYModel"
    // InternalModel.g:54:1: entryRuleYModel : ruleYModel EOF ;
    public final void entryRuleYModel() throws RecognitionException {
        try {
            // InternalModel.g:55:1: ( ruleYModel EOF )
            // InternalModel.g:56:1: ruleYModel EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYModel();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYModel"


    // $ANTLR start "ruleYModel"
    // InternalModel.g:63:1: ruleYModel : ( ( rule__YModel__Group__0 ) ) ;
    public final void ruleYModel() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:67:2: ( ( ( rule__YModel__Group__0 ) ) )
            // InternalModel.g:68:2: ( ( rule__YModel__Group__0 ) )
            {
            // InternalModel.g:68:2: ( ( rule__YModel__Group__0 ) )
            // InternalModel.g:69:3: ( rule__YModel__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getGroup()); 
            }
            // InternalModel.g:70:3: ( rule__YModel__Group__0 )
            // InternalModel.g:70:4: rule__YModel__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YModel__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYModel"


    // $ANTLR start "entryRuleYImport"
    // InternalModel.g:79:1: entryRuleYImport : ruleYImport EOF ;
    public final void entryRuleYImport() throws RecognitionException {
        try {
            // InternalModel.g:80:1: ( ruleYImport EOF )
            // InternalModel.g:81:1: ruleYImport EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYImport"


    // $ANTLR start "ruleYImport"
    // InternalModel.g:88:1: ruleYImport : ( ( rule__YImport__Group__0 ) ) ;
    public final void ruleYImport() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:92:2: ( ( ( rule__YImport__Group__0 ) ) )
            // InternalModel.g:93:2: ( ( rule__YImport__Group__0 ) )
            {
            // InternalModel.g:93:2: ( ( rule__YImport__Group__0 ) )
            // InternalModel.g:94:3: ( rule__YImport__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getGroup()); 
            }
            // InternalModel.g:95:3: ( rule__YImport__Group__0 )
            // InternalModel.g:95:4: rule__YImport__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YImport__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYImport"


    // $ANTLR start "entryRuleYAnnotation"
    // InternalModel.g:104:1: entryRuleYAnnotation : ruleYAnnotation EOF ;
    public final void entryRuleYAnnotation() throws RecognitionException {
        try {
            // InternalModel.g:105:1: ( ruleYAnnotation EOF )
            // InternalModel.g:106:1: ruleYAnnotation EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotation"


    // $ANTLR start "ruleYAnnotation"
    // InternalModel.g:113:1: ruleYAnnotation : ( ( rule__YAnnotation__Alternatives ) ) ;
    public final void ruleYAnnotation() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:117:2: ( ( ( rule__YAnnotation__Alternatives ) ) )
            // InternalModel.g:118:2: ( ( rule__YAnnotation__Alternatives ) )
            {
            // InternalModel.g:118:2: ( ( rule__YAnnotation__Alternatives ) )
            // InternalModel.g:119:3: ( rule__YAnnotation__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationAccess().getAlternatives()); 
            }
            // InternalModel.g:120:3: ( rule__YAnnotation__Alternatives )
            // InternalModel.g:120:4: rule__YAnnotation__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotation__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotation"


    // $ANTLR start "entryRuleYAnnotEntity"
    // InternalModel.g:129:1: entryRuleYAnnotEntity : ruleYAnnotEntity EOF ;
    public final void entryRuleYAnnotEntity() throws RecognitionException {
        try {
            // InternalModel.g:130:1: ( ruleYAnnotEntity EOF )
            // InternalModel.g:131:1: ruleYAnnotEntity EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotEntity();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotEntity"


    // $ANTLR start "ruleYAnnotEntity"
    // InternalModel.g:138:1: ruleYAnnotEntity : ( ( rule__YAnnotEntity__Group__0 ) ) ;
    public final void ruleYAnnotEntity() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:142:2: ( ( ( rule__YAnnotEntity__Group__0 ) ) )
            // InternalModel.g:143:2: ( ( rule__YAnnotEntity__Group__0 ) )
            {
            // InternalModel.g:143:2: ( ( rule__YAnnotEntity__Group__0 ) )
            // InternalModel.g:144:3: ( rule__YAnnotEntity__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup()); 
            }
            // InternalModel.g:145:3: ( rule__YAnnotEntity__Group__0 )
            // InternalModel.g:145:4: rule__YAnnotEntity__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotEntity"


    // $ANTLR start "entryRuleYAnnotAttribute"
    // InternalModel.g:154:1: entryRuleYAnnotAttribute : ruleYAnnotAttribute EOF ;
    public final void entryRuleYAnnotAttribute() throws RecognitionException {
        try {
            // InternalModel.g:155:1: ( ruleYAnnotAttribute EOF )
            // InternalModel.g:156:1: ruleYAnnotAttribute EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotAttribute();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotAttribute"


    // $ANTLR start "ruleYAnnotAttribute"
    // InternalModel.g:163:1: ruleYAnnotAttribute : ( ( rule__YAnnotAttribute__Group__0 ) ) ;
    public final void ruleYAnnotAttribute() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:167:2: ( ( ( rule__YAnnotAttribute__Group__0 ) ) )
            // InternalModel.g:168:2: ( ( rule__YAnnotAttribute__Group__0 ) )
            {
            // InternalModel.g:168:2: ( ( rule__YAnnotAttribute__Group__0 ) )
            // InternalModel.g:169:3: ( rule__YAnnotAttribute__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup()); 
            }
            // InternalModel.g:170:3: ( rule__YAnnotAttribute__Group__0 )
            // InternalModel.g:170:4: rule__YAnnotAttribute__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotAttribute"


    // $ANTLR start "entryRuleYAnnotRelationship"
    // InternalModel.g:179:1: entryRuleYAnnotRelationship : ruleYAnnotRelationship EOF ;
    public final void entryRuleYAnnotRelationship() throws RecognitionException {
        try {
            // InternalModel.g:180:1: ( ruleYAnnotRelationship EOF )
            // InternalModel.g:181:1: ruleYAnnotRelationship EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotRelationship();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotRelationship"


    // $ANTLR start "ruleYAnnotRelationship"
    // InternalModel.g:188:1: ruleYAnnotRelationship : ( ( rule__YAnnotRelationship__Group__0 ) ) ;
    public final void ruleYAnnotRelationship() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:192:2: ( ( ( rule__YAnnotRelationship__Group__0 ) ) )
            // InternalModel.g:193:2: ( ( rule__YAnnotRelationship__Group__0 ) )
            {
            // InternalModel.g:193:2: ( ( rule__YAnnotRelationship__Group__0 ) )
            // InternalModel.g:194:3: ( rule__YAnnotRelationship__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup()); 
            }
            // InternalModel.g:195:3: ( rule__YAnnotRelationship__Group__0 )
            // InternalModel.g:195:4: rule__YAnnotRelationship__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotRelationship"


    // $ANTLR start "entryRuleYAnnotIdentifier"
    // InternalModel.g:204:1: entryRuleYAnnotIdentifier : ruleYAnnotIdentifier EOF ;
    public final void entryRuleYAnnotIdentifier() throws RecognitionException {
        try {
            // InternalModel.g:205:1: ( ruleYAnnotIdentifier EOF )
            // InternalModel.g:206:1: ruleYAnnotIdentifier EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotIdentifier();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotIdentifier"


    // $ANTLR start "ruleYAnnotIdentifier"
    // InternalModel.g:213:1: ruleYAnnotIdentifier : ( ( rule__YAnnotIdentifier__Group__0 ) ) ;
    public final void ruleYAnnotIdentifier() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:217:2: ( ( ( rule__YAnnotIdentifier__Group__0 ) ) )
            // InternalModel.g:218:2: ( ( rule__YAnnotIdentifier__Group__0 ) )
            {
            // InternalModel.g:218:2: ( ( rule__YAnnotIdentifier__Group__0 ) )
            // InternalModel.g:219:3: ( rule__YAnnotIdentifier__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getGroup()); 
            }
            // InternalModel.g:220:3: ( rule__YAnnotIdentifier__Group__0 )
            // InternalModel.g:220:4: rule__YAnnotIdentifier__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotIdentifier"


    // $ANTLR start "entryRuleYAnnotationElementValuePair"
    // InternalModel.g:229:1: entryRuleYAnnotationElementValuePair : ruleYAnnotationElementValuePair EOF ;
    public final void entryRuleYAnnotationElementValuePair() throws RecognitionException {
        try {
            // InternalModel.g:230:1: ( ruleYAnnotationElementValuePair EOF )
            // InternalModel.g:231:1: ruleYAnnotationElementValuePair EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotationElementValuePair"


    // $ANTLR start "ruleYAnnotationElementValuePair"
    // InternalModel.g:238:1: ruleYAnnotationElementValuePair : ( ( rule__YAnnotationElementValuePair__Group__0 ) ) ;
    public final void ruleYAnnotationElementValuePair() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:242:2: ( ( ( rule__YAnnotationElementValuePair__Group__0 ) ) )
            // InternalModel.g:243:2: ( ( rule__YAnnotationElementValuePair__Group__0 ) )
            {
            // InternalModel.g:243:2: ( ( rule__YAnnotationElementValuePair__Group__0 ) )
            // InternalModel.g:244:3: ( rule__YAnnotationElementValuePair__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getGroup()); 
            }
            // InternalModel.g:245:3: ( rule__YAnnotationElementValuePair__Group__0 )
            // InternalModel.g:245:4: rule__YAnnotationElementValuePair__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotationElementValuePair"


    // $ANTLR start "entryRuleYAnnotEntityInner"
    // InternalModel.g:254:1: entryRuleYAnnotEntityInner : ruleYAnnotEntityInner EOF ;
    public final void entryRuleYAnnotEntityInner() throws RecognitionException {
        try {
            // InternalModel.g:255:1: ( ruleYAnnotEntityInner EOF )
            // InternalModel.g:256:1: ruleYAnnotEntityInner EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityInnerRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotEntityInner();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityInnerRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotEntityInner"


    // $ANTLR start "ruleYAnnotEntityInner"
    // InternalModel.g:263:1: ruleYAnnotEntityInner : ( ( rule__YAnnotEntityInner__Alternatives ) ) ;
    public final void ruleYAnnotEntityInner() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:267:2: ( ( ( rule__YAnnotEntityInner__Alternatives ) ) )
            // InternalModel.g:268:2: ( ( rule__YAnnotEntityInner__Alternatives ) )
            {
            // InternalModel.g:268:2: ( ( rule__YAnnotEntityInner__Alternatives ) )
            // InternalModel.g:269:3: ( rule__YAnnotEntityInner__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityInnerAccess().getAlternatives()); 
            }
            // InternalModel.g:270:3: ( rule__YAnnotEntityInner__Alternatives )
            // InternalModel.g:270:4: rule__YAnnotEntityInner__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntityInner__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityInnerAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotEntityInner"


    // $ANTLR start "entryRuleYAnnotExpression"
    // InternalModel.g:279:1: entryRuleYAnnotExpression : ruleYAnnotExpression EOF ;
    public final void entryRuleYAnnotExpression() throws RecognitionException {
        try {
            // InternalModel.g:280:1: ( ruleYAnnotExpression EOF )
            // InternalModel.g:281:1: ruleYAnnotExpression EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotExpression"


    // $ANTLR start "ruleYAnnotExpression"
    // InternalModel.g:288:1: ruleYAnnotExpression : ( ( rule__YAnnotExpression__Alternatives ) ) ;
    public final void ruleYAnnotExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:292:2: ( ( ( rule__YAnnotExpression__Alternatives ) ) )
            // InternalModel.g:293:2: ( ( rule__YAnnotExpression__Alternatives ) )
            {
            // InternalModel.g:293:2: ( ( rule__YAnnotExpression__Alternatives ) )
            // InternalModel.g:294:3: ( rule__YAnnotExpression__Alternatives )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getAlternatives()); 
            }
            // InternalModel.g:295:3: ( rule__YAnnotExpression__Alternatives )
            // InternalModel.g:295:4: rule__YAnnotExpression__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Alternatives();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getAlternatives()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotExpression"


    // $ANTLR start "entryRuleYAnnotTechnicalDesign"
    // InternalModel.g:304:1: entryRuleYAnnotTechnicalDesign : ruleYAnnotTechnicalDesign EOF ;
    public final void entryRuleYAnnotTechnicalDesign() throws RecognitionException {
        try {
            // InternalModel.g:305:1: ( ruleYAnnotTechnicalDesign EOF )
            // InternalModel.g:306:1: ruleYAnnotTechnicalDesign EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotTechnicalDesign();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotTechnicalDesign"


    // $ANTLR start "ruleYAnnotTechnicalDesign"
    // InternalModel.g:313:1: ruleYAnnotTechnicalDesign : ( ( rule__YAnnotTechnicalDesign__Group__0 ) ) ;
    public final void ruleYAnnotTechnicalDesign() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:317:2: ( ( ( rule__YAnnotTechnicalDesign__Group__0 ) ) )
            // InternalModel.g:318:2: ( ( rule__YAnnotTechnicalDesign__Group__0 ) )
            {
            // InternalModel.g:318:2: ( ( rule__YAnnotTechnicalDesign__Group__0 ) )
            // InternalModel.g:319:3: ( rule__YAnnotTechnicalDesign__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup()); 
            }
            // InternalModel.g:320:3: ( rule__YAnnotTechnicalDesign__Group__0 )
            // InternalModel.g:320:4: rule__YAnnotTechnicalDesign__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotTechnicalDesign"


    // $ANTLR start "entryRuleYAnnotTable"
    // InternalModel.g:329:1: entryRuleYAnnotTable : ruleYAnnotTable EOF ;
    public final void entryRuleYAnnotTable() throws RecognitionException {
        try {
            // InternalModel.g:330:1: ( ruleYAnnotTable EOF )
            // InternalModel.g:331:1: ruleYAnnotTable EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotTable"


    // $ANTLR start "ruleYAnnotTable"
    // InternalModel.g:338:1: ruleYAnnotTable : ( ( rule__YAnnotTable__Group__0 ) ) ;
    public final void ruleYAnnotTable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:342:2: ( ( ( rule__YAnnotTable__Group__0 ) ) )
            // InternalModel.g:343:2: ( ( rule__YAnnotTable__Group__0 ) )
            {
            // InternalModel.g:343:2: ( ( rule__YAnnotTable__Group__0 ) )
            // InternalModel.g:344:3: ( rule__YAnnotTable__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getGroup()); 
            }
            // InternalModel.g:345:3: ( rule__YAnnotTable__Group__0 )
            // InternalModel.g:345:4: rule__YAnnotTable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotTable"


    // $ANTLR start "entryRuleYAnnotColumn"
    // InternalModel.g:354:1: entryRuleYAnnotColumn : ruleYAnnotColumn EOF ;
    public final void entryRuleYAnnotColumn() throws RecognitionException {
        try {
            // InternalModel.g:355:1: ( ruleYAnnotColumn EOF )
            // InternalModel.g:356:1: ruleYAnnotColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotColumn"


    // $ANTLR start "ruleYAnnotColumn"
    // InternalModel.g:363:1: ruleYAnnotColumn : ( ( rule__YAnnotColumn__Group__0 ) ) ;
    public final void ruleYAnnotColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:367:2: ( ( ( rule__YAnnotColumn__Group__0 ) ) )
            // InternalModel.g:368:2: ( ( rule__YAnnotColumn__Group__0 ) )
            {
            // InternalModel.g:368:2: ( ( rule__YAnnotColumn__Group__0 ) )
            // InternalModel.g:369:3: ( rule__YAnnotColumn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup()); 
            }
            // InternalModel.g:370:3: ( rule__YAnnotColumn__Group__0 )
            // InternalModel.g:370:4: rule__YAnnotColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotColumn"


    // $ANTLR start "entryRuleYAnnotColumnLike"
    // InternalModel.g:379:1: entryRuleYAnnotColumnLike : ruleYAnnotColumnLike EOF ;
    public final void entryRuleYAnnotColumnLike() throws RecognitionException {
        try {
            // InternalModel.g:380:1: ( ruleYAnnotColumnLike EOF )
            // InternalModel.g:381:1: ruleYAnnotColumnLike EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotColumnLike();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotColumnLike"


    // $ANTLR start "ruleYAnnotColumnLike"
    // InternalModel.g:388:1: ruleYAnnotColumnLike : ( ( rule__YAnnotColumnLike__Group__0 ) ) ;
    public final void ruleYAnnotColumnLike() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:392:2: ( ( ( rule__YAnnotColumnLike__Group__0 ) ) )
            // InternalModel.g:393:2: ( ( rule__YAnnotColumnLike__Group__0 ) )
            {
            // InternalModel.g:393:2: ( ( rule__YAnnotColumnLike__Group__0 ) )
            // InternalModel.g:394:3: ( rule__YAnnotColumnLike__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getGroup()); 
            }
            // InternalModel.g:395:3: ( rule__YAnnotColumnLike__Group__0 )
            // InternalModel.g:395:4: rule__YAnnotColumnLike__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotColumnLike"


    // $ANTLR start "entryRuleYAnnotAbstractColumn"
    // InternalModel.g:404:1: entryRuleYAnnotAbstractColumn : ruleYAnnotAbstractColumn EOF ;
    public final void entryRuleYAnnotAbstractColumn() throws RecognitionException {
        try {
            // InternalModel.g:405:1: ( ruleYAnnotAbstractColumn EOF )
            // InternalModel.g:406:1: ruleYAnnotAbstractColumn EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotAbstractColumn"


    // $ANTLR start "ruleYAnnotAbstractColumn"
    // InternalModel.g:413:1: ruleYAnnotAbstractColumn : ( ( rule__YAnnotAbstractColumn__Group__0 ) ) ;
    public final void ruleYAnnotAbstractColumn() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:417:2: ( ( ( rule__YAnnotAbstractColumn__Group__0 ) ) )
            // InternalModel.g:418:2: ( ( rule__YAnnotAbstractColumn__Group__0 ) )
            {
            // InternalModel.g:418:2: ( ( rule__YAnnotAbstractColumn__Group__0 ) )
            // InternalModel.g:419:3: ( rule__YAnnotAbstractColumn__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getGroup()); 
            }
            // InternalModel.g:420:3: ( rule__YAnnotAbstractColumn__Group__0 )
            // InternalModel.g:420:4: rule__YAnnotAbstractColumn__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotAbstractColumn"


    // $ANTLR start "entryRuleYAnnotPrimaryKey"
    // InternalModel.g:429:1: entryRuleYAnnotPrimaryKey : ruleYAnnotPrimaryKey EOF ;
    public final void entryRuleYAnnotPrimaryKey() throws RecognitionException {
        try {
            // InternalModel.g:430:1: ( ruleYAnnotPrimaryKey EOF )
            // InternalModel.g:431:1: ruleYAnnotPrimaryKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotPrimaryKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotPrimaryKey"


    // $ANTLR start "ruleYAnnotPrimaryKey"
    // InternalModel.g:438:1: ruleYAnnotPrimaryKey : ( ( rule__YAnnotPrimaryKey__Group__0 ) ) ;
    public final void ruleYAnnotPrimaryKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:442:2: ( ( ( rule__YAnnotPrimaryKey__Group__0 ) ) )
            // InternalModel.g:443:2: ( ( rule__YAnnotPrimaryKey__Group__0 ) )
            {
            // InternalModel.g:443:2: ( ( rule__YAnnotPrimaryKey__Group__0 ) )
            // InternalModel.g:444:3: ( rule__YAnnotPrimaryKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup()); 
            }
            // InternalModel.g:445:3: ( rule__YAnnotPrimaryKey__Group__0 )
            // InternalModel.g:445:4: rule__YAnnotPrimaryKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotPrimaryKey"


    // $ANTLR start "entryRuleYAnnotForeignKey"
    // InternalModel.g:454:1: entryRuleYAnnotForeignKey : ruleYAnnotForeignKey EOF ;
    public final void entryRuleYAnnotForeignKey() throws RecognitionException {
        try {
            // InternalModel.g:455:1: ( ruleYAnnotForeignKey EOF )
            // InternalModel.g:456:1: ruleYAnnotForeignKey EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotForeignKey"


    // $ANTLR start "ruleYAnnotForeignKey"
    // InternalModel.g:463:1: ruleYAnnotForeignKey : ( ( rule__YAnnotForeignKey__Group__0 ) ) ;
    public final void ruleYAnnotForeignKey() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:467:2: ( ( ( rule__YAnnotForeignKey__Group__0 ) ) )
            // InternalModel.g:468:2: ( ( rule__YAnnotForeignKey__Group__0 ) )
            {
            // InternalModel.g:468:2: ( ( rule__YAnnotForeignKey__Group__0 ) )
            // InternalModel.g:469:3: ( rule__YAnnotForeignKey__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getGroup()); 
            }
            // InternalModel.g:470:3: ( rule__YAnnotForeignKey__Group__0 )
            // InternalModel.g:470:4: rule__YAnnotForeignKey__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotForeignKey"


    // $ANTLR start "entryRuleYAnnotJava"
    // InternalModel.g:479:1: entryRuleYAnnotJava : ruleYAnnotJava EOF ;
    public final void entryRuleYAnnotJava() throws RecognitionException {
        try {
            // InternalModel.g:480:1: ( ruleYAnnotJava EOF )
            // InternalModel.g:481:1: ruleYAnnotJava EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotJava();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotJava"


    // $ANTLR start "ruleYAnnotJava"
    // InternalModel.g:488:1: ruleYAnnotJava : ( ( rule__YAnnotJava__Group__0 ) ) ;
    public final void ruleYAnnotJava() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:492:2: ( ( ( rule__YAnnotJava__Group__0 ) ) )
            // InternalModel.g:493:2: ( ( rule__YAnnotJava__Group__0 ) )
            {
            // InternalModel.g:493:2: ( ( rule__YAnnotJava__Group__0 ) )
            // InternalModel.g:494:3: ( rule__YAnnotJava__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getGroup()); 
            }
            // InternalModel.g:495:3: ( rule__YAnnotJava__Group__0 )
            // InternalModel.g:495:4: rule__YAnnotJava__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotJava"


    // $ANTLR start "entryRuleYAnnotSwift"
    // InternalModel.g:504:1: entryRuleYAnnotSwift : ruleYAnnotSwift EOF ;
    public final void entryRuleYAnnotSwift() throws RecognitionException {
        try {
            // InternalModel.g:505:1: ( ruleYAnnotSwift EOF )
            // InternalModel.g:506:1: ruleYAnnotSwift EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotSwift();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotSwift"


    // $ANTLR start "ruleYAnnotSwift"
    // InternalModel.g:513:1: ruleYAnnotSwift : ( ( rule__YAnnotSwift__Group__0 ) ) ;
    public final void ruleYAnnotSwift() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:517:2: ( ( ( rule__YAnnotSwift__Group__0 ) ) )
            // InternalModel.g:518:2: ( ( rule__YAnnotSwift__Group__0 ) )
            {
            // InternalModel.g:518:2: ( ( rule__YAnnotSwift__Group__0 ) )
            // InternalModel.g:519:3: ( rule__YAnnotSwift__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getGroup()); 
            }
            // InternalModel.g:520:3: ( rule__YAnnotSwift__Group__0 )
            // InternalModel.g:520:4: rule__YAnnotSwift__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotSwift"


    // $ANTLR start "entryRuleYAnnotDatabase"
    // InternalModel.g:529:1: entryRuleYAnnotDatabase : ruleYAnnotDatabase EOF ;
    public final void entryRuleYAnnotDatabase() throws RecognitionException {
        try {
            // InternalModel.g:530:1: ( ruleYAnnotDatabase EOF )
            // InternalModel.g:531:1: ruleYAnnotDatabase EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleYAnnotDatabase();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleYAnnotDatabase"


    // $ANTLR start "ruleYAnnotDatabase"
    // InternalModel.g:538:1: ruleYAnnotDatabase : ( ( rule__YAnnotDatabase__Group__0 ) ) ;
    public final void ruleYAnnotDatabase() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:542:2: ( ( ( rule__YAnnotDatabase__Group__0 ) ) )
            // InternalModel.g:543:2: ( ( rule__YAnnotDatabase__Group__0 ) )
            {
            // InternalModel.g:543:2: ( ( rule__YAnnotDatabase__Group__0 ) )
            // InternalModel.g:544:3: ( rule__YAnnotDatabase__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getGroup()); 
            }
            // InternalModel.g:545:3: ( rule__YAnnotDatabase__Group__0 )
            // InternalModel.g:545:4: rule__YAnnotDatabase__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleYAnnotDatabase"


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModel.g:554:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalModel.g:555:1: ( ruleQualifiedName EOF )
            // InternalModel.g:556:1: ruleQualifiedName EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedName"


    // $ANTLR start "ruleQualifiedName"
    // InternalModel.g:563:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:567:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalModel.g:568:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalModel.g:568:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalModel.g:569:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalModel.g:570:3: ( rule__QualifiedName__Group__0 )
            // InternalModel.g:570:4: rule__QualifiedName__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedName"


    // $ANTLR start "entryRuleQualifiedNameWithWildcard"
    // InternalModel.g:579:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalModel.g:580:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalModel.g:581:1: ruleQualifiedNameWithWildcard EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleQualifiedNameWithWildcard"


    // $ANTLR start "ruleQualifiedNameWithWildcard"
    // InternalModel.g:588:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:592:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalModel.g:593:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalModel.g:593:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalModel.g:594:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalModel.g:595:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalModel.g:595:4: rule__QualifiedNameWithWildcard__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleQualifiedNameWithWildcard"


    // $ANTLR start "entryRuleValidID"
    // InternalModel.g:604:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalModel.g:605:1: ( ruleValidID EOF )
            // InternalModel.g:606:1: ruleValidID EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleValidID"


    // $ANTLR start "ruleValidID"
    // InternalModel.g:613:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:617:2: ( ( RULE_ID ) )
            // InternalModel.g:618:2: ( RULE_ID )
            {
            // InternalModel.g:618:2: ( RULE_ID )
            // InternalModel.g:619:3: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getValidIDAccess().getIDTerminalRuleCall()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleValidID"


    // $ANTLR start "entryRuleNumber"
    // InternalModel.g:629:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:633:1: ( ruleNumber EOF )
            // InternalModel.g:634:1: ruleNumber EOF
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberRule()); 
            }
            pushFollow(FOLLOW_1);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberRule()); 
            }
            match(input,EOF,FOLLOW_2); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "entryRuleNumber"


    // $ANTLR start "ruleNumber"
    // InternalModel.g:644:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:649:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalModel.g:650:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalModel.g:650:2: ( ( rule__Number__Group__0 ) )
            // InternalModel.g:651:3: ( rule__Number__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup()); 
            }
            // InternalModel.g:652:3: ( rule__Number__Group__0 )
            // InternalModel.g:652:4: rule__Number__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);
            	myHiddenTokenState.restore();

        }
        return ;
    }
    // $ANTLR end "ruleNumber"


    // $ANTLR start "rule__YAnnotation__Alternatives"
    // InternalModel.g:661:1: rule__YAnnotation__Alternatives : ( ( ruleYAnnotEntity ) | ( ruleYAnnotTechnicalDesign ) | ( ruleYAnnotDatabase ) | ( ruleYAnnotJava ) | ( ruleYAnnotSwift ) );
    public final void rule__YAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:665:1: ( ( ruleYAnnotEntity ) | ( ruleYAnnotTechnicalDesign ) | ( ruleYAnnotDatabase ) | ( ruleYAnnotJava ) | ( ruleYAnnotSwift ) )
            int alt1=5;
            switch ( input.LA(1) ) {
            case 26:
                {
                alt1=1;
                }
                break;
            case 40:
                {
                alt1=2;
                }
                break;
            case 51:
                {
                alt1=3;
                }
                break;
            case 47:
                {
                alt1=4;
                }
                break;
            case 49:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // InternalModel.g:666:2: ( ruleYAnnotEntity )
                    {
                    // InternalModel.g:666:2: ( ruleYAnnotEntity )
                    // InternalModel.g:667:3: ruleYAnnotEntity
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotationAccess().getYAnnotEntityParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotEntity();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotationAccess().getYAnnotEntityParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:672:2: ( ruleYAnnotTechnicalDesign )
                    {
                    // InternalModel.g:672:2: ( ruleYAnnotTechnicalDesign )
                    // InternalModel.g:673:3: ruleYAnnotTechnicalDesign
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotationAccess().getYAnnotTechnicalDesignParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotTechnicalDesign();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotationAccess().getYAnnotTechnicalDesignParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalModel.g:678:2: ( ruleYAnnotDatabase )
                    {
                    // InternalModel.g:678:2: ( ruleYAnnotDatabase )
                    // InternalModel.g:679:3: ruleYAnnotDatabase
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotationAccess().getYAnnotDatabaseParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotDatabase();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotationAccess().getYAnnotDatabaseParserRuleCall_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalModel.g:684:2: ( ruleYAnnotJava )
                    {
                    // InternalModel.g:684:2: ( ruleYAnnotJava )
                    // InternalModel.g:685:3: ruleYAnnotJava
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotationAccess().getYAnnotJavaParserRuleCall_3()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotJava();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotationAccess().getYAnnotJavaParserRuleCall_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalModel.g:690:2: ( ruleYAnnotSwift )
                    {
                    // InternalModel.g:690:2: ( ruleYAnnotSwift )
                    // InternalModel.g:691:3: ruleYAnnotSwift
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotationAccess().getYAnnotSwiftParserRuleCall_4()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotSwift();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotationAccess().getYAnnotSwiftParserRuleCall_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotation__Alternatives"


    // $ANTLR start "rule__YAnnotEntityInner__Alternatives"
    // InternalModel.g:700:1: rule__YAnnotEntityInner__Alternatives : ( ( ruleYAnnotAttribute ) | ( ruleYAnnotRelationship ) | ( ruleYAnnotIdentifier ) );
    public final void rule__YAnnotEntityInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:704:1: ( ( ruleYAnnotAttribute ) | ( ruleYAnnotRelationship ) | ( ruleYAnnotIdentifier ) )
            int alt2=3;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt2=1;
                }
                break;
            case 33:
                {
                alt2=2;
                }
                break;
            case 36:
                {
                alt2=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // InternalModel.g:705:2: ( ruleYAnnotAttribute )
                    {
                    // InternalModel.g:705:2: ( ruleYAnnotAttribute )
                    // InternalModel.g:706:3: ruleYAnnotAttribute
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotAttributeParserRuleCall_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotAttribute();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotAttributeParserRuleCall_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:711:2: ( ruleYAnnotRelationship )
                    {
                    // InternalModel.g:711:2: ( ruleYAnnotRelationship )
                    // InternalModel.g:712:3: ruleYAnnotRelationship
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotRelationshipParserRuleCall_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotRelationship();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotRelationshipParserRuleCall_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalModel.g:717:2: ( ruleYAnnotIdentifier )
                    {
                    // InternalModel.g:717:2: ( ruleYAnnotIdentifier )
                    // InternalModel.g:718:3: ruleYAnnotIdentifier
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotIdentifierParserRuleCall_2()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotIdentifier();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotEntityInnerAccess().getYAnnotIdentifierParserRuleCall_2()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntityInner__Alternatives"


    // $ANTLR start "rule__YAnnotExpression__Alternatives"
    // InternalModel.g:727:1: rule__YAnnotExpression__Alternatives : ( ( ( rule__YAnnotExpression__Group_0__0 ) ) | ( ( rule__YAnnotExpression__Group_1__0 ) ) | ( ( rule__YAnnotExpression__Group_2__0 ) ) | ( ( rule__YAnnotExpression__Group_3__0 ) ) | ( ( rule__YAnnotExpression__Group_4__0 ) ) );
    public final void rule__YAnnotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:731:1: ( ( ( rule__YAnnotExpression__Group_0__0 ) ) | ( ( rule__YAnnotExpression__Group_1__0 ) ) | ( ( rule__YAnnotExpression__Group_2__0 ) ) | ( ( rule__YAnnotExpression__Group_3__0 ) ) | ( ( rule__YAnnotExpression__Group_4__0 ) ) )
            int alt3=5;
            switch ( input.LA(1) ) {
            case RULE_ID:
                {
                alt3=1;
                }
                break;
            case RULE_STRING:
                {
                alt3=2;
                }
                break;
            case RULE_INT:
                {
                alt3=3;
                }
                break;
            case 11:
            case 12:
                {
                alt3=4;
                }
                break;
            case 39:
                {
                alt3=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalModel.g:732:2: ( ( rule__YAnnotExpression__Group_0__0 ) )
                    {
                    // InternalModel.g:732:2: ( ( rule__YAnnotExpression__Group_0__0 ) )
                    // InternalModel.g:733:3: ( rule__YAnnotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_0()); 
                    }
                    // InternalModel.g:734:3: ( rule__YAnnotExpression__Group_0__0 )
                    // InternalModel.g:734:4: rule__YAnnotExpression__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_0__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getGroup_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:738:2: ( ( rule__YAnnotExpression__Group_1__0 ) )
                    {
                    // InternalModel.g:738:2: ( ( rule__YAnnotExpression__Group_1__0 ) )
                    // InternalModel.g:739:3: ( rule__YAnnotExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_1()); 
                    }
                    // InternalModel.g:740:3: ( rule__YAnnotExpression__Group_1__0 )
                    // InternalModel.g:740:4: rule__YAnnotExpression__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getGroup_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalModel.g:744:2: ( ( rule__YAnnotExpression__Group_2__0 ) )
                    {
                    // InternalModel.g:744:2: ( ( rule__YAnnotExpression__Group_2__0 ) )
                    // InternalModel.g:745:3: ( rule__YAnnotExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_2()); 
                    }
                    // InternalModel.g:746:3: ( rule__YAnnotExpression__Group_2__0 )
                    // InternalModel.g:746:4: rule__YAnnotExpression__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getGroup_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalModel.g:750:2: ( ( rule__YAnnotExpression__Group_3__0 ) )
                    {
                    // InternalModel.g:750:2: ( ( rule__YAnnotExpression__Group_3__0 ) )
                    // InternalModel.g:751:3: ( rule__YAnnotExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_3()); 
                    }
                    // InternalModel.g:752:3: ( rule__YAnnotExpression__Group_3__0 )
                    // InternalModel.g:752:4: rule__YAnnotExpression__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getGroup_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalModel.g:756:2: ( ( rule__YAnnotExpression__Group_4__0 ) )
                    {
                    // InternalModel.g:756:2: ( ( rule__YAnnotExpression__Group_4__0 ) )
                    // InternalModel.g:757:3: ( rule__YAnnotExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_4()); 
                    }
                    // InternalModel.g:758:3: ( rule__YAnnotExpression__Group_4__0 )
                    // InternalModel.g:758:4: rule__YAnnotExpression__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }

                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getGroup_4()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Alternatives"


    // $ANTLR start "rule__YAnnotExpression__ValueAlternatives_3_1_0"
    // InternalModel.g:766:1: rule__YAnnotExpression__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__YAnnotExpression__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:770:1: ( ( 'true' ) | ( 'false' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalModel.g:771:2: ( 'true' )
                    {
                    // InternalModel.g:771:2: ( 'true' )
                    // InternalModel.g:772:3: 'true'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getValueTrueKeyword_3_1_0_0()); 
                    }
                    match(input,11,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getValueTrueKeyword_3_1_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:777:2: ( 'false' )
                    {
                    // InternalModel.g:777:2: ( 'false' )
                    // InternalModel.g:778:3: 'false'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getValueFalseKeyword_3_1_0_1()); 
                    }
                    match(input,12,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotExpressionAccess().getValueFalseKeyword_3_1_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ValueAlternatives_3_1_0"


    // $ANTLR start "rule__YAnnotColumn__TypeAlternatives_4_0"
    // InternalModel.g:787:1: rule__YAnnotColumn__TypeAlternatives_4_0 : ( ( 'VARCHAR' ) | ( 'CHAR' ) | ( 'INTEGER' ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'DECIMAL' ) | ( 'TIME' ) | ( 'DATE' ) | ( 'TIMESTAMP' ) | ( 'BOOLEAN' ) );
    public final void rule__YAnnotColumn__TypeAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:791:1: ( ( 'VARCHAR' ) | ( 'CHAR' ) | ( 'INTEGER' ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'DECIMAL' ) | ( 'TIME' ) | ( 'DATE' ) | ( 'TIMESTAMP' ) | ( 'BOOLEAN' ) )
            int alt5=10;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt5=1;
                }
                break;
            case 14:
                {
                alt5=2;
                }
                break;
            case 15:
                {
                alt5=3;
                }
                break;
            case 16:
                {
                alt5=4;
                }
                break;
            case 17:
                {
                alt5=5;
                }
                break;
            case 18:
                {
                alt5=6;
                }
                break;
            case 19:
                {
                alt5=7;
                }
                break;
            case 20:
                {
                alt5=8;
                }
                break;
            case 21:
                {
                alt5=9;
                }
                break;
            case 22:
                {
                alt5=10;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalModel.g:792:2: ( 'VARCHAR' )
                    {
                    // InternalModel.g:792:2: ( 'VARCHAR' )
                    // InternalModel.g:793:3: 'VARCHAR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeVARCHARKeyword_4_0_0()); 
                    }
                    match(input,13,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeVARCHARKeyword_4_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:798:2: ( 'CHAR' )
                    {
                    // InternalModel.g:798:2: ( 'CHAR' )
                    // InternalModel.g:799:3: 'CHAR'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeCHARKeyword_4_0_1()); 
                    }
                    match(input,14,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeCHARKeyword_4_0_1()); 
                    }

                    }


                    }
                    break;
                case 3 :
                    // InternalModel.g:804:2: ( 'INTEGER' )
                    {
                    // InternalModel.g:804:2: ( 'INTEGER' )
                    // InternalModel.g:805:3: 'INTEGER'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeINTEGERKeyword_4_0_2()); 
                    }
                    match(input,15,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeINTEGERKeyword_4_0_2()); 
                    }

                    }


                    }
                    break;
                case 4 :
                    // InternalModel.g:810:2: ( 'BIGINT' )
                    {
                    // InternalModel.g:810:2: ( 'BIGINT' )
                    // InternalModel.g:811:3: 'BIGINT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeBIGINTKeyword_4_0_3()); 
                    }
                    match(input,16,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeBIGINTKeyword_4_0_3()); 
                    }

                    }


                    }
                    break;
                case 5 :
                    // InternalModel.g:816:2: ( 'SMALLINT' )
                    {
                    // InternalModel.g:816:2: ( 'SMALLINT' )
                    // InternalModel.g:817:3: 'SMALLINT'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeSMALLINTKeyword_4_0_4()); 
                    }
                    match(input,17,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeSMALLINTKeyword_4_0_4()); 
                    }

                    }


                    }
                    break;
                case 6 :
                    // InternalModel.g:822:2: ( 'DECIMAL' )
                    {
                    // InternalModel.g:822:2: ( 'DECIMAL' )
                    // InternalModel.g:823:3: 'DECIMAL'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeDECIMALKeyword_4_0_5()); 
                    }
                    match(input,18,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeDECIMALKeyword_4_0_5()); 
                    }

                    }


                    }
                    break;
                case 7 :
                    // InternalModel.g:828:2: ( 'TIME' )
                    {
                    // InternalModel.g:828:2: ( 'TIME' )
                    // InternalModel.g:829:3: 'TIME'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeTIMEKeyword_4_0_6()); 
                    }
                    match(input,19,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeTIMEKeyword_4_0_6()); 
                    }

                    }


                    }
                    break;
                case 8 :
                    // InternalModel.g:834:2: ( 'DATE' )
                    {
                    // InternalModel.g:834:2: ( 'DATE' )
                    // InternalModel.g:835:3: 'DATE'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeDATEKeyword_4_0_7()); 
                    }
                    match(input,20,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeDATEKeyword_4_0_7()); 
                    }

                    }


                    }
                    break;
                case 9 :
                    // InternalModel.g:840:2: ( 'TIMESTAMP' )
                    {
                    // InternalModel.g:840:2: ( 'TIMESTAMP' )
                    // InternalModel.g:841:3: 'TIMESTAMP'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeTIMESTAMPKeyword_4_0_8()); 
                    }
                    match(input,21,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeTIMESTAMPKeyword_4_0_8()); 
                    }

                    }


                    }
                    break;
                case 10 :
                    // InternalModel.g:846:2: ( 'BOOLEAN' )
                    {
                    // InternalModel.g:846:2: ( 'BOOLEAN' )
                    // InternalModel.g:847:3: 'BOOLEAN'
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotColumnAccess().getTypeBOOLEANKeyword_4_0_9()); 
                    }
                    match(input,22,FOLLOW_2); if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotColumnAccess().getTypeBOOLEANKeyword_4_0_9()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__TypeAlternatives_4_0"


    // $ANTLR start "rule__YAnnotAbstractColumn__TypeAlternatives_3_0"
    // InternalModel.g:856:1: rule__YAnnotAbstractColumn__TypeAlternatives_3_0 : ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) );
    public final void rule__YAnnotAbstractColumn__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:860:1: ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalModel.g:861:2: ( ruleYAnnotColumn )
                    {
                    // InternalModel.g:861:2: ( ruleYAnnotColumn )
                    // InternalModel.g:862:3: ruleYAnnotColumn
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnParserRuleCall_3_0_0()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotColumn();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnParserRuleCall_3_0_0()); 
                    }

                    }


                    }
                    break;
                case 2 :
                    // InternalModel.g:867:2: ( ruleYAnnotColumnLike )
                    {
                    // InternalModel.g:867:2: ( ruleYAnnotColumnLike )
                    // InternalModel.g:868:3: ruleYAnnotColumnLike
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnLikeParserRuleCall_3_0_1()); 
                    }
                    pushFollow(FOLLOW_2);
                    ruleYAnnotColumnLike();

                    state._fsp--;
                    if (state.failed) return ;
                    if ( state.backtracking==0 ) {
                       after(grammarAccess.getYAnnotAbstractColumnAccess().getTypeYAnnotColumnLikeParserRuleCall_3_0_1()); 
                    }

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__TypeAlternatives_3_0"


    // $ANTLR start "rule__YModel__Group__0"
    // InternalModel.g:877:1: rule__YModel__Group__0 : rule__YModel__Group__0__Impl rule__YModel__Group__1 ;
    public final void rule__YModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:881:1: ( rule__YModel__Group__0__Impl rule__YModel__Group__1 )
            // InternalModel.g:882:2: rule__YModel__Group__0__Impl rule__YModel__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__YModel__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YModel__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__0"


    // $ANTLR start "rule__YModel__Group__0__Impl"
    // InternalModel.g:889:1: rule__YModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__YModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:893:1: ( ( 'package' ) )
            // InternalModel.g:894:1: ( 'package' )
            {
            // InternalModel.g:894:1: ( 'package' )
            // InternalModel.g:895:2: 'package'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getPackageKeyword_0()); 
            }
            match(input,23,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getPackageKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__0__Impl"


    // $ANTLR start "rule__YModel__Group__1"
    // InternalModel.g:904:1: rule__YModel__Group__1 : rule__YModel__Group__1__Impl rule__YModel__Group__2 ;
    public final void rule__YModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:908:1: ( rule__YModel__Group__1__Impl rule__YModel__Group__2 )
            // InternalModel.g:909:2: rule__YModel__Group__1__Impl rule__YModel__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__YModel__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YModel__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__1"


    // $ANTLR start "rule__YModel__Group__1__Impl"
    // InternalModel.g:916:1: rule__YModel__Group__1__Impl : ( ( rule__YModel__NameAssignment_1 ) ) ;
    public final void rule__YModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:920:1: ( ( ( rule__YModel__NameAssignment_1 ) ) )
            // InternalModel.g:921:1: ( ( rule__YModel__NameAssignment_1 ) )
            {
            // InternalModel.g:921:1: ( ( rule__YModel__NameAssignment_1 ) )
            // InternalModel.g:922:2: ( rule__YModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getNameAssignment_1()); 
            }
            // InternalModel.g:923:2: ( rule__YModel__NameAssignment_1 )
            // InternalModel.g:923:3: rule__YModel__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__YModel__NameAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getNameAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__1__Impl"


    // $ANTLR start "rule__YModel__Group__2"
    // InternalModel.g:931:1: rule__YModel__Group__2 : rule__YModel__Group__2__Impl rule__YModel__Group__3 ;
    public final void rule__YModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:935:1: ( rule__YModel__Group__2__Impl rule__YModel__Group__3 )
            // InternalModel.g:936:2: rule__YModel__Group__2__Impl rule__YModel__Group__3
            {
            pushFollow(FOLLOW_4);
            rule__YModel__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YModel__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__2"


    // $ANTLR start "rule__YModel__Group__2__Impl"
    // InternalModel.g:943:1: rule__YModel__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__YModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:947:1: ( ( ( ';' )? ) )
            // InternalModel.g:948:1: ( ( ';' )? )
            {
            // InternalModel.g:948:1: ( ( ';' )? )
            // InternalModel.g:949:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getSemicolonKeyword_2()); 
            }
            // InternalModel.g:950:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModel.g:950:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__2__Impl"


    // $ANTLR start "rule__YModel__Group__3"
    // InternalModel.g:958:1: rule__YModel__Group__3 : rule__YModel__Group__3__Impl rule__YModel__Group__4 ;
    public final void rule__YModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:962:1: ( rule__YModel__Group__3__Impl rule__YModel__Group__4 )
            // InternalModel.g:963:2: rule__YModel__Group__3__Impl rule__YModel__Group__4
            {
            pushFollow(FOLLOW_4);
            rule__YModel__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YModel__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__3"


    // $ANTLR start "rule__YModel__Group__3__Impl"
    // InternalModel.g:970:1: rule__YModel__Group__3__Impl : ( ( rule__YModel__ImportsAssignment_3 )* ) ;
    public final void rule__YModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:974:1: ( ( ( rule__YModel__ImportsAssignment_3 )* ) )
            // InternalModel.g:975:1: ( ( rule__YModel__ImportsAssignment_3 )* )
            {
            // InternalModel.g:975:1: ( ( rule__YModel__ImportsAssignment_3 )* )
            // InternalModel.g:976:2: ( rule__YModel__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getImportsAssignment_3()); 
            }
            // InternalModel.g:977:2: ( rule__YModel__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModel.g:977:3: rule__YModel__ImportsAssignment_3
            	    {
            	    pushFollow(FOLLOW_5);
            	    rule__YModel__ImportsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getImportsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__3__Impl"


    // $ANTLR start "rule__YModel__Group__4"
    // InternalModel.g:985:1: rule__YModel__Group__4 : rule__YModel__Group__4__Impl ;
    public final void rule__YModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:989:1: ( rule__YModel__Group__4__Impl )
            // InternalModel.g:990:2: rule__YModel__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YModel__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__4"


    // $ANTLR start "rule__YModel__Group__4__Impl"
    // InternalModel.g:996:1: rule__YModel__Group__4__Impl : ( ( rule__YModel__AnnotationsAssignment_4 )* ) ;
    public final void rule__YModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1000:1: ( ( ( rule__YModel__AnnotationsAssignment_4 )* ) )
            // InternalModel.g:1001:1: ( ( rule__YModel__AnnotationsAssignment_4 )* )
            {
            // InternalModel.g:1001:1: ( ( rule__YModel__AnnotationsAssignment_4 )* )
            // InternalModel.g:1002:2: ( rule__YModel__AnnotationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getAnnotationsAssignment_4()); 
            }
            // InternalModel.g:1003:2: ( rule__YModel__AnnotationsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||LA9_0==40||LA9_0==47||LA9_0==49||LA9_0==51) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModel.g:1003:3: rule__YModel__AnnotationsAssignment_4
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__YModel__AnnotationsAssignment_4();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getAnnotationsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__Group__4__Impl"


    // $ANTLR start "rule__YImport__Group__0"
    // InternalModel.g:1012:1: rule__YImport__Group__0 : rule__YImport__Group__0__Impl rule__YImport__Group__1 ;
    public final void rule__YImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1016:1: ( rule__YImport__Group__0__Impl rule__YImport__Group__1 )
            // InternalModel.g:1017:2: rule__YImport__Group__0__Impl rule__YImport__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__YImport__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YImport__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__0"


    // $ANTLR start "rule__YImport__Group__0__Impl"
    // InternalModel.g:1024:1: rule__YImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__YImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1028:1: ( ( 'import' ) )
            // InternalModel.g:1029:1: ( 'import' )
            {
            // InternalModel.g:1029:1: ( 'import' )
            // InternalModel.g:1030:2: 'import'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getImportKeyword_0()); 
            }
            match(input,25,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportAccess().getImportKeyword_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__0__Impl"


    // $ANTLR start "rule__YImport__Group__1"
    // InternalModel.g:1039:1: rule__YImport__Group__1 : rule__YImport__Group__1__Impl rule__YImport__Group__2 ;
    public final void rule__YImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1043:1: ( rule__YImport__Group__1__Impl rule__YImport__Group__2 )
            // InternalModel.g:1044:2: rule__YImport__Group__1__Impl rule__YImport__Group__2
            {
            pushFollow(FOLLOW_7);
            rule__YImport__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YImport__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__1"


    // $ANTLR start "rule__YImport__Group__1__Impl"
    // InternalModel.g:1051:1: rule__YImport__Group__1__Impl : ( ( rule__YImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__YImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1055:1: ( ( ( rule__YImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalModel.g:1056:1: ( ( rule__YImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalModel.g:1056:1: ( ( rule__YImport__ImportedNamespaceAssignment_1 ) )
            // InternalModel.g:1057:2: ( rule__YImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalModel.g:1058:2: ( rule__YImport__ImportedNamespaceAssignment_1 )
            // InternalModel.g:1058:3: rule__YImport__ImportedNamespaceAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__YImport__ImportedNamespaceAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportAccess().getImportedNamespaceAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__1__Impl"


    // $ANTLR start "rule__YImport__Group__2"
    // InternalModel.g:1066:1: rule__YImport__Group__2 : rule__YImport__Group__2__Impl ;
    public final void rule__YImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1070:1: ( rule__YImport__Group__2__Impl )
            // InternalModel.g:1071:2: rule__YImport__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YImport__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__2"


    // $ANTLR start "rule__YImport__Group__2__Impl"
    // InternalModel.g:1077:1: rule__YImport__Group__2__Impl : ( ';' ) ;
    public final void rule__YImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1081:1: ( ( ';' ) )
            // InternalModel.g:1082:1: ( ';' )
            {
            // InternalModel.g:1082:1: ( ';' )
            // InternalModel.g:1083:2: ';'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getSemicolonKeyword_2()); 
            }
            match(input,24,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportAccess().getSemicolonKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__Group__2__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__0"
    // InternalModel.g:1093:1: rule__YAnnotEntity__Group__0 : rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1 ;
    public final void rule__YAnnotEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1097:1: ( rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1 )
            // InternalModel.g:1098:2: rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1
            {
            pushFollow(FOLLOW_8);
            rule__YAnnotEntity__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__0"


    // $ANTLR start "rule__YAnnotEntity__Group__0__Impl"
    // InternalModel.g:1105:1: rule__YAnnotEntity__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1109:1: ( ( () ) )
            // InternalModel.g:1110:1: ( () )
            {
            // InternalModel.g:1110:1: ( () )
            // InternalModel.g:1111:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getYAnnotEntityAction_0()); 
            }
            // InternalModel.g:1112:2: ()
            // InternalModel.g:1112:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getYAnnotEntityAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__0__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__1"
    // InternalModel.g:1120:1: rule__YAnnotEntity__Group__1 : rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2 ;
    public final void rule__YAnnotEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1124:1: ( rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2 )
            // InternalModel.g:1125:2: rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotEntity__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__1"


    // $ANTLR start "rule__YAnnotEntity__Group__1__Impl"
    // InternalModel.g:1132:1: rule__YAnnotEntity__Group__1__Impl : ( '@entity' ) ;
    public final void rule__YAnnotEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1136:1: ( ( '@entity' ) )
            // InternalModel.g:1137:1: ( '@entity' )
            {
            // InternalModel.g:1137:1: ( '@entity' )
            // InternalModel.g:1138:2: '@entity'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getEntityKeyword_1()); 
            }
            match(input,26,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getEntityKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__1__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__2"
    // InternalModel.g:1147:1: rule__YAnnotEntity__Group__2 : rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3 ;
    public final void rule__YAnnotEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1151:1: ( rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3 )
            // InternalModel.g:1152:2: rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3
            {
            pushFollow(FOLLOW_9);
            rule__YAnnotEntity__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__2"


    // $ANTLR start "rule__YAnnotEntity__Group__2__Impl"
    // InternalModel.g:1159:1: rule__YAnnotEntity__Group__2__Impl : ( ( rule__YAnnotEntity__NameAssignment_2 ) ) ;
    public final void rule__YAnnotEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1163:1: ( ( ( rule__YAnnotEntity__NameAssignment_2 ) ) )
            // InternalModel.g:1164:1: ( ( rule__YAnnotEntity__NameAssignment_2 ) )
            {
            // InternalModel.g:1164:1: ( ( rule__YAnnotEntity__NameAssignment_2 ) )
            // InternalModel.g:1165:2: ( rule__YAnnotEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1166:2: ( rule__YAnnotEntity__NameAssignment_2 )
            // InternalModel.g:1166:3: rule__YAnnotEntity__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__2__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__3"
    // InternalModel.g:1174:1: rule__YAnnotEntity__Group__3 : rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4 ;
    public final void rule__YAnnotEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1178:1: ( rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4 )
            // InternalModel.g:1179:2: rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4
            {
            pushFollow(FOLLOW_9);
            rule__YAnnotEntity__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__3"


    // $ANTLR start "rule__YAnnotEntity__Group__3__Impl"
    // InternalModel.g:1186:1: rule__YAnnotEntity__Group__3__Impl : ( ( rule__YAnnotEntity__Group_3__0 )? ) ;
    public final void rule__YAnnotEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1190:1: ( ( ( rule__YAnnotEntity__Group_3__0 )? ) )
            // InternalModel.g:1191:1: ( ( rule__YAnnotEntity__Group_3__0 )? )
            {
            // InternalModel.g:1191:1: ( ( rule__YAnnotEntity__Group_3__0 )? )
            // InternalModel.g:1192:2: ( rule__YAnnotEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3()); 
            }
            // InternalModel.g:1193:2: ( rule__YAnnotEntity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModel.g:1193:3: rule__YAnnotEntity__Group_3__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotEntity__Group_3__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getGroup_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__3__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__4"
    // InternalModel.g:1201:1: rule__YAnnotEntity__Group__4 : rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5 ;
    public final void rule__YAnnotEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1205:1: ( rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5 )
            // InternalModel.g:1206:2: rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5
            {
            pushFollow(FOLLOW_10);
            rule__YAnnotEntity__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__4"


    // $ANTLR start "rule__YAnnotEntity__Group__4__Impl"
    // InternalModel.g:1213:1: rule__YAnnotEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__YAnnotEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1217:1: ( ( '{' ) )
            // InternalModel.g:1218:1: ( '{' )
            {
            // InternalModel.g:1218:1: ( '{' )
            // InternalModel.g:1219:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__4__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__5"
    // InternalModel.g:1228:1: rule__YAnnotEntity__Group__5 : rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6 ;
    public final void rule__YAnnotEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1232:1: ( rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6 )
            // InternalModel.g:1233:2: rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__YAnnotEntity__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__5"


    // $ANTLR start "rule__YAnnotEntity__Group__5__Impl"
    // InternalModel.g:1240:1: rule__YAnnotEntity__Group__5__Impl : ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* ) ;
    public final void rule__YAnnotEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1244:1: ( ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* ) )
            // InternalModel.g:1245:1: ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* )
            {
            // InternalModel.g:1245:1: ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* )
            // InternalModel.g:1246:2: ( rule__YAnnotEntity__AnnotationsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getAnnotationsAssignment_5()); 
            }
            // InternalModel.g:1247:2: ( rule__YAnnotEntity__AnnotationsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=33)||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModel.g:1247:3: rule__YAnnotEntity__AnnotationsAssignment_5
            	    {
            	    pushFollow(FOLLOW_11);
            	    rule__YAnnotEntity__AnnotationsAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getAnnotationsAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__5__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group__6"
    // InternalModel.g:1255:1: rule__YAnnotEntity__Group__6 : rule__YAnnotEntity__Group__6__Impl ;
    public final void rule__YAnnotEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1259:1: ( rule__YAnnotEntity__Group__6__Impl )
            // InternalModel.g:1260:2: rule__YAnnotEntity__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__6"


    // $ANTLR start "rule__YAnnotEntity__Group__6__Impl"
    // InternalModel.g:1266:1: rule__YAnnotEntity__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1270:1: ( ( '}' ) )
            // InternalModel.g:1271:1: ( '}' )
            {
            // InternalModel.g:1271:1: ( '}' )
            // InternalModel.g:1272:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group__6__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3__0"
    // InternalModel.g:1282:1: rule__YAnnotEntity__Group_3__0 : rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1 ;
    public final void rule__YAnnotEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1286:1: ( rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1 )
            // InternalModel.g:1287:2: rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotEntity__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__0"


    // $ANTLR start "rule__YAnnotEntity__Group_3__0__Impl"
    // InternalModel.g:1294:1: rule__YAnnotEntity__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1298:1: ( ( ( '(' ) ) )
            // InternalModel.g:1299:1: ( ( '(' ) )
            {
            // InternalModel.g:1299:1: ( ( '(' ) )
            // InternalModel.g:1300:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // InternalModel.g:1301:2: ( '(' )
            // InternalModel.g:1301:3: '('
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__0__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3__1"
    // InternalModel.g:1309:1: rule__YAnnotEntity__Group_3__1 : rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2 ;
    public final void rule__YAnnotEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1313:1: ( rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2 )
            // InternalModel.g:1314:2: rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotEntity__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__1"


    // $ANTLR start "rule__YAnnotEntity__Group_3__1__Impl"
    // InternalModel.g:1321:1: rule__YAnnotEntity__Group_3__1__Impl : ( ( rule__YAnnotEntity__Group_3_1__0 )? ) ;
    public final void rule__YAnnotEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1325:1: ( ( ( rule__YAnnotEntity__Group_3_1__0 )? ) )
            // InternalModel.g:1326:1: ( ( rule__YAnnotEntity__Group_3_1__0 )? )
            {
            // InternalModel.g:1326:1: ( ( rule__YAnnotEntity__Group_3_1__0 )? )
            // InternalModel.g:1327:2: ( rule__YAnnotEntity__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3_1()); 
            }
            // InternalModel.g:1328:2: ( rule__YAnnotEntity__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModel.g:1328:3: rule__YAnnotEntity__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotEntity__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getGroup_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__1__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3__2"
    // InternalModel.g:1336:1: rule__YAnnotEntity__Group_3__2 : rule__YAnnotEntity__Group_3__2__Impl ;
    public final void rule__YAnnotEntity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1340:1: ( rule__YAnnotEntity__Group_3__2__Impl )
            // InternalModel.g:1341:2: rule__YAnnotEntity__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__2"


    // $ANTLR start "rule__YAnnotEntity__Group_3__2__Impl"
    // InternalModel.g:1347:1: rule__YAnnotEntity__Group_3__2__Impl : ( ')' ) ;
    public final void rule__YAnnotEntity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1351:1: ( ( ')' ) )
            // InternalModel.g:1352:1: ( ')' )
            {
            // InternalModel.g:1352:1: ( ')' )
            // InternalModel.g:1353:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getRightParenthesisKeyword_3_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3__2__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1__0"
    // InternalModel.g:1363:1: rule__YAnnotEntity__Group_3_1__0 : rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1 ;
    public final void rule__YAnnotEntity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1367:1: ( rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1 )
            // InternalModel.g:1368:2: rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotEntity__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1__0"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1__0__Impl"
    // InternalModel.g:1375:1: rule__YAnnotEntity__Group_3_1__0__Impl : ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) ) ;
    public final void rule__YAnnotEntity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1379:1: ( ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) ) )
            // InternalModel.g:1380:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) )
            {
            // InternalModel.g:1380:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) )
            // InternalModel.g:1381:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_0()); 
            }
            // InternalModel.g:1382:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 )
            // InternalModel.g:1382:3: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1__0__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1__1"
    // InternalModel.g:1390:1: rule__YAnnotEntity__Group_3_1__1 : rule__YAnnotEntity__Group_3_1__1__Impl ;
    public final void rule__YAnnotEntity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1394:1: ( rule__YAnnotEntity__Group_3_1__1__Impl )
            // InternalModel.g:1395:2: rule__YAnnotEntity__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1__1"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1__1__Impl"
    // InternalModel.g:1401:1: rule__YAnnotEntity__Group_3_1__1__Impl : ( ( rule__YAnnotEntity__Group_3_1_1__0 )* ) ;
    public final void rule__YAnnotEntity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1405:1: ( ( ( rule__YAnnotEntity__Group_3_1_1__0 )* ) )
            // InternalModel.g:1406:1: ( ( rule__YAnnotEntity__Group_3_1_1__0 )* )
            {
            // InternalModel.g:1406:1: ( ( rule__YAnnotEntity__Group_3_1_1__0 )* )
            // InternalModel.g:1407:2: ( rule__YAnnotEntity__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3_1_1()); 
            }
            // InternalModel.g:1408:2: ( rule__YAnnotEntity__Group_3_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModel.g:1408:3: rule__YAnnotEntity__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotEntity__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getGroup_3_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1__1__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1_1__0"
    // InternalModel.g:1417:1: rule__YAnnotEntity__Group_3_1_1__0 : rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1 ;
    public final void rule__YAnnotEntity__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1421:1: ( rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1 )
            // InternalModel.g:1422:2: rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotEntity__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1_1__0"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1_1__0__Impl"
    // InternalModel.g:1429:1: rule__YAnnotEntity__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotEntity__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1433:1: ( ( ',' ) )
            // InternalModel.g:1434:1: ( ',' )
            {
            // InternalModel.g:1434:1: ( ',' )
            // InternalModel.g:1435:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getCommaKeyword_3_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1_1__1"
    // InternalModel.g:1444:1: rule__YAnnotEntity__Group_3_1_1__1 : rule__YAnnotEntity__Group_3_1_1__1__Impl ;
    public final void rule__YAnnotEntity__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1448:1: ( rule__YAnnotEntity__Group_3_1_1__1__Impl )
            // InternalModel.g:1449:2: rule__YAnnotEntity__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__Group_3_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1_1__1"


    // $ANTLR start "rule__YAnnotEntity__Group_3_1_1__1__Impl"
    // InternalModel.g:1455:1: rule__YAnnotEntity__Group_3_1_1__1__Impl : ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) ) ;
    public final void rule__YAnnotEntity__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1459:1: ( ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) ) )
            // InternalModel.g:1460:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) )
            {
            // InternalModel.g:1460:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) )
            // InternalModel.g:1461:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_1_1()); 
            }
            // InternalModel.g:1462:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 )
            // InternalModel.g:1462:3: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__0"
    // InternalModel.g:1471:1: rule__YAnnotAttribute__Group__0 : rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1 ;
    public final void rule__YAnnotAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1475:1: ( rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1 )
            // InternalModel.g:1476:2: rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__YAnnotAttribute__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__0"


    // $ANTLR start "rule__YAnnotAttribute__Group__0__Impl"
    // InternalModel.g:1483:1: rule__YAnnotAttribute__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1487:1: ( ( () ) )
            // InternalModel.g:1488:1: ( () )
            {
            // InternalModel.g:1488:1: ( () )
            // InternalModel.g:1489:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getYAnnotAttributeAction_0()); 
            }
            // InternalModel.g:1490:2: ()
            // InternalModel.g:1490:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getYAnnotAttributeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__0__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__1"
    // InternalModel.g:1498:1: rule__YAnnotAttribute__Group__1 : rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2 ;
    public final void rule__YAnnotAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1502:1: ( rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2 )
            // InternalModel.g:1503:2: rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotAttribute__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__1"


    // $ANTLR start "rule__YAnnotAttribute__Group__1__Impl"
    // InternalModel.g:1510:1: rule__YAnnotAttribute__Group__1__Impl : ( '@attribute' ) ;
    public final void rule__YAnnotAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1514:1: ( ( '@attribute' ) )
            // InternalModel.g:1515:1: ( '@attribute' )
            {
            // InternalModel.g:1515:1: ( '@attribute' )
            // InternalModel.g:1516:2: '@attribute'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getAttributeKeyword_1()); 
            }
            match(input,32,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getAttributeKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__1__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__2"
    // InternalModel.g:1525:1: rule__YAnnotAttribute__Group__2 : rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3 ;
    public final void rule__YAnnotAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1529:1: ( rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3 )
            // InternalModel.g:1530:2: rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotAttribute__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__2"


    // $ANTLR start "rule__YAnnotAttribute__Group__2__Impl"
    // InternalModel.g:1537:1: rule__YAnnotAttribute__Group__2__Impl : ( ( rule__YAnnotAttribute__NameAssignment_2 ) ) ;
    public final void rule__YAnnotAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1541:1: ( ( ( rule__YAnnotAttribute__NameAssignment_2 ) ) )
            // InternalModel.g:1542:1: ( ( rule__YAnnotAttribute__NameAssignment_2 ) )
            {
            // InternalModel.g:1542:1: ( ( rule__YAnnotAttribute__NameAssignment_2 ) )
            // InternalModel.g:1543:2: ( rule__YAnnotAttribute__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1544:2: ( rule__YAnnotAttribute__NameAssignment_2 )
            // InternalModel.g:1544:3: rule__YAnnotAttribute__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__2__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__3"
    // InternalModel.g:1552:1: rule__YAnnotAttribute__Group__3 : rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4 ;
    public final void rule__YAnnotAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1556:1: ( rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4 )
            // InternalModel.g:1557:2: rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotAttribute__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__3"


    // $ANTLR start "rule__YAnnotAttribute__Group__3__Impl"
    // InternalModel.g:1564:1: rule__YAnnotAttribute__Group__3__Impl : ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? ) ;
    public final void rule__YAnnotAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1568:1: ( ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? ) )
            // InternalModel.g:1569:1: ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? )
            {
            // InternalModel.g:1569:1: ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? )
            // InternalModel.g:1570:2: ( rule__YAnnotAttribute__OptionalAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalAssignment_3()); 
            }
            // InternalModel.g:1571:2: ( rule__YAnnotAttribute__OptionalAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==54) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModel.g:1571:3: rule__YAnnotAttribute__OptionalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotAttribute__OptionalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getOptionalAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__3__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__4"
    // InternalModel.g:1579:1: rule__YAnnotAttribute__Group__4 : rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5 ;
    public final void rule__YAnnotAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1583:1: ( rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5 )
            // InternalModel.g:1584:2: rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotAttribute__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__4"


    // $ANTLR start "rule__YAnnotAttribute__Group__4__Impl"
    // InternalModel.g:1591:1: rule__YAnnotAttribute__Group__4__Impl : ( ( rule__YAnnotAttribute__Group_4__0 )? ) ;
    public final void rule__YAnnotAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1595:1: ( ( ( rule__YAnnotAttribute__Group_4__0 )? ) )
            // InternalModel.g:1596:1: ( ( rule__YAnnotAttribute__Group_4__0 )? )
            {
            // InternalModel.g:1596:1: ( ( rule__YAnnotAttribute__Group_4__0 )? )
            // InternalModel.g:1597:2: ( rule__YAnnotAttribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4()); 
            }
            // InternalModel.g:1598:2: ( rule__YAnnotAttribute__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModel.g:1598:3: rule__YAnnotAttribute__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotAttribute__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__4__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group__5"
    // InternalModel.g:1606:1: rule__YAnnotAttribute__Group__5 : rule__YAnnotAttribute__Group__5__Impl ;
    public final void rule__YAnnotAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1610:1: ( rule__YAnnotAttribute__Group__5__Impl )
            // InternalModel.g:1611:2: rule__YAnnotAttribute__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__5"


    // $ANTLR start "rule__YAnnotAttribute__Group__5__Impl"
    // InternalModel.g:1617:1: rule__YAnnotAttribute__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1621:1: ( ( ( ';' )? ) )
            // InternalModel.g:1622:1: ( ( ';' )? )
            {
            // InternalModel.g:1622:1: ( ( ';' )? )
            // InternalModel.g:1623:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getSemicolonKeyword_5()); 
            }
            // InternalModel.g:1624:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModel.g:1624:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group__5__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__0"
    // InternalModel.g:1633:1: rule__YAnnotAttribute__Group_4__0 : rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1 ;
    public final void rule__YAnnotAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1637:1: ( rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1 )
            // InternalModel.g:1638:2: rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotAttribute__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__0"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__0__Impl"
    // InternalModel.g:1645:1: rule__YAnnotAttribute__Group_4__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1649:1: ( ( ( '(' ) ) )
            // InternalModel.g:1650:1: ( ( '(' ) )
            {
            // InternalModel.g:1650:1: ( ( '(' ) )
            // InternalModel.g:1651:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0()); 
            }
            // InternalModel.g:1652:2: ( '(' )
            // InternalModel.g:1652:3: '('
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__0__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__1"
    // InternalModel.g:1660:1: rule__YAnnotAttribute__Group_4__1 : rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2 ;
    public final void rule__YAnnotAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1664:1: ( rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2 )
            // InternalModel.g:1665:2: rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotAttribute__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__1"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__1__Impl"
    // InternalModel.g:1672:1: rule__YAnnotAttribute__Group_4__1__Impl : ( ( rule__YAnnotAttribute__Group_4_1__0 )? ) ;
    public final void rule__YAnnotAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1676:1: ( ( ( rule__YAnnotAttribute__Group_4_1__0 )? ) )
            // InternalModel.g:1677:1: ( ( rule__YAnnotAttribute__Group_4_1__0 )? )
            {
            // InternalModel.g:1677:1: ( ( rule__YAnnotAttribute__Group_4_1__0 )? )
            // InternalModel.g:1678:2: ( rule__YAnnotAttribute__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1()); 
            }
            // InternalModel.g:1679:2: ( rule__YAnnotAttribute__Group_4_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModel.g:1679:3: rule__YAnnotAttribute__Group_4_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotAttribute__Group_4_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__1__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__2"
    // InternalModel.g:1687:1: rule__YAnnotAttribute__Group_4__2 : rule__YAnnotAttribute__Group_4__2__Impl ;
    public final void rule__YAnnotAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1691:1: ( rule__YAnnotAttribute__Group_4__2__Impl )
            // InternalModel.g:1692:2: rule__YAnnotAttribute__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__2"


    // $ANTLR start "rule__YAnnotAttribute__Group_4__2__Impl"
    // InternalModel.g:1698:1: rule__YAnnotAttribute__Group_4__2__Impl : ( ')' ) ;
    public final void rule__YAnnotAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1702:1: ( ( ')' ) )
            // InternalModel.g:1703:1: ( ')' )
            {
            // InternalModel.g:1703:1: ( ')' )
            // InternalModel.g:1704:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getRightParenthesisKeyword_4_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getRightParenthesisKeyword_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4__2__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1__0"
    // InternalModel.g:1714:1: rule__YAnnotAttribute__Group_4_1__0 : rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1 ;
    public final void rule__YAnnotAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1718:1: ( rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1 )
            // InternalModel.g:1719:2: rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotAttribute__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1__0"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1__0__Impl"
    // InternalModel.g:1726:1: rule__YAnnotAttribute__Group_4_1__0__Impl : ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) ) ;
    public final void rule__YAnnotAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1730:1: ( ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) ) )
            // InternalModel.g:1731:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) )
            {
            // InternalModel.g:1731:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) )
            // InternalModel.g:1732:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_0()); 
            }
            // InternalModel.g:1733:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 )
            // InternalModel.g:1733:3: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1__0__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1__1"
    // InternalModel.g:1741:1: rule__YAnnotAttribute__Group_4_1__1 : rule__YAnnotAttribute__Group_4_1__1__Impl ;
    public final void rule__YAnnotAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1745:1: ( rule__YAnnotAttribute__Group_4_1__1__Impl )
            // InternalModel.g:1746:2: rule__YAnnotAttribute__Group_4_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1__1"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1__1__Impl"
    // InternalModel.g:1752:1: rule__YAnnotAttribute__Group_4_1__1__Impl : ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* ) ;
    public final void rule__YAnnotAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1756:1: ( ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* ) )
            // InternalModel.g:1757:1: ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* )
            {
            // InternalModel.g:1757:1: ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* )
            // InternalModel.g:1758:2: ( rule__YAnnotAttribute__Group_4_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1_1()); 
            }
            // InternalModel.g:1759:2: ( rule__YAnnotAttribute__Group_4_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalModel.g:1759:3: rule__YAnnotAttribute__Group_4_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotAttribute__Group_4_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1__1__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1_1__0"
    // InternalModel.g:1768:1: rule__YAnnotAttribute__Group_4_1_1__0 : rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1 ;
    public final void rule__YAnnotAttribute__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1772:1: ( rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1 )
            // InternalModel.g:1773:2: rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotAttribute__Group_4_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1_1__0"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1_1__0__Impl"
    // InternalModel.g:1780:1: rule__YAnnotAttribute__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotAttribute__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1784:1: ( ( ',' ) )
            // InternalModel.g:1785:1: ( ',' )
            {
            // InternalModel.g:1785:1: ( ',' )
            // InternalModel.g:1786:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getCommaKeyword_4_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1_1__0__Impl"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1_1__1"
    // InternalModel.g:1795:1: rule__YAnnotAttribute__Group_4_1_1__1 : rule__YAnnotAttribute__Group_4_1_1__1__Impl ;
    public final void rule__YAnnotAttribute__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1799:1: ( rule__YAnnotAttribute__Group_4_1_1__1__Impl )
            // InternalModel.g:1800:2: rule__YAnnotAttribute__Group_4_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__Group_4_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1_1__1"


    // $ANTLR start "rule__YAnnotAttribute__Group_4_1_1__1__Impl"
    // InternalModel.g:1806:1: rule__YAnnotAttribute__Group_4_1_1__1__Impl : ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) ) ;
    public final void rule__YAnnotAttribute__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1810:1: ( ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) ) )
            // InternalModel.g:1811:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) )
            {
            // InternalModel.g:1811:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) )
            // InternalModel.g:1812:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_1_1()); 
            }
            // InternalModel.g:1813:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 )
            // InternalModel.g:1813:3: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__Group_4_1_1__1__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__0"
    // InternalModel.g:1822:1: rule__YAnnotRelationship__Group__0 : rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1 ;
    public final void rule__YAnnotRelationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1826:1: ( rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1 )
            // InternalModel.g:1827:2: rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__YAnnotRelationship__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__0"


    // $ANTLR start "rule__YAnnotRelationship__Group__0__Impl"
    // InternalModel.g:1834:1: rule__YAnnotRelationship__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotRelationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1838:1: ( ( () ) )
            // InternalModel.g:1839:1: ( () )
            {
            // InternalModel.g:1839:1: ( () )
            // InternalModel.g:1840:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getYAnnotRelationshipAction_0()); 
            }
            // InternalModel.g:1841:2: ()
            // InternalModel.g:1841:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getYAnnotRelationshipAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__0__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__1"
    // InternalModel.g:1849:1: rule__YAnnotRelationship__Group__1 : rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2 ;
    public final void rule__YAnnotRelationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1853:1: ( rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2 )
            // InternalModel.g:1854:2: rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotRelationship__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__1"


    // $ANTLR start "rule__YAnnotRelationship__Group__1__Impl"
    // InternalModel.g:1861:1: rule__YAnnotRelationship__Group__1__Impl : ( '@relationship' ) ;
    public final void rule__YAnnotRelationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1865:1: ( ( '@relationship' ) )
            // InternalModel.g:1866:1: ( '@relationship' )
            {
            // InternalModel.g:1866:1: ( '@relationship' )
            // InternalModel.g:1867:2: '@relationship'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getRelationshipKeyword_1()); 
            }
            match(input,33,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getRelationshipKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__1__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__2"
    // InternalModel.g:1876:1: rule__YAnnotRelationship__Group__2 : rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3 ;
    public final void rule__YAnnotRelationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1880:1: ( rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3 )
            // InternalModel.g:1881:2: rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3
            {
            pushFollow(FOLLOW_18);
            rule__YAnnotRelationship__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__2"


    // $ANTLR start "rule__YAnnotRelationship__Group__2__Impl"
    // InternalModel.g:1888:1: rule__YAnnotRelationship__Group__2__Impl : ( ( rule__YAnnotRelationship__NameAssignment_2 ) ) ;
    public final void rule__YAnnotRelationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1892:1: ( ( ( rule__YAnnotRelationship__NameAssignment_2 ) ) )
            // InternalModel.g:1893:1: ( ( rule__YAnnotRelationship__NameAssignment_2 ) )
            {
            // InternalModel.g:1893:1: ( ( rule__YAnnotRelationship__NameAssignment_2 ) )
            // InternalModel.g:1894:2: ( rule__YAnnotRelationship__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1895:2: ( rule__YAnnotRelationship__NameAssignment_2 )
            // InternalModel.g:1895:3: rule__YAnnotRelationship__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__2__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__3"
    // InternalModel.g:1903:1: rule__YAnnotRelationship__Group__3 : rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4 ;
    public final void rule__YAnnotRelationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1907:1: ( rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4 )
            // InternalModel.g:1908:2: rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4
            {
            pushFollow(FOLLOW_18);
            rule__YAnnotRelationship__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__3"


    // $ANTLR start "rule__YAnnotRelationship__Group__3__Impl"
    // InternalModel.g:1915:1: rule__YAnnotRelationship__Group__3__Impl : ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? ) ;
    public final void rule__YAnnotRelationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1919:1: ( ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? ) )
            // InternalModel.g:1920:1: ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? )
            {
            // InternalModel.g:1920:1: ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? )
            // InternalModel.g:1921:2: ( rule__YAnnotRelationship__OptionalAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalAssignment_3()); 
            }
            // InternalModel.g:1922:2: ( rule__YAnnotRelationship__OptionalAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==54) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModel.g:1922:3: rule__YAnnotRelationship__OptionalAssignment_3
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotRelationship__OptionalAssignment_3();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getOptionalAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__3__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__4"
    // InternalModel.g:1930:1: rule__YAnnotRelationship__Group__4 : rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5 ;
    public final void rule__YAnnotRelationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1934:1: ( rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5 )
            // InternalModel.g:1935:2: rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotRelationship__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__4"


    // $ANTLR start "rule__YAnnotRelationship__Group__4__Impl"
    // InternalModel.g:1942:1: rule__YAnnotRelationship__Group__4__Impl : ( '->' ) ;
    public final void rule__YAnnotRelationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1946:1: ( ( '->' ) )
            // InternalModel.g:1947:1: ( '->' )
            {
            // InternalModel.g:1947:1: ( '->' )
            // InternalModel.g:1948:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getHyphenMinusGreaterThanSignKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__4__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__5"
    // InternalModel.g:1957:1: rule__YAnnotRelationship__Group__5 : rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6 ;
    public final void rule__YAnnotRelationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1961:1: ( rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6 )
            // InternalModel.g:1962:2: rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6
            {
            pushFollow(FOLLOW_19);
            rule__YAnnotRelationship__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__5"


    // $ANTLR start "rule__YAnnotRelationship__Group__5__Impl"
    // InternalModel.g:1969:1: rule__YAnnotRelationship__Group__5__Impl : ( ( rule__YAnnotRelationship__TargetAssignment_5 ) ) ;
    public final void rule__YAnnotRelationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1973:1: ( ( ( rule__YAnnotRelationship__TargetAssignment_5 ) ) )
            // InternalModel.g:1974:1: ( ( rule__YAnnotRelationship__TargetAssignment_5 ) )
            {
            // InternalModel.g:1974:1: ( ( rule__YAnnotRelationship__TargetAssignment_5 ) )
            // InternalModel.g:1975:2: ( rule__YAnnotRelationship__TargetAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getTargetAssignment_5()); 
            }
            // InternalModel.g:1976:2: ( rule__YAnnotRelationship__TargetAssignment_5 )
            // InternalModel.g:1976:3: rule__YAnnotRelationship__TargetAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__TargetAssignment_5();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getTargetAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__5__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__6"
    // InternalModel.g:1984:1: rule__YAnnotRelationship__Group__6 : rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7 ;
    public final void rule__YAnnotRelationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1988:1: ( rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7 )
            // InternalModel.g:1989:2: rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7
            {
            pushFollow(FOLLOW_19);
            rule__YAnnotRelationship__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__6"


    // $ANTLR start "rule__YAnnotRelationship__Group__6__Impl"
    // InternalModel.g:1996:1: rule__YAnnotRelationship__Group__6__Impl : ( ( rule__YAnnotRelationship__ManyAssignment_6 )? ) ;
    public final void rule__YAnnotRelationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2000:1: ( ( ( rule__YAnnotRelationship__ManyAssignment_6 )? ) )
            // InternalModel.g:2001:1: ( ( rule__YAnnotRelationship__ManyAssignment_6 )? )
            {
            // InternalModel.g:2001:1: ( ( rule__YAnnotRelationship__ManyAssignment_6 )? )
            // InternalModel.g:2002:2: ( rule__YAnnotRelationship__ManyAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAssignment_6()); 
            }
            // InternalModel.g:2003:2: ( rule__YAnnotRelationship__ManyAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModel.g:2003:3: rule__YAnnotRelationship__ManyAssignment_6
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotRelationship__ManyAssignment_6();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getManyAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__6__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__7"
    // InternalModel.g:2011:1: rule__YAnnotRelationship__Group__7 : rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8 ;
    public final void rule__YAnnotRelationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2015:1: ( rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8 )
            // InternalModel.g:2016:2: rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8
            {
            pushFollow(FOLLOW_19);
            rule__YAnnotRelationship__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__7"


    // $ANTLR start "rule__YAnnotRelationship__Group__7__Impl"
    // InternalModel.g:2023:1: rule__YAnnotRelationship__Group__7__Impl : ( ( rule__YAnnotRelationship__Group_7__0 )? ) ;
    public final void rule__YAnnotRelationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2027:1: ( ( ( rule__YAnnotRelationship__Group_7__0 )? ) )
            // InternalModel.g:2028:1: ( ( rule__YAnnotRelationship__Group_7__0 )? )
            {
            // InternalModel.g:2028:1: ( ( rule__YAnnotRelationship__Group_7__0 )? )
            // InternalModel.g:2029:2: ( rule__YAnnotRelationship__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7()); 
            }
            // InternalModel.g:2030:2: ( rule__YAnnotRelationship__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModel.g:2030:3: rule__YAnnotRelationship__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotRelationship__Group_7__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getGroup_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__7__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__8"
    // InternalModel.g:2038:1: rule__YAnnotRelationship__Group__8 : rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9 ;
    public final void rule__YAnnotRelationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2042:1: ( rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9 )
            // InternalModel.g:2043:2: rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9
            {
            pushFollow(FOLLOW_19);
            rule__YAnnotRelationship__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__8"


    // $ANTLR start "rule__YAnnotRelationship__Group__8__Impl"
    // InternalModel.g:2050:1: rule__YAnnotRelationship__Group__8__Impl : ( ( rule__YAnnotRelationship__Group_8__0 )? ) ;
    public final void rule__YAnnotRelationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2054:1: ( ( ( rule__YAnnotRelationship__Group_8__0 )? ) )
            // InternalModel.g:2055:1: ( ( rule__YAnnotRelationship__Group_8__0 )? )
            {
            // InternalModel.g:2055:1: ( ( rule__YAnnotRelationship__Group_8__0 )? )
            // InternalModel.g:2056:2: ( rule__YAnnotRelationship__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_8()); 
            }
            // InternalModel.g:2057:2: ( rule__YAnnotRelationship__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModel.g:2057:3: rule__YAnnotRelationship__Group_8__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotRelationship__Group_8__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getGroup_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__8__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group__9"
    // InternalModel.g:2065:1: rule__YAnnotRelationship__Group__9 : rule__YAnnotRelationship__Group__9__Impl ;
    public final void rule__YAnnotRelationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2069:1: ( rule__YAnnotRelationship__Group__9__Impl )
            // InternalModel.g:2070:2: rule__YAnnotRelationship__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__9"


    // $ANTLR start "rule__YAnnotRelationship__Group__9__Impl"
    // InternalModel.g:2076:1: rule__YAnnotRelationship__Group__9__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotRelationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2080:1: ( ( ( ';' )? ) )
            // InternalModel.g:2081:1: ( ( ';' )? )
            {
            // InternalModel.g:2081:1: ( ( ';' )? )
            // InternalModel.g:2082:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getSemicolonKeyword_9()); 
            }
            // InternalModel.g:2083:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModel.g:2083:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getSemicolonKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group__9__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__0"
    // InternalModel.g:2092:1: rule__YAnnotRelationship__Group_7__0 : rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1 ;
    public final void rule__YAnnotRelationship__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2096:1: ( rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1 )
            // InternalModel.g:2097:2: rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotRelationship__Group_7__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__0"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__0__Impl"
    // InternalModel.g:2104:1: rule__YAnnotRelationship__Group_7__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotRelationship__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2108:1: ( ( ( '(' ) ) )
            // InternalModel.g:2109:1: ( ( '(' ) )
            {
            // InternalModel.g:2109:1: ( ( '(' ) )
            // InternalModel.g:2110:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0()); 
            }
            // InternalModel.g:2111:2: ( '(' )
            // InternalModel.g:2111:3: '('
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__0__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__1"
    // InternalModel.g:2119:1: rule__YAnnotRelationship__Group_7__1 : rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2 ;
    public final void rule__YAnnotRelationship__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2123:1: ( rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2 )
            // InternalModel.g:2124:2: rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotRelationship__Group_7__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__1"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__1__Impl"
    // InternalModel.g:2131:1: rule__YAnnotRelationship__Group_7__1__Impl : ( ( rule__YAnnotRelationship__Group_7_1__0 )? ) ;
    public final void rule__YAnnotRelationship__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2135:1: ( ( ( rule__YAnnotRelationship__Group_7_1__0 )? ) )
            // InternalModel.g:2136:1: ( ( rule__YAnnotRelationship__Group_7_1__0 )? )
            {
            // InternalModel.g:2136:1: ( ( rule__YAnnotRelationship__Group_7_1__0 )? )
            // InternalModel.g:2137:2: ( rule__YAnnotRelationship__Group_7_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1()); 
            }
            // InternalModel.g:2138:2: ( rule__YAnnotRelationship__Group_7_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModel.g:2138:3: rule__YAnnotRelationship__Group_7_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotRelationship__Group_7_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__1__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__2"
    // InternalModel.g:2146:1: rule__YAnnotRelationship__Group_7__2 : rule__YAnnotRelationship__Group_7__2__Impl ;
    public final void rule__YAnnotRelationship__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2150:1: ( rule__YAnnotRelationship__Group_7__2__Impl )
            // InternalModel.g:2151:2: rule__YAnnotRelationship__Group_7__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__2"


    // $ANTLR start "rule__YAnnotRelationship__Group_7__2__Impl"
    // InternalModel.g:2157:1: rule__YAnnotRelationship__Group_7__2__Impl : ( ')' ) ;
    public final void rule__YAnnotRelationship__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2161:1: ( ( ')' ) )
            // InternalModel.g:2162:1: ( ')' )
            {
            // InternalModel.g:2162:1: ( ')' )
            // InternalModel.g:2163:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getRightParenthesisKeyword_7_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getRightParenthesisKeyword_7_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7__2__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1__0"
    // InternalModel.g:2173:1: rule__YAnnotRelationship__Group_7_1__0 : rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1 ;
    public final void rule__YAnnotRelationship__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2177:1: ( rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1 )
            // InternalModel.g:2178:2: rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotRelationship__Group_7_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1__0"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1__0__Impl"
    // InternalModel.g:2185:1: rule__YAnnotRelationship__Group_7_1__0__Impl : ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) ) ;
    public final void rule__YAnnotRelationship__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2189:1: ( ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) ) )
            // InternalModel.g:2190:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) )
            {
            // InternalModel.g:2190:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) )
            // InternalModel.g:2191:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_0()); 
            }
            // InternalModel.g:2192:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 )
            // InternalModel.g:2192:3: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1__0__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1__1"
    // InternalModel.g:2200:1: rule__YAnnotRelationship__Group_7_1__1 : rule__YAnnotRelationship__Group_7_1__1__Impl ;
    public final void rule__YAnnotRelationship__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2204:1: ( rule__YAnnotRelationship__Group_7_1__1__Impl )
            // InternalModel.g:2205:2: rule__YAnnotRelationship__Group_7_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1__1"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1__1__Impl"
    // InternalModel.g:2211:1: rule__YAnnotRelationship__Group_7_1__1__Impl : ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* ) ;
    public final void rule__YAnnotRelationship__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2215:1: ( ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* ) )
            // InternalModel.g:2216:1: ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* )
            {
            // InternalModel.g:2216:1: ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* )
            // InternalModel.g:2217:2: ( rule__YAnnotRelationship__Group_7_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1_1()); 
            }
            // InternalModel.g:2218:2: ( rule__YAnnotRelationship__Group_7_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalModel.g:2218:3: rule__YAnnotRelationship__Group_7_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotRelationship__Group_7_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1__1__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1_1__0"
    // InternalModel.g:2227:1: rule__YAnnotRelationship__Group_7_1_1__0 : rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1 ;
    public final void rule__YAnnotRelationship__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2231:1: ( rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1 )
            // InternalModel.g:2232:2: rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotRelationship__Group_7_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1_1__0"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1_1__0__Impl"
    // InternalModel.g:2239:1: rule__YAnnotRelationship__Group_7_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotRelationship__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2243:1: ( ( ',' ) )
            // InternalModel.g:2244:1: ( ',' )
            {
            // InternalModel.g:2244:1: ( ',' )
            // InternalModel.g:2245:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getCommaKeyword_7_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1_1__0__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1_1__1"
    // InternalModel.g:2254:1: rule__YAnnotRelationship__Group_7_1_1__1 : rule__YAnnotRelationship__Group_7_1_1__1__Impl ;
    public final void rule__YAnnotRelationship__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2258:1: ( rule__YAnnotRelationship__Group_7_1_1__1__Impl )
            // InternalModel.g:2259:2: rule__YAnnotRelationship__Group_7_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_7_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1_1__1"


    // $ANTLR start "rule__YAnnotRelationship__Group_7_1_1__1__Impl"
    // InternalModel.g:2265:1: rule__YAnnotRelationship__Group_7_1_1__1__Impl : ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) ) ;
    public final void rule__YAnnotRelationship__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2269:1: ( ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) ) )
            // InternalModel.g:2270:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) )
            {
            // InternalModel.g:2270:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) )
            // InternalModel.g:2271:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_1_1()); 
            }
            // InternalModel.g:2272:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 )
            // InternalModel.g:2272:3: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_7_1_1__1__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_8__0"
    // InternalModel.g:2281:1: rule__YAnnotRelationship__Group_8__0 : rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1 ;
    public final void rule__YAnnotRelationship__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2285:1: ( rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1 )
            // InternalModel.g:2286:2: rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotRelationship__Group_8__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_8__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_8__0"


    // $ANTLR start "rule__YAnnotRelationship__Group_8__0__Impl"
    // InternalModel.g:2293:1: rule__YAnnotRelationship__Group_8__0__Impl : ( '<-' ) ;
    public final void rule__YAnnotRelationship__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2297:1: ( ( '<-' ) )
            // InternalModel.g:2298:1: ( '<-' )
            {
            // InternalModel.g:2298:1: ( '<-' )
            // InternalModel.g:2299:2: '<-'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0()); 
            }
            match(input,35,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getLessThanSignHyphenMinusKeyword_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_8__0__Impl"


    // $ANTLR start "rule__YAnnotRelationship__Group_8__1"
    // InternalModel.g:2308:1: rule__YAnnotRelationship__Group_8__1 : rule__YAnnotRelationship__Group_8__1__Impl ;
    public final void rule__YAnnotRelationship__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2312:1: ( rule__YAnnotRelationship__Group_8__1__Impl )
            // InternalModel.g:2313:2: rule__YAnnotRelationship__Group_8__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__Group_8__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_8__1"


    // $ANTLR start "rule__YAnnotRelationship__Group_8__1__Impl"
    // InternalModel.g:2319:1: rule__YAnnotRelationship__Group_8__1__Impl : ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) ) ;
    public final void rule__YAnnotRelationship__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2323:1: ( ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) ) )
            // InternalModel.g:2324:1: ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) )
            {
            // InternalModel.g:2324:1: ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) )
            // InternalModel.g:2325:2: ( rule__YAnnotRelationship__InverseAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getInverseAssignment_8_1()); 
            }
            // InternalModel.g:2326:2: ( rule__YAnnotRelationship__InverseAssignment_8_1 )
            // InternalModel.g:2326:3: rule__YAnnotRelationship__InverseAssignment_8_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotRelationship__InverseAssignment_8_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getInverseAssignment_8_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__Group_8__1__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__0"
    // InternalModel.g:2335:1: rule__YAnnotIdentifier__Group__0 : rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1 ;
    public final void rule__YAnnotIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2339:1: ( rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1 )
            // InternalModel.g:2340:2: rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1
            {
            pushFollow(FOLLOW_20);
            rule__YAnnotIdentifier__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__0"


    // $ANTLR start "rule__YAnnotIdentifier__Group__0__Impl"
    // InternalModel.g:2347:1: rule__YAnnotIdentifier__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2351:1: ( ( () ) )
            // InternalModel.g:2352:1: ( () )
            {
            // InternalModel.g:2352:1: ( () )
            // InternalModel.g:2353:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getYAnnotIdentifierAction_0()); 
            }
            // InternalModel.g:2354:2: ()
            // InternalModel.g:2354:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getYAnnotIdentifierAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__0__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__1"
    // InternalModel.g:2362:1: rule__YAnnotIdentifier__Group__1 : rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2 ;
    public final void rule__YAnnotIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2366:1: ( rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2 )
            // InternalModel.g:2367:2: rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotIdentifier__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__1"


    // $ANTLR start "rule__YAnnotIdentifier__Group__1__Impl"
    // InternalModel.g:2374:1: rule__YAnnotIdentifier__Group__1__Impl : ( '@identifier' ) ;
    public final void rule__YAnnotIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2378:1: ( ( '@identifier' ) )
            // InternalModel.g:2379:1: ( '@identifier' )
            {
            // InternalModel.g:2379:1: ( '@identifier' )
            // InternalModel.g:2380:2: '@identifier'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getIdentifierKeyword_1()); 
            }
            match(input,36,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getIdentifierKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__1__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__2"
    // InternalModel.g:2389:1: rule__YAnnotIdentifier__Group__2 : rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3 ;
    public final void rule__YAnnotIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2393:1: ( rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3 )
            // InternalModel.g:2394:2: rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3
            {
            pushFollow(FOLLOW_21);
            rule__YAnnotIdentifier__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__2"


    // $ANTLR start "rule__YAnnotIdentifier__Group__2__Impl"
    // InternalModel.g:2401:1: rule__YAnnotIdentifier__Group__2__Impl : ( ( rule__YAnnotIdentifier__NameAssignment_2 ) ) ;
    public final void rule__YAnnotIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2405:1: ( ( ( rule__YAnnotIdentifier__NameAssignment_2 ) ) )
            // InternalModel.g:2406:1: ( ( rule__YAnnotIdentifier__NameAssignment_2 ) )
            {
            // InternalModel.g:2406:1: ( ( rule__YAnnotIdentifier__NameAssignment_2 ) )
            // InternalModel.g:2407:2: ( rule__YAnnotIdentifier__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:2408:2: ( rule__YAnnotIdentifier__NameAssignment_2 )
            // InternalModel.g:2408:3: rule__YAnnotIdentifier__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__2__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__3"
    // InternalModel.g:2416:1: rule__YAnnotIdentifier__Group__3 : rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4 ;
    public final void rule__YAnnotIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2420:1: ( rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4 )
            // InternalModel.g:2421:2: rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotIdentifier__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__3"


    // $ANTLR start "rule__YAnnotIdentifier__Group__3__Impl"
    // InternalModel.g:2428:1: rule__YAnnotIdentifier__Group__3__Impl : ( '(' ) ;
    public final void rule__YAnnotIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2432:1: ( ( '(' ) )
            // InternalModel.g:2433:1: ( '(' )
            {
            // InternalModel.g:2433:1: ( '(' )
            // InternalModel.g:2434:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getLeftParenthesisKeyword_3()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getLeftParenthesisKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__3__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__4"
    // InternalModel.g:2443:1: rule__YAnnotIdentifier__Group__4 : rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5 ;
    public final void rule__YAnnotIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2447:1: ( rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5 )
            // InternalModel.g:2448:2: rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5
            {
            pushFollow(FOLLOW_22);
            rule__YAnnotIdentifier__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__4"


    // $ANTLR start "rule__YAnnotIdentifier__Group__4__Impl"
    // InternalModel.g:2455:1: rule__YAnnotIdentifier__Group__4__Impl : ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) ) ;
    public final void rule__YAnnotIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2459:1: ( ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) ) )
            // InternalModel.g:2460:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) )
            {
            // InternalModel.g:2460:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) )
            // InternalModel.g:2461:2: ( rule__YAnnotIdentifier__AnnotsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_4()); 
            }
            // InternalModel.g:2462:2: ( rule__YAnnotIdentifier__AnnotsAssignment_4 )
            // InternalModel.g:2462:3: rule__YAnnotIdentifier__AnnotsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__AnnotsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__4__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__5"
    // InternalModel.g:2470:1: rule__YAnnotIdentifier__Group__5 : rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6 ;
    public final void rule__YAnnotIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2474:1: ( rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6 )
            // InternalModel.g:2475:2: rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6
            {
            pushFollow(FOLLOW_22);
            rule__YAnnotIdentifier__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__5"


    // $ANTLR start "rule__YAnnotIdentifier__Group__5__Impl"
    // InternalModel.g:2482:1: rule__YAnnotIdentifier__Group__5__Impl : ( ( rule__YAnnotIdentifier__Group_5__0 )* ) ;
    public final void rule__YAnnotIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2486:1: ( ( ( rule__YAnnotIdentifier__Group_5__0 )* ) )
            // InternalModel.g:2487:1: ( ( rule__YAnnotIdentifier__Group_5__0 )* )
            {
            // InternalModel.g:2487:1: ( ( rule__YAnnotIdentifier__Group_5__0 )* )
            // InternalModel.g:2488:2: ( rule__YAnnotIdentifier__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getGroup_5()); 
            }
            // InternalModel.g:2489:2: ( rule__YAnnotIdentifier__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalModel.g:2489:3: rule__YAnnotIdentifier__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotIdentifier__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__5__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__6"
    // InternalModel.g:2497:1: rule__YAnnotIdentifier__Group__6 : rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7 ;
    public final void rule__YAnnotIdentifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2501:1: ( rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7 )
            // InternalModel.g:2502:2: rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__YAnnotIdentifier__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__6"


    // $ANTLR start "rule__YAnnotIdentifier__Group__6__Impl"
    // InternalModel.g:2509:1: rule__YAnnotIdentifier__Group__6__Impl : ( ')' ) ;
    public final void rule__YAnnotIdentifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2513:1: ( ( ')' ) )
            // InternalModel.g:2514:1: ( ')' )
            {
            // InternalModel.g:2514:1: ( ')' )
            // InternalModel.g:2515:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getRightParenthesisKeyword_6()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getRightParenthesisKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__6__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group__7"
    // InternalModel.g:2524:1: rule__YAnnotIdentifier__Group__7 : rule__YAnnotIdentifier__Group__7__Impl ;
    public final void rule__YAnnotIdentifier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2528:1: ( rule__YAnnotIdentifier__Group__7__Impl )
            // InternalModel.g:2529:2: rule__YAnnotIdentifier__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__7"


    // $ANTLR start "rule__YAnnotIdentifier__Group__7__Impl"
    // InternalModel.g:2535:1: rule__YAnnotIdentifier__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotIdentifier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2539:1: ( ( ( ';' )? ) )
            // InternalModel.g:2540:1: ( ( ';' )? )
            {
            // InternalModel.g:2540:1: ( ( ';' )? )
            // InternalModel.g:2541:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:2542:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModel.g:2542:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group__7__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group_5__0"
    // InternalModel.g:2551:1: rule__YAnnotIdentifier__Group_5__0 : rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1 ;
    public final void rule__YAnnotIdentifier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2555:1: ( rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1 )
            // InternalModel.g:2556:2: rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotIdentifier__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group_5__0"


    // $ANTLR start "rule__YAnnotIdentifier__Group_5__0__Impl"
    // InternalModel.g:2563:1: rule__YAnnotIdentifier__Group_5__0__Impl : ( ',' ) ;
    public final void rule__YAnnotIdentifier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2567:1: ( ( ',' ) )
            // InternalModel.g:2568:1: ( ',' )
            {
            // InternalModel.g:2568:1: ( ',' )
            // InternalModel.g:2569:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group_5__0__Impl"


    // $ANTLR start "rule__YAnnotIdentifier__Group_5__1"
    // InternalModel.g:2578:1: rule__YAnnotIdentifier__Group_5__1 : rule__YAnnotIdentifier__Group_5__1__Impl ;
    public final void rule__YAnnotIdentifier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2582:1: ( rule__YAnnotIdentifier__Group_5__1__Impl )
            // InternalModel.g:2583:2: rule__YAnnotIdentifier__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group_5__1"


    // $ANTLR start "rule__YAnnotIdentifier__Group_5__1__Impl"
    // InternalModel.g:2589:1: rule__YAnnotIdentifier__Group_5__1__Impl : ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) ) ;
    public final void rule__YAnnotIdentifier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2593:1: ( ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) ) )
            // InternalModel.g:2594:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) )
            {
            // InternalModel.g:2594:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) )
            // InternalModel.g:2595:2: ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_5_1()); 
            }
            // InternalModel.g:2596:2: ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 )
            // InternalModel.g:2596:3: rule__YAnnotIdentifier__AnnotsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotIdentifier__AnnotsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__Group_5__1__Impl"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group__0"
    // InternalModel.g:2605:1: rule__YAnnotationElementValuePair__Group__0 : rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1 ;
    public final void rule__YAnnotationElementValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2609:1: ( rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1 )
            // InternalModel.g:2610:2: rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1
            {
            pushFollow(FOLLOW_23);
            rule__YAnnotationElementValuePair__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group__0"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group__0__Impl"
    // InternalModel.g:2617:1: rule__YAnnotationElementValuePair__Group__0__Impl : ( ( rule__YAnnotationElementValuePair__Group_0__0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2621:1: ( ( ( rule__YAnnotationElementValuePair__Group_0__0 ) ) )
            // InternalModel.g:2622:1: ( ( rule__YAnnotationElementValuePair__Group_0__0 ) )
            {
            // InternalModel.g:2622:1: ( ( rule__YAnnotationElementValuePair__Group_0__0 ) )
            // InternalModel.g:2623:2: ( rule__YAnnotationElementValuePair__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0()); 
            }
            // InternalModel.g:2624:2: ( rule__YAnnotationElementValuePair__Group_0__0 )
            // InternalModel.g:2624:3: rule__YAnnotationElementValuePair__Group_0__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group__0__Impl"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group__1"
    // InternalModel.g:2632:1: rule__YAnnotationElementValuePair__Group__1 : rule__YAnnotationElementValuePair__Group__1__Impl ;
    public final void rule__YAnnotationElementValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2636:1: ( rule__YAnnotationElementValuePair__Group__1__Impl )
            // InternalModel.g:2637:2: rule__YAnnotationElementValuePair__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group__1"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group__1__Impl"
    // InternalModel.g:2643:1: rule__YAnnotationElementValuePair__Group__1__Impl : ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2647:1: ( ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) ) )
            // InternalModel.g:2648:1: ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) )
            {
            // InternalModel.g:2648:1: ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) )
            // InternalModel.g:2649:2: ( rule__YAnnotationElementValuePair__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getValueAssignment_1()); 
            }
            // InternalModel.g:2650:2: ( rule__YAnnotationElementValuePair__ValueAssignment_1 )
            // InternalModel.g:2650:3: rule__YAnnotationElementValuePair__ValueAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__ValueAssignment_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getValueAssignment_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group__1__Impl"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0__0"
    // InternalModel.g:2659:1: rule__YAnnotationElementValuePair__Group_0__0 : rule__YAnnotationElementValuePair__Group_0__0__Impl ;
    public final void rule__YAnnotationElementValuePair__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2663:1: ( rule__YAnnotationElementValuePair__Group_0__0__Impl )
            // InternalModel.g:2664:2: rule__YAnnotationElementValuePair__Group_0__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0__0"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0__0__Impl"
    // InternalModel.g:2670:1: rule__YAnnotationElementValuePair__Group_0__0__Impl : ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2674:1: ( ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) ) )
            // InternalModel.g:2675:1: ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) )
            {
            // InternalModel.g:2675:1: ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) )
            // InternalModel.g:2676:2: ( rule__YAnnotationElementValuePair__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0_0()); 
            }
            // InternalModel.g:2677:2: ( rule__YAnnotationElementValuePair__Group_0_0__0 )
            // InternalModel.g:2677:3: rule__YAnnotationElementValuePair__Group_0_0__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group_0_0__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0__0__Impl"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0_0__0"
    // InternalModel.g:2686:1: rule__YAnnotationElementValuePair__Group_0_0__0 : rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1 ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2690:1: ( rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1 )
            // InternalModel.g:2691:2: rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1
            {
            pushFollow(FOLLOW_24);
            rule__YAnnotationElementValuePair__Group_0_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group_0_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0_0__0"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0_0__0__Impl"
    // InternalModel.g:2698:1: rule__YAnnotationElementValuePair__Group_0_0__0__Impl : ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2702:1: ( ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) ) )
            // InternalModel.g:2703:1: ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) )
            {
            // InternalModel.g:2703:1: ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) )
            // InternalModel.g:2704:2: ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getNameAssignment_0_0_0()); 
            }
            // InternalModel.g:2705:2: ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 )
            // InternalModel.g:2705:3: rule__YAnnotationElementValuePair__NameAssignment_0_0_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__NameAssignment_0_0_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getNameAssignment_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0_0__0__Impl"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0_0__1"
    // InternalModel.g:2713:1: rule__YAnnotationElementValuePair__Group_0_0__1 : rule__YAnnotationElementValuePair__Group_0_0__1__Impl ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2717:1: ( rule__YAnnotationElementValuePair__Group_0_0__1__Impl )
            // InternalModel.g:2718:2: rule__YAnnotationElementValuePair__Group_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotationElementValuePair__Group_0_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0_0__1"


    // $ANTLR start "rule__YAnnotationElementValuePair__Group_0_0__1__Impl"
    // InternalModel.g:2724:1: rule__YAnnotationElementValuePair__Group_0_0__1__Impl : ( '=' ) ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2728:1: ( ( '=' ) )
            // InternalModel.g:2729:1: ( '=' )
            {
            // InternalModel.g:2729:1: ( '=' )
            // InternalModel.g:2730:2: '='
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getEqualsSignKeyword_0_0_1()); 
            }
            match(input,37,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getEqualsSignKeyword_0_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__Group_0_0__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_0__0"
    // InternalModel.g:2740:1: rule__YAnnotExpression__Group_0__0 : rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1 ;
    public final void rule__YAnnotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2744:1: ( rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1 )
            // InternalModel.g:2745:2: rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotExpression__Group_0__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_0__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_0__0"


    // $ANTLR start "rule__YAnnotExpression__Group_0__0__Impl"
    // InternalModel.g:2752:1: rule__YAnnotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2756:1: ( ( () ) )
            // InternalModel.g:2757:1: ( () )
            {
            // InternalModel.g:2757:1: ( () )
            // InternalModel.g:2758:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0()); 
            }
            // InternalModel.g:2759:2: ()
            // InternalModel.g:2759:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_0__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_0__1"
    // InternalModel.g:2767:1: rule__YAnnotExpression__Group_0__1 : rule__YAnnotExpression__Group_0__1__Impl ;
    public final void rule__YAnnotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2771:1: ( rule__YAnnotExpression__Group_0__1__Impl )
            // InternalModel.g:2772:2: rule__YAnnotExpression__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_0__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_0__1"


    // $ANTLR start "rule__YAnnotExpression__Group_0__1__Impl"
    // InternalModel.g:2778:1: rule__YAnnotExpression__Group_0__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__YAnnotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2782:1: ( ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) ) )
            // InternalModel.g:2783:1: ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) )
            {
            // InternalModel.g:2783:1: ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) )
            // InternalModel.g:2784:2: ( rule__YAnnotExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalModel.g:2785:2: ( rule__YAnnotExpression__ValueAssignment_0_1 )
            // InternalModel.g:2785:3: rule__YAnnotExpression__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ValueAssignment_0_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_0_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_0__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_1__0"
    // InternalModel.g:2794:1: rule__YAnnotExpression__Group_1__0 : rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1 ;
    public final void rule__YAnnotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2798:1: ( rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1 )
            // InternalModel.g:2799:2: rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1
            {
            pushFollow(FOLLOW_25);
            rule__YAnnotExpression__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_1__0"


    // $ANTLR start "rule__YAnnotExpression__Group_1__0__Impl"
    // InternalModel.g:2806:1: rule__YAnnotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2810:1: ( ( () ) )
            // InternalModel.g:2811:1: ( () )
            {
            // InternalModel.g:2811:1: ( () )
            // InternalModel.g:2812:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0()); 
            }
            // InternalModel.g:2813:2: ()
            // InternalModel.g:2813:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_1__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_1__1"
    // InternalModel.g:2821:1: rule__YAnnotExpression__Group_1__1 : rule__YAnnotExpression__Group_1__1__Impl ;
    public final void rule__YAnnotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2825:1: ( rule__YAnnotExpression__Group_1__1__Impl )
            // InternalModel.g:2826:2: rule__YAnnotExpression__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_1__1"


    // $ANTLR start "rule__YAnnotExpression__Group_1__1__Impl"
    // InternalModel.g:2832:1: rule__YAnnotExpression__Group_1__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__YAnnotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2836:1: ( ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) ) )
            // InternalModel.g:2837:1: ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) )
            {
            // InternalModel.g:2837:1: ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) )
            // InternalModel.g:2838:2: ( rule__YAnnotExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalModel.g:2839:2: ( rule__YAnnotExpression__ValueAssignment_1_1 )
            // InternalModel.g:2839:3: rule__YAnnotExpression__ValueAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ValueAssignment_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_1__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_2__0"
    // InternalModel.g:2848:1: rule__YAnnotExpression__Group_2__0 : rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1 ;
    public final void rule__YAnnotExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2852:1: ( rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1 )
            // InternalModel.g:2853:2: rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1
            {
            pushFollow(FOLLOW_26);
            rule__YAnnotExpression__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_2__0"


    // $ANTLR start "rule__YAnnotExpression__Group_2__0__Impl"
    // InternalModel.g:2860:1: rule__YAnnotExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2864:1: ( ( () ) )
            // InternalModel.g:2865:1: ( () )
            {
            // InternalModel.g:2865:1: ( () )
            // InternalModel.g:2866:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0()); 
            }
            // InternalModel.g:2867:2: ()
            // InternalModel.g:2867:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_2__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_2__1"
    // InternalModel.g:2875:1: rule__YAnnotExpression__Group_2__1 : rule__YAnnotExpression__Group_2__1__Impl ;
    public final void rule__YAnnotExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2879:1: ( rule__YAnnotExpression__Group_2__1__Impl )
            // InternalModel.g:2880:2: rule__YAnnotExpression__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_2__1"


    // $ANTLR start "rule__YAnnotExpression__Group_2__1__Impl"
    // InternalModel.g:2886:1: rule__YAnnotExpression__Group_2__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__YAnnotExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2890:1: ( ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) ) )
            // InternalModel.g:2891:1: ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) )
            {
            // InternalModel.g:2891:1: ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) )
            // InternalModel.g:2892:2: ( rule__YAnnotExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalModel.g:2893:2: ( rule__YAnnotExpression__ValueAssignment_2_1 )
            // InternalModel.g:2893:3: rule__YAnnotExpression__ValueAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ValueAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_2__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_3__0"
    // InternalModel.g:2902:1: rule__YAnnotExpression__Group_3__0 : rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1 ;
    public final void rule__YAnnotExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2906:1: ( rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1 )
            // InternalModel.g:2907:2: rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1
            {
            pushFollow(FOLLOW_27);
            rule__YAnnotExpression__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_3__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_3__0"


    // $ANTLR start "rule__YAnnotExpression__Group_3__0__Impl"
    // InternalModel.g:2914:1: rule__YAnnotExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2918:1: ( ( () ) )
            // InternalModel.g:2919:1: ( () )
            {
            // InternalModel.g:2919:1: ( () )
            // InternalModel.g:2920:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0()); 
            }
            // InternalModel.g:2921:2: ()
            // InternalModel.g:2921:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_3__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_3__1"
    // InternalModel.g:2929:1: rule__YAnnotExpression__Group_3__1 : rule__YAnnotExpression__Group_3__1__Impl ;
    public final void rule__YAnnotExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2933:1: ( rule__YAnnotExpression__Group_3__1__Impl )
            // InternalModel.g:2934:2: rule__YAnnotExpression__Group_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_3__1"


    // $ANTLR start "rule__YAnnotExpression__Group_3__1__Impl"
    // InternalModel.g:2940:1: rule__YAnnotExpression__Group_3__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__YAnnotExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2944:1: ( ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) ) )
            // InternalModel.g:2945:1: ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) )
            {
            // InternalModel.g:2945:1: ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) )
            // InternalModel.g:2946:2: ( rule__YAnnotExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalModel.g:2947:2: ( rule__YAnnotExpression__ValueAssignment_3_1 )
            // InternalModel.g:2947:3: rule__YAnnotExpression__ValueAssignment_3_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ValueAssignment_3_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_3_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_3__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4__0"
    // InternalModel.g:2956:1: rule__YAnnotExpression__Group_4__0 : rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1 ;
    public final void rule__YAnnotExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2960:1: ( rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1 )
            // InternalModel.g:2961:2: rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1
            {
            pushFollow(FOLLOW_23);
            rule__YAnnotExpression__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__0"


    // $ANTLR start "rule__YAnnotExpression__Group_4__0__Impl"
    // InternalModel.g:2968:1: rule__YAnnotExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2972:1: ( ( () ) )
            // InternalModel.g:2973:1: ( () )
            {
            // InternalModel.g:2973:1: ( () )
            // InternalModel.g:2974:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0()); 
            }
            // InternalModel.g:2975:2: ()
            // InternalModel.g:2975:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4__1"
    // InternalModel.g:2983:1: rule__YAnnotExpression__Group_4__1 : rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2 ;
    public final void rule__YAnnotExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2987:1: ( rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2 )
            // InternalModel.g:2988:2: rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2
            {
            pushFollow(FOLLOW_28);
            rule__YAnnotExpression__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__1"


    // $ANTLR start "rule__YAnnotExpression__Group_4__1__Impl"
    // InternalModel.g:2995:1: rule__YAnnotExpression__Group_4__1__Impl : ( ( rule__YAnnotExpression__Group_4_1__0 ) ) ;
    public final void rule__YAnnotExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2999:1: ( ( ( rule__YAnnotExpression__Group_4_1__0 ) ) )
            // InternalModel.g:3000:1: ( ( rule__YAnnotExpression__Group_4_1__0 ) )
            {
            // InternalModel.g:3000:1: ( ( rule__YAnnotExpression__Group_4_1__0 ) )
            // InternalModel.g:3001:2: ( rule__YAnnotExpression__Group_4_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_1()); 
            }
            // InternalModel.g:3002:2: ( rule__YAnnotExpression__Group_4_1__0 )
            // InternalModel.g:3002:3: rule__YAnnotExpression__Group_4_1__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_1__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getGroup_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4__2"
    // InternalModel.g:3010:1: rule__YAnnotExpression__Group_4__2 : rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3 ;
    public final void rule__YAnnotExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3014:1: ( rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3 )
            // InternalModel.g:3015:2: rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3
            {
            pushFollow(FOLLOW_28);
            rule__YAnnotExpression__Group_4__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__2"


    // $ANTLR start "rule__YAnnotExpression__Group_4__2__Impl"
    // InternalModel.g:3022:1: rule__YAnnotExpression__Group_4__2__Impl : ( ( rule__YAnnotExpression__Group_4_2__0 )? ) ;
    public final void rule__YAnnotExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3026:1: ( ( ( rule__YAnnotExpression__Group_4_2__0 )? ) )
            // InternalModel.g:3027:1: ( ( rule__YAnnotExpression__Group_4_2__0 )? )
            {
            // InternalModel.g:3027:1: ( ( rule__YAnnotExpression__Group_4_2__0 )? )
            // InternalModel.g:3028:2: ( rule__YAnnotExpression__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2()); 
            }
            // InternalModel.g:3029:2: ( rule__YAnnotExpression__Group_4_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=11 && LA28_0<=12)||LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModel.g:3029:3: rule__YAnnotExpression__Group_4_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotExpression__Group_4_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__2__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4__3"
    // InternalModel.g:3037:1: rule__YAnnotExpression__Group_4__3 : rule__YAnnotExpression__Group_4__3__Impl ;
    public final void rule__YAnnotExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3041:1: ( rule__YAnnotExpression__Group_4__3__Impl )
            // InternalModel.g:3042:2: rule__YAnnotExpression__Group_4__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__3"


    // $ANTLR start "rule__YAnnotExpression__Group_4__3__Impl"
    // InternalModel.g:3048:1: rule__YAnnotExpression__Group_4__3__Impl : ( ']' ) ;
    public final void rule__YAnnotExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3052:1: ( ( ']' ) )
            // InternalModel.g:3053:1: ( ']' )
            {
            // InternalModel.g:3053:1: ( ']' )
            // InternalModel.g:3054:2: ']'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getRightSquareBracketKeyword_4_3()); 
            }
            match(input,38,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getRightSquareBracketKeyword_4_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4__3__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4_1__0"
    // InternalModel.g:3064:1: rule__YAnnotExpression__Group_4_1__0 : rule__YAnnotExpression__Group_4_1__0__Impl ;
    public final void rule__YAnnotExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3068:1: ( rule__YAnnotExpression__Group_4_1__0__Impl )
            // InternalModel.g:3069:2: rule__YAnnotExpression__Group_4_1__0__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_1__0"


    // $ANTLR start "rule__YAnnotExpression__Group_4_1__0__Impl"
    // InternalModel.g:3075:1: rule__YAnnotExpression__Group_4_1__0__Impl : ( '[' ) ;
    public final void rule__YAnnotExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3079:1: ( ( '[' ) )
            // InternalModel.g:3080:1: ( '[' )
            {
            // InternalModel.g:3080:1: ( '[' )
            // InternalModel.g:3081:2: '['
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0()); 
            }
            match(input,39,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getLeftSquareBracketKeyword_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_1__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2__0"
    // InternalModel.g:3091:1: rule__YAnnotExpression__Group_4_2__0 : rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1 ;
    public final void rule__YAnnotExpression__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3095:1: ( rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1 )
            // InternalModel.g:3096:2: rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotExpression__Group_4_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2__0"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2__0__Impl"
    // InternalModel.g:3103:1: rule__YAnnotExpression__Group_4_2__0__Impl : ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) ) ;
    public final void rule__YAnnotExpression__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3107:1: ( ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) ) )
            // InternalModel.g:3108:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) )
            {
            // InternalModel.g:3108:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) )
            // InternalModel.g:3109:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_0()); 
            }
            // InternalModel.g:3110:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_0 )
            // InternalModel.g:3110:3: rule__YAnnotExpression__ElementsAssignment_4_2_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ElementsAssignment_4_2_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2__1"
    // InternalModel.g:3118:1: rule__YAnnotExpression__Group_4_2__1 : rule__YAnnotExpression__Group_4_2__1__Impl ;
    public final void rule__YAnnotExpression__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3122:1: ( rule__YAnnotExpression__Group_4_2__1__Impl )
            // InternalModel.g:3123:2: rule__YAnnotExpression__Group_4_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2__1"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2__1__Impl"
    // InternalModel.g:3129:1: rule__YAnnotExpression__Group_4_2__1__Impl : ( ( rule__YAnnotExpression__Group_4_2_1__0 )* ) ;
    public final void rule__YAnnotExpression__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3133:1: ( ( ( rule__YAnnotExpression__Group_4_2_1__0 )* ) )
            // InternalModel.g:3134:1: ( ( rule__YAnnotExpression__Group_4_2_1__0 )* )
            {
            // InternalModel.g:3134:1: ( ( rule__YAnnotExpression__Group_4_2_1__0 )* )
            // InternalModel.g:3135:2: ( rule__YAnnotExpression__Group_4_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2_1()); 
            }
            // InternalModel.g:3136:2: ( rule__YAnnotExpression__Group_4_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModel.g:3136:3: rule__YAnnotExpression__Group_4_2_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotExpression__Group_4_2_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2__1__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2_1__0"
    // InternalModel.g:3145:1: rule__YAnnotExpression__Group_4_2_1__0 : rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1 ;
    public final void rule__YAnnotExpression__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3149:1: ( rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1 )
            // InternalModel.g:3150:2: rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1
            {
            pushFollow(FOLLOW_23);
            rule__YAnnotExpression__Group_4_2_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_2_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2_1__0"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2_1__0__Impl"
    // InternalModel.g:3157:1: rule__YAnnotExpression__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotExpression__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3161:1: ( ( ',' ) )
            // InternalModel.g:3162:1: ( ',' )
            {
            // InternalModel.g:3162:1: ( ',' )
            // InternalModel.g:3163:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getCommaKeyword_4_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2_1__0__Impl"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2_1__1"
    // InternalModel.g:3172:1: rule__YAnnotExpression__Group_4_2_1__1 : rule__YAnnotExpression__Group_4_2_1__1__Impl ;
    public final void rule__YAnnotExpression__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3176:1: ( rule__YAnnotExpression__Group_4_2_1__1__Impl )
            // InternalModel.g:3177:2: rule__YAnnotExpression__Group_4_2_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__Group_4_2_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2_1__1"


    // $ANTLR start "rule__YAnnotExpression__Group_4_2_1__1__Impl"
    // InternalModel.g:3183:1: rule__YAnnotExpression__Group_4_2_1__1__Impl : ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) ) ;
    public final void rule__YAnnotExpression__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3187:1: ( ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) ) )
            // InternalModel.g:3188:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) )
            {
            // InternalModel.g:3188:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) )
            // InternalModel.g:3189:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_1_1()); 
            }
            // InternalModel.g:3190:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 )
            // InternalModel.g:3190:3: rule__YAnnotExpression__ElementsAssignment_4_2_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ElementsAssignment_4_2_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__Group_4_2_1__1__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__0"
    // InternalModel.g:3199:1: rule__YAnnotTechnicalDesign__Group__0 : rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1 ;
    public final void rule__YAnnotTechnicalDesign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3203:1: ( rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1 )
            // InternalModel.g:3204:2: rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1
            {
            pushFollow(FOLLOW_29);
            rule__YAnnotTechnicalDesign__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__0"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__0__Impl"
    // InternalModel.g:3211:1: rule__YAnnotTechnicalDesign__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotTechnicalDesign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3215:1: ( ( () ) )
            // InternalModel.g:3216:1: ( () )
            {
            // InternalModel.g:3216:1: ( () )
            // InternalModel.g:3217:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0()); 
            }
            // InternalModel.g:3218:2: ()
            // InternalModel.g:3218:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__0__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__1"
    // InternalModel.g:3226:1: rule__YAnnotTechnicalDesign__Group__1 : rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2 ;
    public final void rule__YAnnotTechnicalDesign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3230:1: ( rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2 )
            // InternalModel.g:3231:2: rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2
            {
            pushFollow(FOLLOW_30);
            rule__YAnnotTechnicalDesign__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__1__Impl"
    // InternalModel.g:3238:1: rule__YAnnotTechnicalDesign__Group__1__Impl : ( '@td' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3242:1: ( ( '@td' ) )
            // InternalModel.g:3243:1: ( '@td' )
            {
            // InternalModel.g:3243:1: ( '@td' )
            // InternalModel.g:3244:2: '@td'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getTdKeyword_1()); 
            }
            match(input,40,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getTdKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__1__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__2"
    // InternalModel.g:3253:1: rule__YAnnotTechnicalDesign__Group__2 : rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3 ;
    public final void rule__YAnnotTechnicalDesign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3257:1: ( rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3 )
            // InternalModel.g:3258:2: rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotTechnicalDesign__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__2"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__2__Impl"
    // InternalModel.g:3265:1: rule__YAnnotTechnicalDesign__Group__2__Impl : ( 'database' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3269:1: ( ( 'database' ) )
            // InternalModel.g:3270:1: ( 'database' )
            {
            // InternalModel.g:3270:1: ( 'database' )
            // InternalModel.g:3271:2: 'database'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseKeyword_2()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__2__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__3"
    // InternalModel.g:3280:1: rule__YAnnotTechnicalDesign__Group__3 : rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4 ;
    public final void rule__YAnnotTechnicalDesign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3284:1: ( rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4 )
            // InternalModel.g:3285:2: rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4
            {
            pushFollow(FOLLOW_31);
            rule__YAnnotTechnicalDesign__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__3"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__3__Impl"
    // InternalModel.g:3292:1: rule__YAnnotTechnicalDesign__Group__3__Impl : ( ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3296:1: ( ( ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 ) ) )
            // InternalModel.g:3297:1: ( ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 ) )
            {
            // InternalModel.g:3297:1: ( ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 ) )
            // InternalModel.g:3298:2: ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseAssignment_3()); 
            }
            // InternalModel.g:3299:2: ( rule__YAnnotTechnicalDesign__DatabaseAssignment_3 )
            // InternalModel.g:3299:3: rule__YAnnotTechnicalDesign__DatabaseAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__DatabaseAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__3__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__4"
    // InternalModel.g:3307:1: rule__YAnnotTechnicalDesign__Group__4 : rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5 ;
    public final void rule__YAnnotTechnicalDesign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3311:1: ( rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5 )
            // InternalModel.g:3312:2: rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5
            {
            pushFollow(FOLLOW_32);
            rule__YAnnotTechnicalDesign__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__4"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__4__Impl"
    // InternalModel.g:3319:1: rule__YAnnotTechnicalDesign__Group__4__Impl : ( '{' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3323:1: ( ( '{' ) )
            // InternalModel.g:3324:1: ( '{' )
            {
            // InternalModel.g:3324:1: ( '{' )
            // InternalModel.g:3325:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getLeftCurlyBracketKeyword_4()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getLeftCurlyBracketKeyword_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__4__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__5"
    // InternalModel.g:3334:1: rule__YAnnotTechnicalDesign__Group__5 : rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6 ;
    public final void rule__YAnnotTechnicalDesign__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3338:1: ( rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6 )
            // InternalModel.g:3339:2: rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6
            {
            pushFollow(FOLLOW_32);
            rule__YAnnotTechnicalDesign__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__5"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__5__Impl"
    // InternalModel.g:3346:1: rule__YAnnotTechnicalDesign__Group__5__Impl : ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* ) ;
    public final void rule__YAnnotTechnicalDesign__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3350:1: ( ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* ) )
            // InternalModel.g:3351:1: ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* )
            {
            // InternalModel.g:3351:1: ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* )
            // InternalModel.g:3352:2: ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesAssignment_5()); 
            }
            // InternalModel.g:3353:2: ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==42) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalModel.g:3353:3: rule__YAnnotTechnicalDesign__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_33);
            	    rule__YAnnotTechnicalDesign__FeaturesAssignment_5();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__5__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__6"
    // InternalModel.g:3361:1: rule__YAnnotTechnicalDesign__Group__6 : rule__YAnnotTechnicalDesign__Group__6__Impl ;
    public final void rule__YAnnotTechnicalDesign__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3365:1: ( rule__YAnnotTechnicalDesign__Group__6__Impl )
            // InternalModel.g:3366:2: rule__YAnnotTechnicalDesign__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__6"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group__6__Impl"
    // InternalModel.g:3372:1: rule__YAnnotTechnicalDesign__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3376:1: ( ( '}' ) )
            // InternalModel.g:3377:1: ( '}' )
            {
            // InternalModel.g:3377:1: ( '}' )
            // InternalModel.g:3378:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group__6__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__0"
    // InternalModel.g:3388:1: rule__YAnnotTable__Group__0 : rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1 ;
    public final void rule__YAnnotTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3392:1: ( rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1 )
            // InternalModel.g:3393:2: rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1
            {
            pushFollow(FOLLOW_34);
            rule__YAnnotTable__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__0"


    // $ANTLR start "rule__YAnnotTable__Group__0__Impl"
    // InternalModel.g:3400:1: rule__YAnnotTable__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3404:1: ( ( () ) )
            // InternalModel.g:3405:1: ( () )
            {
            // InternalModel.g:3405:1: ( () )
            // InternalModel.g:3406:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0()); 
            }
            // InternalModel.g:3407:2: ()
            // InternalModel.g:3407:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__0__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__1"
    // InternalModel.g:3415:1: rule__YAnnotTable__Group__1 : rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2 ;
    public final void rule__YAnnotTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3419:1: ( rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2 )
            // InternalModel.g:3420:2: rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotTable__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__1"


    // $ANTLR start "rule__YAnnotTable__Group__1__Impl"
    // InternalModel.g:3427:1: rule__YAnnotTable__Group__1__Impl : ( '@table' ) ;
    public final void rule__YAnnotTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3431:1: ( ( '@table' ) )
            // InternalModel.g:3432:1: ( '@table' )
            {
            // InternalModel.g:3432:1: ( '@table' )
            // InternalModel.g:3433:2: '@table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getTableKeyword_1()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getTableKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__1__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__2"
    // InternalModel.g:3442:1: rule__YAnnotTable__Group__2 : rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3 ;
    public final void rule__YAnnotTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3446:1: ( rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3 )
            // InternalModel.g:3447:2: rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__YAnnotTable__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__2"


    // $ANTLR start "rule__YAnnotTable__Group__2__Impl"
    // InternalModel.g:3454:1: rule__YAnnotTable__Group__2__Impl : ( ( rule__YAnnotTable__NameAssignment_2 ) ) ;
    public final void rule__YAnnotTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3458:1: ( ( ( rule__YAnnotTable__NameAssignment_2 ) ) )
            // InternalModel.g:3459:1: ( ( rule__YAnnotTable__NameAssignment_2 ) )
            {
            // InternalModel.g:3459:1: ( ( rule__YAnnotTable__NameAssignment_2 ) )
            // InternalModel.g:3460:2: ( rule__YAnnotTable__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:3461:2: ( rule__YAnnotTable__NameAssignment_2 )
            // InternalModel.g:3461:3: rule__YAnnotTable__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__2__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__3"
    // InternalModel.g:3469:1: rule__YAnnotTable__Group__3 : rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4 ;
    public final void rule__YAnnotTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3473:1: ( rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4 )
            // InternalModel.g:3474:2: rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotTable__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__3"


    // $ANTLR start "rule__YAnnotTable__Group__3__Impl"
    // InternalModel.g:3481:1: rule__YAnnotTable__Group__3__Impl : ( '->' ) ;
    public final void rule__YAnnotTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3485:1: ( ( '->' ) )
            // InternalModel.g:3486:1: ( '->' )
            {
            // InternalModel.g:3486:1: ( '->' )
            // InternalModel.g:3487:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getHyphenMinusGreaterThanSignKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__3__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__4"
    // InternalModel.g:3496:1: rule__YAnnotTable__Group__4 : rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5 ;
    public final void rule__YAnnotTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3500:1: ( rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5 )
            // InternalModel.g:3501:2: rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5
            {
            pushFollow(FOLLOW_31);
            rule__YAnnotTable__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__4"


    // $ANTLR start "rule__YAnnotTable__Group__4__Impl"
    // InternalModel.g:3508:1: rule__YAnnotTable__Group__4__Impl : ( ( rule__YAnnotTable__EntityrefAssignment_4 ) ) ;
    public final void rule__YAnnotTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3512:1: ( ( ( rule__YAnnotTable__EntityrefAssignment_4 ) ) )
            // InternalModel.g:3513:1: ( ( rule__YAnnotTable__EntityrefAssignment_4 ) )
            {
            // InternalModel.g:3513:1: ( ( rule__YAnnotTable__EntityrefAssignment_4 ) )
            // InternalModel.g:3514:2: ( rule__YAnnotTable__EntityrefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getEntityrefAssignment_4()); 
            }
            // InternalModel.g:3515:2: ( rule__YAnnotTable__EntityrefAssignment_4 )
            // InternalModel.g:3515:3: rule__YAnnotTable__EntityrefAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__EntityrefAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getEntityrefAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__4__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__5"
    // InternalModel.g:3523:1: rule__YAnnotTable__Group__5 : rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6 ;
    public final void rule__YAnnotTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3527:1: ( rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6 )
            // InternalModel.g:3528:2: rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6
            {
            pushFollow(FOLLOW_36);
            rule__YAnnotTable__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__5"


    // $ANTLR start "rule__YAnnotTable__Group__5__Impl"
    // InternalModel.g:3535:1: rule__YAnnotTable__Group__5__Impl : ( '{' ) ;
    public final void rule__YAnnotTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3539:1: ( ( '{' ) )
            // InternalModel.g:3540:1: ( '{' )
            {
            // InternalModel.g:3540:1: ( '{' )
            // InternalModel.g:3541:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getLeftCurlyBracketKeyword_5()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getLeftCurlyBracketKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__5__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__6"
    // InternalModel.g:3550:1: rule__YAnnotTable__Group__6 : rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7 ;
    public final void rule__YAnnotTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3554:1: ( rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7 )
            // InternalModel.g:3555:2: rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7
            {
            pushFollow(FOLLOW_36);
            rule__YAnnotTable__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__6"


    // $ANTLR start "rule__YAnnotTable__Group__6__Impl"
    // InternalModel.g:3562:1: rule__YAnnotTable__Group__6__Impl : ( ( rule__YAnnotTable__ColumnsAssignment_6 )* ) ;
    public final void rule__YAnnotTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3566:1: ( ( ( rule__YAnnotTable__ColumnsAssignment_6 )* ) )
            // InternalModel.g:3567:1: ( ( rule__YAnnotTable__ColumnsAssignment_6 )* )
            {
            // InternalModel.g:3567:1: ( ( rule__YAnnotTable__ColumnsAssignment_6 )* )
            // InternalModel.g:3568:2: ( rule__YAnnotTable__ColumnsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getColumnsAssignment_6()); 
            }
            // InternalModel.g:3569:2: ( rule__YAnnotTable__ColumnsAssignment_6 )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==44) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // InternalModel.g:3569:3: rule__YAnnotTable__ColumnsAssignment_6
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__YAnnotTable__ColumnsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getColumnsAssignment_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__6__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__7"
    // InternalModel.g:3577:1: rule__YAnnotTable__Group__7 : rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8 ;
    public final void rule__YAnnotTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3581:1: ( rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8 )
            // InternalModel.g:3582:2: rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8
            {
            pushFollow(FOLLOW_36);
            rule__YAnnotTable__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__8();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__7"


    // $ANTLR start "rule__YAnnotTable__Group__7__Impl"
    // InternalModel.g:3589:1: rule__YAnnotTable__Group__7__Impl : ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? ) ;
    public final void rule__YAnnotTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3593:1: ( ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? ) )
            // InternalModel.g:3594:1: ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? )
            {
            // InternalModel.g:3594:1: ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? )
            // InternalModel.g:3595:2: ( rule__YAnnotTable__PrimarykeyAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getPrimarykeyAssignment_7()); 
            }
            // InternalModel.g:3596:2: ( rule__YAnnotTable__PrimarykeyAssignment_7 )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==45) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // InternalModel.g:3596:3: rule__YAnnotTable__PrimarykeyAssignment_7
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotTable__PrimarykeyAssignment_7();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getPrimarykeyAssignment_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__7__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__8"
    // InternalModel.g:3604:1: rule__YAnnotTable__Group__8 : rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9 ;
    public final void rule__YAnnotTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3608:1: ( rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9 )
            // InternalModel.g:3609:2: rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9
            {
            pushFollow(FOLLOW_36);
            rule__YAnnotTable__Group__8__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__9();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__8"


    // $ANTLR start "rule__YAnnotTable__Group__8__Impl"
    // InternalModel.g:3616:1: rule__YAnnotTable__Group__8__Impl : ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* ) ;
    public final void rule__YAnnotTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3620:1: ( ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* ) )
            // InternalModel.g:3621:1: ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* )
            {
            // InternalModel.g:3621:1: ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* )
            // InternalModel.g:3622:2: ( rule__YAnnotTable__ForeignkeysAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getForeignkeysAssignment_8()); 
            }
            // InternalModel.g:3623:2: ( rule__YAnnotTable__ForeignkeysAssignment_8 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==46) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalModel.g:3623:3: rule__YAnnotTable__ForeignkeysAssignment_8
            	    {
            	    pushFollow(FOLLOW_38);
            	    rule__YAnnotTable__ForeignkeysAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getForeignkeysAssignment_8()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__8__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__9"
    // InternalModel.g:3631:1: rule__YAnnotTable__Group__9 : rule__YAnnotTable__Group__9__Impl ;
    public final void rule__YAnnotTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3635:1: ( rule__YAnnotTable__Group__9__Impl )
            // InternalModel.g:3636:2: rule__YAnnotTable__Group__9__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTable__Group__9__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__9"


    // $ANTLR start "rule__YAnnotTable__Group__9__Impl"
    // InternalModel.g:3642:1: rule__YAnnotTable__Group__9__Impl : ( '}' ) ;
    public final void rule__YAnnotTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3646:1: ( ( '}' ) )
            // InternalModel.g:3647:1: ( '}' )
            {
            // InternalModel.g:3647:1: ( '}' )
            // InternalModel.g:3648:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getRightCurlyBracketKeyword_9()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getRightCurlyBracketKeyword_9()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__Group__9__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__0"
    // InternalModel.g:3658:1: rule__YAnnotColumn__Group__0 : rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1 ;
    public final void rule__YAnnotColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3662:1: ( rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1 )
            // InternalModel.g:3663:2: rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__YAnnotColumn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__0"


    // $ANTLR start "rule__YAnnotColumn__Group__0__Impl"
    // InternalModel.g:3670:1: rule__YAnnotColumn__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3674:1: ( ( () ) )
            // InternalModel.g:3675:1: ( () )
            {
            // InternalModel.g:3675:1: ( () )
            // InternalModel.g:3676:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getYAnnotColumnAction_0()); 
            }
            // InternalModel.g:3677:2: ()
            // InternalModel.g:3677:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getYAnnotColumnAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__0__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__1"
    // InternalModel.g:3685:1: rule__YAnnotColumn__Group__1 : rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2 ;
    public final void rule__YAnnotColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3689:1: ( rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2 )
            // InternalModel.g:3690:2: rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotColumn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__1"


    // $ANTLR start "rule__YAnnotColumn__Group__1__Impl"
    // InternalModel.g:3697:1: rule__YAnnotColumn__Group__1__Impl : ( '->' ) ;
    public final void rule__YAnnotColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3701:1: ( ( '->' ) )
            // InternalModel.g:3702:1: ( '->' )
            {
            // InternalModel.g:3702:1: ( '->' )
            // InternalModel.g:3703:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__1__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__2"
    // InternalModel.g:3712:1: rule__YAnnotColumn__Group__2 : rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3 ;
    public final void rule__YAnnotColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3716:1: ( rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3 )
            // InternalModel.g:3717:2: rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3
            {
            pushFollow(FOLLOW_39);
            rule__YAnnotColumn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__2"


    // $ANTLR start "rule__YAnnotColumn__Group__2__Impl"
    // InternalModel.g:3724:1: rule__YAnnotColumn__Group__2__Impl : ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) ) ;
    public final void rule__YAnnotColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3728:1: ( ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) ) )
            // InternalModel.g:3729:1: ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) )
            {
            // InternalModel.g:3729:1: ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) )
            // InternalModel.g:3730:2: ( rule__YAnnotColumn__AttrrefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAttrrefAssignment_2()); 
            }
            // InternalModel.g:3731:2: ( rule__YAnnotColumn__AttrrefAssignment_2 )
            // InternalModel.g:3731:3: rule__YAnnotColumn__AttrrefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__AttrrefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getAttrrefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__2__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__3"
    // InternalModel.g:3739:1: rule__YAnnotColumn__Group__3 : rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4 ;
    public final void rule__YAnnotColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3743:1: ( rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4 )
            // InternalModel.g:3744:2: rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4
            {
            pushFollow(FOLLOW_40);
            rule__YAnnotColumn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__3"


    // $ANTLR start "rule__YAnnotColumn__Group__3__Impl"
    // InternalModel.g:3751:1: rule__YAnnotColumn__Group__3__Impl : ( 'as' ) ;
    public final void rule__YAnnotColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3755:1: ( ( 'as' ) )
            // InternalModel.g:3756:1: ( 'as' )
            {
            // InternalModel.g:3756:1: ( 'as' )
            // InternalModel.g:3757:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAsKeyword_3()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getAsKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__3__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__4"
    // InternalModel.g:3766:1: rule__YAnnotColumn__Group__4 : rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5 ;
    public final void rule__YAnnotColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3770:1: ( rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5 )
            // InternalModel.g:3771:2: rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotColumn__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__4"


    // $ANTLR start "rule__YAnnotColumn__Group__4__Impl"
    // InternalModel.g:3778:1: rule__YAnnotColumn__Group__4__Impl : ( ( rule__YAnnotColumn__TypeAssignment_4 ) ) ;
    public final void rule__YAnnotColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3782:1: ( ( ( rule__YAnnotColumn__TypeAssignment_4 ) ) )
            // InternalModel.g:3783:1: ( ( rule__YAnnotColumn__TypeAssignment_4 ) )
            {
            // InternalModel.g:3783:1: ( ( rule__YAnnotColumn__TypeAssignment_4 ) )
            // InternalModel.g:3784:2: ( rule__YAnnotColumn__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getTypeAssignment_4()); 
            }
            // InternalModel.g:3785:2: ( rule__YAnnotColumn__TypeAssignment_4 )
            // InternalModel.g:3785:3: rule__YAnnotColumn__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__TypeAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getTypeAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__4__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__5"
    // InternalModel.g:3793:1: rule__YAnnotColumn__Group__5 : rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6 ;
    public final void rule__YAnnotColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3797:1: ( rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6 )
            // InternalModel.g:3798:2: rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotColumn__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__5"


    // $ANTLR start "rule__YAnnotColumn__Group__5__Impl"
    // InternalModel.g:3805:1: rule__YAnnotColumn__Group__5__Impl : ( ( rule__YAnnotColumn__OptionalAssignment_5 )? ) ;
    public final void rule__YAnnotColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3809:1: ( ( ( rule__YAnnotColumn__OptionalAssignment_5 )? ) )
            // InternalModel.g:3810:1: ( ( rule__YAnnotColumn__OptionalAssignment_5 )? )
            {
            // InternalModel.g:3810:1: ( ( rule__YAnnotColumn__OptionalAssignment_5 )? )
            // InternalModel.g:3811:2: ( rule__YAnnotColumn__OptionalAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalAssignment_5()); 
            }
            // InternalModel.g:3812:2: ( rule__YAnnotColumn__OptionalAssignment_5 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==54) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModel.g:3812:3: rule__YAnnotColumn__OptionalAssignment_5
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotColumn__OptionalAssignment_5();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getOptionalAssignment_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__5__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__6"
    // InternalModel.g:3820:1: rule__YAnnotColumn__Group__6 : rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7 ;
    public final void rule__YAnnotColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3824:1: ( rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7 )
            // InternalModel.g:3825:2: rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7
            {
            pushFollow(FOLLOW_16);
            rule__YAnnotColumn__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__6"


    // $ANTLR start "rule__YAnnotColumn__Group__6__Impl"
    // InternalModel.g:3832:1: rule__YAnnotColumn__Group__6__Impl : ( ( rule__YAnnotColumn__Group_6__0 )? ) ;
    public final void rule__YAnnotColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3836:1: ( ( ( rule__YAnnotColumn__Group_6__0 )? ) )
            // InternalModel.g:3837:1: ( ( rule__YAnnotColumn__Group_6__0 )? )
            {
            // InternalModel.g:3837:1: ( ( rule__YAnnotColumn__Group_6__0 )? )
            // InternalModel.g:3838:2: ( rule__YAnnotColumn__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6()); 
            }
            // InternalModel.g:3839:2: ( rule__YAnnotColumn__Group_6__0 )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==29) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // InternalModel.g:3839:3: rule__YAnnotColumn__Group_6__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotColumn__Group_6__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getGroup_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__6__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group__7"
    // InternalModel.g:3847:1: rule__YAnnotColumn__Group__7 : rule__YAnnotColumn__Group__7__Impl ;
    public final void rule__YAnnotColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3851:1: ( rule__YAnnotColumn__Group__7__Impl )
            // InternalModel.g:3852:2: rule__YAnnotColumn__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__7"


    // $ANTLR start "rule__YAnnotColumn__Group__7__Impl"
    // InternalModel.g:3858:1: rule__YAnnotColumn__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3862:1: ( ( ( ';' )? ) )
            // InternalModel.g:3863:1: ( ( ';' )? )
            {
            // InternalModel.g:3863:1: ( ( ';' )? )
            // InternalModel.g:3864:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:3865:2: ( ';' )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==24) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModel.g:3865:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group__7__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6__0"
    // InternalModel.g:3874:1: rule__YAnnotColumn__Group_6__0 : rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1 ;
    public final void rule__YAnnotColumn__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3878:1: ( rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1 )
            // InternalModel.g:3879:2: rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotColumn__Group_6__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__0"


    // $ANTLR start "rule__YAnnotColumn__Group_6__0__Impl"
    // InternalModel.g:3886:1: rule__YAnnotColumn__Group_6__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotColumn__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3890:1: ( ( ( '(' ) ) )
            // InternalModel.g:3891:1: ( ( '(' ) )
            {
            // InternalModel.g:3891:1: ( ( '(' ) )
            // InternalModel.g:3892:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0()); 
            }
            // InternalModel.g:3893:2: ( '(' )
            // InternalModel.g:3893:3: '('
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__0__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6__1"
    // InternalModel.g:3901:1: rule__YAnnotColumn__Group_6__1 : rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2 ;
    public final void rule__YAnnotColumn__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3905:1: ( rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2 )
            // InternalModel.g:3906:2: rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotColumn__Group_6__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__1"


    // $ANTLR start "rule__YAnnotColumn__Group_6__1__Impl"
    // InternalModel.g:3913:1: rule__YAnnotColumn__Group_6__1__Impl : ( ( rule__YAnnotColumn__Group_6_1__0 )? ) ;
    public final void rule__YAnnotColumn__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3917:1: ( ( ( rule__YAnnotColumn__Group_6_1__0 )? ) )
            // InternalModel.g:3918:1: ( ( rule__YAnnotColumn__Group_6_1__0 )? )
            {
            // InternalModel.g:3918:1: ( ( rule__YAnnotColumn__Group_6_1__0 )? )
            // InternalModel.g:3919:2: ( rule__YAnnotColumn__Group_6_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6_1()); 
            }
            // InternalModel.g:3920:2: ( rule__YAnnotColumn__Group_6_1__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==RULE_ID) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModel.g:3920:3: rule__YAnnotColumn__Group_6_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotColumn__Group_6_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getGroup_6_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__1__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6__2"
    // InternalModel.g:3928:1: rule__YAnnotColumn__Group_6__2 : rule__YAnnotColumn__Group_6__2__Impl ;
    public final void rule__YAnnotColumn__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3932:1: ( rule__YAnnotColumn__Group_6__2__Impl )
            // InternalModel.g:3933:2: rule__YAnnotColumn__Group_6__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6__2__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__2"


    // $ANTLR start "rule__YAnnotColumn__Group_6__2__Impl"
    // InternalModel.g:3939:1: rule__YAnnotColumn__Group_6__2__Impl : ( ')' ) ;
    public final void rule__YAnnotColumn__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3943:1: ( ( ')' ) )
            // InternalModel.g:3944:1: ( ')' )
            {
            // InternalModel.g:3944:1: ( ')' )
            // InternalModel.g:3945:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getRightParenthesisKeyword_6_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getRightParenthesisKeyword_6_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6__2__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1__0"
    // InternalModel.g:3955:1: rule__YAnnotColumn__Group_6_1__0 : rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1 ;
    public final void rule__YAnnotColumn__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3959:1: ( rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1 )
            // InternalModel.g:3960:2: rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotColumn__Group_6_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1__0"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1__0__Impl"
    // InternalModel.g:3967:1: rule__YAnnotColumn__Group_6_1__0__Impl : ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) ) ;
    public final void rule__YAnnotColumn__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3971:1: ( ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) ) )
            // InternalModel.g:3972:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) )
            {
            // InternalModel.g:3972:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) )
            // InternalModel.g:3973:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_0()); 
            }
            // InternalModel.g:3974:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 )
            // InternalModel.g:3974:3: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1__0__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1__1"
    // InternalModel.g:3982:1: rule__YAnnotColumn__Group_6_1__1 : rule__YAnnotColumn__Group_6_1__1__Impl ;
    public final void rule__YAnnotColumn__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3986:1: ( rule__YAnnotColumn__Group_6_1__1__Impl )
            // InternalModel.g:3987:2: rule__YAnnotColumn__Group_6_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1__1"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1__1__Impl"
    // InternalModel.g:3993:1: rule__YAnnotColumn__Group_6_1__1__Impl : ( ( rule__YAnnotColumn__Group_6_1_1__0 )* ) ;
    public final void rule__YAnnotColumn__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3997:1: ( ( ( rule__YAnnotColumn__Group_6_1_1__0 )* ) )
            // InternalModel.g:3998:1: ( ( rule__YAnnotColumn__Group_6_1_1__0 )* )
            {
            // InternalModel.g:3998:1: ( ( rule__YAnnotColumn__Group_6_1_1__0 )* )
            // InternalModel.g:3999:2: ( rule__YAnnotColumn__Group_6_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6_1_1()); 
            }
            // InternalModel.g:4000:2: ( rule__YAnnotColumn__Group_6_1_1__0 )*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==31) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // InternalModel.g:4000:3: rule__YAnnotColumn__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotColumn__Group_6_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getGroup_6_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1__1__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1_1__0"
    // InternalModel.g:4009:1: rule__YAnnotColumn__Group_6_1_1__0 : rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1 ;
    public final void rule__YAnnotColumn__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4013:1: ( rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1 )
            // InternalModel.g:4014:2: rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotColumn__Group_6_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6_1_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1_1__0"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1_1__0__Impl"
    // InternalModel.g:4021:1: rule__YAnnotColumn__Group_6_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotColumn__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4025:1: ( ( ',' ) )
            // InternalModel.g:4026:1: ( ',' )
            {
            // InternalModel.g:4026:1: ( ',' )
            // InternalModel.g:4027:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getCommaKeyword_6_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1_1__0__Impl"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1_1__1"
    // InternalModel.g:4036:1: rule__YAnnotColumn__Group_6_1_1__1 : rule__YAnnotColumn__Group_6_1_1__1__Impl ;
    public final void rule__YAnnotColumn__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4040:1: ( rule__YAnnotColumn__Group_6_1_1__1__Impl )
            // InternalModel.g:4041:2: rule__YAnnotColumn__Group_6_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__Group_6_1_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1_1__1"


    // $ANTLR start "rule__YAnnotColumn__Group_6_1_1__1__Impl"
    // InternalModel.g:4047:1: rule__YAnnotColumn__Group_6_1_1__1__Impl : ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) ) ;
    public final void rule__YAnnotColumn__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4051:1: ( ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) ) )
            // InternalModel.g:4052:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) )
            {
            // InternalModel.g:4052:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) )
            // InternalModel.g:4053:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_1_1()); 
            }
            // InternalModel.g:4054:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 )
            // InternalModel.g:4054:3: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__Group_6_1_1__1__Impl"


    // $ANTLR start "rule__YAnnotColumnLike__Group__0"
    // InternalModel.g:4063:1: rule__YAnnotColumnLike__Group__0 : rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1 ;
    public final void rule__YAnnotColumnLike__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4067:1: ( rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1 )
            // InternalModel.g:4068:2: rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1
            {
            pushFollow(FOLLOW_35);
            rule__YAnnotColumnLike__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__0"


    // $ANTLR start "rule__YAnnotColumnLike__Group__0__Impl"
    // InternalModel.g:4075:1: rule__YAnnotColumnLike__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotColumnLike__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4079:1: ( ( () ) )
            // InternalModel.g:4080:1: ( () )
            {
            // InternalModel.g:4080:1: ( () )
            // InternalModel.g:4081:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getYAnnotColumnLikeAction_0()); 
            }
            // InternalModel.g:4082:2: ()
            // InternalModel.g:4082:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getYAnnotColumnLikeAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__0__Impl"


    // $ANTLR start "rule__YAnnotColumnLike__Group__1"
    // InternalModel.g:4090:1: rule__YAnnotColumnLike__Group__1 : rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2 ;
    public final void rule__YAnnotColumnLike__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4094:1: ( rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2 )
            // InternalModel.g:4095:2: rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotColumnLike__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__1"


    // $ANTLR start "rule__YAnnotColumnLike__Group__1__Impl"
    // InternalModel.g:4102:1: rule__YAnnotColumnLike__Group__1__Impl : ( '->' ) ;
    public final void rule__YAnnotColumnLike__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4106:1: ( ( '->' ) )
            // InternalModel.g:4107:1: ( '->' )
            {
            // InternalModel.g:4107:1: ( '->' )
            // InternalModel.g:4108:2: '->'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }
            match(input,34,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getHyphenMinusGreaterThanSignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__1__Impl"


    // $ANTLR start "rule__YAnnotColumnLike__Group__2"
    // InternalModel.g:4117:1: rule__YAnnotColumnLike__Group__2 : rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3 ;
    public final void rule__YAnnotColumnLike__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4121:1: ( rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3 )
            // InternalModel.g:4122:2: rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__YAnnotColumnLike__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__2"


    // $ANTLR start "rule__YAnnotColumnLike__Group__2__Impl"
    // InternalModel.g:4129:1: rule__YAnnotColumnLike__Group__2__Impl : ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) ) ;
    public final void rule__YAnnotColumnLike__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4133:1: ( ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) ) )
            // InternalModel.g:4134:1: ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) )
            {
            // InternalModel.g:4134:1: ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) )
            // InternalModel.g:4135:2: ( rule__YAnnotColumnLike__ColumnrefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefAssignment_2()); 
            }
            // InternalModel.g:4136:2: ( rule__YAnnotColumnLike__ColumnrefAssignment_2 )
            // InternalModel.g:4136:3: rule__YAnnotColumnLike__ColumnrefAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__ColumnrefAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__2__Impl"


    // $ANTLR start "rule__YAnnotColumnLike__Group__3"
    // InternalModel.g:4144:1: rule__YAnnotColumnLike__Group__3 : rule__YAnnotColumnLike__Group__3__Impl ;
    public final void rule__YAnnotColumnLike__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4148:1: ( rule__YAnnotColumnLike__Group__3__Impl )
            // InternalModel.g:4149:2: rule__YAnnotColumnLike__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumnLike__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__3"


    // $ANTLR start "rule__YAnnotColumnLike__Group__3__Impl"
    // InternalModel.g:4155:1: rule__YAnnotColumnLike__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotColumnLike__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4159:1: ( ( ( ';' )? ) )
            // InternalModel.g:4160:1: ( ( ';' )? )
            {
            // InternalModel.g:4160:1: ( ( ';' )? )
            // InternalModel.g:4161:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getSemicolonKeyword_3()); 
            }
            // InternalModel.g:4162:2: ( ';' )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==24) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModel.g:4162:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__Group__3__Impl"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__0"
    // InternalModel.g:4171:1: rule__YAnnotAbstractColumn__Group__0 : rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1 ;
    public final void rule__YAnnotAbstractColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4175:1: ( rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1 )
            // InternalModel.g:4176:2: rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1
            {
            pushFollow(FOLLOW_41);
            rule__YAnnotAbstractColumn__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__0"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__0__Impl"
    // InternalModel.g:4183:1: rule__YAnnotAbstractColumn__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotAbstractColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4187:1: ( ( () ) )
            // InternalModel.g:4188:1: ( () )
            {
            // InternalModel.g:4188:1: ( () )
            // InternalModel.g:4189:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0()); 
            }
            // InternalModel.g:4190:2: ()
            // InternalModel.g:4190:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__0__Impl"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__1"
    // InternalModel.g:4198:1: rule__YAnnotAbstractColumn__Group__1 : rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2 ;
    public final void rule__YAnnotAbstractColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4202:1: ( rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2 )
            // InternalModel.g:4203:2: rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotAbstractColumn__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__1"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__1__Impl"
    // InternalModel.g:4210:1: rule__YAnnotAbstractColumn__Group__1__Impl : ( '@column' ) ;
    public final void rule__YAnnotAbstractColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4214:1: ( ( '@column' ) )
            // InternalModel.g:4215:1: ( '@column' )
            {
            // InternalModel.g:4215:1: ( '@column' )
            // InternalModel.g:4216:2: '@column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__1__Impl"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__2"
    // InternalModel.g:4225:1: rule__YAnnotAbstractColumn__Group__2 : rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3 ;
    public final void rule__YAnnotAbstractColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4229:1: ( rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3 )
            // InternalModel.g:4230:2: rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3
            {
            pushFollow(FOLLOW_35);
            rule__YAnnotAbstractColumn__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__2"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__2__Impl"
    // InternalModel.g:4237:1: rule__YAnnotAbstractColumn__Group__2__Impl : ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) ) ;
    public final void rule__YAnnotAbstractColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4241:1: ( ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) ) )
            // InternalModel.g:4242:1: ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) )
            {
            // InternalModel.g:4242:1: ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) )
            // InternalModel.g:4243:2: ( rule__YAnnotAbstractColumn__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:4244:2: ( rule__YAnnotAbstractColumn__NameAssignment_2 )
            // InternalModel.g:4244:3: rule__YAnnotAbstractColumn__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__2__Impl"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__3"
    // InternalModel.g:4252:1: rule__YAnnotAbstractColumn__Group__3 : rule__YAnnotAbstractColumn__Group__3__Impl ;
    public final void rule__YAnnotAbstractColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4256:1: ( rule__YAnnotAbstractColumn__Group__3__Impl )
            // InternalModel.g:4257:2: rule__YAnnotAbstractColumn__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__3"


    // $ANTLR start "rule__YAnnotAbstractColumn__Group__3__Impl"
    // InternalModel.g:4263:1: rule__YAnnotAbstractColumn__Group__3__Impl : ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) ) ;
    public final void rule__YAnnotAbstractColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4267:1: ( ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) ) )
            // InternalModel.g:4268:1: ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) )
            {
            // InternalModel.g:4268:1: ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) )
            // InternalModel.g:4269:2: ( rule__YAnnotAbstractColumn__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAssignment_3()); 
            }
            // InternalModel.g:4270:2: ( rule__YAnnotAbstractColumn__TypeAssignment_3 )
            // InternalModel.g:4270:3: rule__YAnnotAbstractColumn__TypeAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__TypeAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__Group__3__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__0"
    // InternalModel.g:4279:1: rule__YAnnotPrimaryKey__Group__0 : rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1 ;
    public final void rule__YAnnotPrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4283:1: ( rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1 )
            // InternalModel.g:4284:2: rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1
            {
            pushFollow(FOLLOW_42);
            rule__YAnnotPrimaryKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__0"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__0__Impl"
    // InternalModel.g:4291:1: rule__YAnnotPrimaryKey__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotPrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4295:1: ( ( () ) )
            // InternalModel.g:4296:1: ( () )
            {
            // InternalModel.g:4296:1: ( () )
            // InternalModel.g:4297:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0()); 
            }
            // InternalModel.g:4298:2: ()
            // InternalModel.g:4298:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__0__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__1"
    // InternalModel.g:4306:1: rule__YAnnotPrimaryKey__Group__1 : rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2 ;
    public final void rule__YAnnotPrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4310:1: ( rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2 )
            // InternalModel.g:4311:2: rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2
            {
            pushFollow(FOLLOW_21);
            rule__YAnnotPrimaryKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__1"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__1__Impl"
    // InternalModel.g:4318:1: rule__YAnnotPrimaryKey__Group__1__Impl : ( '@primary' ) ;
    public final void rule__YAnnotPrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4322:1: ( ( '@primary' ) )
            // InternalModel.g:4323:1: ( '@primary' )
            {
            // InternalModel.g:4323:1: ( '@primary' )
            // InternalModel.g:4324:2: '@primary'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__1__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__2"
    // InternalModel.g:4333:1: rule__YAnnotPrimaryKey__Group__2 : rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3 ;
    public final void rule__YAnnotPrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4337:1: ( rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3 )
            // InternalModel.g:4338:2: rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3
            {
            pushFollow(FOLLOW_43);
            rule__YAnnotPrimaryKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__2"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__2__Impl"
    // InternalModel.g:4345:1: rule__YAnnotPrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__YAnnotPrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4349:1: ( ( '(' ) )
            // InternalModel.g:4350:1: ( '(' )
            {
            // InternalModel.g:4350:1: ( '(' )
            // InternalModel.g:4351:2: '('
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            }
            match(input,29,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getLeftParenthesisKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__2__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__3"
    // InternalModel.g:4360:1: rule__YAnnotPrimaryKey__Group__3 : rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4 ;
    public final void rule__YAnnotPrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4364:1: ( rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4 )
            // InternalModel.g:4365:2: rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4
            {
            pushFollow(FOLLOW_43);
            rule__YAnnotPrimaryKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__3"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__3__Impl"
    // InternalModel.g:4372:1: rule__YAnnotPrimaryKey__Group__3__Impl : ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* ) ;
    public final void rule__YAnnotPrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4376:1: ( ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* ) )
            // InternalModel.g:4377:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* )
            {
            // InternalModel.g:4377:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* )
            // InternalModel.g:4378:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_3()); 
            }
            // InternalModel.g:4379:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==RULE_ID) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalModel.g:4379:3: rule__YAnnotPrimaryKey__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_44);
            	    rule__YAnnotPrimaryKey__ColumnsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__3__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__4"
    // InternalModel.g:4387:1: rule__YAnnotPrimaryKey__Group__4 : rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5 ;
    public final void rule__YAnnotPrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4391:1: ( rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5 )
            // InternalModel.g:4392:2: rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5
            {
            pushFollow(FOLLOW_43);
            rule__YAnnotPrimaryKey__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__4"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__4__Impl"
    // InternalModel.g:4399:1: rule__YAnnotPrimaryKey__Group__4__Impl : ( ( rule__YAnnotPrimaryKey__Group_4__0 )* ) ;
    public final void rule__YAnnotPrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4403:1: ( ( ( rule__YAnnotPrimaryKey__Group_4__0 )* ) )
            // InternalModel.g:4404:1: ( ( rule__YAnnotPrimaryKey__Group_4__0 )* )
            {
            // InternalModel.g:4404:1: ( ( rule__YAnnotPrimaryKey__Group_4__0 )* )
            // InternalModel.g:4405:2: ( rule__YAnnotPrimaryKey__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup_4()); 
            }
            // InternalModel.g:4406:2: ( rule__YAnnotPrimaryKey__Group_4__0 )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==31) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // InternalModel.g:4406:3: rule__YAnnotPrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotPrimaryKey__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__4__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__5"
    // InternalModel.g:4414:1: rule__YAnnotPrimaryKey__Group__5 : rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6 ;
    public final void rule__YAnnotPrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4418:1: ( rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6 )
            // InternalModel.g:4419:2: rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6
            {
            pushFollow(FOLLOW_7);
            rule__YAnnotPrimaryKey__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__5"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__5__Impl"
    // InternalModel.g:4426:1: rule__YAnnotPrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__YAnnotPrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4430:1: ( ( ')' ) )
            // InternalModel.g:4431:1: ( ')' )
            {
            // InternalModel.g:4431:1: ( ')' )
            // InternalModel.g:4432:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getRightParenthesisKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__5__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__6"
    // InternalModel.g:4441:1: rule__YAnnotPrimaryKey__Group__6 : rule__YAnnotPrimaryKey__Group__6__Impl ;
    public final void rule__YAnnotPrimaryKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4445:1: ( rule__YAnnotPrimaryKey__Group__6__Impl )
            // InternalModel.g:4446:2: rule__YAnnotPrimaryKey__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__6"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group__6__Impl"
    // InternalModel.g:4452:1: rule__YAnnotPrimaryKey__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotPrimaryKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4456:1: ( ( ( ';' )? ) )
            // InternalModel.g:4457:1: ( ( ';' )? )
            {
            // InternalModel.g:4457:1: ( ( ';' )? )
            // InternalModel.g:4458:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getSemicolonKeyword_6()); 
            }
            // InternalModel.g:4459:2: ( ';' )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==24) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // InternalModel.g:4459:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getSemicolonKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group__6__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group_4__0"
    // InternalModel.g:4468:1: rule__YAnnotPrimaryKey__Group_4__0 : rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1 ;
    public final void rule__YAnnotPrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4472:1: ( rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1 )
            // InternalModel.g:4473:2: rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotPrimaryKey__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group_4__0"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group_4__0__Impl"
    // InternalModel.g:4480:1: rule__YAnnotPrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__YAnnotPrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4484:1: ( ( ',' ) )
            // InternalModel.g:4485:1: ( ',' )
            {
            // InternalModel.g:4485:1: ( ',' )
            // InternalModel.g:4486:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getCommaKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group_4__0__Impl"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group_4__1"
    // InternalModel.g:4495:1: rule__YAnnotPrimaryKey__Group_4__1 : rule__YAnnotPrimaryKey__Group_4__1__Impl ;
    public final void rule__YAnnotPrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4499:1: ( rule__YAnnotPrimaryKey__Group_4__1__Impl )
            // InternalModel.g:4500:2: rule__YAnnotPrimaryKey__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group_4__1"


    // $ANTLR start "rule__YAnnotPrimaryKey__Group_4__1__Impl"
    // InternalModel.g:4506:1: rule__YAnnotPrimaryKey__Group_4__1__Impl : ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__YAnnotPrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4510:1: ( ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) ) )
            // InternalModel.g:4511:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) )
            {
            // InternalModel.g:4511:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) )
            // InternalModel.g:4512:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_4_1()); 
            }
            // InternalModel.g:4513:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 )
            // InternalModel.g:4513:3: rule__YAnnotPrimaryKey__ColumnsAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotPrimaryKey__ColumnsAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__Group_4__1__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__0"
    // InternalModel.g:4522:1: rule__YAnnotForeignKey__Group__0 : rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1 ;
    public final void rule__YAnnotForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4526:1: ( rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1 )
            // InternalModel.g:4527:2: rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1
            {
            pushFollow(FOLLOW_45);
            rule__YAnnotForeignKey__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__0"


    // $ANTLR start "rule__YAnnotForeignKey__Group__0__Impl"
    // InternalModel.g:4534:1: rule__YAnnotForeignKey__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4538:1: ( ( () ) )
            // InternalModel.g:4539:1: ( () )
            {
            // InternalModel.g:4539:1: ( () )
            // InternalModel.g:4540:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0()); 
            }
            // InternalModel.g:4541:2: ()
            // InternalModel.g:4541:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__0__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__1"
    // InternalModel.g:4549:1: rule__YAnnotForeignKey__Group__1 : rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2 ;
    public final void rule__YAnnotForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4553:1: ( rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2 )
            // InternalModel.g:4554:2: rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotForeignKey__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__1"


    // $ANTLR start "rule__YAnnotForeignKey__Group__1__Impl"
    // InternalModel.g:4561:1: rule__YAnnotForeignKey__Group__1__Impl : ( '@foreign' ) ;
    public final void rule__YAnnotForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4565:1: ( ( '@foreign' ) )
            // InternalModel.g:4566:1: ( '@foreign' )
            {
            // InternalModel.g:4566:1: ( '@foreign' )
            // InternalModel.g:4567:2: '@foreign'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__1__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__2"
    // InternalModel.g:4576:1: rule__YAnnotForeignKey__Group__2 : rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3 ;
    public final void rule__YAnnotForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4580:1: ( rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3 )
            // InternalModel.g:4581:2: rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3
            {
            pushFollow(FOLLOW_31);
            rule__YAnnotForeignKey__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__2"


    // $ANTLR start "rule__YAnnotForeignKey__Group__2__Impl"
    // InternalModel.g:4588:1: rule__YAnnotForeignKey__Group__2__Impl : ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) ) ;
    public final void rule__YAnnotForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4592:1: ( ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) ) )
            // InternalModel.g:4593:1: ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) )
            {
            // InternalModel.g:4593:1: ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) )
            // InternalModel.g:4594:2: ( rule__YAnnotForeignKey__RelationshipAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipAssignment_2()); 
            }
            // InternalModel.g:4595:2: ( rule__YAnnotForeignKey__RelationshipAssignment_2 )
            // InternalModel.g:4595:3: rule__YAnnotForeignKey__RelationshipAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__RelationshipAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__2__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__3"
    // InternalModel.g:4603:1: rule__YAnnotForeignKey__Group__3 : rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4 ;
    public final void rule__YAnnotForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4607:1: ( rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4 )
            // InternalModel.g:4608:2: rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4
            {
            pushFollow(FOLLOW_41);
            rule__YAnnotForeignKey__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__3"


    // $ANTLR start "rule__YAnnotForeignKey__Group__3__Impl"
    // InternalModel.g:4615:1: rule__YAnnotForeignKey__Group__3__Impl : ( '{' ) ;
    public final void rule__YAnnotForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4619:1: ( ( '{' ) )
            // InternalModel.g:4620:1: ( '{' )
            {
            // InternalModel.g:4620:1: ( '{' )
            // InternalModel.g:4621:2: '{'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getLeftCurlyBracketKeyword_3()); 
            }
            match(input,27,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getLeftCurlyBracketKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__3__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__4"
    // InternalModel.g:4630:1: rule__YAnnotForeignKey__Group__4 : rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5 ;
    public final void rule__YAnnotForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4634:1: ( rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5 )
            // InternalModel.g:4635:2: rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5
            {
            pushFollow(FOLLOW_46);
            rule__YAnnotForeignKey__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__4"


    // $ANTLR start "rule__YAnnotForeignKey__Group__4__Impl"
    // InternalModel.g:4642:1: rule__YAnnotForeignKey__Group__4__Impl : ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) ) ;
    public final void rule__YAnnotForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4646:1: ( ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) ) )
            // InternalModel.g:4647:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) )
            {
            // InternalModel.g:4647:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) )
            // InternalModel.g:4648:2: ( rule__YAnnotForeignKey__ColumnsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_4()); 
            }
            // InternalModel.g:4649:2: ( rule__YAnnotForeignKey__ColumnsAssignment_4 )
            // InternalModel.g:4649:3: rule__YAnnotForeignKey__ColumnsAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__ColumnsAssignment_4();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__4__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__5"
    // InternalModel.g:4657:1: rule__YAnnotForeignKey__Group__5 : rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6 ;
    public final void rule__YAnnotForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4661:1: ( rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6 )
            // InternalModel.g:4662:2: rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6
            {
            pushFollow(FOLLOW_46);
            rule__YAnnotForeignKey__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__6();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__5"


    // $ANTLR start "rule__YAnnotForeignKey__Group__5__Impl"
    // InternalModel.g:4669:1: rule__YAnnotForeignKey__Group__5__Impl : ( ( rule__YAnnotForeignKey__Group_5__0 )* ) ;
    public final void rule__YAnnotForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4673:1: ( ( ( rule__YAnnotForeignKey__Group_5__0 )* ) )
            // InternalModel.g:4674:1: ( ( rule__YAnnotForeignKey__Group_5__0 )* )
            {
            // InternalModel.g:4674:1: ( ( rule__YAnnotForeignKey__Group_5__0 )* )
            // InternalModel.g:4675:2: ( rule__YAnnotForeignKey__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getGroup_5()); 
            }
            // InternalModel.g:4676:2: ( rule__YAnnotForeignKey__Group_5__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalModel.g:4676:3: rule__YAnnotForeignKey__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotForeignKey__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getGroup_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__5__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__6"
    // InternalModel.g:4684:1: rule__YAnnotForeignKey__Group__6 : rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7 ;
    public final void rule__YAnnotForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4688:1: ( rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7 )
            // InternalModel.g:4689:2: rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7
            {
            pushFollow(FOLLOW_7);
            rule__YAnnotForeignKey__Group__6__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__7();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__6"


    // $ANTLR start "rule__YAnnotForeignKey__Group__6__Impl"
    // InternalModel.g:4696:1: rule__YAnnotForeignKey__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4700:1: ( ( '}' ) )
            // InternalModel.g:4701:1: ( '}' )
            {
            // InternalModel.g:4701:1: ( '}' )
            // InternalModel.g:4702:2: '}'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6()); 
            }
            match(input,28,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getRightCurlyBracketKeyword_6()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__6__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group__7"
    // InternalModel.g:4711:1: rule__YAnnotForeignKey__Group__7 : rule__YAnnotForeignKey__Group__7__Impl ;
    public final void rule__YAnnotForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4715:1: ( rule__YAnnotForeignKey__Group__7__Impl )
            // InternalModel.g:4716:2: rule__YAnnotForeignKey__Group__7__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group__7__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__7"


    // $ANTLR start "rule__YAnnotForeignKey__Group__7__Impl"
    // InternalModel.g:4722:1: rule__YAnnotForeignKey__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4726:1: ( ( ( ';' )? ) )
            // InternalModel.g:4727:1: ( ( ';' )? )
            {
            // InternalModel.g:4727:1: ( ( ';' )? )
            // InternalModel.g:4728:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:4729:2: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModel.g:4729:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getSemicolonKeyword_7()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group__7__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group_5__0"
    // InternalModel.g:4738:1: rule__YAnnotForeignKey__Group_5__0 : rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1 ;
    public final void rule__YAnnotForeignKey__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4742:1: ( rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1 )
            // InternalModel.g:4743:2: rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1
            {
            pushFollow(FOLLOW_41);
            rule__YAnnotForeignKey__Group_5__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group_5__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group_5__0"


    // $ANTLR start "rule__YAnnotForeignKey__Group_5__0__Impl"
    // InternalModel.g:4750:1: rule__YAnnotForeignKey__Group_5__0__Impl : ( ',' ) ;
    public final void rule__YAnnotForeignKey__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4754:1: ( ( ',' ) )
            // InternalModel.g:4755:1: ( ',' )
            {
            // InternalModel.g:4755:1: ( ',' )
            // InternalModel.g:4756:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getCommaKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group_5__0__Impl"


    // $ANTLR start "rule__YAnnotForeignKey__Group_5__1"
    // InternalModel.g:4765:1: rule__YAnnotForeignKey__Group_5__1 : rule__YAnnotForeignKey__Group_5__1__Impl ;
    public final void rule__YAnnotForeignKey__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4769:1: ( rule__YAnnotForeignKey__Group_5__1__Impl )
            // InternalModel.g:4770:2: rule__YAnnotForeignKey__Group_5__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__Group_5__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group_5__1"


    // $ANTLR start "rule__YAnnotForeignKey__Group_5__1__Impl"
    // InternalModel.g:4776:1: rule__YAnnotForeignKey__Group_5__1__Impl : ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) ) ;
    public final void rule__YAnnotForeignKey__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4780:1: ( ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) ) )
            // InternalModel.g:4781:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) )
            {
            // InternalModel.g:4781:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) )
            // InternalModel.g:4782:2: ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_5_1()); 
            }
            // InternalModel.g:4783:2: ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 )
            // InternalModel.g:4783:3: rule__YAnnotForeignKey__ColumnsAssignment_5_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotForeignKey__ColumnsAssignment_5_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_5_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__Group_5__1__Impl"


    // $ANTLR start "rule__YAnnotJava__Group__0"
    // InternalModel.g:4792:1: rule__YAnnotJava__Group__0 : rule__YAnnotJava__Group__0__Impl rule__YAnnotJava__Group__1 ;
    public final void rule__YAnnotJava__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4796:1: ( rule__YAnnotJava__Group__0__Impl rule__YAnnotJava__Group__1 )
            // InternalModel.g:4797:2: rule__YAnnotJava__Group__0__Impl rule__YAnnotJava__Group__1
            {
            pushFollow(FOLLOW_47);
            rule__YAnnotJava__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__0"


    // $ANTLR start "rule__YAnnotJava__Group__0__Impl"
    // InternalModel.g:4804:1: rule__YAnnotJava__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotJava__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4808:1: ( ( () ) )
            // InternalModel.g:4809:1: ( () )
            {
            // InternalModel.g:4809:1: ( () )
            // InternalModel.g:4810:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getYAnnotJavaAction_0()); 
            }
            // InternalModel.g:4811:2: ()
            // InternalModel.g:4811:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getYAnnotJavaAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__0__Impl"


    // $ANTLR start "rule__YAnnotJava__Group__1"
    // InternalModel.g:4819:1: rule__YAnnotJava__Group__1 : rule__YAnnotJava__Group__1__Impl rule__YAnnotJava__Group__2 ;
    public final void rule__YAnnotJava__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4823:1: ( rule__YAnnotJava__Group__1__Impl rule__YAnnotJava__Group__2 )
            // InternalModel.g:4824:2: rule__YAnnotJava__Group__1__Impl rule__YAnnotJava__Group__2
            {
            pushFollow(FOLLOW_48);
            rule__YAnnotJava__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__1"


    // $ANTLR start "rule__YAnnotJava__Group__1__Impl"
    // InternalModel.g:4831:1: rule__YAnnotJava__Group__1__Impl : ( '@java' ) ;
    public final void rule__YAnnotJava__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4835:1: ( ( '@java' ) )
            // InternalModel.g:4836:1: ( '@java' )
            {
            // InternalModel.g:4836:1: ( '@java' )
            // InternalModel.g:4837:2: '@java'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getJavaKeyword_1()); 
            }
            match(input,47,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getJavaKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__1__Impl"


    // $ANTLR start "rule__YAnnotJava__Group__2"
    // InternalModel.g:4846:1: rule__YAnnotJava__Group__2 : rule__YAnnotJava__Group__2__Impl rule__YAnnotJava__Group__3 ;
    public final void rule__YAnnotJava__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4850:1: ( rule__YAnnotJava__Group__2__Impl rule__YAnnotJava__Group__3 )
            // InternalModel.g:4851:2: rule__YAnnotJava__Group__2__Impl rule__YAnnotJava__Group__3
            {
            pushFollow(FOLLOW_48);
            rule__YAnnotJava__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__2"


    // $ANTLR start "rule__YAnnotJava__Group__2__Impl"
    // InternalModel.g:4858:1: rule__YAnnotJava__Group__2__Impl : ( ( rule__YAnnotJava__Group_2__0 )? ) ;
    public final void rule__YAnnotJava__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4862:1: ( ( ( rule__YAnnotJava__Group_2__0 )? ) )
            // InternalModel.g:4863:1: ( ( rule__YAnnotJava__Group_2__0 )? )
            {
            // InternalModel.g:4863:1: ( ( rule__YAnnotJava__Group_2__0 )? )
            // InternalModel.g:4864:2: ( rule__YAnnotJava__Group_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getGroup_2()); 
            }
            // InternalModel.g:4865:2: ( rule__YAnnotJava__Group_2__0 )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==48) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // InternalModel.g:4865:3: rule__YAnnotJava__Group_2__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotJava__Group_2__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getGroup_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__2__Impl"


    // $ANTLR start "rule__YAnnotJava__Group__3"
    // InternalModel.g:4873:1: rule__YAnnotJava__Group__3 : rule__YAnnotJava__Group__3__Impl ;
    public final void rule__YAnnotJava__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4877:1: ( rule__YAnnotJava__Group__3__Impl )
            // InternalModel.g:4878:2: rule__YAnnotJava__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__3"


    // $ANTLR start "rule__YAnnotJava__Group__3__Impl"
    // InternalModel.g:4884:1: rule__YAnnotJava__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotJava__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4888:1: ( ( ( ';' )? ) )
            // InternalModel.g:4889:1: ( ( ';' )? )
            {
            // InternalModel.g:4889:1: ( ( ';' )? )
            // InternalModel.g:4890:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getSemicolonKeyword_3()); 
            }
            // InternalModel.g:4891:2: ( ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModel.g:4891:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group__3__Impl"


    // $ANTLR start "rule__YAnnotJava__Group_2__0"
    // InternalModel.g:4900:1: rule__YAnnotJava__Group_2__0 : rule__YAnnotJava__Group_2__0__Impl rule__YAnnotJava__Group_2__1 ;
    public final void rule__YAnnotJava__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4904:1: ( rule__YAnnotJava__Group_2__0__Impl rule__YAnnotJava__Group_2__1 )
            // InternalModel.g:4905:2: rule__YAnnotJava__Group_2__0__Impl rule__YAnnotJava__Group_2__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotJava__Group_2__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group_2__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group_2__0"


    // $ANTLR start "rule__YAnnotJava__Group_2__0__Impl"
    // InternalModel.g:4912:1: rule__YAnnotJava__Group_2__0__Impl : ( 'uses' ) ;
    public final void rule__YAnnotJava__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4916:1: ( ( 'uses' ) )
            // InternalModel.g:4917:1: ( 'uses' )
            {
            // InternalModel.g:4917:1: ( 'uses' )
            // InternalModel.g:4918:2: 'uses'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getUsesKeyword_2_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getUsesKeyword_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group_2__0__Impl"


    // $ANTLR start "rule__YAnnotJava__Group_2__1"
    // InternalModel.g:4927:1: rule__YAnnotJava__Group_2__1 : rule__YAnnotJava__Group_2__1__Impl ;
    public final void rule__YAnnotJava__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4931:1: ( rule__YAnnotJava__Group_2__1__Impl )
            // InternalModel.g:4932:2: rule__YAnnotJava__Group_2__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__Group_2__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group_2__1"


    // $ANTLR start "rule__YAnnotJava__Group_2__1__Impl"
    // InternalModel.g:4938:1: rule__YAnnotJava__Group_2__1__Impl : ( ( rule__YAnnotJava__DatabaseAssignment_2_1 ) ) ;
    public final void rule__YAnnotJava__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4942:1: ( ( ( rule__YAnnotJava__DatabaseAssignment_2_1 ) ) )
            // InternalModel.g:4943:1: ( ( rule__YAnnotJava__DatabaseAssignment_2_1 ) )
            {
            // InternalModel.g:4943:1: ( ( rule__YAnnotJava__DatabaseAssignment_2_1 ) )
            // InternalModel.g:4944:2: ( rule__YAnnotJava__DatabaseAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getDatabaseAssignment_2_1()); 
            }
            // InternalModel.g:4945:2: ( rule__YAnnotJava__DatabaseAssignment_2_1 )
            // InternalModel.g:4945:3: rule__YAnnotJava__DatabaseAssignment_2_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotJava__DatabaseAssignment_2_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getDatabaseAssignment_2_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__Group_2__1__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__0"
    // InternalModel.g:4954:1: rule__YAnnotSwift__Group__0 : rule__YAnnotSwift__Group__0__Impl rule__YAnnotSwift__Group__1 ;
    public final void rule__YAnnotSwift__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4958:1: ( rule__YAnnotSwift__Group__0__Impl rule__YAnnotSwift__Group__1 )
            // InternalModel.g:4959:2: rule__YAnnotSwift__Group__0__Impl rule__YAnnotSwift__Group__1
            {
            pushFollow(FOLLOW_49);
            rule__YAnnotSwift__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__0"


    // $ANTLR start "rule__YAnnotSwift__Group__0__Impl"
    // InternalModel.g:4966:1: rule__YAnnotSwift__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotSwift__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4970:1: ( ( () ) )
            // InternalModel.g:4971:1: ( () )
            {
            // InternalModel.g:4971:1: ( () )
            // InternalModel.g:4972:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getYAnnotSwiftAction_0()); 
            }
            // InternalModel.g:4973:2: ()
            // InternalModel.g:4973:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getYAnnotSwiftAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__0__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__1"
    // InternalModel.g:4981:1: rule__YAnnotSwift__Group__1 : rule__YAnnotSwift__Group__1__Impl rule__YAnnotSwift__Group__2 ;
    public final void rule__YAnnotSwift__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4985:1: ( rule__YAnnotSwift__Group__1__Impl rule__YAnnotSwift__Group__2 )
            // InternalModel.g:4986:2: rule__YAnnotSwift__Group__1__Impl rule__YAnnotSwift__Group__2
            {
            pushFollow(FOLLOW_50);
            rule__YAnnotSwift__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__1"


    // $ANTLR start "rule__YAnnotSwift__Group__1__Impl"
    // InternalModel.g:4993:1: rule__YAnnotSwift__Group__1__Impl : ( '@swift' ) ;
    public final void rule__YAnnotSwift__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4997:1: ( ( '@swift' ) )
            // InternalModel.g:4998:1: ( '@swift' )
            {
            // InternalModel.g:4998:1: ( '@swift' )
            // InternalModel.g:4999:2: '@swift'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getSwiftKeyword_1()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getSwiftKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__1__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__2"
    // InternalModel.g:5008:1: rule__YAnnotSwift__Group__2 : rule__YAnnotSwift__Group__2__Impl rule__YAnnotSwift__Group__3 ;
    public final void rule__YAnnotSwift__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5012:1: ( rule__YAnnotSwift__Group__2__Impl rule__YAnnotSwift__Group__3 )
            // InternalModel.g:5013:2: rule__YAnnotSwift__Group__2__Impl rule__YAnnotSwift__Group__3
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotSwift__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__2"


    // $ANTLR start "rule__YAnnotSwift__Group__2__Impl"
    // InternalModel.g:5020:1: rule__YAnnotSwift__Group__2__Impl : ( 'module' ) ;
    public final void rule__YAnnotSwift__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5024:1: ( ( 'module' ) )
            // InternalModel.g:5025:1: ( 'module' )
            {
            // InternalModel.g:5025:1: ( 'module' )
            // InternalModel.g:5026:2: 'module'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getModuleKeyword_2()); 
            }
            match(input,50,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getModuleKeyword_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__2__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__3"
    // InternalModel.g:5035:1: rule__YAnnotSwift__Group__3 : rule__YAnnotSwift__Group__3__Impl rule__YAnnotSwift__Group__4 ;
    public final void rule__YAnnotSwift__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5039:1: ( rule__YAnnotSwift__Group__3__Impl rule__YAnnotSwift__Group__4 )
            // InternalModel.g:5040:2: rule__YAnnotSwift__Group__3__Impl rule__YAnnotSwift__Group__4
            {
            pushFollow(FOLLOW_48);
            rule__YAnnotSwift__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__4();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__3"


    // $ANTLR start "rule__YAnnotSwift__Group__3__Impl"
    // InternalModel.g:5047:1: rule__YAnnotSwift__Group__3__Impl : ( ( rule__YAnnotSwift__NameAssignment_3 ) ) ;
    public final void rule__YAnnotSwift__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5051:1: ( ( ( rule__YAnnotSwift__NameAssignment_3 ) ) )
            // InternalModel.g:5052:1: ( ( rule__YAnnotSwift__NameAssignment_3 ) )
            {
            // InternalModel.g:5052:1: ( ( rule__YAnnotSwift__NameAssignment_3 ) )
            // InternalModel.g:5053:2: ( rule__YAnnotSwift__NameAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getNameAssignment_3()); 
            }
            // InternalModel.g:5054:2: ( rule__YAnnotSwift__NameAssignment_3 )
            // InternalModel.g:5054:3: rule__YAnnotSwift__NameAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__NameAssignment_3();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getNameAssignment_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__3__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__4"
    // InternalModel.g:5062:1: rule__YAnnotSwift__Group__4 : rule__YAnnotSwift__Group__4__Impl rule__YAnnotSwift__Group__5 ;
    public final void rule__YAnnotSwift__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5066:1: ( rule__YAnnotSwift__Group__4__Impl rule__YAnnotSwift__Group__5 )
            // InternalModel.g:5067:2: rule__YAnnotSwift__Group__4__Impl rule__YAnnotSwift__Group__5
            {
            pushFollow(FOLLOW_48);
            rule__YAnnotSwift__Group__4__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__5();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__4"


    // $ANTLR start "rule__YAnnotSwift__Group__4__Impl"
    // InternalModel.g:5074:1: rule__YAnnotSwift__Group__4__Impl : ( ( rule__YAnnotSwift__Group_4__0 )? ) ;
    public final void rule__YAnnotSwift__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5078:1: ( ( ( rule__YAnnotSwift__Group_4__0 )? ) )
            // InternalModel.g:5079:1: ( ( rule__YAnnotSwift__Group_4__0 )? )
            {
            // InternalModel.g:5079:1: ( ( rule__YAnnotSwift__Group_4__0 )? )
            // InternalModel.g:5080:2: ( rule__YAnnotSwift__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getGroup_4()); 
            }
            // InternalModel.g:5081:2: ( rule__YAnnotSwift__Group_4__0 )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==48) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // InternalModel.g:5081:3: rule__YAnnotSwift__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotSwift__Group_4__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getGroup_4()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__4__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group__5"
    // InternalModel.g:5089:1: rule__YAnnotSwift__Group__5 : rule__YAnnotSwift__Group__5__Impl ;
    public final void rule__YAnnotSwift__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5093:1: ( rule__YAnnotSwift__Group__5__Impl )
            // InternalModel.g:5094:2: rule__YAnnotSwift__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group__5__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__5"


    // $ANTLR start "rule__YAnnotSwift__Group__5__Impl"
    // InternalModel.g:5100:1: rule__YAnnotSwift__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotSwift__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5104:1: ( ( ( ';' )? ) )
            // InternalModel.g:5105:1: ( ( ';' )? )
            {
            // InternalModel.g:5105:1: ( ( ';' )? )
            // InternalModel.g:5106:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getSemicolonKeyword_5()); 
            }
            // InternalModel.g:5107:2: ( ';' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==24) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModel.g:5107:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getSemicolonKeyword_5()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group__5__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group_4__0"
    // InternalModel.g:5116:1: rule__YAnnotSwift__Group_4__0 : rule__YAnnotSwift__Group_4__0__Impl rule__YAnnotSwift__Group_4__1 ;
    public final void rule__YAnnotSwift__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5120:1: ( rule__YAnnotSwift__Group_4__0__Impl rule__YAnnotSwift__Group_4__1 )
            // InternalModel.g:5121:2: rule__YAnnotSwift__Group_4__0__Impl rule__YAnnotSwift__Group_4__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotSwift__Group_4__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group_4__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group_4__0"


    // $ANTLR start "rule__YAnnotSwift__Group_4__0__Impl"
    // InternalModel.g:5128:1: rule__YAnnotSwift__Group_4__0__Impl : ( 'uses' ) ;
    public final void rule__YAnnotSwift__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5132:1: ( ( 'uses' ) )
            // InternalModel.g:5133:1: ( 'uses' )
            {
            // InternalModel.g:5133:1: ( 'uses' )
            // InternalModel.g:5134:2: 'uses'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getUsesKeyword_4_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getUsesKeyword_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group_4__0__Impl"


    // $ANTLR start "rule__YAnnotSwift__Group_4__1"
    // InternalModel.g:5143:1: rule__YAnnotSwift__Group_4__1 : rule__YAnnotSwift__Group_4__1__Impl ;
    public final void rule__YAnnotSwift__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5147:1: ( rule__YAnnotSwift__Group_4__1__Impl )
            // InternalModel.g:5148:2: rule__YAnnotSwift__Group_4__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__Group_4__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group_4__1"


    // $ANTLR start "rule__YAnnotSwift__Group_4__1__Impl"
    // InternalModel.g:5154:1: rule__YAnnotSwift__Group_4__1__Impl : ( ( rule__YAnnotSwift__DatabaseAssignment_4_1 ) ) ;
    public final void rule__YAnnotSwift__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5158:1: ( ( ( rule__YAnnotSwift__DatabaseAssignment_4_1 ) ) )
            // InternalModel.g:5159:1: ( ( rule__YAnnotSwift__DatabaseAssignment_4_1 ) )
            {
            // InternalModel.g:5159:1: ( ( rule__YAnnotSwift__DatabaseAssignment_4_1 ) )
            // InternalModel.g:5160:2: ( rule__YAnnotSwift__DatabaseAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getDatabaseAssignment_4_1()); 
            }
            // InternalModel.g:5161:2: ( rule__YAnnotSwift__DatabaseAssignment_4_1 )
            // InternalModel.g:5161:3: rule__YAnnotSwift__DatabaseAssignment_4_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotSwift__DatabaseAssignment_4_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getDatabaseAssignment_4_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__Group_4__1__Impl"


    // $ANTLR start "rule__YAnnotDatabase__Group__0"
    // InternalModel.g:5170:1: rule__YAnnotDatabase__Group__0 : rule__YAnnotDatabase__Group__0__Impl rule__YAnnotDatabase__Group__1 ;
    public final void rule__YAnnotDatabase__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5174:1: ( rule__YAnnotDatabase__Group__0__Impl rule__YAnnotDatabase__Group__1 )
            // InternalModel.g:5175:2: rule__YAnnotDatabase__Group__0__Impl rule__YAnnotDatabase__Group__1
            {
            pushFollow(FOLLOW_51);
            rule__YAnnotDatabase__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__0"


    // $ANTLR start "rule__YAnnotDatabase__Group__0__Impl"
    // InternalModel.g:5182:1: rule__YAnnotDatabase__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotDatabase__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5186:1: ( ( () ) )
            // InternalModel.g:5187:1: ( () )
            {
            // InternalModel.g:5187:1: ( () )
            // InternalModel.g:5188:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getYAnnotDatabaseAction_0()); 
            }
            // InternalModel.g:5189:2: ()
            // InternalModel.g:5189:3: 
            {
            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getYAnnotDatabaseAction_0()); 
            }

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__0__Impl"


    // $ANTLR start "rule__YAnnotDatabase__Group__1"
    // InternalModel.g:5197:1: rule__YAnnotDatabase__Group__1 : rule__YAnnotDatabase__Group__1__Impl rule__YAnnotDatabase__Group__2 ;
    public final void rule__YAnnotDatabase__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5201:1: ( rule__YAnnotDatabase__Group__1__Impl rule__YAnnotDatabase__Group__2 )
            // InternalModel.g:5202:2: rule__YAnnotDatabase__Group__1__Impl rule__YAnnotDatabase__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotDatabase__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__Group__2();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__1"


    // $ANTLR start "rule__YAnnotDatabase__Group__1__Impl"
    // InternalModel.g:5209:1: rule__YAnnotDatabase__Group__1__Impl : ( '@database' ) ;
    public final void rule__YAnnotDatabase__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5213:1: ( ( '@database' ) )
            // InternalModel.g:5214:1: ( '@database' )
            {
            // InternalModel.g:5214:1: ( '@database' )
            // InternalModel.g:5215:2: '@database'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getDatabaseKeyword_1()); 
            }
            match(input,51,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getDatabaseKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__1__Impl"


    // $ANTLR start "rule__YAnnotDatabase__Group__2"
    // InternalModel.g:5224:1: rule__YAnnotDatabase__Group__2 : rule__YAnnotDatabase__Group__2__Impl rule__YAnnotDatabase__Group__3 ;
    public final void rule__YAnnotDatabase__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5228:1: ( rule__YAnnotDatabase__Group__2__Impl rule__YAnnotDatabase__Group__3 )
            // InternalModel.g:5229:2: rule__YAnnotDatabase__Group__2__Impl rule__YAnnotDatabase__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__YAnnotDatabase__Group__2__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__Group__3();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__2"


    // $ANTLR start "rule__YAnnotDatabase__Group__2__Impl"
    // InternalModel.g:5236:1: rule__YAnnotDatabase__Group__2__Impl : ( ( rule__YAnnotDatabase__NameAssignment_2 ) ) ;
    public final void rule__YAnnotDatabase__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5240:1: ( ( ( rule__YAnnotDatabase__NameAssignment_2 ) ) )
            // InternalModel.g:5241:1: ( ( rule__YAnnotDatabase__NameAssignment_2 ) )
            {
            // InternalModel.g:5241:1: ( ( rule__YAnnotDatabase__NameAssignment_2 ) )
            // InternalModel.g:5242:2: ( rule__YAnnotDatabase__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:5243:2: ( rule__YAnnotDatabase__NameAssignment_2 )
            // InternalModel.g:5243:3: rule__YAnnotDatabase__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getNameAssignment_2()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__2__Impl"


    // $ANTLR start "rule__YAnnotDatabase__Group__3"
    // InternalModel.g:5251:1: rule__YAnnotDatabase__Group__3 : rule__YAnnotDatabase__Group__3__Impl ;
    public final void rule__YAnnotDatabase__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5255:1: ( rule__YAnnotDatabase__Group__3__Impl )
            // InternalModel.g:5256:2: rule__YAnnotDatabase__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotDatabase__Group__3__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__3"


    // $ANTLR start "rule__YAnnotDatabase__Group__3__Impl"
    // InternalModel.g:5262:1: rule__YAnnotDatabase__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotDatabase__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5266:1: ( ( ( ';' )? ) )
            // InternalModel.g:5267:1: ( ( ';' )? )
            {
            // InternalModel.g:5267:1: ( ( ';' )? )
            // InternalModel.g:5268:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getSemicolonKeyword_3()); 
            }
            // InternalModel.g:5269:2: ( ';' )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==24) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalModel.g:5269:3: ';'
                    {
                    match(input,24,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getSemicolonKeyword_3()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__Group__3__Impl"


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalModel.g:5278:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5282:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalModel.g:5283:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__QualifiedName__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0"


    // $ANTLR start "rule__QualifiedName__Group__0__Impl"
    // InternalModel.g:5290:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5294:1: ( ( ruleValidID ) )
            // InternalModel.g:5295:1: ( ruleValidID )
            {
            // InternalModel.g:5295:1: ( ruleValidID )
            // InternalModel.g:5296:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group__1"
    // InternalModel.g:5305:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5309:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalModel.g:5310:2: rule__QualifiedName__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1"


    // $ANTLR start "rule__QualifiedName__Group__1__Impl"
    // InternalModel.g:5316:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5320:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalModel.g:5321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalModel.g:5321:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalModel.g:5322:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalModel.g:5323:2: ( rule__QualifiedName__Group_1__0 )*
            loop50:
            do {
                int alt50=2;
                int LA50_0 = input.LA(1);

                if ( (LA50_0==52) ) {
                    alt50=1;
                }


                switch (alt50) {
            	case 1 :
            	    // InternalModel.g:5323:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_53);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop50;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group__1__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__0"
    // InternalModel.g:5332:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5336:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalModel.g:5337:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
            {
            pushFollow(FOLLOW_3);
            rule__QualifiedName__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0"


    // $ANTLR start "rule__QualifiedName__Group_1__0__Impl"
    // InternalModel.g:5344:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5348:1: ( ( ( '.' ) ) )
            // InternalModel.g:5349:1: ( ( '.' ) )
            {
            // InternalModel.g:5349:1: ( ( '.' ) )
            // InternalModel.g:5350:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalModel.g:5351:2: ( '.' )
            // InternalModel.g:5351:3: '.'
            {
            match(input,52,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__0__Impl"


    // $ANTLR start "rule__QualifiedName__Group_1__1"
    // InternalModel.g:5359:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5363:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalModel.g:5364:2: rule__QualifiedName__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedName__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1"


    // $ANTLR start "rule__QualifiedName__Group_1__1__Impl"
    // InternalModel.g:5370:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5374:1: ( ( ruleValidID ) )
            // InternalModel.g:5375:1: ( ruleValidID )
            {
            // InternalModel.g:5375:1: ( ruleValidID )
            // InternalModel.g:5376:2: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameAccess().getValidIDParserRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedName__Group_1__1__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0"
    // InternalModel.g:5386:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5390:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalModel.g:5391:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_54);
            rule__QualifiedNameWithWildcard__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__0__Impl"
    // InternalModel.g:5398:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5402:1: ( ( ruleQualifiedName ) )
            // InternalModel.g:5403:1: ( ruleQualifiedName )
            {
            // InternalModel.g:5403:1: ( ruleQualifiedName )
            // InternalModel.g:5404:2: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getQualifiedNameParserRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__0__Impl"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1"
    // InternalModel.g:5413:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5417:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalModel.g:5418:2: rule__QualifiedNameWithWildcard__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__QualifiedNameWithWildcard__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1"


    // $ANTLR start "rule__QualifiedNameWithWildcard__Group__1__Impl"
    // InternalModel.g:5424:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5428:1: ( ( ( '.*' )? ) )
            // InternalModel.g:5429:1: ( ( '.*' )? )
            {
            // InternalModel.g:5429:1: ( ( '.*' )? )
            // InternalModel.g:5430:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalModel.g:5431:2: ( '.*' )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==53) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // InternalModel.g:5431:3: '.*'
                    {
                    match(input,53,FOLLOW_2); if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__QualifiedNameWithWildcard__Group__1__Impl"


    // $ANTLR start "rule__Number__Group__0"
    // InternalModel.g:5440:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5444:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalModel.g:5445:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_52);
            rule__Number__Group__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Number__Group__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0"


    // $ANTLR start "rule__Number__Group__0__Impl"
    // InternalModel.g:5452:1: rule__Number__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5456:1: ( ( RULE_INT ) )
            // InternalModel.g:5457:1: ( RULE_INT )
            {
            // InternalModel.g:5457:1: ( RULE_INT )
            // InternalModel.g:5458:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__0__Impl"


    // $ANTLR start "rule__Number__Group__1"
    // InternalModel.g:5467:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5471:1: ( rule__Number__Group__1__Impl )
            // InternalModel.g:5472:2: rule__Number__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1"


    // $ANTLR start "rule__Number__Group__1__Impl"
    // InternalModel.g:5478:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5482:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalModel.g:5483:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalModel.g:5483:1: ( ( rule__Number__Group_1__0 )? )
            // InternalModel.g:5484:2: ( rule__Number__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup_1()); 
            }
            // InternalModel.g:5485:2: ( rule__Number__Group_1__0 )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==52) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // InternalModel.g:5485:3: rule__Number__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Number__Group_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getGroup_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group__1__Impl"


    // $ANTLR start "rule__Number__Group_1__0"
    // InternalModel.g:5494:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5498:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalModel.g:5499:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
            {
            pushFollow(FOLLOW_26);
            rule__Number__Group_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0"


    // $ANTLR start "rule__Number__Group_1__0__Impl"
    // InternalModel.g:5506:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5510:1: ( ( '.' ) )
            // InternalModel.g:5511:1: ( '.' )
            {
            // InternalModel.g:5511:1: ( '.' )
            // InternalModel.g:5512:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }
            match(input,52,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__0__Impl"


    // $ANTLR start "rule__Number__Group_1__1"
    // InternalModel.g:5521:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5525:1: ( rule__Number__Group_1__1__Impl )
            // InternalModel.g:5526:2: rule__Number__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Number__Group_1__1__Impl();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1"


    // $ANTLR start "rule__Number__Group_1__1__Impl"
    // InternalModel.g:5532:1: rule__Number__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5536:1: ( ( RULE_INT ) )
            // InternalModel.g:5537:1: ( RULE_INT )
            {
            // InternalModel.g:5537:1: ( RULE_INT )
            // InternalModel.g:5538:2: RULE_INT
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }
            match(input,RULE_INT,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getNumberAccess().getINTTerminalRuleCall_1_1()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Number__Group_1__1__Impl"


    // $ANTLR start "rule__YModel__NameAssignment_1"
    // InternalModel.g:5548:1: rule__YModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__YModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5552:1: ( ( ruleQualifiedName ) )
            // InternalModel.g:5553:2: ( ruleQualifiedName )
            {
            // InternalModel.g:5553:2: ( ruleQualifiedName )
            // InternalModel.g:5554:3: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getNameQualifiedNameParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__NameAssignment_1"


    // $ANTLR start "rule__YModel__ImportsAssignment_3"
    // InternalModel.g:5563:1: rule__YModel__ImportsAssignment_3 : ( ruleYImport ) ;
    public final void rule__YModel__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5567:1: ( ( ruleYImport ) )
            // InternalModel.g:5568:2: ( ruleYImport )
            {
            // InternalModel.g:5568:2: ( ruleYImport )
            // InternalModel.g:5569:3: ruleYImport
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getImportsYImportParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYImport();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getImportsYImportParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__ImportsAssignment_3"


    // $ANTLR start "rule__YModel__AnnotationsAssignment_4"
    // InternalModel.g:5578:1: rule__YModel__AnnotationsAssignment_4 : ( ruleYAnnotation ) ;
    public final void rule__YModel__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5582:1: ( ( ruleYAnnotation ) )
            // InternalModel.g:5583:2: ( ruleYAnnotation )
            {
            // InternalModel.g:5583:2: ( ruleYAnnotation )
            // InternalModel.g:5584:3: ruleYAnnotation
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getAnnotationsYAnnotationParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotation();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYModelAccess().getAnnotationsYAnnotationParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YModel__AnnotationsAssignment_4"


    // $ANTLR start "rule__YImport__ImportedNamespaceAssignment_1"
    // InternalModel.g:5593:1: rule__YImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__YImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5597:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalModel.g:5598:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalModel.g:5598:2: ( ruleQualifiedNameWithWildcard )
            // InternalModel.g:5599:3: ruleQualifiedNameWithWildcard
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedNameWithWildcard();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YImport__ImportedNamespaceAssignment_1"


    // $ANTLR start "rule__YAnnotEntity__NameAssignment_2"
    // InternalModel.g:5608:1: rule__YAnnotEntity__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5612:1: ( ( ruleValidID ) )
            // InternalModel.g:5613:2: ( ruleValidID )
            {
            // InternalModel.g:5613:2: ( ruleValidID )
            // InternalModel.g:5614:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__NameAssignment_2"


    // $ANTLR start "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0"
    // InternalModel.g:5623:1: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5627:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5628:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5628:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5629:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0"


    // $ANTLR start "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1"
    // InternalModel.g:5638:1: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5642:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5643:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5643:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5644:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1"


    // $ANTLR start "rule__YAnnotEntity__AnnotationsAssignment_5"
    // InternalModel.g:5653:1: rule__YAnnotEntity__AnnotationsAssignment_5 : ( ruleYAnnotEntityInner ) ;
    public final void rule__YAnnotEntity__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5657:1: ( ( ruleYAnnotEntityInner ) )
            // InternalModel.g:5658:2: ( ruleYAnnotEntityInner )
            {
            // InternalModel.g:5658:2: ( ruleYAnnotEntityInner )
            // InternalModel.g:5659:3: ruleYAnnotEntityInner
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getAnnotationsYAnnotEntityInnerParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotEntityInner();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotEntityAccess().getAnnotationsYAnnotEntityInnerParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotEntity__AnnotationsAssignment_5"


    // $ANTLR start "rule__YAnnotAttribute__NameAssignment_2"
    // InternalModel.g:5668:1: rule__YAnnotAttribute__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5672:1: ( ( ruleValidID ) )
            // InternalModel.g:5673:2: ( ruleValidID )
            {
            // InternalModel.g:5673:2: ( ruleValidID )
            // InternalModel.g:5674:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__NameAssignment_2"


    // $ANTLR start "rule__YAnnotAttribute__OptionalAssignment_3"
    // InternalModel.g:5683:1: rule__YAnnotAttribute__OptionalAssignment_3 : ( ( '?' ) ) ;
    public final void rule__YAnnotAttribute__OptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5687:1: ( ( ( '?' ) ) )
            // InternalModel.g:5688:2: ( ( '?' ) )
            {
            // InternalModel.g:5688:2: ( ( '?' ) )
            // InternalModel.g:5689:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            // InternalModel.g:5690:3: ( '?' )
            // InternalModel.g:5691:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__OptionalAssignment_3"


    // $ANTLR start "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0"
    // InternalModel.g:5702:1: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5706:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5707:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5707:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5708:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0"


    // $ANTLR start "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1"
    // InternalModel.g:5717:1: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5721:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5722:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5722:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5723:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_4_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1"


    // $ANTLR start "rule__YAnnotRelationship__NameAssignment_2"
    // InternalModel.g:5732:1: rule__YAnnotRelationship__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotRelationship__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5736:1: ( ( ruleValidID ) )
            // InternalModel.g:5737:2: ( ruleValidID )
            {
            // InternalModel.g:5737:2: ( ruleValidID )
            // InternalModel.g:5738:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__NameAssignment_2"


    // $ANTLR start "rule__YAnnotRelationship__OptionalAssignment_3"
    // InternalModel.g:5747:1: rule__YAnnotRelationship__OptionalAssignment_3 : ( ( '?' ) ) ;
    public final void rule__YAnnotRelationship__OptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5751:1: ( ( ( '?' ) ) )
            // InternalModel.g:5752:2: ( ( '?' ) )
            {
            // InternalModel.g:5752:2: ( ( '?' ) )
            // InternalModel.g:5753:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            // InternalModel.g:5754:3: ( '?' )
            // InternalModel.g:5755:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__OptionalAssignment_3"


    // $ANTLR start "rule__YAnnotRelationship__TargetAssignment_5"
    // InternalModel.g:5766:1: rule__YAnnotRelationship__TargetAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotRelationship__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5770:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5771:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5771:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5772:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityCrossReference_5_0()); 
            }
            // InternalModel.g:5773:3: ( ruleQualifiedName )
            // InternalModel.g:5774:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityQualifiedNameParserRuleCall_5_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityQualifiedNameParserRuleCall_5_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityCrossReference_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__TargetAssignment_5"


    // $ANTLR start "rule__YAnnotRelationship__ManyAssignment_6"
    // InternalModel.g:5785:1: rule__YAnnotRelationship__ManyAssignment_6 : ( ( '*' ) ) ;
    public final void rule__YAnnotRelationship__ManyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5789:1: ( ( ( '*' ) ) )
            // InternalModel.g:5790:2: ( ( '*' ) )
            {
            // InternalModel.g:5790:2: ( ( '*' ) )
            // InternalModel.g:5791:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }
            // InternalModel.g:5792:3: ( '*' )
            // InternalModel.g:5793:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }
            match(input,55,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__ManyAssignment_6"


    // $ANTLR start "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0"
    // InternalModel.g:5804:1: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5808:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5809:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5809:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5810:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0"


    // $ANTLR start "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1"
    // InternalModel.g:5819:1: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5823:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5824:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5824:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5825:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_7_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1"


    // $ANTLR start "rule__YAnnotRelationship__InverseAssignment_8_1"
    // InternalModel.g:5834:1: rule__YAnnotRelationship__InverseAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotRelationship__InverseAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5838:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5839:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5839:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5840:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipCrossReference_8_1_0()); 
            }
            // InternalModel.g:5841:3: ( ruleQualifiedName )
            // InternalModel.g:5842:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipQualifiedNameParserRuleCall_8_1_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipQualifiedNameParserRuleCall_8_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipCrossReference_8_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotRelationship__InverseAssignment_8_1"


    // $ANTLR start "rule__YAnnotIdentifier__NameAssignment_2"
    // InternalModel.g:5853:1: rule__YAnnotIdentifier__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotIdentifier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5857:1: ( ( ruleValidID ) )
            // InternalModel.g:5858:2: ( ruleValidID )
            {
            // InternalModel.g:5858:2: ( ruleValidID )
            // InternalModel.g:5859:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__NameAssignment_2"


    // $ANTLR start "rule__YAnnotIdentifier__AnnotsAssignment_4"
    // InternalModel.g:5868:1: rule__YAnnotIdentifier__AnnotsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotIdentifier__AnnotsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5872:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5873:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5873:2: ( ( RULE_ID ) )
            // InternalModel.g:5874:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_4_0()); 
            }
            // InternalModel.g:5875:3: ( RULE_ID )
            // InternalModel.g:5876:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerIDTerminalRuleCall_4_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerIDTerminalRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__AnnotsAssignment_4"


    // $ANTLR start "rule__YAnnotIdentifier__AnnotsAssignment_5_1"
    // InternalModel.g:5887:1: rule__YAnnotIdentifier__AnnotsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotIdentifier__AnnotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5891:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5892:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5892:2: ( ( RULE_ID ) )
            // InternalModel.g:5893:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_5_1_0()); 
            }
            // InternalModel.g:5894:3: ( RULE_ID )
            // InternalModel.g:5895:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerIDTerminalRuleCall_5_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerIDTerminalRuleCall_5_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotIdentifier__AnnotsAssignment_5_1"


    // $ANTLR start "rule__YAnnotationElementValuePair__NameAssignment_0_0_0"
    // InternalModel.g:5906:1: rule__YAnnotationElementValuePair__NameAssignment_0_0_0 : ( ruleValidID ) ;
    public final void rule__YAnnotationElementValuePair__NameAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5910:1: ( ( ruleValidID ) )
            // InternalModel.g:5911:2: ( ruleValidID )
            {
            // InternalModel.g:5911:2: ( ruleValidID )
            // InternalModel.g:5912:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getNameValidIDParserRuleCall_0_0_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getNameValidIDParserRuleCall_0_0_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__NameAssignment_0_0_0"


    // $ANTLR start "rule__YAnnotationElementValuePair__ValueAssignment_1"
    // InternalModel.g:5921:1: rule__YAnnotationElementValuePair__ValueAssignment_1 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotationElementValuePair__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5925:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:5926:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:5926:2: ( ruleYAnnotExpression )
            // InternalModel.g:5927:3: ruleYAnnotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getValueYAnnotExpressionParserRuleCall_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotationElementValuePairAccess().getValueYAnnotExpressionParserRuleCall_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotationElementValuePair__ValueAssignment_1"


    // $ANTLR start "rule__YAnnotExpression__ValueAssignment_0_1"
    // InternalModel.g:5936:1: rule__YAnnotExpression__ValueAssignment_0_1 : ( ruleValidID ) ;
    public final void rule__YAnnotExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5940:1: ( ( ruleValidID ) )
            // InternalModel.g:5941:2: ( ruleValidID )
            {
            // InternalModel.g:5941:2: ( ruleValidID )
            // InternalModel.g:5942:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueValidIDParserRuleCall_0_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueValidIDParserRuleCall_0_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ValueAssignment_0_1"


    // $ANTLR start "rule__YAnnotExpression__ValueAssignment_1_1"
    // InternalModel.g:5951:1: rule__YAnnotExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__YAnnotExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5955:1: ( ( RULE_STRING ) )
            // InternalModel.g:5956:2: ( RULE_STRING )
            {
            // InternalModel.g:5956:2: ( RULE_STRING )
            // InternalModel.g:5957:3: RULE_STRING
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }
            match(input,RULE_STRING,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueSTRINGTerminalRuleCall_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ValueAssignment_1_1"


    // $ANTLR start "rule__YAnnotExpression__ValueAssignment_2_1"
    // InternalModel.g:5966:1: rule__YAnnotExpression__ValueAssignment_2_1 : ( ruleNumber ) ;
    public final void rule__YAnnotExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5970:1: ( ( ruleNumber ) )
            // InternalModel.g:5971:2: ( ruleNumber )
            {
            // InternalModel.g:5971:2: ( ruleNumber )
            // InternalModel.g:5972:3: ruleNumber
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueNumberParserRuleCall_2_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleNumber();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueNumberParserRuleCall_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ValueAssignment_2_1"


    // $ANTLR start "rule__YAnnotExpression__ValueAssignment_3_1"
    // InternalModel.g:5981:1: rule__YAnnotExpression__ValueAssignment_3_1 : ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__YAnnotExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5985:1: ( ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) ) )
            // InternalModel.g:5986:2: ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) )
            {
            // InternalModel.g:5986:2: ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) )
            // InternalModel.g:5987:3: ( rule__YAnnotExpression__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAlternatives_3_1_0()); 
            }
            // InternalModel.g:5988:3: ( rule__YAnnotExpression__ValueAlternatives_3_1_0 )
            // InternalModel.g:5988:4: rule__YAnnotExpression__ValueAlternatives_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotExpression__ValueAlternatives_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getValueAlternatives_3_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ValueAssignment_3_1"


    // $ANTLR start "rule__YAnnotExpression__ElementsAssignment_4_2_0"
    // InternalModel.g:5996:1: rule__YAnnotExpression__ElementsAssignment_4_2_0 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotExpression__ElementsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6000:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:6001:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:6001:2: ( ruleYAnnotExpression )
            // InternalModel.g:6002:3: ruleYAnnotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ElementsAssignment_4_2_0"


    // $ANTLR start "rule__YAnnotExpression__ElementsAssignment_4_2_1_1"
    // InternalModel.g:6011:1: rule__YAnnotExpression__ElementsAssignment_4_2_1_1 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotExpression__ElementsAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6015:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:6016:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:6016:2: ( ruleYAnnotExpression )
            // InternalModel.g:6017:3: ruleYAnnotExpression
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotExpression();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotExpressionAccess().getElementsYAnnotExpressionParserRuleCall_4_2_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotExpression__ElementsAssignment_4_2_1_1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__DatabaseAssignment_3"
    // InternalModel.g:6026:1: rule__YAnnotTechnicalDesign__DatabaseAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotTechnicalDesign__DatabaseAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6030:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:6031:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:6031:2: ( ( RULE_ID ) )
            // InternalModel.g:6032:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseCrossReference_3_0()); 
            }
            // InternalModel.g:6033:3: ( RULE_ID )
            // InternalModel.g:6034:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getDatabaseYAnnotDatabaseCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__DatabaseAssignment_3"


    // $ANTLR start "rule__YAnnotTechnicalDesign__FeaturesAssignment_5"
    // InternalModel.g:6045:1: rule__YAnnotTechnicalDesign__FeaturesAssignment_5 : ( ruleYAnnotTable ) ;
    public final void rule__YAnnotTechnicalDesign__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6049:1: ( ( ruleYAnnotTable ) )
            // InternalModel.g:6050:2: ( ruleYAnnotTable )
            {
            // InternalModel.g:6050:2: ( ruleYAnnotTable )
            // InternalModel.g:6051:3: ruleYAnnotTable
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesYAnnotTableParserRuleCall_5_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotTable();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesYAnnotTableParserRuleCall_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTechnicalDesign__FeaturesAssignment_5"


    // $ANTLR start "rule__YAnnotTable__NameAssignment_2"
    // InternalModel.g:6060:1: rule__YAnnotTable__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotTable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6064:1: ( ( ruleValidID ) )
            // InternalModel.g:6065:2: ( ruleValidID )
            {
            // InternalModel.g:6065:2: ( ruleValidID )
            // InternalModel.g:6066:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__NameAssignment_2"


    // $ANTLR start "rule__YAnnotTable__EntityrefAssignment_4"
    // InternalModel.g:6075:1: rule__YAnnotTable__EntityrefAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotTable__EntityrefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6079:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:6080:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:6080:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:6081:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityCrossReference_4_0()); 
            }
            // InternalModel.g:6082:3: ( ruleQualifiedName )
            // InternalModel.g:6083:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityQualifiedNameParserRuleCall_4_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityQualifiedNameParserRuleCall_4_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityCrossReference_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__EntityrefAssignment_4"


    // $ANTLR start "rule__YAnnotTable__ColumnsAssignment_6"
    // InternalModel.g:6094:1: rule__YAnnotTable__ColumnsAssignment_6 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotTable__ColumnsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6098:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:6099:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:6099:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:6100:3: ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getColumnsYAnnotAbstractColumnParserRuleCall_6_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getColumnsYAnnotAbstractColumnParserRuleCall_6_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__ColumnsAssignment_6"


    // $ANTLR start "rule__YAnnotTable__PrimarykeyAssignment_7"
    // InternalModel.g:6109:1: rule__YAnnotTable__PrimarykeyAssignment_7 : ( ruleYAnnotPrimaryKey ) ;
    public final void rule__YAnnotTable__PrimarykeyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6113:1: ( ( ruleYAnnotPrimaryKey ) )
            // InternalModel.g:6114:2: ( ruleYAnnotPrimaryKey )
            {
            // InternalModel.g:6114:2: ( ruleYAnnotPrimaryKey )
            // InternalModel.g:6115:3: ruleYAnnotPrimaryKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getPrimarykeyYAnnotPrimaryKeyParserRuleCall_7_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotPrimaryKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getPrimarykeyYAnnotPrimaryKeyParserRuleCall_7_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__PrimarykeyAssignment_7"


    // $ANTLR start "rule__YAnnotTable__ForeignkeysAssignment_8"
    // InternalModel.g:6124:1: rule__YAnnotTable__ForeignkeysAssignment_8 : ( ruleYAnnotForeignKey ) ;
    public final void rule__YAnnotTable__ForeignkeysAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6128:1: ( ( ruleYAnnotForeignKey ) )
            // InternalModel.g:6129:2: ( ruleYAnnotForeignKey )
            {
            // InternalModel.g:6129:2: ( ruleYAnnotForeignKey )
            // InternalModel.g:6130:3: ruleYAnnotForeignKey
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getForeignkeysYAnnotForeignKeyParserRuleCall_8_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotForeignKey();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTableAccess().getForeignkeysYAnnotForeignKeyParserRuleCall_8_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotTable__ForeignkeysAssignment_8"


    // $ANTLR start "rule__YAnnotColumn__AttrrefAssignment_2"
    // InternalModel.g:6139:1: rule__YAnnotColumn__AttrrefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotColumn__AttrrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6143:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:6144:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:6144:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:6145:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0()); 
            }
            // InternalModel.g:6146:3: ( ruleQualifiedName )
            // InternalModel.g:6147:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__AttrrefAssignment_2"


    // $ANTLR start "rule__YAnnotColumn__TypeAssignment_4"
    // InternalModel.g:6158:1: rule__YAnnotColumn__TypeAssignment_4 : ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) ) ;
    public final void rule__YAnnotColumn__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6162:1: ( ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) ) )
            // InternalModel.g:6163:2: ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) )
            {
            // InternalModel.g:6163:2: ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) )
            // InternalModel.g:6164:3: ( rule__YAnnotColumn__TypeAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getTypeAlternatives_4_0()); 
            }
            // InternalModel.g:6165:3: ( rule__YAnnotColumn__TypeAlternatives_4_0 )
            // InternalModel.g:6165:4: rule__YAnnotColumn__TypeAlternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotColumn__TypeAlternatives_4_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getTypeAlternatives_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__TypeAssignment_4"


    // $ANTLR start "rule__YAnnotColumn__OptionalAssignment_5"
    // InternalModel.g:6173:1: rule__YAnnotColumn__OptionalAssignment_5 : ( ( '?' ) ) ;
    public final void rule__YAnnotColumn__OptionalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6177:1: ( ( ( '?' ) ) )
            // InternalModel.g:6178:2: ( ( '?' ) )
            {
            // InternalModel.g:6178:2: ( ( '?' ) )
            // InternalModel.g:6179:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }
            // InternalModel.g:6180:3: ( '?' )
            // InternalModel.g:6181:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }
            match(input,54,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__OptionalAssignment_5"


    // $ANTLR start "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0"
    // InternalModel.g:6192:1: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6196:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:6197:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:6197:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:6198:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_0_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0"


    // $ANTLR start "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1"
    // InternalModel.g:6207:1: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6211:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:6212:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:6212:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:6213:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_6_1_1_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1"


    // $ANTLR start "rule__YAnnotColumnLike__ColumnrefAssignment_2"
    // InternalModel.g:6222:1: rule__YAnnotColumnLike__ColumnrefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotColumnLike__ColumnrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6226:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:6227:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:6227:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:6228:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnCrossReference_2_0()); 
            }
            // InternalModel.g:6229:3: ( ruleQualifiedName )
            // InternalModel.g:6230:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotColumnLike__ColumnrefAssignment_2"


    // $ANTLR start "rule__YAnnotAbstractColumn__NameAssignment_2"
    // InternalModel.g:6241:1: rule__YAnnotAbstractColumn__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotAbstractColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6245:1: ( ( ruleValidID ) )
            // InternalModel.g:6246:2: ( ruleValidID )
            {
            // InternalModel.g:6246:2: ( ruleValidID )
            // InternalModel.g:6247:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__NameAssignment_2"


    // $ANTLR start "rule__YAnnotAbstractColumn__TypeAssignment_3"
    // InternalModel.g:6256:1: rule__YAnnotAbstractColumn__TypeAssignment_3 : ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) ) ;
    public final void rule__YAnnotAbstractColumn__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6260:1: ( ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) ) )
            // InternalModel.g:6261:2: ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) )
            {
            // InternalModel.g:6261:2: ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) )
            // InternalModel.g:6262:3: ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAlternatives_3_0()); 
            }
            // InternalModel.g:6263:3: ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 )
            // InternalModel.g:6263:4: rule__YAnnotAbstractColumn__TypeAlternatives_3_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotAbstractColumn__TypeAlternatives_3_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAlternatives_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotAbstractColumn__TypeAssignment_3"


    // $ANTLR start "rule__YAnnotPrimaryKey__ColumnsAssignment_3"
    // InternalModel.g:6271:1: rule__YAnnotPrimaryKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotPrimaryKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6275:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:6276:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:6276:2: ( ( RULE_ID ) )
            // InternalModel.g:6277:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0()); 
            }
            // InternalModel.g:6278:3: ( RULE_ID )
            // InternalModel.g:6279:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnIDTerminalRuleCall_3_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnIDTerminalRuleCall_3_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__ColumnsAssignment_3"


    // $ANTLR start "rule__YAnnotPrimaryKey__ColumnsAssignment_4_1"
    // InternalModel.g:6290:1: rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotPrimaryKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6294:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:6295:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:6295:2: ( ( RULE_ID ) )
            // InternalModel.g:6296:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_4_1_0()); 
            }
            // InternalModel.g:6297:3: ( RULE_ID )
            // InternalModel.g:6298:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotPrimaryKey__ColumnsAssignment_4_1"


    // $ANTLR start "rule__YAnnotForeignKey__RelationshipAssignment_2"
    // InternalModel.g:6309:1: rule__YAnnotForeignKey__RelationshipAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotForeignKey__RelationshipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6313:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:6314:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:6314:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:6315:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipCrossReference_2_0()); 
            }
            // InternalModel.g:6316:3: ( ruleQualifiedName )
            // InternalModel.g:6317:4: ruleQualifiedName
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipQualifiedNameParserRuleCall_2_0_1()); 
            }
            pushFollow(FOLLOW_2);
            ruleQualifiedName();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipQualifiedNameParserRuleCall_2_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipCrossReference_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__RelationshipAssignment_2"


    // $ANTLR start "rule__YAnnotForeignKey__ColumnsAssignment_4"
    // InternalModel.g:6328:1: rule__YAnnotForeignKey__ColumnsAssignment_4 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotForeignKey__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6332:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:6333:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:6333:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:6334:3: ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_4_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_4_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__ColumnsAssignment_4"


    // $ANTLR start "rule__YAnnotForeignKey__ColumnsAssignment_5_1"
    // InternalModel.g:6343:1: rule__YAnnotForeignKey__ColumnsAssignment_5_1 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotForeignKey__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6347:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:6348:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:6348:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:6349:3: ruleYAnnotAbstractColumn
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_5_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotAbstractColumn();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotForeignKeyAccess().getColumnsYAnnotAbstractColumnParserRuleCall_5_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotForeignKey__ColumnsAssignment_5_1"


    // $ANTLR start "rule__YAnnotJava__DatabaseAssignment_2_1"
    // InternalModel.g:6358:1: rule__YAnnotJava__DatabaseAssignment_2_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotJava__DatabaseAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6362:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:6363:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:6363:2: ( ( RULE_ID ) )
            // InternalModel.g:6364:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseCrossReference_2_1_0()); 
            }
            // InternalModel.g:6365:3: ( RULE_ID )
            // InternalModel.g:6366:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_2_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_2_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotJavaAccess().getDatabaseYAnnotDatabaseCrossReference_2_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotJava__DatabaseAssignment_2_1"


    // $ANTLR start "rule__YAnnotSwift__NameAssignment_3"
    // InternalModel.g:6377:1: rule__YAnnotSwift__NameAssignment_3 : ( ruleValidID ) ;
    public final void rule__YAnnotSwift__NameAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6381:1: ( ( ruleValidID ) )
            // InternalModel.g:6382:2: ( ruleValidID )
            {
            // InternalModel.g:6382:2: ( ruleValidID )
            // InternalModel.g:6383:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getNameValidIDParserRuleCall_3_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getNameValidIDParserRuleCall_3_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__NameAssignment_3"


    // $ANTLR start "rule__YAnnotSwift__DatabaseAssignment_4_1"
    // InternalModel.g:6392:1: rule__YAnnotSwift__DatabaseAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotSwift__DatabaseAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6396:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:6397:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:6397:2: ( ( RULE_ID ) )
            // InternalModel.g:6398:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseCrossReference_4_1_0()); 
            }
            // InternalModel.g:6399:3: ( RULE_ID )
            // InternalModel.g:6400:4: RULE_ID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_4_1_0_1()); 
            }
            match(input,RULE_ID,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseIDTerminalRuleCall_4_1_0_1()); 
            }

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotSwiftAccess().getDatabaseYAnnotDatabaseCrossReference_4_1_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotSwift__DatabaseAssignment_4_1"


    // $ANTLR start "rule__YAnnotDatabase__NameAssignment_2"
    // InternalModel.g:6411:1: rule__YAnnotDatabase__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotDatabase__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:6415:1: ( ( ruleValidID ) )
            // InternalModel.g:6416:2: ( ruleValidID )
            {
            // InternalModel.g:6416:2: ( ruleValidID )
            // InternalModel.g:6417:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotDatabaseAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotDatabaseAccess().getNameValidIDParserRuleCall_2_0()); 
            }

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__YAnnotDatabase__NameAssignment_2"

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\42\1\4\1\30\1\4\2\uffff\1\30";
    static final String dfa_4s = "\1\42\1\4\1\64\1\4\2\uffff\1\64";
    static final String dfa_5s = "\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\3\uffff\1\4\2\uffff\1\4\13\uffff\1\5\3\4\5\uffff\1\3",
            "\1\6",
            "",
            "",
            "\1\4\3\uffff\1\4\2\uffff\1\4\13\uffff\1\5\3\4\5\uffff\1\3"
    };

    static final short[] dfa_1 = DFA.unpackEncodedString(dfa_1s);
    static final short[] dfa_2 = DFA.unpackEncodedString(dfa_2s);
    static final char[] dfa_3 = DFA.unpackEncodedStringToUnsignedChars(dfa_3s);
    static final char[] dfa_4 = DFA.unpackEncodedStringToUnsignedChars(dfa_4s);
    static final short[] dfa_5 = DFA.unpackEncodedString(dfa_5s);
    static final short[] dfa_6 = DFA.unpackEncodedString(dfa_6s);
    static final short[][] dfa_7 = unpackEncodedStringArray(dfa_7s);

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = dfa_1;
            this.eof = dfa_2;
            this.min = dfa_3;
            this.max = dfa_4;
            this.accept = dfa_5;
            this.special = dfa_6;
            this.transition = dfa_7;
        }
        public String getDescription() {
            return "856:1: rule__YAnnotAbstractColumn__TypeAlternatives_3_0 : ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x000A810007000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000A810004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001310000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001300000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0040000021000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0040000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0080000821000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000001870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000001870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000040010000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000700010000000L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0001000001000000L});
    public static final BitSet FOLLOW_49 = new BitSet(new long[]{0x000A810004000000L});
    public static final BitSet FOLLOW_50 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_51 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_52 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_53 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_54 = new BitSet(new long[]{0x0020000000000000L});

}