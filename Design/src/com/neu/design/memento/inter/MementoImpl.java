package com.neu.design.memento.inter;

public class MementoImpl implements WideMemento, NarrowMemento, Cloneable{

	private String checkPoint;
	private Originator ori;
	
	public MementoImpl() {}
	public MementoImpl(Originator ori,String checkPoint) {
		this.checkPoint = checkPoint;
		this.ori = ori;
	}
	@Override
	public String getCheckPoint() {
		// TODO Auto-generated method stub
		return checkPoint;
	}
	@Override
	public Originator getOriginator() {
		// TODO Auto-generated method stub
		return this.ori;
	}
	public void setOriginator(Originator ori){
		this.ori = ori;
	}
	@Override
	protected MementoImpl clone() throws CloneNotSupportedException {
		MementoImpl memento = (MementoImpl) super.clone();
		//memento.ori = this.ori.clone();
		memento.setOriginator(this.getOriginator().clone());
		return memento;
	}
	
}
