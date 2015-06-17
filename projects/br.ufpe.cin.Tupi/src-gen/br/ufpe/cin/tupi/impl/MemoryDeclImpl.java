/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.Memory;
import br.ufpe.cin.tupi.MemoryDecl;
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
 * An implementation of the model object '<em><b>Memory Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.MemoryDeclImpl#getMemories <em>Memories</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MemoryDeclImpl extends MinimalEObjectImpl.Container implements MemoryDecl
{
  /**
   * The cached value of the '{@link #getMemories() <em>Memories</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMemories()
   * @generated
   * @ordered
   */
  protected EList<Memory> memories;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MemoryDeclImpl()
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
    return TupiPackage.Literals.MEMORY_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Memory> getMemories()
  {
    if (memories == null)
    {
      memories = new EObjectContainmentEList<Memory>(Memory.class, this, TupiPackage.MEMORY_DECL__MEMORIES);
    }
    return memories;
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
      case TupiPackage.MEMORY_DECL__MEMORIES:
        return ((InternalEList<?>)getMemories()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.MEMORY_DECL__MEMORIES:
        return getMemories();
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
      case TupiPackage.MEMORY_DECL__MEMORIES:
        getMemories().clear();
        getMemories().addAll((Collection<? extends Memory>)newValue);
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
      case TupiPackage.MEMORY_DECL__MEMORIES:
        getMemories().clear();
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
      case TupiPackage.MEMORY_DECL__MEMORIES:
        return memories != null && !memories.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //MemoryDeclImpl
