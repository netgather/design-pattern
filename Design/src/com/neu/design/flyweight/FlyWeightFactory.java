package com.neu.design.flyweight;

public class FlyWeightFactory {

	/*
	 * ����ڲ�״̬�Ĳ�ͬ���첻ͬ����Ԫ,���ṩ��ȡ��ͬ��Ԫ�ķ���
	 * */
	public static FlyWeight getBlack(){
		return new FlyWeightImpl(false);
	}
	public static FlyWeight getWeight(){
		return new FlyWeightImpl(true);
	}
}
