package com.neu.design.factory2;

public class Test {

	@org.junit.Test
 	public void test() {
		Factory factory = new ConcreteFactory();
		ProductA A = (ProductA)factory.createProductA();
		A.fun();
		
	}

}
