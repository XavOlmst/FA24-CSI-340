package bidBehavior;

import observer.BidObserver;

public class BasicBidder implements BidObserver {
	private BidBehavior behavior;
	
	@Override
	public void updateCurrentBid(float currentBid, BidObserver bidder) {
		
	}
}
