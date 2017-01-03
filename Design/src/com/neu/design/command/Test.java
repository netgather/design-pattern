package com.neu.design.command;


public class Test {

	@org.junit.Test
	public void test() {
		Panel panel = new Panel(new SonyAudioPlayer());
		panel.play();
		panel.stop();
	}

}
