package com.neu.design.memento.checkpoint.error;

public class Client {

	public static void main(String[] args) {
		//���ñ���¼����
		Caretaker ct = new Caretaker();
		Originator ori = new Originator(1001,"aaa");
		Memento memento = ori.createMemento(ori);
		ct.save(memento);
		System.out.println(ori.getName());
		//�޸�
		ori.setName("bbb");
		System.out.println(ori.getName());
		//��ԭ֮ǰ��״̬
		String checkPoint = memento.getCheckPoint();
		Memento mementoBack = ct.retrieve(checkPoint);
		ori.setState(mementoBack);
		System.out.println(ori.getName());
		
	}

}
