/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model.impl;

import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotColumnLike;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAnnot Column Like</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotColumnLikeImpl#getColumnref <em>Columnref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAnnotColumnLikeImpl extends MinimalEObjectImpl.Container implements YAnnotColumnLike
{
  /**
   * The cached value of the '{@link #getColumnref() <em>Columnref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnref()
   * @generated
   * @ordered
   */
  protected YAnnotAbstractColumn columnref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YAnnotColumnLikeImpl()
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
    return ModelPackage.Literals.YANNOT_COLUMN_LIKE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YAnnotAbstractColumn getColumnref()
  {
    if (columnref != null && columnref.eIsProxy())
    {
      InternalEObject oldColumnref = (InternalEObject)columnref;
      columnref = (YAnnotAbstractColumn)eResolveProxy(oldColumnref);
      if (columnref != oldColumnref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF, oldColumnref, columnref));
      }
    }
    return columnref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotAbstractColumn basicGetColumnref()
  {
    return columnref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setColumnref(YAnnotAbstractColumn newColumnref)
  {
    YAnnotAbstractColumn oldColumnref = columnref;
    columnref = newColumnref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF, oldColumnref, columnref));
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
      case ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF:
        if (resolve) return getColumnref();
        return basicGetColumnref();
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
      case ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF:
        setColumnref((YAnnotAbstractColumn)newValue);
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
      case ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF:
        setColumnref((YAnnotAbstractColumn)null);
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
      case ModelPackage.YANNOT_COLUMN_LIKE__COLUMNREF:
        return columnref != null;
    }
    return super.eIsSet(featureID);
  }

} //YAnnotColumnLikeImpl
