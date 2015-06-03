package br.ufpe.cin.jvmmodel

import br.ufpe.cin.tupi.MachineDecl
import com.google.inject.Inject
import org.eclipse.xtext.common.types.JvmDeclaredType
import org.eclipse.xtext.xbase.jvmmodel.AbstractModelInferrer
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder
import br.ufpe.cin.tupi.Model
import java.util.HashMap
import br.ufpe.cin.tupi.UseDecl
import br.ufpe.cin.tupi.NameSpace
import java.util.ArrayList
import org.eclipse.emf.common.util.EList
import br.ufpe.cin.tupi.TypeMachine

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
	val mapImports = new HashMap
	val namespaceStr = new StringBuffer

	def dispatch void infer(MachineDecl machine, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		// Here you explain how your model is mapped to Java elements, by writing the actual translation code.
		val className = machine.eResource.URI.fileExtension;
		acceptor.accept(machine.toClass(namespaceStr + "." + className), [

			val decl = machine.body.statesDecl
			for (state : decl.states) {
				members += decl.toField(state.name, typeRef(String));
			}

			val memoryDecl = machine.body.memoriesDecl;
			for (memory : memoryDecl.memories) {
				if (memory.type.typeMachine != null) {
					members+=memoryDecl.toField(memory.name, typeRef(mapImports.get(memory.type.typeMachine.name).toString))
				} else if (memory.type.typePrimitive != null) {
					members+=memoryDecl.toField(memory.name, typeRef(memory.type.typePrimitive))
				}

			}

			val actionsDecl = machine.body.actionsDecl;
			for (action : actionsDecl.actions) {
				members += actionsDecl.toMethod(action.name, typeRef(void)) [
					val variables = action?.variableListDecl?.variablesDecl

					if (variables != null) {
						for (param : variables) {
							parameters += param.toParameter(param.name, typeRef(String))
						}
						body = '''''';
					}

				]

			}
		])
	}

	def dispatch void infer(NameSpace namespace, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		namespaceStr.append(namespace.name)
		super.infer(namespace, acceptor, isPreIndexingPhase);
	}

	def dispatch void infer(UseDecl use, IJvmDeclaredTypeAcceptor acceptor, boolean isPreIndexingPhase) {
		mapImports.put(use.type.name, use.importedNamespace);
		
		super.infer(use, acceptor, isPreIndexingPhase);

		

	}
}

