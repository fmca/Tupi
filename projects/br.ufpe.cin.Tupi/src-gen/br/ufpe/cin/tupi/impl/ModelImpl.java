/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.Model;
import br.ufpe.cin.tupi.NameSpace;
import br.ufpe.cin.tupi.TupiPackage;
import br.ufpe.cin.tupi.UseDecl;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.ModelImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.ModelImpl#getUse <em>Use</em>}</li>
 *   <li>{@link br.ufpe.cin.tupi.impl.ModelImpl#getMachines <em>Machines</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model
{
  /**
   * The cached value of the '{@link #getNamespace() <em>Namespace</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNamespace()
   * @generated
   * @ordered
   */
  protected NameSpace namespace;

  /**
   * The cached value of the '{@link #getUse() <em>Use</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUse()
   * @generated
   * @ordered
   */
  protected EList<UseDecl> use;

  /**
   * The cached value of the '{@link #getMachines() <em>Machines</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMachines()
   * @generated
   * @ordered
   */
  protected EList<MachineDecl> machines;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ModelImpl()
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
    return TupiPackage.Literals.MODEL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameSpace getNamespace()
  {
    return namespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNamespace(NameSpace newNamespace, NotificationChain msgs)
  {
    NameSpace oldNamespace = namespace;
    namespace = newNamespace;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TupiPackage.MODEL__NAMESPACE, oldNamespace, newNamespace);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNamespace(NameSpace newNamespace)
  {
    if (newNamespace != namespace)
    {
      NotificationChain msgs = null;
      if (namespace != null)
        msgs = ((InternalEObject)namespace).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MODEL__NAMESPACE, null, msgs);
      if (newNamespace != null)
        msgs = ((InternalEObject)newNamespace).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TupiPackage.MODEL__NAMESPACE, null, msgs);
      msgs = basicSetNamespace(newNamespace, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TupiPackage.MODEL__NAMESPACE, newNamespace, newNamespace));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<UseDecl> getUse()
  {
    if (use == null)
    {
      use = new EObjectContainmentEList<UseDecl>(UseDecl.class, this, TupiPackage.MODEL__USE);
    }
    return use;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MachineDecl> getMachines()
  {
    if (machines == null)
    {
      machines = new EObjectContainmentEList<MachineDecl>(MachineDecl.class, this, TupiPackage.MODEL__MACHINES);
    }
    return machines;
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
      case TupiPackage.MODEL__NAMESPACE:
        return basicSetNamespace(null, msgs);
      case TupiPackage.MODEL__USE:
        return ((InternalEList<?>)getUse()).basicRemove(otherEnd, msgs);
      case TupiPackage.MODEL__MACHINES:
        return ((InternalEList<?>)getMachines()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.MODEL__NAMESPACE:
        return getNamespace();
      case TupiPackage.MODEL__USE:
        return getUse();
      case TupiPackage.MODEL__MACHINES:
        return getMachines();
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
      case TupiPackage.MODEL__NAMESPACE:
        setNamespace((NameSpace)newValue);
        return;
      case TupiPackage.MODEL__USE:
        getUse().clear();
        getUse().addAll((Collection<? extends UseDecl>)newValue);
        return;
      case TupiPackage.MODEL__MACHINES:
        getMachines().clear();
        getMachines().addAll((Collection<? extends MachineDecl>)newValue);
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
      case TupiPackage.MODEL__NAMESPACE:
        setNamespace((NameSpace)null);
        return;
      case TupiPackage.MODEL__USE:
        getUse().clear();
        return;
      case TupiPackage.MODEL__MACHINES:
        getMachines().clear();
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
      case TupiPackage.MODEL__NAMESPACE:
        return namespace != null;
      case TupiPackage.MODEL__USE:
        return use != null && !use.isEmpty();
      case TupiPackage.MODEL__MACHINES:
        return machines != null && !machines.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ModelImpl
