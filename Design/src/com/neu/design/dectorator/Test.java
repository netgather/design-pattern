package com.neu.design.dectorator;

public class Test {

	@org.junit.Test
	public void test() {
		VisualComponent component = new BorderDecorator(
				                    new ScrollDecorator( 
				                    new BorderDecorator(
						            new ScrollDecorator(
						            new Text()))));
		component.draw();
	}

}
