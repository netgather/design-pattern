package com.neu.design.mediator;

public class DataProviderColleague extends DataColleague {

	private String target = "Something";
	public DataProviderColleague(Mediator mediator){
		super(mediator);
	}
	public void providerValue(){
		mediator.processData();
	}
	public String getValue(){
		return target;
	}
	public void setValue(String target){
		this.target = target;
	}
}
