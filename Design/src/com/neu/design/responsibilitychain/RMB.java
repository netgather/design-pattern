package com.neu.design.responsibilitychain;

public class RMB implements Coin {

	private int parValue;
	public RMB(int parVaue){
		this.parValue = parVaue;
	}
	@Override
	public int getParValue() {
		return parValue;
	}
	@Override
	public void setParValue(int parValue) {
		this.parValue = parValue;
	}
}
