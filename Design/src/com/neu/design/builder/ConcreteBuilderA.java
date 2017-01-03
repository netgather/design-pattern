package com.neu.design.builder;

public class ConcreteBuilderA implements Builder {

	private Product product;
	public ConcreteBuilderA() {
		this.product = new ProductA();
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
