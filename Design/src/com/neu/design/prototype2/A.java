package com.neu.design.prototype2;

import java.util.List;

public class A implements Cloneable {

	private B b;
	private List<D> list;

    public A(){}
	public A(B b,List<D> list){
		this.b = b;
		this.list = list;
	}
	
	public B getB() {
		return b;
	}
	public void setB(B b) {
		this.b = b;
	}
	public List<D> getList() {
		return list;
	}
	public void setList(List<D> list) {
		this.list = list;
	}
	public A clone() throws CloneNotSupportedException{
		A aClone = (A) super.clone();
		aClone.b = this.b.clone();
		for(int i=0;i<this.list.size();i++){
			aClone.list.get(i).clone();
		}		
		return aClone;
	}
}
