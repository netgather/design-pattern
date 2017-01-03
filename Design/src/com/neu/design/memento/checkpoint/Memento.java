package com.neu.design.memento.checkpoint;


public class Memento {

	private int id;
	private String name;
	private String checkPoint;
	
	public Memento(){}
	public Memento(int id,String name,String checkDate){
		this.id = id;
		this.name = name;
		this.checkPoint = checkDate;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCheckPoint() {
		return checkPoint;
	}
	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}
}
