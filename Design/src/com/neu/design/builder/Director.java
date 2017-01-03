package com.neu.design.builder;

public class Director {
	
	private Builder builder;
	public Director(Builder builder){
		this.builder = builder;
	}
	public void build(char part){
		if(builder instanceof ConcreteBuilderA){
			switch(part){
				case 'A':
					builder.buildPartA();
					break;
				case 'B':
					builder.buildPartB();
					break;
				case 'C':
					builder.buildPartC();
					break;
			}
		}else if(builder instanceof ConcreteBuilderB){
			switch(part){
			case 'A':
				builder.buildPartA();
				break;
			case 'B':
				builder.buildPartB();
				break;
			case 'C':
				builder.buildPartC();
				break; 
			}
		}else{
			System.out.println("��ʱ��֧��");
		}
	}
}
