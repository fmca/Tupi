package br.ufpe.cin.generator;

import java.util.ArrayList;
import java.util.List;

public class Event {
	public String name;
	public List<Transition> trans;

	public Event(String name) {
		this.name = name;
		this.trans = new ArrayList<Transition>();
	}

}