/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.TriggerEvent#getEvent <em>Event</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.TriggerEvent#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.TriggerEvent#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getTriggerEvent()
 * @model
 * @generated
 */
public interface TriggerEvent extends EObject
{
  /**
   * Returns the value of the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' reference.
   * @see #setEvent(Event)
   * @see br.ufpe.cin.tupi.TupiPackage#getTriggerEvent_Event()
   * @model
   * @generated
   */
  Event getEvent();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.TriggerEvent#getEvent <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Event</em>' reference.
   * @see #getEvent()
   * @generated
   */
  void setEvent(Event value);

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
   * @see br.ufpe.cin.tupi.TupiPackage#getTriggerEvent_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<XExpression> getParameters();

  /**
   * Returns the value of the '<em><b>Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Machine</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Machine</em>' reference.
   * @see #setMachine(Memory)
   * @see br.ufpe.cin.tupi.TupiPackage#getTriggerEvent_Machine()
   * @model
   * @generated
   */
  Memory getMachine();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.TriggerEvent#getMachine <em>Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Machine</em>' reference.
   * @see #getMachine()
   * @generated
   */
  void setMachine(Memory value);

} // TriggerEvent
