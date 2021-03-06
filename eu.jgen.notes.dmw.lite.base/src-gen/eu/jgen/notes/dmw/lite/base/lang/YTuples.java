/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YTuples</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YTuples#getIncludes <em>Includes</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYTuples()
 * @model
 * @generated
 */
public interface YTuples extends EObject
{
  /**
   * Returns the value of the '<em><b>Includes</b></em>' reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.base.lang.YProperty}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Includes</em>' reference list.
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYTuples_Includes()
   * @model
   * @generated
   */
  EList<YProperty> getIncludes();

} // YTuples
