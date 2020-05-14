/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model.impl;

import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship;

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
 * An implementation of the model object '<em><b>YAnnot Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotForeignKeyImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotForeignKeyImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAnnotForeignKeyImpl extends MinimalEObjectImpl.Container implements YAnnotForeignKey
{
  /**
   * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelationship()
   * @generated
   * @ordered
   */
  protected YAnnotRelationship relationship;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected EList<YAnnotAbstractColumn> columns;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected YAnnotForeignKeyImpl()
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
    return ModelPackage.Literals.YANNOT_FOREIGN_KEY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public YAnnotRelationship getRelationship()
  {
    if (relationship != null && relationship.eIsProxy())
    {
      InternalEObject oldRelationship = (InternalEObject)relationship;
      relationship = (YAnnotRelationship)eResolveProxy(oldRelationship);
      if (relationship != oldRelationship)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP, oldRelationship, relationship));
      }
    }
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public YAnnotRelationship basicGetRelationship()
  {
    return relationship;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRelationship(YAnnotRelationship newRelationship)
  {
    YAnnotRelationship oldRelationship = relationship;
    relationship = newRelationship;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP, oldRelationship, relationship));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EList<YAnnotAbstractColumn> getColumns()
  {
    if (columns == null)
    {
      columns = new EObjectContainmentEList<YAnnotAbstractColumn>(YAnnotAbstractColumn.class, this, ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS);
    }
    return columns;
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
      case ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS:
        return ((InternalEList<?>)getColumns()).basicRemove(otherEnd, msgs);
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
      case ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP:
        if (resolve) return getRelationship();
        return basicGetRelationship();
      case ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS:
        return getColumns();
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
      case ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP:
        setRelationship((YAnnotRelationship)newValue);
        return;
      case ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS:
        getColumns().clear();
        getColumns().addAll((Collection<? extends YAnnotAbstractColumn>)newValue);
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
      case ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP:
        setRelationship((YAnnotRelationship)null);
        return;
      case ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS:
        getColumns().clear();
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
      case ModelPackage.YANNOT_FOREIGN_KEY__RELATIONSHIP:
        return relationship != null;
      case ModelPackage.YANNOT_FOREIGN_KEY__COLUMNS:
        return columns != null && !columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //YAnnotForeignKeyImpl
