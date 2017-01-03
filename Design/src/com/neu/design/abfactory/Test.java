package com.neu.design.abfactory;


public class Test {

	@org.junit.Test
	public void test() {
		AbstractFactory bmwFactory = new BMWFactory();
		AbstractFactory hondaFactory = new HondaFactory();
		System.out.println("****����BMW��Ʒ��****");
		bmwFactory.crateGPS().fun();
		bmwFactory.crateRadio().fun();
		bmwFactory.crateSeat().fun();
		
		System.out.println("****����Honda��Ʒ��****");
		hondaFactory.crateGPS().fun();
		hondaFactory.crateRadio().fun();
		hondaFactory.crateSeat().fun();
	}

}
