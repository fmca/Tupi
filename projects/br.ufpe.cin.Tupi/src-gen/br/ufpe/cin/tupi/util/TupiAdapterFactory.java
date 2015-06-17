/**
 */
package br.ufpe.cin.tupi.util;

import br.ufpe.cin.tupi.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see br.ufpe.cin.tupi.TupiPackage
 * @generated
 */
public class TupiAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TupiPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupiAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TupiPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TupiSwitch<Adapter> modelSwitch =
    new TupiSwitch<Adapter>()
    {
      @Override
      public Adapter caseModel(Model object)
      {
        return createModelAdapter();
      }
      @Override
      public Adapter caseNameSpace(NameSpace object)
      {
        return createNameSpaceAdapter();
      }
      @Override
      public Adapter caseUseDecl(UseDecl object)
      {
        return createUseDeclAdapter();
      }
      @Override
      public Adapter caseMachineDecl(MachineDecl object)
      {
        return createMachineDeclAdapter();
      }
      @Override
      public Adapter caseMachineBody(MachineBody object)
      {
        return createMachineBodyAdapter();
      }
      @Override
      public Adapter caseEventsDecl(EventsDecl object)
      {
        return createEventsDeclAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseTransition(Transition object)
      {
        return createTransitionAdapter();
      }
      @Override
      public Adapter caseActionsDecl(ActionsDecl object)
      {
        return createActionsDeclAdapter();
      }
      @Override
      public Adapter caseAction(Action object)
      {
        return createActionAdapter();
      }
      @Override
      public Adapter caseTriggerEvent(TriggerEvent object)
      {
        return createTriggerEventAdapter();
      }
      @Override
      public Adapter caseGuardsDecl(GuardsDecl object)
      {
        return createGuardsDeclAdapter();
      }
      @Override
      public Adapter caseGuard(Guard object)
      {
        return createGuardAdapter();
      }
      @Override
      public Adapter caseMemoryDecl(MemoryDecl object)
      {
        return createMemoryDeclAdapter();
      }
      @Override
      public Adapter caseMemory(Memory object)
      {
        return createMemoryAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseStateDecl(StateDecl object)
      {
        return createStateDeclAdapter();
      }
      @Override
      public Adapter caseState(State object)
      {
        return createStateAdapter();
      }
      @Override
      public Adapter caseVariableListDecl(VariableListDecl object)
      {
        return createVariableListDeclAdapter();
      }
      @Override
      public Adapter caseVariableDecl(VariableDecl object)
      {
        return createVariableDeclAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Model
   * @generated
   */
  public Adapter createModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.NameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.NameSpace
   * @generated
   */
  public Adapter createNameSpaceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.UseDecl <em>Use Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.UseDecl
   * @generated
   */
  public Adapter createUseDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.MachineDecl <em>Machine Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.MachineDecl
   * @generated
   */
  public Adapter createMachineDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.MachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.MachineBody
   * @generated
   */
  public Adapter createMachineBodyAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.EventsDecl <em>Events Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.EventsDecl
   * @generated
   */
  public Adapter createEventsDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Transition
   * @generated
   */
  public Adapter createTransitionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.ActionsDecl <em>Actions Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.ActionsDecl
   * @generated
   */
  public Adapter createActionsDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Action
   * @generated
   */
  public Adapter createActionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.TriggerEvent <em>Trigger Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.TriggerEvent
   * @generated
   */
  public Adapter createTriggerEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.GuardsDecl <em>Guards Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.GuardsDecl
   * @generated
   */
  public Adapter createGuardsDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Guard
   * @generated
   */
  public Adapter createGuardAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.MemoryDecl <em>Memory Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.MemoryDecl
   * @generated
   */
  public Adapter createMemoryDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Memory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Memory
   * @generated
   */
  public Adapter createMemoryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.StateDecl <em>State Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.StateDecl
   * @generated
   */
  public Adapter createStateDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.State
   * @generated
   */
  public Adapter createStateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.VariableListDecl <em>Variable List Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.VariableListDecl
   * @generated
   */
  public Adapter createVariableListDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link br.ufpe.cin.tupi.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see br.ufpe.cin.tupi.VariableDecl
   * @generated
   */
  public Adapter createVariableDeclAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TupiAdapterFactory
