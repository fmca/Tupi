/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actions Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.ActionsDecl#getActions <em>Actions</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getActionsDecl()
 * @model
 * @generated
 */
public interface ActionsDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Actions</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.Action}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getActionsDecl_Actions()
   * @model containment="true"
   * @generated
   */
  EList<Action> getActions();

} // ActionsDecl
