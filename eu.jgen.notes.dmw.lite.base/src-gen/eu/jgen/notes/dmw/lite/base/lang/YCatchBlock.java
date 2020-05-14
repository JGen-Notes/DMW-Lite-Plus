/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YCatch Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YCatchBlock#getStatements <em>Statements</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYCatchBlock()
 * @model
 * @generated
 */
public interface YCatchBlock extends EObject
{
  /**
   * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.base.lang.YStatement}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statements</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYCatchBlock_Statements()
   * @model containment="true"
   * @generated
   */
  EList<YStatement> getStatements();

} // YCatchBlock
