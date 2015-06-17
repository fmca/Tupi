/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.State;
import br.ufpe.cin.tupi.Transition;
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

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.xtext.xbase.XExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getOriginStates <em>Origin States</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getDestState <em>Dest State</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getAction <em>Action</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.TransitionImpl#getTriggers <em>Triggers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends MinimalEObjectImpl.Container implements Transition
{
  /**
   * The cached value of the '{@link #getOriginStates() <em>Origin States</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOriginStates()
   * @generated
   * @ordered
   */
  protected EList<String> originStates;

  /**
   * The cached value of the '{@link #getDestState() <em>Dest State</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDestState()
   * @generated
   * @ordered
   */
  protected State destState;

  /**
   * The cached value of the '{@link #getGuard() <em>Guard</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuard()
   * @generated
   * @ordered
   */
  protected Guard guard;

  /**
   * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAction()
   * @generated
   * @ordered
   */
  protected Action action;

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
   * The cached value of the '{@link #getTriggers() <em>Triggers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTriggers()
   * @generated
   * @ordered
   */
  protected EList<TriggerEvent> triggers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TransitionImpl()
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
    return TupiPackage.Literals.TRANSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getOriginStates()
  {
    if (originStates == null)
    {
      originStates = new EDataTypeEList<String>(String.class, this, TupiPackage.TRANSITION__ORIGIN_STATES);
    }
    return originStates;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State getDestState()
  {
    if (destState != null && destState.eIsProxy())
    {
      InternalEObject oldDestState = (InternalEObject)destState;
      destState = (State)eResolveProxy(oldDestState);
      if (destState != oldDestState)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TupiPackage.TRANSITION__DEST_STATE, oldDestState, destState));
      }
    }
    return destState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State basicGetDestState()
  {
    return destState;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDestState(State newDestState)
  {
    State oldDestState = destState;
    destState = newDestState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.TRANSITION__DEST_STATE, oldDestState, destState));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard getGuard()
  {
    if (guard != null && guard.eIsProxy())
    {
      InternalEObject oldGuard = (InternalEObject)guard;
      guard = (Guard)eResolveProxy(oldGuard);
      if (guard != oldGuard)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TupiPackage.TRANSITION__GUARD, oldGuard, guard));
      }
    }
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard basicGetGuard()
  {
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGuard(Guard newGuard)
  {
    Guard oldGuard = guard;
    guard = newGuard;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.TRANSITION__GUARD, oldGuard, guard));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action getAction()
  {
    if (action != null && action.eIsProxy())
    {
      InternalEObject oldAction = (InternalEObject)action;
      action = (Action)eResolveProxy(oldAction);
      if (action != oldAction)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TupiPackage.TRANSITION__ACTION, oldAction, action));
      }
    }
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action basicGetAction()
  {
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAction(Action newAction)
  {
    Action oldAction = action;
    action = newAction;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.TRANSITION__ACTION, oldAction, action));
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
      parameters = new EObjectContainmentEList<XExpression>(XExpression.class, this, TupiPackage.TRANSITION__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<TriggerEvent> getTriggers()
  {
    if (triggers == null)
    {
      triggers = new EObjectContainmentEList<TriggerEvent>(TriggerEvent.class, this, TupiPackage.TRANSITION__TRIGGERS);
    }
    return triggers;
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
      case TupiPackage.TRANSITION__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case TupiPackage.TRANSITION__TRIGGERS:
        return ((InternalEList<?>)getTriggers()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.TRANSITION__ORIGIN_STATES:
        return getOriginStates();
      case TupiPackage.TRANSITION__DEST_STATE:
        if (resolve) return getDestState();
        return basicGetDestState();
      case TupiPackage.TRANSITION__GUARD:
        if (resolve) return getGuard();
        return basicGetGuard();
      case TupiPackage.TRANSITION__ACTION:
        if (resolve) return getAction();
        return basicGetAction();
      case TupiPackage.TRANSITION__PARAMETERS:
        return getParameters();
      case TupiPackage.TRANSITION__TRIGGERS:
        return getTriggers();
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
      case TupiPackage.TRANSITION__ORIGIN_STATES:
        getOriginStates().clear();
        getOriginStates().addAll((Collection<? extends String>)newValue);
        return;
      case TupiPackage.TRANSITION__DEST_STATE:
        setDestState((State)newValue);
        return;
      case TupiPackage.TRANSITION__GUARD:
        setGuard((Guard)newValue);
        return;
      case TupiPackage.TRANSITION__ACTION:
        setAction((Action)newValue);
        return;
      case TupiPackage.TRANSITION__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends XExpression>)newValue);
        return;
      case TupiPackage.TRANSITION__TRIGGERS:
        getTriggers().clear();
        getTriggers().addAll((Collection<? extends TriggerEvent>)newValue);
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
      case TupiPackage.TRANSITION__ORIGIN_STATES:
        getOriginStates().clear();
        return;
      case TupiPackage.TRANSITION__DEST_STATE:
        setDestState((State)null);
        return;
      case TupiPackage.TRANSITION__GUARD:
        setGuard((Guard)null);
        return;
      case TupiPackage.TRANSITION__ACTION:
        setAction((Action)null);
        return;
      case TupiPackage.TRANSITION__PARAMETERS:
        getParameters().clear();
        return;
      case TupiPackage.TRANSITION__TRIGGERS:
        getTriggers().clear();
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
      case TupiPackage.TRANSITION__ORIGIN_STATES:
        return originStates != null && !originStates.isEmpty();
      case TupiPackage.TRANSITION__DEST_STATE:
        return destState != null;
      case TupiPackage.TRANSITION__GUARD:
        return guard != null;
      case TupiPackage.TRANSITION__ACTION:
        return action != null;
      case TupiPackage.TRANSITION__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case TupiPackage.TRANSITION__TRIGGERS:
        return triggers != null && !triggers.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (originStates: ");
    result.append(originStates);
    result.append(')');
    return result.toString();
  }

} //TransitionImpl
