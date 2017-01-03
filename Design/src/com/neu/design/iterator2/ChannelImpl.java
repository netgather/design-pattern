package com.neu.design.iterator2;

public class ChannelImpl implements Channel {
	
	private String name;
	public ChannelImpl() {}
	public ChannelImpl(String name) {
		this.name = name;
	}
	@Override
	public String getName() {
		if(name==null){
			throw new RuntimeException();
		}
		return this.name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(Channel channel) {
		return this.getName().compareTo(channel.getName());
	}
}