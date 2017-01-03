package com.neu.design.iterator1;

public class IteratorImpl implements Iterator<Channel> {

	private ChannelSet<Channel> channelSet;
	private int currentPosition = 0;
	public IteratorImpl(ChannelSet<Channel> channelSet) {
		this.channelSet = channelSet;
	}
	@Override
	public boolean hasNext() {
		return currentPosition<channelSet.getSize();
	}
	@Override
	public Channel next() {
		return channelSet.getChannel(currentPosition++);
	}
	
	public ChannelSet<Channel> getChannelSet() {
		return channelSet;
	}
	public void setChannelSet(ChannelSet<Channel> channelSet) {
		this.channelSet = channelSet;
	}
	public int getCurrentPosition() {
		return currentPosition;
	}
	public void setCurrentPosition(int currentPosition) {
		this.currentPosition = currentPosition;
	}
	
}
