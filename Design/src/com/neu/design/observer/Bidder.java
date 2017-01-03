package com.neu.design.observer;

public interface Bidder {

	public void setAuctioneer(Auctioneer auctioneer);
	public String getBidderName();
	public int getGoodCurrentPrice();
	public void updatePrice(int price);
	public boolean bidding();
	public void plan();
}
