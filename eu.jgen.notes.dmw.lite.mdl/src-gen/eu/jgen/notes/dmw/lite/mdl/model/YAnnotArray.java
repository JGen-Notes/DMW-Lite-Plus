/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnnot Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotArray#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotArray()
 * @model
 * @generated
 */
public interface YAnnotArray extends YAnnotExpression
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotExpression}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotArray_Elements()
   * @model containment="true"
   * @generated
   */
  EList<YAnnotExpression> getElements();

} // YAnnotArray
