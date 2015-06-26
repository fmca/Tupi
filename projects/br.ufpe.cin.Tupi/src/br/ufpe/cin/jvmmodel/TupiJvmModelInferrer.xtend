package br.ufpe.cin.jvmmodel

import br.ufpe.cin.tupi.MachineDecl
import br.ufpe.cin.tupi.NameSpace
import br.ufpe.cin.tupi.Transition
import br.ufpe.cin.tupi.UseDecl
import com.google.inject.Inject
import com.google.inject.Provider
import java.util.ArrayList
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.common.types.JvmVisibility
import org.eclipse.xtext.naming.IQualifiedNameProvider
import org.eclipse.xtext.xbase.XExpression
import org.eclipse.xtext.xbase.interpreter.IEvaluationContext
import org.eclipse.xtext.xbase.interpreter.impl.XbaseInterpreter
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder

/**
 * <p>Infers a JVM model from the source model.</p> 	
 * 
 * <p>The JVM model should contain all elements that would appear in the Java code 
 * which is generated from the source model. Other models link against the JVM model rather than the source model.</p>     
 */
class TupiJvmModelInferrer extends AbstractModelInferrer {

	/**
	 * convenience API to build and initialize JVM types and their members.
	 */
	@Inject private XbaseInterpreter xbaseInterpreter;
	@Inject private IQualifiedNameProvider qualifiedNameProvider;
	@Inject private Provider<IEvaluationContext> contextProvider;
	@Inject extension JvmTypesBuilder

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
	val namespaceStr = new StringBuffer

