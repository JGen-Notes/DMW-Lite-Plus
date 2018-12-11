package eu.jgen.notes.dmw.lite.mdl.generator

import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YModel
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil
 
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

class LangWidgetGeneratorForDMW implements IGenerator {
	
	

	@Inject extension ModelUtil

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.resourceSet.allContents.filter[element2|element2 instanceof YModel].forEach [ element |
			val model = element as YModel
			generateModelEntityClasses(fsa, model)
		]

	}

	def generateModelEntityClasses(IFileSystemAccess fsa, YModel model) {
		model.annotations.forEach [ annotation |
			if (annotation instanceof YAnnotEntity) {
				val entity = annotation as YAnnotEntity
				val body = '''
					«ModelGenerator.GENERATOR_NOTICE»
					  
					package «model.name».model;
					import «model.name».*;
					import eu.jgen.notes.lib.dmw.*;
					
					class «entity.name»All : Structure => «entity.name» {
						«generateVariablesUsingAttribute(entity)» 
					}
				'''
				fsa.generateFile(
					model.name.getFileSystemPath + "/model/" + entity.name + ".dmw",
					ModelOutputProvider.SRC,
					'''								
						«body»
					'''
				)
			}
		]  
	}

	def generateVariablesUsingAttribute(YAnnotEntity entity) {
		val buffer = new StringBuffer()
		for (annotation : entity.annotations) {
			if (annotation instanceof YAnnotAttribute) {
				val attribute = annotation as YAnnotAttribute	
				buffer.append("public var " + attribute.name + " : " + attribute.extractAttributeType  + " => " + entity.name + "." +  attribute.name + ";\n")
				 
			}  
			
		}
		return buffer.toString
	}

	def String getFileSystemPath(String packname) {
		packname.replace(".", "/")
	}

}
