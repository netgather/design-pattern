package com.neu.design.command;

public class SonyAudioPlayer implements AudioPlayer {

	@Override
	public void playAction() {
		// TODO Auto-generated method stub
		System.out.println("PlayAudio");
	}

	@Override
	public void stopAction() {
		// TODO Auto-generated method stub
		System.out.println("StopAudio");
	}

	@Override
	public void pauseAction() {
		// TODO Auto-generated method stub
		System.out.println("");
	}

	@Override
	public void forwardAction() {
		// TODO Auto-generated method stub
	}

	@Override
	public void backwardAtion() {
		// TODO Auto-generated method stub
	}

	@Override
	public void recordAction() {
		// TODO Auto-generated method stub
	}
}
