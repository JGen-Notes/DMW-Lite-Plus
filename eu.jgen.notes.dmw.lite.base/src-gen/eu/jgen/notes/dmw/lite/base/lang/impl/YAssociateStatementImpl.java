/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.lang.impl;

import eu.jgen.notes.dmw.lite.base.lang.LangPackage;
import eu.jgen.notes.dmw.lite.base.lang.YAssociateStatement;
import eu.jgen.notes.dmw.lite.base.lang.YJoinDef;
import eu.jgen.notes.dmw.lite.base.lang.YStructRefPair;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAssociate Statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YAssociateStatementImpl#getStruct <em>Struct</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.impl.YAssociateStatementImpl#getJoinref <em>Joinref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAssociateStatementImpl extends YStatementImpl implements YAssociateStatement
{
  /**
   * The cached value of the '{@link #getStruct() <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct()
   * @generated
   * @ordered
   */
  protected YStructRefPair struct;

  /**
   * The cached value of the '{@link #getJoinref() <em>Joinref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getJoinref()
   * @generated
   * @ordered
   */
  protected YJoinDef joinref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YAssociateStatementImpl()
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
    return LangPackage.Literals.YASSOCIATE_STATEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YStructRefPair getStruct()
  {
    return struct;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct(YStructRefPair newStruct, NotificationChain msgs)
  {
    YStructRefPair oldStruct = struct;
    struct = newStruct;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.YASSOCIATE_STATEMENT__STRUCT, oldStruct, newStruct);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct(YStructRefPair newStruct)
  {
    if (newStruct != struct)
    {
      NotificationChain msgs = null;
      if (struct != null)
        msgs = ((InternalEObject)struct).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.YASSOCIATE_STATEMENT__STRUCT, null, msgs);
      if (newStruct != null)
        msgs = ((InternalEObject)newStruct).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.YASSOCIATE_STATEMENT__STRUCT, null, msgs);
      msgs = basicSetStruct(newStruct, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YASSOCIATE_STATEMENT__STRUCT, newStruct, newStruct));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YJoinDef getJoinref()
  {
    return joinref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetJoinref(YJoinDef newJoinref, NotificationChain msgs)
  {
    YJoinDef oldJoinref = joinref;
    joinref = newJoinref;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, LangPackage.YASSOCIATE_STATEMENT__JOINREF, oldJoinref, newJoinref);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setJoinref(YJoinDef newJoinref)
  {
    if (newJoinref != joinref)
    {
      NotificationChain msgs = null;
      if (joinref != null)
        msgs = ((InternalEObject)joinref).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - LangPackage.YASSOCIATE_STATEMENT__JOINREF, null, msgs);
      if (newJoinref != null)
        msgs = ((InternalEObject)newJoinref).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - LangPackage.YASSOCIATE_STATEMENT__JOINREF, null, msgs);
      msgs = basicSetJoinref(newJoinref, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, LangPackage.YASSOCIATE_STATEMENT__JOINREF, newJoinref, newJoinref));
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
      case LangPackage.YASSOCIATE_STATEMENT__STRUCT:
        return basicSetStruct(null, msgs);
      case LangPackage.YASSOCIATE_STATEMENT__JOINREF:
        return basicSetJoinref(null, msgs);
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
      case LangPackage.YASSOCIATE_STATEMENT__STRUCT:
        return getStruct();
      case LangPackage.YASSOCIATE_STATEMENT__JOINREF:
        return getJoinref();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case LangPackage.YASSOCIATE_STATEMENT__STRUCT:
        setStruct((YStructRefPair)newValue);
        return;
      case LangPackage.YASSOCIATE_STATEMENT__JOINREF:
        setJoinref((YJoinDef)newValue);
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
      case LangPackage.YASSOCIATE_STATEMENT__STRUCT:
        setStruct((YStructRefPair)null);
        return;
      case LangPackage.YASSOCIATE_STATEMENT__JOINREF:
        setJoinref((YJoinDef)null);
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
      case LangPackage.YASSOCIATE_STATEMENT__STRUCT:
        return struct != null;
      case LangPackage.YASSOCIATE_STATEMENT__JOINREF:
        return joinref != null;
    }
    return super.eIsSet(featureID);
  }

} //YAssociateStatementImpl
