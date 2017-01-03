package com.neu.design.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractActioneer implements Auctioneer {

	protected List<Bidder> list = null;
	public AbstractActioneer() {
		list = new ArrayList<Bidder>();
	}
	@Override
	public void attach(Bidder bidder) {
		if(!list.contains(bidder)){
			list.add(bidder);
		}else{
			throw new RuntimeException("������ֻ�ܲμ�ͳһ��Ʒ��һ�ξ���");
		}
	}
	@Override
	public void detach(Bidder bidder) {
		if(list.contains(bidder)){
			list.remove(bidder);
		}else{
			throw new RuntimeException("û�и�Ͷ����");
		}
	}
	@Override
	public void clear() {
		list.clear();
	}
}
