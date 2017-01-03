package com.neu.design.memento.checkpoint;

public class Originator {

	private int id;
	private String name;
	
	public Originator(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setState(Memento memento){
		this.id = memento.getId();
		this.name = memento.getName();
	}
	public Memento createMemento(Originator ori){
		return new Memento(id,name,new java.util.Date().toString());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
