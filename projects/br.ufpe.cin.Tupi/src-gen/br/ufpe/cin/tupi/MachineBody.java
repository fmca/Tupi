/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Machine Body</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.MachineBody#getMemoriesDecl <em>Memories Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineBody#getStatesDecl <em>States Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineBody#getGuardsDecl <em>Guards Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineBody#getActionsDecl <em>Actions Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.MachineBody#getEventsDecl <em>Events Decl</em>}</li>
 * </ul>
 *
 * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody()
 * @model
 * @generated
 */
public interface MachineBody extends EObject
{
  /**
   * Returns the value of the '<em><b>Memories Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Memories Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Memories Decl</em>' containment reference.
   * @see #setMemoriesDecl(MemoryDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody_MemoriesDecl()
   * @model containment="true"
   * @generated
   */
  MemoryDecl getMemoriesDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineBody#getMemoriesDecl <em>Memories Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Memories Decl</em>' containment reference.
   * @see #getMemoriesDecl()
   * @generated
   */
  void setMemoriesDecl(MemoryDecl value);

  /**
   * Returns the value of the '<em><b>States Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>States Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>States Decl</em>' containment reference.
   * @see #setStatesDecl(StateDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody_StatesDecl()
   * @model containment="true"
   * @generated
   */
  StateDecl getStatesDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineBody#getStatesDecl <em>States Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>States Decl</em>' containment reference.
   * @see #getStatesDecl()
   * @generated
   */
  void setStatesDecl(StateDecl value);

  /**
   * Returns the value of the '<em><b>Guards Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Guards Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Guards Decl</em>' containment reference.
   * @see #setGuardsDecl(GuardsDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody_GuardsDecl()
   * @model containment="true"
   * @generated
   */
  GuardsDecl getGuardsDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineBody#getGuardsDecl <em>Guards Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Guards Decl</em>' containment reference.
   * @see #getGuardsDecl()
   * @generated
   */
  void setGuardsDecl(GuardsDecl value);

  /**
   * Returns the value of the '<em><b>Actions Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Actions Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Actions Decl</em>' containment reference.
   * @see #setActionsDecl(ActionsDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody_ActionsDecl()
   * @model containment="true"
   * @generated
   */
  ActionsDecl getActionsDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineBody#getActionsDecl <em>Actions Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Actions Decl</em>' containment reference.
   * @see #getActionsDecl()
   * @generated
   */
  void setActionsDecl(ActionsDecl value);

  /**
   * Returns the value of the '<em><b>Events Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Events Decl</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Events Decl</em>' containment reference.
   * @see #setEventsDecl(EventsDecl)
   * @see br.ufpe.cin.tupi.TupiPackage#getMachineBody_EventsDecl()
   * @model containment="true"
   * @generated
   */
  EventsDecl getEventsDecl();

  /**
   * Sets the value of the '{@link br.ufpe.cin.tupi.MachineBody#getEventsDecl <em>Events Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Events Decl</em>' containment reference.
   * @see #getEventsDecl()
   * @generated
   */
  void setEventsDecl(EventsDecl value);

} // MachineBody
