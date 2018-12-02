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
package eu.jgen.notes.dmw.lite.mdl.formatting2;

import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotDatabase;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotJava;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotSwift;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotation;
import eu.jgen.notes.dmw.lite.mdl.model.YImport;
import eu.jgen.notes.dmw.lite.mdl.model.YModel;
import eu.jgen.notes.dmw.lite.mdl.services.ModelGrammarAccess;
import java.util.Arrays;
import java.util.function.Consumer;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.formatting2.AbstractFormatter2;
import org.eclipse.xtext.formatting2.IFormattableDocument;
import org.eclipse.xtext.formatting2.IHiddenRegionFormatter;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelFormatter extends AbstractFormatter2 {
  @Inject
  @Extension
  private ModelGrammarAccess _modelGrammarAccess;
  
  protected void _format(final YModel model, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(this.textRegionExtensions.regionFor(model).keyword("package"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(this.textRegionExtensions.regionFor(model).feature(ModelPackage.eINSTANCE.getYModel_Name()), _function_1);
    EList<YImport> _imports = model.getImports();
    for (final YImport yImport : _imports) {
      document.<YImport>format(yImport);
    }
    EList<YAnnotation> _annotations = model.getAnnotations();
    for (final YAnnotation annotation : _annotations) {
      if ((annotation instanceof YAnnotEntity)) {
        document.<YAnnotEntity>format(((YAnnotEntity) annotation));
      } else {
        if ((annotation instanceof YAnnotTechnicalDesign)) {
          document.<YAnnotTechnicalDesign>format(((YAnnotTechnicalDesign) annotation));
        } else {
          if ((annotation instanceof YAnnotDatabase)) {
            document.<YAnnotDatabase>format(((YAnnotDatabase) annotation));
          } else {
            if ((annotation instanceof YAnnotJava)) {
              document.<YAnnotJava>format(((YAnnotJava) annotation));
            } else {
              if ((annotation instanceof YAnnotSwift)) {
                document.<YAnnotSwift>format(((YAnnotSwift) annotation));
              } else {
                document.<YAnnotation>format(annotation);
              }
            }
          }
        }
      }
    }
  }
  
  protected void _format(final YImport imp, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(imp).keyword("import"), _function), _function_1);
    this.textRegionExtensions.regionFor(imp).feature(ModelPackage.eINSTANCE.getYImport_ImportedNamespace());
  }
  
  protected void _format(final YAnnotDatabase annotDatabase, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotDatabase).keyword("@database"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotDatabase).feature(ModelPackage.eINSTANCE.getYImport_ImportedNamespace()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotDatabase).keyword(";"), _function_3);
  }
  
  protected void _format(final YAnnotSwift annotSwift, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotSwift).keyword("@swift"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotSwift).keyword("module"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotSwift).keyword("uses"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotSwift).keyword(";"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotSwift).feature(ModelPackage.eINSTANCE.getYAnnotSwift_Name()), _function_5);
  }
  
  protected void _format(final YAnnotJava annotJava, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotJava).keyword("@java"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotJava).keyword("uses"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotJava).keyword(";"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotJava).feature(ModelPackage.eINSTANCE.getYAnnotSwift_Name()), _function_4);
  }
  
  protected void _format(final YAnnotEntity annotEntity, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotEntity).keyword("@entity"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotEntity).keyword(":"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotEntity).feature(ModelPackage.eINSTANCE.getYAnnotEntity_Name()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotEntity).keyword("{"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    final Consumer<YAnnotEntityInner> _function_7 = (YAnnotEntityInner it) -> {
      document.<YAnnotEntityInner>format(it);
    };
    document.<YAnnotEntity>interior(annotEntity, _function_6).getAnnotations().forEach(_function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotEntity).keyword("}"), _function_8);
  }
  
  protected void _format(final YAnnotAttribute annotAttr, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotAttr).keyword("@attribute"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotAttr).feature(ModelPackage.eINSTANCE.getYAnnotAttribute_Name()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotAttr).keyword(":"), _function_3);
    this.textRegionExtensions.regionFor(annotAttr).keyword(";");
  }
  
  protected void _format(final YAnnotRelationship annotRel, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotRel).keyword("@relationship"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).feature(ModelPackage.eINSTANCE.getYAnnotRelationship_Name()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).keyword("?"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).keyword("->"), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).feature(ModelPackage.eINSTANCE.getYAnnotRelationship_Target()), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).keyword("*"), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotRel).keyword("<-"), _function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotRel).feature(ModelPackage.eINSTANCE.getYAnnotRelationship_Inverse()), _function_8), _function_9);
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotRel).keyword(";"), _function_10);
  }
  
  protected void _format(final YAnnotIdentifier annotId, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotId).keyword("@identifier"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotId).feature(ModelPackage.eINSTANCE.getYAnnotIdentifier_Name()), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotId).keyword("("), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotId).keyword(","), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    final Consumer<YAnnotIdInner> _function_7 = (YAnnotIdInner it) -> {
      document.<YAnnotIdInner>format(it);
    };
    document.<YAnnotIdentifier>interior(annotId, _function_6).getAnnots().forEach(_function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotId).keyword(")"), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotId).keyword(";"), _function_9);
  }
  
  protected void _format(final YAnnotTechnicalDesign annotTechnicalDesign, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.setNewLines(2);
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotTechnicalDesign).keyword("@td"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotTechnicalDesign).keyword("database"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotTechnicalDesign).feature(ModelPackage.eINSTANCE.getYAnnotTechnicalDesign_Database()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotTechnicalDesign).keyword("{"), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    final Consumer<YAnnotTable> _function_7 = (YAnnotTable it) -> {
      document.<YAnnotTable>format(it);
    };
    document.<YAnnotTechnicalDesign>interior(annotTechnicalDesign, _function_6).getFeatures().forEach(_function_7);
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotTechnicalDesign).keyword("}"), _function_8);
  }
  
  protected void _format(final YAnnotTable annotTable, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotTable).keyword("@table"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotTable).feature(ModelPackage.eINSTANCE.getYAnnotTable_Name()), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotTable).keyword("->"), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotTable).feature(ModelPackage.eINSTANCE.getYAnnotTable_Entityref()), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotTable).keyword("{"), _function_5), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.indent();
    };
    final Consumer<YAnnotAbstractColumn> _function_8 = (YAnnotAbstractColumn it) -> {
      document.<YAnnotAbstractColumn>format(it);
    };
    document.<YAnnotTable>interior(annotTable, _function_7).getColumns().forEach(_function_8);
    document.<YAnnotPrimaryKey>format(annotTable.getPrimarykey());
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotTable).keyword("}"), _function_9), _function_10);
  }
  
  protected void _format(final YAnnotAbstractColumn annotAbstractColumn, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotAbstractColumn).keyword("@column"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotAbstractColumn).feature(ModelPackage.eINSTANCE.getYAnnotAbstractColumn_Name()), _function_2);
    document.<EObject>format(annotAbstractColumn.getType());
  }
  
  protected void _format(final YAnnotColumn annotColumn, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotColumn).keyword("->"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotColumn).feature(ModelPackage.eINSTANCE.getYAnnotColumn_Attrref()), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotColumn).keyword("as"), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotColumn).feature(ModelPackage.eINSTANCE.getYAnnotColumn_Type()), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotColumn).keyword(";"), _function_4);
  }
  
  protected void _format(final YAnnotColumnLike annotColumnLike, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotColumnLike).keyword("->"), _function);
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotColumnLike).feature(ModelPackage.eINSTANCE.getYAnnotColumnLike_Columnref()), _function_1), _function_2);
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotColumnLike).keyword(";"), _function_3);
  }
  
  protected void _format(final YAnnotPrimaryKey annotPrimaryKey, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotPrimaryKey).keyword("@primary"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotPrimaryKey).keyword("("), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotPrimaryKey).keyword(","), _function_4);
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
    };
    final Consumer<YAnnotAbstractColumn> _function_6 = (YAnnotAbstractColumn it) -> {
      it.getName();
    };
    document.<YAnnotPrimaryKey>interior(annotPrimaryKey, _function_5).getColumns().forEach(_function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_8 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotPrimaryKey).keyword(")"), _function_7), _function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotPrimaryKey).keyword(";"), _function_9);
  }
  
  protected void _format(final YAnnotForeignKey annotForeignKey, @Extension final IFormattableDocument document) {
    final Procedure1<IHiddenRegionFormatter> _function = (IHiddenRegionFormatter it) -> {
      it.newLine();
    };
    final Procedure1<IHiddenRegionFormatter> _function_1 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotForeignKey).keyword("@foreign"), _function), _function_1);
    final Procedure1<IHiddenRegionFormatter> _function_2 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_3 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotForeignKey).feature(ModelPackage.eINSTANCE.getYAnnotForeignKey_Relationship()), _function_2), _function_3);
    final Procedure1<IHiddenRegionFormatter> _function_4 = (IHiddenRegionFormatter it) -> {
      it.oneSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_5 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotForeignKey).keyword("("), _function_4), _function_5);
    final Procedure1<IHiddenRegionFormatter> _function_6 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.surround(this.textRegionExtensions.regionFor(annotForeignKey).keyword(","), _function_6);
    final Procedure1<IHiddenRegionFormatter> _function_7 = (IHiddenRegionFormatter it) -> {
    };
    final Consumer<YAnnotAbstractColumn> _function_8 = (YAnnotAbstractColumn it) -> {
      it.getName();
    };
    document.<YAnnotForeignKey>interior(annotForeignKey, _function_7).getColumns().forEach(_function_8);
    final Procedure1<IHiddenRegionFormatter> _function_9 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    final Procedure1<IHiddenRegionFormatter> _function_10 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.append(document.prepend(this.textRegionExtensions.regionFor(annotForeignKey).keyword(")"), _function_9), _function_10);
    final Procedure1<IHiddenRegionFormatter> _function_11 = (IHiddenRegionFormatter it) -> {
      it.noSpace();
    };
    document.prepend(this.textRegionExtensions.regionFor(annotForeignKey).keyword(";"), _function_11);
  }
  
  public void format(final Object annotAttr, final IFormattableDocument document) {
    if (annotAttr instanceof XtextResource) {
      _format((XtextResource)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotAttribute) {
      _format((YAnnotAttribute)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotDatabase) {
      _format((YAnnotDatabase)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotEntity) {
      _format((YAnnotEntity)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotIdentifier) {
      _format((YAnnotIdentifier)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotJava) {
      _format((YAnnotJava)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotRelationship) {
      _format((YAnnotRelationship)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotSwift) {
      _format((YAnnotSwift)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotTechnicalDesign) {
      _format((YAnnotTechnicalDesign)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotAbstractColumn) {
      _format((YAnnotAbstractColumn)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotColumn) {
      _format((YAnnotColumn)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotColumnLike) {
      _format((YAnnotColumnLike)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotForeignKey) {
      _format((YAnnotForeignKey)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotPrimaryKey) {
      _format((YAnnotPrimaryKey)annotAttr, document);
      return;
    } else if (annotAttr instanceof YAnnotTable) {
      _format((YAnnotTable)annotAttr, document);
      return;
    } else if (annotAttr instanceof YImport) {
      _format((YImport)annotAttr, document);
      return;
    } else if (annotAttr instanceof YModel) {
      _format((YModel)annotAttr, document);
      return;
    } else if (annotAttr instanceof EObject) {
      _format((EObject)annotAttr, document);
      return;
    } else if (annotAttr == null) {
      _format((Void)null, document);
      return;
    } else if (annotAttr != null) {
      _format(annotAttr, document);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(annotAttr, document).toString());
    }
  }
}
