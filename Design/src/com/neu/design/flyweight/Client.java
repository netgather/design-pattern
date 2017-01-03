package com.neu.design.flyweight;



import org.junit.Test;

public class Client {

	@SuppressWarnings("static-access")
	@Test
	public void test() {
		FlyWeightFactory factory = new FlyWeightFactory();
		System.out.println(factory.getBlack().getColor());
		System.out.println(factory.getWeight().getColor());
	}
}
