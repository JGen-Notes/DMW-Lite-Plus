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
package eu.jgen.notes.dmw.lite.base.ui.quickfix

import com.google.inject.Inject

import eu.jgen.notes.dmw.lite.utility.LangUtil

import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider
import org.eclipse.xtext.ui.editor.quickfix.Fix
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor
import org.eclipse.xtext.validation.Issue

import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex
import eu.jgen.notes.dmw.lite.base.validation.LangValidator
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.base.lang.YClass

class LangQuickfixProvider extends DefaultQuickfixProvider {

	@Inject extension ModelUtil
	@Inject extension LangUtil
	@Inject extension LangIndex


//	@Fix(LangValidator.CLASS_NEED_TO_BE_EXTENDED)
//	def createSuperClass(Issue issue, IssueResolutionAcceptor acceptor) {
//		acceptor.accept(issue, 'Insert missing Object class', 'Insert missing Object class.', 'class.gif') [ element, context |
//			element.getVisibleExternalClassesDescriptions.forEach [ p1, p2 |
//				if (p1.lastSegment == "Object") {
//					(element as YClass).superclass = p2.EObjectOrProxy as YClass
//				}
//			]
//		]
//	}

	@Fix(LangValidator.CLASS_NAME_FIRST_CHARACTER_NOT_CAPITAL)
	def capitalizeClassNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Capitalize first letter', "Capitalize first letter", 'class.gif') [ element, context |
			element.getVisibleExternalClassesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstUpper)
			]
		]
	}


	@Fix(LangValidator.FUNCTION_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercaseFunctionNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter", 'function.gif') [ element, context |
			element.getVisibleExternalClassesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}

	@Fix(LangValidator.PROPERTY_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercasePropertyNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter", 'property.gif') [ element, context |
			element.getVisibleExternalClassesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}

	@Fix(LangValidator.VARIABLE_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
	def lowercaseVariableNameFirstLetter(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Change to lower case first letter', "Change to lower case first letter", 'property.gif') [ element, context |
			element.getVisibleExternalClassesDescriptions.forEach [ p1, p2 |
				val xtextDocument = context.xtextDocument
				val firstLetter = xtextDocument.get(issue.offset, 1);
				xtextDocument.replace(issue.offset, 1, firstLetter.toFirstLower)
			]
		]
	}
	
	@Fix(LangValidator.CLASS_NEED_TO_HAVE_PROPERTIES)
	def addingPropertiesToStructure(Issue issue, IssueResolutionAcceptor acceptor) {
		acceptor.accept(issue, 'Add all missing properties using list of attributes as public',
			"Add all missing properties using list of attributes", 'property.gif') [ element, context |
				if (element instanceof YClass && (element as YClass).entityRef !== null) {
					val clazz = element as YClass
					val list = (element as YClass).entityRef.annotations
					list.forEach[entityInner | 
						if (entityInner instanceof YAnnotAttribute) {
							val attribute = entityInner as YAnnotAttribute
							val property = attribute.converAttributeIntoPropertyPublic
							clazz.members.add(property)
						}						
					]
				}
			]
	}
}
