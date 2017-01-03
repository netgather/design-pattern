package com.neu.design.memento.checkpoint.error;

public class Originator implements Cloneable{

	private int id;
	private String name;
	
	public Originator(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public void setState(Memento memento){
		this.id = memento.getOri().getId();
		this.name = memento.getOri().getName();
	}
	public Memento createMemento(Originator ori){
		return new Memento(ori,new java.util.Date().toString());
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
	@Override
	protected Originator clone() throws CloneNotSupportedException {
		return (Originator) super.clone();
	}
	
}
