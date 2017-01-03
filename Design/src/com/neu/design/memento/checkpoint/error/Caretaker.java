package com.neu.design.memento.checkpoint.error;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Caretaker {

	private Map<String, Memento> mementoPool = null;
	{
		mementoPool = new HashMap<String, Memento>();
	}
	public Caretaker(){}
	public Memento retrieve(String checkPoint){
		Memento memento = mementoPool.get(checkPoint);
		return memento;
	}
	public void save(Memento memento){
		String checkPoint = memento.getCheckPoint();
		mementoPool.put(checkPoint, memento);
	}
	public void clear(){
		mementoPool.clear();
	}
	public Iterator<String> getCheckPoint(){
		Iterator<String> it = this.mementoPool.keySet().iterator();
		return it;
	}
	public Iterator<Memento> getMementos(){
		Iterator<Memento> it = this.mementoPool.values().iterator();
		return it;
	}
}