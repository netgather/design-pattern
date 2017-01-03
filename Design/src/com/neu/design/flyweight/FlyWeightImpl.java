package com.neu.design.flyweight;

public class FlyWeightImpl implements FlyWeight {

	private boolean color;
	/*
	 * �����Ԫ���ڲ�״̬���������ԣ�������Ԫ
	 * */
	public FlyWeightImpl(boolean color) {
		this.color = color;
	}
	@Override
	public boolean getColor() {
		return color;
	}
	@Override
	public void position(int x, int y) {
		System.out.println("("+x+","+y+")");
	}
}
