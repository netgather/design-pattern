package com.neu.design.observer;

public class CLient {

	public static void main(String[] args) {
		Auctioneer auctioneer = new AuctioneerImpl(50, 3);
		Bidder tom = new BidderImpl("tom", 100, 5);
		Bidder jack = new BidderImpl("jack", 120, 10);
		Bidder marry = new BidderImpl("marry", 150, 20);
		Bidder aike = new BidderImpl("aike", 200, 20);
		tom.setAuctioneer(auctioneer);
		jack.setAuctioneer(auctioneer);
		marry.setAuctioneer(auctioneer);
		aike.setAuctioneer(auctioneer);
		while(!auctioneer.accept()){
			auctioneer.notifying();
			auctioneer.asking();
		}
	}

}
