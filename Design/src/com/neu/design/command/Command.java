package com.neu.design.command;

public abstract class Command {

	protected AudioPlayer ap;
	public Command(AudioPlayer ap){
		this.ap = ap;
	}
	public abstract void execute();
}
