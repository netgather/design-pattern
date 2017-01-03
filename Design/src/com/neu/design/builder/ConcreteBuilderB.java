package com.neu.design.builder;

public class ConcreteBuilderB implements Builder {

	private Product product;
	{
		this.product = new ProductB();
	}
	@Override
	public void buildPartA() {
		product.buildPartA();
	}

	@Override
	public void buildPartB() {
		product.buildPartB();
	}

	@Override
	public void buildPartC() {
		product.buildPartC();
	}

}
