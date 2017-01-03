package com.neu.design.facade;

public abstract class Facade {

	protected Condition condition;
	protected Light light;
	protected Television television;
	
	public Facade() {
		this.condition = new ConditionImpl();
		this.light = new LightImpl();
		this.television = new TelevisionImpl();
	}
	public abstract void on(String type);
	public abstract void off(String type);
}
