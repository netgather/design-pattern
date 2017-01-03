package com.neu.design.bridge;

public abstract class Abstraction {

	protected Implementor implementor;
	public Abstraction(Implementor implementor){
		this.implementor = implementor;
	}
	protected abstract void operation(); 
}
