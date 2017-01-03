package com.neu.design.bridge;

public class RefindAbstractB extends Abstraction {

	public RefindAbstractB(Implementor implementor) {
		super(implementor);
	}
	@Override
	protected void operation() {
		System.out.print("Businesscar--");
		implementor.operationImpl();
	}

}
