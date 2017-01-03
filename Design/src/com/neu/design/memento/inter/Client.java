package com.neu.design.memento.inter;

public class Client {

	public static void main(String[] args) {
		Originator ori = new Originator(1001,"aaa");
		MementoImpl memento = (MementoImpl) ori.createMemento();
		CareTaker ct = new CareTaker();
		ct.save(memento);
		System.out.println(ori.getName());
		ori.setName("bbb");
		System.out.println(ori.getName());
		ori.setState((MementoImpl)ct.retrieve(memento.getCheckPoint()));
		System.out.println(ori.getName());
	}

}
