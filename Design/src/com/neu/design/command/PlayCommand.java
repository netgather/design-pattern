package com.neu.design.command;

public class PlayCommand extends Command {

	public PlayCommand(AudioPlayer ap){
		super(ap);
	}
	public void execute() {
        ap.playAction();
	}
}
