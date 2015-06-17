package br.ufpe.cin.jvmmodel;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.ActionsDecl;
import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.EventsDecl;
import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.GuardsDecl;
import br.ufpe.cin.tupi.MachineBody;
import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.Memory;
import br.ufpe.cin.tupi.MemoryDecl;
import br.ufpe.cin.tupi.NameSpace;
import br.ufpe.cin.tupi.State;
import br.ufpe.cin.tupi.StateDecl;
import br.ufpe.cin.tupi.Transition;
import br.ufpe.cin.tupi.TriggerEvent;
import br.ufpe.cin.tupi.Type;
import br.ufpe.cin.tupi.UseDecl;
import br.ufpe.cin.tupi.VariableDecl;
import br.ufpe.cin.tupi.VariableListDecl;
import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.google.inject.Provider;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtend2.lib.StringConcatenationClient;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmField;
import org.eclipse.xtext.common.types.JvmFormalParameter;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.JvmVisibility;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext;
import org.eclipse.xtext.xbase.interpreter.IEvaluationResult;
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter;
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

/**
 * <p>Infers a JVM model from the source model.</p>
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>
 */
@SuppressWarnings("all")
public class TupiJvmModelInferrer extends AbstractModelInferrer {
  /**
   * convenience API to build and initialize JVM types and their members.
   */
  @Inject
  private XbaseInterpreter xbaseInterpreter;
  
  @Inject
  private Provider<IEvaluationContext> contextProvider;
  
  @Inject
  @Extension
  private JvmTypesBuilder _jvmTypesBuilder;
  
  /**
   * The dispatch method {@code infer} is called for each instance of the
   * given element's type that is contained in a resource.
   * 
   * @param element
   *            the model to create one or more
   *            {@link JvmDeclaredType declared
   *            types} from.
   * @param acceptor
   *            each created
   *            {@link JvmDeclaredType type}
   *            without a container should be passed to the acceptor in order
   *            get attached to the current resource. The acceptor's
   *            {@link IJvmDeclaredTypeAcceptor#accept(org.eclipse.xtext.common.types.JvmDeclaredType)
   *            accept(..)} method takes the constructed empty type for the
   *            pre-indexing phase. This one is further initialized in the
   *            indexing phase using the closure you pass to the returned
   *            {@link IPostIndexingInitializing#initializeLater(org.eclipse.xtext.xbase.lib.Procedures.Procedure1)
   *            initializeLater(..)}.
   * @param isPreIndexingPhase
   *            whether the method is called in a pre-indexing phase, i.e.
   *            when the global index is not yet fully updated. You must not
   *            rely on linking using the index if isPreIndexingPhase is
   *            <code>true</code>.
   */
  private final StringBuffer namespaceStr = new StringBuffer();
  
