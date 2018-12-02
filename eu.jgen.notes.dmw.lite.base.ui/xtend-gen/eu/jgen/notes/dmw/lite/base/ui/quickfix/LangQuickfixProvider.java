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
package eu.jgen.notes.dmw.lite.base.ui.quickfix;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YProperty;
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex;
import eu.jgen.notes.dmw.lite.base.validation.LangValidator;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.utility.LangUtil;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.ui.editor.model.IXtextDocument;
import org.eclipse.xtext.ui.editor.model.edit.IModificationContext;
import org.eclipse.xtext.ui.editor.model.edit.ISemanticModification;
import org.eclipse.xtext.ui.editor.quickfix.DefaultQuickfixProvider;
import org.eclipse.xtext.ui.editor.quickfix.Fix;
import org.eclipse.xtext.ui.editor.quickfix.IssueResolutionAcceptor;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.StringExtensions;

@SuppressWarnings("all")
public class LangQuickfixProvider extends DefaultQuickfixProvider {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  @Extension
  private LangUtil _langUtil;
  
  @Inject
  @Extension
  private LangIndex _langIndex;
  
  @Fix(LangValidator.CLASS_NAME_FIRST_CHARACTER_NOT_CAPITAL)
  public void capitalizeClassNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final BiConsumer<QualifiedName, IEObjectDescription> _function_1 = (QualifiedName p1, IEObjectDescription p2) -> {
        try {
          final IXtextDocument xtextDocument = context.getXtextDocument();
          final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
          xtextDocument.replace((issue.getOffset()).intValue(), 1, StringExtensions.toFirstUpper(firstLetter));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._langIndex.getVisibleExternalClassesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Capitalize first letter", "Capitalize first letter", "class.gif", _function);
  }
  
  @Fix(LangValidator.FUNCTION_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercaseFunctionNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final BiConsumer<QualifiedName, IEObjectDescription> _function_1 = (QualifiedName p1, IEObjectDescription p2) -> {
        try {
          final IXtextDocument xtextDocument = context.getXtextDocument();
          final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
          xtextDocument.replace((issue.getOffset()).intValue(), 1, StringExtensions.toFirstLower(firstLetter));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._langIndex.getVisibleExternalClassesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", "function.gif", _function);
  }
  
  @Fix(LangValidator.PROPERTY_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercasePropertyNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final BiConsumer<QualifiedName, IEObjectDescription> _function_1 = (QualifiedName p1, IEObjectDescription p2) -> {
        try {
          final IXtextDocument xtextDocument = context.getXtextDocument();
          final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
          xtextDocument.replace((issue.getOffset()).intValue(), 1, StringExtensions.toFirstLower(firstLetter));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._langIndex.getVisibleExternalClassesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", "property.gif", _function);
  }
  
  @Fix(LangValidator.VARIABLE_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercaseVariableNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final BiConsumer<QualifiedName, IEObjectDescription> _function_1 = (QualifiedName p1, IEObjectDescription p2) -> {
        try {
          final IXtextDocument xtextDocument = context.getXtextDocument();
          final String firstLetter = xtextDocument.get((issue.getOffset()).intValue(), 1);
          xtextDocument.replace((issue.getOffset()).intValue(), 1, StringExtensions.toFirstLower(firstLetter));
        } catch (Throwable _e) {
          throw Exceptions.sneakyThrow(_e);
        }
      };
      this._langIndex.getVisibleExternalClassesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", "property.gif", _function);
  }
  
  @Fix(LangValidator.CLASS_NEED_TO_HAVE_PROPERTIES)
  public void addingPropertiesToStructure(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      if (((element instanceof YClass) && (((YClass) element).getEntityRef() != null))) {
        final YClass clazz = ((YClass) element);
        final EList<YAnnotEntityInner> list = ((YClass) element).getEntityRef().getAnnotations();
        final Consumer<YAnnotEntityInner> _function_1 = (YAnnotEntityInner entityInner) -> {
          if ((entityInner instanceof YAnnotAttribute)) {
            final YAnnotAttribute attribute = ((YAnnotAttribute) entityInner);
            final YProperty property = this._langUtil.converAttributeIntoPropertyPublic(attribute);
            clazz.getMembers().add(property);
          }
        };
        list.forEach(_function_1);
      }
    };
    acceptor.accept(issue, "Add all missing properties using list of attributes as public", 
      "Add all missing properties using list of attributes", "property.gif", _function);
  }
}
