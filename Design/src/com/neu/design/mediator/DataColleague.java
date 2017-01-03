package com.neu.design.mediator;

public abstract class DataColleague {

	protected Mediator mediator;
	public DataColleague(Mediator mediator){
		this.mediator = mediator;
	}
}
