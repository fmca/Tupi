/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.common.types.JvmTypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.Type#getTypeRef <em>Type Ref</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getType()
 * @model
 * @generated
 */
public interface Type extends EObject
{
  /**
   * Returns the value of the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type Ref</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type Ref</em>' containment reference.
   * @see #setTypeRef(JvmTypeReference)
   * @see br.ufpe.cin.tupi.TupiPackage#getType_TypeRef()
   * @model containment="true"
   * @generated
   */
  JvmTypeReference getTypeRef();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Type#getTypeRef <em>Type Ref</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type Ref</em>' containment reference.
   * @see #getTypeRef()
   * @generated
   */
  void setTypeRef(JvmTypeReference value);

} // Type
