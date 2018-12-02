/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.model.impl;

import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAnnot Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#isMany <em>Many</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#getElementValuePairs <em>Element Value Pairs</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotRelationshipImpl#getInverse <em>Inverse</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAnnotRelationshipImpl extends YAnnotIdInnerImpl implements YAnnotRelationship
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected static final boolean OPTIONAL_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isOptional()
   * @generated
   * @ordered
   */
  protected boolean optional = OPTIONAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected YAnnotEntity target;

  /**
   * The default value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected static final boolean MANY_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isMany() <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isMany()
   * @generated
   * @ordered
   */
  protected boolean many = MANY_EDEFAULT;

  /**
   * The cached value of the '{@link #getElementValuePairs() <em>Element Value Pairs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementValuePairs()
   * @generated
   * @ordered
   */
  protected EList<YAnnotationElementValuePair> elementValuePairs;

  /**
   * The cached value of the '{@link #getInverse() <em>Inverse</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInverse()
   * @generated
   * @ordered
   */
  protected YAnnotRelationship inverse;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YAnnotRelationshipImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return ModelPackage.Literals.YANNOT_RELATIONSHIP;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_RELATIONSHIP__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isOptional()
  {
    return optional;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOptional(boolean newOptional)
  {
    boolean oldOptional = optional;
    optional = newOptional;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_RELATIONSHIP__OPTIONAL, oldOptional, optional));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotEntity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (YAnnotEntity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.YANNOT_RELATIONSHIP__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotEntity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(YAnnotEntity newTarget)
  {
    YAnnotEntity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_RELATIONSHIP__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isMany()
  {
    return many;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMany(boolean newMany)
  {
    boolean oldMany = many;
    many = newMany;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_RELATIONSHIP__MANY, oldMany, many));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<YAnnotationElementValuePair> getElementValuePairs()
  {
    if (elementValuePairs == null)
    {
      elementValuePairs = new EObjectContainmentEList<YAnnotationElementValuePair>(YAnnotationElementValuePair.class, this, ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS);
    }
    return elementValuePairs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotRelationship getInverse()
  {
    if (inverse != null && inverse.eIsProxy())
    {
      InternalEObject oldInverse = (InternalEObject)inverse;
      inverse = (YAnnotRelationship)eResolveProxy(oldInverse);
      if (inverse != oldInverse)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.YANNOT_RELATIONSHIP__INVERSE, oldInverse, inverse));
      }
    }
    return inverse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotRelationship basicGetInverse()
  {
    return inverse;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInverse(YAnnotRelationship newInverse)
  {
    YAnnotRelationship oldInverse = inverse;
    inverse = newInverse;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_RELATIONSHIP__INVERSE, oldInverse, inverse));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS:
        return ((InternalEList<?>)getElementValuePairs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case ModelPackage.YANNOT_RELATIONSHIP__NAME:
        return getName();
      case ModelPackage.YANNOT_RELATIONSHIP__OPTIONAL:
        return isOptional();
      case ModelPackage.YANNOT_RELATIONSHIP__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case ModelPackage.YANNOT_RELATIONSHIP__MANY:
        return isMany();
      case ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS:
        return getElementValuePairs();
      case ModelPackage.YANNOT_RELATIONSHIP__INVERSE:
        if (resolve) return getInverse();
        return basicGetInverse();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case ModelPackage.YANNOT_RELATIONSHIP__NAME:
        setName((String)newValue);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__OPTIONAL:
        setOptional((Boolean)newValue);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__TARGET:
        setTarget((YAnnotEntity)newValue);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__MANY:
        setMany((Boolean)newValue);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS:
        getElementValuePairs().clear();
        getElementValuePairs().addAll((Collection<? extends YAnnotationElementValuePair>)newValue);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__INVERSE:
        setInverse((YAnnotRelationship)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.YANNOT_RELATIONSHIP__NAME:
        setName(NAME_EDEFAULT);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__OPTIONAL:
        setOptional(OPTIONAL_EDEFAULT);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__TARGET:
        setTarget((YAnnotEntity)null);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__MANY:
        setMany(MANY_EDEFAULT);
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS:
        getElementValuePairs().clear();
        return;
      case ModelPackage.YANNOT_RELATIONSHIP__INVERSE:
        setInverse((YAnnotRelationship)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case ModelPackage.YANNOT_RELATIONSHIP__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case ModelPackage.YANNOT_RELATIONSHIP__OPTIONAL:
        return optional != OPTIONAL_EDEFAULT;
      case ModelPackage.YANNOT_RELATIONSHIP__TARGET:
        return target != null;
      case ModelPackage.YANNOT_RELATIONSHIP__MANY:
        return many != MANY_EDEFAULT;
      case ModelPackage.YANNOT_RELATIONSHIP__ELEMENT_VALUE_PAIRS:
        return elementValuePairs != null && !elementValuePairs.isEmpty();
      case ModelPackage.YANNOT_RELATIONSHIP__INVERSE:
        return inverse != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", optional: ");
    result.append(optional);
    result.append(", many: ");
    result.append(many);
    result.append(')');
    return result.toString();
  }

} //YAnnotRelationshipImpl