  protected void _infer(final MachineDecl machine, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    final String className = machine.getName();
    String _plus = (this.namespaceStr + ".");
    String _plus_1 = (_plus + className);
    JvmGenericType _class = this._jvmTypesBuilder.toClass(machine, _plus_1);
    final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
      @Override
      public void apply(final JvmGenericType it) {
        Type _superType = machine.getSuperType();
        boolean _notEquals = (!Objects.equal(_superType, null));
        if (_notEquals) {
          EList<JvmTypeReference> _superTypes = it.getSuperTypes();
          Type _superType_1 = machine.getSuperType();
          JvmTypeReference _typeRef = _superType_1.getTypeRef();
          TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmTypeReference>operator_add(_superTypes, _typeRef);
        } else {
          MachineBody _body = machine.getBody();
          final StateDecl statesDecl = _body.getStatesDecl();
          boolean _notEquals_1 = (!Objects.equal(statesDecl, null));
          if (_notEquals_1) {
            EList<JvmMember> _members = it.getMembers();
            JvmTypeReference _typeRef_1 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(List.class);
            final Procedure1<JvmField> _function = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("new ");
                    JvmTypeReference _typeRef = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(ArrayList.class);
                    _builder.append(_typeRef, "");
                    _builder.append("()");
                  }
                };
                TupiJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _client);
                it.setVisibility(JvmVisibility.PROTECTED);
              }
            };
            JvmField _field = TupiJvmModelInferrer.this._jvmTypesBuilder.toField(machine, "_states", _typeRef_1, _function);
            TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members, _field);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmTypeReference _typeRef_2 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
            final Procedure1<JvmField> _function_1 = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("\"\"");
                  }
                };
                TupiJvmModelInferrer.this._jvmTypesBuilder.setInitializer(it, _client);
                it.setVisibility(JvmVisibility.PROTECTED);
              }
            };
            JvmField _field_1 = TupiJvmModelInferrer.this._jvmTypesBuilder.toField(machine, "_currentState", _typeRef_2, _function_1);
            TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_1, _field_1);
            EList<JvmMember> _members_2 = it.getMembers();
            JvmTypeReference _typeRef_3 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
            final Procedure1<JvmOperation> _function_2 = new Procedure1<JvmOperation>() {
              @Override
              public void apply(final JvmOperation it) {
                EList<JvmFormalParameter> _parameters = it.getParameters();
                JvmTypeReference _typeRef = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                JvmTypeReference _addArrayTypeDimension = TupiJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef);
                JvmFormalParameter _parameter = TupiJvmModelInferrer.this._jvmTypesBuilder.toParameter(machine, "statesToMatch", _addArrayTypeDimension);
                TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                it.setVisibility(JvmVisibility.PRIVATE);
                it.setVarArgs(true);
                StringConcatenationClient _client = new StringConcatenationClient() {
                  @Override
                  protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                    _builder.append("boolean matched = false;");
                    _builder.newLine();
                    _builder.append("if(statesToMatch!=null){");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("boolean newMatched = false;");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("for(String s : statesToMatch){");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("if(s.equals(\"*\")){ ");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("newMatched = true; ");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("}else if(s.startsWith(\"*\")){");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("if(s.endsWith(\"*\")){");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("newMatched = _currentState.contains(s); ");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("}else{");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("newMatched = _currentState.endsWith(s.substring(1));\t");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("}\t");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("}else{");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("if(s.endsWith(\"*\")){");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("newMatched = _currentState.startsWith(s.substring(0, s.length()-1));\t");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("}else{");
                    _builder.newLine();
                    _builder.append("\t\t\t\t");
                    _builder.append("newMatched = _currentState.equals(s);\t");
                    _builder.newLine();
                    _builder.append("\t\t\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("matched = matched || newMatched;");
                    _builder.newLine();
                    _builder.append("\t\t");
                    _builder.append("//matched = matched || java.util.regex.Pattern.matches(s, _currentState);");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("}else{");
                    _builder.newLine();
                    _builder.append("\t");
                    _builder.append("matched = true; //Class not yet initialized");
                    _builder.newLine();
                    _builder.append("}");
                    _builder.newLine();
                    _builder.append("return matched;");
                    _builder.newLine();
                  }
                };
                TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
              }
            };
            JvmOperation _method = TupiJvmModelInferrer.this._jvmTypesBuilder.toMethod(machine, "_match", _typeRef_3, _function_2);
            TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_2, _method);
          }
        }
        MachineBody _body_1 = machine.getBody();
        final MemoryDecl memoryDecl = _body_1.getMemoriesDecl();
        boolean _notEquals_2 = (!Objects.equal(memoryDecl, null));
        if (_notEquals_2) {
          EList<Memory> _memories = memoryDecl.getMemories();
          for (final Memory memory : _memories) {
            EList<JvmMember> _members_3 = it.getMembers();
            String _name = memory.getName();
            Type _type = memory.getType();
            JvmTypeReference _typeRef_4 = _type.getTypeRef();
            final Procedure1<JvmField> _function_3 = new Procedure1<JvmField>() {
              @Override
              public void apply(final JvmField it) {
                it.setVisibility(JvmVisibility.PUBLIC);
              }
            };
            JvmField _field_2 = TupiJvmModelInferrer.this._jvmTypesBuilder.toField(memoryDecl, _name, _typeRef_4, _function_3);
            TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmField>operator_add(_members_3, _field_2);
          }
        }
        MachineBody _body_2 = machine.getBody();
        final GuardsDecl guardsDecl = _body_2.getGuardsDecl();
        boolean _notEquals_3 = (!Objects.equal(guardsDecl, null));
        if (_notEquals_3) {
          EList<Guard> _guards = guardsDecl.getGuards();
          for (final Guard guard : _guards) {
            EList<JvmMember> _members_4 = it.getMembers();
            String _name_1 = guard.getName();
            String _plus = ("guard_" + _name_1);
            JvmTypeReference _typeRef_5 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(boolean.class);
            final Procedure1<JvmOperation> _function_4 = new Procedure1<JvmOperation>() {
              @Override
              public void apply(final JvmOperation it) {
                it.setVisibility(JvmVisibility.PRIVATE);
                XExpression _expr = guard.getExpr();
                TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _expr);
              }
            };
            JvmOperation _method_1 = TupiJvmModelInferrer.this._jvmTypesBuilder.toMethod(guardsDecl, _plus, _typeRef_5, _function_4);
            TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_4, _method_1);
          }
        }
        MachineBody _body_3 = machine.getBody();
        final EventsDecl eventsDecl = _body_3.getEventsDecl();
        boolean _notEquals_4 = (!Objects.equal(eventsDecl, null));
        if (_notEquals_4) {
          EList<Event> _events = eventsDecl.getEvents();
          for (final Event event : _events) {
            {
              final Function1<EList<XExpression>, CharSequence> _function_5 = new Function1<EList<XExpression>, CharSequence>() {
                @Override
                public CharSequence apply(final EList<XExpression> parameters) {
                  StringConcatenation _builder = new StringConcatenation();
                  {
                    boolean _hasElements = false;
                    for(final XExpression param : parameters) {
                      if (!_hasElements) {
                        _hasElements = true;
                      } else {
                        _builder.appendImmediate(",", "");
                      }
                      _builder.newLineIfNotEmpty();
                      Object _xtrycatchfinallyexpression = null;
                      try {
                        IEvaluationResult _evaluate = TupiJvmModelInferrer.this.xbaseInterpreter.evaluate(param);
                        _xtrycatchfinallyexpression = _evaluate.getResult();
                      } catch (final Throwable _t) {
                        if (_t instanceof Exception) {
                          final Exception e = (Exception)_t;
                          _xtrycatchfinallyexpression = param;
                        } else {
                          throw Exceptions.sneakyThrow(_t);
                        }
                      }
                      _builder.append(_xtrycatchfinallyexpression, "");
                    }
                  }
                  return _builder;
                }
              };
              final Function1<EList<XExpression>, CharSequence> getParameters = _function_5;
              final Function1<EList<Transition>, CharSequence> _function_6 = new Function1<EList<Transition>, CharSequence>() {
                @Override
                public CharSequence apply(final EList<Transition> transitions) {
                  StringConcatenation _builder = new StringConcatenation();
                  {
                    for(final Transition transition : transitions) {
                      _builder.append("if(_match(");
                      EList<String> _originStates = transition.getOriginStates();
                      final Function1<String, String> _function = new Function1<String, String>() {
                        @Override
                        public String apply(final String x) {
                          return (("\"" + x) + "\"");
                        }
                      };
                      List<String> _map = ListExtensions.<String, String>map(_originStates, _function);
                      final Function2<String, String, String> _function_1 = new Function2<String, String, String>() {
                        @Override
                        public String apply(final String a, final String b) {
                          return ((a + ", ") + b);
                        }
                      };
                      String _reduce = IterableExtensions.<String>reduce(_map, _function_1);
                      _builder.append(_reduce, "");
                      _builder.append(")){");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t");
                      _builder.append("if(guard_");
                      Guard _guard = transition.getGuard();
                      String _name = _guard.getName();
                      _builder.append(_name, "\t");
                      _builder.append("()){");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("action_");
                      Action _action = transition.getAction();
                      String _name_1 = _action.getName();
                      _builder.append(_name_1, "\t\t");
                      _builder.append("(");
                      EList<XExpression> _parameters = transition.getParameters();
                      CharSequence _apply = getParameters.apply(_parameters);
                      _builder.append(_apply, "\t\t");
                      _builder.append(");");
                      _builder.newLineIfNotEmpty();
                      _builder.append("\t\t");
                      _builder.append("_currentState=\"");
                      State _destState = transition.getDestState();
                      String _name_2 = _destState.getName();
                      _builder.append(_name_2, "\t\t");
                      _builder.append("\";");
                      _builder.newLineIfNotEmpty();
                      {
                        EList<TriggerEvent> _triggers = transition.getTriggers();
                        boolean _notEquals = (!Objects.equal(_triggers, null));
                        if (_notEquals) {
                          {
                            EList<TriggerEvent> _triggers_1 = transition.getTriggers();
                            for(final TriggerEvent trigger : _triggers_1) {
                              {
                                Event _event = trigger.getEvent();
                                boolean _notEquals_1 = (!Objects.equal(_event, null));
                                if (_notEquals_1) {
                                  {
                                    Event _event_1 = trigger.getEvent();
                                    String _name_3 = _event_1.getName();
                                    String _lowerCase = _name_3.toLowerCase();
                                    boolean _equals = _lowerCase.equals("start");
                                    if (_equals) {
                                      _builder.append("\t\t");
                                      Memory _machine = trigger.getMachine();
                                      String _name_4 = _machine.getName();
                                      _builder.append(_name_4, "\t\t");
                                      _builder.append(" = new ");
                                      Memory _machine_1 = trigger.getMachine();
                                      Type _type = _machine_1.getType();
                                      JvmTypeReference _typeRef = _type.getTypeRef();
                                      String _simpleName = _typeRef.getSimpleName();
                                      _builder.append(_simpleName, "\t\t");
                                      _builder.append(" (");
                                      EList<XExpression> _parameters_1 = trigger.getParameters();
                                      CharSequence _apply_1 = getParameters.apply(_parameters_1);
                                      _builder.append(_apply_1, "\t\t");
                                      _builder.append("); ");
                                      _builder.newLineIfNotEmpty();
                                    } else {
                                      _builder.append("\t\t");
                                      String _xifexpression = null;
                                      Memory _machine_2 = trigger.getMachine();
                                      boolean _notEquals_2 = (!Objects.equal(_machine_2, null));
                                      if (_notEquals_2) {
                                        Memory _machine_3 = trigger.getMachine();
                                        String _name_5 = _machine_3.getName();
                                        _xifexpression = (_name_5 + ".");
                                      }
                                      _builder.append(_xifexpression, "\t\t");
                                      _builder.append(" ");
                                      Event _event_2 = trigger.getEvent();
                                      String _name_6 = _event_2.getName();
                                      _builder.append(_name_6, "\t\t");
                                      _builder.append(" (");
                                      EList<XExpression> _parameters_2 = trigger.getParameters();
                                      CharSequence _apply_2 = getParameters.apply(_parameters_2);
                                      _builder.append(_apply_2, "\t\t");
                                      _builder.append(");");
                                      _builder.newLineIfNotEmpty();
                                    }
                                  }
                                }
                              }
                              _builder.append("\t\t");
                              _builder.newLine();
                            }
                          }
                        }
                      }
                      _builder.append("\t\t");
                      _builder.append("return;");
                      _builder.newLine();
                      _builder.append("\t");
                      _builder.append("}");
                      _builder.newLine();
                      _builder.append("}");
                      _builder.newLine();
                      _builder.newLine();
                    }
                  }
                  return _builder;
                }
              };
              final Function1<EList<Transition>, CharSequence> getEventBody = _function_6;
              String _name_2 = event.getName();
              String _lowerCase = _name_2.toLowerCase();
              boolean _equals = _lowerCase.equals("start");
              if (_equals) {
                String _lowerCase_1 = className.toLowerCase();
                boolean _equals_1 = _lowerCase_1.equals("main");
                if (_equals_1) {
                  EList<JvmMember> _members_5 = it.getMembers();
                  JvmTypeReference _typeRef_6 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                  final Procedure1<JvmOperation> _function_7 = new Procedure1<JvmOperation>() {
                    @Override
                    public void apply(final JvmOperation it) {
                      it.setStatic(true);
                      EList<JvmFormalParameter> _parameters = it.getParameters();
                      JvmTypeReference _typeRef = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(String.class);
                      JvmTypeReference _addArrayTypeDimension = TupiJvmModelInferrer.this._jvmTypesBuilder.addArrayTypeDimension(_typeRef);
                      JvmFormalParameter _parameter = TupiJvmModelInferrer.this._jvmTypesBuilder.toParameter(eventsDecl, "args", _addArrayTypeDimension);
                      TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                      StringConcatenationClient _client = new StringConcatenationClient() {
                        @Override
                        protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                          _builder.append("new ");
                          _builder.append(className, "");
                          _builder.append(" ();");
                        }
                      };
                      TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                    }
                  };
                  JvmOperation _method_2 = TupiJvmModelInferrer.this._jvmTypesBuilder.toMethod(eventsDecl, "main", _typeRef_6, _function_7);
                  TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_2);
                }
                EList<JvmMember> _members_6 = it.getMembers();
                final Procedure1<JvmConstructor> _function_8 = new Procedure1<JvmConstructor>() {
                  @Override
                  public void apply(final JvmConstructor it) {
                    VariableListDecl _parameters = null;
                    if (event!=null) {
                      _parameters=event.getParameters();
                    }
                    EList<VariableDecl> _variablesDecl = null;
                    if (_parameters!=null) {
                      _variablesDecl=_parameters.getVariablesDecl();
                    }
                    final EList<VariableDecl> variables = _variablesDecl;
                    boolean _notEquals = (!Objects.equal(variables, null));
                    if (_notEquals) {
                      for (final VariableDecl param : variables) {
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        String _name = param.getName();
                        Type _type = param.getType();
                        JvmTypeReference _typeRef = _type.getTypeRef();
                        JvmFormalParameter _parameter = TupiJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _typeRef);
                        TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                      }
                    }
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        {
                          Type _superType = machine.getSuperType();
                          boolean _notEquals = (!Objects.equal(_superType, null));
                          if (_notEquals) {
                            _builder.append("super(");
                            String _xifexpression = null;
                            VariableListDecl _parameters = event.getParameters();
                            boolean _notEquals_1 = (!Objects.equal(_parameters, null));
                            if (_notEquals_1) {
                              VariableListDecl _parameters_1 = event.getParameters();
                              EList<VariableDecl> _variablesDecl = _parameters_1.getVariablesDecl();
                              _xifexpression = IterableExtensions.join(_variablesDecl, ",");
                            }
                            _builder.append(_xifexpression, "");
                            _builder.append(");");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        {
                          MachineBody _body = machine.getBody();
                          StateDecl _statesDecl = _body.getStatesDecl();
                          EList<State> _states = _statesDecl.getStates();
                          for(final State state : _states) {
                            _builder.append("_states.add(\"");
                            String _name = state.getName();
                            _builder.append(_name, "");
                            _builder.append("\");");
                            _builder.newLineIfNotEmpty();
                          }
                        }
                        EList<Transition> _transitions = event.getTransitions();
                        CharSequence _apply = getEventBody.apply(_transitions);
                        _builder.append(_apply, "");
                      }
                    };
                    TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmConstructor _constructor = TupiJvmModelInferrer.this._jvmTypesBuilder.toConstructor(eventsDecl, _function_8);
                TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmConstructor>operator_add(_members_6, _constructor);
              } else {
                EList<JvmMember> _members_7 = it.getMembers();
                String _name_3 = event.getName();
                JvmTypeReference _typeRef_7 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
                final Procedure1<JvmOperation> _function_9 = new Procedure1<JvmOperation>() {
                  @Override
                  public void apply(final JvmOperation it) {
                    VariableListDecl _parameters = null;
                    if (event!=null) {
                      _parameters=event.getParameters();
                    }
                    EList<VariableDecl> _variablesDecl = null;
                    if (_parameters!=null) {
                      _variablesDecl=_parameters.getVariablesDecl();
                    }
                    final EList<VariableDecl> variables = _variablesDecl;
                    boolean _notEquals = (!Objects.equal(variables, null));
                    if (_notEquals) {
                      for (final VariableDecl param : variables) {
                        EList<JvmFormalParameter> _parameters_1 = it.getParameters();
                        String _name = param.getName();
                        Type _type = param.getType();
                        JvmTypeReference _typeRef = _type.getTypeRef();
                        JvmFormalParameter _parameter = TupiJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _typeRef);
                        TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters_1, _parameter);
                      }
                    }
                    StringConcatenationClient _client = new StringConcatenationClient() {
                      @Override
                      protected void appendTo(StringConcatenationClient.TargetStringConcatenation _builder) {
                        EList<Transition> _transitions = event.getTransitions();
                        CharSequence _apply = getEventBody.apply(_transitions);
                        _builder.append(_apply, "");
                        _builder.newLineIfNotEmpty();
                      }
                    };
                    TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _client);
                  }
                };
                JvmOperation _method_3 = TupiJvmModelInferrer.this._jvmTypesBuilder.toMethod(eventsDecl, _name_3, _typeRef_7, _function_9);
                TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_7, _method_3);
              }
            }
          }
        }
        MachineBody _body_4 = machine.getBody();
        final ActionsDecl actionsDecl = _body_4.getActionsDecl();
        EList<Action> _actions = actionsDecl.getActions();
        for (final Action action : _actions) {
          EList<JvmMember> _members_5 = it.getMembers();
          String _name_2 = action.getName();
          String _plus_1 = ("action_" + _name_2);
          JvmTypeReference _typeRef_6 = TupiJvmModelInferrer.this._typeReferenceBuilder.typeRef(void.class);
          final Procedure1<JvmOperation> _function_5 = new Procedure1<JvmOperation>() {
            @Override
            public void apply(final JvmOperation it) {
              VariableListDecl _variableListDecl = null;
              if (action!=null) {
                _variableListDecl=action.getVariableListDecl();
              }
              EList<VariableDecl> _variablesDecl = null;
              if (_variableListDecl!=null) {
                _variablesDecl=_variableListDecl.getVariablesDecl();
              }
              final EList<VariableDecl> variables = _variablesDecl;
              it.setVisibility(JvmVisibility.PRIVATE);
              XExpression _block = action.getBlock();
              TupiJvmModelInferrer.this._jvmTypesBuilder.setBody(it, _block);
              boolean _notEquals = (!Objects.equal(variables, null));
              if (_notEquals) {
                for (final VariableDecl param : variables) {
                  EList<JvmFormalParameter> _parameters = it.getParameters();
                  String _name = param.getName();
                  Type _type = param.getType();
                  JvmTypeReference _typeRef = _type.getTypeRef();
                  JvmFormalParameter _parameter = TupiJvmModelInferrer.this._jvmTypesBuilder.toParameter(param, _name, _typeRef);
                  TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmFormalParameter>operator_add(_parameters, _parameter);
                }
              }
            }
          };
          JvmOperation _method_2 = TupiJvmModelInferrer.this._jvmTypesBuilder.toMethod(actionsDecl, _plus_1, _typeRef_6, _function_5);
          TupiJvmModelInferrer.this._jvmTypesBuilder.<JvmOperation>operator_add(_members_5, _method_2);
        }
      }
    };
    acceptor.<JvmGenericType>accept(_class, _function);
  }
  
  protected void _infer(final NameSpace namespace, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    String _name = namespace.getName();
    this.namespaceStr.append(_name);
    super.infer(namespace, acceptor, isPreIndexingPhase);
  }
  
  protected void _infer(final UseDecl use, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    super.infer(use, acceptor, isPreIndexingPhase);
  }
  
  public void infer(final EObject machine, final IJvmDeclaredTypeAcceptor acceptor, final boolean isPreIndexingPhase) {
    if (machine instanceof MachineDecl) {
      _infer((MachineDecl)machine, acceptor, isPreIndexingPhase);
      return;
    } else if (machine instanceof NameSpace) {
      _infer((NameSpace)machine, acceptor, isPreIndexingPhase);
      return;
    } else if (machine instanceof UseDecl) {
      _infer((UseDecl)machine, acceptor, isPreIndexingPhase);
      return;
    } else if (machine != null) {
      _infer(machine, acceptor, isPreIndexingPhase);
      return;
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(machine, acceptor, isPreIndexingPhase).toString());
    }
  }
}
