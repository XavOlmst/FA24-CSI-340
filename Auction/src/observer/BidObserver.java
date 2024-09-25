package observer;

public interface BidObserver {
	public void updateCurrentBid(float currentBid, BidObserver bidder);
}
