/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YJoin</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YJoin#getJoindefs <em>Joindefs</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYJoin()
 * @model
 * @generated
 */
public interface YJoin extends EObject
{
  /**
   * Returns the value of the '<em><b>Joindefs</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.base.lang.YJoinDef}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joindefs</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYJoin_Joindefs()
   * @model containment="true"
   * @generated
   */
  EList<YJoinDef> getJoindefs();

} // YJoin
