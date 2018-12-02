/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.lang.impl;

import eu.jgen.notes.dmw.lite.base.lang.LangPackage;
import eu.jgen.notes.dmw.lite.base.lang.YBlock;
import eu.jgen.notes.dmw.lite.base.lang.YFunction;
import eu.jgen.notes.dmw.lite.base.lang.YParameter;

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
 * An implementation of the model object '<em><b>YFunction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YFunctionImpl#getParams <em>Params</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YFunctionImpl#isReturnvalue <em>Returnvalue</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YFunctionImpl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YFunctionImpl extends YMemberImpl implements YFunction
{
  /**
   * The cached value of the '{@link #getParams() <em>Params</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParams()
   * @generated
   * @ordered
   */
  protected EList<YParameter> params;

  /**
   * The default value of the '{@link #isReturnvalue() <em>Returnvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnvalue()
   * @generated
   * @ordered
   */
  protected static final boolean RETURNVALUE_EDEFAULT = false;

  /**
   * The cached value of the '{@link #isReturnvalue() <em>Returnvalue</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #isReturnvalue()
   * @generated
   * @ordered
   */
  protected boolean returnvalue = RETURNVALUE_EDEFAULT;

  /**
   * The cached value of the '{@link #getBody() <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBody()
   * @generated
   * @ordered
   */
  protected YBlock body;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YFunctionImpl()
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
    return LangPackage.Literals.YFUNCTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<YParameter> getParams()
  {
    if (params == null)
    {
      params = new EObjectContainmentEList<YParameter>(YParameter.class, this, LangPackage.YFUNCTION__PARAMS);
    }
    return params;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isReturnvalue()
  {
    return returnvalue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturnvalue(boolean newReturnvalue)
  {
    boolean oldReturnvalue = returnvalue;
    returnvalue = newReturnvalue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YFUNCTION__RETURNVALUE, oldReturnvalue, returnvalue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YBlock getBody()
  {
    return body;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBody(YBlock newBody, NotificationChain msgs)
  {
    YBlock oldBody = body;
    body = newBody;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.YFUNCTION__BODY, oldBody, newBody);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBody(YBlock newBody)
  {
    if (newBody != body)
    {
      NotificationChain msgs = null;
      if (body != null)
        msgs = ((InternalEObject)body).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.YFUNCTION__BODY, null, msgs);
      if (newBody != null)
        msgs = ((InternalEObject)newBody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.YFUNCTION__BODY, null, msgs);
      msgs = basicSetBody(newBody, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YFUNCTION__BODY, newBody, newBody));
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
      case LangPackage.YFUNCTION__PARAMS:
        return ((InternalEList<?>)getParams()).basicRemove(otherEnd, msgs);
      case LangPackage.YFUNCTION__BODY:
        return basicSetBody(null, msgs);
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
      case LangPackage.YFUNCTION__PARAMS:
        return getParams();
      case LangPackage.YFUNCTION__RETURNVALUE:
        return isReturnvalue();
      case LangPackage.YFUNCTION__BODY:
        return getBody();
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
      case LangPackage.YFUNCTION__PARAMS:
        getParams().clear();
        getParams().addAll((Collection<? extends YParameter>)newValue);
        return;
      case LangPackage.YFUNCTION__RETURNVALUE:
        setReturnvalue((Boolean)newValue);
        return;
      case LangPackage.YFUNCTION__BODY:
        setBody((YBlock)newValue);
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
      case LangPackage.YFUNCTION__PARAMS:
        getParams().clear();
        return;
      case LangPackage.YFUNCTION__RETURNVALUE:
        setReturnvalue(RETURNVALUE_EDEFAULT);
        return;
      case LangPackage.YFUNCTION__BODY:
        setBody((YBlock)null);
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
      case LangPackage.YFUNCTION__PARAMS:
        return params != null && !params.isEmpty();
      case LangPackage.YFUNCTION__RETURNVALUE:
        return returnvalue != RETURNVALUE_EDEFAULT;
      case LangPackage.YFUNCTION__BODY:
        return body != null;
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
    result.append(" (returnvalue: ");
    result.append(returnvalue);
    result.append(')');
    return result.toString();
  }

} //YFunctionImpl
