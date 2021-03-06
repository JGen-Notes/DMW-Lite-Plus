/**
 * generated by Xtext 2.21.0
 */
package eu.jgen.notes.dmw.lite.base.lang;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YMember</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YMember#getAccess <em>Access</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.base.lang.YMember#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYMember()
 * @model
 * @generated
 */
public interface YMember extends YNamedElement
{
  /**
   * Returns the value of the '<em><b>Access</b></em>' attribute.
   * The literals are from the enumeration {@link eu.jgen.notes.dmw.lite.base.lang.YAccessLevel}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Access</em>' attribute.
   * @see eu.jgen.notes.dmw.lite.base.lang.YAccessLevel
   * @see #setAccess(YAccessLevel)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYMember_Access()
   * @model
   * @generated
   */
  YAccessLevel getAccess();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YMember#getAccess <em>Access</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Access</em>' attribute.
   * @see eu.jgen.notes.dmw.lite.base.lang.YAccessLevel
   * @see #getAccess()
   * @generated
   */
  void setAccess(YAccessLevel value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' reference.
   * @see #setType(YClass)
   * @see eu.jgen.notes.dmw.lite.base.lang.LangPackage#getYMember_Type()
   * @model
   * @generated
   */
  YClass getType();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.base.lang.YMember#getType <em>Type</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' reference.
   * @see #getType()
   * @generated
   */
  void setType(YClass value);

} // YMember
