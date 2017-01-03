package com.neu.design.iterator2;

public interface ChannelSet<E extends Channel> {

	public E getChannel(int index);
	public Iterator<E> iterator();
}
