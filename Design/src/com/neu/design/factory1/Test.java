package com.neu.design.factory1;

public class Test {

	@org.junit.Test
 	public void test() {
		Factory factory = new ConcreteFactory();
		Product product = factory.createProduct('B');
		product.fun();
	}

}
