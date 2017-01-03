package com.neu.design.builder;

public class ProductA implements Product {

	@Override
	public void buildPartA() {
		System.out.println("����A��Ʒ��A����");
	}

	@Override
	public void buildPartB() {
		System.out.println("����A��Ʒ��B����");
	}

	@Override
	public void buildPartC() {
		System.out.println("����A��Ʒ��C����");
	}

}
