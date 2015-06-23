package br.ufpe.cin.generator;


import java.util.ArrayList;
import java.util.List;

import br.ufpe.cin.tupi.MachineDecl;
import br.ufpe.cin.tupi.State;

public class MachineDeclared {
	public List<String> states;
	public List<Event> events;
	
public MachineDeclared(){
	states = new ArrayList<String>();
	events = new ArrayList<Event>();
}

public void heritage(MachineDecl father){
	for (State state : father.getBody().getStatesDecl().getStates()){
		this.states.add(state.getName());
	}
	for (br.ufpe.cin.tupi.Event event : father.getBody().getEventsDecl().getEvents()){
		this.events.add(new Event(event.getName()));
	}
}
}