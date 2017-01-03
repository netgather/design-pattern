package com.neu.design.iterator1;

public interface ChannelSet<E extends Channel> {

	public E getChannel(int index);
	public void save(E channel);
	public int getSize();
	public Iterator<E> iterator();
}
