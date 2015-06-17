package br.ufpe.cin.generator;


public class Transition {
String originState;
String destState;
String guard;

public Transition (String originState, String destState, String guard){
	this.originState=originState;
	this.destState=destState;
	this.guard=guard;
}
}