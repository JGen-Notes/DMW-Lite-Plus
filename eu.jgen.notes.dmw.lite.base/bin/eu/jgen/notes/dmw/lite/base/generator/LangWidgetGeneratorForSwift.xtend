package eu.jgen.notes.dmw.lite.base.generator

import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess

import com.google.inject.Inject

import eu.jgen.notes.dmw.lite.utility.LangUtil
import eu.jgen.notes.dmw.lite.utility.LangSwiftGeneratorHelper

import eu.jgen.notes.dmw.lite.utility.LangGeneratorHelperForJava
import eu.jgen.notes.dmw.lite.base.lang.YWidget
import eu.jgen.notes.dmw.lite.base.lang.YClass
import eu.jgen.notes.dmw.lite.base.lang.YProperty
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign

class LangWidgetGeneratorForSwift implements IGenerator {

	@Inject extension LangUtil
	@Inject extension LangSwiftGeneratorHelper

	override doGenerate(Resource input, IFileSystemAccess fsa) {
		input.allContents.filter[element|element instanceof YAnnotTechnicalDesign].forEach [ element |
			//val annotSwift = element as YAnnotSwift
			generatePackageModule(fsa, "mymodule")

			input.allContents.filter[element2|element2 instanceof YWidget].forEach [ element2 |
				val widget = element2 as YWidget
		//		generateTableClasses(fsa, widget, annotSwift)
				generateWidget(fsa, widget, "mymodule")
			]
		]
	}

	def generateWidget(IFileSystemAccess fsa, YWidget widget, String moduleName) {
		widget.classes.forEach [ clazz |
			if (clazz.superclass !== null && clazz.superclass.name == "Widget") {
				val body = '''
					// dmw-generator-version: 0.2
															
					//  Created by Marek Stankiewicz on 17.04.2018.
					//  Copyright © 2018 JGen. All rights reserved.
															
					import Foundation
					
					«clazz.documentation»
					class «clazz.name»  {
						   «generateInnerClasses(clazz)»
						   
						   «generateTableClasses(clazz)»
					
					}
				'''
				fsa.generateFile(
					moduleName + "/Sources/" + moduleName + "/" + clazz.name + ".swift",
					LangOutputProvider.SWIFT,
					'''		
						
						«body»
					'''
				)
				fsa.generateFile(
					moduleName + "/Sources/" + moduleName + "/" + "main.swift",
					LangOutputProvider.SWIFT,
					'''		
						// dmw-generator-version: 0.2
																					
						//  Created by Marek Stankiewicz on 17.04.2018.
						//  Copyright © 2018 JGen. All rights reserved.
																					
						import Foundation
						import Kitura
						import HeliumLogger
						import LoggerAPI
						
						let logger = HeliumLogger()
						let router = Router()
						
						router.get("/") { request, response, next in
						response.send("Hello")
						next()
						}
						
						Kitura.addHTTPServer(onPort: 8080, with: router)
						Kitura.run()
					'''
				)

			}
		]
	}

	protected def String generateTableClasses(YClass clazz) {

		for (inner : clazz.inners) {
			if (inner.entityRef !== null) {
			 
			}
		}
		return ""
	}

	protected def String generateInnerClasses(YClass clazz) {
		'''
			«FOR innerclazz : clazz.inners»
				«generateClass(innerclazz)»
				
			«ENDFOR»
		'''
	}

	protected def String generateClass(YClass innerclazz) {
		if (innerclazz.superclass !== null && innerclazz.superclass.name == "Structure") {
			'''
				«innerclazz.documentation»  
				public class «innerclazz.name»  {
					«FOR member : innerclazz.members»
						«IF member instanceof YProperty»
							«generatePropertyForStructure(member as YProperty)»
						«ENDIF»
					«ENDFOR»
					«generateFunctionInit(innerclazz)» 
				}
			'''
		}
	}

	def generateFunctionInit(YClass clazz) {
		'''
			init() {
				«FOR member : clazz.members»
					«IF member instanceof YProperty»
						«generatePropertyInit(member as YProperty)»
					«ENDIF»
				«ENDFOR»
			}
		'''
	}

	def generatePropertyInit(YProperty property) {
		switch (property.type.name) {
			case "Double": {
				return property.name + " = " + "0;"
			}
			case "Int": {
				return property.name + " = " + "0;"
			}
			case "Short": {
				return property.name + " = " + "0;"
			}
			case "String": {
				return property.name + " = " + "\"\";"
			}
			case "Date": {
				return property.name + " = " + "Date();"
			}
			case "Time": {
				return property.name + " = " + "Date();"
			}
			default: {
				return "unknown"
			}
		}
	}

	protected def String generatePropertyForStructure(YProperty property) {
		'''
		«property.documentation»  
		var «property.name» : «property.generatePropertyType»;'''
	}

	protected def String generatePropertyType(YProperty property) {
		switch (property.type.name) {
			case "Double": {
				return "Double"
			}
			case "Int": {
				return "Int"
			}
			case "Short": {
				return "Int16"
			}
			case "String": {
				return "String"
			}
			case "Date": {
				return "Date"
			}
			case "Time": {
				return "Date"
			}
			default: {
				return "unknown"
			}
		}
	}

	protected def void generatePackageModule(IFileSystemAccess fsa, String moduleName) {
		fsa.generateFile(
			moduleName + "/" + "Package" + ".swift",
			LangOutputProvider.SWIFT,
			'''				
				// swift-tools-version:4.0
				// The swift-tools-version declares the minimum version of Swift required to build this package.				
				
				import PackageDescription
				
				let package = Package(
				    name: "«moduleName»",
				    products: [
				        // Products define the executables and libraries produced by a package, and make them visible to other packages.
				        .library(
				            name: "«moduleName»",
				            targets: ["«moduleName»"]),
				    ],
				    dependencies: [
				            .package(url: "https://github.com/IBM-Swift/Kitura.git", from: "2.0.0"),
				            .package(url: "https://github.com/IBM-Swift/HeliumLogger.git", from: "1.7.1"),
				            .package(url: "https://github.com/IBM-Swift/SwiftKueryMySQL.git", from: "1.2.0"),
				            .package(url: "https://github.com/IBM-Swift/LoggerAPI.git", from: "1.7.3"),
				        ],
				        targets: [
				             .target(
				                name: "«moduleName»",
				                dependencies: ["Kitura","HeliumLogger","SwiftKueryMySQL", "LoggerAPI"]),
				        ]
				)
			'''
		)

		// generate .gitignore
		fsa.generateFile(
			moduleName + "/" + ".gitignore",
			LangOutputProvider.SWIFT,
			'''				
				.DS_Store
				/.build
				/Packages
				/*.xcodeproj
			'''
		)  

		// generate .gitignore
		fsa.generateFile(
			moduleName + "/" + "README.md",
			LangOutputProvider.SWIFT,
			'''				
				# «moduleName»
				
				 
			'''
		)

	}


}
