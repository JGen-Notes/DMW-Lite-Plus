/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnnot Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey#getColumns <em>Columns</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotForeignKey()
 * @model
 * @generated
 */
public interface YAnnotForeignKey extends EObject
{
  /**
   * Returns the value of the '<em><b>Relationship</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relationship</em>' reference.
   * @see #setRelationship(YAnnotRelationship)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotForeignKey_Relationship()
   * @model
   * @generated
   */
  YAnnotRelationship getRelationship();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotForeignKey#getRelationship <em>Relationship</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Relationship</em>' reference.
   * @see #getRelationship()
   * @generated
   */
  void setRelationship(YAnnotRelationship value);

  /**
   * Returns the value of the '<em><b>Columns</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotAbstractColumn}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Columns</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotForeignKey_Columns()
   * @model containment="true"
   * @generated
   */
  EList<YAnnotAbstractColumn> getColumns();

} // YAnnotForeignKey
