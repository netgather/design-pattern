package com.neu.design.bridge;

public class RefindAbstractA extends Abstraction{

	public RefindAbstractA(Implementor implementor) {
		super(implementor);
	}
	@Override
	protected void operation() {
		System.out.print("Homecat--");
		implementor.operationImpl();
	}
}
