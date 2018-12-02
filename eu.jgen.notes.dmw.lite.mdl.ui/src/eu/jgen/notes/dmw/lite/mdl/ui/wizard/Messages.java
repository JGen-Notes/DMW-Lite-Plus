package eu.jgen.notes.dmw.lite.mdl.ui.wizard;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {
	private static final String BUNDLE_NAME = "eu.jgen.notes.dmw.lite.mdl.ui.wizard.messages"; //$NON-NLS-1$
	
	public static String HelloWorldProject_Label;
	public static String HelloWorldProject_Description;
	public static String HelloWorldFile_Label;
	public static String HelloWorldFile_Description;
	public static String CreateModelFile_Label;
	public static String CreateModelFile_Description;
	public static String CreateWidgetFile_Label;
	public static String CreateWidgetFile_Description;
	
	static {
	// initialize resource bundle
	NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
