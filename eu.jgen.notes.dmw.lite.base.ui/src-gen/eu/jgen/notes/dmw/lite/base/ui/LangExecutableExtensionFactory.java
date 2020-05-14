/*
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.ui;

import com.google.inject.Injector;
import eu.jgen.notes.dmw.lite.base.ui.internal.BaseActivator;
import org.eclipse.core.runtime.Platform;
import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class LangExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return Platform.getBundle(BaseActivator.PLUGIN_ID);
	}
	
	@Override
	protected Injector getInjector() {
		BaseActivator activator = BaseActivator.getInstance();
		return activator != null ? activator.getInjector(BaseActivator.EU_JGEN_NOTES_DMW_LITE_BASE_LANG) : null;
	}

}
