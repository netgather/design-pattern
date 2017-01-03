package com.neu.design.iterator1;

public class Client {

	public static void main(String[] args) {

		Channel ch1 = new ChannelImpl("CCTV-1");
		Channel ch2 = new ChannelImpl("CCTV-2");
		Channel ch3 = new ChannelImpl("CCTV-3");
		Channel ch4 = new ChannelImpl("CCTV-4");
		Channel ch5 = new ChannelImpl("CCTV-5");
		
		ChannelSet<Channel> cs = new ChannelSetImpl();
		cs.save(ch1);cs.save(ch2);cs.save(ch3);cs.save(ch4);cs.save(ch5);
		Iterator<Channel> it = cs.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
	}

}
