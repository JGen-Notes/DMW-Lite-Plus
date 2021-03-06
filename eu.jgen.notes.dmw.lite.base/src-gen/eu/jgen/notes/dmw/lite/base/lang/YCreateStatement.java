/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YCreate Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YCreateStatement#getStruct <em>Struct</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YCreateStatement#getSetBlock <em>Set Block</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYCreateStatement()
 * @model
 * @generated
 */
public interface YCreateStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Struct</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct</em>' containment reference.
   * @see #setStruct(YStructRefPair)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYCreateStatement_Struct()
   * @model containment="true"
   * @generated
   */
  YStructRefPair getStruct();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YCreateStatement#getStruct <em>Struct</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct</em>' containment reference.
   * @see #getStruct()
   * @generated
   */
  void setStruct(YStructRefPair value);

  /**
   * Returns the value of the '<em><b>Set Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Set Block</em>' containment reference.
   * @see #setSetBlock(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYCreateStatement_SetBlock()
   * @model containment="true"
   * @generated
   */
  YBlock getSetBlock();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YCreateStatement#getSetBlock <em>Set Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Set Block</em>' containment reference.
   * @see #getSetBlock()
   * @generated
   */
  void setSetBlock(YBlock value);

} // YCreateStatement
