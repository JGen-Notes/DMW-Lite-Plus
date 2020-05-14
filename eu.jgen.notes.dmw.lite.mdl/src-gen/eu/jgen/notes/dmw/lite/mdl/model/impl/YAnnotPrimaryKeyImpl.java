/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model.impl;

import eu.jgen.notes.dmw.lite.mdl.model.ModelPackage;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn;
import eu.jgen.notes.dmw.lite.mdl.model.YAnnotPrimaryKey;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>YAnnot Primary Key</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.impl.YAnnotPrimaryKeyImpl#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @generated
 */
public class YAnnotPrimaryKeyImpl extends MinimalEObjectImpl.Container implements YAnnotPrimaryKey
{
  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' reference list.
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
  protected YAnnotPrimaryKeyImpl()
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
    return ModelPackage.Literals.YANNOT_PRIMARY_KEY;
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
      columns = new EObjectResolvingEList<YAnnotAbstractColumn>(YAnnotAbstractColumn.class, this, ModelPackage.YANNOT_PRIMARY_KEY__COLUMNS);
    }
    return columns;
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
      case ModelPackage.YANNOT_PRIMARY_KEY__COLUMNS:
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
      case ModelPackage.YANNOT_PRIMARY_KEY__COLUMNS:
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
      case ModelPackage.YANNOT_PRIMARY_KEY__COLUMNS:
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
      case ModelPackage.YANNOT_PRIMARY_KEY__COLUMNS:
        return columns != null && !columns.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //YAnnotPrimaryKeyImpl
