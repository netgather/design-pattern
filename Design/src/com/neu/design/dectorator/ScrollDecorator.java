package com.neu.design.dectorator;

public class ScrollDecorator extends Decorator {

	public ScrollDecorator(VisualComponent component) {
		super(component);
	}
	@Override
	public void draw() {
		component.draw();
		this.scroll();
	}
	public void scroll(){
		System.out.println("���ƹ�����");
	}
}
