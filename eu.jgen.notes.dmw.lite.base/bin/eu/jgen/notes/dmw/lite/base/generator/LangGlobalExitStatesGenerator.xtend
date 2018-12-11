package eu.jgen.notes.dmw.lite.base.generator


import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.utility.LangUtil

import java.util.List
import eu.jgen.notes.dmw.lite.utility.LangGeneratorHelperForJava
import eu.jgen.notes.dmw.lite.base.lang.YWidget
import eu.jgen.notes.dmw.lite.base.lang.YClass
import eu.jgen.notes.dmw.lite.base.lang.YProperty

class LangGlobalExitStatesGenerator implements IGenerator {
	
//	@Inject extension LangUtil
	
		@Inject extension LangGeneratorHelperForJava
	
		private List<String> imports = newArrayList()
	

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.allContents.filter[element|element instanceof YWidget].forEach [ element |
			val widget = element as YWidget
			generateWidget(fsa, widget)
		]
	}

	protected def void generateWidget(IFileSystemAccess fsa, YWidget widget) {
				imports.clear		
		widget.classes.forEach [ clazz |
			if (clazz.superclass !== null && clazz.superclass.name == "GlobalExitStates") {
				imports.add("eu.jgen.notes.dmw.lite.runtimes.GlobalExitStates")			
				imports.add("eu.jgen.notes.dmw.lite.runtimes.ExitState")		
				val body = '''
					«clazz.documentation»  
					public class «clazz.name» extends GlobalExitStates {
					   «generateExitStates(clazz)»
					}
				'''
				fsa.generateFile(
					widget.name.getFileSystemPath + "/" + clazz.name + ".java",
					LangOutputProvider.DEFAULT,
					'''		
						package «widget.name»;
						
						«FOR imp : imports»
							import «imp»;
						«ENDFOR»					
						
						«body»		
					'''
				)
			}
		]
	}
	
	protected def String generateExitStates(YClass clazz) {
		'''
			«FOR member : clazz.members»
				«IF member instanceof YProperty»
					«generatePropertyForStructure(member as YProperty)»
				«ENDIF»
			«ENDFOR»
		'''
	}
	
	protected def String generatePropertyForStructure(YProperty property) {
		'''public ExitState «property.name»;'''
	}

}
