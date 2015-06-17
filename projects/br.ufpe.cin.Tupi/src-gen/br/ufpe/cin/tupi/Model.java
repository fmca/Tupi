/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.Model#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Model#getUse <em>Use</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Model#getMachines <em>Machines</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Namespace</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Namespace</em>' containment reference.
   * @see #setNamespace(NameSpace)
   * @see br.ufpe.cin.tupi.TupiPackage#getModel_Namespace()
   * @model containment="true"
   * @generated
   */
  NameSpace getNamespace();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Model#getNamespace <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Namespace</em>' containment reference.
   * @see #getNamespace()
   * @generated
   */
  void setNamespace(NameSpace value);

  /**
   * Returns the value of the '<em><b>Use</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.UseDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Use</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Use</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getModel_Use()
   * @model containment="true"
   * @generated
   */
  EList<UseDecl> getUse();

  /**
   * Returns the value of the '<em><b>Machines</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.MachineDecl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machines</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machines</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getModel_Machines()
   * @model containment="true"
   * @generated
   */
  EList<MachineDecl> getMachines();

} // Model