	def dispatch void infer(MachineDecl machine, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
		val className = machine.name
		acceptor.accept(machine.toClass(namespaceStr + "." + className), [

			if (machine.superType != null) {
				try {
					superTypes += typeRef(qualifiedNameProvider.getFullyQualifiedName(machine.superType).toString);
				} catch (Exception e) {
					e.printStackTrace
				}
			} else {
				val statesDecl = machine.body.statesDecl;
				if (statesDecl != null) {
					/*
					 * STATES
					 * 
					 */
					members += machine.toField("_states", typeRef(List)) [
						initializer = '''new «typeRef(ArrayList)»()'''
						visibility = JvmVisibility.PROTECTED
					]

					members += machine.toField("_currentState", typeRef(String)) [
						initializer = '''""'''
						visibility = JvmVisibility.PROTECTED
					]
					members += machine.toMethod("_match", typeRef(boolean)) [
						parameters += machine.toParameter("statesToMatch", typeRef(String).addArrayTypeDimension)
						visibility = JvmVisibility.PROTECTED
						varArgs = true
						body = '''
							boolean matched = false;
							if(statesToMatch!=null){
								boolean newMatched = false;
								for(String s : statesToMatch){
									if(s.equals("*")){ 
										newMatched = true; 
									}else if(s.startsWith("*")){
										if(s.endsWith("*")){
											newMatched = _currentState.contains(s); 
										}else{
											newMatched = _currentState.endsWith(s.substring(1));	
										}	
									}else{
										if(s.endsWith("*")){
											newMatched = _currentState.startsWith(s.substring(0, s.length()-1));	
										}else{
											newMatched = _currentState.equals(s);	
										}
									}
									matched = matched || newMatched;
									//matched = matched || java.util.regex.Pattern.matches(s, _currentState);
								}
							}else{
								matched = true; //Class not yet initialized
							}
							return matched;
						'''
					]

				}
			}

			/*
			 * MEMORY
			 * 
			 */
			val memoryDecl = machine.body.memoriesDecl;
			if (memoryDecl != null) {
				for (memory : memoryDecl.memories) {
					members += memoryDecl.toField(memory.name, memory.type.typeRef) [
						visibility = JvmVisibility.PUBLIC;
					]
				}
			}

			/*
			 * GUARDS
			 * 
			 */
			val guardsDecl = machine.body.guardsDecl;
			if (guardsDecl != null) {
				// TODO
				for (guard : guardsDecl.guards) {
					members += guardsDecl.toMethod("guard_" + guard.name, typeRef(boolean)) [
						visibility = JvmVisibility.PROTECTED
						body = guard.expr
					]
				}
			}

			/*
			 * EVENTS
			 * 
			 */
			val eventsDecl = machine.body.eventsDecl;
			if (eventsDecl != null) {
				for (event : eventsDecl.events) {
					val getParameters = [ EList<XExpression> parameters |
						'''«FOR param : parameters SEPARATOR ','»
												«try{
													xbaseInterpreter.evaluate(param).result
												}catch(Exception e){
													param
												}
												»«ENDFOR»'''
					]
					val getEventBody = [ EList<Transition> transitions |
						'''
							«FOR transition : transitions»
								if(_match(«transition.originStates.map[x | '"' + x + '"'].reduce[a,b| a + ', ' + b]»)){
									if(«IF transition.guard!=null»guard_«transition.guard.name»()«ELSE»true«ENDIF»){
										«IF transition.action!=null »action_«transition.action.name»(«getParameters.apply(transition.parameters)»); «ENDIF»
										_currentState="«transition.destState.name»";
										«IF transition.triggers!=null»
											«FOR trigger : transition.triggers»
												«IF trigger.event !=null »
													«IF trigger.event.name.toLowerCase.equals("start")»
														«trigger.machine.name» = new «trigger.machine.type.typeRef.simpleName» («getParameters.apply(trigger.parameters)»); 
													«ELSE»
														« if(trigger.machine != null){ trigger.machine.name + "."}» «trigger.event.name» («getParameters.apply(trigger.parameters) »);
													«ENDIF»
												«ENDIF»
												
											«ENDFOR»
										«ENDIF»
										return;
									}
								}
								
							«ENDFOR»
						'''
					]

					if (event.name.toLowerCase.equals("start")) {

						if (className.toLowerCase.equals("main")) {
							members += eventsDecl.toMethod("main", typeRef(void), [
								static = true
								parameters += eventsDecl.toParameter("args", typeRef(String).addArrayTypeDimension)
								body = '''new «className» ();'''
							])
						}
						members += eventsDecl.toConstructor [
							val variables = event?.parameters?.variablesDecl;
							if (variables != null) {
								for (param : variables) {
									parameters += param.toParameter(param.name, param.type.typeRef);
								}
							}
							body = '''
							«IF machine.superType!=null»
								super(«if(event.parameters!=null) event.parameters.variablesDecl.map[v | v.name].join(",")»);
							«ENDIF»
							«FOR state : machine.body.statesDecl.states»
								_states.add("«state.name»");
							«ENDFOR»						
							«getEventBody.apply(event.transitions)»'''
						]

					} else {
						members += eventsDecl.toMethod(event.name, typeRef(void)) [
							val variables = event?.parameters?.variablesDecl;
							if (variables != null) {
								for (param : variables) {
									parameters += param.toParameter(param.name, param.type.typeRef);
								}
							}
							body = '''			
								«getEventBody.apply(event.transitions)»
							'''
						]
					}
				}
			}

			/*
			 * ACTIONS
			 * 
			 */
			val actionsDecl = machine.body.actionsDecl;

			if (actionsDecl?.actions != null) {
				for (action : actionsDecl.actions) {
					members += actionsDecl.toMethod("action_" + action.name, typeRef(void)) [
						val variables = action?.variableListDecl?.variablesDecl
						visibility = JvmVisibility.PROTECTED
						body = action.block
						/*'''
						 * 		«FOR tupiExpr : action.block.expressions»
						 * 			«IF tupiExpr.trigger != null»
						 * 			«tupiExpr.trigger.machine.name».«tupiExpr.trigger.event»(
						 * 				«tupiExpr.trigger.parameters.join(",")»
						 * 			);
						 * 			«ELSEIF tupiExpr.xexpr != null»
						 * 				«tupiExpr.xexpr»
						 * 			«ENDIF»
						 * 		«ENDFOR»
						 '''*/
						if (variables != null) {

							for (param : variables) {
								parameters += param.toParameter(param.name, param.type.typeRef)
							}

						}

					]
				}

			}

		])
	}

	def dispatch void infer(NameSpace namespace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		namespaceStr.append(namespace.name)
		super.infer(namespace, acceptor, isPreIndexingPhase);
	}

	def dispatch void infer(UseDecl use, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		super.infer(use, acceptor, isPreIndexingPhase);

	}
/*
 * 
 * UTILS
 * 
 */
}

