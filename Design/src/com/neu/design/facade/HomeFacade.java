package com.neu.design.facade;

public class HomeFacade extends Facade {

	@Override
	public void on(String type) {
		if(type.equalsIgnoreCase("con")){
			condition.turnOn();
		}else if(type.equalsIgnoreCase("tel")){
			television.turnOn();
		}else if(type.equalsIgnoreCase("lig")){
			light.turnOn();
		}else{
			throw new RuntimeException("û�иüҾߣ�");
		}
	}
	@Override
	public void off(String type) {
	if(type.equalsIgnoreCase("con")){
			condition.turnOff();
		}else if(type.equalsIgnoreCase("tel")){
			television.turnOff();
		}else if(type.equalsIgnoreCase("lig")){
			light.turnOff();
		}else{
			throw new RuntimeException("û�иüҾߣ�");
		}
	}

}
