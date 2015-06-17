/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.TupiPackage;
import br.ufpe.cin.tupi.VariableDecl;
import br.ufpe.cin.tupi.VariableListDecl;

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
 * An implementation of the model object '<em><b>Variable List Decl</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufpe.cin.tupi.impl.VariableListDeclImpl#getVariablesDecl <em>Variables Decl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariableListDeclImpl extends MinimalEObjectImpl.Container implements VariableListDecl
{
  /**
   * The cached value of the '{@link #getVariablesDecl() <em>Variables Decl</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVariablesDecl()
   * @generated
   * @ordered
   */
  protected EList<VariableDecl> variablesDecl;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VariableListDeclImpl()
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
    return TupiPackage.Literals.VARIABLE_LIST_DECL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VariableDecl> getVariablesDecl()
  {
    if (variablesDecl == null)
    {
      variablesDecl = new EObjectContainmentEList<VariableDecl>(VariableDecl.class, this, TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL);
    }
    return variablesDecl;
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
      case TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL:
        return ((InternalEList<?>)getVariablesDecl()).basicRemove(otherEnd, msgs);
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
      case TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL:
        return getVariablesDecl();
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
      case TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL:
        getVariablesDecl().clear();
        getVariablesDecl().addAll((Collection<? extends VariableDecl>)newValue);
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
      case TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL:
        getVariablesDecl().clear();
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
      case TupiPackage.VARIABLE_LIST_DECL__VARIABLES_DECL:
        return variablesDecl != null && !variablesDecl.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //VariableListDeclImpl
