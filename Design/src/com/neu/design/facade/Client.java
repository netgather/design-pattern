package com.neu.design.facade;

public class Client {

	public static void main(String[] args) {
		Facade facade = new HomeFacade();
		facade.on("ligg");
	}

}
