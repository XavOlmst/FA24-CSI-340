package observer;

public class Bidder implements BidObserver{
	private boolean isBestBidder = false;
	private float currentBid = 0;
	
	@Override
	public void updateCurrentBid(float currentBid, BidObserver bidder) {
		// TODO Auto-generated method stub
		isBestBidder = (bidder == this);
		this.currentBid = currentBid;
	}
	
	
}
