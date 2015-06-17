/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.GuardsDecl;
import br.ufpe.cin.tupi.TupiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Guards Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.GuardsDeclImpl#getGuards <em>Guards</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GuardsDeclImpl extends MinimalEObjectImpl.Container implements GuardsDecl
{
  /**
   * The cached value of the '{@link #getGuards() <em>Guards</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGuards()
   * @generated
   * @ordered
   */
  protected EList<Guard> guards;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GuardsDeclImpl()
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
    return TupiPackage.Literals.GUARDS_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Guard> getGuards()
  {
    if (guards == null)
    {
      guards = new EObjectContainmentEList<Guard>(Guard.class, this, TupiPackage.GUARDS_DECL__GUARDS);
    }
    return guards;
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
      case TupiPackage.GUARDS_DECL__GUARDS:
        return ((InternalEList<?>)getGuards()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.GUARDS_DECL__GUARDS:
        return getGuards();
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
      case TupiPackage.GUARDS_DECL__GUARDS:
        getGuards().clear();
        getGuards().addAll((Collection<? extends Guard>)newValue);
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
      case TupiPackage.GUARDS_DECL__GUARDS:
        getGuards().clear();
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
      case TupiPackage.GUARDS_DECL__GUARDS:
        return guards != null && !guards.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //GuardsDeclImpl
