/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable List Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.VariableListDecl#getVariablesDecl <em>Variables Decl</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getVariableListDecl()
 * @model
 * @generated
 */
public interface VariableListDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Variables Decl</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.VariableDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variables Decl</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variables Decl</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getVariableListDecl_VariablesDecl()
   * @model containment="true"
   * @generated
   */
  EList<VariableDecl> getVariablesDecl();

} // VariableListDecl
