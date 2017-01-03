package com.neu.design.builder;


import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Director dir = new Director(new ConcreteBuilderB());
		dir.build('C');
	}

}
