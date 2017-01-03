package com.neu.design.dectorator;

public class BorderDecorator extends Decorator {

	public BorderDecorator(VisualComponent component) {
		super(component);
	}
	@Override
	public void draw() {
		component.draw();
		this.border();
	}
    public void border(){
    	System.out.println("���Ʊ߿�");
    }
}
