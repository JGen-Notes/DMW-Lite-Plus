package eu.jgen.notes.dmw.lite.mdl.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "eu.jgen.notes.dmw.lite.mdl.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String CreateWidgetProject_Label;
	public static String CreateWidgetProject_Description;
	public static String CreateModelFile_Label;
	public static String CreateModelFile_Description;
	public static String CreateWidgetFile_Label;
	public static String CreateWidgetFile_Description;
	public static String DMWProject_Label;
	public static String DMWProject_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
