package com.neu.design.prototype2;

public class D implements Cloneable{

	public int age;
	public StringBuffer name;
	
	public D() {}
	public D(int age) {
		this.age = age;
	}
	public D(int age, StringBuffer name) {
		super();
		this.age = age;
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public StringBuffer getName() {
		return name;
	}
	public void setName(StringBuffer name) {
		this.name = name;
	}
	public D clone() throws CloneNotSupportedException {
		D dClone = (D) super.clone();
		return dClone;
	}
}
