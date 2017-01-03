package com.neu.design.iterator1;

import java.util.ArrayList;
import java.util.List;

public class ChannelSetImpl implements ChannelSet<Channel> {
	
	private List<Channel> list;
	
	public ChannelSetImpl() {
		list = new ArrayList<Channel>();
	}
	@Override
	public Channel getChannel(int index) {
		return list.get(index);
	}
	@Override
	public void save(Channel channel) {
		list.add(channel);
	}
	@Override
	public int getSize() {
		return list.size();
	}
	@Override
	public Iterator<Channel> iterator() {
		return new IteratorImpl(this);
	}
}