/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.lang.impl;

import eu.jgen.notes.dmw.lite.base.lang.LangPackage;
import eu.jgen.notes.dmw.lite.base.lang.YEnumeration;
import eu.jgen.notes.dmw.lite.base.lang.YEnumerationCase;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YEnumeration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YEnumerationImpl#getName <em>Name</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YEnumerationImpl#getSuperclass <em>Superclass</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YEnumerationImpl#getCases <em>Cases</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YEnumerationImpl extends MinimalEObjectImpl.Container implements YEnumeration
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
   * The cached value of the '{@link #getSuperclass() <em>Superclass</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSuperclass()
   * @generated
   * @ordered
   */
  protected YEnumeration superclass;

  /**
   * The cached value of the '{@link #getCases() <em>Cases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCases()
   * @generated
   * @ordered
   */
  protected EList<YEnumerationCase> cases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YEnumerationImpl()
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
    return LangPackage.Literals.YENUMERATION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YENUMERATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YEnumeration getSuperclass()
  {
    if (superclass != null && superclass.eIsProxy())
    {
      InternalEObject oldSuperclass = (InternalEObject)superclass;
      superclass = (YEnumeration)eResolveProxy(oldSuperclass);
      if (superclass != oldSuperclass)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, LangPackage.YENUMERATION__SUPERCLASS, oldSuperclass, superclass));
      }
    }
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YEnumeration basicGetSuperclass()
  {
    return superclass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSuperclass(YEnumeration newSuperclass)
  {
    YEnumeration oldSuperclass = superclass;
    superclass = newSuperclass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YENUMERATION__SUPERCLASS, oldSuperclass, superclass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<YEnumerationCase> getCases()
  {
    if (cases == null)
    {
      cases = new EObjectContainmentEList<YEnumerationCase>(YEnumerationCase.class, this, LangPackage.YENUMERATION__CASES);
    }
    return cases;
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
      case LangPackage.YENUMERATION__CASES:
        return ((InternalEList<?>)getCases()).basicRemove(otherEnd, msgs);
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
      case LangPackage.YENUMERATION__NAME:
        return getName();
      case LangPackage.YENUMERATION__SUPERCLASS:
        if (resolve) return getSuperclass();
        return basicGetSuperclass();
      case LangPackage.YENUMERATION__CASES:
        return getCases();
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
      case LangPackage.YENUMERATION__NAME:
        setName((String)newValue);
        return;
      case LangPackage.YENUMERATION__SUPERCLASS:
        setSuperclass((YEnumeration)newValue);
        return;
      case LangPackage.YENUMERATION__CASES:
        getCases().clear();
        getCases().addAll((Collection<? extends YEnumerationCase>)newValue);
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
      case LangPackage.YENUMERATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case LangPackage.YENUMERATION__SUPERCLASS:
        setSuperclass((YEnumeration)null);
        return;
      case LangPackage.YENUMERATION__CASES:
        getCases().clear();
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
      case LangPackage.YENUMERATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case LangPackage.YENUMERATION__SUPERCLASS:
        return superclass != null;
      case LangPackage.YENUMERATION__CASES:
        return cases != null && !cases.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //YEnumerationImpl