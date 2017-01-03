package com.neu.design.observer;

import java.util.Iterator;

public class AuctioneerImpl extends AbstractActioneer implements Auctioneer {

	private Bidder currentBidder;
	private int notifiedCount = 0;
	private int maxNotifiedCount = 3;
	
	public AuctioneerImpl(int initPrice,int maxNotifiedCount) {
		currentBidder = new BidderImpl("1�� bidder", 0, 0);
		currentBidder.updatePrice(initPrice);
		this.maxNotifiedCount = maxNotifiedCount;
	}

	@Override
	public void asking() {
		boolean bidderChanged = false;
		for(Iterator<Bidder> it = list.iterator();it.hasNext();){
			Bidder bidder = it.next();
			boolean state = bidder.bidding();
			if(!state){
				it.remove();
				System.out.println(bidder+"quit!");
			}
			if(bidder.getGoodCurrentPrice()>currentBidder.getGoodCurrentPrice()){
				currentBidder = bidder;
				bidderChanged = true;
			}
		}
		if(!bidderChanged){
			notifiedCount++;
			System.out.println("notified "+notifiedCount);
		}
	}
	@Override
	public void notifying() {
		for(Bidder bidder : list){
			bidder.updatePrice(currentBidder.getGoodCurrentPrice());
		}
	}
	@Override
	public boolean accept() {
		if(notifiedCount>=maxNotifiedCount){
			this.clear();
			System.out.println("Accept: "+currentBidder);
			return true;
		}
		return false;
	}
	@Override
	public Bidder currentBidder() {
		return this.currentBidder;
	}
}
