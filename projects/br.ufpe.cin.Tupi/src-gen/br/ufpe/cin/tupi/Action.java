/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.Action#getName <em>Name</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Action#getVariableListDecl <em>Variable List Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Action#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject
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
   * @see br.ufpe.cin.tupi.TupiPackage#getAction_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Action#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Variable List Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Variable List Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Variable List Decl</em>' containment reference.
   * @see #setVariableListDecl(VariableListDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getAction_VariableListDecl()
   * @model containment="true"
   * @generated
   */
  VariableListDecl getVariableListDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Action#getVariableListDecl <em>Variable List Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Variable List Decl</em>' containment reference.
   * @see #getVariableListDecl()
   * @generated
   */
  void setVariableListDecl(VariableListDecl value);

  /**
   * Returns the value of the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block</em>' containment reference.
   * @see #setBlock(XExpression)
   * @see br.ufpe.cin.tupi.TupiPackage#getAction_Block()
   * @model containment="true"
   * @generated
   */
  XExpression getBlock();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Action#getBlock <em>Block</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block</em>' containment reference.
   * @see #getBlock()
   * @generated
   */
  void setBlock(XExpression value);

} // Action
