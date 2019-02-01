/**
 * [The "BSD license"]
 * Copyright (c) 2016, JGen Notes
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, 
 * are permitted provided that the following conditions are met:
 * 
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions 
 *    and the following disclaimer.
 * 
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions 
 *    and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, 
 * INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE 
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, 
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS 
 * OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
 * WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE 
 * OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package eu.jgen.notes.dmw.lite.mdl.ui.wizard

import org.eclipse.core.runtime.Status
import org.eclipse.jdt.core.JavaCore
import org.eclipse.xtext.ui.XtextProjectHelper
import org.eclipse.xtext.ui.util.PluginProjectFactory
import org.eclipse.xtext.ui.wizard.template.IProjectGenerator
import org.eclipse.xtext.ui.wizard.template.IProjectTemplateProvider
import org.eclipse.xtext.ui.wizard.template.ProjectTemplate

import static org.eclipse.core.runtime.IStatus.*
import java.util.List

/**
 * Create a list with all project templates to be shown in the template new project wizard.
 * 
 * Each template is able to generate one or more projects. Each project can be configured such that any number of files are included.
 */
class ModelProjectTemplateProvider implements IProjectTemplateProvider {
	override getProjectTemplates() {
		#[new DMWProject]
	}
}

@ProjectTemplate(label="DMW Project", icon="project_template.png", description="<p><b>Creates DMW Project</b></p>
<p>This project can be used to create model fragments and widgets</p>")
final class DMWProject {

	val advanced = check("Extra contents:", true)
	val advancedEntityGroup = group("Package and Entity Names")
	val advancedTDGroup = group("Package name and defaults")

	val packEntity = text("Package Name:", "", "The package name to place the files in", advancedEntityGroup)
	val name = text("Entity Name:", "YourEntityName", "The name of first entity fragment", advancedEntityGroup)

	val packTD = text("Package Name:", "", "The package name to place the files in", advancedTDGroup)
	val td = check("Default Technical Design:", false, "Need generate default technical design fragment",
		advancedTDGroup)

	override protected updateVariables() {
		name.enabled = advanced.value
		packEntity.value = projectInfo.projectName
		packEntity.enabled = advanced.value
		packTD.value = projectInfo.projectName
		packTD.enabled = advanced.value
		td.enabled = advanced.value
		if (!advanced.value) {
			name.value = ""
			packEntity.value = ""
			packTD.value = ""
			td.value = td.value
		}
	}

	override protected validate() {
		if (packEntity.value.matches('[a-z][a-z0-9_]*(.[a-z][a-z0-9_]*)*'))
			if (packEntity.value.matches('[a-z][a-z0-9_]*(.[a-z][a-z0-9_]*)*'))
				null
			else
				new Status(ERROR, "Wizard", "'" + packEntity + "' is not a valid package name")
		else
			new Status(ERROR, "Wizard", "'" + packEntity + "' is not a valid package name")

	}

	override generateProjects(IProjectGenerator generator) {
		if (advanced.value) {
			generator.generate(new PluginProjectFactory => [
				projectName = projectInfo.projectName
				location = projectInfo.locationPath
				projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
				builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
				val bundles = newArrayList()
				bundles.add("eu.jgen.notes.dmw.lite.mdl")
				bundles.add("eu.jgen.notes.dmw.lite.base")
				addRequiredBundles(bundles)
				folders += "src"
				addFile('''src/«packEntity.value.replace('.','/')»/«name.value».mdl''', '''
					package «packEntity.value»;
					import «packEntity.value».*;
					
					/*
					* This is ...
					*/																 
					@entity «name.value» {
						@attribute	id (type=Int,length=9);										
					}
				''')
				if(td.value) {
					addFile('''src/«packTD.value.replace('.','/')»/td.mdl''', '''
					package «packEntity.value»;
					import «packEntity.value».*;
					
					@td default (database=Derby,java=true,swift=false,module="somename")  {
												
					}
					
				''')
				} else {
					addFile('''src/«packTD.value.replace('.','/')»/td.mdl''', '''
					package «packEntity.value»;
					import «packEntity.value».*;
										
				''')
				}
				
			])
		} else {
			generator.generate(new PluginProjectFactory => [
				projectName = projectInfo.projectName
				location = projectInfo.locationPath
				projectNatures += #[JavaCore.NATURE_ID, "org.eclipse.pde.PluginNature", XtextProjectHelper.NATURE_ID]
				builderIds += #[JavaCore.BUILDER_ID, XtextProjectHelper.BUILDER_ID]
				val bundles = newArrayList()
				bundles.add("eu.jgen.notes.dmw.lite.mdl")
				bundles.add("eu.jgen.notes.dmw.lite.base")
				addRequiredBundles(bundles)
				folders += "src"
				addFile('''src/«packEntity.value.replace('.','/')»/«name.value».mdl''', '''
					package «packEntity.value»;
					import «packEntity.value».*;
					
				''')
			])
		}

	}
}
