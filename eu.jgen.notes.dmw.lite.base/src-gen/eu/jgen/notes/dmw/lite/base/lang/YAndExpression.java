/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnd Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YAndExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YAndExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYAndExpression()
 * @model
 * @generated
 */
public interface YAndExpression extends YExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYAndExpression_Left()
   * @model containment="true"
   * @generated
   */
  YExpression getLeft();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YAndExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(YExpression value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYAndExpression_Right()
   * @model containment="true"
   * @generated
   */
  YExpression getRight();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YAndExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(YExpression value);

} // YAndExpression
