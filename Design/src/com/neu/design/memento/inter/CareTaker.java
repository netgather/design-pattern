package com.neu.design.memento.inter;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CareTaker {

	private Map<String, NarrowMemento> mementoPool = null;
	{
		mementoPool =  new HashMap<String, NarrowMemento>();
	}
	public void save(NarrowMemento memento){
		mementoPool.put(memento.getCheckPoint(), memento);
	}
	public NarrowMemento retrieve(String checkPoint){
		return mementoPool.get(checkPoint);
	}
	public Iterator<String> getCheckPoint(){
		return mementoPool.keySet().iterator();
	}
	public Iterator<NarrowMemento> getMenIterator(){
		return mementoPool.values().iterator();
	}
}
