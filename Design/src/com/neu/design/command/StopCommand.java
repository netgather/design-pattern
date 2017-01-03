package com.neu.design.command;

public class StopCommand extends Command {

	public StopCommand(AudioPlayer ap){
		super(ap);
	}
	public void execute() {
		ap.stopAction();
	}
}
