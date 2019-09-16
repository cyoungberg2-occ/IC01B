public class BillFold {
	
	private Card card1;
	private Card card2;
	
	public BillFold(Card card1, Card card2) {
		super();
		this.card1 = card1;
		this.card2 = card2;
	}
	
	public void addCard(Card c) 
	{
		if(card1 == null) {
			card1 = c;
		}
		else if(card2 == null) {
			card2 = c;
		}
		else {
			System.out.println("Error: Both cards are currently full.");
		}
	}
	
	public String formatCards() {
		return "BillFolds [" + card1.format() + "|" + card2.format() + "]";
	}

}
