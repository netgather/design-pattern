package com.neu.design.responsibilitychain;

public abstract class CoinCollecter {

	protected CoinCollecter next;
	public CoinCollecter(CoinCollecter next) {
		this.next = next;
	}
	
	protected final CoinCollecter next(){
		return next;
	}
	protected final void collect(Coin coin){
		if(this.matched(coin)){
			this.store(coin);
		}else{
			this.next().collect(coin);
		}
	}
	public abstract boolean matched(Coin coin);
	public abstract void store(Coin coin);
}
