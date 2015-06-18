package br.ufpe.cin.scoping;

import org.eclipse.xtext.naming.DefaultDeclarativeQualifiedNameProvider;
import org.eclipse.xtext.naming.QualifiedName;

import br.ufpe.cin.tupi.Action;
import br.ufpe.cin.tupi.Event;
import br.ufpe.cin.tupi.Guard;
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

}
