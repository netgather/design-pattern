package com.neu.design.proxy;

public class Proxy implements Subject {

	private RealSubject rs;
	{
		rs = new RealSubject();
	}
	@Override
	public void exam() {
		proExam();
		rs.exam();
		postExam();
	}
	
	public void proExam(){
		System.out.println("Ѱ��ǹ��");
	}
	public void postExam(){
		System.out.println("֧������");
	}
}
