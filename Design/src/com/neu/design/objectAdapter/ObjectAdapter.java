package com.neu.design.objectAdapter;

public class ObjectAdapter implements Target{

	private Adaptee adaptee;
	
	public ObjectAdapter() {
		adaptee = new Adaptee();
	}
	@Override
	public void targetFun() {
		adaptee.adapteeFun();
	}

}
