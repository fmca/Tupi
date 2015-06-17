/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Events Decl</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.EventsDecl#getEvents <em>Events</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getEventsDecl()
 * @model
 * @generated
 */
public interface EventsDecl extends EObject
{
  /**
   * Returns the value of the '<em><b>Events</b></em>' containment reference list.
   * The list contents are of type {@link br.ufpe.cin.tupi.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events</em>' containment reference list.
   * @see br.ufpe.cin.tupi.TupiPackage#getEventsDecl_Events()
   * @model containment="true"
   * @generated
   */
  EList<Event> getEvents();

} // EventsDecl
