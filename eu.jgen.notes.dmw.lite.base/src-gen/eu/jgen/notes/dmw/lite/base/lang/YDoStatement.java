/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YDo Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YDoStatement#getBlock <em>Block</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YDoStatement#getCatches <em>Catches</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYDoStatement()
 * @model
 * @generated
 */
public interface YDoStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYDoStatement_Block()
   * @model containment="true"
   * @generated
   */
  YBlock getBlock();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YDoStatement#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(YBlock value);

  /**
   * Returns the value of the '<em><b>Catches</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.base.lang.YCatch}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Catches</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYDoStatement_Catches()
   * @model containment="true"
   * @generated
   */
  EList<YCatch> getCatches();

} // YDoStatement
