package br.ufpe.cin.generator;


import java.util.ArrayList;
import java.util.List;

public class MachineDeclared {
	public List<String> states;
	public List<Event> events;
	
public MachineDeclared(){
	states = new ArrayList<String>();
	events = new ArrayList<Event>();
}

public void heritage(MachineDeclared father){
	for (String state : father.states){
		this.states.add(state);
	}
	for (Event event : father.events){
		this.events.add(event);
	}
}
}