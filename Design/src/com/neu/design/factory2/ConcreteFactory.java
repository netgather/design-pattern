package com.neu.design.factory2;

public class ConcreteFactory implements Factory {

	@Override
	public Product createProductA() {
		return new ProductA();
	}

	@Override
	public Product createProductB() {
		return new ProductB();
	}

}
