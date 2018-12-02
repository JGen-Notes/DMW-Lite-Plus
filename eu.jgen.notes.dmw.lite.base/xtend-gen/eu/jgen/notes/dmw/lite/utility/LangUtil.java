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
package eu.jgen.notes.dmw.lite.utility;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import eu.jgen.notes.dmw.lite.base.lang.LangFactory;
import eu.jgen.notes.dmw.lite.base.lang.YAccessLevel;
import eu.jgen.notes.dmw.lite.base.lang.YBlock;
import eu.jgen.notes.dmw.lite.base.lang.YClass;
import eu.jgen.notes.dmw.lite.base.lang.YFunction;
import eu.jgen.notes.dmw.lite.base.lang.YMember;
import eu.jgen.notes.dmw.lite.base.lang.YParameter;
import eu.jgen.notes.dmw.lite.base.lang.YProperty;
import eu.jgen.notes.dmw.lite.base.lang.YReturn;
import eu.jgen.notes.dmw.lite.base.scoping.LangIndex;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAttribute;
import eu.jgen.notes.dmw.lite.mdl.utility.ModelUtil;
import eu.jgen.notes.dmw.lite.utility.LangLib;
import java.util.LinkedHashSet;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.IContainer;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.eclipse.xtext.resource.impl.ResourceDescriptionsProvider;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.ObjectExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LangUtil {
  @Inject
  @Extension
  private LangIndex _langIndex;
  
  @Inject
  @Extension
  private LangLib _langLib;
  
  @Inject
  @Extension
  private ModelUtil _modelUtil;
  
  @Inject
  private ResourceDescriptionsProvider resourceDescriptionsProvider;
  
  @Inject
  private IContainer.Manager containerManager;
  
  public Iterable<YProperty> properties(final YClass c) {
    return Iterables.<YProperty>filter(c.getMembers(), YProperty.class);
  }
  
  public Iterable<YFunction> functions(final YClass c) {
    return Iterables.<YFunction>filter(c.getMembers(), YFunction.class);
  }
  
  public YReturn returnStatement(final YFunction m) {
    return this.returnStatement(m.getBody());
  }
  
  public YReturn returnStatement(final YBlock block) {
    return IterableExtensions.<YReturn>head(Iterables.<YReturn>filter(block.getStatements(), YReturn.class));
  }
  
  public LinkedHashSet<YClass> classHierarchy(final YClass c) {
    LinkedHashSet<YClass> _xblockexpression = null;
    {
      final LinkedHashSet<YClass> visited = CollectionLiterals.<YClass>newLinkedHashSet();
      YClass current = c.getSuperclass();
      while (((current != null) && (!visited.contains(current)))) {
        {
          visited.add(current);
          current = current.getSuperclass();
        }
      }
      final YClass object = this._langLib.getLangObjectClass(c);
      if ((object != null)) {
        visited.add(object);
      }
      _xblockexpression = visited;
    }
    return _xblockexpression;
  }
  
  public Map<String, YFunction> classHierarchyMethods(final YClass c) {
    final Function1<YClass, Iterable<YFunction>> _function = (YClass it) -> {
      return this.functions(it);
    };
    final Function1<YFunction, String> _function_1 = (YFunction it) -> {
      return it.getName();
    };
    return IterableExtensions.<String, YFunction>toMap(Iterables.<YFunction>concat(ListExtensions.<YClass, Iterable<YFunction>>map(ListExtensions.<YClass>reverseView(IterableExtensions.<YClass>toList(this.classHierarchy(c))), _function)), _function_1);
  }
  
  public Iterable<YMember> classHierarchyMembers(final YClass c) {
    final Function1<YClass, EList<YMember>> _function = (YClass it) -> {
      return it.getMembers();
    };
    return Iterables.<YMember>concat(IterableExtensions.<YClass, EList<YMember>>map(this.classHierarchy(c), _function));
  }
  
  public String memberAsString(final YMember m) {
    String _xblockexpression = null;
    {
      EObject _eContainer = m.eContainer();
      final YClass a = ((YClass) _eContainer);
      String _name = a.getName();
      String _xifexpression = null;
      if ((m instanceof YFunction)) {
        final Function1<YParameter, String> _function = (YParameter it) -> {
          return it.getType().getName();
        };
        String _join = IterableExtensions.join(ListExtensions.<YParameter, String>map(((YFunction)m).getParams(), _function), ", ");
        String _plus = ("(" + _join);
        _xifexpression = (_plus + ")");
      } else {
        _xifexpression = "";
      }
      _xblockexpression = (_name + _xifexpression);
    }
    return _xblockexpression;
  }
  
  public String memberAsStringWithType(final YMember m) {
    String _memberAsString = this.memberAsString(m);
    return (_memberAsString + " : ");
  }
  
  public YMember getMemberName(final YMember member) {
    return member;
  }
  
  public YProperty converAttributeIntoPropertyPublic(final YAnnotAttribute annotAttribute) {
    YProperty _createYProperty = LangFactory.eINSTANCE.createYProperty();
    final Procedure1<YProperty> _function = (YProperty it) -> {
      it.setAttrRef(annotAttribute);
      it.setName(annotAttribute.getName());
      it.setAccess(YAccessLevel.PUBLIC);
      String _extractAttributeType = this._modelUtil.extractAttributeType(annotAttribute);
      String _plus = ("eu.jgen.notes.lib.dmw." + _extractAttributeType);
      it.setType(this.getLangObjectClass(annotAttribute, _plus));
    };
    final YProperty property = ObjectExtensions.<YProperty>operator_doubleArrow(_createYProperty, _function);
    return property;
  }
  
  public YClass getLangObjectClass(final EObject context, final String className) {
    YClass _xblockexpression = null;
    {
      final Function1<IEObjectDescription, Boolean> _function = (IEObjectDescription it) -> {
        String _string = it.getQualifiedName().toString();
        return Boolean.valueOf(Objects.equal(_string, className));
      };
      final IEObjectDescription desc = IterableExtensions.<IEObjectDescription>findFirst(this._langIndex.getVisibleClassesDescriptions(context), _function);
      if ((desc == null)) {
        return null;
      }
      EObject o = desc.getEObjectOrProxy();
      boolean _eIsProxy = o.eIsProxy();
      if (_eIsProxy) {
        o = context.eResource().getResourceSet().getEObject(desc.getEObjectURI(), true);
      }
      _xblockexpression = ((YClass) o);
    }
    return _xblockexpression;
  }
  
  public YProperty converAttributeIntoPropertyPrivate(final YAnnotAttribute annotAttr) {
    YProperty _createYProperty = LangFactory.eINSTANCE.createYProperty();
    final Procedure1<YProperty> _function = (YProperty it) -> {
      it.setAttrRef(annotAttr);
      YClass _createYClass = LangFactory.eINSTANCE.createYClass();
      final Procedure1<YClass> _function_1 = (YClass it_1) -> {
        it_1.setName(this._modelUtil.extractAttributeType(annotAttr));
      };
      YClass _doubleArrow = ObjectExtensions.<YClass>operator_doubleArrow(_createYClass, _function_1);
      it.setType(_doubleArrow);
      it.setName(annotAttr.getName());
      it.setAccess(YAccessLevel.PRIVATE);
    };
    final YProperty property = ObjectExtensions.<YProperty>operator_doubleArrow(_createYProperty, _function);
    return property;
  }
}
