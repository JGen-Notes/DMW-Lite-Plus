/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YEquality Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getLeft <em>Left</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getOp <em>Op</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYEqualityExpression()
 * @model
 * @generated
 */
public interface YEqualityExpression extends YExpression
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYEqualityExpression_Left()
   * @model containment="true"
   * @generated
   */
  YExpression getLeft();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(YExpression value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYEqualityExpression_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYEqualityExpression_Right()
   * @model containment="true"
   * @generated
   */
  YExpression getRight();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YEqualityExpression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(YExpression value);

} // YEqualityExpression
