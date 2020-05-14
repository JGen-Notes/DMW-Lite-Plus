/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YFor In Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getItem <em>Item</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getCollection <em>Collection</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYForInStatement()
 * @model
 * @generated
 */
public interface YForInStatement extends YStatement
{
  /**
   * Returns the value of the '<em><b>Item</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Item</em>' reference.
   * @see #setItem(YProperty)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYForInStatement_Item()
   * @model
   * @generated
   */
  YProperty getItem();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getItem <em>Item</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Item</em>' reference.
   * @see #getItem()
   * @generated
   */
  void setItem(YProperty value);

  /**
   * Returns the value of the '<em><b>Collection</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Collection</em>' reference.
   * @see #setCollection(YProperty)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYForInStatement_Collection()
   * @model
   * @generated
   */
  YProperty getCollection();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getCollection <em>Collection</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Collection</em>' reference.
   * @see #getCollection()
   * @generated
   */
  void setCollection(YProperty value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(YBlock)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYForInStatement_Body()
   * @model containment="true"
   * @generated
   */
  YBlock getBody();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YForInStatement#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(YBlock value);

} // YForInStatement
