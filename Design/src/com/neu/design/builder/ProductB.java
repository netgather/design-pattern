package com.neu.design.builder;

public class ProductB implements Product {

	@Override
	public void buildPartA() {
         System.out.println("����B��Ʒ��A����");		
	}

	@Override
	public void buildPartB() {
		System.out.println("����B��Ʒ��B����");
	}

	@Override
	public void buildPartC() {
		System.out.println("����B��Ʒ��C����");
	}

}
