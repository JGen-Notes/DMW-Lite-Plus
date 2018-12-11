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

import eu.jgen.notes.dmw.lite.mdl.utility.Util
import org.eclipse.xtext.ui.wizard.template.FileTemplate
import org.eclipse.xtext.ui.wizard.template.IFileGenerator
import org.eclipse.xtext.ui.wizard.template.IFileTemplateProvider

class ModelFileTemplateProvider implements IFileTemplateProvider {

	override getFileTemplates() {
		#[new CreateModelFile, new CreateWidgetFile]

	} 
}

@FileTemplate(label="Create Model Fragment", icon="model_file.gif", description="Remember to select package in the source folder first. A new model file has to be created in the package.")
final class CreateModelFile {

	val Util util = new Util()

	val type = combo("Type of model element:", #["Entity", "Technical Design", "Database", "Java", "Swift"],
		"The type of model fragment")

	override generateFiles(IFileGenerator generator) {
		if (folder !== null) {
			val packageName = util.guessPackageName(folder)
			if (packageName !== null) {
				if (type.value == "Entity") {
					generator.generate('''«folder»/«name».mdl''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «type» «name» fragment.
						*/
											 
						@entity «name» {
						   @attribute id (length=9);						
						}
					''')
					return
				}   else if (type.value == "Technical Design") {
					generator.generate('''«folder»/«name».mdl''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «type» fragment.
						*/
											 
						@database Derby;	
						@java;				 
						@td database Derby {
							
						}
					''')
					return
				} else if (type.value == "Database") {
					generator.generate('''«folder»/«name».mdl''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «type» fragment.
						*/
											 
						@database Derby;	

					''')
					return
				} else if (type.value == "Java") {
					generator.generate('''«folder»/«name».mdl''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «type» fragment.
						*/
											 
						@java;	

					''')
					return
				} else if (type.value == "Swift") {
					generator.generate('''«folder»/«name».mdl''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «type» fragment.
						*/
											 
						@swift module «name» ;		

					''')					
					return
				}
			}
		}				
	}

}

@FileTemplate(label="Create Widget File", icon="widget.gif", description="Create a new widget file.")
final class CreateWidgetFile {

	val Util util = new Util()
	val widgetTypeSelection = combo("Type of widget:", #["Widget", "ExitState", "Command"], "The type of widget")

	override generateFiles(IFileGenerator generator) {
		if (folder !== null) {
			val packageName = util.guessPackageName(folder)
			if (packageName !== null) {
				if (widgetTypeSelection.value == "Widget") {
					generator.generate('''«folder»/«name».dmw''', '''
						package «packageName»;
						import «packageName».*;
						/*
						* This is «widgetTypeSelection.value» «name» fragment.
						*/
											 
						@class «name» -> Widget {
												
						}
					''')
					return
				}
			}
		}
	}

}
