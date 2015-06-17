/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.ActionsDecl;
import br.ufpe.cin.tupi.EventsDecl;
import br.ufpe.cin.tupi.GuardsDecl;
import br.ufpe.cin.tupi.MachineBody;
import br.ufpe.cin.tupi.MemoryDecl;
import br.ufpe.cin.tupi.StateDecl;
import br.ufpe.cin.tupi.TupiPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Machine Body</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.MachineBodyImpl#getMemoriesDecl <em>Memories Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.MachineBodyImpl#getStatesDecl <em>States Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.MachineBodyImpl#getGuardsDecl <em>Guards Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.MachineBodyImpl#getActionsDecl <em>Actions Decl</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.MachineBodyImpl#getEventsDecl <em>Events Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MachineBodyImpl extends MinimalEObjectImpl.Container implements MachineBody
{
  /**
   * The cached value of the '{@link #getMemoriesDecl() <em>Memories Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemoriesDecl()
   * @generated
   * @ordered
   */
  protected MemoryDecl memoriesDecl;

  /**
   * The cached value of the '{@link #getStatesDecl() <em>States Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatesDecl()
   * @generated
   * @ordered
   */
  protected StateDecl statesDecl;

  /**
   * The cached value of the '{@link #getGuardsDecl() <em>Guards Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuardsDecl()
   * @generated
   * @ordered
   */
  protected GuardsDecl guardsDecl;

  /**
   * The cached value of the '{@link #getActionsDecl() <em>Actions Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getActionsDecl()
   * @generated
   * @ordered
   */
  protected ActionsDecl actionsDecl;

  /**
   * The cached value of the '{@link #getEventsDecl() <em>Events Decl</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEventsDecl()
   * @generated
   * @ordered
   */
  protected EventsDecl eventsDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MachineBodyImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TupiPackage.Literals.MACHINE_BODY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemoryDecl getMemoriesDecl()
  {
    return memoriesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMemoriesDecl(MemoryDecl newMemoriesDecl, NotificationChain msgs)
  {
    MemoryDecl oldMemoriesDecl = memoriesDecl;
    memoriesDecl = newMemoriesDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__MEMORIES_DECL, oldMemoriesDecl, newMemoriesDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMemoriesDecl(MemoryDecl newMemoriesDecl)
  {
    if (newMemoriesDecl != memoriesDecl)
    {
      NotificationChain msgs = null;
      if (memoriesDecl != null)
        msgs = ((InternalEObject)memoriesDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__MEMORIES_DECL, null, msgs);
      if (newMemoriesDecl != null)
        msgs = ((InternalEObject)newMemoriesDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__MEMORIES_DECL, null, msgs);
      msgs = basicSetMemoriesDecl(newMemoriesDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__MEMORIES_DECL, newMemoriesDecl, newMemoriesDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDecl getStatesDecl()
  {
    return statesDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatesDecl(StateDecl newStatesDecl, NotificationChain msgs)
  {
    StateDecl oldStatesDecl = statesDecl;
    statesDecl = newStatesDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__STATES_DECL, oldStatesDecl, newStatesDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatesDecl(StateDecl newStatesDecl)
  {
    if (newStatesDecl != statesDecl)
    {
      NotificationChain msgs = null;
      if (statesDecl != null)
        msgs = ((InternalEObject)statesDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__STATES_DECL, null, msgs);
      if (newStatesDecl != null)
        msgs = ((InternalEObject)newStatesDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__STATES_DECL, null, msgs);
      msgs = basicSetStatesDecl(newStatesDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__STATES_DECL, newStatesDecl, newStatesDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardsDecl getGuardsDecl()
  {
    return guardsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetGuardsDecl(GuardsDecl newGuardsDecl, NotificationChain msgs)
  {
    GuardsDecl oldGuardsDecl = guardsDecl;
    guardsDecl = newGuardsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__GUARDS_DECL, oldGuardsDecl, newGuardsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuardsDecl(GuardsDecl newGuardsDecl)
  {
    if (newGuardsDecl != guardsDecl)
    {
      NotificationChain msgs = null;
      if (guardsDecl != null)
        msgs = ((InternalEObject)guardsDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__GUARDS_DECL, null, msgs);
      if (newGuardsDecl != null)
        msgs = ((InternalEObject)newGuardsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__GUARDS_DECL, null, msgs);
      msgs = basicSetGuardsDecl(newGuardsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__GUARDS_DECL, newGuardsDecl, newGuardsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionsDecl getActionsDecl()
  {
    return actionsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetActionsDecl(ActionsDecl newActionsDecl, NotificationChain msgs)
  {
    ActionsDecl oldActionsDecl = actionsDecl;
    actionsDecl = newActionsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__ACTIONS_DECL, oldActionsDecl, newActionsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setActionsDecl(ActionsDecl newActionsDecl)
  {
    if (newActionsDecl != actionsDecl)
    {
      NotificationChain msgs = null;
      if (actionsDecl != null)
        msgs = ((InternalEObject)actionsDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__ACTIONS_DECL, null, msgs);
      if (newActionsDecl != null)
        msgs = ((InternalEObject)newActionsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__ACTIONS_DECL, null, msgs);
      msgs = basicSetActionsDecl(newActionsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__ACTIONS_DECL, newActionsDecl, newActionsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventsDecl getEventsDecl()
  {
    return eventsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetEventsDecl(EventsDecl newEventsDecl, NotificationChain msgs)
  {
    EventsDecl oldEventsDecl = eventsDecl;
    eventsDecl = newEventsDecl;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__EVENTS_DECL, oldEventsDecl, newEventsDecl);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEventsDecl(EventsDecl newEventsDecl)
  {
    if (newEventsDecl != eventsDecl)
    {
      NotificationChain msgs = null;
      if (eventsDecl != null)
        msgs = ((InternalEObject)eventsDecl).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__EVENTS_DECL, null, msgs);
      if (newEventsDecl != null)
        msgs = ((InternalEObject)newEventsDecl).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MACHINE_BODY__EVENTS_DECL, null, msgs);
      msgs = basicSetEventsDecl(newEventsDecl, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MACHINE_BODY__EVENTS_DECL, newEventsDecl, newEventsDecl));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TupiPackage.MACHINE_BODY__MEMORIES_DECL:
        return basicSetMemoriesDecl(null, msgs);
      case TupiPackage.MACHINE_BODY__STATES_DECL:
        return basicSetStatesDecl(null, msgs);
      case TupiPackage.MACHINE_BODY__GUARDS_DECL:
        return basicSetGuardsDecl(null, msgs);
      case TupiPackage.MACHINE_BODY__ACTIONS_DECL:
        return basicSetActionsDecl(null, msgs);
      case TupiPackage.MACHINE_BODY__EVENTS_DECL:
        return basicSetEventsDecl(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TupiPackage.MACHINE_BODY__MEMORIES_DECL:
        return getMemoriesDecl();
      case TupiPackage.MACHINE_BODY__STATES_DECL:
        return getStatesDecl();
      case TupiPackage.MACHINE_BODY__GUARDS_DECL:
        return getGuardsDecl();
      case TupiPackage.MACHINE_BODY__ACTIONS_DECL:
        return getActionsDecl();
      case TupiPackage.MACHINE_BODY__EVENTS_DECL:
        return getEventsDecl();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TupiPackage.MACHINE_BODY__MEMORIES_DECL:
        setMemoriesDecl((MemoryDecl)newValue);
        return;
      case TupiPackage.MACHINE_BODY__STATES_DECL:
        setStatesDecl((StateDecl)newValue);
        return;
      case TupiPackage.MACHINE_BODY__GUARDS_DECL:
        setGuardsDecl((GuardsDecl)newValue);
        return;
      case TupiPackage.MACHINE_BODY__ACTIONS_DECL:
        setActionsDecl((ActionsDecl)newValue);
        return;
      case TupiPackage.MACHINE_BODY__EVENTS_DECL:
        setEventsDecl((EventsDecl)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TupiPackage.MACHINE_BODY__MEMORIES_DECL:
        setMemoriesDecl((MemoryDecl)null);
        return;
      case TupiPackage.MACHINE_BODY__STATES_DECL:
        setStatesDecl((StateDecl)null);
        return;
      case TupiPackage.MACHINE_BODY__GUARDS_DECL:
        setGuardsDecl((GuardsDecl)null);
        return;
      case TupiPackage.MACHINE_BODY__ACTIONS_DECL:
        setActionsDecl((ActionsDecl)null);
        return;
      case TupiPackage.MACHINE_BODY__EVENTS_DECL:
        setEventsDecl((EventsDecl)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TupiPackage.MACHINE_BODY__MEMORIES_DECL:
        return memoriesDecl != null;
      case TupiPackage.MACHINE_BODY__STATES_DECL:
        return statesDecl != null;
      case TupiPackage.MACHINE_BODY__GUARDS_DECL:
        return guardsDecl != null;
      case TupiPackage.MACHINE_BODY__ACTIONS_DECL:
        return actionsDecl != null;
      case TupiPackage.MACHINE_BODY__EVENTS_DECL:
        return eventsDecl != null;
    }
    return super.eIsSet(featureID);
  }

} //MachineBodyImpl
