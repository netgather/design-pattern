package com.neu.design.prototype;

public class C implements Cloneable {

	private int id;
	
	public C() {}
	public C(int id){
		this.id = id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public C clone() throws CloneNotSupportedException {
		C cClone = (C) super.clone();
		return cClone;
	}
}
