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
package eu.jgen.notes.dmw.lite.mdl.utility;

import com.google.common.base.CaseFormat;
import com.google.common.base.Objects;
import eu.jgen.notes.dmw.lite.mdl.DMWRuntimeException;
import eu.jgen.notes.dmw.lite.mdl.model.ModelFactory;
import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotBoolConstant;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotExpression;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdInner;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotKeyword;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotNumberConstant;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotStringConstant;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTable;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotTechnicalDesign;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescriptions;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class ModelUtil {
  public final String KW_DATABASE = "database";
  
  public final String KW_SWIFT = "swift";
  
  public final String KW_JAVA = "java";
  
  public final String KW_MODULE = "module";
  
  public final String KW_DERBY = "Derby";
  
  public final String KW_MYSQL = "MySQL";
  
  public final String KW_SQLITE = "SQLite";
  
  public final String KW_POSTGRESQL = "PostgreSQL";
  
  public final String KW_MONGODB = "MongoDB";
  
  public final String KW_INT = "Int";
  
  public final String KW_SHORT = "Short";
  
  public final String KW_LONG = "Long";
  
  public final String KW_DOUBLE = "Double";
  
  public final String KW_STRING = "String";
  
  public final String KW_DATE = "Date";
  
  public final String KW_TIME = "Time";
  
  public final String KW_TIMESTAMP = "Timestamp";
  
  public final String KW_BLOB = "Blob";
  
  public final String KW_BOOL = "Bool";
  
  public final String KWUP_INT = "INTEGER";
  
  public final String KWUP_SMALLINT = "SMALLINT";
  
  public final String KWUP_DECIMAL = "DECIMAL";
  
  public final String KWUP_CHAR = "CHAR";
  
  public final String KWUP_DATE = "DATE";
  
  public final String KWUP_TIME = "TIME";
  
  public final String KWUP_BIGINT = "INTEGER";
  
  public final String KWUP_TIMESTAMP = "TIMESTAMP";
  
  public final String KWUP_BLOB = "BLOB";
  
  public final String KWUP_BOOLEAN = "BOOLEAN";
  
  public final String KW_TYPE = "type";
  
  public final String KW_LENGTH = "length";
  
  public final String KW_DEFAULT = "default";
  
  public final String KW_DECIMAL = "decimal";
  
  public final String KW_FORMAT = "format";
  
  public final String KW_FOREIGNKEY = "foreignkey";
  
  public final String KW_OPTONAL = "?";
  
  public final int DEFAULT_INT = 0;
  
  public final int DEFAULT_SHORT = 0;
  
  public final double DEFAULT_DECIMAL = 0.0;
  
  public final String FORMAT_TIMESTAMP = "yyyy.MM.dd.HH:mm:ss.nnn";
  
  public final String FORMAT_TIME = "HH:mm:ss";
  
  public final String FORMAT_DATE = "yyyy-MM-dd";
  
  public final String EXCEPTION_STRING = "Cannot extract value because of not existent annotation pair";
  
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private IContainer.Manager containerManager;
  
  public String isIntFormatCorrect(final String textValue, final String textType) {
    try {
      final int valueInt = Integer.parseUnsignedInt(textValue);
      if (((valueInt < 1) || (valueInt > 9))) {
        return "Value of Int should in the range of 1 and 9.";
      }
      return null;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        return (("Format " + textValue) + " as Int is incorrect.");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String isIntDefaultCorrect(final String textValue) {
    try {
      Integer.parseInt(textValue);
      return null;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        return (("Default value format " + textValue) + " as Int is incorrect.");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String isShortFormatCorrect(final String textValue) {
    try {
      final short valueInt = Short.parseShort(textValue);
      if (((valueInt < 1) || (valueInt > 4))) {
        return "Value of Short should in the range of 1 and 4.";
      }
      return null;
    } catch (final Throwable _t) {
      if (_t instanceof NumberFormatException) {
        return (("Format " + textValue) + " as Short is incorrect.");
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String isDateFormatCorrect(final String dateText, final String formatText) {
    try {
      final SimpleDateFormat format = new SimpleDateFormat(formatText);
      try {
        format.setLenient(false);
        format.parse(dateText);
        return null;
      } catch (final Throwable _t) {
        if (_t instanceof ParseException) {
          String _pattern = ((SimpleDateFormat) format).toPattern();
          String _plus = ((("Date " + dateText) + " is not valid according to ") + _pattern);
          return (_plus + 
            " pattern.");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        final IllegalArgumentException e = (IllegalArgumentException)_t;
        String _message = e.getMessage();
        return ((("Format " + formatText) + ": ") + _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String isTimeFormatCorrect(final String timeText, final String formatText) {
    try {
      final DateFormat format = SimpleDateFormat.getTimeInstance();
      try {
        format.setLenient(false);
        format.parse(timeText);
        return null;
      } catch (final Throwable _t) {
        if (_t instanceof ParseException) {
          String _pattern = ((SimpleDateFormat) format).toPattern();
          String _plus = ((("Time " + timeText) + " is not valid according to ") + _pattern);
          return (_plus + 
            " pattern.");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        final IllegalArgumentException e = (IllegalArgumentException)_t;
        String _message = e.getMessage();
        return ((("Format " + formatText) + ": ") + _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public String isTimestampFormatCorrect(final String timestampText, final String formatText) {
    try {
      final SimpleDateFormat format = new SimpleDateFormat(timestampText);
      try {
        format.setLenient(false);
        format.parse(timestampText);
        return null;
      } catch (final Throwable _t) {
        if (_t instanceof ParseException) {
          String _pattern = ((SimpleDateFormat) format).toPattern();
          String _plus = ((("Timestamp " + timestampText) + " is not valid according to ") + _pattern);
          return (_plus + " pattern.");
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    } catch (final Throwable _t) {
      if (_t instanceof IllegalArgumentException) {
        final IllegalArgumentException e = (IllegalArgumentException)_t;
        String _message = e.getMessage();
        return ((("Format " + formatText) + ": ") + _message);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
  
  public ArrayList<String> createProposalAnnotationList(final YAnnotTechnicalDesign annotTechnicalDesign) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_DATABASE);
    boolean _not = (!_isAnnotHavingSpecificName);
    if (_not) {
      list.add("database=Derby");
    }
    boolean _isAnnotHavingSpecificName_1 = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_JAVA);
    boolean _not_1 = (!_isAnnotHavingSpecificName_1);
    if (_not_1) {
      list.add("java=true");
    }
    boolean _isAnnotHavingSpecificName_2 = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_SWIFT);
    boolean _not_2 = (!_isAnnotHavingSpecificName_2);
    if (_not_2) {
      list.add("swift=true");
    }
    boolean _isAnnotHavingSpecificName_3 = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_MODULE);
    boolean _not_3 = (!_isAnnotHavingSpecificName_3);
    if (_not_3) {
      list.add("module=\"somename\"");
    }
    return list;
  }
  
  public ArrayList<String> createProposalAnnotationList(final YAnnotAttribute annotAttr) {
    final ArrayList<String> list = CollectionLiterals.<String>newArrayList();
    int _size = annotAttr.getElementValuePairs().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      list.add("type=");
      return list;
    }
    String _extractAttributeType = this.extractAttributeType(annotAttr);
    boolean _equals_1 = Objects.equal(_extractAttributeType, this.KW_INT);
    if (_equals_1) {
      boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_LENGTH);
      boolean _not = (!_isAnnotHavingSpecificName);
      if (_not) {
        list.add("length=9");
      }
      boolean _isAnnotHavingSpecificName_1 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DOUBLE);
      boolean _not_1 = (!_isAnnotHavingSpecificName_1);
      if (_not_1) {
        list.add("decimal=2");
      }
      boolean _isAnnotHavingSpecificName_2 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_2 = (!_isAnnotHavingSpecificName_2);
      if (_not_2) {
        list.add("default=0");
      }
    }
    String _extractAttributeType_1 = this.extractAttributeType(annotAttr);
    boolean _equals_2 = Objects.equal(_extractAttributeType_1, this.KW_SHORT);
    if (_equals_2) {
      boolean _isAnnotHavingSpecificName_3 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_LENGTH);
      boolean _not_3 = (!_isAnnotHavingSpecificName_3);
      if (_not_3) {
        list.add("length=4");
      }
      boolean _isAnnotHavingSpecificName_4 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DOUBLE);
      boolean _not_4 = (!_isAnnotHavingSpecificName_4);
      if (_not_4) {
        list.add("decimal=2");
      }
      boolean _isAnnotHavingSpecificName_5 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_5 = (!_isAnnotHavingSpecificName_5);
      if (_not_5) {
        list.add("default=0");
      }
    }
    String _extractAttributeType_2 = this.extractAttributeType(annotAttr);
    boolean _equals_3 = Objects.equal(_extractAttributeType_2, this.KW_DOUBLE);
    if (_equals_3) {
      boolean _isAnnotHavingSpecificName_6 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_LENGTH);
      boolean _not_6 = (!_isAnnotHavingSpecificName_6);
      if (_not_6) {
        list.add("length=16");
      }
      boolean _isAnnotHavingSpecificName_7 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DOUBLE);
      boolean _not_7 = (!_isAnnotHavingSpecificName_7);
      if (_not_7) {
        list.add("decimal=2");
      }
      boolean _isAnnotHavingSpecificName_8 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_8 = (!_isAnnotHavingSpecificName_8);
      if (_not_8) {
        list.add("default=0");
      }
    }
    String _extractAttributeType_3 = this.extractAttributeType(annotAttr);
    boolean _equals_4 = Objects.equal(_extractAttributeType_3, this.KW_STRING);
    if (_equals_4) {
      boolean _isAnnotHavingSpecificName_9 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_LENGTH);
      boolean _not_9 = (!_isAnnotHavingSpecificName_9);
      if (_not_9) {
        list.add("length=20");
      }
      boolean _isAnnotHavingSpecificName_10 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_10 = (!_isAnnotHavingSpecificName_10);
      if (_not_10) {
        list.add("default=\"\"");
      }
    }
    String _extractAttributeType_4 = this.extractAttributeType(annotAttr);
    boolean _equals_5 = Objects.equal(_extractAttributeType_4, this.KW_DATE);
    if (_equals_5) {
      boolean _isAnnotHavingSpecificName_11 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_11 = (!_isAnnotHavingSpecificName_11);
      if (_not_11) {
        LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        String _format = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);
        String _plus = ("default=\"" + _format);
        String _plus_1 = (_plus + "\"");
        list.add(_plus_1);
      }
      boolean _isAnnotHavingSpecificName_12 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_FORMAT);
      boolean _not_12 = (!_isAnnotHavingSpecificName_12);
      if (_not_12) {
        list.add((("format=\"" + this.FORMAT_DATE) + "\""));
      }
    }
    String _extractAttributeType_5 = this.extractAttributeType(annotAttr);
    boolean _equals_6 = Objects.equal(_extractAttributeType_5, this.KW_TIME);
    if (_equals_6) {
      boolean _isAnnotHavingSpecificName_13 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_13 = (!_isAnnotHavingSpecificName_13);
      if (_not_13) {
        LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_TIME);
        String _substring = LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_TIME).substring(0, 8);
        String _plus_2 = ("default=\"" + _substring);
        String _plus_3 = (_plus_2 + "\"");
        list.add(_plus_3);
      }
      boolean _isAnnotHavingSpecificName_14 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_FORMAT);
      boolean _not_14 = (!_isAnnotHavingSpecificName_14);
      if (_not_14) {
        list.add((("format=\"" + this.FORMAT_TIME) + "\""));
      }
    }
    String _extractAttributeType_6 = this.extractAttributeType(annotAttr);
    boolean _equals_7 = Objects.equal(_extractAttributeType_6, this.KW_TIMESTAMP);
    if (_equals_7) {
      boolean _isAnnotHavingSpecificName_15 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_DEFAULT);
      boolean _not_15 = (!_isAnnotHavingSpecificName_15);
      if (_not_15) {
        LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String _format_1 = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String _plus_4 = ("default=\"" + _format_1);
        String _plus_5 = (_plus_4 + ".");
        String _format_2 = LocalTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
        String _plus_6 = (_plus_5 + _format_2);
        String _plus_7 = (_plus_6 + "\"");
        list.add(_plus_7);
      }
      boolean _isAnnotHavingSpecificName_16 = this.isAnnotHavingSpecificName(annotAttr.getElementValuePairs(), this.KW_FORMAT);
      boolean _not_16 = (!_isAnnotHavingSpecificName_16);
      if (_not_16) {
        list.add((("format=\"" + this.FORMAT_TIMESTAMP) + "\""));
      }
    }
    return list;
  }
  
  public YAnnotationElementValuePair findUnsupportedAnnotation(final YAnnotAttribute annotAttr) {
    String _extractAttributeType = this.extractAttributeType(annotAttr);
    boolean _equals = Objects.equal(_extractAttributeType, this.KW_INT);
    if (_equals) {
      EList<YAnnotationElementValuePair> _elementValuePairs = annotAttr.getElementValuePairs();
      for (final YAnnotationElementValuePair pair : _elementValuePairs) {
        if ((Objects.equal(pair.getName(), this.KW_LENGTH) && (pair.getValue() instanceof YAnnotNumberConstant))) {
        } else {
          if ((Objects.equal(pair.getName(), this.KW_DOUBLE) && (pair.getValue() instanceof YAnnotNumberConstant))) {
          } else {
            if ((Objects.equal(pair.getName(), this.KW_DEFAULT) && (pair.getValue() instanceof YAnnotNumberConstant))) {
            } else {
              if ((Objects.equal(pair.getName(), this.KW_TYPE) && (pair.getValue() instanceof YAnnotKeyword))) {
              } else {
                return pair;
              }
            }
          }
        }
      }
      return null;
    }
    String _extractAttributeType_1 = this.extractAttributeType(annotAttr);
    boolean _equals_1 = Objects.equal(_extractAttributeType_1, this.KW_SHORT);
    if (_equals_1) {
      EList<YAnnotationElementValuePair> _elementValuePairs_1 = annotAttr.getElementValuePairs();
      for (final YAnnotationElementValuePair pair_1 : _elementValuePairs_1) {
        if ((Objects.equal(pair_1.getName(), this.KW_LENGTH) && (pair_1.getValue() instanceof YAnnotNumberConstant))) {
        } else {
          if ((Objects.equal(pair_1.getName(), this.KW_DOUBLE) && (pair_1.getValue() instanceof YAnnotNumberConstant))) {
          } else {
            if ((Objects.equal(pair_1.getName(), this.KW_DEFAULT) && (pair_1.getValue() instanceof YAnnotNumberConstant))) {
            } else {
              if ((Objects.equal(pair_1.getName(), this.KW_TYPE) && (pair_1.getValue() instanceof YAnnotKeyword))) {
              } else {
                return pair_1;
              }
            }
          }
        }
      }
      return null;
    }
    String _extractAttributeType_2 = this.extractAttributeType(annotAttr);
    boolean _equals_2 = Objects.equal(_extractAttributeType_2, this.KW_STRING);
    if (_equals_2) {
      EList<YAnnotationElementValuePair> _elementValuePairs_2 = annotAttr.getElementValuePairs();
      for (final YAnnotationElementValuePair pair_2 : _elementValuePairs_2) {
        if ((Objects.equal(pair_2.getName(), this.KW_LENGTH) && (pair_2.getValue() instanceof YAnnotNumberConstant))) {
        } else {
          if ((Objects.equal(pair_2.getName(), this.KW_DEFAULT) && (pair_2.getValue() instanceof YAnnotStringConstant))) {
          } else {
            if ((Objects.equal(pair_2.getName(), this.KW_TYPE) && (pair_2.getValue() instanceof YAnnotKeyword))) {
            } else {
              return pair_2;
            }
          }
        }
      }
      return null;
    }
    String _extractAttributeType_3 = this.extractAttributeType(annotAttr);
    boolean _equals_3 = Objects.equal(_extractAttributeType_3, this.KW_DATE);
    if (_equals_3) {
      EList<YAnnotationElementValuePair> _elementValuePairs_3 = annotAttr.getElementValuePairs();
      for (final YAnnotationElementValuePair pair_3 : _elementValuePairs_3) {
        if ((Objects.equal(pair_3.getName(), this.KW_FORMAT) && (pair_3.getValue() instanceof YAnnotStringConstant))) {
        } else {
          if ((Objects.equal(pair_3.getName(), this.KW_DEFAULT) && (pair_3.getValue() instanceof YAnnotStringConstant))) {
          } else {
            if ((Objects.equal(pair_3.getName(), this.KW_TYPE) && (pair_3.getValue() instanceof YAnnotKeyword))) {
            } else {
              return pair_3;
            }
          }
        }
      }
      return null;
    }
    return null;
  }
  
  public YAnnotationElementValuePair findUnsupportedAnnotation(final YAnnotTechnicalDesign annotTechnicalDesign) {
    EList<YAnnotationElementValuePair> _elementValuePairs = annotTechnicalDesign.getElementValuePairs();
    for (final YAnnotationElementValuePair annotationElementValuePair : _elementValuePairs) {
      if (((((!Objects.equal(annotationElementValuePair.getName(), this.KW_DATABASE)) && (!Objects.equal(annotationElementValuePair.getName(), this.KW_SWIFT))) && 
        (!Objects.equal(annotationElementValuePair.getName(), this.KW_JAVA))) && (!Objects.equal(annotationElementValuePair.getName(), this.KW_MODULE)))) {
        return annotationElementValuePair;
      }
    }
    return null;
  }
  
  public String extractDatabaseType(final YAnnotTechnicalDesign annotTechnicalDesign) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_DATABASE);
    if (_isAnnotHavingSpecificName) {
      return this.extractAnnotValueKeyword(annotTechnicalDesign.getElementValuePairs(), this.KW_DATABASE);
    }
    return this.KW_DERBY;
  }
  
  public String extractModuleName(final YAnnotTechnicalDesign annotTechnicalDesign) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_MODULE);
    if (_isAnnotHavingSpecificName) {
      return this.extractAnnotValueKeyword(annotTechnicalDesign.getElementValuePairs(), this.KW_MODULE);
    }
    return annotTechnicalDesign.getName();
  }
  
  public boolean extractJavaIndicator(final YAnnotTechnicalDesign annotTechnicalDesign) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_JAVA);
    if (_isAnnotHavingSpecificName) {
      return this.extractAnnotValueBoolean(annotTechnicalDesign.getElementValuePairs(), this.KW_JAVA);
    }
    return true;
  }
  
  public boolean extractSwiftIndicator(final YAnnotTechnicalDesign annotTechnicalDesign) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotTechnicalDesign.getElementValuePairs(), this.KW_SWIFT);
    if (_isAnnotHavingSpecificName) {
      return this.extractAnnotValueBoolean(annotTechnicalDesign.getElementValuePairs(), this.KW_SWIFT);
    }
    return true;
  }
  
  public boolean isForeignKeyDesignated(final YAnnotRelationship relationship) {
    boolean _xblockexpression = false;
    {
      boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(relationship.getElementValuePairs(), this.KW_FOREIGNKEY);
      if (_isAnnotHavingSpecificName) {
        return this.extractAnnotValueBoolean(relationship.getElementValuePairs(), this.KW_FOREIGNKEY);
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean extractAnnotValueBoolean(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair pair : list) {
      String _name = pair.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        YAnnotExpression _value = pair.getValue();
        if ((_value instanceof YAnnotBoolConstant)) {
          YAnnotExpression _value_1 = pair.getValue();
          final YAnnotBoolConstant value = ((YAnnotBoolConstant) _value_1);
          String _value_2 = value.getValue();
          boolean _equals_1 = Objects.equal(_value_2, "true");
          if (_equals_1) {
            return true;
          } else {
            return false;
          }
        }
      }
    }
    throw new DMWRuntimeException(this.EXCEPTION_STRING);
  }
  
  public String extractAnnotValueString(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair pair : list) {
      String _name = pair.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        YAnnotExpression _value = pair.getValue();
        if ((_value instanceof YAnnotStringConstant)) {
          YAnnotExpression _value_1 = pair.getValue();
          final YAnnotStringConstant value = ((YAnnotStringConstant) _value_1);
          return value.getValue();
        }
      }
    }
    throw new DMWRuntimeException(this.EXCEPTION_STRING);
  }
  
  public String extractAnnotValueNumber(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair pair : list) {
      String _name = pair.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        YAnnotExpression _value = pair.getValue();
        if ((_value instanceof YAnnotNumberConstant)) {
          YAnnotExpression _value_1 = pair.getValue();
          final YAnnotNumberConstant value = ((YAnnotNumberConstant) _value_1);
          return value.getValue();
        }
      }
    }
    throw new DMWRuntimeException(this.EXCEPTION_STRING);
  }
  
  public String extractAnnotValueKeyword(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair pair : list) {
      String _name = pair.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        YAnnotExpression _value = pair.getValue();
        if ((_value instanceof YAnnotKeyword)) {
          YAnnotExpression _value_1 = pair.getValue();
          final YAnnotKeyword value = ((YAnnotKeyword) _value_1);
          return value.getValue();
        }
      }
    }
    throw new DMWRuntimeException(this.EXCEPTION_STRING);
  }
  
  public boolean isAnnotHavingSpecificName(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair annotationElementValuePair : list) {
      String _name = annotationElementValuePair.getName();
      boolean _equals = Objects.equal(_name, name);
      if (_equals) {
        return true;
      }
    }
    return false;
  }
  
  public YAnnotationElementValuePair getPairHavingSpecificName(final EList<YAnnotationElementValuePair> list, final String name) {
    for (final YAnnotationElementValuePair annotationElementValuePair : list) {
      return annotationElementValuePair;
    }
    throw new DMWRuntimeException("Cannot extract pair because of not existent annotation pair");
  }
  
  public String getColumnName(final YAnnotColumn column) {
    EObject _eContainer = column.eContainer();
    return ((YAnnotAbstractColumn) _eContainer).getName();
  }
  
  public String getColumnTypeName(final YAnnotAbstractColumn abstractColumn) {
    String _xblockexpression = null;
    {
      EObject _type = abstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = abstractColumn.getType();
        return ((YAnnotColumn) _type_1).getType();
      }
      _xblockexpression = "yet unknown";
    }
    return _xblockexpression;
  }
  
  public boolean isColumnOptional(final YAnnotAbstractColumn abstractColumn) {
    boolean _xblockexpression = false;
    {
      EObject _type = abstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = abstractColumn.getType();
        final YAnnotColumn column = ((YAnnotColumn) _type_1);
        String _optional = column.getOptional();
        boolean _tripleEquals = (_optional == null);
        if (_tripleEquals) {
          return false;
        } else {
          String _optional_1 = column.getOptional();
          boolean _equals = Objects.equal(_optional_1, this.KW_OPTONAL);
          if (_equals) {
            return true;
          }
        }
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public int getColumnDecimal(final YAnnotAbstractColumn abstractColumn) {
    int _xblockexpression = (int) 0;
    {
      EObject _type = abstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = abstractColumn.getType();
        return this.extractDecimal(((YAnnotColumn) _type_1));
      }
      _xblockexpression = 0;
    }
    return _xblockexpression;
  }
  
  public YAnnotAbstractColumn converAttributeIntoAbstractColumn(final YAnnotAttribute attribute) {
    YAnnotAbstractColumn _createYAnnotAbstractColumn = ModelFactory.eINSTANCE.createYAnnotAbstractColumn();
    final Procedure1<YAnnotAbstractColumn> _function = (YAnnotAbstractColumn it) -> {
      it.setName(this.convertToTechnicalDesignName(attribute.getName()));
      YAnnotColumn _createYAnnotColumn = ModelFactory.eINSTANCE.createYAnnotColumn();
      final Procedure1<YAnnotColumn> _function_1 = (YAnnotColumn it_1) -> {
        it_1.setAttrref(attribute);
      };
      final YAnnotColumn column = ObjectExtensions.<YAnnotColumn>operator_doubleArrow(_createYAnnotColumn, _function_1);
      it.setType(column);
      this.doSelectColumnProperties(column, attribute);
      this.doReplicateAttributeAnnotations(column, attribute);
    };
    final YAnnotAbstractColumn abstractColumn = ObjectExtensions.<YAnnotAbstractColumn>operator_doubleArrow(_createYAnnotAbstractColumn, _function);
    return abstractColumn;
  }
  
  private void doSelectColumnProperties(final YAnnotColumn column, final YAnnotAttribute attribute) {
    String _extractAttributeType = this.extractAttributeType(attribute);
    boolean _equals = Objects.equal(_extractAttributeType, this.KW_STRING);
    if (_equals) {
      column.setType(this.KWUP_CHAR);
    } else {
      String _extractAttributeType_1 = this.extractAttributeType(attribute);
      boolean _equals_1 = Objects.equal(_extractAttributeType_1, this.KW_SHORT);
      if (_equals_1) {
        column.setType(this.KWUP_SMALLINT);
      } else {
        String _extractAttributeType_2 = this.extractAttributeType(attribute);
        boolean _equals_2 = Objects.equal(_extractAttributeType_2, this.KW_INT);
        if (_equals_2) {
          column.setType(this.KWUP_INT);
        } else {
          String _extractAttributeType_3 = this.extractAttributeType(attribute);
          boolean _equals_3 = Objects.equal(_extractAttributeType_3, this.KW_LONG);
          if (_equals_3) {
            column.setType(this.KWUP_BIGINT);
          } else {
            String _extractAttributeType_4 = this.extractAttributeType(attribute);
            boolean _equals_4 = Objects.equal(_extractAttributeType_4, this.KW_DOUBLE);
            if (_equals_4) {
              column.setType(this.KWUP_DECIMAL);
            } else {
              String _extractAttributeType_5 = this.extractAttributeType(attribute);
              boolean _equals_5 = Objects.equal(_extractAttributeType_5, this.KW_DATE);
              if (_equals_5) {
                column.setType(this.KWUP_DATE);
              } else {
                String _extractAttributeType_6 = this.extractAttributeType(attribute);
                boolean _equals_6 = Objects.equal(_extractAttributeType_6, this.KW_TIME);
                if (_equals_6) {
                  column.setType(this.KWUP_TIME);
                } else {
                  String _extractAttributeType_7 = this.extractAttributeType(attribute);
                  boolean _equals_7 = Objects.equal(_extractAttributeType_7, this.KW_TIMESTAMP);
                  if (_equals_7) {
                    column.setType(this.KWUP_TIMESTAMP);
                  } else {
                    String _extractAttributeType_8 = this.extractAttributeType(attribute);
                    boolean _equals_8 = Objects.equal(_extractAttributeType_8, this.KW_BOOL);
                    if (_equals_8) {
                      column.setType(this.KWUP_BOOLEAN);
                    } else {
                      String _extractAttributeType_9 = this.extractAttributeType(attribute);
                      boolean _equals_9 = Objects.equal(_extractAttributeType_9, this.KW_BLOB);
                      if (_equals_9) {
                        column.setType(this.KWUP_BLOB);
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    if (((attribute.getOptional() != null) && Objects.equal(attribute.getOptional(), this.KW_OPTONAL))) {
      column.setOptional(this.KW_OPTONAL);
    }
  }
  
  public boolean areTypesCompatible(final String columnType, final String attributeType) {
    boolean _xifexpression = false;
    if ((Objects.equal(columnType, this.KWUP_CHAR) && Objects.equal(attributeType, this.KW_STRING))) {
      return true;
    } else {
      boolean _xifexpression_1 = false;
      if ((Objects.equal(columnType, this.KWUP_SMALLINT) && Objects.equal(attributeType, this.KW_SHORT))) {
        return true;
      } else {
        boolean _xifexpression_2 = false;
        if ((Objects.equal(columnType, this.KWUP_INT) && Objects.equal(attributeType, this.KW_INT))) {
          return true;
        } else {
          boolean _xifexpression_3 = false;
          if ((Objects.equal(columnType, this.KWUP_BIGINT) && Objects.equal(attributeType, this.KW_LONG))) {
            return true;
          } else {
            boolean _xifexpression_4 = false;
            if ((Objects.equal(columnType, this.KWUP_DECIMAL) && Objects.equal(attributeType, this.KW_DOUBLE))) {
              return true;
            } else {
              boolean _xifexpression_5 = false;
              if ((Objects.equal(columnType, this.KWUP_DATE) && Objects.equal(attributeType, this.KW_DATE))) {
                return true;
              } else {
                boolean _xifexpression_6 = false;
                if ((Objects.equal(columnType, this.KWUP_TIME) && Objects.equal(attributeType, this.KW_TIME))) {
                  return true;
                } else {
                  boolean _xifexpression_7 = false;
                  if ((Objects.equal(columnType, this.KWUP_TIMESTAMP) && Objects.equal(attributeType, this.KW_TIMESTAMP))) {
                    return true;
                  } else {
                    boolean _xifexpression_8 = false;
                    if ((Objects.equal(columnType, this.KWUP_BOOLEAN) && Objects.equal(attributeType, this.KW_BOOL))) {
                      return true;
                    } else {
                      boolean _xifexpression_9 = false;
                      if ((Objects.equal(columnType, this.KWUP_BLOB) && Objects.equal(attributeType, this.KW_BLOB))) {
                        return true;
                      } else {
                        _xifexpression_9 = false;
                      }
                      _xifexpression_8 = _xifexpression_9;
                    }
                    _xifexpression_7 = _xifexpression_8;
                  }
                  _xifexpression_6 = _xifexpression_7;
                }
                _xifexpression_5 = _xifexpression_6;
              }
              _xifexpression_4 = _xifexpression_5;
            }
            _xifexpression_3 = _xifexpression_4;
          }
          _xifexpression_2 = _xifexpression_3;
        }
        _xifexpression_1 = _xifexpression_2;
      }
      _xifexpression = _xifexpression_1;
    }
    return _xifexpression;
  }
  
  private void doReplicateAttributeAnnotations(final YAnnotColumn column, final YAnnotAttribute attribute) {
    String _extractAttributeType = this.extractAttributeType(attribute);
    boolean _equals = Objects.equal(_extractAttributeType, this.KW_STRING);
    if (_equals) {
      EList<YAnnotationElementValuePair> _elementValuePairs = column.getElementValuePairs();
      YAnnotationElementValuePair _createYAnnotationElementValuePair = ModelFactory.eINSTANCE.createYAnnotationElementValuePair();
      final Procedure1<YAnnotationElementValuePair> _function = (YAnnotationElementValuePair it) -> {
        it.setName("length");
        final YAnnotNumberConstant expression = ModelFactory.eINSTANCE.createYAnnotNumberConstant();
        expression.setValue(this.extractAnnotValueNumber(attribute.getElementValuePairs(), this.KW_LENGTH));
        it.setValue(expression);
      };
      YAnnotationElementValuePair _doubleArrow = ObjectExtensions.<YAnnotationElementValuePair>operator_doubleArrow(_createYAnnotationElementValuePair, _function);
      _elementValuePairs.add(_doubleArrow);
    }
  }
  
  public YAnnotTable converEntityIntoTable(final YAnnotEntity entity) {
    YAnnotTable _createYAnnotTable = ModelFactory.eINSTANCE.createYAnnotTable();
    final Procedure1<YAnnotTable> _function = (YAnnotTable it) -> {
      it.setName(this.convertToTechnicalDesignName(entity.getName()));
      it.setEntityref(entity);
    };
    final YAnnotTable table = ObjectExtensions.<YAnnotTable>operator_doubleArrow(_createYAnnotTable, _function);
    return table;
  }
  
  public YAnnotForeignKey converRelationshipIntoForeignKeys(final YAnnotRelationship relationship) {
    return this.doCreateForeignKeyForRelationship(relationship, relationship.getInverse());
  }
  
  private YAnnotForeignKey doCreateForeignKeyForRelationship(final YAnnotRelationship thisrelationship, final YAnnotRelationship targetRelationship) {
    YAnnotForeignKey _createYAnnotForeignKey = ModelFactory.eINSTANCE.createYAnnotForeignKey();
    final Procedure1<YAnnotForeignKey> _function = (YAnnotForeignKey it) -> {
      final List<YAnnotAbstractColumn> list = this.doConvertRelationshipIntoFKColumns(targetRelationship);
      for (final YAnnotAbstractColumn abstractColumn : list) {
        it.getColumns().add(abstractColumn);
      }
      it.setRelationship(thisrelationship);
    };
    final YAnnotForeignKey foreignKey = ObjectExtensions.<YAnnotForeignKey>operator_doubleArrow(_createYAnnotForeignKey, _function);
    return foreignKey;
  }
  
  private List<YAnnotAbstractColumn> doConvertRelationshipIntoFKColumns(final YAnnotRelationship relationship) {
    final ArrayList<YAnnotAbstractColumn> list = CollectionLiterals.<YAnnotAbstractColumn>newArrayList();
    EObject _eContainer = relationship.eContainer();
    final YAnnotEntity parentEntity = ((YAnnotEntity) _eContainer);
    final YAnnotTable parentTable = this.getImplementingTable(parentEntity);
    if (((parentTable == null) || (parentTable.getPrimarykey() == null))) {
      return list;
    }
    EList<YAnnotAbstractColumn> _columns = parentTable.getPrimarykey().getColumns();
    for (final YAnnotAbstractColumn abstractColumn : _columns) {
      {
        YAnnotAbstractColumn _createYAnnotAbstractColumn = ModelFactory.eINSTANCE.createYAnnotAbstractColumn();
        final Procedure1<YAnnotAbstractColumn> _function = (YAnnotAbstractColumn it) -> {
          String _name = parentTable.getName();
          String _plus = ("FK_" + _name);
          String _plus_1 = (_plus + "__");
          String _name_1 = abstractColumn.getName();
          String _plus_2 = (_plus_1 + _name_1);
          it.setName(_plus_2);
          YAnnotColumnLike _createYAnnotColumnLike = ModelFactory.eINSTANCE.createYAnnotColumnLike();
          final Procedure1<YAnnotColumnLike> _function_1 = (YAnnotColumnLike it_1) -> {
            it_1.setColumnref(abstractColumn);
          };
          final YAnnotColumnLike annotColumnLike = ObjectExtensions.<YAnnotColumnLike>operator_doubleArrow(_createYAnnotColumnLike, _function_1);
          it.setType(annotColumnLike);
        };
        final YAnnotAbstractColumn newAbstractColumn = ObjectExtensions.<YAnnotAbstractColumn>operator_doubleArrow(_createYAnnotAbstractColumn, _function);
        list.add(newAbstractColumn);
      }
    }
    return list;
  }
  
  public YAnnotPrimaryKey converIdentifierIntoPrimaryKey(final YAnnotIdentifier identifier) {
    YAnnotPrimaryKey _createYAnnotPrimaryKey = ModelFactory.eINSTANCE.createYAnnotPrimaryKey();
    final Procedure1<YAnnotPrimaryKey> _function = (YAnnotPrimaryKey it) -> {
      final List<YAnnotAbstractColumn> list = this.doConvertIdentifierIntoColumns(identifier);
      for (final YAnnotAbstractColumn abstarctColumn : list) {
        it.getColumns().add(abstarctColumn);
      }
    };
    final YAnnotPrimaryKey primaryKey = ObjectExtensions.<YAnnotPrimaryKey>operator_doubleArrow(_createYAnnotPrimaryKey, _function);
    return primaryKey;
  }
  
  private List<YAnnotAbstractColumn> doConvertIdentifierIntoColumns(final YAnnotIdentifier identifier) {
    final List<YAnnotAbstractColumn> list = CollectionLiterals.<YAnnotAbstractColumn>newArrayList();
    EList<YAnnotIdInner> _annots = identifier.getAnnots();
    for (final YAnnotIdInner identifierPart : _annots) {
      if ((identifierPart instanceof YAnnotAttribute)) {
        final YAnnotAttribute attribute = ((YAnnotAttribute) identifierPart);
        EObject _eContainer = attribute.eContainer();
        final YAnnotTable parentTable = this.getImplementingTable(((YAnnotEntity) _eContainer));
        EList<YAnnotAbstractColumn> _columns = parentTable.getColumns();
        for (final YAnnotAbstractColumn abstractColumn : _columns) {
          EObject _type = abstractColumn.getType();
          if ((_type instanceof YAnnotColumn)) {
            EObject _type_1 = abstractColumn.getType();
            final YAnnotColumn column = ((YAnnotColumn) _type_1);
            YAnnotAttribute _attrref = column.getAttrref();
            boolean _equals = Objects.equal(_attrref, attribute);
            if (_equals) {
              list.add(abstractColumn);
            }
          }
        }
      } else {
        if ((identifierPart instanceof YAnnotRelationship)) {
          final YAnnotRelationship relationship = ((YAnnotRelationship) identifierPart);
          EObject _eContainer_1 = relationship.eContainer();
          final YAnnotTable parentTable_1 = this.getImplementingTable(((YAnnotEntity) _eContainer_1));
          EList<YAnnotForeignKey> _foreignkeys = parentTable_1.getForeignkeys();
          for (final YAnnotForeignKey foreignKey : _foreignkeys) {
            YAnnotRelationship _relationship = foreignKey.getRelationship();
            boolean _equals_1 = Objects.equal(_relationship, relationship);
            if (_equals_1) {
              EList<YAnnotAbstractColumn> _columns_1 = foreignKey.getColumns();
              for (final YAnnotAbstractColumn abstractColumn_1 : _columns_1) {
                EObject _type_2 = abstractColumn_1.getType();
                if ((_type_2 instanceof YAnnotColumnLike)) {
                  list.add(abstractColumn_1);
                }
              }
            }
          }
        }
      }
    }
    return list;
  }
  
  public String convertToTechnicalDesignName(final String name) {
    return CaseFormat.UPPER_CAMEL.to(CaseFormat.UPPER_UNDERSCORE, name);
  }
  
  public int extractLength(final EList<YAnnotationElementValuePair> list, final String name) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(list, name);
    if (_isAnnotHavingSpecificName) {
      final String lengthText = this.extractAnnotValueNumber(list, name);
    }
    return 0;
  }
  
  public String extractAttributeType(final YAnnotAttribute annotAttribute) {
    boolean _isAnnotHavingSpecificName = this.isAnnotHavingSpecificName(annotAttribute.getElementValuePairs(), this.KW_TYPE);
    if (_isAnnotHavingSpecificName) {
      try {
        return this.extractAnnotValueKeyword(annotAttribute.getElementValuePairs(), this.KW_TYPE);
      } catch (final Throwable _t) {
        if (_t instanceof Exception) {
        } else {
          throw Exceptions.sneakyThrow(_t);
        }
      }
    }
    return this.KW_STRING;
  }
  
  public int extractDecimal(final YAnnotColumn column) {
    return 0;
  }
  
  public String getImplementingColumnName(final YAnnotTable table, final String name) {
    EList<YAnnotAbstractColumn> _columns = table.getColumns();
    for (final YAnnotAbstractColumn annotAbstractColumn : _columns) {
      EObject _type = annotAbstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = annotAbstractColumn.getType();
        String _name = ((YAnnotColumn) _type_1).getAttrref().getName();
        boolean _equals = Objects.equal(_name, name);
        if (_equals) {
          return annotAbstractColumn.getName();
        }
      } else {
        EObject _type_2 = annotAbstractColumn.getType();
        EObject _type_3 = ((YAnnotColumnLike) _type_2).getColumnref().getType();
        String _name_1 = ((YAnnotAbstractColumn) _type_3).getName();
        boolean _equals_1 = Objects.equal(_name_1, name);
        if (_equals_1) {
          EObject _type_4 = annotAbstractColumn.getType();
          EObject _type_5 = ((YAnnotColumnLike) _type_4).getColumnref().getType();
          return ((YAnnotAbstractColumn) _type_5).getName();
        }
        EObject _type_6 = annotAbstractColumn.getType();
        EObject _type_7 = ((YAnnotColumnLike) _type_6).getColumnref().getType();
        return ((YAnnotAbstractColumn) _type_7).getName();
      }
    }
    return "";
  }
  
  public YAnnotTable getImplementingTable(final YAnnotEntity entity) {
    final String entityName = entity.getName();
    IResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(entity.eResource());
    IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(entity.eResource().getURI());
    List<IContainer> _visibleContainers = this.containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
    for (final IContainer c : _visibleContainers) {
      Iterable<IEObjectDescription> _exportedObjectsByType = c.getExportedObjectsByType(
        ModelPackage.Literals.YANNOT_TABLE);
      for (final IEObjectDescription objectDescription : _exportedObjectsByType) {
        EObject _eObjectOrProxy = objectDescription.getEObjectOrProxy();
        if ((_eObjectOrProxy instanceof YAnnotTable)) {
          EObject _eObjectOrProxy_1 = objectDescription.getEObjectOrProxy();
          YAnnotTable table = ((YAnnotTable) _eObjectOrProxy_1);
          boolean _eIsProxy = table.eIsProxy();
          if (_eIsProxy) {
            EObject _eObject = entity.eResource().getResourceSet().getEObject(objectDescription.getEObjectURI(), 
              true);
            table = ((YAnnotTable) _eObject);
          }
          if (((table.getEntityref() != null) && Objects.equal(table.getEntityref().getName(), entityName))) {
            return table;
          }
        }
      }
    }
    return null;
  }
  
  public boolean isTechnicalDesign(final EObject context) {
    IResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(context.eResource());
    IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(context.eResource().getURI());
    List<IContainer> _visibleContainers = this.containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
    for (final IContainer c : _visibleContainers) {
      Iterable<IEObjectDescription> _exportedObjectsByType = c.getExportedObjectsByType(
        ModelPackage.Literals.YANNOT_TECHNICAL_DESIGN);
      for (final IEObjectDescription objectDescription : _exportedObjectsByType) {
        EObject _eObjectOrProxy = objectDescription.getEObjectOrProxy();
        if ((_eObjectOrProxy instanceof YAnnotTechnicalDesign)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean isAttributeImplemented(final YAnnotTable table, final YAnnotAttribute attribute) {
    EList<YAnnotAbstractColumn> _columns = table.getColumns();
    for (final YAnnotAbstractColumn abstractColumn : _columns) {
      EObject _type = abstractColumn.getType();
      if ((_type instanceof YAnnotColumn)) {
        EObject _type_1 = abstractColumn.getType();
        final YAnnotColumn column = ((YAnnotColumn) _type_1);
        String _name = column.getAttrref().getName();
        String _name_1 = attribute.getName();
        boolean _equals = Objects.equal(_name, _name_1);
        if (_equals) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean isEntityImplemented(final YAnnotEntity entity) {
    boolean _isTechnicalDesign = this.isTechnicalDesign(entity);
    if (_isTechnicalDesign) {
      final YAnnotTable table = this.getImplementingTable(entity);
      if ((table != null)) {
        return true;
      }
    }
    return false;
  }
  
  public boolean isAttributeImplemented(final YAnnotAttribute attribute) {
    EObject _eContainer = attribute.eContainer();
    final YAnnotEntity entity = ((YAnnotEntity) _eContainer);
    boolean _isEntityImplemented = this.isEntityImplemented(entity);
    if (_isEntityImplemented) {
      final YAnnotTable table = this.getImplementingTable(entity);
      EList<YAnnotAbstractColumn> _columns = table.getColumns();
      for (final YAnnotAbstractColumn abstractColumn : _columns) {
        EObject _type = abstractColumn.getType();
        if ((_type instanceof YAnnotColumn)) {
          EObject _type_1 = abstractColumn.getType();
          final YAnnotColumn column = ((YAnnotColumn) _type_1);
          String _name = column.getAttrref().getName();
          String _name_1 = attribute.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public YAnnotColumn getAttributeImplementation(final YAnnotAttribute attribute) {
    EObject _eContainer = attribute.eContainer();
    final YAnnotEntity entity = ((YAnnotEntity) _eContainer);
    boolean _isEntityImplemented = this.isEntityImplemented(entity);
    if (_isEntityImplemented) {
      final YAnnotTable table = this.getImplementingTable(entity);
      EList<YAnnotAbstractColumn> _columns = table.getColumns();
      for (final YAnnotAbstractColumn abstractColumn : _columns) {
        EObject _type = abstractColumn.getType();
        if ((_type instanceof YAnnotColumn)) {
          EObject _type_1 = abstractColumn.getType();
          final YAnnotColumn column = ((YAnnotColumn) _type_1);
          String _name = column.getAttrref().getName();
          String _name_1 = attribute.getName();
          boolean _equals = Objects.equal(_name, _name_1);
          if (_equals) {
            return column;
          }
        }
      }
    }
    return null;
  }
  
  public YAnnotTechnicalDesign getTechnicalDesign(final EObject context) {
    IResourceDescriptions resourceDescriptions = this.resourceDescriptionsProvider.getResourceDescriptions(context.eResource());
    IResourceDescription resourceDescription = resourceDescriptions.getResourceDescription(context.eResource().getURI());
    List<IContainer> _visibleContainers = this.containerManager.getVisibleContainers(resourceDescription, resourceDescriptions);
    for (final IContainer c : _visibleContainers) {
      Iterable<IEObjectDescription> _exportedObjectsByType = c.getExportedObjectsByType(
        ModelPackage.Literals.YANNOT_TECHNICAL_DESIGN);
      for (final IEObjectDescription objectDescription : _exportedObjectsByType) {
        EObject _eObjectOrProxy = objectDescription.getEObjectOrProxy();
        if ((_eObjectOrProxy instanceof YAnnotTechnicalDesign)) {
          EObject _eObjectOrProxy_1 = objectDescription.getEObjectOrProxy();
          YAnnotTechnicalDesign annotTechnicalDesign = ((YAnnotTechnicalDesign) _eObjectOrProxy_1);
          boolean _eIsProxy = annotTechnicalDesign.eIsProxy();
          if (_eIsProxy) {
            EObject _eObject = context.eResource().getResourceSet().getEObject(
              objectDescription.getEObjectURI(), true);
            return annotTechnicalDesign = ((YAnnotTechnicalDesign) _eObject);
          }
        }
      }
    }
    return null;
  }
  
  public boolean isInverseRelationshipDefinedInTarget(final YAnnotRelationship annotRel) {
    return false;
  }
  
  public boolean isTypeCompatibleWithDefault(final YAnnotAttribute annotAttr) {
    return true;
  }
}
