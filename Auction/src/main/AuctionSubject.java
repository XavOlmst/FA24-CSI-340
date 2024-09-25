package main;

import observer.BidObserver;

public interface AuctionSubject {
	public void registerBidder(BidObserver bidder);
	public void removeBidder(BidObserver bidder);
	public void notifyBidders();
	
	public void makeBid(float amount, BidObserver bidder);
}
