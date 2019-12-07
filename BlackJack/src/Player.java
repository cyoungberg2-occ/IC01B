/**
 * Implmenation of blackjack player
 * @author Courtney.Youngberg
 *
 */
class Player {

	private int maxNumCards;
	//Player name
	private String name;
	//player hand
	private Card[] hand = new Card[10];
	//number of cards in player's hand
	private int numCards;

	public Player(String aName){
		this.name = aName;

		this.emptyHand();
	}


	public void emptyHand() {
		for(int i = 0; i<10; i++) {
			this.hand[i] = null;
		}
		this.numCards = 0;
	}

	/**
	 * Adding card to players hand
	 * @param aCard
	 * @return whether the sum of the hand less than 21
	 */

	public boolean addCard(Card aCard) {
		//error if we have max set of cards
		if(this.numCards == maxNumCards) {
			System.out.println(name+"'s hand already has max amount of cards. "
					+ "Cannot add another.");
		}

		this.hand[this.numCards] = aCard;
		this.numCards++;
		return (this.getHandSum() <= 21);

	}

	public int getHandSum() {

		int handSum = 0;
		int cardNum;
		int numAces = 0;

		//calc each card's contribution to the hand sum
		for(int c = 0; c < this.numCards; c++) {

			cardNum = this.hand[c].getNumber();

			if(cardNum == 1) {
				numAces++;
				handSum += 11; 
			} else if (cardNum > 10) {
				handSum += 10;
			} else {
				handSum += cardNum;
			}

			while(handSum > 21 && numAces > 0) {
				handSum -= 10;
				numAces--;
			}

		}

		return handSum;
	}
	
	public void printPlayerHand(boolean showFirstCard) {
		
		System.out.printf("%s's cards:\n", this.name);
		for(int c = 0; c <this.numCards; c++)
		{
			if(c == 0 && !showFirstCard) {
				System.out.println("[hidden]");
			}
			else {
				System.out.printf("  %s\n", this.hand[c].toString());
			}
		}
		
	}
}
