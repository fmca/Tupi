/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getOriginStates <em>Origin States</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getDestState <em>Dest State</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getAction <em>Action</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.Transition#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends EObject
{
  /**
   * Returns the value of the '<em><b>Origin States</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Origin States</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Origin States</em>' attribute list.
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_OriginStates()
   * @model unique="false"
   * @generated
   */
  EList<String> getOriginStates();

  /**
   * Returns the value of the '<em><b>Dest State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Dest State</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Dest State</em>' reference.
   * @see #setDestState(State)
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_DestState()
   * @model
   * @generated
   */
  State getDestState();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Transition#getDestState <em>Dest State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Dest State</em>' reference.
   * @see #getDestState()
   * @generated
   */
  void setDestState(State value);

  /**
   * Returns the value of the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guard</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guard</em>' reference.
   * @see #setGuard(Guard)
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_Guard()
   * @model
   * @generated
   */
  Guard getGuard();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Transition#getGuard <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guard</em>' reference.
   * @see #getGuard()
   * @generated
   */
  void setGuard(Guard value);

  /**
   * Returns the value of the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Action</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Action</em>' reference.
   * @see #setAction(Action)
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_Action()
   * @model
   * @generated
   */
  Action getAction();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.Transition#getAction <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Action</em>' reference.
   * @see #getAction()
   * @generated
   */
  void setAction(Action value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.xtext.xbase.XExpression}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getParameters();

  /**
   * Returns the value of the '<em><b>Triggers</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.TriggerEvent}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Triggers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Triggers</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getTransition_Triggers()
   * @model containment="true"
   * @generated
   */
  EList<TriggerEvent> getTriggers();

} // Transition
