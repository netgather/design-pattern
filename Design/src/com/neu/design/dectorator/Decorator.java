package com.neu.design.dectorator;

public abstract class Decorator implements VisualComponent {

	protected VisualComponent component;
	
	public Decorator(VisualComponent component){
		this.component = component;
	}

	@Override
	public abstract void draw();
	
}
