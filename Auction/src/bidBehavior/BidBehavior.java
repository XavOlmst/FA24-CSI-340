package bidBehavior;

import observer.BidObserver;

public interface BidBehavior {
	public float determineBid(BidObserver bidder);
}
