/**
 * generated by Xtext 2.15.0
 */
package eu.jgen.notes.dmw.lite.mdl.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>YAnnot Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getName <em>Name</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#isOptional <em>Optional</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getTarget <em>Target</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#isMany <em>Many</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getElementValuePairs <em>Element Value Pairs</em>}</li>
 *   <li>{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getInverse <em>Inverse</em>}</li>
 * </ul>
 *
 * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship()
 * @model
 * @generated
 */
public interface YAnnotRelationship extends YAnnotIdInner, YAnnotEntityInner
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Optional</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Optional</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Optional</em>' attribute.
   * @see #setOptional(boolean)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_Optional()
   * @model
   * @generated
   */
  boolean isOptional();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#isOptional <em>Optional</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Optional</em>' attribute.
   * @see #isOptional()
   * @generated
   */
  void setOptional(boolean value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(YAnnotEntity)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_Target()
   * @model
   * @generated
   */
  YAnnotEntity getTarget();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(YAnnotEntity value);

  /**
   * Returns the value of the '<em><b>Many</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Many</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Many</em>' attribute.
   * @see #setMany(boolean)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_Many()
   * @model
   * @generated
   */
  boolean isMany();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#isMany <em>Many</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Many</em>' attribute.
   * @see #isMany()
   * @generated
   */
  void setMany(boolean value);

  /**
   * Returns the value of the '<em><b>Element Value Pairs</b></em>' containment reference list.
   * The list contents are of type {@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotationElementValuePair}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Value Pairs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Value Pairs</em>' containment reference list.
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_ElementValuePairs()
   * @model containment="true"
   * @generated
   */
  EList<YAnnotationElementValuePair> getElementValuePairs();

  /**
   * Returns the value of the '<em><b>Inverse</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Inverse</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Inverse</em>' reference.
   * @see #setInverse(YAnnotRelationship)
   * @see eu.jgen.notes.dmw.lite.mdl.model.ModelPackage#getYAnnotRelationship_Inverse()
   * @model
   * @generated
   */
  YAnnotRelationship getInverse();

  /**
   * Sets the value of the '{@link eu.jgen.notes.dmw.lite.mdl.model.YAnnotRelationship#getInverse <em>Inverse</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Inverse</em>' reference.
   * @see #getInverse()
   * @generated
   */
  void setInverse(YAnnotRelationship value);

} // YAnnotRelationship