/**
 */
package br.ufpe.cin.tupi.impl;

import br.ufpe.cin.tupi.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TupiFactoryImpl extends EFactoryImpl implements TupiFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TupiFactory init()
  {
    try
    {
      TupiFactory theTupiFactory = (TupiFactory)EPackage.Registry.INSTANCE.getEFactory(TupiPackage.eNS_URI);
      if (theTupiFactory != null)
      {
        return theTupiFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TupiFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupiFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TupiPackage.MODEL: return createModel();
      case TupiPackage.NAME_SPACE: return createNameSpace();
      case TupiPackage.USE_DECL: return createUseDecl();
      case TupiPackage.MACHINE_DECL: return createMachineDecl();
      case TupiPackage.MACHINE_BODY: return createMachineBody();
      case TupiPackage.EVENTS_DECL: return createEventsDecl();
      case TupiPackage.EVENT: return createEvent();
      case TupiPackage.TRANSITION: return createTransition();
      case TupiPackage.ACTIONS_DECL: return createActionsDecl();
      case TupiPackage.ACTION: return createAction();
      case TupiPackage.TRIGGER_EVENT: return createTriggerEvent();
      case TupiPackage.GUARDS_DECL: return createGuardsDecl();
      case TupiPackage.GUARD: return createGuard();
      case TupiPackage.MEMORY_DECL: return createMemoryDecl();
      case TupiPackage.MEMORY: return createMemory();
      case TupiPackage.TYPE: return createType();
      case TupiPackage.STATE_DECL: return createStateDecl();
      case TupiPackage.STATE: return createState();
      case TupiPackage.VARIABLE_LIST_DECL: return createVariableListDecl();
      case TupiPackage.VARIABLE_DECL: return createVariableDecl();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NameSpace createNameSpace()
  {
    NameSpaceImpl nameSpace = new NameSpaceImpl();
    return nameSpace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public UseDecl createUseDecl()
  {
    UseDeclImpl useDecl = new UseDeclImpl();
    return useDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineDecl createMachineDecl()
  {
    MachineDeclImpl machineDecl = new MachineDeclImpl();
    return machineDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MachineBody createMachineBody()
  {
    MachineBodyImpl machineBody = new MachineBodyImpl();
    return machineBody;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EventsDecl createEventsDecl()
  {
    EventsDeclImpl eventsDecl = new EventsDeclImpl();
    return eventsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Event createEvent()
  {
    EventImpl event = new EventImpl();
    return event;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Transition createTransition()
  {
    TransitionImpl transition = new TransitionImpl();
    return transition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ActionsDecl createActionsDecl()
  {
    ActionsDeclImpl actionsDecl = new ActionsDeclImpl();
    return actionsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Action createAction()
  {
    ActionImpl action = new ActionImpl();
    return action;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TriggerEvent createTriggerEvent()
  {
    TriggerEventImpl triggerEvent = new TriggerEventImpl();
    return triggerEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public GuardsDecl createGuardsDecl()
  {
    GuardsDeclImpl guardsDecl = new GuardsDeclImpl();
    return guardsDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Guard createGuard()
  {
    GuardImpl guard = new GuardImpl();
    return guard;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MemoryDecl createMemoryDecl()
  {
    MemoryDeclImpl memoryDecl = new MemoryDeclImpl();
    return memoryDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Memory createMemory()
  {
    MemoryImpl memory = new MemoryImpl();
    return memory;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public StateDecl createStateDecl()
  {
    StateDeclImpl stateDecl = new StateDeclImpl();
    return stateDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public State createState()
  {
    StateImpl state = new StateImpl();
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableListDecl createVariableListDecl()
  {
    VariableListDeclImpl variableListDecl = new VariableListDeclImpl();
    return variableListDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VariableDecl createVariableDecl()
  {
    VariableDeclImpl variableDecl = new VariableDeclImpl();
    return variableDecl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TupiPackage getTupiPackage()
  {
    return (TupiPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TupiPackage getPackage()
  {
    return TupiPackage.eINSTANCE;
  }

} //TupiFactoryImpl
