/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRepeat While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YRepeatWhileStatement#getBody <em>Body</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YRepeatWhileStatement#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYRepeatWhileStatement()
 * @model
 * @generated
 */
public interface YRepeatWhileStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYRepeatWhileStatement_Body()
   * @model containment="true"
   * @generated
   */
  YBlock getBody();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YRepeatWhileStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(YBlock value);

  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(YExpression)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYRepeatWhileStatement_Expression()
   * @model containment="true"
   * @generated
   */
  YExpression getExpression();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YRepeatWhileStatement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(YExpression value);

} // YRepeatWhileStatement
