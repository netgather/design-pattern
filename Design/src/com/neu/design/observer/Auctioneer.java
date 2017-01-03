package com.neu.design.observer;

public interface Auctioneer {

	public void attach(Bidder bidder);
	public void detach(Bidder bidder);
	public void clear();
	public void notifying();
	public void asking();
	public boolean accept();
	public Bidder currentBidder();
}
