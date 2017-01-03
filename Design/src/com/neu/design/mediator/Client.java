package com.neu.design.mediator;


import org.junit.Test;

public class Client {

	@Test
	public void test() {
		Mediator mediator = new MediatorImpl();
		DataProviderColleague provider = new DataProviderColleague(mediator);
		DataConsumerColleague consumer = new DataConsumerColleague(mediator);
		DataStoreColleague store = new DataStoreColleague(mediator);
		mediator.registerDataColleague(provider);
		mediator.registerDataColleague(consumer);
		mediator.registerDataColleague(store);
		provider.providerValue();
	}

}
