package main;

import java.util.ArrayList;

import observer.BidObserver;

public class Auctioneer implements AuctionSubject{
	private float remainingTime = 10;
	private float maxBid = 0;
	private BidObserver bestBidder;
	private ArrayList<BidObserver> bidders = new ArrayList<BidObserver>();
	
	@Override
	public void registerBidder(BidObserver bidder) {
		// TODO Auto-generated method stub
		bidders.add(bidder);
	}
	
	@Override
	public void removeBidder(BidObserver bidder) {
		// TODO Auto-generated method stub
		bidders.remove(bidder);
	}
	
	@Override
	public void notifyBidders() {
		// TODO Auto-generated method stub
		for (BidObserver bidObserver : bidders) {
			bidObserver.updateCurrentBid(maxBid, bestBidder);
		}
	}

	@Override
	public void makeBid(float amount, BidObserver bidder) {
		// TODO Auto-generated method stub
		if(amount > maxBid) {
			maxBid = amount;
			bestBidder = bidder;
			notifyBidders();
		}
	}
	

}
