package br.ufpe.cin.scoping;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.xbase.lib.InputOutput;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.Guard;
import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.Model;
import br.ufpe.cin.tupi.State;

public class TupiQNP extends DefaultDeclarativeQualifiedNameProvider {

	// providing of local visibility for "ForStmt" variables
	QualifiedName qualifiedName(Event event) {
		return QualifiedName.create(event.getName());
	}
	QualifiedName qualifiedName(Action action) {
		return QualifiedName.create(action.getName());
	}
	QualifiedName qualifiedName(Guard guard) {
		return QualifiedName.create(guard.getName());
	}
	
	QualifiedName qualifiedName(State state){
		return QualifiedName.create(state.getName());
	}

	QualifiedName qualifiedName(MachineDecl machine){
		Model rootContainer = (Model) EcoreUtil2.getRootContainer(machine);
		String machineQN = rootContainer.getNamespace().getName() + "."+ machine.getName();
		InputOutput.println("machine qn: " + machineQN);
		
		return QualifiedName.create(machineQN.split("\\."));
	}
}
