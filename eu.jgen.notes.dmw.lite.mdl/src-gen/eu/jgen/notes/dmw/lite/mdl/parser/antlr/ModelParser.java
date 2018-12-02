/*
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.parser.antlr;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.parser.antlr.internal.InternalModelParser;
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;

public class ModelParser extends AbstractAntlrParser {

	@Inject
	private ModelGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalModelParser createParser(XtextTokenStream stream) {
		return new InternalModelParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "YModel";
	}

	public ModelGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(ModelGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
