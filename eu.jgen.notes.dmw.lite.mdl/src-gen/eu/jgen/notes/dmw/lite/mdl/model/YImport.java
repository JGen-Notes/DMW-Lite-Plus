/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YImport</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YImport#getImportedNamespace <em>Imported Namespace</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYImport()
 * @model
 * @generated
 */
public interface YImport extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' attribute.
   * @see #setImportedNamespace(String)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYImport_ImportedNamespace()
   * @model
   * @generated
   */
  String getImportedNamespace();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YImport#getImportedNamespace <em>Imported Namespace</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Imported Namespace</em>' attribute.
   * @see #getImportedNamespace()
   * @generated
   */
  void setImportedNamespace(String value);

} // YImport
