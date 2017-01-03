package com.neu.design.iterator2;

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
	public Iterator<Channel> iterator() {
		return new IteratorImpl();
	}
	private class IteratorImpl implements Iterator<Channel>{

		private int currentPosition = 0;
		@Override
		public boolean hasNext() {
			return currentPosition<list.size();
		}
		@Override
		public Channel next() {
			return list.get(currentPosition++);
		}
	}
}
