/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YIf Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getExpression <em>Expression</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getThenBlock <em>Then Block</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getElseBlock <em>Else Block</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYIfStatement()
 * @model
 * @generated
 */
public interface YIfStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYIfStatement_Expression()
   * @model containment="true"
   * @generated
   */
  YExpression getExpression();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(YExpression value);

  /**
   * Returns the value of the '<em><b>Then Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Then Block</em>' containment reference.
   * @see #setThenBlock(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYIfStatement_ThenBlock()
   * @model containment="true"
   * @generated
   */
  YBlock getThenBlock();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getThenBlock <em>Then Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Then Block</em>' containment reference.
   * @see #getThenBlock()
   * @generated
   */
  void setThenBlock(YBlock value);

  /**
   * Returns the value of the '<em><b>Else Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Else Block</em>' containment reference.
   * @see #setElseBlock(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYIfStatement_ElseBlock()
   * @model containment="true"
   * @generated
   */
  YBlock getElseBlock();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YIfStatement#getElseBlock <em>Else Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Else Block</em>' containment reference.
   * @see #getElseBlock()
   * @generated
   */
  void setElseBlock(YBlock value);

} // YIfStatement
