/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Guards Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.GuardsDecl#getGuards <em>Guards</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getGuardsDecl()
 * @model
 * @generated
 */
public interface GuardsDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Guards</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.Guard}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guards</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guards</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getGuardsDecl_Guards()
   * @model containment="true"
   * @generated
   */
  EList<Guard> getGuards();

} // GuardsDecl
