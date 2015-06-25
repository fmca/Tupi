package br.ufpe.cin.generator;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.xtext.xbase.lib.InputOutput;

import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.State;
import br.ufpe.cin.tupi.Transition;

public class MachineDeclared {
	public List<String> states;
	public List<Event> events;

	public MachineDeclared() {
		states = new ArrayList<String>();
		events = new ArrayList<Event>();
	}

	public void heritage(MachineDecl father) {

		if (father.getSuperType() != null) {
			heritage(father.getSuperType());
		}

		addStatesAndEvents(father);

	}

	public void addStatesAndEvents(MachineDecl machine) {
		try {
			for (State state : machine.getBody().getStatesDecl().getStates()) {
				this.states.add(state.getName());
			}
		} catch (NullPointerException e) {
			InputOutput.println(machine.getName() + " doesn't have states");
		}

		try {
			for (br.ufpe.cin.tupi.Event event : machine.getBody().getEventsDecl().getEvents()) {
				Event e = new Event(event.getName());
				for (Transition t : event.getTransitions()) {
					for (String originState : t.getOriginStates()) {
						String regex = originState.replace("*", ".*");
						for (String state : this.states) {
							if (state.matches(regex)) {
								e.trans.add(new br.ufpe.cin.generator.Transition(state, t.getDestState().getName(),
										t.getGuard().getName()));
							}
						}

					}
				}
				this.events.add(e);
			}
		} catch (NullPointerException e) {
			InputOutput.println(machine.getName() + " doesn't have events");
		}
	}

}