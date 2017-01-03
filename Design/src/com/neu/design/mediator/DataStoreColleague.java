package com.neu.design.mediator;

public class DataStoreColleague extends DataColleague {

	public DataStoreColleague(Mediator mediator){
		super(mediator);
	}
	public void storeValue(String value){
		System.out.println("�洢��ݣ�"+value+" �ɹ�");
	}
}
