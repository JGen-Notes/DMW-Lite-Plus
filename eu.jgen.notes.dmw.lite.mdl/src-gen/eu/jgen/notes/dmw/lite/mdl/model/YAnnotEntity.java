/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnnot Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntity#getAnnotations <em>Annotations</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotEntity()
 * @model
 * @generated
 */
public interface YAnnotEntity extends YAnnotation
{
  /**
   * Returns the value of the '<em><b>Annotations</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotEntityInner}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Annotations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Annotations</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotEntity_Annotations()
   * @model containment="true"
   * @generated
   */
  EList<YAnnotEntityInner> getAnnotations();

} // YAnnotEntity
