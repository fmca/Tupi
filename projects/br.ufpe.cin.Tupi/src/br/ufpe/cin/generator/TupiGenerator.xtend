/*
 * generated by Xtext
 */
package br.ufpe.cin.generator

import br.ufpe.cin.tupi.MachineBody
import br.ufpe.cin.tupi.MachineDecl
import br.ufpe.cin.tupi.Model
import java.io.File
import java.util.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class TupiGenerator implements IGenerator {
	HashMap<String, MachineDeclared> mapMachine = new HashMap<String, MachineDeclared>();
	MachineDeclared machineMapped = null;
	Event eventAux = null;

	override def doGenerate(Resource resource, IFileSystemAccess fsa) {
		createFiles(resource.contents.head as Model, fsa);
		mapMachine.clear();
	// fsa.generateFile(resource.className + ".dot", toDotCode(resource.contents.head as Model))
	}

	def createFiles(Model model, IFileSystemAccess fsa) {
		if (model.machine != null) {
			machineMapped=new MachineDeclared()
			fsa.generateFile(new File(model.namespace.name.replace(".", "/"), model.machine.name + ".dot").path,
				toDotCode(model.machine))
		}

	}

	def className(Resource res) {
		var name = res.URI.lastSegment
		return name.substring(0, name.indexOf('.'))
	}

	def toDotCode(MachineDecl machine) '''
		«machine.declareMachine»
	'''

	def declareMachine(MachineDecl machine) '''
		digraph «machine.name» {
			rankdir=LR;
			
			«IF machine.superType != null»
				« try{machineMapped.heritage(machine.superType)}catch(Exception e){
					e.printStackTrace
				}»
			«ENDIF»
			«createClass(machine.body, machineMapped)»
		}
	'''

	def createClass(MachineBody body, MachineDeclared machineMapped) {

		if (body.statesDecl != null) {
			for (state : body?.statesDecl?.states) {
				if (!machineMapped.states.contains(state.name)) {
					machineMapped.states.add(state.name);
				}
			}
		}

		if (body.eventsDecl != null) {
			for (event : body?.eventsDecl?.events) {
				for (eventComp : machineMapped.events) {
					if (eventComp.name.equals(event.name)) {
						machineMapped.events.remove(eventComp);
					}
				}
				machineMapped.events.add(eventAux = new Event(event.name));
				for (trans : event?.transitions) {
					for (originState : trans?.originStates) {
						val regex = originState.replace("*", ".*");
						for (state : machineMapped.states) {
							if (state.matches(regex)) {
								eventAux.trans.add(new Transition(state, trans.destState.name, trans.guard.name));
							}
						}

					}
				}
			}
		}

		declareBody(machineMapped)

	}

	def declareBody(MachineDeclared machineMapped) {
		'''
			//states
			«FOR state : machineMapped.states»
				«state»;
			«ENDFOR»
			//edges
			«FOR event : machineMapped.events»
				«FOR tran : event?.trans»
					«tran.originState»->«tran.destState» [label="«event.name» | «tran.guard»"]; 
				«ENDFOR»
			«ENDFOR»
		'''
	}

}
