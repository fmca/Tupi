/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.Memory;
import br.ufpe.cin.tupi.TriggerEvent;
import br.ufpe.cin.tupi.TupiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trigger Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.TriggerEventImpl#getEvent <em>Event</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TriggerEventImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TriggerEventImpl#getMachine <em>Machine</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TriggerEventImpl extends MinimalEObjectImpl.Container implements TriggerEvent
{
  /**
   * The cached value of the '{@link #getEvent() <em>Event</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvent()
   * @generated
   * @ordered
   */
  protected Event event;

  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<XExpression> parameters;

  /**
   * The cached value of the '{@link #getMachine() <em>Machine</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachine()
   * @generated
   * @ordered
   */
  protected Memory machine;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TriggerEventImpl()
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
    return TupiPackage.Literals.TRIGGER_EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event getEvent()
  {
    if (event != null && event.eIsProxy())
    {
      InternalEObject oldEvent = (InternalEObject)event;
      event = (Event)eResolveProxy(oldEvent);
      if (event != oldEvent)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TupiPackage.TRIGGER_EVENT__EVENT, oldEvent, event));
      }
    }
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event basicGetEvent()
  {
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setEvent(Event newEvent)
  {
    Event oldEvent = event;
    event = newEvent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.TRIGGER_EVENT__EVENT, oldEvent, event));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<XExpression> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList<XExpression>(XExpression.class, this, TupiPackage.TRIGGER_EVENT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Memory getMachine()
  {
    if (machine != null && machine.eIsProxy())
    {
      InternalEObject oldMachine = (InternalEObject)machine;
      machine = (Memory)eResolveProxy(oldMachine);
      if (machine != oldMachine)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TupiPackage.TRIGGER_EVENT__MACHINE, oldMachine, machine));
      }
    }
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Memory basicGetMachine()
  {
    return machine;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMachine(Memory newMachine)
  {
    Memory oldMachine = machine;
    machine = newMachine;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.TRIGGER_EVENT__MACHINE, oldMachine, machine));
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
      case TupiPackage.TRIGGER_EVENT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.TRIGGER_EVENT__EVENT:
        if (resolve) return getEvent();
        return basicGetEvent();
      case TupiPackage.TRIGGER_EVENT__PARAMETERS:
        return getParameters();
      case TupiPackage.TRIGGER_EVENT__MACHINE:
        if (resolve) return getMachine();
        return basicGetMachine();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TupiPackage.TRIGGER_EVENT__EVENT:
        setEvent((Event)newValue);
        return;
      case TupiPackage.TRIGGER_EVENT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends XExpression>)newValue);
        return;
      case TupiPackage.TRIGGER_EVENT__MACHINE:
        setMachine((Memory)newValue);
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
      case TupiPackage.TRIGGER_EVENT__EVENT:
        setEvent((Event)null);
        return;
      case TupiPackage.TRIGGER_EVENT__PARAMETERS:
        getParameters().clear();
        return;
      case TupiPackage.TRIGGER_EVENT__MACHINE:
        setMachine((Memory)null);
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
      case TupiPackage.TRIGGER_EVENT__EVENT:
        return event != null;
      case TupiPackage.TRIGGER_EVENT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case TupiPackage.TRIGGER_EVENT__MACHINE:
        return machine != null;
    }
    return super.eIsSet(featureID);
  }

} //TriggerEventImpl
