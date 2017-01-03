package com.neu.design.bridge;

public class Client {

	public static void main(String[] args) {
		new RefindAbstractA(new ImplementorA()).operation();
		new RefindAbstractA(new ImplementorB()).operation();
		new RefindAbstractB(new ImplementorA()).operation();
		new RefindAbstractB(new ImplementorB()).operation();
	}
}
