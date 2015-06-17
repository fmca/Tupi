/**
 */
package br.ufpe.cin.tupi;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see br.ufpe.cin.tupi.TupiFactory
 * @model kind="package"
 * @generated
 */
public interface TupiPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tupi";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ufpe.br/cin/Tupi";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tupi";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TupiPackage eINSTANCE = br.ufpe.cin.tupi.impl.TupiPackageImpl.init();

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.ModelImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Namespace</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Use</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__USE = 1;

  /**
   * The feature id for the '<em><b>Machines</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__MACHINES = 2;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.NameSpaceImpl <em>Name Space</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.NameSpaceImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getNameSpace()
   * @generated
   */
  int NAME_SPACE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE__NAME = 0;

  /**
   * The number of structural features of the '<em>Name Space</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NAME_SPACE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.UseDeclImpl <em>Use Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.UseDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getUseDecl()
   * @generated
   */
  int USE_DECL = 2;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DECL__IMPORTED_NAMESPACE = 0;

  /**
   * The number of structural features of the '<em>Use Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int USE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.MachineDeclImpl <em>Machine Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.MachineDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMachineDecl()
   * @generated
   */
  int MACHINE_DECL = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_DECL__NAME = 0;

  /**
   * The feature id for the '<em><b>Super Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_DECL__SUPER_TYPE = 1;

  /**
   * The feature id for the '<em><b>Body</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_DECL__BODY = 2;

  /**
   * The number of structural features of the '<em>Machine Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_DECL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.MachineBodyImpl <em>Machine Body</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.MachineBodyImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMachineBody()
   * @generated
   */
  int MACHINE_BODY = 4;

  /**
   * The feature id for the '<em><b>Memories Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__MEMORIES_DECL = 0;

  /**
   * The feature id for the '<em><b>States Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__STATES_DECL = 1;

  /**
   * The feature id for the '<em><b>Guards Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__GUARDS_DECL = 2;

  /**
   * The feature id for the '<em><b>Actions Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__ACTIONS_DECL = 3;

  /**
   * The feature id for the '<em><b>Events Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY__EVENTS_DECL = 4;

  /**
   * The number of structural features of the '<em>Machine Body</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MACHINE_BODY_FEATURE_COUNT = 5;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.EventsDeclImpl <em>Events Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.EventsDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getEventsDecl()
   * @generated
   */
  int EVENTS_DECL = 5;

  /**
   * The feature id for the '<em><b>Events</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_DECL__EVENTS = 0;

  /**
   * The number of structural features of the '<em>Events Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENTS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.EventImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__TRANSITIONS = 2;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.TransitionImpl <em>Transition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.TransitionImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getTransition()
   * @generated
   */
  int TRANSITION = 7;

  /**
   * The feature id for the '<em><b>Origin States</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ORIGIN_STATES = 0;

  /**
   * The feature id for the '<em><b>Dest State</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__DEST_STATE = 1;

  /**
   * The feature id for the '<em><b>Guard</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__GUARD = 2;

  /**
   * The feature id for the '<em><b>Action</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__ACTION = 3;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__PARAMETERS = 4;

  /**
   * The feature id for the '<em><b>Triggers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION__TRIGGERS = 5;

  /**
   * The number of structural features of the '<em>Transition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRANSITION_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.ActionsDeclImpl <em>Actions Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.ActionsDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getActionsDecl()
   * @generated
   */
  int ACTIONS_DECL = 8;

  /**
   * The feature id for the '<em><b>Actions</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS_DECL__ACTIONS = 0;

  /**
   * The number of structural features of the '<em>Actions Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTIONS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.ActionImpl <em>Action</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.ActionImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getAction()
   * @generated
   */
  int ACTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__NAME = 0;

  /**
   * The feature id for the '<em><b>Variable List Decl</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__VARIABLE_LIST_DECL = 1;

  /**
   * The feature id for the '<em><b>Block</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION__BLOCK = 2;

  /**
   * The number of structural features of the '<em>Action</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ACTION_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.TriggerEventImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getTriggerEvent()
   * @generated
   */
  int TRIGGER_EVENT = 10;

  /**
   * The feature id for the '<em><b>Event</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EVENT__EVENT = 0;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EVENT__PARAMETERS = 1;

  /**
   * The feature id for the '<em><b>Machine</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EVENT__MACHINE = 2;

  /**
   * The number of structural features of the '<em>Trigger Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TRIGGER_EVENT_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.GuardsDeclImpl <em>Guards Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.GuardsDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getGuardsDecl()
   * @generated
   */
  int GUARDS_DECL = 11;

  /**
   * The feature id for the '<em><b>Guards</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDS_DECL__GUARDS = 0;

  /**
   * The number of structural features of the '<em>Guards Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARDS_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.GuardImpl <em>Guard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.GuardImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getGuard()
   * @generated
   */
  int GUARD = 12;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__NAME = 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD__EXPR = 1;

  /**
   * The number of structural features of the '<em>Guard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GUARD_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.MemoryDeclImpl <em>Memory Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.MemoryDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMemoryDecl()
   * @generated
   */
  int MEMORY_DECL = 13;

  /**
   * The feature id for the '<em><b>Memories</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_DECL__MEMORIES = 0;

  /**
   * The number of structural features of the '<em>Memory Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.MemoryImpl <em>Memory</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.MemoryImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMemory()
   * @generated
   */
  int MEMORY = 14;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY__NAME = 1;

  /**
   * The number of structural features of the '<em>Memory</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MEMORY_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.TypeImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getType()
   * @generated
   */
  int TYPE = 15;

  /**
   * The feature id for the '<em><b>Type Ref</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__TYPE_REF = 0;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.StateDeclImpl <em>State Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.StateDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getStateDecl()
   * @generated
   */
  int STATE_DECL = 16;

  /**
   * The feature id for the '<em><b>States</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECL__STATES = 0;

  /**
   * The number of structural features of the '<em>State Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.StateImpl <em>State</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.StateImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getState()
   * @generated
   */
  int STATE = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE__NAME = 0;

  /**
   * The number of structural features of the '<em>State</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.VariableListDeclImpl <em>Variable List Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.VariableListDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getVariableListDecl()
   * @generated
   */
  int VARIABLE_LIST_DECL = 18;

  /**
   * The feature id for the '<em><b>Variables Decl</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_DECL__VARIABLES_DECL = 0;

  /**
   * The number of structural features of the '<em>Variable List Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_LIST_DECL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link br.ufpe.cin.tupi.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see br.ufpe.cin.tupi.impl.VariableDeclImpl
   * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getVariableDecl()
   * @generated
   */
  int VARIABLE_DECL = 19;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL__NAME = 1;

  /**
   * The number of structural features of the '<em>Variable Decl</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VARIABLE_DECL_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see br.ufpe.cin.tupi.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Model#getNamespace <em>Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Namespace</em>'.
   * @see br.ufpe.cin.tupi.Model#getNamespace()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Namespace();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.Model#getUse <em>Use</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Use</em>'.
   * @see br.ufpe.cin.tupi.Model#getUse()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Use();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.Model#getMachines <em>Machines</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Machines</em>'.
   * @see br.ufpe.cin.tupi.Model#getMachines()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Machines();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.NameSpace <em>Name Space</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Name Space</em>'.
   * @see br.ufpe.cin.tupi.NameSpace
   * @generated
   */
  EClass getNameSpace();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.NameSpace#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.NameSpace#getName()
   * @see #getNameSpace()
   * @generated
   */
  EAttribute getNameSpace_Name();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.UseDecl <em>Use Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Use Decl</em>'.
   * @see br.ufpe.cin.tupi.UseDecl
   * @generated
   */
  EClass getUseDecl();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.UseDecl#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imported Namespace</em>'.
   * @see br.ufpe.cin.tupi.UseDecl#getImportedNamespace()
   * @see #getUseDecl()
   * @generated
   */
  EAttribute getUseDecl_ImportedNamespace();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.MachineDecl <em>Machine Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineDecl
   * @generated
   */
  EClass getMachineDecl();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.MachineDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.MachineDecl#getName()
   * @see #getMachineDecl()
   * @generated
   */
  EAttribute getMachineDecl_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineDecl#getSuperType <em>Super Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Super Type</em>'.
   * @see br.ufpe.cin.tupi.MachineDecl#getSuperType()
   * @see #getMachineDecl()
   * @generated
   */
  EReference getMachineDecl_SuperType();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineDecl#getBody <em>Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Body</em>'.
   * @see br.ufpe.cin.tupi.MachineDecl#getBody()
   * @see #getMachineDecl()
   * @generated
   */
  EReference getMachineDecl_Body();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.MachineBody <em>Machine Body</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Machine Body</em>'.
   * @see br.ufpe.cin.tupi.MachineBody
   * @generated
   */
  EClass getMachineBody();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineBody#getMemoriesDecl <em>Memories Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Memories Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineBody#getMemoriesDecl()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_MemoriesDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineBody#getStatesDecl <em>States Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>States Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineBody#getStatesDecl()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_StatesDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineBody#getGuardsDecl <em>Guards Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Guards Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineBody#getGuardsDecl()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_GuardsDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineBody#getActionsDecl <em>Actions Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Actions Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineBody#getActionsDecl()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_ActionsDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.MachineBody#getEventsDecl <em>Events Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Events Decl</em>'.
   * @see br.ufpe.cin.tupi.MachineBody#getEventsDecl()
   * @see #getMachineBody()
   * @generated
   */
  EReference getMachineBody_EventsDecl();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.EventsDecl <em>Events Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Events Decl</em>'.
   * @see br.ufpe.cin.tupi.EventsDecl
   * @generated
   */
  EClass getEventsDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.EventsDecl#getEvents <em>Events</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Events</em>'.
   * @see br.ufpe.cin.tupi.EventsDecl#getEvents()
   * @see #getEventsDecl()
   * @generated
   */
  EReference getEventsDecl_Events();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see br.ufpe.cin.tupi.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.Event#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.Event#getName()
   * @see #getEvent()
   * @generated
   */
  EAttribute getEvent_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Event#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Parameters</em>'.
   * @see br.ufpe.cin.tupi.Event#getParameters()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.Event#getTransitions <em>Transitions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Transitions</em>'.
   * @see br.ufpe.cin.tupi.Event#getTransitions()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Transitions();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Transition <em>Transition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Transition</em>'.
   * @see br.ufpe.cin.tupi.Transition
   * @generated
   */
  EClass getTransition();

  /**
   * Returns the meta object for the attribute list '{@link br.ufpe.cin.tupi.Transition#getOriginStates <em>Origin States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Origin States</em>'.
   * @see br.ufpe.cin.tupi.Transition#getOriginStates()
   * @see #getTransition()
   * @generated
   */
  EAttribute getTransition_OriginStates();

  /**
   * Returns the meta object for the reference '{@link br.ufpe.cin.tupi.Transition#getDestState <em>Dest State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Dest State</em>'.
   * @see br.ufpe.cin.tupi.Transition#getDestState()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_DestState();

  /**
   * Returns the meta object for the reference '{@link br.ufpe.cin.tupi.Transition#getGuard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Guard</em>'.
   * @see br.ufpe.cin.tupi.Transition#getGuard()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Guard();

  /**
   * Returns the meta object for the reference '{@link br.ufpe.cin.tupi.Transition#getAction <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Action</em>'.
   * @see br.ufpe.cin.tupi.Transition#getAction()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Action();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.Transition#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see br.ufpe.cin.tupi.Transition#getParameters()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Parameters();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.Transition#getTriggers <em>Triggers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Triggers</em>'.
   * @see br.ufpe.cin.tupi.Transition#getTriggers()
   * @see #getTransition()
   * @generated
   */
  EReference getTransition_Triggers();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.ActionsDecl <em>Actions Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Actions Decl</em>'.
   * @see br.ufpe.cin.tupi.ActionsDecl
   * @generated
   */
  EClass getActionsDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.ActionsDecl#getActions <em>Actions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Actions</em>'.
   * @see br.ufpe.cin.tupi.ActionsDecl#getActions()
   * @see #getActionsDecl()
   * @generated
   */
  EReference getActionsDecl_Actions();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Action <em>Action</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Action</em>'.
   * @see br.ufpe.cin.tupi.Action
   * @generated
   */
  EClass getAction();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.Action#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.Action#getName()
   * @see #getAction()
   * @generated
   */
  EAttribute getAction_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Action#getVariableListDecl <em>Variable List Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Variable List Decl</em>'.
   * @see br.ufpe.cin.tupi.Action#getVariableListDecl()
   * @see #getAction()
   * @generated
   */
  EReference getAction_VariableListDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Action#getBlock <em>Block</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Block</em>'.
   * @see br.ufpe.cin.tupi.Action#getBlock()
   * @see #getAction()
   * @generated
   */
  EReference getAction_Block();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.TriggerEvent <em>Trigger Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Trigger Event</em>'.
   * @see br.ufpe.cin.tupi.TriggerEvent
   * @generated
   */
  EClass getTriggerEvent();

  /**
   * Returns the meta object for the reference '{@link br.ufpe.cin.tupi.TriggerEvent#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Event</em>'.
   * @see br.ufpe.cin.tupi.TriggerEvent#getEvent()
   * @see #getTriggerEvent()
   * @generated
   */
  EReference getTriggerEvent_Event();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.TriggerEvent#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see br.ufpe.cin.tupi.TriggerEvent#getParameters()
   * @see #getTriggerEvent()
   * @generated
   */
  EReference getTriggerEvent_Parameters();

  /**
   * Returns the meta object for the reference '{@link br.ufpe.cin.tupi.TriggerEvent#getMachine <em>Machine</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Machine</em>'.
   * @see br.ufpe.cin.tupi.TriggerEvent#getMachine()
   * @see #getTriggerEvent()
   * @generated
   */
  EReference getTriggerEvent_Machine();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.GuardsDecl <em>Guards Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guards Decl</em>'.
   * @see br.ufpe.cin.tupi.GuardsDecl
   * @generated
   */
  EClass getGuardsDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.GuardsDecl#getGuards <em>Guards</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Guards</em>'.
   * @see br.ufpe.cin.tupi.GuardsDecl#getGuards()
   * @see #getGuardsDecl()
   * @generated
   */
  EReference getGuardsDecl_Guards();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Guard <em>Guard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Guard</em>'.
   * @see br.ufpe.cin.tupi.Guard
   * @generated
   */
  EClass getGuard();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.Guard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.Guard#getName()
   * @see #getGuard()
   * @generated
   */
  EAttribute getGuard_Name();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Guard#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see br.ufpe.cin.tupi.Guard#getExpr()
   * @see #getGuard()
   * @generated
   */
  EReference getGuard_Expr();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.MemoryDecl <em>Memory Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory Decl</em>'.
   * @see br.ufpe.cin.tupi.MemoryDecl
   * @generated
   */
  EClass getMemoryDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.MemoryDecl#getMemories <em>Memories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Memories</em>'.
   * @see br.ufpe.cin.tupi.MemoryDecl#getMemories()
   * @see #getMemoryDecl()
   * @generated
   */
  EReference getMemoryDecl_Memories();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Memory <em>Memory</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Memory</em>'.
   * @see br.ufpe.cin.tupi.Memory
   * @generated
   */
  EClass getMemory();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Memory#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see br.ufpe.cin.tupi.Memory#getType()
   * @see #getMemory()
   * @generated
   */
  EReference getMemory_Type();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.Memory#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.Memory#getName()
   * @see #getMemory()
   * @generated
   */
  EAttribute getMemory_Name();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see br.ufpe.cin.tupi.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.Type#getTypeRef <em>Type Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type Ref</em>'.
   * @see br.ufpe.cin.tupi.Type#getTypeRef()
   * @see #getType()
   * @generated
   */
  EReference getType_TypeRef();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.StateDecl <em>State Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State Decl</em>'.
   * @see br.ufpe.cin.tupi.StateDecl
   * @generated
   */
  EClass getStateDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.StateDecl#getStates <em>States</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>States</em>'.
   * @see br.ufpe.cin.tupi.StateDecl#getStates()
   * @see #getStateDecl()
   * @generated
   */
  EReference getStateDecl_States();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.State <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>State</em>'.
   * @see br.ufpe.cin.tupi.State
   * @generated
   */
  EClass getState();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.State#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.State#getName()
   * @see #getState()
   * @generated
   */
  EAttribute getState_Name();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.VariableListDecl <em>Variable List Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable List Decl</em>'.
   * @see br.ufpe.cin.tupi.VariableListDecl
   * @generated
   */
  EClass getVariableListDecl();

  /**
   * Returns the meta object for the containment reference list '{@link br.ufpe.cin.tupi.VariableListDecl#getVariablesDecl <em>Variables Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Variables Decl</em>'.
   * @see br.ufpe.cin.tupi.VariableListDecl#getVariablesDecl()
   * @see #getVariableListDecl()
   * @generated
   */
  EReference getVariableListDecl_VariablesDecl();

  /**
   * Returns the meta object for class '{@link br.ufpe.cin.tupi.VariableDecl <em>Variable Decl</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Variable Decl</em>'.
   * @see br.ufpe.cin.tupi.VariableDecl
   * @generated
   */
  EClass getVariableDecl();

  /**
   * Returns the meta object for the containment reference '{@link br.ufpe.cin.tupi.VariableDecl#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see br.ufpe.cin.tupi.VariableDecl#getType()
   * @see #getVariableDecl()
   * @generated
   */
  EReference getVariableDecl_Type();

  /**
   * Returns the meta object for the attribute '{@link br.ufpe.cin.tupi.VariableDecl#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see br.ufpe.cin.tupi.VariableDecl#getName()
   * @see #getVariableDecl()
   * @generated
   */
  EAttribute getVariableDecl_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TupiFactory getTupiFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.ModelImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Namespace</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__NAMESPACE = eINSTANCE.getModel_Namespace();

    /**
     * The meta object literal for the '<em><b>Use</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__USE = eINSTANCE.getModel_Use();

    /**
     * The meta object literal for the '<em><b>Machines</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__MACHINES = eINSTANCE.getModel_Machines();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.NameSpaceImpl <em>Name Space</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.NameSpaceImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getNameSpace()
     * @generated
     */
    EClass NAME_SPACE = eINSTANCE.getNameSpace();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NAME_SPACE__NAME = eINSTANCE.getNameSpace_Name();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.UseDeclImpl <em>Use Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.UseDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getUseDecl()
     * @generated
     */
    EClass USE_DECL = eINSTANCE.getUseDecl();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute USE_DECL__IMPORTED_NAMESPACE = eINSTANCE.getUseDecl_ImportedNamespace();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.MachineDeclImpl <em>Machine Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.MachineDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMachineDecl()
     * @generated
     */
    EClass MACHINE_DECL = eINSTANCE.getMachineDecl();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MACHINE_DECL__NAME = eINSTANCE.getMachineDecl_Name();

    /**
     * The meta object literal for the '<em><b>Super Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_DECL__SUPER_TYPE = eINSTANCE.getMachineDecl_SuperType();

    /**
     * The meta object literal for the '<em><b>Body</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_DECL__BODY = eINSTANCE.getMachineDecl_Body();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.MachineBodyImpl <em>Machine Body</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.MachineBodyImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMachineBody()
     * @generated
     */
    EClass MACHINE_BODY = eINSTANCE.getMachineBody();

    /**
     * The meta object literal for the '<em><b>Memories Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__MEMORIES_DECL = eINSTANCE.getMachineBody_MemoriesDecl();

    /**
     * The meta object literal for the '<em><b>States Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__STATES_DECL = eINSTANCE.getMachineBody_StatesDecl();

    /**
     * The meta object literal for the '<em><b>Guards Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__GUARDS_DECL = eINSTANCE.getMachineBody_GuardsDecl();

    /**
     * The meta object literal for the '<em><b>Actions Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__ACTIONS_DECL = eINSTANCE.getMachineBody_ActionsDecl();

    /**
     * The meta object literal for the '<em><b>Events Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MACHINE_BODY__EVENTS_DECL = eINSTANCE.getMachineBody_EventsDecl();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.EventsDeclImpl <em>Events Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.EventsDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getEventsDecl()
     * @generated
     */
    EClass EVENTS_DECL = eINSTANCE.getEventsDecl();

    /**
     * The meta object literal for the '<em><b>Events</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENTS_DECL__EVENTS = eINSTANCE.getEventsDecl_Events();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.EventImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EVENT__NAME = eINSTANCE.getEvent_Name();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PARAMETERS = eINSTANCE.getEvent_Parameters();

    /**
     * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__TRANSITIONS = eINSTANCE.getEvent_Transitions();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.TransitionImpl <em>Transition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.TransitionImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getTransition()
     * @generated
     */
    EClass TRANSITION = eINSTANCE.getTransition();

    /**
     * The meta object literal for the '<em><b>Origin States</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TRANSITION__ORIGIN_STATES = eINSTANCE.getTransition_OriginStates();

    /**
     * The meta object literal for the '<em><b>Dest State</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__DEST_STATE = eINSTANCE.getTransition_DestState();

    /**
     * The meta object literal for the '<em><b>Guard</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

    /**
     * The meta object literal for the '<em><b>Action</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__ACTION = eINSTANCE.getTransition_Action();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__PARAMETERS = eINSTANCE.getTransition_Parameters();

    /**
     * The meta object literal for the '<em><b>Triggers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRANSITION__TRIGGERS = eINSTANCE.getTransition_Triggers();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.ActionsDeclImpl <em>Actions Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.ActionsDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getActionsDecl()
     * @generated
     */
    EClass ACTIONS_DECL = eINSTANCE.getActionsDecl();

    /**
     * The meta object literal for the '<em><b>Actions</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTIONS_DECL__ACTIONS = eINSTANCE.getActionsDecl_Actions();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.ActionImpl <em>Action</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.ActionImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getAction()
     * @generated
     */
    EClass ACTION = eINSTANCE.getAction();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

    /**
     * The meta object literal for the '<em><b>Variable List Decl</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__VARIABLE_LIST_DECL = eINSTANCE.getAction_VariableListDecl();

    /**
     * The meta object literal for the '<em><b>Block</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ACTION__BLOCK = eINSTANCE.getAction_Block();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.TriggerEventImpl <em>Trigger Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.TriggerEventImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getTriggerEvent()
     * @generated
     */
    EClass TRIGGER_EVENT = eINSTANCE.getTriggerEvent();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_EVENT__EVENT = eINSTANCE.getTriggerEvent_Event();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_EVENT__PARAMETERS = eINSTANCE.getTriggerEvent_Parameters();

    /**
     * The meta object literal for the '<em><b>Machine</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TRIGGER_EVENT__MACHINE = eINSTANCE.getTriggerEvent_Machine();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.GuardsDeclImpl <em>Guards Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.GuardsDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getGuardsDecl()
     * @generated
     */
    EClass GUARDS_DECL = eINSTANCE.getGuardsDecl();

    /**
     * The meta object literal for the '<em><b>Guards</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARDS_DECL__GUARDS = eINSTANCE.getGuardsDecl_Guards();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.GuardImpl <em>Guard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.GuardImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getGuard()
     * @generated
     */
    EClass GUARD = eINSTANCE.getGuard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GUARD__NAME = eINSTANCE.getGuard_Name();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GUARD__EXPR = eINSTANCE.getGuard_Expr();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.MemoryDeclImpl <em>Memory Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.MemoryDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMemoryDecl()
     * @generated
     */
    EClass MEMORY_DECL = eINSTANCE.getMemoryDecl();

    /**
     * The meta object literal for the '<em><b>Memories</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORY_DECL__MEMORIES = eINSTANCE.getMemoryDecl_Memories();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.MemoryImpl <em>Memory</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.MemoryImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getMemory()
     * @generated
     */
    EClass MEMORY = eINSTANCE.getMemory();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MEMORY__TYPE = eINSTANCE.getMemory_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MEMORY__NAME = eINSTANCE.getMemory_Name();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.TypeImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Type Ref</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__TYPE_REF = eINSTANCE.getType_TypeRef();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.StateDeclImpl <em>State Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.StateDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getStateDecl()
     * @generated
     */
    EClass STATE_DECL = eINSTANCE.getStateDecl();

    /**
     * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STATE_DECL__STATES = eINSTANCE.getStateDecl_States();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.StateImpl <em>State</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.StateImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getState()
     * @generated
     */
    EClass STATE = eINSTANCE.getState();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STATE__NAME = eINSTANCE.getState_Name();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.VariableListDeclImpl <em>Variable List Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.VariableListDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getVariableListDecl()
     * @generated
     */
    EClass VARIABLE_LIST_DECL = eINSTANCE.getVariableListDecl();

    /**
     * The meta object literal for the '<em><b>Variables Decl</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_LIST_DECL__VARIABLES_DECL = eINSTANCE.getVariableListDecl_VariablesDecl();

    /**
     * The meta object literal for the '{@link br.ufpe.cin.tupi.impl.VariableDeclImpl <em>Variable Decl</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see br.ufpe.cin.tupi.impl.VariableDeclImpl
     * @see br.ufpe.cin.tupi.impl.TupiPackageImpl#getVariableDecl()
     * @generated
     */
    EClass VARIABLE_DECL = eINSTANCE.getVariableDecl();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VARIABLE_DECL__TYPE = eINSTANCE.getVariableDecl_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VARIABLE_DECL__NAME = eINSTANCE.getVariableDecl_Name();

  }

} //TupiPackage
