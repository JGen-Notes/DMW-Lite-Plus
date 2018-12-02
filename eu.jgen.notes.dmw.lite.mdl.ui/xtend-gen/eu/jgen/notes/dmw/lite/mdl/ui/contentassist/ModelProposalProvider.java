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
 */
package eu.jgen.notes.dmw.lite.mdl.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex;
import eu.jgen.notes.dmw.lite.mdl.ui.contentassist.AbstractModelProposalProvider;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import java.util.ArrayList;
import java.util.function.Consumer;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class ModelProposalProvider extends AbstractModelProposalProvider {
  @Inject
  private PluginImageHelper imageHelper;
  
  @Inject
  @Extension
  private ModelIndex _modelIndex;
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Override
  public void complete_YAnnotationElementValuePair(final EObject object, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    if ((object instanceof YAnnotAttribute)) {
      final YAnnotAttribute attribute = ((YAnnotAttribute) object);
      ArrayList<String> _createProposalAnnotationList = this._modelUtil.createProposalAnnotationList(attribute);
      for (final String entry : _createProposalAnnotationList) {
        acceptor.accept(this.createCompletionProposal(entry, entry, this.imageHelper.getImage("database.gif"), context));
      }
    }
  }
  
  @Override
  public void completeYAnnotDatabase_Name(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    acceptor.accept(this.createCompletionProposal("Derby", "Derby", this.imageHelper.getImage("database.gif"), context));
    acceptor.accept(this.createCompletionProposal("MySQL", "MySQL", this.imageHelper.getImage("database.gif"), context));
    acceptor.accept(this.createCompletionProposal("SQLite", "SQLite", this.imageHelper.getImage("database.gif"), context));
    acceptor.accept(this.createCompletionProposal("PostgreSQL", "PostgreSQL", this.imageHelper.getImage("database.gif"), context));
    acceptor.accept(this.createCompletionProposal("MongoDB", "MongoDB", this.imageHelper.getImage("database.gif"), context));
  }
  
  @Override
  public void completeYAnnotRelationship_Inverse(final EObject object, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final YAnnotRelationship annotRelationship = ((YAnnotRelationship) object);
    final Consumer<YAnnotEntityInner> _function = (YAnnotEntityInner element) -> {
      if ((element instanceof YAnnotRelationship)) {
        final YAnnotRelationship targetAnnotRelationship = ((YAnnotRelationship) element);
        YAnnotRelationship _inverse = targetAnnotRelationship.getInverse();
        boolean _tripleNotEquals = (_inverse != null);
        if (_tripleNotEquals) {
          EObject _eContainer = targetAnnotRelationship.eContainer();
          final String targetEnntityName = ((YAnnotEntity) _eContainer).getName();
          String _name = annotRelationship.getTarget().getName();
          boolean _equals = Objects.equal(targetEnntityName, _name);
          if (_equals) {
            String _name_1 = annotRelationship.getTarget().getName();
            String _plus = (_name_1 + ".");
            String _name_2 = targetAnnotRelationship.getName();
            final String proposal = (_plus + _name_2);
            acceptor.accept(this.createCompletionProposal(proposal, proposal, this.imageHelper.getImage("relationship.gif"), context));
            return;
          }
        }
        if (((targetAnnotRelationship.getInverse() == null) && (targetAnnotRelationship != annotRelationship))) {
          String _name_3 = annotRelationship.getTarget().getName();
          String _plus_1 = (_name_3 + ".");
          String _name_4 = targetAnnotRelationship.getName();
          final String proposal_1 = (_plus_1 + _name_4);
          acceptor.accept(this.createCompletionProposal(proposal_1, proposal_1, this.imageHelper.getImage("relationship.gif"), context));
        }
      }
    };
    annotRelationship.getTarget().getAnnotations().forEach(_function);
  }
}
