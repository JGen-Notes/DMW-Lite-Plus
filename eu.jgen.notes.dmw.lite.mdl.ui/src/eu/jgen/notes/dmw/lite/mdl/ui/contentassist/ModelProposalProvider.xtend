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
package eu.jgen.notes.dmw.lite.mdl.ui.contentassist

import com.google.inject.Inject
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex
import org.eclipse.emf.ecore.EObject
import org.eclipse.xtext.Assignment
import org.eclipse.xtext.ui.PluginImageHelper
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor
import org.eclipse.xtext.RuleCall
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign

class ModelProposalProvider extends AbstractModelProposalProvider {

	@Inject
	private PluginImageHelper imageHelper;
	@Inject extension ModelIndex
	@Inject extension ModelUtil

	override void complete_YAnnotationElementValuePair(EObject object, RuleCall ruleCall, ContentAssistContext context,
		ICompletionProposalAcceptor acceptor) {
		if (object instanceof YAnnotAttribute) {
			val attribute = object as YAnnotAttribute
			for (entry : attribute.createProposalAnnotationList) {
				acceptor.accept(
					createCompletionProposal(entry, entry, imageHelper.getImage("property_type.gif"), context))
			}
		} else if (object instanceof YAnnotTechnicalDesign) {
			val annotTechnicalDesign = object as YAnnotTechnicalDesign
			for (entry : annotTechnicalDesign.createProposalAnnotationList) {
				acceptor.accept(createCompletionProposal(entry, entry, imageHelper.getImage("database.gif"), context))
			}
		}
	}

	override void completeYAnnotationElementValuePair_Value(EObject object, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		if (object instanceof YAnnotationElementValuePair) {
			val aAnnotationElementValuePair = object as YAnnotationElementValuePair
			if (aAnnotationElementValuePair.name == "type") {
				acceptor.accept(
					createCompletionProposal("String", "String", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Short", "Short", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Int", "Int", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Long", "Long", imageHelper.getImage("class.gif"), context))
				acceptor.accept(
					createCompletionProposal("Double", "Double", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Bool", "Bool", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Date", "Date", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Time", "Time", imageHelper.getImage("class.gif"), context))
				acceptor.accept(
					createCompletionProposal("Timestamp", "Timestamp", imageHelper.getImage("class.gif"), context))
				acceptor.accept(createCompletionProposal("Blob", "Blob", imageHelper.getImage("class.gif"), context))
			}
		}

	}

//	override  void completeYAnnotDatabase_Name(EObject model, Assignment assignment, ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
//				acceptor.accept(createCompletionProposal("Derby", "Derby", imageHelper.getImage("database.gif"), context))
//				acceptor.accept(createCompletionProposal("MySQL", "MySQL", imageHelper.getImage("database.gif"), context))
//		 		acceptor.accept(createCompletionProposal("SQLite", "SQLite", imageHelper.getImage("database.gif"), context))
//		 		acceptor.accept(createCompletionProposal("PostgreSQL", "PostgreSQL", imageHelper.getImage("database.gif"), context))
//		 		acceptor.accept(createCompletionProposal("MongoDB", "MongoDB", imageHelper.getImage("database.gif"), context))
//	}

	override void completeYAnnotRelationship_Inverse(EObject object, Assignment assignment,
		ContentAssistContext context, ICompletionProposalAcceptor acceptor) {
		val annotRelationship = object as YAnnotRelationship
		annotRelationship.target.annotations.forEach [ element |
			if (element instanceof YAnnotRelationship) {
				val targetAnnotRelationship = element as YAnnotRelationship
				if (targetAnnotRelationship.inverse !== null) {
					val targetEnntityName = (targetAnnotRelationship.eContainer as YAnnotEntity).name
					if (targetEnntityName == annotRelationship.target.name) {
						val proposal = annotRelationship.target.name + "." + targetAnnotRelationship.name
						acceptor.accept(
							createCompletionProposal(proposal, proposal, imageHelper.getImage("relationship.gif"),
								context))
						return
					}
				}
				if (targetAnnotRelationship.inverse === null && targetAnnotRelationship !== annotRelationship) {
					val proposal = annotRelationship.target.name + "." + targetAnnotRelationship.name
					acceptor.accept(
						createCompletionProposal(proposal, proposal, imageHelper.getImage("relationship.gif"), context))
				}
			}
		]
	}

}
