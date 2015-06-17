/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.StateDecl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getStateDecl()
 * @model
 * @generated
 */
public interface StateDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>States</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.State}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getStateDecl_States()
   * @model containment="true"
   * @generated
   */
  EList<State> getStates();

} // StateDecl
