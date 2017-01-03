package com.neu.design.mediator;

public class MediatorImpl implements Mediator {

	private DataConsumerColleague consumer;
	private DataProviderColleague provider;
	private DataStoreColleague store;
	@Override
	public void registerDataColleague(DataColleague dataColleague) {
		//Class classType = dataColleague.getClass();
		String classType = dataColleague.getClass().getName();
		if(classType.equals(DataConsumerColleague.class.getName())){
			consumer = (DataConsumerColleague) dataColleague;
		}else if(classType.equals(DataProviderColleague.class.getName())){
			provider = (DataProviderColleague) dataColleague;
		}else if(classType.equals(DataStoreColleague.class.getName())){
			store = (DataStoreColleague) dataColleague;
		}else{
			throw new RuntimeException("��ʱ��֧�ָ�����"+dataColleague);
		}
	}
	/**
	 * ��װһ�����֮����໥����
	 */
	@Override
	public void processData() {
		String value = provider.getValue();
		if(consumer!=null){
			String valueConsume = consumer.consumeValue(value);
			if(store!=null){
				store.storeValue(valueConsume);
			}
		}
	}
}
