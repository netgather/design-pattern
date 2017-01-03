package com.neu.design.memento.inter;

public class Originator implements Cloneable{

	private int id;
	private String name;
	
	public Originator() {}
	public Originator(int id, String name) {
		this.id = id;
		this.name = name;
	}
	public WideMemento createMemento(){
		return new MementoImpl(this,new java.util.Date().toString());
	}
	public void setState(WideMemento memento){
		this.id = memento.getOriginator().getId();
		this.name = memento.getOriginator().getName();
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
