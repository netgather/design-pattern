package com.neu.design.factory1;

public class ConcreteFactory implements Factory {

	@Override
	public Product createProduct(char type) {
		// TODO Auto-generated method stub
		Product product = null;
		switch(type){
			case 'A':
				product = new ProductA();
				break;
			case 'B':
				product = new ProductB();
				break;
		}
		return product;
	}
}
