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
package eu.jgen.notes.dmw.lite.mdl.ui.quickfix;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign;
import eu.jgen.notes.dmw.lite.mdl.scoping.ModelIndex;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.mdl.validation.ModelValidator;
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
public class ModelQuickfixProvider extends DefaultQuickfixProvider {
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  @Extension
  private ModelIndex _modelIndex;
  
  @Fix(ModelValidator.ENTITY_NO_TECH_DESIGN)
  public void createTableForEntityType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      final YAnnotTechnicalDesign technicalDesign = this._modelUtil.getTechnicalDesign(element, ModelPackage.Literals.YANNOT_TECHNICAL_DESIGN);
      final YAnnotEntity entity = ((YAnnotEntity) element);
      technicalDesign.getFeatures().add(
        this._modelUtil.converEntityIntoTable(entity));
    };
    acceptor.accept(issue, "Create missing table", "Creates table implementing entity type.", "table.gif", _function);
  }
  
  @Fix(ModelValidator.ATTRIBUTE_NO_TECH_DESIGN)
  public void createColumnForAttributeType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      if ((element instanceof YAnnotAttribute)) {
        final YAnnotAttribute attribute = ((YAnnotAttribute) element);
        EObject _eContainer = attribute.eContainer();
        final YAnnotTable table = this._modelUtil.getImplementingTable(((YAnnotEntity) _eContainer));
        final YAnnotAbstractColumn abstractColumn = this._modelUtil.converAttributeIntoAbstractColumn(attribute);
        table.getColumns().add(abstractColumn);
        table.eResource().save(null);
      }
    };
    acceptor.accept(issue, "Create missing column", "Creates column implementing attribute type.", "column.gif", _function);
  }
  
  @Fix(ModelValidator.RELATIONSSHIP_NOT_IMPLEMENTED)
  public void createFKColumnForAttributeType(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      if ((element instanceof YAnnotRelationship)) {
        final YAnnotRelationship relationship = ((YAnnotRelationship) element);
        EObject _eContainer = relationship.eContainer();
        final YAnnotTable table = this._modelUtil.getImplementingTable(((YAnnotEntity) _eContainer));
        final YAnnotForeignKey foreignKey = this._modelUtil.converRelationshipIntoForeignKeys(relationship);
        table.getForeignkeys().add(foreignKey);
        table.eResource().save(null);
      }
    };
    acceptor.accept(issue, "Create missing foreign key", "Adds foreign key column implementing relationship.", 
      "relationship.png", _function);
  }
  
  @Fix(ModelValidator.IDENTIFIER_NO_TECH_DESIGN)
  public void createPrimaryKeyForIdentifier(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      if ((element instanceof YAnnotIdentifier)) {
        final YAnnotIdentifier identifier = ((YAnnotIdentifier) element);
        EObject _eContainer = identifier.eContainer();
        final YAnnotTable table = this._modelUtil.getImplementingTable(((YAnnotEntity) _eContainer));
        final YAnnotPrimaryKey primaryKey = this._modelUtil.converIdentifierIntoPrimaryKey(identifier);
        table.setPrimarykey(primaryKey);
        table.eResource().save(null);
      }
    };
    acceptor.accept(issue, "Create missing primary key", "Creates primary key implementing identifier.", 
      "identifier.gif", _function);
  }
  
  @Fix(ModelValidator.ENTITY_NAME_FIRST_CHARACTER_NOT_CAPITAL)
  public void capitalizeEntityNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
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
      this._modelIndex.getVisibleExternalEntitiesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Capitalize first letter", "Capitalize first letter", "entity.gif", _function);
  }
  
  @Fix(ModelValidator.ATTRIBUTE_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercaseAttributeNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
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
      this._modelIndex.getVisibleExternalEntitiesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", 
      "attribute.gif", _function);
  }
  
  @Fix(ModelValidator.RELATIONSHIP_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercaseRelationshipNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
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
      this._modelIndex.getVisibleExternalEntitiesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", 
      "relationship.gif", _function);
  }
  
  @Fix(ModelValidator.IDENTIFIER_NAME_FIRST_CHARACTER_NOT_LOWERCASE)
  public void lowercaseIdentifierNameFirstLetter(final Issue issue, final IssueResolutionAcceptor acceptor) {
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
      this._modelIndex.getVisibleExternalEntitiesDescriptions(element).forEach(_function_1);
    };
    acceptor.accept(issue, "Change to lower case first letter", "Change to lower case first letter", 
      "identifier.gif", _function);
  }
  
  @Fix(ModelValidator.TABLE_DOES_NOT_HAVE_COLUMNS)
  public void addingColumnToTable(final Issue issue, final IssueResolutionAcceptor acceptor) {
    final ISemanticModification _function = (EObject element, IModificationContext context) -> {
      if (((element instanceof YAnnotTable) && (((YAnnotTable) element).getEntityref() != null))) {
        final YAnnotTable table = ((YAnnotTable) element);
        final EList<YAnnotEntityInner> list = ((YAnnotTable) element).getEntityref().getAnnotations();
        final Consumer<YAnnotEntityInner> _function_1 = (YAnnotEntityInner entityInner) -> {
          if ((entityInner instanceof YAnnotAttribute)) {
            final YAnnotAttribute attribute = ((YAnnotAttribute) entityInner);
            final YAnnotAbstractColumn abstractColumn = this._modelUtil.converAttributeIntoAbstractColumn(attribute);
            table.getColumns().add(abstractColumn);
          }
        };
        list.forEach(_function_1);
      }
    };
    acceptor.accept(issue, "Add all missing columns using list of attributes", 
      "Add all missing columns using related list of attributes", "column.gif", _function);
  }
}
