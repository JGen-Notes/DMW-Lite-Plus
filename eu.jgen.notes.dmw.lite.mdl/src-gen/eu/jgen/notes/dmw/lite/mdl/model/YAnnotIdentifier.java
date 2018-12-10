/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnnot Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier#getName <em>Name</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier#getAnnots <em>Annots</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotIdentifier()
 * @model
 * @generated
 */
public interface YAnnotIdentifier extends YAnnotEntityInner
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotIdentifier_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdentifier#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Annots</b></em>' reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotIdInner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annots</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annots</em>' reference list.
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotIdentifier_Annots()
   * @model
   * @generated
   */
  EList<YAnnotIdInner> getAnnots();

} // YAnnotIdentifier