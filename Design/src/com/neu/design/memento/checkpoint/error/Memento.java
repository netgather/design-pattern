package com.neu.design.memento.checkpoint.error;


public class Memento implements Cloneable{

	private Originator ori;
	private String checkPoint;
	
	public Memento(){}
	public Memento(Originator ori,String checkDate){
		this.ori = ori;
		this.checkPoint = checkDate;
	}

	public Originator getOri() {
		return ori;
	}
	public void setOri(Originator ori) {
		this.ori = ori;
	}
	public String getCheckPoint() {
		return checkPoint;
	}
	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}
	@Override
	protected Memento clone() throws CloneNotSupportedException {
		Memento memento = (Memento) super.clone();
		memento.ori = this.ori.clone();
		return memento;
	}
	
}
