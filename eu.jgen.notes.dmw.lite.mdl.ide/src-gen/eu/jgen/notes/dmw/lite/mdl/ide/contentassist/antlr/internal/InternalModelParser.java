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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'true'", "'false'", "'VARCHAR'", "'CHAR'", "'INTEGER'", "'BIGINT'", "'SMALLINT'", "'DECIMAL'", "'TIME'", "'DATE'", "'TIMESTAMP'", "'BOOLEAN'", "'package'", "';'", "'import'", "'@entity'", "'{'", "'}'", "'('", "')'", "','", "'@attribute'", "'@relationship'", "'->'", "'<-'", "'@identifier'", "'='", "']'", "'['", "'@td'", "'@table'", "'as'", "'@column'", "'@primary'", "'@foreign'", "'.'", "'.*'", "'?'", "'*'"
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


    // $ANTLR start "entryRuleQualifiedName"
    // InternalModel.g:479:1: entryRuleQualifiedName : ruleQualifiedName EOF ;
    public final void entryRuleQualifiedName() throws RecognitionException {
        try {
            // InternalModel.g:480:1: ( ruleQualifiedName EOF )
            // InternalModel.g:481:1: ruleQualifiedName EOF
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
    // InternalModel.g:488:1: ruleQualifiedName : ( ( rule__QualifiedName__Group__0 ) ) ;
    public final void ruleQualifiedName() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:492:2: ( ( ( rule__QualifiedName__Group__0 ) ) )
            // InternalModel.g:493:2: ( ( rule__QualifiedName__Group__0 ) )
            {
            // InternalModel.g:493:2: ( ( rule__QualifiedName__Group__0 ) )
            // InternalModel.g:494:3: ( rule__QualifiedName__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup()); 
            }
            // InternalModel.g:495:3: ( rule__QualifiedName__Group__0 )
            // InternalModel.g:495:4: rule__QualifiedName__Group__0
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
    // InternalModel.g:504:1: entryRuleQualifiedNameWithWildcard : ruleQualifiedNameWithWildcard EOF ;
    public final void entryRuleQualifiedNameWithWildcard() throws RecognitionException {
        try {
            // InternalModel.g:505:1: ( ruleQualifiedNameWithWildcard EOF )
            // InternalModel.g:506:1: ruleQualifiedNameWithWildcard EOF
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
    // InternalModel.g:513:1: ruleQualifiedNameWithWildcard : ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) ;
    public final void ruleQualifiedNameWithWildcard() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:517:2: ( ( ( rule__QualifiedNameWithWildcard__Group__0 ) ) )
            // InternalModel.g:518:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            {
            // InternalModel.g:518:2: ( ( rule__QualifiedNameWithWildcard__Group__0 ) )
            // InternalModel.g:519:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getGroup()); 
            }
            // InternalModel.g:520:3: ( rule__QualifiedNameWithWildcard__Group__0 )
            // InternalModel.g:520:4: rule__QualifiedNameWithWildcard__Group__0
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
    // InternalModel.g:529:1: entryRuleValidID : ruleValidID EOF ;
    public final void entryRuleValidID() throws RecognitionException {
        try {
            // InternalModel.g:530:1: ( ruleValidID EOF )
            // InternalModel.g:531:1: ruleValidID EOF
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
    // InternalModel.g:538:1: ruleValidID : ( RULE_ID ) ;
    public final void ruleValidID() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:542:2: ( ( RULE_ID ) )
            // InternalModel.g:543:2: ( RULE_ID )
            {
            // InternalModel.g:543:2: ( RULE_ID )
            // InternalModel.g:544:3: RULE_ID
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
    // InternalModel.g:554:1: entryRuleNumber : ruleNumber EOF ;
    public final void entryRuleNumber() throws RecognitionException {
         
        	HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();

        try {
            // InternalModel.g:558:1: ( ruleNumber EOF )
            // InternalModel.g:559:1: ruleNumber EOF
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
    // InternalModel.g:569:1: ruleNumber : ( ( rule__Number__Group__0 ) ) ;
    public final void ruleNumber() throws RecognitionException {

        		HiddenTokens myHiddenTokenState = ((XtextTokenStream)input).setHiddenTokens();
        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:574:2: ( ( ( rule__Number__Group__0 ) ) )
            // InternalModel.g:575:2: ( ( rule__Number__Group__0 ) )
            {
            // InternalModel.g:575:2: ( ( rule__Number__Group__0 ) )
            // InternalModel.g:576:3: ( rule__Number__Group__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup()); 
            }
            // InternalModel.g:577:3: ( rule__Number__Group__0 )
            // InternalModel.g:577:4: rule__Number__Group__0
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
    // InternalModel.g:586:1: rule__YAnnotation__Alternatives : ( ( ruleYAnnotEntity ) | ( ruleYAnnotTechnicalDesign ) );
    public final void rule__YAnnotation__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:590:1: ( ( ruleYAnnotEntity ) | ( ruleYAnnotTechnicalDesign ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==26) ) {
                alt1=1;
            }
            else if ( (LA1_0==40) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalModel.g:591:2: ( ruleYAnnotEntity )
                    {
                    // InternalModel.g:591:2: ( ruleYAnnotEntity )
                    // InternalModel.g:592:3: ruleYAnnotEntity
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
                    // InternalModel.g:597:2: ( ruleYAnnotTechnicalDesign )
                    {
                    // InternalModel.g:597:2: ( ruleYAnnotTechnicalDesign )
                    // InternalModel.g:598:3: ruleYAnnotTechnicalDesign
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

            }
        }
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
    // InternalModel.g:607:1: rule__YAnnotEntityInner__Alternatives : ( ( ruleYAnnotAttribute ) | ( ruleYAnnotRelationship ) | ( ruleYAnnotIdentifier ) );
    public final void rule__YAnnotEntityInner__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:611:1: ( ( ruleYAnnotAttribute ) | ( ruleYAnnotRelationship ) | ( ruleYAnnotIdentifier ) )
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
                    // InternalModel.g:612:2: ( ruleYAnnotAttribute )
                    {
                    // InternalModel.g:612:2: ( ruleYAnnotAttribute )
                    // InternalModel.g:613:3: ruleYAnnotAttribute
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
                    // InternalModel.g:618:2: ( ruleYAnnotRelationship )
                    {
                    // InternalModel.g:618:2: ( ruleYAnnotRelationship )
                    // InternalModel.g:619:3: ruleYAnnotRelationship
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
                    // InternalModel.g:624:2: ( ruleYAnnotIdentifier )
                    {
                    // InternalModel.g:624:2: ( ruleYAnnotIdentifier )
                    // InternalModel.g:625:3: ruleYAnnotIdentifier
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
    // InternalModel.g:634:1: rule__YAnnotExpression__Alternatives : ( ( ( rule__YAnnotExpression__Group_0__0 ) ) | ( ( rule__YAnnotExpression__Group_1__0 ) ) | ( ( rule__YAnnotExpression__Group_2__0 ) ) | ( ( rule__YAnnotExpression__Group_3__0 ) ) | ( ( rule__YAnnotExpression__Group_4__0 ) ) );
    public final void rule__YAnnotExpression__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:638:1: ( ( ( rule__YAnnotExpression__Group_0__0 ) ) | ( ( rule__YAnnotExpression__Group_1__0 ) ) | ( ( rule__YAnnotExpression__Group_2__0 ) ) | ( ( rule__YAnnotExpression__Group_3__0 ) ) | ( ( rule__YAnnotExpression__Group_4__0 ) ) )
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
                    // InternalModel.g:639:2: ( ( rule__YAnnotExpression__Group_0__0 ) )
                    {
                    // InternalModel.g:639:2: ( ( rule__YAnnotExpression__Group_0__0 ) )
                    // InternalModel.g:640:3: ( rule__YAnnotExpression__Group_0__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_0()); 
                    }
                    // InternalModel.g:641:3: ( rule__YAnnotExpression__Group_0__0 )
                    // InternalModel.g:641:4: rule__YAnnotExpression__Group_0__0
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
                    // InternalModel.g:645:2: ( ( rule__YAnnotExpression__Group_1__0 ) )
                    {
                    // InternalModel.g:645:2: ( ( rule__YAnnotExpression__Group_1__0 ) )
                    // InternalModel.g:646:3: ( rule__YAnnotExpression__Group_1__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_1()); 
                    }
                    // InternalModel.g:647:3: ( rule__YAnnotExpression__Group_1__0 )
                    // InternalModel.g:647:4: rule__YAnnotExpression__Group_1__0
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
                    // InternalModel.g:651:2: ( ( rule__YAnnotExpression__Group_2__0 ) )
                    {
                    // InternalModel.g:651:2: ( ( rule__YAnnotExpression__Group_2__0 ) )
                    // InternalModel.g:652:3: ( rule__YAnnotExpression__Group_2__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_2()); 
                    }
                    // InternalModel.g:653:3: ( rule__YAnnotExpression__Group_2__0 )
                    // InternalModel.g:653:4: rule__YAnnotExpression__Group_2__0
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
                    // InternalModel.g:657:2: ( ( rule__YAnnotExpression__Group_3__0 ) )
                    {
                    // InternalModel.g:657:2: ( ( rule__YAnnotExpression__Group_3__0 ) )
                    // InternalModel.g:658:3: ( rule__YAnnotExpression__Group_3__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_3()); 
                    }
                    // InternalModel.g:659:3: ( rule__YAnnotExpression__Group_3__0 )
                    // InternalModel.g:659:4: rule__YAnnotExpression__Group_3__0
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
                    // InternalModel.g:663:2: ( ( rule__YAnnotExpression__Group_4__0 ) )
                    {
                    // InternalModel.g:663:2: ( ( rule__YAnnotExpression__Group_4__0 ) )
                    // InternalModel.g:664:3: ( rule__YAnnotExpression__Group_4__0 )
                    {
                    if ( state.backtracking==0 ) {
                       before(grammarAccess.getYAnnotExpressionAccess().getGroup_4()); 
                    }
                    // InternalModel.g:665:3: ( rule__YAnnotExpression__Group_4__0 )
                    // InternalModel.g:665:4: rule__YAnnotExpression__Group_4__0
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
    // InternalModel.g:673:1: rule__YAnnotExpression__ValueAlternatives_3_1_0 : ( ( 'true' ) | ( 'false' ) );
    public final void rule__YAnnotExpression__ValueAlternatives_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:677:1: ( ( 'true' ) | ( 'false' ) )
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
                    // InternalModel.g:678:2: ( 'true' )
                    {
                    // InternalModel.g:678:2: ( 'true' )
                    // InternalModel.g:679:3: 'true'
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
                    // InternalModel.g:684:2: ( 'false' )
                    {
                    // InternalModel.g:684:2: ( 'false' )
                    // InternalModel.g:685:3: 'false'
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
    // InternalModel.g:694:1: rule__YAnnotColumn__TypeAlternatives_4_0 : ( ( 'VARCHAR' ) | ( 'CHAR' ) | ( 'INTEGER' ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'DECIMAL' ) | ( 'TIME' ) | ( 'DATE' ) | ( 'TIMESTAMP' ) | ( 'BOOLEAN' ) );
    public final void rule__YAnnotColumn__TypeAlternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:698:1: ( ( 'VARCHAR' ) | ( 'CHAR' ) | ( 'INTEGER' ) | ( 'BIGINT' ) | ( 'SMALLINT' ) | ( 'DECIMAL' ) | ( 'TIME' ) | ( 'DATE' ) | ( 'TIMESTAMP' ) | ( 'BOOLEAN' ) )
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
                    // InternalModel.g:699:2: ( 'VARCHAR' )
                    {
                    // InternalModel.g:699:2: ( 'VARCHAR' )
                    // InternalModel.g:700:3: 'VARCHAR'
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
                    // InternalModel.g:705:2: ( 'CHAR' )
                    {
                    // InternalModel.g:705:2: ( 'CHAR' )
                    // InternalModel.g:706:3: 'CHAR'
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
                    // InternalModel.g:711:2: ( 'INTEGER' )
                    {
                    // InternalModel.g:711:2: ( 'INTEGER' )
                    // InternalModel.g:712:3: 'INTEGER'
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
                    // InternalModel.g:717:2: ( 'BIGINT' )
                    {
                    // InternalModel.g:717:2: ( 'BIGINT' )
                    // InternalModel.g:718:3: 'BIGINT'
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
                    // InternalModel.g:723:2: ( 'SMALLINT' )
                    {
                    // InternalModel.g:723:2: ( 'SMALLINT' )
                    // InternalModel.g:724:3: 'SMALLINT'
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
                    // InternalModel.g:729:2: ( 'DECIMAL' )
                    {
                    // InternalModel.g:729:2: ( 'DECIMAL' )
                    // InternalModel.g:730:3: 'DECIMAL'
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
                    // InternalModel.g:735:2: ( 'TIME' )
                    {
                    // InternalModel.g:735:2: ( 'TIME' )
                    // InternalModel.g:736:3: 'TIME'
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
                    // InternalModel.g:741:2: ( 'DATE' )
                    {
                    // InternalModel.g:741:2: ( 'DATE' )
                    // InternalModel.g:742:3: 'DATE'
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
                    // InternalModel.g:747:2: ( 'TIMESTAMP' )
                    {
                    // InternalModel.g:747:2: ( 'TIMESTAMP' )
                    // InternalModel.g:748:3: 'TIMESTAMP'
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
                    // InternalModel.g:753:2: ( 'BOOLEAN' )
                    {
                    // InternalModel.g:753:2: ( 'BOOLEAN' )
                    // InternalModel.g:754:3: 'BOOLEAN'
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
    // InternalModel.g:763:1: rule__YAnnotAbstractColumn__TypeAlternatives_3_0 : ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) );
    public final void rule__YAnnotAbstractColumn__TypeAlternatives_3_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:767:1: ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) )
            int alt6=2;
            alt6 = dfa6.predict(input);
            switch (alt6) {
                case 1 :
                    // InternalModel.g:768:2: ( ruleYAnnotColumn )
                    {
                    // InternalModel.g:768:2: ( ruleYAnnotColumn )
                    // InternalModel.g:769:3: ruleYAnnotColumn
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
                    // InternalModel.g:774:2: ( ruleYAnnotColumnLike )
                    {
                    // InternalModel.g:774:2: ( ruleYAnnotColumnLike )
                    // InternalModel.g:775:3: ruleYAnnotColumnLike
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
    // InternalModel.g:784:1: rule__YModel__Group__0 : rule__YModel__Group__0__Impl rule__YModel__Group__1 ;
    public final void rule__YModel__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:788:1: ( rule__YModel__Group__0__Impl rule__YModel__Group__1 )
            // InternalModel.g:789:2: rule__YModel__Group__0__Impl rule__YModel__Group__1
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
    // InternalModel.g:796:1: rule__YModel__Group__0__Impl : ( 'package' ) ;
    public final void rule__YModel__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:800:1: ( ( 'package' ) )
            // InternalModel.g:801:1: ( 'package' )
            {
            // InternalModel.g:801:1: ( 'package' )
            // InternalModel.g:802:2: 'package'
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
    // InternalModel.g:811:1: rule__YModel__Group__1 : rule__YModel__Group__1__Impl rule__YModel__Group__2 ;
    public final void rule__YModel__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:815:1: ( rule__YModel__Group__1__Impl rule__YModel__Group__2 )
            // InternalModel.g:816:2: rule__YModel__Group__1__Impl rule__YModel__Group__2
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
    // InternalModel.g:823:1: rule__YModel__Group__1__Impl : ( ( rule__YModel__NameAssignment_1 ) ) ;
    public final void rule__YModel__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:827:1: ( ( ( rule__YModel__NameAssignment_1 ) ) )
            // InternalModel.g:828:1: ( ( rule__YModel__NameAssignment_1 ) )
            {
            // InternalModel.g:828:1: ( ( rule__YModel__NameAssignment_1 ) )
            // InternalModel.g:829:2: ( rule__YModel__NameAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getNameAssignment_1()); 
            }
            // InternalModel.g:830:2: ( rule__YModel__NameAssignment_1 )
            // InternalModel.g:830:3: rule__YModel__NameAssignment_1
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
    // InternalModel.g:838:1: rule__YModel__Group__2 : rule__YModel__Group__2__Impl rule__YModel__Group__3 ;
    public final void rule__YModel__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:842:1: ( rule__YModel__Group__2__Impl rule__YModel__Group__3 )
            // InternalModel.g:843:2: rule__YModel__Group__2__Impl rule__YModel__Group__3
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
    // InternalModel.g:850:1: rule__YModel__Group__2__Impl : ( ( ';' )? ) ;
    public final void rule__YModel__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:854:1: ( ( ( ';' )? ) )
            // InternalModel.g:855:1: ( ( ';' )? )
            {
            // InternalModel.g:855:1: ( ( ';' )? )
            // InternalModel.g:856:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getSemicolonKeyword_2()); 
            }
            // InternalModel.g:857:2: ( ';' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==24) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalModel.g:857:3: ';'
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
    // InternalModel.g:865:1: rule__YModel__Group__3 : rule__YModel__Group__3__Impl rule__YModel__Group__4 ;
    public final void rule__YModel__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:869:1: ( rule__YModel__Group__3__Impl rule__YModel__Group__4 )
            // InternalModel.g:870:2: rule__YModel__Group__3__Impl rule__YModel__Group__4
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
    // InternalModel.g:877:1: rule__YModel__Group__3__Impl : ( ( rule__YModel__ImportsAssignment_3 )* ) ;
    public final void rule__YModel__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:881:1: ( ( ( rule__YModel__ImportsAssignment_3 )* ) )
            // InternalModel.g:882:1: ( ( rule__YModel__ImportsAssignment_3 )* )
            {
            // InternalModel.g:882:1: ( ( rule__YModel__ImportsAssignment_3 )* )
            // InternalModel.g:883:2: ( rule__YModel__ImportsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getImportsAssignment_3()); 
            }
            // InternalModel.g:884:2: ( rule__YModel__ImportsAssignment_3 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==25) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalModel.g:884:3: rule__YModel__ImportsAssignment_3
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
    // InternalModel.g:892:1: rule__YModel__Group__4 : rule__YModel__Group__4__Impl ;
    public final void rule__YModel__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:896:1: ( rule__YModel__Group__4__Impl )
            // InternalModel.g:897:2: rule__YModel__Group__4__Impl
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
    // InternalModel.g:903:1: rule__YModel__Group__4__Impl : ( ( rule__YModel__AnnotationsAssignment_4 )* ) ;
    public final void rule__YModel__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:907:1: ( ( ( rule__YModel__AnnotationsAssignment_4 )* ) )
            // InternalModel.g:908:1: ( ( rule__YModel__AnnotationsAssignment_4 )* )
            {
            // InternalModel.g:908:1: ( ( rule__YModel__AnnotationsAssignment_4 )* )
            // InternalModel.g:909:2: ( rule__YModel__AnnotationsAssignment_4 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYModelAccess().getAnnotationsAssignment_4()); 
            }
            // InternalModel.g:910:2: ( rule__YModel__AnnotationsAssignment_4 )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26||LA9_0==40) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // InternalModel.g:910:3: rule__YModel__AnnotationsAssignment_4
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
    // InternalModel.g:919:1: rule__YImport__Group__0 : rule__YImport__Group__0__Impl rule__YImport__Group__1 ;
    public final void rule__YImport__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:923:1: ( rule__YImport__Group__0__Impl rule__YImport__Group__1 )
            // InternalModel.g:924:2: rule__YImport__Group__0__Impl rule__YImport__Group__1
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
    // InternalModel.g:931:1: rule__YImport__Group__0__Impl : ( 'import' ) ;
    public final void rule__YImport__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:935:1: ( ( 'import' ) )
            // InternalModel.g:936:1: ( 'import' )
            {
            // InternalModel.g:936:1: ( 'import' )
            // InternalModel.g:937:2: 'import'
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
    // InternalModel.g:946:1: rule__YImport__Group__1 : rule__YImport__Group__1__Impl rule__YImport__Group__2 ;
    public final void rule__YImport__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:950:1: ( rule__YImport__Group__1__Impl rule__YImport__Group__2 )
            // InternalModel.g:951:2: rule__YImport__Group__1__Impl rule__YImport__Group__2
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
    // InternalModel.g:958:1: rule__YImport__Group__1__Impl : ( ( rule__YImport__ImportedNamespaceAssignment_1 ) ) ;
    public final void rule__YImport__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:962:1: ( ( ( rule__YImport__ImportedNamespaceAssignment_1 ) ) )
            // InternalModel.g:963:1: ( ( rule__YImport__ImportedNamespaceAssignment_1 ) )
            {
            // InternalModel.g:963:1: ( ( rule__YImport__ImportedNamespaceAssignment_1 ) )
            // InternalModel.g:964:2: ( rule__YImport__ImportedNamespaceAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYImportAccess().getImportedNamespaceAssignment_1()); 
            }
            // InternalModel.g:965:2: ( rule__YImport__ImportedNamespaceAssignment_1 )
            // InternalModel.g:965:3: rule__YImport__ImportedNamespaceAssignment_1
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
    // InternalModel.g:973:1: rule__YImport__Group__2 : rule__YImport__Group__2__Impl ;
    public final void rule__YImport__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:977:1: ( rule__YImport__Group__2__Impl )
            // InternalModel.g:978:2: rule__YImport__Group__2__Impl
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
    // InternalModel.g:984:1: rule__YImport__Group__2__Impl : ( ';' ) ;
    public final void rule__YImport__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:988:1: ( ( ';' ) )
            // InternalModel.g:989:1: ( ';' )
            {
            // InternalModel.g:989:1: ( ';' )
            // InternalModel.g:990:2: ';'
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
    // InternalModel.g:1000:1: rule__YAnnotEntity__Group__0 : rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1 ;
    public final void rule__YAnnotEntity__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1004:1: ( rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1 )
            // InternalModel.g:1005:2: rule__YAnnotEntity__Group__0__Impl rule__YAnnotEntity__Group__1
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
    // InternalModel.g:1012:1: rule__YAnnotEntity__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotEntity__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1016:1: ( ( () ) )
            // InternalModel.g:1017:1: ( () )
            {
            // InternalModel.g:1017:1: ( () )
            // InternalModel.g:1018:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getYAnnotEntityAction_0()); 
            }
            // InternalModel.g:1019:2: ()
            // InternalModel.g:1019:3: 
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
    // InternalModel.g:1027:1: rule__YAnnotEntity__Group__1 : rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2 ;
    public final void rule__YAnnotEntity__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1031:1: ( rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2 )
            // InternalModel.g:1032:2: rule__YAnnotEntity__Group__1__Impl rule__YAnnotEntity__Group__2
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
    // InternalModel.g:1039:1: rule__YAnnotEntity__Group__1__Impl : ( '@entity' ) ;
    public final void rule__YAnnotEntity__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1043:1: ( ( '@entity' ) )
            // InternalModel.g:1044:1: ( '@entity' )
            {
            // InternalModel.g:1044:1: ( '@entity' )
            // InternalModel.g:1045:2: '@entity'
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
    // InternalModel.g:1054:1: rule__YAnnotEntity__Group__2 : rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3 ;
    public final void rule__YAnnotEntity__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1058:1: ( rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3 )
            // InternalModel.g:1059:2: rule__YAnnotEntity__Group__2__Impl rule__YAnnotEntity__Group__3
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
    // InternalModel.g:1066:1: rule__YAnnotEntity__Group__2__Impl : ( ( rule__YAnnotEntity__NameAssignment_2 ) ) ;
    public final void rule__YAnnotEntity__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1070:1: ( ( ( rule__YAnnotEntity__NameAssignment_2 ) ) )
            // InternalModel.g:1071:1: ( ( rule__YAnnotEntity__NameAssignment_2 ) )
            {
            // InternalModel.g:1071:1: ( ( rule__YAnnotEntity__NameAssignment_2 ) )
            // InternalModel.g:1072:2: ( rule__YAnnotEntity__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1073:2: ( rule__YAnnotEntity__NameAssignment_2 )
            // InternalModel.g:1073:3: rule__YAnnotEntity__NameAssignment_2
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
    // InternalModel.g:1081:1: rule__YAnnotEntity__Group__3 : rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4 ;
    public final void rule__YAnnotEntity__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1085:1: ( rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4 )
            // InternalModel.g:1086:2: rule__YAnnotEntity__Group__3__Impl rule__YAnnotEntity__Group__4
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
    // InternalModel.g:1093:1: rule__YAnnotEntity__Group__3__Impl : ( ( rule__YAnnotEntity__Group_3__0 )? ) ;
    public final void rule__YAnnotEntity__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1097:1: ( ( ( rule__YAnnotEntity__Group_3__0 )? ) )
            // InternalModel.g:1098:1: ( ( rule__YAnnotEntity__Group_3__0 )? )
            {
            // InternalModel.g:1098:1: ( ( rule__YAnnotEntity__Group_3__0 )? )
            // InternalModel.g:1099:2: ( rule__YAnnotEntity__Group_3__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3()); 
            }
            // InternalModel.g:1100:2: ( rule__YAnnotEntity__Group_3__0 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==29) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalModel.g:1100:3: rule__YAnnotEntity__Group_3__0
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
    // InternalModel.g:1108:1: rule__YAnnotEntity__Group__4 : rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5 ;
    public final void rule__YAnnotEntity__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1112:1: ( rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5 )
            // InternalModel.g:1113:2: rule__YAnnotEntity__Group__4__Impl rule__YAnnotEntity__Group__5
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
    // InternalModel.g:1120:1: rule__YAnnotEntity__Group__4__Impl : ( '{' ) ;
    public final void rule__YAnnotEntity__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1124:1: ( ( '{' ) )
            // InternalModel.g:1125:1: ( '{' )
            {
            // InternalModel.g:1125:1: ( '{' )
            // InternalModel.g:1126:2: '{'
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
    // InternalModel.g:1135:1: rule__YAnnotEntity__Group__5 : rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6 ;
    public final void rule__YAnnotEntity__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1139:1: ( rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6 )
            // InternalModel.g:1140:2: rule__YAnnotEntity__Group__5__Impl rule__YAnnotEntity__Group__6
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
    // InternalModel.g:1147:1: rule__YAnnotEntity__Group__5__Impl : ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* ) ;
    public final void rule__YAnnotEntity__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1151:1: ( ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* ) )
            // InternalModel.g:1152:1: ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* )
            {
            // InternalModel.g:1152:1: ( ( rule__YAnnotEntity__AnnotationsAssignment_5 )* )
            // InternalModel.g:1153:2: ( rule__YAnnotEntity__AnnotationsAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getAnnotationsAssignment_5()); 
            }
            // InternalModel.g:1154:2: ( rule__YAnnotEntity__AnnotationsAssignment_5 )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>=32 && LA11_0<=33)||LA11_0==36) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalModel.g:1154:3: rule__YAnnotEntity__AnnotationsAssignment_5
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
    // InternalModel.g:1162:1: rule__YAnnotEntity__Group__6 : rule__YAnnotEntity__Group__6__Impl ;
    public final void rule__YAnnotEntity__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1166:1: ( rule__YAnnotEntity__Group__6__Impl )
            // InternalModel.g:1167:2: rule__YAnnotEntity__Group__6__Impl
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
    // InternalModel.g:1173:1: rule__YAnnotEntity__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotEntity__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1177:1: ( ( '}' ) )
            // InternalModel.g:1178:1: ( '}' )
            {
            // InternalModel.g:1178:1: ( '}' )
            // InternalModel.g:1179:2: '}'
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
    // InternalModel.g:1189:1: rule__YAnnotEntity__Group_3__0 : rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1 ;
    public final void rule__YAnnotEntity__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1193:1: ( rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1 )
            // InternalModel.g:1194:2: rule__YAnnotEntity__Group_3__0__Impl rule__YAnnotEntity__Group_3__1
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
    // InternalModel.g:1201:1: rule__YAnnotEntity__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotEntity__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1205:1: ( ( ( '(' ) ) )
            // InternalModel.g:1206:1: ( ( '(' ) )
            {
            // InternalModel.g:1206:1: ( ( '(' ) )
            // InternalModel.g:1207:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // InternalModel.g:1208:2: ( '(' )
            // InternalModel.g:1208:3: '('
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
    // InternalModel.g:1216:1: rule__YAnnotEntity__Group_3__1 : rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2 ;
    public final void rule__YAnnotEntity__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1220:1: ( rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2 )
            // InternalModel.g:1221:2: rule__YAnnotEntity__Group_3__1__Impl rule__YAnnotEntity__Group_3__2
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
    // InternalModel.g:1228:1: rule__YAnnotEntity__Group_3__1__Impl : ( ( rule__YAnnotEntity__Group_3_1__0 )? ) ;
    public final void rule__YAnnotEntity__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1232:1: ( ( ( rule__YAnnotEntity__Group_3_1__0 )? ) )
            // InternalModel.g:1233:1: ( ( rule__YAnnotEntity__Group_3_1__0 )? )
            {
            // InternalModel.g:1233:1: ( ( rule__YAnnotEntity__Group_3_1__0 )? )
            // InternalModel.g:1234:2: ( rule__YAnnotEntity__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3_1()); 
            }
            // InternalModel.g:1235:2: ( rule__YAnnotEntity__Group_3_1__0 )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==RULE_ID) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalModel.g:1235:3: rule__YAnnotEntity__Group_3_1__0
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
    // InternalModel.g:1243:1: rule__YAnnotEntity__Group_3__2 : rule__YAnnotEntity__Group_3__2__Impl ;
    public final void rule__YAnnotEntity__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1247:1: ( rule__YAnnotEntity__Group_3__2__Impl )
            // InternalModel.g:1248:2: rule__YAnnotEntity__Group_3__2__Impl
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
    // InternalModel.g:1254:1: rule__YAnnotEntity__Group_3__2__Impl : ( ')' ) ;
    public final void rule__YAnnotEntity__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1258:1: ( ( ')' ) )
            // InternalModel.g:1259:1: ( ')' )
            {
            // InternalModel.g:1259:1: ( ')' )
            // InternalModel.g:1260:2: ')'
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
    // InternalModel.g:1270:1: rule__YAnnotEntity__Group_3_1__0 : rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1 ;
    public final void rule__YAnnotEntity__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1274:1: ( rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1 )
            // InternalModel.g:1275:2: rule__YAnnotEntity__Group_3_1__0__Impl rule__YAnnotEntity__Group_3_1__1
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
    // InternalModel.g:1282:1: rule__YAnnotEntity__Group_3_1__0__Impl : ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) ) ;
    public final void rule__YAnnotEntity__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1286:1: ( ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) ) )
            // InternalModel.g:1287:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) )
            {
            // InternalModel.g:1287:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 ) )
            // InternalModel.g:1288:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_0()); 
            }
            // InternalModel.g:1289:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 )
            // InternalModel.g:1289:3: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0
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
    // InternalModel.g:1297:1: rule__YAnnotEntity__Group_3_1__1 : rule__YAnnotEntity__Group_3_1__1__Impl ;
    public final void rule__YAnnotEntity__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1301:1: ( rule__YAnnotEntity__Group_3_1__1__Impl )
            // InternalModel.g:1302:2: rule__YAnnotEntity__Group_3_1__1__Impl
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
    // InternalModel.g:1308:1: rule__YAnnotEntity__Group_3_1__1__Impl : ( ( rule__YAnnotEntity__Group_3_1_1__0 )* ) ;
    public final void rule__YAnnotEntity__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1312:1: ( ( ( rule__YAnnotEntity__Group_3_1_1__0 )* ) )
            // InternalModel.g:1313:1: ( ( rule__YAnnotEntity__Group_3_1_1__0 )* )
            {
            // InternalModel.g:1313:1: ( ( rule__YAnnotEntity__Group_3_1_1__0 )* )
            // InternalModel.g:1314:2: ( rule__YAnnotEntity__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getGroup_3_1_1()); 
            }
            // InternalModel.g:1315:2: ( rule__YAnnotEntity__Group_3_1_1__0 )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==31) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalModel.g:1315:3: rule__YAnnotEntity__Group_3_1_1__0
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
    // InternalModel.g:1324:1: rule__YAnnotEntity__Group_3_1_1__0 : rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1 ;
    public final void rule__YAnnotEntity__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1328:1: ( rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1 )
            // InternalModel.g:1329:2: rule__YAnnotEntity__Group_3_1_1__0__Impl rule__YAnnotEntity__Group_3_1_1__1
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
    // InternalModel.g:1336:1: rule__YAnnotEntity__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotEntity__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1340:1: ( ( ',' ) )
            // InternalModel.g:1341:1: ( ',' )
            {
            // InternalModel.g:1341:1: ( ',' )
            // InternalModel.g:1342:2: ','
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
    // InternalModel.g:1351:1: rule__YAnnotEntity__Group_3_1_1__1 : rule__YAnnotEntity__Group_3_1_1__1__Impl ;
    public final void rule__YAnnotEntity__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1355:1: ( rule__YAnnotEntity__Group_3_1_1__1__Impl )
            // InternalModel.g:1356:2: rule__YAnnotEntity__Group_3_1_1__1__Impl
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
    // InternalModel.g:1362:1: rule__YAnnotEntity__Group_3_1_1__1__Impl : ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) ) ;
    public final void rule__YAnnotEntity__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1366:1: ( ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) ) )
            // InternalModel.g:1367:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) )
            {
            // InternalModel.g:1367:1: ( ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 ) )
            // InternalModel.g:1368:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotEntityAccess().getElementValuePairsAssignment_3_1_1_1()); 
            }
            // InternalModel.g:1369:2: ( rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 )
            // InternalModel.g:1369:3: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1
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
    // InternalModel.g:1378:1: rule__YAnnotAttribute__Group__0 : rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1 ;
    public final void rule__YAnnotAttribute__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1382:1: ( rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1 )
            // InternalModel.g:1383:2: rule__YAnnotAttribute__Group__0__Impl rule__YAnnotAttribute__Group__1
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
    // InternalModel.g:1390:1: rule__YAnnotAttribute__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotAttribute__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1394:1: ( ( () ) )
            // InternalModel.g:1395:1: ( () )
            {
            // InternalModel.g:1395:1: ( () )
            // InternalModel.g:1396:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getYAnnotAttributeAction_0()); 
            }
            // InternalModel.g:1397:2: ()
            // InternalModel.g:1397:3: 
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
    // InternalModel.g:1405:1: rule__YAnnotAttribute__Group__1 : rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2 ;
    public final void rule__YAnnotAttribute__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1409:1: ( rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2 )
            // InternalModel.g:1410:2: rule__YAnnotAttribute__Group__1__Impl rule__YAnnotAttribute__Group__2
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
    // InternalModel.g:1417:1: rule__YAnnotAttribute__Group__1__Impl : ( '@attribute' ) ;
    public final void rule__YAnnotAttribute__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1421:1: ( ( '@attribute' ) )
            // InternalModel.g:1422:1: ( '@attribute' )
            {
            // InternalModel.g:1422:1: ( '@attribute' )
            // InternalModel.g:1423:2: '@attribute'
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
    // InternalModel.g:1432:1: rule__YAnnotAttribute__Group__2 : rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3 ;
    public final void rule__YAnnotAttribute__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1436:1: ( rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3 )
            // InternalModel.g:1437:2: rule__YAnnotAttribute__Group__2__Impl rule__YAnnotAttribute__Group__3
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
    // InternalModel.g:1444:1: rule__YAnnotAttribute__Group__2__Impl : ( ( rule__YAnnotAttribute__NameAssignment_2 ) ) ;
    public final void rule__YAnnotAttribute__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1448:1: ( ( ( rule__YAnnotAttribute__NameAssignment_2 ) ) )
            // InternalModel.g:1449:1: ( ( rule__YAnnotAttribute__NameAssignment_2 ) )
            {
            // InternalModel.g:1449:1: ( ( rule__YAnnotAttribute__NameAssignment_2 ) )
            // InternalModel.g:1450:2: ( rule__YAnnotAttribute__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1451:2: ( rule__YAnnotAttribute__NameAssignment_2 )
            // InternalModel.g:1451:3: rule__YAnnotAttribute__NameAssignment_2
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
    // InternalModel.g:1459:1: rule__YAnnotAttribute__Group__3 : rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4 ;
    public final void rule__YAnnotAttribute__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1463:1: ( rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4 )
            // InternalModel.g:1464:2: rule__YAnnotAttribute__Group__3__Impl rule__YAnnotAttribute__Group__4
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
    // InternalModel.g:1471:1: rule__YAnnotAttribute__Group__3__Impl : ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? ) ;
    public final void rule__YAnnotAttribute__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1475:1: ( ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? ) )
            // InternalModel.g:1476:1: ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? )
            {
            // InternalModel.g:1476:1: ( ( rule__YAnnotAttribute__OptionalAssignment_3 )? )
            // InternalModel.g:1477:2: ( rule__YAnnotAttribute__OptionalAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalAssignment_3()); 
            }
            // InternalModel.g:1478:2: ( rule__YAnnotAttribute__OptionalAssignment_3 )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==48) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalModel.g:1478:3: rule__YAnnotAttribute__OptionalAssignment_3
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
    // InternalModel.g:1486:1: rule__YAnnotAttribute__Group__4 : rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5 ;
    public final void rule__YAnnotAttribute__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1490:1: ( rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5 )
            // InternalModel.g:1491:2: rule__YAnnotAttribute__Group__4__Impl rule__YAnnotAttribute__Group__5
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
    // InternalModel.g:1498:1: rule__YAnnotAttribute__Group__4__Impl : ( ( rule__YAnnotAttribute__Group_4__0 )? ) ;
    public final void rule__YAnnotAttribute__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1502:1: ( ( ( rule__YAnnotAttribute__Group_4__0 )? ) )
            // InternalModel.g:1503:1: ( ( rule__YAnnotAttribute__Group_4__0 )? )
            {
            // InternalModel.g:1503:1: ( ( rule__YAnnotAttribute__Group_4__0 )? )
            // InternalModel.g:1504:2: ( rule__YAnnotAttribute__Group_4__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4()); 
            }
            // InternalModel.g:1505:2: ( rule__YAnnotAttribute__Group_4__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==29) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalModel.g:1505:3: rule__YAnnotAttribute__Group_4__0
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
    // InternalModel.g:1513:1: rule__YAnnotAttribute__Group__5 : rule__YAnnotAttribute__Group__5__Impl ;
    public final void rule__YAnnotAttribute__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1517:1: ( rule__YAnnotAttribute__Group__5__Impl )
            // InternalModel.g:1518:2: rule__YAnnotAttribute__Group__5__Impl
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
    // InternalModel.g:1524:1: rule__YAnnotAttribute__Group__5__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotAttribute__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1528:1: ( ( ( ';' )? ) )
            // InternalModel.g:1529:1: ( ( ';' )? )
            {
            // InternalModel.g:1529:1: ( ( ';' )? )
            // InternalModel.g:1530:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getSemicolonKeyword_5()); 
            }
            // InternalModel.g:1531:2: ( ';' )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==24) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // InternalModel.g:1531:3: ';'
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
    // InternalModel.g:1540:1: rule__YAnnotAttribute__Group_4__0 : rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1 ;
    public final void rule__YAnnotAttribute__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1544:1: ( rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1 )
            // InternalModel.g:1545:2: rule__YAnnotAttribute__Group_4__0__Impl rule__YAnnotAttribute__Group_4__1
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
    // InternalModel.g:1552:1: rule__YAnnotAttribute__Group_4__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotAttribute__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1556:1: ( ( ( '(' ) ) )
            // InternalModel.g:1557:1: ( ( '(' ) )
            {
            // InternalModel.g:1557:1: ( ( '(' ) )
            // InternalModel.g:1558:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getLeftParenthesisKeyword_4_0()); 
            }
            // InternalModel.g:1559:2: ( '(' )
            // InternalModel.g:1559:3: '('
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
    // InternalModel.g:1567:1: rule__YAnnotAttribute__Group_4__1 : rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2 ;
    public final void rule__YAnnotAttribute__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1571:1: ( rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2 )
            // InternalModel.g:1572:2: rule__YAnnotAttribute__Group_4__1__Impl rule__YAnnotAttribute__Group_4__2
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
    // InternalModel.g:1579:1: rule__YAnnotAttribute__Group_4__1__Impl : ( ( rule__YAnnotAttribute__Group_4_1__0 )? ) ;
    public final void rule__YAnnotAttribute__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1583:1: ( ( ( rule__YAnnotAttribute__Group_4_1__0 )? ) )
            // InternalModel.g:1584:1: ( ( rule__YAnnotAttribute__Group_4_1__0 )? )
            {
            // InternalModel.g:1584:1: ( ( rule__YAnnotAttribute__Group_4_1__0 )? )
            // InternalModel.g:1585:2: ( rule__YAnnotAttribute__Group_4_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1()); 
            }
            // InternalModel.g:1586:2: ( rule__YAnnotAttribute__Group_4_1__0 )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==RULE_ID) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalModel.g:1586:3: rule__YAnnotAttribute__Group_4_1__0
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
    // InternalModel.g:1594:1: rule__YAnnotAttribute__Group_4__2 : rule__YAnnotAttribute__Group_4__2__Impl ;
    public final void rule__YAnnotAttribute__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1598:1: ( rule__YAnnotAttribute__Group_4__2__Impl )
            // InternalModel.g:1599:2: rule__YAnnotAttribute__Group_4__2__Impl
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
    // InternalModel.g:1605:1: rule__YAnnotAttribute__Group_4__2__Impl : ( ')' ) ;
    public final void rule__YAnnotAttribute__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1609:1: ( ( ')' ) )
            // InternalModel.g:1610:1: ( ')' )
            {
            // InternalModel.g:1610:1: ( ')' )
            // InternalModel.g:1611:2: ')'
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
    // InternalModel.g:1621:1: rule__YAnnotAttribute__Group_4_1__0 : rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1 ;
    public final void rule__YAnnotAttribute__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1625:1: ( rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1 )
            // InternalModel.g:1626:2: rule__YAnnotAttribute__Group_4_1__0__Impl rule__YAnnotAttribute__Group_4_1__1
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
    // InternalModel.g:1633:1: rule__YAnnotAttribute__Group_4_1__0__Impl : ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) ) ;
    public final void rule__YAnnotAttribute__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1637:1: ( ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) ) )
            // InternalModel.g:1638:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) )
            {
            // InternalModel.g:1638:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 ) )
            // InternalModel.g:1639:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_0()); 
            }
            // InternalModel.g:1640:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 )
            // InternalModel.g:1640:3: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0
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
    // InternalModel.g:1648:1: rule__YAnnotAttribute__Group_4_1__1 : rule__YAnnotAttribute__Group_4_1__1__Impl ;
    public final void rule__YAnnotAttribute__Group_4_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1652:1: ( rule__YAnnotAttribute__Group_4_1__1__Impl )
            // InternalModel.g:1653:2: rule__YAnnotAttribute__Group_4_1__1__Impl
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
    // InternalModel.g:1659:1: rule__YAnnotAttribute__Group_4_1__1__Impl : ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* ) ;
    public final void rule__YAnnotAttribute__Group_4_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1663:1: ( ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* ) )
            // InternalModel.g:1664:1: ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* )
            {
            // InternalModel.g:1664:1: ( ( rule__YAnnotAttribute__Group_4_1_1__0 )* )
            // InternalModel.g:1665:2: ( rule__YAnnotAttribute__Group_4_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getGroup_4_1_1()); 
            }
            // InternalModel.g:1666:2: ( rule__YAnnotAttribute__Group_4_1_1__0 )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==31) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // InternalModel.g:1666:3: rule__YAnnotAttribute__Group_4_1_1__0
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
    // InternalModel.g:1675:1: rule__YAnnotAttribute__Group_4_1_1__0 : rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1 ;
    public final void rule__YAnnotAttribute__Group_4_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1679:1: ( rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1 )
            // InternalModel.g:1680:2: rule__YAnnotAttribute__Group_4_1_1__0__Impl rule__YAnnotAttribute__Group_4_1_1__1
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
    // InternalModel.g:1687:1: rule__YAnnotAttribute__Group_4_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotAttribute__Group_4_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1691:1: ( ( ',' ) )
            // InternalModel.g:1692:1: ( ',' )
            {
            // InternalModel.g:1692:1: ( ',' )
            // InternalModel.g:1693:2: ','
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
    // InternalModel.g:1702:1: rule__YAnnotAttribute__Group_4_1_1__1 : rule__YAnnotAttribute__Group_4_1_1__1__Impl ;
    public final void rule__YAnnotAttribute__Group_4_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1706:1: ( rule__YAnnotAttribute__Group_4_1_1__1__Impl )
            // InternalModel.g:1707:2: rule__YAnnotAttribute__Group_4_1_1__1__Impl
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
    // InternalModel.g:1713:1: rule__YAnnotAttribute__Group_4_1_1__1__Impl : ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) ) ;
    public final void rule__YAnnotAttribute__Group_4_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1717:1: ( ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) ) )
            // InternalModel.g:1718:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) )
            {
            // InternalModel.g:1718:1: ( ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 ) )
            // InternalModel.g:1719:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getElementValuePairsAssignment_4_1_1_1()); 
            }
            // InternalModel.g:1720:2: ( rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 )
            // InternalModel.g:1720:3: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1
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
    // InternalModel.g:1729:1: rule__YAnnotRelationship__Group__0 : rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1 ;
    public final void rule__YAnnotRelationship__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1733:1: ( rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1 )
            // InternalModel.g:1734:2: rule__YAnnotRelationship__Group__0__Impl rule__YAnnotRelationship__Group__1
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
    // InternalModel.g:1741:1: rule__YAnnotRelationship__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotRelationship__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1745:1: ( ( () ) )
            // InternalModel.g:1746:1: ( () )
            {
            // InternalModel.g:1746:1: ( () )
            // InternalModel.g:1747:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getYAnnotRelationshipAction_0()); 
            }
            // InternalModel.g:1748:2: ()
            // InternalModel.g:1748:3: 
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
    // InternalModel.g:1756:1: rule__YAnnotRelationship__Group__1 : rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2 ;
    public final void rule__YAnnotRelationship__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1760:1: ( rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2 )
            // InternalModel.g:1761:2: rule__YAnnotRelationship__Group__1__Impl rule__YAnnotRelationship__Group__2
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
    // InternalModel.g:1768:1: rule__YAnnotRelationship__Group__1__Impl : ( '@relationship' ) ;
    public final void rule__YAnnotRelationship__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1772:1: ( ( '@relationship' ) )
            // InternalModel.g:1773:1: ( '@relationship' )
            {
            // InternalModel.g:1773:1: ( '@relationship' )
            // InternalModel.g:1774:2: '@relationship'
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
    // InternalModel.g:1783:1: rule__YAnnotRelationship__Group__2 : rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3 ;
    public final void rule__YAnnotRelationship__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1787:1: ( rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3 )
            // InternalModel.g:1788:2: rule__YAnnotRelationship__Group__2__Impl rule__YAnnotRelationship__Group__3
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
    // InternalModel.g:1795:1: rule__YAnnotRelationship__Group__2__Impl : ( ( rule__YAnnotRelationship__NameAssignment_2 ) ) ;
    public final void rule__YAnnotRelationship__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1799:1: ( ( ( rule__YAnnotRelationship__NameAssignment_2 ) ) )
            // InternalModel.g:1800:1: ( ( rule__YAnnotRelationship__NameAssignment_2 ) )
            {
            // InternalModel.g:1800:1: ( ( rule__YAnnotRelationship__NameAssignment_2 ) )
            // InternalModel.g:1801:2: ( rule__YAnnotRelationship__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:1802:2: ( rule__YAnnotRelationship__NameAssignment_2 )
            // InternalModel.g:1802:3: rule__YAnnotRelationship__NameAssignment_2
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
    // InternalModel.g:1810:1: rule__YAnnotRelationship__Group__3 : rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4 ;
    public final void rule__YAnnotRelationship__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1814:1: ( rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4 )
            // InternalModel.g:1815:2: rule__YAnnotRelationship__Group__3__Impl rule__YAnnotRelationship__Group__4
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
    // InternalModel.g:1822:1: rule__YAnnotRelationship__Group__3__Impl : ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? ) ;
    public final void rule__YAnnotRelationship__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1826:1: ( ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? ) )
            // InternalModel.g:1827:1: ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? )
            {
            // InternalModel.g:1827:1: ( ( rule__YAnnotRelationship__OptionalAssignment_3 )? )
            // InternalModel.g:1828:2: ( rule__YAnnotRelationship__OptionalAssignment_3 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalAssignment_3()); 
            }
            // InternalModel.g:1829:2: ( rule__YAnnotRelationship__OptionalAssignment_3 )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==48) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // InternalModel.g:1829:3: rule__YAnnotRelationship__OptionalAssignment_3
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
    // InternalModel.g:1837:1: rule__YAnnotRelationship__Group__4 : rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5 ;
    public final void rule__YAnnotRelationship__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1841:1: ( rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5 )
            // InternalModel.g:1842:2: rule__YAnnotRelationship__Group__4__Impl rule__YAnnotRelationship__Group__5
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
    // InternalModel.g:1849:1: rule__YAnnotRelationship__Group__4__Impl : ( '->' ) ;
    public final void rule__YAnnotRelationship__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1853:1: ( ( '->' ) )
            // InternalModel.g:1854:1: ( '->' )
            {
            // InternalModel.g:1854:1: ( '->' )
            // InternalModel.g:1855:2: '->'
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
    // InternalModel.g:1864:1: rule__YAnnotRelationship__Group__5 : rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6 ;
    public final void rule__YAnnotRelationship__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1868:1: ( rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6 )
            // InternalModel.g:1869:2: rule__YAnnotRelationship__Group__5__Impl rule__YAnnotRelationship__Group__6
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
    // InternalModel.g:1876:1: rule__YAnnotRelationship__Group__5__Impl : ( ( rule__YAnnotRelationship__TargetAssignment_5 ) ) ;
    public final void rule__YAnnotRelationship__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1880:1: ( ( ( rule__YAnnotRelationship__TargetAssignment_5 ) ) )
            // InternalModel.g:1881:1: ( ( rule__YAnnotRelationship__TargetAssignment_5 ) )
            {
            // InternalModel.g:1881:1: ( ( rule__YAnnotRelationship__TargetAssignment_5 ) )
            // InternalModel.g:1882:2: ( rule__YAnnotRelationship__TargetAssignment_5 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getTargetAssignment_5()); 
            }
            // InternalModel.g:1883:2: ( rule__YAnnotRelationship__TargetAssignment_5 )
            // InternalModel.g:1883:3: rule__YAnnotRelationship__TargetAssignment_5
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
    // InternalModel.g:1891:1: rule__YAnnotRelationship__Group__6 : rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7 ;
    public final void rule__YAnnotRelationship__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1895:1: ( rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7 )
            // InternalModel.g:1896:2: rule__YAnnotRelationship__Group__6__Impl rule__YAnnotRelationship__Group__7
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
    // InternalModel.g:1903:1: rule__YAnnotRelationship__Group__6__Impl : ( ( rule__YAnnotRelationship__ManyAssignment_6 )? ) ;
    public final void rule__YAnnotRelationship__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1907:1: ( ( ( rule__YAnnotRelationship__ManyAssignment_6 )? ) )
            // InternalModel.g:1908:1: ( ( rule__YAnnotRelationship__ManyAssignment_6 )? )
            {
            // InternalModel.g:1908:1: ( ( rule__YAnnotRelationship__ManyAssignment_6 )? )
            // InternalModel.g:1909:2: ( rule__YAnnotRelationship__ManyAssignment_6 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAssignment_6()); 
            }
            // InternalModel.g:1910:2: ( rule__YAnnotRelationship__ManyAssignment_6 )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==49) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // InternalModel.g:1910:3: rule__YAnnotRelationship__ManyAssignment_6
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
    // InternalModel.g:1918:1: rule__YAnnotRelationship__Group__7 : rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8 ;
    public final void rule__YAnnotRelationship__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1922:1: ( rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8 )
            // InternalModel.g:1923:2: rule__YAnnotRelationship__Group__7__Impl rule__YAnnotRelationship__Group__8
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
    // InternalModel.g:1930:1: rule__YAnnotRelationship__Group__7__Impl : ( ( rule__YAnnotRelationship__Group_7__0 )? ) ;
    public final void rule__YAnnotRelationship__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1934:1: ( ( ( rule__YAnnotRelationship__Group_7__0 )? ) )
            // InternalModel.g:1935:1: ( ( rule__YAnnotRelationship__Group_7__0 )? )
            {
            // InternalModel.g:1935:1: ( ( rule__YAnnotRelationship__Group_7__0 )? )
            // InternalModel.g:1936:2: ( rule__YAnnotRelationship__Group_7__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7()); 
            }
            // InternalModel.g:1937:2: ( rule__YAnnotRelationship__Group_7__0 )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==29) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // InternalModel.g:1937:3: rule__YAnnotRelationship__Group_7__0
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
    // InternalModel.g:1945:1: rule__YAnnotRelationship__Group__8 : rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9 ;
    public final void rule__YAnnotRelationship__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1949:1: ( rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9 )
            // InternalModel.g:1950:2: rule__YAnnotRelationship__Group__8__Impl rule__YAnnotRelationship__Group__9
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
    // InternalModel.g:1957:1: rule__YAnnotRelationship__Group__8__Impl : ( ( rule__YAnnotRelationship__Group_8__0 )? ) ;
    public final void rule__YAnnotRelationship__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1961:1: ( ( ( rule__YAnnotRelationship__Group_8__0 )? ) )
            // InternalModel.g:1962:1: ( ( rule__YAnnotRelationship__Group_8__0 )? )
            {
            // InternalModel.g:1962:1: ( ( rule__YAnnotRelationship__Group_8__0 )? )
            // InternalModel.g:1963:2: ( rule__YAnnotRelationship__Group_8__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_8()); 
            }
            // InternalModel.g:1964:2: ( rule__YAnnotRelationship__Group_8__0 )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==35) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // InternalModel.g:1964:3: rule__YAnnotRelationship__Group_8__0
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
    // InternalModel.g:1972:1: rule__YAnnotRelationship__Group__9 : rule__YAnnotRelationship__Group__9__Impl ;
    public final void rule__YAnnotRelationship__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1976:1: ( rule__YAnnotRelationship__Group__9__Impl )
            // InternalModel.g:1977:2: rule__YAnnotRelationship__Group__9__Impl
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
    // InternalModel.g:1983:1: rule__YAnnotRelationship__Group__9__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotRelationship__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:1987:1: ( ( ( ';' )? ) )
            // InternalModel.g:1988:1: ( ( ';' )? )
            {
            // InternalModel.g:1988:1: ( ( ';' )? )
            // InternalModel.g:1989:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getSemicolonKeyword_9()); 
            }
            // InternalModel.g:1990:2: ( ';' )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==24) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // InternalModel.g:1990:3: ';'
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
    // InternalModel.g:1999:1: rule__YAnnotRelationship__Group_7__0 : rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1 ;
    public final void rule__YAnnotRelationship__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2003:1: ( rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1 )
            // InternalModel.g:2004:2: rule__YAnnotRelationship__Group_7__0__Impl rule__YAnnotRelationship__Group_7__1
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
    // InternalModel.g:2011:1: rule__YAnnotRelationship__Group_7__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotRelationship__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2015:1: ( ( ( '(' ) ) )
            // InternalModel.g:2016:1: ( ( '(' ) )
            {
            // InternalModel.g:2016:1: ( ( '(' ) )
            // InternalModel.g:2017:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getLeftParenthesisKeyword_7_0()); 
            }
            // InternalModel.g:2018:2: ( '(' )
            // InternalModel.g:2018:3: '('
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
    // InternalModel.g:2026:1: rule__YAnnotRelationship__Group_7__1 : rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2 ;
    public final void rule__YAnnotRelationship__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2030:1: ( rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2 )
            // InternalModel.g:2031:2: rule__YAnnotRelationship__Group_7__1__Impl rule__YAnnotRelationship__Group_7__2
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
    // InternalModel.g:2038:1: rule__YAnnotRelationship__Group_7__1__Impl : ( ( rule__YAnnotRelationship__Group_7_1__0 )? ) ;
    public final void rule__YAnnotRelationship__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2042:1: ( ( ( rule__YAnnotRelationship__Group_7_1__0 )? ) )
            // InternalModel.g:2043:1: ( ( rule__YAnnotRelationship__Group_7_1__0 )? )
            {
            // InternalModel.g:2043:1: ( ( rule__YAnnotRelationship__Group_7_1__0 )? )
            // InternalModel.g:2044:2: ( rule__YAnnotRelationship__Group_7_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1()); 
            }
            // InternalModel.g:2045:2: ( rule__YAnnotRelationship__Group_7_1__0 )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==RULE_ID) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // InternalModel.g:2045:3: rule__YAnnotRelationship__Group_7_1__0
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
    // InternalModel.g:2053:1: rule__YAnnotRelationship__Group_7__2 : rule__YAnnotRelationship__Group_7__2__Impl ;
    public final void rule__YAnnotRelationship__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2057:1: ( rule__YAnnotRelationship__Group_7__2__Impl )
            // InternalModel.g:2058:2: rule__YAnnotRelationship__Group_7__2__Impl
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
    // InternalModel.g:2064:1: rule__YAnnotRelationship__Group_7__2__Impl : ( ')' ) ;
    public final void rule__YAnnotRelationship__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2068:1: ( ( ')' ) )
            // InternalModel.g:2069:1: ( ')' )
            {
            // InternalModel.g:2069:1: ( ')' )
            // InternalModel.g:2070:2: ')'
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
    // InternalModel.g:2080:1: rule__YAnnotRelationship__Group_7_1__0 : rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1 ;
    public final void rule__YAnnotRelationship__Group_7_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2084:1: ( rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1 )
            // InternalModel.g:2085:2: rule__YAnnotRelationship__Group_7_1__0__Impl rule__YAnnotRelationship__Group_7_1__1
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
    // InternalModel.g:2092:1: rule__YAnnotRelationship__Group_7_1__0__Impl : ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) ) ;
    public final void rule__YAnnotRelationship__Group_7_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2096:1: ( ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) ) )
            // InternalModel.g:2097:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) )
            {
            // InternalModel.g:2097:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 ) )
            // InternalModel.g:2098:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_0()); 
            }
            // InternalModel.g:2099:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 )
            // InternalModel.g:2099:3: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0
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
    // InternalModel.g:2107:1: rule__YAnnotRelationship__Group_7_1__1 : rule__YAnnotRelationship__Group_7_1__1__Impl ;
    public final void rule__YAnnotRelationship__Group_7_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2111:1: ( rule__YAnnotRelationship__Group_7_1__1__Impl )
            // InternalModel.g:2112:2: rule__YAnnotRelationship__Group_7_1__1__Impl
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
    // InternalModel.g:2118:1: rule__YAnnotRelationship__Group_7_1__1__Impl : ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* ) ;
    public final void rule__YAnnotRelationship__Group_7_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2122:1: ( ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* ) )
            // InternalModel.g:2123:1: ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* )
            {
            // InternalModel.g:2123:1: ( ( rule__YAnnotRelationship__Group_7_1_1__0 )* )
            // InternalModel.g:2124:2: ( rule__YAnnotRelationship__Group_7_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getGroup_7_1_1()); 
            }
            // InternalModel.g:2125:2: ( rule__YAnnotRelationship__Group_7_1_1__0 )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==31) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // InternalModel.g:2125:3: rule__YAnnotRelationship__Group_7_1_1__0
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
    // InternalModel.g:2134:1: rule__YAnnotRelationship__Group_7_1_1__0 : rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1 ;
    public final void rule__YAnnotRelationship__Group_7_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2138:1: ( rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1 )
            // InternalModel.g:2139:2: rule__YAnnotRelationship__Group_7_1_1__0__Impl rule__YAnnotRelationship__Group_7_1_1__1
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
    // InternalModel.g:2146:1: rule__YAnnotRelationship__Group_7_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotRelationship__Group_7_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2150:1: ( ( ',' ) )
            // InternalModel.g:2151:1: ( ',' )
            {
            // InternalModel.g:2151:1: ( ',' )
            // InternalModel.g:2152:2: ','
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
    // InternalModel.g:2161:1: rule__YAnnotRelationship__Group_7_1_1__1 : rule__YAnnotRelationship__Group_7_1_1__1__Impl ;
    public final void rule__YAnnotRelationship__Group_7_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2165:1: ( rule__YAnnotRelationship__Group_7_1_1__1__Impl )
            // InternalModel.g:2166:2: rule__YAnnotRelationship__Group_7_1_1__1__Impl
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
    // InternalModel.g:2172:1: rule__YAnnotRelationship__Group_7_1_1__1__Impl : ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) ) ;
    public final void rule__YAnnotRelationship__Group_7_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2176:1: ( ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) ) )
            // InternalModel.g:2177:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) )
            {
            // InternalModel.g:2177:1: ( ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 ) )
            // InternalModel.g:2178:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getElementValuePairsAssignment_7_1_1_1()); 
            }
            // InternalModel.g:2179:2: ( rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 )
            // InternalModel.g:2179:3: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1
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
    // InternalModel.g:2188:1: rule__YAnnotRelationship__Group_8__0 : rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1 ;
    public final void rule__YAnnotRelationship__Group_8__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2192:1: ( rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1 )
            // InternalModel.g:2193:2: rule__YAnnotRelationship__Group_8__0__Impl rule__YAnnotRelationship__Group_8__1
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
    // InternalModel.g:2200:1: rule__YAnnotRelationship__Group_8__0__Impl : ( '<-' ) ;
    public final void rule__YAnnotRelationship__Group_8__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2204:1: ( ( '<-' ) )
            // InternalModel.g:2205:1: ( '<-' )
            {
            // InternalModel.g:2205:1: ( '<-' )
            // InternalModel.g:2206:2: '<-'
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
    // InternalModel.g:2215:1: rule__YAnnotRelationship__Group_8__1 : rule__YAnnotRelationship__Group_8__1__Impl ;
    public final void rule__YAnnotRelationship__Group_8__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2219:1: ( rule__YAnnotRelationship__Group_8__1__Impl )
            // InternalModel.g:2220:2: rule__YAnnotRelationship__Group_8__1__Impl
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
    // InternalModel.g:2226:1: rule__YAnnotRelationship__Group_8__1__Impl : ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) ) ;
    public final void rule__YAnnotRelationship__Group_8__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2230:1: ( ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) ) )
            // InternalModel.g:2231:1: ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) )
            {
            // InternalModel.g:2231:1: ( ( rule__YAnnotRelationship__InverseAssignment_8_1 ) )
            // InternalModel.g:2232:2: ( rule__YAnnotRelationship__InverseAssignment_8_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getInverseAssignment_8_1()); 
            }
            // InternalModel.g:2233:2: ( rule__YAnnotRelationship__InverseAssignment_8_1 )
            // InternalModel.g:2233:3: rule__YAnnotRelationship__InverseAssignment_8_1
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
    // InternalModel.g:2242:1: rule__YAnnotIdentifier__Group__0 : rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1 ;
    public final void rule__YAnnotIdentifier__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2246:1: ( rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1 )
            // InternalModel.g:2247:2: rule__YAnnotIdentifier__Group__0__Impl rule__YAnnotIdentifier__Group__1
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
    // InternalModel.g:2254:1: rule__YAnnotIdentifier__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotIdentifier__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2258:1: ( ( () ) )
            // InternalModel.g:2259:1: ( () )
            {
            // InternalModel.g:2259:1: ( () )
            // InternalModel.g:2260:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getYAnnotIdentifierAction_0()); 
            }
            // InternalModel.g:2261:2: ()
            // InternalModel.g:2261:3: 
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
    // InternalModel.g:2269:1: rule__YAnnotIdentifier__Group__1 : rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2 ;
    public final void rule__YAnnotIdentifier__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2273:1: ( rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2 )
            // InternalModel.g:2274:2: rule__YAnnotIdentifier__Group__1__Impl rule__YAnnotIdentifier__Group__2
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
    // InternalModel.g:2281:1: rule__YAnnotIdentifier__Group__1__Impl : ( '@identifier' ) ;
    public final void rule__YAnnotIdentifier__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2285:1: ( ( '@identifier' ) )
            // InternalModel.g:2286:1: ( '@identifier' )
            {
            // InternalModel.g:2286:1: ( '@identifier' )
            // InternalModel.g:2287:2: '@identifier'
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
    // InternalModel.g:2296:1: rule__YAnnotIdentifier__Group__2 : rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3 ;
    public final void rule__YAnnotIdentifier__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2300:1: ( rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3 )
            // InternalModel.g:2301:2: rule__YAnnotIdentifier__Group__2__Impl rule__YAnnotIdentifier__Group__3
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
    // InternalModel.g:2308:1: rule__YAnnotIdentifier__Group__2__Impl : ( ( rule__YAnnotIdentifier__NameAssignment_2 ) ) ;
    public final void rule__YAnnotIdentifier__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2312:1: ( ( ( rule__YAnnotIdentifier__NameAssignment_2 ) ) )
            // InternalModel.g:2313:1: ( ( rule__YAnnotIdentifier__NameAssignment_2 ) )
            {
            // InternalModel.g:2313:1: ( ( rule__YAnnotIdentifier__NameAssignment_2 ) )
            // InternalModel.g:2314:2: ( rule__YAnnotIdentifier__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:2315:2: ( rule__YAnnotIdentifier__NameAssignment_2 )
            // InternalModel.g:2315:3: rule__YAnnotIdentifier__NameAssignment_2
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
    // InternalModel.g:2323:1: rule__YAnnotIdentifier__Group__3 : rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4 ;
    public final void rule__YAnnotIdentifier__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2327:1: ( rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4 )
            // InternalModel.g:2328:2: rule__YAnnotIdentifier__Group__3__Impl rule__YAnnotIdentifier__Group__4
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
    // InternalModel.g:2335:1: rule__YAnnotIdentifier__Group__3__Impl : ( '(' ) ;
    public final void rule__YAnnotIdentifier__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2339:1: ( ( '(' ) )
            // InternalModel.g:2340:1: ( '(' )
            {
            // InternalModel.g:2340:1: ( '(' )
            // InternalModel.g:2341:2: '('
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
    // InternalModel.g:2350:1: rule__YAnnotIdentifier__Group__4 : rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5 ;
    public final void rule__YAnnotIdentifier__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2354:1: ( rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5 )
            // InternalModel.g:2355:2: rule__YAnnotIdentifier__Group__4__Impl rule__YAnnotIdentifier__Group__5
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
    // InternalModel.g:2362:1: rule__YAnnotIdentifier__Group__4__Impl : ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) ) ;
    public final void rule__YAnnotIdentifier__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2366:1: ( ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) ) )
            // InternalModel.g:2367:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) )
            {
            // InternalModel.g:2367:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_4 ) )
            // InternalModel.g:2368:2: ( rule__YAnnotIdentifier__AnnotsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_4()); 
            }
            // InternalModel.g:2369:2: ( rule__YAnnotIdentifier__AnnotsAssignment_4 )
            // InternalModel.g:2369:3: rule__YAnnotIdentifier__AnnotsAssignment_4
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
    // InternalModel.g:2377:1: rule__YAnnotIdentifier__Group__5 : rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6 ;
    public final void rule__YAnnotIdentifier__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2381:1: ( rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6 )
            // InternalModel.g:2382:2: rule__YAnnotIdentifier__Group__5__Impl rule__YAnnotIdentifier__Group__6
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
    // InternalModel.g:2389:1: rule__YAnnotIdentifier__Group__5__Impl : ( ( rule__YAnnotIdentifier__Group_5__0 )* ) ;
    public final void rule__YAnnotIdentifier__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2393:1: ( ( ( rule__YAnnotIdentifier__Group_5__0 )* ) )
            // InternalModel.g:2394:1: ( ( rule__YAnnotIdentifier__Group_5__0 )* )
            {
            // InternalModel.g:2394:1: ( ( rule__YAnnotIdentifier__Group_5__0 )* )
            // InternalModel.g:2395:2: ( rule__YAnnotIdentifier__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getGroup_5()); 
            }
            // InternalModel.g:2396:2: ( rule__YAnnotIdentifier__Group_5__0 )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==31) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // InternalModel.g:2396:3: rule__YAnnotIdentifier__Group_5__0
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
    // InternalModel.g:2404:1: rule__YAnnotIdentifier__Group__6 : rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7 ;
    public final void rule__YAnnotIdentifier__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2408:1: ( rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7 )
            // InternalModel.g:2409:2: rule__YAnnotIdentifier__Group__6__Impl rule__YAnnotIdentifier__Group__7
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
    // InternalModel.g:2416:1: rule__YAnnotIdentifier__Group__6__Impl : ( ')' ) ;
    public final void rule__YAnnotIdentifier__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2420:1: ( ( ')' ) )
            // InternalModel.g:2421:1: ( ')' )
            {
            // InternalModel.g:2421:1: ( ')' )
            // InternalModel.g:2422:2: ')'
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
    // InternalModel.g:2431:1: rule__YAnnotIdentifier__Group__7 : rule__YAnnotIdentifier__Group__7__Impl ;
    public final void rule__YAnnotIdentifier__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2435:1: ( rule__YAnnotIdentifier__Group__7__Impl )
            // InternalModel.g:2436:2: rule__YAnnotIdentifier__Group__7__Impl
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
    // InternalModel.g:2442:1: rule__YAnnotIdentifier__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotIdentifier__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2446:1: ( ( ( ';' )? ) )
            // InternalModel.g:2447:1: ( ( ';' )? )
            {
            // InternalModel.g:2447:1: ( ( ';' )? )
            // InternalModel.g:2448:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:2449:2: ( ';' )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==24) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // InternalModel.g:2449:3: ';'
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
    // InternalModel.g:2458:1: rule__YAnnotIdentifier__Group_5__0 : rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1 ;
    public final void rule__YAnnotIdentifier__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2462:1: ( rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1 )
            // InternalModel.g:2463:2: rule__YAnnotIdentifier__Group_5__0__Impl rule__YAnnotIdentifier__Group_5__1
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
    // InternalModel.g:2470:1: rule__YAnnotIdentifier__Group_5__0__Impl : ( ',' ) ;
    public final void rule__YAnnotIdentifier__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2474:1: ( ( ',' ) )
            // InternalModel.g:2475:1: ( ',' )
            {
            // InternalModel.g:2475:1: ( ',' )
            // InternalModel.g:2476:2: ','
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
    // InternalModel.g:2485:1: rule__YAnnotIdentifier__Group_5__1 : rule__YAnnotIdentifier__Group_5__1__Impl ;
    public final void rule__YAnnotIdentifier__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2489:1: ( rule__YAnnotIdentifier__Group_5__1__Impl )
            // InternalModel.g:2490:2: rule__YAnnotIdentifier__Group_5__1__Impl
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
    // InternalModel.g:2496:1: rule__YAnnotIdentifier__Group_5__1__Impl : ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) ) ;
    public final void rule__YAnnotIdentifier__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2500:1: ( ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) ) )
            // InternalModel.g:2501:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) )
            {
            // InternalModel.g:2501:1: ( ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 ) )
            // InternalModel.g:2502:2: ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsAssignment_5_1()); 
            }
            // InternalModel.g:2503:2: ( rule__YAnnotIdentifier__AnnotsAssignment_5_1 )
            // InternalModel.g:2503:3: rule__YAnnotIdentifier__AnnotsAssignment_5_1
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
    // InternalModel.g:2512:1: rule__YAnnotationElementValuePair__Group__0 : rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1 ;
    public final void rule__YAnnotationElementValuePair__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2516:1: ( rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1 )
            // InternalModel.g:2517:2: rule__YAnnotationElementValuePair__Group__0__Impl rule__YAnnotationElementValuePair__Group__1
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
    // InternalModel.g:2524:1: rule__YAnnotationElementValuePair__Group__0__Impl : ( ( rule__YAnnotationElementValuePair__Group_0__0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2528:1: ( ( ( rule__YAnnotationElementValuePair__Group_0__0 ) ) )
            // InternalModel.g:2529:1: ( ( rule__YAnnotationElementValuePair__Group_0__0 ) )
            {
            // InternalModel.g:2529:1: ( ( rule__YAnnotationElementValuePair__Group_0__0 ) )
            // InternalModel.g:2530:2: ( rule__YAnnotationElementValuePair__Group_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0()); 
            }
            // InternalModel.g:2531:2: ( rule__YAnnotationElementValuePair__Group_0__0 )
            // InternalModel.g:2531:3: rule__YAnnotationElementValuePair__Group_0__0
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
    // InternalModel.g:2539:1: rule__YAnnotationElementValuePair__Group__1 : rule__YAnnotationElementValuePair__Group__1__Impl ;
    public final void rule__YAnnotationElementValuePair__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2543:1: ( rule__YAnnotationElementValuePair__Group__1__Impl )
            // InternalModel.g:2544:2: rule__YAnnotationElementValuePair__Group__1__Impl
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
    // InternalModel.g:2550:1: rule__YAnnotationElementValuePair__Group__1__Impl : ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2554:1: ( ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) ) )
            // InternalModel.g:2555:1: ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) )
            {
            // InternalModel.g:2555:1: ( ( rule__YAnnotationElementValuePair__ValueAssignment_1 ) )
            // InternalModel.g:2556:2: ( rule__YAnnotationElementValuePair__ValueAssignment_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getValueAssignment_1()); 
            }
            // InternalModel.g:2557:2: ( rule__YAnnotationElementValuePair__ValueAssignment_1 )
            // InternalModel.g:2557:3: rule__YAnnotationElementValuePair__ValueAssignment_1
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
    // InternalModel.g:2566:1: rule__YAnnotationElementValuePair__Group_0__0 : rule__YAnnotationElementValuePair__Group_0__0__Impl ;
    public final void rule__YAnnotationElementValuePair__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2570:1: ( rule__YAnnotationElementValuePair__Group_0__0__Impl )
            // InternalModel.g:2571:2: rule__YAnnotationElementValuePair__Group_0__0__Impl
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
    // InternalModel.g:2577:1: rule__YAnnotationElementValuePair__Group_0__0__Impl : ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2581:1: ( ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) ) )
            // InternalModel.g:2582:1: ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) )
            {
            // InternalModel.g:2582:1: ( ( rule__YAnnotationElementValuePair__Group_0_0__0 ) )
            // InternalModel.g:2583:2: ( rule__YAnnotationElementValuePair__Group_0_0__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getGroup_0_0()); 
            }
            // InternalModel.g:2584:2: ( rule__YAnnotationElementValuePair__Group_0_0__0 )
            // InternalModel.g:2584:3: rule__YAnnotationElementValuePair__Group_0_0__0
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
    // InternalModel.g:2593:1: rule__YAnnotationElementValuePair__Group_0_0__0 : rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1 ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2597:1: ( rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1 )
            // InternalModel.g:2598:2: rule__YAnnotationElementValuePair__Group_0_0__0__Impl rule__YAnnotationElementValuePair__Group_0_0__1
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
    // InternalModel.g:2605:1: rule__YAnnotationElementValuePair__Group_0_0__0__Impl : ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) ) ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2609:1: ( ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) ) )
            // InternalModel.g:2610:1: ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) )
            {
            // InternalModel.g:2610:1: ( ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 ) )
            // InternalModel.g:2611:2: ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotationElementValuePairAccess().getNameAssignment_0_0_0()); 
            }
            // InternalModel.g:2612:2: ( rule__YAnnotationElementValuePair__NameAssignment_0_0_0 )
            // InternalModel.g:2612:3: rule__YAnnotationElementValuePair__NameAssignment_0_0_0
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
    // InternalModel.g:2620:1: rule__YAnnotationElementValuePair__Group_0_0__1 : rule__YAnnotationElementValuePair__Group_0_0__1__Impl ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2624:1: ( rule__YAnnotationElementValuePair__Group_0_0__1__Impl )
            // InternalModel.g:2625:2: rule__YAnnotationElementValuePair__Group_0_0__1__Impl
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
    // InternalModel.g:2631:1: rule__YAnnotationElementValuePair__Group_0_0__1__Impl : ( '=' ) ;
    public final void rule__YAnnotationElementValuePair__Group_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2635:1: ( ( '=' ) )
            // InternalModel.g:2636:1: ( '=' )
            {
            // InternalModel.g:2636:1: ( '=' )
            // InternalModel.g:2637:2: '='
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
    // InternalModel.g:2647:1: rule__YAnnotExpression__Group_0__0 : rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1 ;
    public final void rule__YAnnotExpression__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2651:1: ( rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1 )
            // InternalModel.g:2652:2: rule__YAnnotExpression__Group_0__0__Impl rule__YAnnotExpression__Group_0__1
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
    // InternalModel.g:2659:1: rule__YAnnotExpression__Group_0__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2663:1: ( ( () ) )
            // InternalModel.g:2664:1: ( () )
            {
            // InternalModel.g:2664:1: ( () )
            // InternalModel.g:2665:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotKeywordAction_0_0()); 
            }
            // InternalModel.g:2666:2: ()
            // InternalModel.g:2666:3: 
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
    // InternalModel.g:2674:1: rule__YAnnotExpression__Group_0__1 : rule__YAnnotExpression__Group_0__1__Impl ;
    public final void rule__YAnnotExpression__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2678:1: ( rule__YAnnotExpression__Group_0__1__Impl )
            // InternalModel.g:2679:2: rule__YAnnotExpression__Group_0__1__Impl
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
    // InternalModel.g:2685:1: rule__YAnnotExpression__Group_0__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) ) ;
    public final void rule__YAnnotExpression__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2689:1: ( ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) ) )
            // InternalModel.g:2690:1: ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) )
            {
            // InternalModel.g:2690:1: ( ( rule__YAnnotExpression__ValueAssignment_0_1 ) )
            // InternalModel.g:2691:2: ( rule__YAnnotExpression__ValueAssignment_0_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_0_1()); 
            }
            // InternalModel.g:2692:2: ( rule__YAnnotExpression__ValueAssignment_0_1 )
            // InternalModel.g:2692:3: rule__YAnnotExpression__ValueAssignment_0_1
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
    // InternalModel.g:2701:1: rule__YAnnotExpression__Group_1__0 : rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1 ;
    public final void rule__YAnnotExpression__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2705:1: ( rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1 )
            // InternalModel.g:2706:2: rule__YAnnotExpression__Group_1__0__Impl rule__YAnnotExpression__Group_1__1
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
    // InternalModel.g:2713:1: rule__YAnnotExpression__Group_1__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2717:1: ( ( () ) )
            // InternalModel.g:2718:1: ( () )
            {
            // InternalModel.g:2718:1: ( () )
            // InternalModel.g:2719:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotStringConstantAction_1_0()); 
            }
            // InternalModel.g:2720:2: ()
            // InternalModel.g:2720:3: 
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
    // InternalModel.g:2728:1: rule__YAnnotExpression__Group_1__1 : rule__YAnnotExpression__Group_1__1__Impl ;
    public final void rule__YAnnotExpression__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2732:1: ( rule__YAnnotExpression__Group_1__1__Impl )
            // InternalModel.g:2733:2: rule__YAnnotExpression__Group_1__1__Impl
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
    // InternalModel.g:2739:1: rule__YAnnotExpression__Group_1__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) ) ;
    public final void rule__YAnnotExpression__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2743:1: ( ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) ) )
            // InternalModel.g:2744:1: ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) )
            {
            // InternalModel.g:2744:1: ( ( rule__YAnnotExpression__ValueAssignment_1_1 ) )
            // InternalModel.g:2745:2: ( rule__YAnnotExpression__ValueAssignment_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_1_1()); 
            }
            // InternalModel.g:2746:2: ( rule__YAnnotExpression__ValueAssignment_1_1 )
            // InternalModel.g:2746:3: rule__YAnnotExpression__ValueAssignment_1_1
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
    // InternalModel.g:2755:1: rule__YAnnotExpression__Group_2__0 : rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1 ;
    public final void rule__YAnnotExpression__Group_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2759:1: ( rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1 )
            // InternalModel.g:2760:2: rule__YAnnotExpression__Group_2__0__Impl rule__YAnnotExpression__Group_2__1
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
    // InternalModel.g:2767:1: rule__YAnnotExpression__Group_2__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2771:1: ( ( () ) )
            // InternalModel.g:2772:1: ( () )
            {
            // InternalModel.g:2772:1: ( () )
            // InternalModel.g:2773:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotNumberConstantAction_2_0()); 
            }
            // InternalModel.g:2774:2: ()
            // InternalModel.g:2774:3: 
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
    // InternalModel.g:2782:1: rule__YAnnotExpression__Group_2__1 : rule__YAnnotExpression__Group_2__1__Impl ;
    public final void rule__YAnnotExpression__Group_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2786:1: ( rule__YAnnotExpression__Group_2__1__Impl )
            // InternalModel.g:2787:2: rule__YAnnotExpression__Group_2__1__Impl
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
    // InternalModel.g:2793:1: rule__YAnnotExpression__Group_2__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) ) ;
    public final void rule__YAnnotExpression__Group_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2797:1: ( ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) ) )
            // InternalModel.g:2798:1: ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) )
            {
            // InternalModel.g:2798:1: ( ( rule__YAnnotExpression__ValueAssignment_2_1 ) )
            // InternalModel.g:2799:2: ( rule__YAnnotExpression__ValueAssignment_2_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_2_1()); 
            }
            // InternalModel.g:2800:2: ( rule__YAnnotExpression__ValueAssignment_2_1 )
            // InternalModel.g:2800:3: rule__YAnnotExpression__ValueAssignment_2_1
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
    // InternalModel.g:2809:1: rule__YAnnotExpression__Group_3__0 : rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1 ;
    public final void rule__YAnnotExpression__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2813:1: ( rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1 )
            // InternalModel.g:2814:2: rule__YAnnotExpression__Group_3__0__Impl rule__YAnnotExpression__Group_3__1
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
    // InternalModel.g:2821:1: rule__YAnnotExpression__Group_3__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2825:1: ( ( () ) )
            // InternalModel.g:2826:1: ( () )
            {
            // InternalModel.g:2826:1: ( () )
            // InternalModel.g:2827:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotBoolConstantAction_3_0()); 
            }
            // InternalModel.g:2828:2: ()
            // InternalModel.g:2828:3: 
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
    // InternalModel.g:2836:1: rule__YAnnotExpression__Group_3__1 : rule__YAnnotExpression__Group_3__1__Impl ;
    public final void rule__YAnnotExpression__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2840:1: ( rule__YAnnotExpression__Group_3__1__Impl )
            // InternalModel.g:2841:2: rule__YAnnotExpression__Group_3__1__Impl
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
    // InternalModel.g:2847:1: rule__YAnnotExpression__Group_3__1__Impl : ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) ) ;
    public final void rule__YAnnotExpression__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2851:1: ( ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) ) )
            // InternalModel.g:2852:1: ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) )
            {
            // InternalModel.g:2852:1: ( ( rule__YAnnotExpression__ValueAssignment_3_1 ) )
            // InternalModel.g:2853:2: ( rule__YAnnotExpression__ValueAssignment_3_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAssignment_3_1()); 
            }
            // InternalModel.g:2854:2: ( rule__YAnnotExpression__ValueAssignment_3_1 )
            // InternalModel.g:2854:3: rule__YAnnotExpression__ValueAssignment_3_1
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
    // InternalModel.g:2863:1: rule__YAnnotExpression__Group_4__0 : rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1 ;
    public final void rule__YAnnotExpression__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2867:1: ( rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1 )
            // InternalModel.g:2868:2: rule__YAnnotExpression__Group_4__0__Impl rule__YAnnotExpression__Group_4__1
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
    // InternalModel.g:2875:1: rule__YAnnotExpression__Group_4__0__Impl : ( () ) ;
    public final void rule__YAnnotExpression__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2879:1: ( ( () ) )
            // InternalModel.g:2880:1: ( () )
            {
            // InternalModel.g:2880:1: ( () )
            // InternalModel.g:2881:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getYAnnotArrayAction_4_0()); 
            }
            // InternalModel.g:2882:2: ()
            // InternalModel.g:2882:3: 
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
    // InternalModel.g:2890:1: rule__YAnnotExpression__Group_4__1 : rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2 ;
    public final void rule__YAnnotExpression__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2894:1: ( rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2 )
            // InternalModel.g:2895:2: rule__YAnnotExpression__Group_4__1__Impl rule__YAnnotExpression__Group_4__2
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
    // InternalModel.g:2902:1: rule__YAnnotExpression__Group_4__1__Impl : ( ( rule__YAnnotExpression__Group_4_1__0 ) ) ;
    public final void rule__YAnnotExpression__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2906:1: ( ( ( rule__YAnnotExpression__Group_4_1__0 ) ) )
            // InternalModel.g:2907:1: ( ( rule__YAnnotExpression__Group_4_1__0 ) )
            {
            // InternalModel.g:2907:1: ( ( rule__YAnnotExpression__Group_4_1__0 ) )
            // InternalModel.g:2908:2: ( rule__YAnnotExpression__Group_4_1__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_1()); 
            }
            // InternalModel.g:2909:2: ( rule__YAnnotExpression__Group_4_1__0 )
            // InternalModel.g:2909:3: rule__YAnnotExpression__Group_4_1__0
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
    // InternalModel.g:2917:1: rule__YAnnotExpression__Group_4__2 : rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3 ;
    public final void rule__YAnnotExpression__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2921:1: ( rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3 )
            // InternalModel.g:2922:2: rule__YAnnotExpression__Group_4__2__Impl rule__YAnnotExpression__Group_4__3
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
    // InternalModel.g:2929:1: rule__YAnnotExpression__Group_4__2__Impl : ( ( rule__YAnnotExpression__Group_4_2__0 )? ) ;
    public final void rule__YAnnotExpression__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2933:1: ( ( ( rule__YAnnotExpression__Group_4_2__0 )? ) )
            // InternalModel.g:2934:1: ( ( rule__YAnnotExpression__Group_4_2__0 )? )
            {
            // InternalModel.g:2934:1: ( ( rule__YAnnotExpression__Group_4_2__0 )? )
            // InternalModel.g:2935:2: ( rule__YAnnotExpression__Group_4_2__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2()); 
            }
            // InternalModel.g:2936:2: ( rule__YAnnotExpression__Group_4_2__0 )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( ((LA28_0>=RULE_ID && LA28_0<=RULE_STRING)||(LA28_0>=11 && LA28_0<=12)||LA28_0==39) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // InternalModel.g:2936:3: rule__YAnnotExpression__Group_4_2__0
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
    // InternalModel.g:2944:1: rule__YAnnotExpression__Group_4__3 : rule__YAnnotExpression__Group_4__3__Impl ;
    public final void rule__YAnnotExpression__Group_4__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2948:1: ( rule__YAnnotExpression__Group_4__3__Impl )
            // InternalModel.g:2949:2: rule__YAnnotExpression__Group_4__3__Impl
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
    // InternalModel.g:2955:1: rule__YAnnotExpression__Group_4__3__Impl : ( ']' ) ;
    public final void rule__YAnnotExpression__Group_4__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2959:1: ( ( ']' ) )
            // InternalModel.g:2960:1: ( ']' )
            {
            // InternalModel.g:2960:1: ( ']' )
            // InternalModel.g:2961:2: ']'
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
    // InternalModel.g:2971:1: rule__YAnnotExpression__Group_4_1__0 : rule__YAnnotExpression__Group_4_1__0__Impl ;
    public final void rule__YAnnotExpression__Group_4_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2975:1: ( rule__YAnnotExpression__Group_4_1__0__Impl )
            // InternalModel.g:2976:2: rule__YAnnotExpression__Group_4_1__0__Impl
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
    // InternalModel.g:2982:1: rule__YAnnotExpression__Group_4_1__0__Impl : ( '[' ) ;
    public final void rule__YAnnotExpression__Group_4_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:2986:1: ( ( '[' ) )
            // InternalModel.g:2987:1: ( '[' )
            {
            // InternalModel.g:2987:1: ( '[' )
            // InternalModel.g:2988:2: '['
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
    // InternalModel.g:2998:1: rule__YAnnotExpression__Group_4_2__0 : rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1 ;
    public final void rule__YAnnotExpression__Group_4_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3002:1: ( rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1 )
            // InternalModel.g:3003:2: rule__YAnnotExpression__Group_4_2__0__Impl rule__YAnnotExpression__Group_4_2__1
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
    // InternalModel.g:3010:1: rule__YAnnotExpression__Group_4_2__0__Impl : ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) ) ;
    public final void rule__YAnnotExpression__Group_4_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3014:1: ( ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) ) )
            // InternalModel.g:3015:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) )
            {
            // InternalModel.g:3015:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_0 ) )
            // InternalModel.g:3016:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_0()); 
            }
            // InternalModel.g:3017:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_0 )
            // InternalModel.g:3017:3: rule__YAnnotExpression__ElementsAssignment_4_2_0
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
    // InternalModel.g:3025:1: rule__YAnnotExpression__Group_4_2__1 : rule__YAnnotExpression__Group_4_2__1__Impl ;
    public final void rule__YAnnotExpression__Group_4_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3029:1: ( rule__YAnnotExpression__Group_4_2__1__Impl )
            // InternalModel.g:3030:2: rule__YAnnotExpression__Group_4_2__1__Impl
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
    // InternalModel.g:3036:1: rule__YAnnotExpression__Group_4_2__1__Impl : ( ( rule__YAnnotExpression__Group_4_2_1__0 )* ) ;
    public final void rule__YAnnotExpression__Group_4_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3040:1: ( ( ( rule__YAnnotExpression__Group_4_2_1__0 )* ) )
            // InternalModel.g:3041:1: ( ( rule__YAnnotExpression__Group_4_2_1__0 )* )
            {
            // InternalModel.g:3041:1: ( ( rule__YAnnotExpression__Group_4_2_1__0 )* )
            // InternalModel.g:3042:2: ( rule__YAnnotExpression__Group_4_2_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getGroup_4_2_1()); 
            }
            // InternalModel.g:3043:2: ( rule__YAnnotExpression__Group_4_2_1__0 )*
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==31) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // InternalModel.g:3043:3: rule__YAnnotExpression__Group_4_2_1__0
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
    // InternalModel.g:3052:1: rule__YAnnotExpression__Group_4_2_1__0 : rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1 ;
    public final void rule__YAnnotExpression__Group_4_2_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3056:1: ( rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1 )
            // InternalModel.g:3057:2: rule__YAnnotExpression__Group_4_2_1__0__Impl rule__YAnnotExpression__Group_4_2_1__1
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
    // InternalModel.g:3064:1: rule__YAnnotExpression__Group_4_2_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotExpression__Group_4_2_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3068:1: ( ( ',' ) )
            // InternalModel.g:3069:1: ( ',' )
            {
            // InternalModel.g:3069:1: ( ',' )
            // InternalModel.g:3070:2: ','
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
    // InternalModel.g:3079:1: rule__YAnnotExpression__Group_4_2_1__1 : rule__YAnnotExpression__Group_4_2_1__1__Impl ;
    public final void rule__YAnnotExpression__Group_4_2_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3083:1: ( rule__YAnnotExpression__Group_4_2_1__1__Impl )
            // InternalModel.g:3084:2: rule__YAnnotExpression__Group_4_2_1__1__Impl
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
    // InternalModel.g:3090:1: rule__YAnnotExpression__Group_4_2_1__1__Impl : ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) ) ;
    public final void rule__YAnnotExpression__Group_4_2_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3094:1: ( ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) ) )
            // InternalModel.g:3095:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) )
            {
            // InternalModel.g:3095:1: ( ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 ) )
            // InternalModel.g:3096:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getElementsAssignment_4_2_1_1()); 
            }
            // InternalModel.g:3097:2: ( rule__YAnnotExpression__ElementsAssignment_4_2_1_1 )
            // InternalModel.g:3097:3: rule__YAnnotExpression__ElementsAssignment_4_2_1_1
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
    // InternalModel.g:3106:1: rule__YAnnotTechnicalDesign__Group__0 : rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1 ;
    public final void rule__YAnnotTechnicalDesign__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3110:1: ( rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1 )
            // InternalModel.g:3111:2: rule__YAnnotTechnicalDesign__Group__0__Impl rule__YAnnotTechnicalDesign__Group__1
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
    // InternalModel.g:3118:1: rule__YAnnotTechnicalDesign__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotTechnicalDesign__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3122:1: ( ( () ) )
            // InternalModel.g:3123:1: ( () )
            {
            // InternalModel.g:3123:1: ( () )
            // InternalModel.g:3124:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getYAnnotTechnicalDesignAction_0()); 
            }
            // InternalModel.g:3125:2: ()
            // InternalModel.g:3125:3: 
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
    // InternalModel.g:3133:1: rule__YAnnotTechnicalDesign__Group__1 : rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2 ;
    public final void rule__YAnnotTechnicalDesign__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3137:1: ( rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2 )
            // InternalModel.g:3138:2: rule__YAnnotTechnicalDesign__Group__1__Impl rule__YAnnotTechnicalDesign__Group__2
            {
            pushFollow(FOLLOW_3);
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
    // InternalModel.g:3145:1: rule__YAnnotTechnicalDesign__Group__1__Impl : ( '@td' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3149:1: ( ( '@td' ) )
            // InternalModel.g:3150:1: ( '@td' )
            {
            // InternalModel.g:3150:1: ( '@td' )
            // InternalModel.g:3151:2: '@td'
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
    // InternalModel.g:3160:1: rule__YAnnotTechnicalDesign__Group__2 : rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3 ;
    public final void rule__YAnnotTechnicalDesign__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3164:1: ( rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3 )
            // InternalModel.g:3165:2: rule__YAnnotTechnicalDesign__Group__2__Impl rule__YAnnotTechnicalDesign__Group__3
            {
            pushFollow(FOLLOW_21);
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
    // InternalModel.g:3172:1: rule__YAnnotTechnicalDesign__Group__2__Impl : ( ( rule__YAnnotTechnicalDesign__NameAssignment_2 ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3176:1: ( ( ( rule__YAnnotTechnicalDesign__NameAssignment_2 ) ) )
            // InternalModel.g:3177:1: ( ( rule__YAnnotTechnicalDesign__NameAssignment_2 ) )
            {
            // InternalModel.g:3177:1: ( ( rule__YAnnotTechnicalDesign__NameAssignment_2 ) )
            // InternalModel.g:3178:2: ( rule__YAnnotTechnicalDesign__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:3179:2: ( rule__YAnnotTechnicalDesign__NameAssignment_2 )
            // InternalModel.g:3179:3: rule__YAnnotTechnicalDesign__NameAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__NameAssignment_2();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getNameAssignment_2()); 
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
    // InternalModel.g:3187:1: rule__YAnnotTechnicalDesign__Group__3 : rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4 ;
    public final void rule__YAnnotTechnicalDesign__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3191:1: ( rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4 )
            // InternalModel.g:3192:2: rule__YAnnotTechnicalDesign__Group__3__Impl rule__YAnnotTechnicalDesign__Group__4
            {
            pushFollow(FOLLOW_30);
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
    // InternalModel.g:3199:1: rule__YAnnotTechnicalDesign__Group__3__Impl : ( ( rule__YAnnotTechnicalDesign__Group_3__0 ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3203:1: ( ( ( rule__YAnnotTechnicalDesign__Group_3__0 ) ) )
            // InternalModel.g:3204:1: ( ( rule__YAnnotTechnicalDesign__Group_3__0 ) )
            {
            // InternalModel.g:3204:1: ( ( rule__YAnnotTechnicalDesign__Group_3__0 ) )
            // InternalModel.g:3205:2: ( rule__YAnnotTechnicalDesign__Group_3__0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3()); 
            }
            // InternalModel.g:3206:2: ( rule__YAnnotTechnicalDesign__Group_3__0 )
            // InternalModel.g:3206:3: rule__YAnnotTechnicalDesign__Group_3__0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3__0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3()); 
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
    // InternalModel.g:3214:1: rule__YAnnotTechnicalDesign__Group__4 : rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5 ;
    public final void rule__YAnnotTechnicalDesign__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3218:1: ( rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5 )
            // InternalModel.g:3219:2: rule__YAnnotTechnicalDesign__Group__4__Impl rule__YAnnotTechnicalDesign__Group__5
            {
            pushFollow(FOLLOW_31);
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
    // InternalModel.g:3226:1: rule__YAnnotTechnicalDesign__Group__4__Impl : ( '{' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3230:1: ( ( '{' ) )
            // InternalModel.g:3231:1: ( '{' )
            {
            // InternalModel.g:3231:1: ( '{' )
            // InternalModel.g:3232:2: '{'
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
    // InternalModel.g:3241:1: rule__YAnnotTechnicalDesign__Group__5 : rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6 ;
    public final void rule__YAnnotTechnicalDesign__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3245:1: ( rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6 )
            // InternalModel.g:3246:2: rule__YAnnotTechnicalDesign__Group__5__Impl rule__YAnnotTechnicalDesign__Group__6
            {
            pushFollow(FOLLOW_31);
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
    // InternalModel.g:3253:1: rule__YAnnotTechnicalDesign__Group__5__Impl : ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* ) ;
    public final void rule__YAnnotTechnicalDesign__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3257:1: ( ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* ) )
            // InternalModel.g:3258:1: ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* )
            {
            // InternalModel.g:3258:1: ( ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )* )
            // InternalModel.g:3259:2: ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getFeaturesAssignment_5()); 
            }
            // InternalModel.g:3260:2: ( rule__YAnnotTechnicalDesign__FeaturesAssignment_5 )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==41) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // InternalModel.g:3260:3: rule__YAnnotTechnicalDesign__FeaturesAssignment_5
            	    {
            	    pushFollow(FOLLOW_32);
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
    // InternalModel.g:3268:1: rule__YAnnotTechnicalDesign__Group__6 : rule__YAnnotTechnicalDesign__Group__6__Impl ;
    public final void rule__YAnnotTechnicalDesign__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3272:1: ( rule__YAnnotTechnicalDesign__Group__6__Impl )
            // InternalModel.g:3273:2: rule__YAnnotTechnicalDesign__Group__6__Impl
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
    // InternalModel.g:3279:1: rule__YAnnotTechnicalDesign__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotTechnicalDesign__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3283:1: ( ( '}' ) )
            // InternalModel.g:3284:1: ( '}' )
            {
            // InternalModel.g:3284:1: ( '}' )
            // InternalModel.g:3285:2: '}'
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


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__0"
    // InternalModel.g:3295:1: rule__YAnnotTechnicalDesign__Group_3__0 : rule__YAnnotTechnicalDesign__Group_3__0__Impl rule__YAnnotTechnicalDesign__Group_3__1 ;
    public final void rule__YAnnotTechnicalDesign__Group_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3299:1: ( rule__YAnnotTechnicalDesign__Group_3__0__Impl rule__YAnnotTechnicalDesign__Group_3__1 )
            // InternalModel.g:3300:2: rule__YAnnotTechnicalDesign__Group_3__0__Impl rule__YAnnotTechnicalDesign__Group_3__1
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotTechnicalDesign__Group_3__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3__1();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__0"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__0__Impl"
    // InternalModel.g:3307:1: rule__YAnnotTechnicalDesign__Group_3__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3311:1: ( ( ( '(' ) ) )
            // InternalModel.g:3312:1: ( ( '(' ) )
            {
            // InternalModel.g:3312:1: ( ( '(' ) )
            // InternalModel.g:3313:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getLeftParenthesisKeyword_3_0()); 
            }
            // InternalModel.g:3314:2: ( '(' )
            // InternalModel.g:3314:3: '('
            {
            match(input,29,FOLLOW_2); if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getLeftParenthesisKeyword_3_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__0__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__1"
    // InternalModel.g:3322:1: rule__YAnnotTechnicalDesign__Group_3__1 : rule__YAnnotTechnicalDesign__Group_3__1__Impl rule__YAnnotTechnicalDesign__Group_3__2 ;
    public final void rule__YAnnotTechnicalDesign__Group_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3326:1: ( rule__YAnnotTechnicalDesign__Group_3__1__Impl rule__YAnnotTechnicalDesign__Group_3__2 )
            // InternalModel.g:3327:2: rule__YAnnotTechnicalDesign__Group_3__1__Impl rule__YAnnotTechnicalDesign__Group_3__2
            {
            pushFollow(FOLLOW_12);
            rule__YAnnotTechnicalDesign__Group_3__1__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3__2();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__1__Impl"
    // InternalModel.g:3334:1: rule__YAnnotTechnicalDesign__Group_3__1__Impl : ( ( rule__YAnnotTechnicalDesign__Group_3_1__0 )? ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3338:1: ( ( ( rule__YAnnotTechnicalDesign__Group_3_1__0 )? ) )
            // InternalModel.g:3339:1: ( ( rule__YAnnotTechnicalDesign__Group_3_1__0 )? )
            {
            // InternalModel.g:3339:1: ( ( rule__YAnnotTechnicalDesign__Group_3_1__0 )? )
            // InternalModel.g:3340:2: ( rule__YAnnotTechnicalDesign__Group_3_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3_1()); 
            }
            // InternalModel.g:3341:2: ( rule__YAnnotTechnicalDesign__Group_3_1__0 )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==RULE_ID) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // InternalModel.g:3341:3: rule__YAnnotTechnicalDesign__Group_3_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__YAnnotTechnicalDesign__Group_3_1__0();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3_1()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__1__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__2"
    // InternalModel.g:3349:1: rule__YAnnotTechnicalDesign__Group_3__2 : rule__YAnnotTechnicalDesign__Group_3__2__Impl ;
    public final void rule__YAnnotTechnicalDesign__Group_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3353:1: ( rule__YAnnotTechnicalDesign__Group_3__2__Impl )
            // InternalModel.g:3354:2: rule__YAnnotTechnicalDesign__Group_3__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3__2__Impl();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__2"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3__2__Impl"
    // InternalModel.g:3360:1: rule__YAnnotTechnicalDesign__Group_3__2__Impl : ( ')' ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3364:1: ( ( ')' ) )
            // InternalModel.g:3365:1: ( ')' )
            {
            // InternalModel.g:3365:1: ( ')' )
            // InternalModel.g:3366:2: ')'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getRightParenthesisKeyword_3_2()); 
            }
            match(input,30,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getRightParenthesisKeyword_3_2()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3__2__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1__0"
    // InternalModel.g:3376:1: rule__YAnnotTechnicalDesign__Group_3_1__0 : rule__YAnnotTechnicalDesign__Group_3_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1__1 ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3380:1: ( rule__YAnnotTechnicalDesign__Group_3_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1__1 )
            // InternalModel.g:3381:2: rule__YAnnotTechnicalDesign__Group_3_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1__1
            {
            pushFollow(FOLLOW_13);
            rule__YAnnotTechnicalDesign__Group_3_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3_1__1();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1__0"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1__0__Impl"
    // InternalModel.g:3388:1: rule__YAnnotTechnicalDesign__Group_3_1__0__Impl : ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3392:1: ( ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 ) ) )
            // InternalModel.g:3393:1: ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 ) )
            {
            // InternalModel.g:3393:1: ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 ) )
            // InternalModel.g:3394:2: ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsAssignment_3_1_0()); 
            }
            // InternalModel.g:3395:2: ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 )
            // InternalModel.g:3395:3: rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsAssignment_3_1_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1__0__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1__1"
    // InternalModel.g:3403:1: rule__YAnnotTechnicalDesign__Group_3_1__1 : rule__YAnnotTechnicalDesign__Group_3_1__1__Impl ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3407:1: ( rule__YAnnotTechnicalDesign__Group_3_1__1__Impl )
            // InternalModel.g:3408:2: rule__YAnnotTechnicalDesign__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3_1__1__Impl();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1__1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1__1__Impl"
    // InternalModel.g:3414:1: rule__YAnnotTechnicalDesign__Group_3_1__1__Impl : ( ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )* ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3418:1: ( ( ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )* ) )
            // InternalModel.g:3419:1: ( ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )* )
            {
            // InternalModel.g:3419:1: ( ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )* )
            // InternalModel.g:3420:2: ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3_1_1()); 
            }
            // InternalModel.g:3421:2: ( rule__YAnnotTechnicalDesign__Group_3_1_1__0 )*
            loop32:
            do {
                int alt32=2;
                int LA32_0 = input.LA(1);

                if ( (LA32_0==31) ) {
                    alt32=1;
                }


                switch (alt32) {
            	case 1 :
            	    // InternalModel.g:3421:3: rule__YAnnotTechnicalDesign__Group_3_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotTechnicalDesign__Group_3_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop32;
                }
            } while (true);

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getGroup_3_1_1()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1__1__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1_1__0"
    // InternalModel.g:3430:1: rule__YAnnotTechnicalDesign__Group_3_1_1__0 : rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1_1__1 ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3434:1: ( rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1_1__1 )
            // InternalModel.g:3435:2: rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl rule__YAnnotTechnicalDesign__Group_3_1_1__1
            {
            pushFollow(FOLLOW_3);
            rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl();

            state._fsp--;
            if (state.failed) return ;
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3_1_1__1();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1_1__0"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl"
    // InternalModel.g:3442:1: rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3446:1: ( ( ',' ) )
            // InternalModel.g:3447:1: ( ',' )
            {
            // InternalModel.g:3447:1: ( ',' )
            // InternalModel.g:3448:2: ','
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getCommaKeyword_3_1_1_0()); 
            }
            match(input,31,FOLLOW_2); if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getCommaKeyword_3_1_1_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1_1__0__Impl"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1_1__1"
    // InternalModel.g:3457:1: rule__YAnnotTechnicalDesign__Group_3_1_1__1 : rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3461:1: ( rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl )
            // InternalModel.g:3462:2: rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl();

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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1_1__1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl"
    // InternalModel.g:3468:1: rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl : ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 ) ) ;
    public final void rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3472:1: ( ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 ) ) )
            // InternalModel.g:3473:1: ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 ) )
            {
            // InternalModel.g:3473:1: ( ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 ) )
            // InternalModel.g:3474:2: ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsAssignment_3_1_1_1()); 
            }
            // InternalModel.g:3475:2: ( rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 )
            // InternalModel.g:3475:3: rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1
            {
            pushFollow(FOLLOW_2);
            rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1();

            state._fsp--;
            if (state.failed) return ;

            }

            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsAssignment_3_1_1_1()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__Group_3_1_1__1__Impl"


    // $ANTLR start "rule__YAnnotTable__Group__0"
    // InternalModel.g:3484:1: rule__YAnnotTable__Group__0 : rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1 ;
    public final void rule__YAnnotTable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3488:1: ( rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1 )
            // InternalModel.g:3489:2: rule__YAnnotTable__Group__0__Impl rule__YAnnotTable__Group__1
            {
            pushFollow(FOLLOW_33);
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
    // InternalModel.g:3496:1: rule__YAnnotTable__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotTable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3500:1: ( ( () ) )
            // InternalModel.g:3501:1: ( () )
            {
            // InternalModel.g:3501:1: ( () )
            // InternalModel.g:3502:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getYAnnotTableAction_0()); 
            }
            // InternalModel.g:3503:2: ()
            // InternalModel.g:3503:3: 
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
    // InternalModel.g:3511:1: rule__YAnnotTable__Group__1 : rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2 ;
    public final void rule__YAnnotTable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3515:1: ( rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2 )
            // InternalModel.g:3516:2: rule__YAnnotTable__Group__1__Impl rule__YAnnotTable__Group__2
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
    // InternalModel.g:3523:1: rule__YAnnotTable__Group__1__Impl : ( '@table' ) ;
    public final void rule__YAnnotTable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3527:1: ( ( '@table' ) )
            // InternalModel.g:3528:1: ( '@table' )
            {
            // InternalModel.g:3528:1: ( '@table' )
            // InternalModel.g:3529:2: '@table'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getTableKeyword_1()); 
            }
            match(input,41,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:3538:1: rule__YAnnotTable__Group__2 : rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3 ;
    public final void rule__YAnnotTable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3542:1: ( rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3 )
            // InternalModel.g:3543:2: rule__YAnnotTable__Group__2__Impl rule__YAnnotTable__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalModel.g:3550:1: rule__YAnnotTable__Group__2__Impl : ( ( rule__YAnnotTable__NameAssignment_2 ) ) ;
    public final void rule__YAnnotTable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3554:1: ( ( ( rule__YAnnotTable__NameAssignment_2 ) ) )
            // InternalModel.g:3555:1: ( ( rule__YAnnotTable__NameAssignment_2 ) )
            {
            // InternalModel.g:3555:1: ( ( rule__YAnnotTable__NameAssignment_2 ) )
            // InternalModel.g:3556:2: ( rule__YAnnotTable__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:3557:2: ( rule__YAnnotTable__NameAssignment_2 )
            // InternalModel.g:3557:3: rule__YAnnotTable__NameAssignment_2
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
    // InternalModel.g:3565:1: rule__YAnnotTable__Group__3 : rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4 ;
    public final void rule__YAnnotTable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3569:1: ( rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4 )
            // InternalModel.g:3570:2: rule__YAnnotTable__Group__3__Impl rule__YAnnotTable__Group__4
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
    // InternalModel.g:3577:1: rule__YAnnotTable__Group__3__Impl : ( '->' ) ;
    public final void rule__YAnnotTable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3581:1: ( ( '->' ) )
            // InternalModel.g:3582:1: ( '->' )
            {
            // InternalModel.g:3582:1: ( '->' )
            // InternalModel.g:3583:2: '->'
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
    // InternalModel.g:3592:1: rule__YAnnotTable__Group__4 : rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5 ;
    public final void rule__YAnnotTable__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3596:1: ( rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5 )
            // InternalModel.g:3597:2: rule__YAnnotTable__Group__4__Impl rule__YAnnotTable__Group__5
            {
            pushFollow(FOLLOW_30);
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
    // InternalModel.g:3604:1: rule__YAnnotTable__Group__4__Impl : ( ( rule__YAnnotTable__EntityrefAssignment_4 ) ) ;
    public final void rule__YAnnotTable__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3608:1: ( ( ( rule__YAnnotTable__EntityrefAssignment_4 ) ) )
            // InternalModel.g:3609:1: ( ( rule__YAnnotTable__EntityrefAssignment_4 ) )
            {
            // InternalModel.g:3609:1: ( ( rule__YAnnotTable__EntityrefAssignment_4 ) )
            // InternalModel.g:3610:2: ( rule__YAnnotTable__EntityrefAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getEntityrefAssignment_4()); 
            }
            // InternalModel.g:3611:2: ( rule__YAnnotTable__EntityrefAssignment_4 )
            // InternalModel.g:3611:3: rule__YAnnotTable__EntityrefAssignment_4
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
    // InternalModel.g:3619:1: rule__YAnnotTable__Group__5 : rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6 ;
    public final void rule__YAnnotTable__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3623:1: ( rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6 )
            // InternalModel.g:3624:2: rule__YAnnotTable__Group__5__Impl rule__YAnnotTable__Group__6
            {
            pushFollow(FOLLOW_35);
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
    // InternalModel.g:3631:1: rule__YAnnotTable__Group__5__Impl : ( '{' ) ;
    public final void rule__YAnnotTable__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3635:1: ( ( '{' ) )
            // InternalModel.g:3636:1: ( '{' )
            {
            // InternalModel.g:3636:1: ( '{' )
            // InternalModel.g:3637:2: '{'
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
    // InternalModel.g:3646:1: rule__YAnnotTable__Group__6 : rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7 ;
    public final void rule__YAnnotTable__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3650:1: ( rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7 )
            // InternalModel.g:3651:2: rule__YAnnotTable__Group__6__Impl rule__YAnnotTable__Group__7
            {
            pushFollow(FOLLOW_35);
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
    // InternalModel.g:3658:1: rule__YAnnotTable__Group__6__Impl : ( ( rule__YAnnotTable__ColumnsAssignment_6 )* ) ;
    public final void rule__YAnnotTable__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3662:1: ( ( ( rule__YAnnotTable__ColumnsAssignment_6 )* ) )
            // InternalModel.g:3663:1: ( ( rule__YAnnotTable__ColumnsAssignment_6 )* )
            {
            // InternalModel.g:3663:1: ( ( rule__YAnnotTable__ColumnsAssignment_6 )* )
            // InternalModel.g:3664:2: ( rule__YAnnotTable__ColumnsAssignment_6 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getColumnsAssignment_6()); 
            }
            // InternalModel.g:3665:2: ( rule__YAnnotTable__ColumnsAssignment_6 )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==43) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // InternalModel.g:3665:3: rule__YAnnotTable__ColumnsAssignment_6
            	    {
            	    pushFollow(FOLLOW_36);
            	    rule__YAnnotTable__ColumnsAssignment_6();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop33;
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
    // InternalModel.g:3673:1: rule__YAnnotTable__Group__7 : rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8 ;
    public final void rule__YAnnotTable__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3677:1: ( rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8 )
            // InternalModel.g:3678:2: rule__YAnnotTable__Group__7__Impl rule__YAnnotTable__Group__8
            {
            pushFollow(FOLLOW_35);
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
    // InternalModel.g:3685:1: rule__YAnnotTable__Group__7__Impl : ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? ) ;
    public final void rule__YAnnotTable__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3689:1: ( ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? ) )
            // InternalModel.g:3690:1: ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? )
            {
            // InternalModel.g:3690:1: ( ( rule__YAnnotTable__PrimarykeyAssignment_7 )? )
            // InternalModel.g:3691:2: ( rule__YAnnotTable__PrimarykeyAssignment_7 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getPrimarykeyAssignment_7()); 
            }
            // InternalModel.g:3692:2: ( rule__YAnnotTable__PrimarykeyAssignment_7 )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==44) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // InternalModel.g:3692:3: rule__YAnnotTable__PrimarykeyAssignment_7
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
    // InternalModel.g:3700:1: rule__YAnnotTable__Group__8 : rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9 ;
    public final void rule__YAnnotTable__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3704:1: ( rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9 )
            // InternalModel.g:3705:2: rule__YAnnotTable__Group__8__Impl rule__YAnnotTable__Group__9
            {
            pushFollow(FOLLOW_35);
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
    // InternalModel.g:3712:1: rule__YAnnotTable__Group__8__Impl : ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* ) ;
    public final void rule__YAnnotTable__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3716:1: ( ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* ) )
            // InternalModel.g:3717:1: ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* )
            {
            // InternalModel.g:3717:1: ( ( rule__YAnnotTable__ForeignkeysAssignment_8 )* )
            // InternalModel.g:3718:2: ( rule__YAnnotTable__ForeignkeysAssignment_8 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getForeignkeysAssignment_8()); 
            }
            // InternalModel.g:3719:2: ( rule__YAnnotTable__ForeignkeysAssignment_8 )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==45) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // InternalModel.g:3719:3: rule__YAnnotTable__ForeignkeysAssignment_8
            	    {
            	    pushFollow(FOLLOW_37);
            	    rule__YAnnotTable__ForeignkeysAssignment_8();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop35;
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
    // InternalModel.g:3727:1: rule__YAnnotTable__Group__9 : rule__YAnnotTable__Group__9__Impl ;
    public final void rule__YAnnotTable__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3731:1: ( rule__YAnnotTable__Group__9__Impl )
            // InternalModel.g:3732:2: rule__YAnnotTable__Group__9__Impl
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
    // InternalModel.g:3738:1: rule__YAnnotTable__Group__9__Impl : ( '}' ) ;
    public final void rule__YAnnotTable__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3742:1: ( ( '}' ) )
            // InternalModel.g:3743:1: ( '}' )
            {
            // InternalModel.g:3743:1: ( '}' )
            // InternalModel.g:3744:2: '}'
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
    // InternalModel.g:3754:1: rule__YAnnotColumn__Group__0 : rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1 ;
    public final void rule__YAnnotColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3758:1: ( rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1 )
            // InternalModel.g:3759:2: rule__YAnnotColumn__Group__0__Impl rule__YAnnotColumn__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalModel.g:3766:1: rule__YAnnotColumn__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3770:1: ( ( () ) )
            // InternalModel.g:3771:1: ( () )
            {
            // InternalModel.g:3771:1: ( () )
            // InternalModel.g:3772:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getYAnnotColumnAction_0()); 
            }
            // InternalModel.g:3773:2: ()
            // InternalModel.g:3773:3: 
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
    // InternalModel.g:3781:1: rule__YAnnotColumn__Group__1 : rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2 ;
    public final void rule__YAnnotColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3785:1: ( rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2 )
            // InternalModel.g:3786:2: rule__YAnnotColumn__Group__1__Impl rule__YAnnotColumn__Group__2
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
    // InternalModel.g:3793:1: rule__YAnnotColumn__Group__1__Impl : ( '->' ) ;
    public final void rule__YAnnotColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3797:1: ( ( '->' ) )
            // InternalModel.g:3798:1: ( '->' )
            {
            // InternalModel.g:3798:1: ( '->' )
            // InternalModel.g:3799:2: '->'
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
    // InternalModel.g:3808:1: rule__YAnnotColumn__Group__2 : rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3 ;
    public final void rule__YAnnotColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3812:1: ( rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3 )
            // InternalModel.g:3813:2: rule__YAnnotColumn__Group__2__Impl rule__YAnnotColumn__Group__3
            {
            pushFollow(FOLLOW_38);
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
    // InternalModel.g:3820:1: rule__YAnnotColumn__Group__2__Impl : ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) ) ;
    public final void rule__YAnnotColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3824:1: ( ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) ) )
            // InternalModel.g:3825:1: ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) )
            {
            // InternalModel.g:3825:1: ( ( rule__YAnnotColumn__AttrrefAssignment_2 ) )
            // InternalModel.g:3826:2: ( rule__YAnnotColumn__AttrrefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAttrrefAssignment_2()); 
            }
            // InternalModel.g:3827:2: ( rule__YAnnotColumn__AttrrefAssignment_2 )
            // InternalModel.g:3827:3: rule__YAnnotColumn__AttrrefAssignment_2
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
    // InternalModel.g:3835:1: rule__YAnnotColumn__Group__3 : rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4 ;
    public final void rule__YAnnotColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3839:1: ( rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4 )
            // InternalModel.g:3840:2: rule__YAnnotColumn__Group__3__Impl rule__YAnnotColumn__Group__4
            {
            pushFollow(FOLLOW_39);
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
    // InternalModel.g:3847:1: rule__YAnnotColumn__Group__3__Impl : ( 'as' ) ;
    public final void rule__YAnnotColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3851:1: ( ( 'as' ) )
            // InternalModel.g:3852:1: ( 'as' )
            {
            // InternalModel.g:3852:1: ( 'as' )
            // InternalModel.g:3853:2: 'as'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAsKeyword_3()); 
            }
            match(input,42,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:3862:1: rule__YAnnotColumn__Group__4 : rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5 ;
    public final void rule__YAnnotColumn__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3866:1: ( rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5 )
            // InternalModel.g:3867:2: rule__YAnnotColumn__Group__4__Impl rule__YAnnotColumn__Group__5
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
    // InternalModel.g:3874:1: rule__YAnnotColumn__Group__4__Impl : ( ( rule__YAnnotColumn__TypeAssignment_4 ) ) ;
    public final void rule__YAnnotColumn__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3878:1: ( ( ( rule__YAnnotColumn__TypeAssignment_4 ) ) )
            // InternalModel.g:3879:1: ( ( rule__YAnnotColumn__TypeAssignment_4 ) )
            {
            // InternalModel.g:3879:1: ( ( rule__YAnnotColumn__TypeAssignment_4 ) )
            // InternalModel.g:3880:2: ( rule__YAnnotColumn__TypeAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getTypeAssignment_4()); 
            }
            // InternalModel.g:3881:2: ( rule__YAnnotColumn__TypeAssignment_4 )
            // InternalModel.g:3881:3: rule__YAnnotColumn__TypeAssignment_4
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
    // InternalModel.g:3889:1: rule__YAnnotColumn__Group__5 : rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6 ;
    public final void rule__YAnnotColumn__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3893:1: ( rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6 )
            // InternalModel.g:3894:2: rule__YAnnotColumn__Group__5__Impl rule__YAnnotColumn__Group__6
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
    // InternalModel.g:3901:1: rule__YAnnotColumn__Group__5__Impl : ( ( rule__YAnnotColumn__OptionalAssignment_5 )? ) ;
    public final void rule__YAnnotColumn__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3905:1: ( ( ( rule__YAnnotColumn__OptionalAssignment_5 )? ) )
            // InternalModel.g:3906:1: ( ( rule__YAnnotColumn__OptionalAssignment_5 )? )
            {
            // InternalModel.g:3906:1: ( ( rule__YAnnotColumn__OptionalAssignment_5 )? )
            // InternalModel.g:3907:2: ( rule__YAnnotColumn__OptionalAssignment_5 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalAssignment_5()); 
            }
            // InternalModel.g:3908:2: ( rule__YAnnotColumn__OptionalAssignment_5 )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==48) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // InternalModel.g:3908:3: rule__YAnnotColumn__OptionalAssignment_5
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
    // InternalModel.g:3916:1: rule__YAnnotColumn__Group__6 : rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7 ;
    public final void rule__YAnnotColumn__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3920:1: ( rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7 )
            // InternalModel.g:3921:2: rule__YAnnotColumn__Group__6__Impl rule__YAnnotColumn__Group__7
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
    // InternalModel.g:3928:1: rule__YAnnotColumn__Group__6__Impl : ( ( rule__YAnnotColumn__Group_6__0 )? ) ;
    public final void rule__YAnnotColumn__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3932:1: ( ( ( rule__YAnnotColumn__Group_6__0 )? ) )
            // InternalModel.g:3933:1: ( ( rule__YAnnotColumn__Group_6__0 )? )
            {
            // InternalModel.g:3933:1: ( ( rule__YAnnotColumn__Group_6__0 )? )
            // InternalModel.g:3934:2: ( rule__YAnnotColumn__Group_6__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6()); 
            }
            // InternalModel.g:3935:2: ( rule__YAnnotColumn__Group_6__0 )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==29) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // InternalModel.g:3935:3: rule__YAnnotColumn__Group_6__0
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
    // InternalModel.g:3943:1: rule__YAnnotColumn__Group__7 : rule__YAnnotColumn__Group__7__Impl ;
    public final void rule__YAnnotColumn__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3947:1: ( rule__YAnnotColumn__Group__7__Impl )
            // InternalModel.g:3948:2: rule__YAnnotColumn__Group__7__Impl
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
    // InternalModel.g:3954:1: rule__YAnnotColumn__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotColumn__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3958:1: ( ( ( ';' )? ) )
            // InternalModel.g:3959:1: ( ( ';' )? )
            {
            // InternalModel.g:3959:1: ( ( ';' )? )
            // InternalModel.g:3960:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:3961:2: ( ';' )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==24) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // InternalModel.g:3961:3: ';'
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
    // InternalModel.g:3970:1: rule__YAnnotColumn__Group_6__0 : rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1 ;
    public final void rule__YAnnotColumn__Group_6__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3974:1: ( rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1 )
            // InternalModel.g:3975:2: rule__YAnnotColumn__Group_6__0__Impl rule__YAnnotColumn__Group_6__1
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
    // InternalModel.g:3982:1: rule__YAnnotColumn__Group_6__0__Impl : ( ( '(' ) ) ;
    public final void rule__YAnnotColumn__Group_6__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:3986:1: ( ( ( '(' ) ) )
            // InternalModel.g:3987:1: ( ( '(' ) )
            {
            // InternalModel.g:3987:1: ( ( '(' ) )
            // InternalModel.g:3988:2: ( '(' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getLeftParenthesisKeyword_6_0()); 
            }
            // InternalModel.g:3989:2: ( '(' )
            // InternalModel.g:3989:3: '('
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
    // InternalModel.g:3997:1: rule__YAnnotColumn__Group_6__1 : rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2 ;
    public final void rule__YAnnotColumn__Group_6__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4001:1: ( rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2 )
            // InternalModel.g:4002:2: rule__YAnnotColumn__Group_6__1__Impl rule__YAnnotColumn__Group_6__2
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
    // InternalModel.g:4009:1: rule__YAnnotColumn__Group_6__1__Impl : ( ( rule__YAnnotColumn__Group_6_1__0 )? ) ;
    public final void rule__YAnnotColumn__Group_6__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4013:1: ( ( ( rule__YAnnotColumn__Group_6_1__0 )? ) )
            // InternalModel.g:4014:1: ( ( rule__YAnnotColumn__Group_6_1__0 )? )
            {
            // InternalModel.g:4014:1: ( ( rule__YAnnotColumn__Group_6_1__0 )? )
            // InternalModel.g:4015:2: ( rule__YAnnotColumn__Group_6_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6_1()); 
            }
            // InternalModel.g:4016:2: ( rule__YAnnotColumn__Group_6_1__0 )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==RULE_ID) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // InternalModel.g:4016:3: rule__YAnnotColumn__Group_6_1__0
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
    // InternalModel.g:4024:1: rule__YAnnotColumn__Group_6__2 : rule__YAnnotColumn__Group_6__2__Impl ;
    public final void rule__YAnnotColumn__Group_6__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4028:1: ( rule__YAnnotColumn__Group_6__2__Impl )
            // InternalModel.g:4029:2: rule__YAnnotColumn__Group_6__2__Impl
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
    // InternalModel.g:4035:1: rule__YAnnotColumn__Group_6__2__Impl : ( ')' ) ;
    public final void rule__YAnnotColumn__Group_6__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4039:1: ( ( ')' ) )
            // InternalModel.g:4040:1: ( ')' )
            {
            // InternalModel.g:4040:1: ( ')' )
            // InternalModel.g:4041:2: ')'
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
    // InternalModel.g:4051:1: rule__YAnnotColumn__Group_6_1__0 : rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1 ;
    public final void rule__YAnnotColumn__Group_6_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4055:1: ( rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1 )
            // InternalModel.g:4056:2: rule__YAnnotColumn__Group_6_1__0__Impl rule__YAnnotColumn__Group_6_1__1
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
    // InternalModel.g:4063:1: rule__YAnnotColumn__Group_6_1__0__Impl : ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) ) ;
    public final void rule__YAnnotColumn__Group_6_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4067:1: ( ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) ) )
            // InternalModel.g:4068:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) )
            {
            // InternalModel.g:4068:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 ) )
            // InternalModel.g:4069:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_0()); 
            }
            // InternalModel.g:4070:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 )
            // InternalModel.g:4070:3: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0
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
    // InternalModel.g:4078:1: rule__YAnnotColumn__Group_6_1__1 : rule__YAnnotColumn__Group_6_1__1__Impl ;
    public final void rule__YAnnotColumn__Group_6_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4082:1: ( rule__YAnnotColumn__Group_6_1__1__Impl )
            // InternalModel.g:4083:2: rule__YAnnotColumn__Group_6_1__1__Impl
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
    // InternalModel.g:4089:1: rule__YAnnotColumn__Group_6_1__1__Impl : ( ( rule__YAnnotColumn__Group_6_1_1__0 )* ) ;
    public final void rule__YAnnotColumn__Group_6_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4093:1: ( ( ( rule__YAnnotColumn__Group_6_1_1__0 )* ) )
            // InternalModel.g:4094:1: ( ( rule__YAnnotColumn__Group_6_1_1__0 )* )
            {
            // InternalModel.g:4094:1: ( ( rule__YAnnotColumn__Group_6_1_1__0 )* )
            // InternalModel.g:4095:2: ( rule__YAnnotColumn__Group_6_1_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getGroup_6_1_1()); 
            }
            // InternalModel.g:4096:2: ( rule__YAnnotColumn__Group_6_1_1__0 )*
            loop40:
            do {
                int alt40=2;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==31) ) {
                    alt40=1;
                }


                switch (alt40) {
            	case 1 :
            	    // InternalModel.g:4096:3: rule__YAnnotColumn__Group_6_1_1__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotColumn__Group_6_1_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop40;
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
    // InternalModel.g:4105:1: rule__YAnnotColumn__Group_6_1_1__0 : rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1 ;
    public final void rule__YAnnotColumn__Group_6_1_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4109:1: ( rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1 )
            // InternalModel.g:4110:2: rule__YAnnotColumn__Group_6_1_1__0__Impl rule__YAnnotColumn__Group_6_1_1__1
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
    // InternalModel.g:4117:1: rule__YAnnotColumn__Group_6_1_1__0__Impl : ( ',' ) ;
    public final void rule__YAnnotColumn__Group_6_1_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4121:1: ( ( ',' ) )
            // InternalModel.g:4122:1: ( ',' )
            {
            // InternalModel.g:4122:1: ( ',' )
            // InternalModel.g:4123:2: ','
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
    // InternalModel.g:4132:1: rule__YAnnotColumn__Group_6_1_1__1 : rule__YAnnotColumn__Group_6_1_1__1__Impl ;
    public final void rule__YAnnotColumn__Group_6_1_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4136:1: ( rule__YAnnotColumn__Group_6_1_1__1__Impl )
            // InternalModel.g:4137:2: rule__YAnnotColumn__Group_6_1_1__1__Impl
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
    // InternalModel.g:4143:1: rule__YAnnotColumn__Group_6_1_1__1__Impl : ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) ) ;
    public final void rule__YAnnotColumn__Group_6_1_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4147:1: ( ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) ) )
            // InternalModel.g:4148:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) )
            {
            // InternalModel.g:4148:1: ( ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 ) )
            // InternalModel.g:4149:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getElementValuePairsAssignment_6_1_1_1()); 
            }
            // InternalModel.g:4150:2: ( rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 )
            // InternalModel.g:4150:3: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1
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
    // InternalModel.g:4159:1: rule__YAnnotColumnLike__Group__0 : rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1 ;
    public final void rule__YAnnotColumnLike__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4163:1: ( rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1 )
            // InternalModel.g:4164:2: rule__YAnnotColumnLike__Group__0__Impl rule__YAnnotColumnLike__Group__1
            {
            pushFollow(FOLLOW_34);
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
    // InternalModel.g:4171:1: rule__YAnnotColumnLike__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotColumnLike__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4175:1: ( ( () ) )
            // InternalModel.g:4176:1: ( () )
            {
            // InternalModel.g:4176:1: ( () )
            // InternalModel.g:4177:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getYAnnotColumnLikeAction_0()); 
            }
            // InternalModel.g:4178:2: ()
            // InternalModel.g:4178:3: 
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
    // InternalModel.g:4186:1: rule__YAnnotColumnLike__Group__1 : rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2 ;
    public final void rule__YAnnotColumnLike__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4190:1: ( rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2 )
            // InternalModel.g:4191:2: rule__YAnnotColumnLike__Group__1__Impl rule__YAnnotColumnLike__Group__2
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
    // InternalModel.g:4198:1: rule__YAnnotColumnLike__Group__1__Impl : ( '->' ) ;
    public final void rule__YAnnotColumnLike__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4202:1: ( ( '->' ) )
            // InternalModel.g:4203:1: ( '->' )
            {
            // InternalModel.g:4203:1: ( '->' )
            // InternalModel.g:4204:2: '->'
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
    // InternalModel.g:4213:1: rule__YAnnotColumnLike__Group__2 : rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3 ;
    public final void rule__YAnnotColumnLike__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4217:1: ( rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3 )
            // InternalModel.g:4218:2: rule__YAnnotColumnLike__Group__2__Impl rule__YAnnotColumnLike__Group__3
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
    // InternalModel.g:4225:1: rule__YAnnotColumnLike__Group__2__Impl : ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) ) ;
    public final void rule__YAnnotColumnLike__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4229:1: ( ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) ) )
            // InternalModel.g:4230:1: ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) )
            {
            // InternalModel.g:4230:1: ( ( rule__YAnnotColumnLike__ColumnrefAssignment_2 ) )
            // InternalModel.g:4231:2: ( rule__YAnnotColumnLike__ColumnrefAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefAssignment_2()); 
            }
            // InternalModel.g:4232:2: ( rule__YAnnotColumnLike__ColumnrefAssignment_2 )
            // InternalModel.g:4232:3: rule__YAnnotColumnLike__ColumnrefAssignment_2
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
    // InternalModel.g:4240:1: rule__YAnnotColumnLike__Group__3 : rule__YAnnotColumnLike__Group__3__Impl ;
    public final void rule__YAnnotColumnLike__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4244:1: ( rule__YAnnotColumnLike__Group__3__Impl )
            // InternalModel.g:4245:2: rule__YAnnotColumnLike__Group__3__Impl
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
    // InternalModel.g:4251:1: rule__YAnnotColumnLike__Group__3__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotColumnLike__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4255:1: ( ( ( ';' )? ) )
            // InternalModel.g:4256:1: ( ( ';' )? )
            {
            // InternalModel.g:4256:1: ( ( ';' )? )
            // InternalModel.g:4257:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getSemicolonKeyword_3()); 
            }
            // InternalModel.g:4258:2: ( ';' )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==24) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // InternalModel.g:4258:3: ';'
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
    // InternalModel.g:4267:1: rule__YAnnotAbstractColumn__Group__0 : rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1 ;
    public final void rule__YAnnotAbstractColumn__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4271:1: ( rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1 )
            // InternalModel.g:4272:2: rule__YAnnotAbstractColumn__Group__0__Impl rule__YAnnotAbstractColumn__Group__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalModel.g:4279:1: rule__YAnnotAbstractColumn__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotAbstractColumn__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4283:1: ( ( () ) )
            // InternalModel.g:4284:1: ( () )
            {
            // InternalModel.g:4284:1: ( () )
            // InternalModel.g:4285:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getYAnnotAbstractColumnAction_0()); 
            }
            // InternalModel.g:4286:2: ()
            // InternalModel.g:4286:3: 
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
    // InternalModel.g:4294:1: rule__YAnnotAbstractColumn__Group__1 : rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2 ;
    public final void rule__YAnnotAbstractColumn__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4298:1: ( rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2 )
            // InternalModel.g:4299:2: rule__YAnnotAbstractColumn__Group__1__Impl rule__YAnnotAbstractColumn__Group__2
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
    // InternalModel.g:4306:1: rule__YAnnotAbstractColumn__Group__1__Impl : ( '@column' ) ;
    public final void rule__YAnnotAbstractColumn__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4310:1: ( ( '@column' ) )
            // InternalModel.g:4311:1: ( '@column' )
            {
            // InternalModel.g:4311:1: ( '@column' )
            // InternalModel.g:4312:2: '@column'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getColumnKeyword_1()); 
            }
            match(input,43,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:4321:1: rule__YAnnotAbstractColumn__Group__2 : rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3 ;
    public final void rule__YAnnotAbstractColumn__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4325:1: ( rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3 )
            // InternalModel.g:4326:2: rule__YAnnotAbstractColumn__Group__2__Impl rule__YAnnotAbstractColumn__Group__3
            {
            pushFollow(FOLLOW_34);
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
    // InternalModel.g:4333:1: rule__YAnnotAbstractColumn__Group__2__Impl : ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) ) ;
    public final void rule__YAnnotAbstractColumn__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4337:1: ( ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) ) )
            // InternalModel.g:4338:1: ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) )
            {
            // InternalModel.g:4338:1: ( ( rule__YAnnotAbstractColumn__NameAssignment_2 ) )
            // InternalModel.g:4339:2: ( rule__YAnnotAbstractColumn__NameAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getNameAssignment_2()); 
            }
            // InternalModel.g:4340:2: ( rule__YAnnotAbstractColumn__NameAssignment_2 )
            // InternalModel.g:4340:3: rule__YAnnotAbstractColumn__NameAssignment_2
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
    // InternalModel.g:4348:1: rule__YAnnotAbstractColumn__Group__3 : rule__YAnnotAbstractColumn__Group__3__Impl ;
    public final void rule__YAnnotAbstractColumn__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4352:1: ( rule__YAnnotAbstractColumn__Group__3__Impl )
            // InternalModel.g:4353:2: rule__YAnnotAbstractColumn__Group__3__Impl
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
    // InternalModel.g:4359:1: rule__YAnnotAbstractColumn__Group__3__Impl : ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) ) ;
    public final void rule__YAnnotAbstractColumn__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4363:1: ( ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) ) )
            // InternalModel.g:4364:1: ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) )
            {
            // InternalModel.g:4364:1: ( ( rule__YAnnotAbstractColumn__TypeAssignment_3 ) )
            // InternalModel.g:4365:2: ( rule__YAnnotAbstractColumn__TypeAssignment_3 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAssignment_3()); 
            }
            // InternalModel.g:4366:2: ( rule__YAnnotAbstractColumn__TypeAssignment_3 )
            // InternalModel.g:4366:3: rule__YAnnotAbstractColumn__TypeAssignment_3
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
    // InternalModel.g:4375:1: rule__YAnnotPrimaryKey__Group__0 : rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1 ;
    public final void rule__YAnnotPrimaryKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4379:1: ( rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1 )
            // InternalModel.g:4380:2: rule__YAnnotPrimaryKey__Group__0__Impl rule__YAnnotPrimaryKey__Group__1
            {
            pushFollow(FOLLOW_41);
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
    // InternalModel.g:4387:1: rule__YAnnotPrimaryKey__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotPrimaryKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4391:1: ( ( () ) )
            // InternalModel.g:4392:1: ( () )
            {
            // InternalModel.g:4392:1: ( () )
            // InternalModel.g:4393:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getYAnnotPrimaryKeyAction_0()); 
            }
            // InternalModel.g:4394:2: ()
            // InternalModel.g:4394:3: 
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
    // InternalModel.g:4402:1: rule__YAnnotPrimaryKey__Group__1 : rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2 ;
    public final void rule__YAnnotPrimaryKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4406:1: ( rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2 )
            // InternalModel.g:4407:2: rule__YAnnotPrimaryKey__Group__1__Impl rule__YAnnotPrimaryKey__Group__2
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
    // InternalModel.g:4414:1: rule__YAnnotPrimaryKey__Group__1__Impl : ( '@primary' ) ;
    public final void rule__YAnnotPrimaryKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4418:1: ( ( '@primary' ) )
            // InternalModel.g:4419:1: ( '@primary' )
            {
            // InternalModel.g:4419:1: ( '@primary' )
            // InternalModel.g:4420:2: '@primary'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getPrimaryKeyword_1()); 
            }
            match(input,44,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:4429:1: rule__YAnnotPrimaryKey__Group__2 : rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3 ;
    public final void rule__YAnnotPrimaryKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4433:1: ( rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3 )
            // InternalModel.g:4434:2: rule__YAnnotPrimaryKey__Group__2__Impl rule__YAnnotPrimaryKey__Group__3
            {
            pushFollow(FOLLOW_42);
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
    // InternalModel.g:4441:1: rule__YAnnotPrimaryKey__Group__2__Impl : ( '(' ) ;
    public final void rule__YAnnotPrimaryKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4445:1: ( ( '(' ) )
            // InternalModel.g:4446:1: ( '(' )
            {
            // InternalModel.g:4446:1: ( '(' )
            // InternalModel.g:4447:2: '('
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
    // InternalModel.g:4456:1: rule__YAnnotPrimaryKey__Group__3 : rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4 ;
    public final void rule__YAnnotPrimaryKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4460:1: ( rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4 )
            // InternalModel.g:4461:2: rule__YAnnotPrimaryKey__Group__3__Impl rule__YAnnotPrimaryKey__Group__4
            {
            pushFollow(FOLLOW_42);
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
    // InternalModel.g:4468:1: rule__YAnnotPrimaryKey__Group__3__Impl : ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* ) ;
    public final void rule__YAnnotPrimaryKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4472:1: ( ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* ) )
            // InternalModel.g:4473:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* )
            {
            // InternalModel.g:4473:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )* )
            // InternalModel.g:4474:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_3()); 
            }
            // InternalModel.g:4475:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_3 )*
            loop42:
            do {
                int alt42=2;
                int LA42_0 = input.LA(1);

                if ( (LA42_0==RULE_ID) ) {
                    alt42=1;
                }


                switch (alt42) {
            	case 1 :
            	    // InternalModel.g:4475:3: rule__YAnnotPrimaryKey__ColumnsAssignment_3
            	    {
            	    pushFollow(FOLLOW_43);
            	    rule__YAnnotPrimaryKey__ColumnsAssignment_3();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop42;
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
    // InternalModel.g:4483:1: rule__YAnnotPrimaryKey__Group__4 : rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5 ;
    public final void rule__YAnnotPrimaryKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4487:1: ( rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5 )
            // InternalModel.g:4488:2: rule__YAnnotPrimaryKey__Group__4__Impl rule__YAnnotPrimaryKey__Group__5
            {
            pushFollow(FOLLOW_42);
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
    // InternalModel.g:4495:1: rule__YAnnotPrimaryKey__Group__4__Impl : ( ( rule__YAnnotPrimaryKey__Group_4__0 )* ) ;
    public final void rule__YAnnotPrimaryKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4499:1: ( ( ( rule__YAnnotPrimaryKey__Group_4__0 )* ) )
            // InternalModel.g:4500:1: ( ( rule__YAnnotPrimaryKey__Group_4__0 )* )
            {
            // InternalModel.g:4500:1: ( ( rule__YAnnotPrimaryKey__Group_4__0 )* )
            // InternalModel.g:4501:2: ( rule__YAnnotPrimaryKey__Group_4__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getGroup_4()); 
            }
            // InternalModel.g:4502:2: ( rule__YAnnotPrimaryKey__Group_4__0 )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==31) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // InternalModel.g:4502:3: rule__YAnnotPrimaryKey__Group_4__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotPrimaryKey__Group_4__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop43;
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
    // InternalModel.g:4510:1: rule__YAnnotPrimaryKey__Group__5 : rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6 ;
    public final void rule__YAnnotPrimaryKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4514:1: ( rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6 )
            // InternalModel.g:4515:2: rule__YAnnotPrimaryKey__Group__5__Impl rule__YAnnotPrimaryKey__Group__6
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
    // InternalModel.g:4522:1: rule__YAnnotPrimaryKey__Group__5__Impl : ( ')' ) ;
    public final void rule__YAnnotPrimaryKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4526:1: ( ( ')' ) )
            // InternalModel.g:4527:1: ( ')' )
            {
            // InternalModel.g:4527:1: ( ')' )
            // InternalModel.g:4528:2: ')'
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
    // InternalModel.g:4537:1: rule__YAnnotPrimaryKey__Group__6 : rule__YAnnotPrimaryKey__Group__6__Impl ;
    public final void rule__YAnnotPrimaryKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4541:1: ( rule__YAnnotPrimaryKey__Group__6__Impl )
            // InternalModel.g:4542:2: rule__YAnnotPrimaryKey__Group__6__Impl
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
    // InternalModel.g:4548:1: rule__YAnnotPrimaryKey__Group__6__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotPrimaryKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4552:1: ( ( ( ';' )? ) )
            // InternalModel.g:4553:1: ( ( ';' )? )
            {
            // InternalModel.g:4553:1: ( ( ';' )? )
            // InternalModel.g:4554:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getSemicolonKeyword_6()); 
            }
            // InternalModel.g:4555:2: ( ';' )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==24) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // InternalModel.g:4555:3: ';'
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
    // InternalModel.g:4564:1: rule__YAnnotPrimaryKey__Group_4__0 : rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1 ;
    public final void rule__YAnnotPrimaryKey__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4568:1: ( rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1 )
            // InternalModel.g:4569:2: rule__YAnnotPrimaryKey__Group_4__0__Impl rule__YAnnotPrimaryKey__Group_4__1
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
    // InternalModel.g:4576:1: rule__YAnnotPrimaryKey__Group_4__0__Impl : ( ',' ) ;
    public final void rule__YAnnotPrimaryKey__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4580:1: ( ( ',' ) )
            // InternalModel.g:4581:1: ( ',' )
            {
            // InternalModel.g:4581:1: ( ',' )
            // InternalModel.g:4582:2: ','
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
    // InternalModel.g:4591:1: rule__YAnnotPrimaryKey__Group_4__1 : rule__YAnnotPrimaryKey__Group_4__1__Impl ;
    public final void rule__YAnnotPrimaryKey__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4595:1: ( rule__YAnnotPrimaryKey__Group_4__1__Impl )
            // InternalModel.g:4596:2: rule__YAnnotPrimaryKey__Group_4__1__Impl
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
    // InternalModel.g:4602:1: rule__YAnnotPrimaryKey__Group_4__1__Impl : ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) ) ;
    public final void rule__YAnnotPrimaryKey__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4606:1: ( ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) ) )
            // InternalModel.g:4607:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) )
            {
            // InternalModel.g:4607:1: ( ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 ) )
            // InternalModel.g:4608:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsAssignment_4_1()); 
            }
            // InternalModel.g:4609:2: ( rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 )
            // InternalModel.g:4609:3: rule__YAnnotPrimaryKey__ColumnsAssignment_4_1
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
    // InternalModel.g:4618:1: rule__YAnnotForeignKey__Group__0 : rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1 ;
    public final void rule__YAnnotForeignKey__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4622:1: ( rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1 )
            // InternalModel.g:4623:2: rule__YAnnotForeignKey__Group__0__Impl rule__YAnnotForeignKey__Group__1
            {
            pushFollow(FOLLOW_44);
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
    // InternalModel.g:4630:1: rule__YAnnotForeignKey__Group__0__Impl : ( () ) ;
    public final void rule__YAnnotForeignKey__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4634:1: ( ( () ) )
            // InternalModel.g:4635:1: ( () )
            {
            // InternalModel.g:4635:1: ( () )
            // InternalModel.g:4636:2: ()
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getYAnnotForeignKeyAction_0()); 
            }
            // InternalModel.g:4637:2: ()
            // InternalModel.g:4637:3: 
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
    // InternalModel.g:4645:1: rule__YAnnotForeignKey__Group__1 : rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2 ;
    public final void rule__YAnnotForeignKey__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4649:1: ( rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2 )
            // InternalModel.g:4650:2: rule__YAnnotForeignKey__Group__1__Impl rule__YAnnotForeignKey__Group__2
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
    // InternalModel.g:4657:1: rule__YAnnotForeignKey__Group__1__Impl : ( '@foreign' ) ;
    public final void rule__YAnnotForeignKey__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4661:1: ( ( '@foreign' ) )
            // InternalModel.g:4662:1: ( '@foreign' )
            {
            // InternalModel.g:4662:1: ( '@foreign' )
            // InternalModel.g:4663:2: '@foreign'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getForeignKeyword_1()); 
            }
            match(input,45,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:4672:1: rule__YAnnotForeignKey__Group__2 : rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3 ;
    public final void rule__YAnnotForeignKey__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4676:1: ( rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3 )
            // InternalModel.g:4677:2: rule__YAnnotForeignKey__Group__2__Impl rule__YAnnotForeignKey__Group__3
            {
            pushFollow(FOLLOW_30);
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
    // InternalModel.g:4684:1: rule__YAnnotForeignKey__Group__2__Impl : ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) ) ;
    public final void rule__YAnnotForeignKey__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4688:1: ( ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) ) )
            // InternalModel.g:4689:1: ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) )
            {
            // InternalModel.g:4689:1: ( ( rule__YAnnotForeignKey__RelationshipAssignment_2 ) )
            // InternalModel.g:4690:2: ( rule__YAnnotForeignKey__RelationshipAssignment_2 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipAssignment_2()); 
            }
            // InternalModel.g:4691:2: ( rule__YAnnotForeignKey__RelationshipAssignment_2 )
            // InternalModel.g:4691:3: rule__YAnnotForeignKey__RelationshipAssignment_2
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
    // InternalModel.g:4699:1: rule__YAnnotForeignKey__Group__3 : rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4 ;
    public final void rule__YAnnotForeignKey__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4703:1: ( rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4 )
            // InternalModel.g:4704:2: rule__YAnnotForeignKey__Group__3__Impl rule__YAnnotForeignKey__Group__4
            {
            pushFollow(FOLLOW_40);
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
    // InternalModel.g:4711:1: rule__YAnnotForeignKey__Group__3__Impl : ( '{' ) ;
    public final void rule__YAnnotForeignKey__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4715:1: ( ( '{' ) )
            // InternalModel.g:4716:1: ( '{' )
            {
            // InternalModel.g:4716:1: ( '{' )
            // InternalModel.g:4717:2: '{'
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
    // InternalModel.g:4726:1: rule__YAnnotForeignKey__Group__4 : rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5 ;
    public final void rule__YAnnotForeignKey__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4730:1: ( rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5 )
            // InternalModel.g:4731:2: rule__YAnnotForeignKey__Group__4__Impl rule__YAnnotForeignKey__Group__5
            {
            pushFollow(FOLLOW_45);
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
    // InternalModel.g:4738:1: rule__YAnnotForeignKey__Group__4__Impl : ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) ) ;
    public final void rule__YAnnotForeignKey__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4742:1: ( ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) ) )
            // InternalModel.g:4743:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) )
            {
            // InternalModel.g:4743:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_4 ) )
            // InternalModel.g:4744:2: ( rule__YAnnotForeignKey__ColumnsAssignment_4 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_4()); 
            }
            // InternalModel.g:4745:2: ( rule__YAnnotForeignKey__ColumnsAssignment_4 )
            // InternalModel.g:4745:3: rule__YAnnotForeignKey__ColumnsAssignment_4
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
    // InternalModel.g:4753:1: rule__YAnnotForeignKey__Group__5 : rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6 ;
    public final void rule__YAnnotForeignKey__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4757:1: ( rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6 )
            // InternalModel.g:4758:2: rule__YAnnotForeignKey__Group__5__Impl rule__YAnnotForeignKey__Group__6
            {
            pushFollow(FOLLOW_45);
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
    // InternalModel.g:4765:1: rule__YAnnotForeignKey__Group__5__Impl : ( ( rule__YAnnotForeignKey__Group_5__0 )* ) ;
    public final void rule__YAnnotForeignKey__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4769:1: ( ( ( rule__YAnnotForeignKey__Group_5__0 )* ) )
            // InternalModel.g:4770:1: ( ( rule__YAnnotForeignKey__Group_5__0 )* )
            {
            // InternalModel.g:4770:1: ( ( rule__YAnnotForeignKey__Group_5__0 )* )
            // InternalModel.g:4771:2: ( rule__YAnnotForeignKey__Group_5__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getGroup_5()); 
            }
            // InternalModel.g:4772:2: ( rule__YAnnotForeignKey__Group_5__0 )*
            loop45:
            do {
                int alt45=2;
                int LA45_0 = input.LA(1);

                if ( (LA45_0==31) ) {
                    alt45=1;
                }


                switch (alt45) {
            	case 1 :
            	    // InternalModel.g:4772:3: rule__YAnnotForeignKey__Group_5__0
            	    {
            	    pushFollow(FOLLOW_14);
            	    rule__YAnnotForeignKey__Group_5__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop45;
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
    // InternalModel.g:4780:1: rule__YAnnotForeignKey__Group__6 : rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7 ;
    public final void rule__YAnnotForeignKey__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4784:1: ( rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7 )
            // InternalModel.g:4785:2: rule__YAnnotForeignKey__Group__6__Impl rule__YAnnotForeignKey__Group__7
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
    // InternalModel.g:4792:1: rule__YAnnotForeignKey__Group__6__Impl : ( '}' ) ;
    public final void rule__YAnnotForeignKey__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4796:1: ( ( '}' ) )
            // InternalModel.g:4797:1: ( '}' )
            {
            // InternalModel.g:4797:1: ( '}' )
            // InternalModel.g:4798:2: '}'
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
    // InternalModel.g:4807:1: rule__YAnnotForeignKey__Group__7 : rule__YAnnotForeignKey__Group__7__Impl ;
    public final void rule__YAnnotForeignKey__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4811:1: ( rule__YAnnotForeignKey__Group__7__Impl )
            // InternalModel.g:4812:2: rule__YAnnotForeignKey__Group__7__Impl
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
    // InternalModel.g:4818:1: rule__YAnnotForeignKey__Group__7__Impl : ( ( ';' )? ) ;
    public final void rule__YAnnotForeignKey__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4822:1: ( ( ( ';' )? ) )
            // InternalModel.g:4823:1: ( ( ';' )? )
            {
            // InternalModel.g:4823:1: ( ( ';' )? )
            // InternalModel.g:4824:2: ( ';' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getSemicolonKeyword_7()); 
            }
            // InternalModel.g:4825:2: ( ';' )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==24) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // InternalModel.g:4825:3: ';'
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
    // InternalModel.g:4834:1: rule__YAnnotForeignKey__Group_5__0 : rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1 ;
    public final void rule__YAnnotForeignKey__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4838:1: ( rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1 )
            // InternalModel.g:4839:2: rule__YAnnotForeignKey__Group_5__0__Impl rule__YAnnotForeignKey__Group_5__1
            {
            pushFollow(FOLLOW_40);
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
    // InternalModel.g:4846:1: rule__YAnnotForeignKey__Group_5__0__Impl : ( ',' ) ;
    public final void rule__YAnnotForeignKey__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4850:1: ( ( ',' ) )
            // InternalModel.g:4851:1: ( ',' )
            {
            // InternalModel.g:4851:1: ( ',' )
            // InternalModel.g:4852:2: ','
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
    // InternalModel.g:4861:1: rule__YAnnotForeignKey__Group_5__1 : rule__YAnnotForeignKey__Group_5__1__Impl ;
    public final void rule__YAnnotForeignKey__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4865:1: ( rule__YAnnotForeignKey__Group_5__1__Impl )
            // InternalModel.g:4866:2: rule__YAnnotForeignKey__Group_5__1__Impl
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
    // InternalModel.g:4872:1: rule__YAnnotForeignKey__Group_5__1__Impl : ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) ) ;
    public final void rule__YAnnotForeignKey__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4876:1: ( ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) ) )
            // InternalModel.g:4877:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) )
            {
            // InternalModel.g:4877:1: ( ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 ) )
            // InternalModel.g:4878:2: ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getColumnsAssignment_5_1()); 
            }
            // InternalModel.g:4879:2: ( rule__YAnnotForeignKey__ColumnsAssignment_5_1 )
            // InternalModel.g:4879:3: rule__YAnnotForeignKey__ColumnsAssignment_5_1
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


    // $ANTLR start "rule__QualifiedName__Group__0"
    // InternalModel.g:4888:1: rule__QualifiedName__Group__0 : rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 ;
    public final void rule__QualifiedName__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4892:1: ( rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1 )
            // InternalModel.g:4893:2: rule__QualifiedName__Group__0__Impl rule__QualifiedName__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalModel.g:4900:1: rule__QualifiedName__Group__0__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4904:1: ( ( ruleValidID ) )
            // InternalModel.g:4905:1: ( ruleValidID )
            {
            // InternalModel.g:4905:1: ( ruleValidID )
            // InternalModel.g:4906:2: ruleValidID
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
    // InternalModel.g:4915:1: rule__QualifiedName__Group__1 : rule__QualifiedName__Group__1__Impl ;
    public final void rule__QualifiedName__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4919:1: ( rule__QualifiedName__Group__1__Impl )
            // InternalModel.g:4920:2: rule__QualifiedName__Group__1__Impl
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
    // InternalModel.g:4926:1: rule__QualifiedName__Group__1__Impl : ( ( rule__QualifiedName__Group_1__0 )* ) ;
    public final void rule__QualifiedName__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4930:1: ( ( ( rule__QualifiedName__Group_1__0 )* ) )
            // InternalModel.g:4931:1: ( ( rule__QualifiedName__Group_1__0 )* )
            {
            // InternalModel.g:4931:1: ( ( rule__QualifiedName__Group_1__0 )* )
            // InternalModel.g:4932:2: ( rule__QualifiedName__Group_1__0 )*
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getGroup_1()); 
            }
            // InternalModel.g:4933:2: ( rule__QualifiedName__Group_1__0 )*
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==46) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // InternalModel.g:4933:3: rule__QualifiedName__Group_1__0
            	    {
            	    pushFollow(FOLLOW_47);
            	    rule__QualifiedName__Group_1__0();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop47;
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
    // InternalModel.g:4942:1: rule__QualifiedName__Group_1__0 : rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 ;
    public final void rule__QualifiedName__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4946:1: ( rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1 )
            // InternalModel.g:4947:2: rule__QualifiedName__Group_1__0__Impl rule__QualifiedName__Group_1__1
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
    // InternalModel.g:4954:1: rule__QualifiedName__Group_1__0__Impl : ( ( '.' ) ) ;
    public final void rule__QualifiedName__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4958:1: ( ( ( '.' ) ) )
            // InternalModel.g:4959:1: ( ( '.' ) )
            {
            // InternalModel.g:4959:1: ( ( '.' ) )
            // InternalModel.g:4960:2: ( '.' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameAccess().getFullStopKeyword_1_0()); 
            }
            // InternalModel.g:4961:2: ( '.' )
            // InternalModel.g:4961:3: '.'
            {
            match(input,46,FOLLOW_2); if (state.failed) return ;

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
    // InternalModel.g:4969:1: rule__QualifiedName__Group_1__1 : rule__QualifiedName__Group_1__1__Impl ;
    public final void rule__QualifiedName__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4973:1: ( rule__QualifiedName__Group_1__1__Impl )
            // InternalModel.g:4974:2: rule__QualifiedName__Group_1__1__Impl
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
    // InternalModel.g:4980:1: rule__QualifiedName__Group_1__1__Impl : ( ruleValidID ) ;
    public final void rule__QualifiedName__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:4984:1: ( ( ruleValidID ) )
            // InternalModel.g:4985:1: ( ruleValidID )
            {
            // InternalModel.g:4985:1: ( ruleValidID )
            // InternalModel.g:4986:2: ruleValidID
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
    // InternalModel.g:4996:1: rule__QualifiedNameWithWildcard__Group__0 : rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 ;
    public final void rule__QualifiedNameWithWildcard__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5000:1: ( rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1 )
            // InternalModel.g:5001:2: rule__QualifiedNameWithWildcard__Group__0__Impl rule__QualifiedNameWithWildcard__Group__1
            {
            pushFollow(FOLLOW_48);
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
    // InternalModel.g:5008:1: rule__QualifiedNameWithWildcard__Group__0__Impl : ( ruleQualifiedName ) ;
    public final void rule__QualifiedNameWithWildcard__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5012:1: ( ( ruleQualifiedName ) )
            // InternalModel.g:5013:1: ( ruleQualifiedName )
            {
            // InternalModel.g:5013:1: ( ruleQualifiedName )
            // InternalModel.g:5014:2: ruleQualifiedName
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
    // InternalModel.g:5023:1: rule__QualifiedNameWithWildcard__Group__1 : rule__QualifiedNameWithWildcard__Group__1__Impl ;
    public final void rule__QualifiedNameWithWildcard__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5027:1: ( rule__QualifiedNameWithWildcard__Group__1__Impl )
            // InternalModel.g:5028:2: rule__QualifiedNameWithWildcard__Group__1__Impl
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
    // InternalModel.g:5034:1: rule__QualifiedNameWithWildcard__Group__1__Impl : ( ( '.*' )? ) ;
    public final void rule__QualifiedNameWithWildcard__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5038:1: ( ( ( '.*' )? ) )
            // InternalModel.g:5039:1: ( ( '.*' )? )
            {
            // InternalModel.g:5039:1: ( ( '.*' )? )
            // InternalModel.g:5040:2: ( '.*' )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getQualifiedNameWithWildcardAccess().getFullStopAsteriskKeyword_1()); 
            }
            // InternalModel.g:5041:2: ( '.*' )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==47) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // InternalModel.g:5041:3: '.*'
                    {
                    match(input,47,FOLLOW_2); if (state.failed) return ;

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
    // InternalModel.g:5050:1: rule__Number__Group__0 : rule__Number__Group__0__Impl rule__Number__Group__1 ;
    public final void rule__Number__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5054:1: ( rule__Number__Group__0__Impl rule__Number__Group__1 )
            // InternalModel.g:5055:2: rule__Number__Group__0__Impl rule__Number__Group__1
            {
            pushFollow(FOLLOW_46);
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
    // InternalModel.g:5062:1: rule__Number__Group__0__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5066:1: ( ( RULE_INT ) )
            // InternalModel.g:5067:1: ( RULE_INT )
            {
            // InternalModel.g:5067:1: ( RULE_INT )
            // InternalModel.g:5068:2: RULE_INT
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
    // InternalModel.g:5077:1: rule__Number__Group__1 : rule__Number__Group__1__Impl ;
    public final void rule__Number__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5081:1: ( rule__Number__Group__1__Impl )
            // InternalModel.g:5082:2: rule__Number__Group__1__Impl
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
    // InternalModel.g:5088:1: rule__Number__Group__1__Impl : ( ( rule__Number__Group_1__0 )? ) ;
    public final void rule__Number__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5092:1: ( ( ( rule__Number__Group_1__0 )? ) )
            // InternalModel.g:5093:1: ( ( rule__Number__Group_1__0 )? )
            {
            // InternalModel.g:5093:1: ( ( rule__Number__Group_1__0 )? )
            // InternalModel.g:5094:2: ( rule__Number__Group_1__0 )?
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getGroup_1()); 
            }
            // InternalModel.g:5095:2: ( rule__Number__Group_1__0 )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==46) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // InternalModel.g:5095:3: rule__Number__Group_1__0
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
    // InternalModel.g:5104:1: rule__Number__Group_1__0 : rule__Number__Group_1__0__Impl rule__Number__Group_1__1 ;
    public final void rule__Number__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5108:1: ( rule__Number__Group_1__0__Impl rule__Number__Group_1__1 )
            // InternalModel.g:5109:2: rule__Number__Group_1__0__Impl rule__Number__Group_1__1
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
    // InternalModel.g:5116:1: rule__Number__Group_1__0__Impl : ( '.' ) ;
    public final void rule__Number__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5120:1: ( ( '.' ) )
            // InternalModel.g:5121:1: ( '.' )
            {
            // InternalModel.g:5121:1: ( '.' )
            // InternalModel.g:5122:2: '.'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getNumberAccess().getFullStopKeyword_1_0()); 
            }
            match(input,46,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:5131:1: rule__Number__Group_1__1 : rule__Number__Group_1__1__Impl ;
    public final void rule__Number__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5135:1: ( rule__Number__Group_1__1__Impl )
            // InternalModel.g:5136:2: rule__Number__Group_1__1__Impl
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
    // InternalModel.g:5142:1: rule__Number__Group_1__1__Impl : ( RULE_INT ) ;
    public final void rule__Number__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5146:1: ( ( RULE_INT ) )
            // InternalModel.g:5147:1: ( RULE_INT )
            {
            // InternalModel.g:5147:1: ( RULE_INT )
            // InternalModel.g:5148:2: RULE_INT
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
    // InternalModel.g:5158:1: rule__YModel__NameAssignment_1 : ( ruleQualifiedName ) ;
    public final void rule__YModel__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5162:1: ( ( ruleQualifiedName ) )
            // InternalModel.g:5163:2: ( ruleQualifiedName )
            {
            // InternalModel.g:5163:2: ( ruleQualifiedName )
            // InternalModel.g:5164:3: ruleQualifiedName
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
    // InternalModel.g:5173:1: rule__YModel__ImportsAssignment_3 : ( ruleYImport ) ;
    public final void rule__YModel__ImportsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5177:1: ( ( ruleYImport ) )
            // InternalModel.g:5178:2: ( ruleYImport )
            {
            // InternalModel.g:5178:2: ( ruleYImport )
            // InternalModel.g:5179:3: ruleYImport
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
    // InternalModel.g:5188:1: rule__YModel__AnnotationsAssignment_4 : ( ruleYAnnotation ) ;
    public final void rule__YModel__AnnotationsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5192:1: ( ( ruleYAnnotation ) )
            // InternalModel.g:5193:2: ( ruleYAnnotation )
            {
            // InternalModel.g:5193:2: ( ruleYAnnotation )
            // InternalModel.g:5194:3: ruleYAnnotation
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
    // InternalModel.g:5203:1: rule__YImport__ImportedNamespaceAssignment_1 : ( ruleQualifiedNameWithWildcard ) ;
    public final void rule__YImport__ImportedNamespaceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5207:1: ( ( ruleQualifiedNameWithWildcard ) )
            // InternalModel.g:5208:2: ( ruleQualifiedNameWithWildcard )
            {
            // InternalModel.g:5208:2: ( ruleQualifiedNameWithWildcard )
            // InternalModel.g:5209:3: ruleQualifiedNameWithWildcard
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
    // InternalModel.g:5218:1: rule__YAnnotEntity__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotEntity__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5222:1: ( ( ruleValidID ) )
            // InternalModel.g:5223:2: ( ruleValidID )
            {
            // InternalModel.g:5223:2: ( ruleValidID )
            // InternalModel.g:5224:3: ruleValidID
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
    // InternalModel.g:5233:1: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotEntity__ElementValuePairsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5237:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5238:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5238:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5239:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5248:1: rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotEntity__ElementValuePairsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5252:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5253:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5253:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5254:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5263:1: rule__YAnnotEntity__AnnotationsAssignment_5 : ( ruleYAnnotEntityInner ) ;
    public final void rule__YAnnotEntity__AnnotationsAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5267:1: ( ( ruleYAnnotEntityInner ) )
            // InternalModel.g:5268:2: ( ruleYAnnotEntityInner )
            {
            // InternalModel.g:5268:2: ( ruleYAnnotEntityInner )
            // InternalModel.g:5269:3: ruleYAnnotEntityInner
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
    // InternalModel.g:5278:1: rule__YAnnotAttribute__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotAttribute__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5282:1: ( ( ruleValidID ) )
            // InternalModel.g:5283:2: ( ruleValidID )
            {
            // InternalModel.g:5283:2: ( ruleValidID )
            // InternalModel.g:5284:3: ruleValidID
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
    // InternalModel.g:5293:1: rule__YAnnotAttribute__OptionalAssignment_3 : ( ( '?' ) ) ;
    public final void rule__YAnnotAttribute__OptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5297:1: ( ( ( '?' ) ) )
            // InternalModel.g:5298:2: ( ( '?' ) )
            {
            // InternalModel.g:5298:2: ( ( '?' ) )
            // InternalModel.g:5299:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            // InternalModel.g:5300:3: ( '?' )
            // InternalModel.g:5301:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAttributeAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:5312:1: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5316:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5317:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5317:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5318:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5327:1: rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotAttribute__ElementValuePairsAssignment_4_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5331:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5332:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5332:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5333:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5342:1: rule__YAnnotRelationship__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotRelationship__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5346:1: ( ( ruleValidID ) )
            // InternalModel.g:5347:2: ( ruleValidID )
            {
            // InternalModel.g:5347:2: ( ruleValidID )
            // InternalModel.g:5348:3: ruleValidID
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
    // InternalModel.g:5357:1: rule__YAnnotRelationship__OptionalAssignment_3 : ( ( '?' ) ) ;
    public final void rule__YAnnotRelationship__OptionalAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5361:1: ( ( ( '?' ) ) )
            // InternalModel.g:5362:2: ( ( '?' ) )
            {
            // InternalModel.g:5362:2: ( ( '?' ) )
            // InternalModel.g:5363:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            // InternalModel.g:5364:3: ( '?' )
            // InternalModel.g:5365:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getOptionalQuestionMarkKeyword_3_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:5376:1: rule__YAnnotRelationship__TargetAssignment_5 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotRelationship__TargetAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5380:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5381:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5381:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5382:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getTargetYAnnotEntityCrossReference_5_0()); 
            }
            // InternalModel.g:5383:3: ( ruleQualifiedName )
            // InternalModel.g:5384:4: ruleQualifiedName
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
    // InternalModel.g:5395:1: rule__YAnnotRelationship__ManyAssignment_6 : ( ( '*' ) ) ;
    public final void rule__YAnnotRelationship__ManyAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5399:1: ( ( ( '*' ) ) )
            // InternalModel.g:5400:2: ( ( '*' ) )
            {
            // InternalModel.g:5400:2: ( ( '*' ) )
            // InternalModel.g:5401:3: ( '*' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }
            // InternalModel.g:5402:3: ( '*' )
            // InternalModel.g:5403:4: '*'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getManyAsteriskKeyword_6_0()); 
            }
            match(input,49,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:5414:1: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5418:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5419:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5419:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5420:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5429:1: rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotRelationship__ElementValuePairsAssignment_7_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5433:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5434:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5434:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5435:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5444:1: rule__YAnnotRelationship__InverseAssignment_8_1 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotRelationship__InverseAssignment_8_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5448:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5449:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5449:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5450:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotRelationshipAccess().getInverseYAnnotRelationshipCrossReference_8_1_0()); 
            }
            // InternalModel.g:5451:3: ( ruleQualifiedName )
            // InternalModel.g:5452:4: ruleQualifiedName
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
    // InternalModel.g:5463:1: rule__YAnnotIdentifier__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotIdentifier__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5467:1: ( ( ruleValidID ) )
            // InternalModel.g:5468:2: ( ruleValidID )
            {
            // InternalModel.g:5468:2: ( ruleValidID )
            // InternalModel.g:5469:3: ruleValidID
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
    // InternalModel.g:5478:1: rule__YAnnotIdentifier__AnnotsAssignment_4 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotIdentifier__AnnotsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5482:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5483:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5483:2: ( ( RULE_ID ) )
            // InternalModel.g:5484:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_4_0()); 
            }
            // InternalModel.g:5485:3: ( RULE_ID )
            // InternalModel.g:5486:4: RULE_ID
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
    // InternalModel.g:5497:1: rule__YAnnotIdentifier__AnnotsAssignment_5_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotIdentifier__AnnotsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5501:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5502:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5502:2: ( ( RULE_ID ) )
            // InternalModel.g:5503:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotIdentifierAccess().getAnnotsYAnnotIdInnerCrossReference_5_1_0()); 
            }
            // InternalModel.g:5504:3: ( RULE_ID )
            // InternalModel.g:5505:4: RULE_ID
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
    // InternalModel.g:5516:1: rule__YAnnotationElementValuePair__NameAssignment_0_0_0 : ( ruleValidID ) ;
    public final void rule__YAnnotationElementValuePair__NameAssignment_0_0_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5520:1: ( ( ruleValidID ) )
            // InternalModel.g:5521:2: ( ruleValidID )
            {
            // InternalModel.g:5521:2: ( ruleValidID )
            // InternalModel.g:5522:3: ruleValidID
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
    // InternalModel.g:5531:1: rule__YAnnotationElementValuePair__ValueAssignment_1 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotationElementValuePair__ValueAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5535:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:5536:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:5536:2: ( ruleYAnnotExpression )
            // InternalModel.g:5537:3: ruleYAnnotExpression
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
    // InternalModel.g:5546:1: rule__YAnnotExpression__ValueAssignment_0_1 : ( ruleValidID ) ;
    public final void rule__YAnnotExpression__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5550:1: ( ( ruleValidID ) )
            // InternalModel.g:5551:2: ( ruleValidID )
            {
            // InternalModel.g:5551:2: ( ruleValidID )
            // InternalModel.g:5552:3: ruleValidID
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
    // InternalModel.g:5561:1: rule__YAnnotExpression__ValueAssignment_1_1 : ( RULE_STRING ) ;
    public final void rule__YAnnotExpression__ValueAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5565:1: ( ( RULE_STRING ) )
            // InternalModel.g:5566:2: ( RULE_STRING )
            {
            // InternalModel.g:5566:2: ( RULE_STRING )
            // InternalModel.g:5567:3: RULE_STRING
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
    // InternalModel.g:5576:1: rule__YAnnotExpression__ValueAssignment_2_1 : ( ruleNumber ) ;
    public final void rule__YAnnotExpression__ValueAssignment_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5580:1: ( ( ruleNumber ) )
            // InternalModel.g:5581:2: ( ruleNumber )
            {
            // InternalModel.g:5581:2: ( ruleNumber )
            // InternalModel.g:5582:3: ruleNumber
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
    // InternalModel.g:5591:1: rule__YAnnotExpression__ValueAssignment_3_1 : ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) ) ;
    public final void rule__YAnnotExpression__ValueAssignment_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5595:1: ( ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) ) )
            // InternalModel.g:5596:2: ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) )
            {
            // InternalModel.g:5596:2: ( ( rule__YAnnotExpression__ValueAlternatives_3_1_0 ) )
            // InternalModel.g:5597:3: ( rule__YAnnotExpression__ValueAlternatives_3_1_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotExpressionAccess().getValueAlternatives_3_1_0()); 
            }
            // InternalModel.g:5598:3: ( rule__YAnnotExpression__ValueAlternatives_3_1_0 )
            // InternalModel.g:5598:4: rule__YAnnotExpression__ValueAlternatives_3_1_0
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
    // InternalModel.g:5606:1: rule__YAnnotExpression__ElementsAssignment_4_2_0 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotExpression__ElementsAssignment_4_2_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5610:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:5611:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:5611:2: ( ruleYAnnotExpression )
            // InternalModel.g:5612:3: ruleYAnnotExpression
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
    // InternalModel.g:5621:1: rule__YAnnotExpression__ElementsAssignment_4_2_1_1 : ( ruleYAnnotExpression ) ;
    public final void rule__YAnnotExpression__ElementsAssignment_4_2_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5625:1: ( ( ruleYAnnotExpression ) )
            // InternalModel.g:5626:2: ( ruleYAnnotExpression )
            {
            // InternalModel.g:5626:2: ( ruleYAnnotExpression )
            // InternalModel.g:5627:3: ruleYAnnotExpression
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


    // $ANTLR start "rule__YAnnotTechnicalDesign__NameAssignment_2"
    // InternalModel.g:5636:1: rule__YAnnotTechnicalDesign__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotTechnicalDesign__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5640:1: ( ( ruleValidID ) )
            // InternalModel.g:5641:2: ( ruleValidID )
            {
            // InternalModel.g:5641:2: ( ruleValidID )
            // InternalModel.g:5642:3: ruleValidID
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getNameValidIDParserRuleCall_2_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleValidID();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getNameValidIDParserRuleCall_2_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__NameAssignment_2"


    // $ANTLR start "rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0"
    // InternalModel.g:5651:1: rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5655:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5656:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5656:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5657:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_0_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_0"


    // $ANTLR start "rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1"
    // InternalModel.g:5666:1: rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5670:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5671:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5671:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5672:3: ruleYAnnotationElementValuePair
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0()); 
            }
            pushFollow(FOLLOW_2);
            ruleYAnnotationElementValuePair();

            state._fsp--;
            if (state.failed) return ;
            if ( state.backtracking==0 ) {
               after(grammarAccess.getYAnnotTechnicalDesignAccess().getElementValuePairsYAnnotationElementValuePairParserRuleCall_3_1_1_1_0()); 
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
    // $ANTLR end "rule__YAnnotTechnicalDesign__ElementValuePairsAssignment_3_1_1_1"


    // $ANTLR start "rule__YAnnotTechnicalDesign__FeaturesAssignment_5"
    // InternalModel.g:5681:1: rule__YAnnotTechnicalDesign__FeaturesAssignment_5 : ( ruleYAnnotTable ) ;
    public final void rule__YAnnotTechnicalDesign__FeaturesAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5685:1: ( ( ruleYAnnotTable ) )
            // InternalModel.g:5686:2: ( ruleYAnnotTable )
            {
            // InternalModel.g:5686:2: ( ruleYAnnotTable )
            // InternalModel.g:5687:3: ruleYAnnotTable
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
    // InternalModel.g:5696:1: rule__YAnnotTable__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotTable__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5700:1: ( ( ruleValidID ) )
            // InternalModel.g:5701:2: ( ruleValidID )
            {
            // InternalModel.g:5701:2: ( ruleValidID )
            // InternalModel.g:5702:3: ruleValidID
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
    // InternalModel.g:5711:1: rule__YAnnotTable__EntityrefAssignment_4 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotTable__EntityrefAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5715:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5716:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5716:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5717:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotTableAccess().getEntityrefYAnnotEntityCrossReference_4_0()); 
            }
            // InternalModel.g:5718:3: ( ruleQualifiedName )
            // InternalModel.g:5719:4: ruleQualifiedName
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
    // InternalModel.g:5730:1: rule__YAnnotTable__ColumnsAssignment_6 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotTable__ColumnsAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5734:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:5735:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:5735:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:5736:3: ruleYAnnotAbstractColumn
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
    // InternalModel.g:5745:1: rule__YAnnotTable__PrimarykeyAssignment_7 : ( ruleYAnnotPrimaryKey ) ;
    public final void rule__YAnnotTable__PrimarykeyAssignment_7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5749:1: ( ( ruleYAnnotPrimaryKey ) )
            // InternalModel.g:5750:2: ( ruleYAnnotPrimaryKey )
            {
            // InternalModel.g:5750:2: ( ruleYAnnotPrimaryKey )
            // InternalModel.g:5751:3: ruleYAnnotPrimaryKey
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
    // InternalModel.g:5760:1: rule__YAnnotTable__ForeignkeysAssignment_8 : ( ruleYAnnotForeignKey ) ;
    public final void rule__YAnnotTable__ForeignkeysAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5764:1: ( ( ruleYAnnotForeignKey ) )
            // InternalModel.g:5765:2: ( ruleYAnnotForeignKey )
            {
            // InternalModel.g:5765:2: ( ruleYAnnotForeignKey )
            // InternalModel.g:5766:3: ruleYAnnotForeignKey
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
    // InternalModel.g:5775:1: rule__YAnnotColumn__AttrrefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotColumn__AttrrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5779:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5780:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5780:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5781:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getAttrrefYAnnotAttributeCrossReference_2_0()); 
            }
            // InternalModel.g:5782:3: ( ruleQualifiedName )
            // InternalModel.g:5783:4: ruleQualifiedName
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
    // InternalModel.g:5794:1: rule__YAnnotColumn__TypeAssignment_4 : ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) ) ;
    public final void rule__YAnnotColumn__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5798:1: ( ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) ) )
            // InternalModel.g:5799:2: ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) )
            {
            // InternalModel.g:5799:2: ( ( rule__YAnnotColumn__TypeAlternatives_4_0 ) )
            // InternalModel.g:5800:3: ( rule__YAnnotColumn__TypeAlternatives_4_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getTypeAlternatives_4_0()); 
            }
            // InternalModel.g:5801:3: ( rule__YAnnotColumn__TypeAlternatives_4_0 )
            // InternalModel.g:5801:4: rule__YAnnotColumn__TypeAlternatives_4_0
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
    // InternalModel.g:5809:1: rule__YAnnotColumn__OptionalAssignment_5 : ( ( '?' ) ) ;
    public final void rule__YAnnotColumn__OptionalAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5813:1: ( ( ( '?' ) ) )
            // InternalModel.g:5814:2: ( ( '?' ) )
            {
            // InternalModel.g:5814:2: ( ( '?' ) )
            // InternalModel.g:5815:3: ( '?' )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }
            // InternalModel.g:5816:3: ( '?' )
            // InternalModel.g:5817:4: '?'
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnAccess().getOptionalQuestionMarkKeyword_5_0()); 
            }
            match(input,48,FOLLOW_2); if (state.failed) return ;
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
    // InternalModel.g:5828:1: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotColumn__ElementValuePairsAssignment_6_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5832:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5833:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5833:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5834:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5843:1: rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1 : ( ruleYAnnotationElementValuePair ) ;
    public final void rule__YAnnotColumn__ElementValuePairsAssignment_6_1_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5847:1: ( ( ruleYAnnotationElementValuePair ) )
            // InternalModel.g:5848:2: ( ruleYAnnotationElementValuePair )
            {
            // InternalModel.g:5848:2: ( ruleYAnnotationElementValuePair )
            // InternalModel.g:5849:3: ruleYAnnotationElementValuePair
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
    // InternalModel.g:5858:1: rule__YAnnotColumnLike__ColumnrefAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotColumnLike__ColumnrefAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5862:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5863:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5863:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5864:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotColumnLikeAccess().getColumnrefYAnnotAbstractColumnCrossReference_2_0()); 
            }
            // InternalModel.g:5865:3: ( ruleQualifiedName )
            // InternalModel.g:5866:4: ruleQualifiedName
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
    // InternalModel.g:5877:1: rule__YAnnotAbstractColumn__NameAssignment_2 : ( ruleValidID ) ;
    public final void rule__YAnnotAbstractColumn__NameAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5881:1: ( ( ruleValidID ) )
            // InternalModel.g:5882:2: ( ruleValidID )
            {
            // InternalModel.g:5882:2: ( ruleValidID )
            // InternalModel.g:5883:3: ruleValidID
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
    // InternalModel.g:5892:1: rule__YAnnotAbstractColumn__TypeAssignment_3 : ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) ) ;
    public final void rule__YAnnotAbstractColumn__TypeAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5896:1: ( ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) ) )
            // InternalModel.g:5897:2: ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) )
            {
            // InternalModel.g:5897:2: ( ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 ) )
            // InternalModel.g:5898:3: ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotAbstractColumnAccess().getTypeAlternatives_3_0()); 
            }
            // InternalModel.g:5899:3: ( rule__YAnnotAbstractColumn__TypeAlternatives_3_0 )
            // InternalModel.g:5899:4: rule__YAnnotAbstractColumn__TypeAlternatives_3_0
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
    // InternalModel.g:5907:1: rule__YAnnotPrimaryKey__ColumnsAssignment_3 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotPrimaryKey__ColumnsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5911:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5912:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5912:2: ( ( RULE_ID ) )
            // InternalModel.g:5913:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_3_0()); 
            }
            // InternalModel.g:5914:3: ( RULE_ID )
            // InternalModel.g:5915:4: RULE_ID
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
    // InternalModel.g:5926:1: rule__YAnnotPrimaryKey__ColumnsAssignment_4_1 : ( ( RULE_ID ) ) ;
    public final void rule__YAnnotPrimaryKey__ColumnsAssignment_4_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5930:1: ( ( ( RULE_ID ) ) )
            // InternalModel.g:5931:2: ( ( RULE_ID ) )
            {
            // InternalModel.g:5931:2: ( ( RULE_ID ) )
            // InternalModel.g:5932:3: ( RULE_ID )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotPrimaryKeyAccess().getColumnsYAnnotAbstractColumnCrossReference_4_1_0()); 
            }
            // InternalModel.g:5933:3: ( RULE_ID )
            // InternalModel.g:5934:4: RULE_ID
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
    // InternalModel.g:5945:1: rule__YAnnotForeignKey__RelationshipAssignment_2 : ( ( ruleQualifiedName ) ) ;
    public final void rule__YAnnotForeignKey__RelationshipAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5949:1: ( ( ( ruleQualifiedName ) ) )
            // InternalModel.g:5950:2: ( ( ruleQualifiedName ) )
            {
            // InternalModel.g:5950:2: ( ( ruleQualifiedName ) )
            // InternalModel.g:5951:3: ( ruleQualifiedName )
            {
            if ( state.backtracking==0 ) {
               before(grammarAccess.getYAnnotForeignKeyAccess().getRelationshipYAnnotRelationshipCrossReference_2_0()); 
            }
            // InternalModel.g:5952:3: ( ruleQualifiedName )
            // InternalModel.g:5953:4: ruleQualifiedName
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
    // InternalModel.g:5964:1: rule__YAnnotForeignKey__ColumnsAssignment_4 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotForeignKey__ColumnsAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5968:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:5969:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:5969:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:5970:3: ruleYAnnotAbstractColumn
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
    // InternalModel.g:5979:1: rule__YAnnotForeignKey__ColumnsAssignment_5_1 : ( ruleYAnnotAbstractColumn ) ;
    public final void rule__YAnnotForeignKey__ColumnsAssignment_5_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalModel.g:5983:1: ( ( ruleYAnnotAbstractColumn ) )
            // InternalModel.g:5984:2: ( ruleYAnnotAbstractColumn )
            {
            // InternalModel.g:5984:2: ( ruleYAnnotAbstractColumn )
            // InternalModel.g:5985:3: ruleYAnnotAbstractColumn
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

    // Delegated rules


    protected DFA6 dfa6 = new DFA6(this);
    static final String dfa_1s = "\7\uffff";
    static final String dfa_2s = "\2\uffff\1\4\3\uffff\1\4";
    static final String dfa_3s = "\1\42\1\4\1\30\1\4\2\uffff\1\30";
    static final String dfa_4s = "\1\42\1\4\1\56\1\4\2\uffff\1\56";
    static final String dfa_5s = "\4\uffff\1\2\1\1\1\uffff";
    static final String dfa_6s = "\7\uffff}>";
    static final String[] dfa_7s = {
            "\1\1",
            "\1\2",
            "\1\4\3\uffff\1\4\2\uffff\1\4\12\uffff\1\5\3\4\1\3",
            "\1\6",
            "",
            "",
            "\1\4\3\uffff\1\4\2\uffff\1\4\12\uffff\1\5\3\4\1\3"
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
            return "763:1: rule__YAnnotAbstractColumn__TypeAlternatives_3_0 : ( ( ruleYAnnotColumn ) | ( ruleYAnnotColumnLike ) );";
        }
    }
 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000010007000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000010004000002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000028000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000001310000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000001300000002L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000040000010L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000080000002L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0001000021000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0001000400000000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0002000821000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000001300000000L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x00000000C0000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000008000001870L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x000000C000001870L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000010004000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000020010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000380010000000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_37 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_38 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_39 = new BitSet(new long[]{0x00000000007FE000L});
    public static final BitSet FOLLOW_40 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_41 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_42 = new BitSet(new long[]{0x00000000C0000010L});
    public static final BitSet FOLLOW_43 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_44 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_45 = new BitSet(new long[]{0x0000000090000000L});
    public static final BitSet FOLLOW_46 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_47 = new BitSet(new long[]{0x0000400000000002L});
    public static final BitSet FOLLOW_48 = new BitSet(new long[]{0x0000800000000000L});

}