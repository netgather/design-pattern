package com.neu.design.singleton;

public final class EagerSingleton {

	private static EagerSingleton eager = new EagerSingleton();
	private EagerSingleton(){}
	public static EagerSingleton getInstance(){
		return eager;
	}
}
