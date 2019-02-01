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
package eu.jgen.notes.dmw.lite.base.ui.contentassist;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YMember;
import eu.jgen.notes.dmw.lite.base.ui.contentassist.AbstractLangProposalProvider;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.ui.PluginImageHelper;
import org.eclipse.xtext.ui.editor.contentassist.ContentAssistContext;
import org.eclipse.xtext.ui.editor.contentassist.ICompletionProposalAcceptor;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;

@SuppressWarnings("all")
public class LangProposalProvider extends AbstractLangProposalProvider {
  @Inject
  private PluginImageHelper imageHelper;
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Override
  public void complete_YProperty(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_YProperty(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void complete_YClass(final EObject model, final RuleCall ruleCall, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    super.complete_YClass(model, ruleCall, context, acceptor);
  }
  
  @Override
  public void completeYClass_Members(final EObject model, final Assignment assignment, final ContentAssistContext context, final ICompletionProposalAcceptor acceptor) {
    final YClass clazz = ((YClass) model);
    if (((clazz.getSuperclass() != null) && Objects.equal(clazz.getSuperclass().getName(), "Structure"))) {
      YAnnotEntity _entityRef = clazz.getEntityRef();
      boolean _tripleNotEquals = (_entityRef != null);
      if (_tripleNotEquals) {
        this.createAttributeIncludeAll(clazz, acceptor, context);
        this.createAttributeIncludeOne(clazz, acceptor, context);
      }
    } else {
      super.completeYClass_Members(model, assignment, context, acceptor);
    }
  }
  
  protected void createAttributeIncludeAll(final YClass clazz, final ICompletionProposalAcceptor acceptor, final ContentAssistContext context) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    EList<YAnnotEntityInner> _annotations = clazz.getEntityRef().getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotAttribute)) {
        final YAnnotAttribute annotAttr = ((YAnnotAttribute) annotEntityInner);
        boolean _isPropertyAlreadyIncluded = this.isPropertyAlreadyIncluded(clazz, annotAttr.getName());
        boolean _not = (!_isPropertyAlreadyIncluded);
        if (_not) {
          String _name = annotAttr.getName();
          String _plus = ("public var " + _name);
          String _plus_1 = (_plus + " : ");
          String _extractAttributeType = this._modelUtil.extractAttributeType(annotAttr);
          String _plus_2 = (_plus_1 + _extractAttributeType);
          String _plus_3 = (_plus_2 + " => ");
          String _name_1 = clazz.getEntityRef().getName();
          String _plus_4 = (_plus_3 + _name_1);
          String _plus_5 = (_plus_4 + ".");
          String _name_2 = annotAttr.getName();
          String _plus_6 = (_plus_5 + _name_2);
          final String line = (_plus_6 + ";");
          list.add(line);
        }
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    {
      for(final String line_1 : list) {
        _builder.append(line_1);
        _builder.newLineIfNotEmpty();
      }
    }
    final String text = _builder.toString();
    acceptor.accept(this.createCompletionProposal(text, "Include All", this.imageHelper.getImage("includeall.gif"), context));
  }
  
  protected void createAttributeIncludeOne(final YClass clazz, final ICompletionProposalAcceptor acceptor, final ContentAssistContext context) {
    EList<YAnnotEntityInner> _annotations = clazz.getEntityRef().getAnnotations();
    for (final YAnnotEntityInner annotEntityInner : _annotations) {
      if ((annotEntityInner instanceof YAnnotAttribute)) {
        final YAnnotAttribute annotAttr = ((YAnnotAttribute) annotEntityInner);
        boolean _isPropertyAlreadyIncluded = this.isPropertyAlreadyIncluded(clazz, annotAttr.getName());
        boolean _not = (!_isPropertyAlreadyIncluded);
        if (_not) {
          String _name = annotAttr.getName();
          String _plus = ("public var " + _name);
          String _plus_1 = (_plus + " : ");
          String _extractAttributeType = this._modelUtil.extractAttributeType(annotAttr);
          String _plus_2 = (_plus_1 + _extractAttributeType);
          String _plus_3 = (_plus_2 + " -> ");
          String _name_1 = clazz.getEntityRef().getName();
          String _plus_4 = (_plus_3 + _name_1);
          String _plus_5 = (_plus_4 + ".");
          String _name_2 = annotAttr.getName();
          String _plus_6 = (_plus_5 + _name_2);
          final String line = (_plus_6 + ";");
          String _name_3 = annotAttr.getName();
          String _plus_7 = ("Include Only: " + _name_3);
          acceptor.accept(
            this.createCompletionProposal(line, _plus_7, 
              this.imageHelper.getImage("property.gif"), context));
        }
      }
    }
  }
  
  private boolean isPropertyAlreadyIncluded(final YClass clazz, final String name) {
    EList<YMember> _members = clazz.getMembers();
    for (final YMember member : _members) {
      String _name = member.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
}
