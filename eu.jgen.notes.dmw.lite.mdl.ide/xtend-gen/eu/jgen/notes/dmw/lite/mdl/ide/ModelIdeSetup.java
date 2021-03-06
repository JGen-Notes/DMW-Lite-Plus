/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import eu.jgen.notes.dmw.lite.mdl.ModelRuntimeModule;
import eu.jgen.notes.dmw.lite.mdl.ModelStandaloneSetup;
import eu.jgen.notes.dmw.lite.mdl.ide.ModelIdeModule;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ModelIdeSetup extends ModelStandaloneSetup {
  @Override
  public Injector createInjector() {
    ModelRuntimeModule _modelRuntimeModule = new ModelRuntimeModule();
    ModelIdeModule _modelIdeModule = new ModelIdeModule();
    return Guice.createInjector(Modules2.mixin(_modelRuntimeModule, _modelIdeModule));
  }
}
