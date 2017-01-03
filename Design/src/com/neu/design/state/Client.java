package com.neu.design.state;

public class Client {

	public static void main(String[] args) {
		Context context = new Context(new ConcreteStateA());
		context.request();
		context.setState(new ConcreteStateB());
		context.request();
		context.request();
		context.request();
		context.request();
	}
}
