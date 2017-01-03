package com.neu.design.command;

public class Panel {

	public Command playCommand;
	public Command stopCommand;
	
	public Panel(AudioPlayer ap){
        playCommand = new PlayCommand(ap); 
        stopCommand = new StopCommand(ap); 
	}
	
	public void play(){
		playCommand.execute();
	}
	public void stop(){
		stopCommand.execute();
	}
}
