//import java.util.LinkedList;
import java.util.Random;

/**
 * The implementation of a deck of cards
 * @author Courtney.Youngberg
 *
 */


public class Deck {

	/**
	 * This is the array of cards in a deck. It will include 52 card. 
	 */
	private Card[] myCards;
	//private ArrayList<Card> myCards1;
	private int numCards;

	/**
	 * Overloading if deck entry is empty
	 * Default to 1 deck and no shuffling
	 */

	public Deck() {
		this(1, false);
	}


	/**
	 * Construction that defines the number of decks (emulating casino) also a 
	 * function to shuffle/re-randomize the deck
	 * @param numDeck
	 * @param shuffle
	 */
	public Deck(int numDecks, boolean shuffle) {
		this.numCards = numDecks * 52;
		this.myCards = new Card[this.numCards];

		//card index
		int c = 0;


		//for each deck
		for (int d = 0; d < numDecks; d++) {

			//for each suit
			for(int s = 0; s <4; s++) {

				//for each number
				for(int n =1; n <= 13; n++) {
					this.myCards[c] = new Card(Suit.values()[s], n);
					c++;
				}

			}

		}
		//Shuffle as necessary

		if(shuffle) {
			this.shuffle();
		}

		/**
		 * Shuffle deck by randomly switching pairs of cards
		 */


	}



	/**
	 * Shuffle deck by randomly swapping pair of cards
	 */
	public void shuffle() {
		Random rng = new Random();

		Card temp;

		//temp index for cards
		int j;

		for(int i = 0; i < this.numCards; i++) {
			//get a random card to swap j's value with
			j = rng.nextInt(this.numCards);
			//swap values
			temp = this.myCards[i];
			this.myCards[i] = this.myCards[j];
			this.myCards[j] = temp;

		}

	}

	public Card dealNextCard() {
		//get the top card from the deck
		Card top = this.myCards[0];

		//shift all cards by 1---research array list instead or linked list
		for(int c = 1; c <this.numCards; c++) {
			this.myCards[c-1] = this.myCards[c];
		}

		this.myCards[this.numCards-1] = null;

		//decrease numCards
		this.numCards--;

		return top;


	}

	public void printDeck(int numToPrint) {

		for(int c = 0; c <numToPrint; c++) {
			System.out.printf("% 3d/%d %s\n", c+1, this.numCards, 
					this.myCards[c].toString());	
		}
	//	System.out.printf("\t\t[d% other]\n", this.numCards-numToPrint);
		
	}

}
