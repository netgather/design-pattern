package com.neu.design.observer;

public class BidderImpl implements Bidder {

	private Auctioneer auctioneer;  //�����߶�Ӧ��������
	private String bidderName;      //�����ߵ�����
	private int currentPrice;       //��Ʒ��ǰ�ļ۸�
	private int maxPrice;           //�������ܹ���������۸�
	private int step;               //ÿ�־����У���Ͷ�������ӵļ۸�
	
	public BidderImpl(String bidderName,int maxPrice,int step) {
		this.bidderName = bidderName;
		this.maxPrice = maxPrice;
		this.step = step;
	}
	public void setAuctioneer(Auctioneer auctioneer) {
		this.auctioneer = auctioneer;
		this.auctioneer.attach(this);
	}
	public String getBidderName() {
		return this.bidderName;
	}
	public int getGoodCurrentPrice() {
		return this.currentPrice;
	}
	public void updatePrice(int price) {
		this.currentPrice = price;
	}
	public boolean bidding() {
		if(auctioneer==null){
			return false;
		}
		if(currentPrice>maxPrice){
			return false;
		}
		if(auctioneer.currentBidder()==this){
			return true;
		}
		int price = currentPrice + step;
		currentPrice = price<maxPrice?price:maxPrice;
		System.out.println(this);
		return true;
	}
	@Override
	public String toString() {
		return "�����ߣ� "+ "������ "+this.bidderName+" ���� "+this.currentPrice;
	}
	public void plan() {
		//�����߾��ĵĲ���  ���Խ�ϲ���ģʽ��ģ�巽��ģʽ
	}
	
}
