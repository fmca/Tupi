/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.MachineDecl#getName <em>Name</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineDecl#getSuperType <em>Super Type</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineDecl#getBody <em>Body</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getMachineDecl()
 * @model
 * @generated
 */
public interface MachineDecl extends EObject
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
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineDecl_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineDecl#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Super Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Super Type</em>' containment reference.
   * @see #setSuperType(Type)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineDecl_SuperType()
   * @model containment="true"
   * @generated
   */
  Type getSuperType();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineDecl#getSuperType <em>Super Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Super Type</em>' containment reference.
   * @see #getSuperType()
   * @generated
   */
  void setSuperType(Type value);

  /**
   * Returns the value of the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Body</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Body</em>' containment reference.
   * @see #setBody(MachineBody)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineDecl_Body()
   * @model containment="true"
   * @generated
   */
  MachineBody getBody();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineDecl#getBody <em>Body</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Body</em>' containment reference.
   * @see #getBody()
   * @generated
   */
  void setBody(MachineBody value);

} // MachineDecl
