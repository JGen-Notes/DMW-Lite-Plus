/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.base.lang;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YRead Each Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getStructs <em>Structs</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getJoinclause <em>Joinclause</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getWhereclause <em>Whereclause</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getSuccess <em>Success</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement()
 * @model
 * @generated
 */
public interface YReadEachStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Structs</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.base.lang.YStructRefPair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Structs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Structs</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement_Structs()
   * @model containment="true"
   * @generated
   */
  EList<YStructRefPair> getStructs();

  /**
   * Returns the value of the '<em><b>Joinclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Joinclause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Joinclause</em>' containment reference.
   * @see #setJoinclause(YJoin)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement_Joinclause()
   * @model containment="true"
   * @generated
   */
  YJoin getJoinclause();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getJoinclause <em>Joinclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Joinclause</em>' containment reference.
   * @see #getJoinclause()
   * @generated
   */
  void setJoinclause(YJoin value);

  /**
   * Returns the value of the '<em><b>Whereclause</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Whereclause</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Whereclause</em>' containment reference.
   * @see #setWhereclause(YWhere)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement_Whereclause()
   * @model containment="true"
   * @generated
   */
  YWhere getWhereclause();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getWhereclause <em>Whereclause</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Whereclause</em>' containment reference.
   * @see #getWhereclause()
   * @generated
   */
  void setWhereclause(YWhere value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(YProperty)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement_Target()
   * @model
   * @generated
   */
  YProperty getTarget();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(YProperty value);

  /**
   * Returns the value of the '<em><b>Success</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Success</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Success</em>' containment reference.
   * @see #setSuccess(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYReadEachStatement_Success()
   * @model containment="true"
   * @generated
   */
  YBlock getSuccess();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YReadEachStatement#getSuccess <em>Success</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Success</em>' containment reference.
   * @see #getSuccess()
   * @generated
   */
  void setSuccess(YBlock value);

} // YReadEachStatement
