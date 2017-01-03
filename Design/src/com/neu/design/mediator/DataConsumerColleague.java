package com.neu.design.mediator;

public class DataConsumerColleague extends DataColleague {

	public DataConsumerColleague(Mediator mediator){
		super(mediator);
	}
	public String consumeValue(String value){
		String valueProcess = value + value;
		System.out.println("������ݣ�"+value+" �����Ϊ��"+valueProcess+" �ɹ�.");
		return valueProcess;
	}
}
