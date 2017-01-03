package com.neu.design.prototype;

public class D implements Cloneable{

	public int age;
	public String name;
	
	public D() {}
	public D(int age) {
		this.age = age;
	}
	public D(int age, String name) {
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public D clone() throws CloneNotSupportedException {
		D dClone = (D) super.clone();
		return dClone;
	}
}
