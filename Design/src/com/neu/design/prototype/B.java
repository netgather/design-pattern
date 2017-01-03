package com.neu.design.prototype;

public class B implements Cloneable {

	private C c;
	
	public B() {}
	public B(C c){
		this.c = c;
	}
	public C getC() {
		return c;
	}
	public void setC(C c) {
		this.c = c;
	}
	public B clone() throws CloneNotSupportedException{
		B bClone = (B) super.clone();
		bClone.c = this.c.clone();
		return bClone;
	}
}
