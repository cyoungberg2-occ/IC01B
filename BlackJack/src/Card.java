
public class Card {
	
	/**
	 * One of the suits in playing cards. Enum used
	 */
	private Suit cardSuit;
	/**
	 * Card numeric value. Ace = 1 Jack-King =10
	 */
	private int cardNumber;
	//String[] cardSuit = {"Heart", "Diamond", "Spade", "Club"};
	//Integer[] cardValue = {11, 2, 3, 4, 5, 6, 7, 8, 9};
	
	public Card(Suit aSuit, int number) {
		
		this.cardSuit = aSuit;
		
		if(number >= 1 && number <= 13) {
			this.cardNumber = number;
		}
		else {
			System.out.println(number + " is not a valid Card Number");
		}
	
	}
	public int getNumber() {
		return cardNumber;
	}
	
	@Override
	public String toString() {
		String numStr = "Error";
		
		switch(this.cardNumber) {
	
		case 1:
			numStr = "Ace";
			break;
	
		case 2:
			numStr = "Two";
			break;

		case 3:
			numStr = "Three";
			break;
			
		case 4:
			numStr = "Four";
			break;
			
		case 5:
			numStr = "Five";
			break;
			
		case 6:
			numStr = "Six";
			break;
			
		case 7:
			numStr = "Seven";
			break;
			
		case 8:
			numStr = "Eight";
			break;
			
		case 9:
			numStr = "Nine";
			break;
			
		case 10:
			numStr = "Ten";
			break;
			
		case 11:
			numStr = "Jack";
			break;
			
		case 12:
			numStr = "Queen";
			break;
			
		case 13:
			numStr = "King";
			break;
					
		}
		return numStr + "-" + cardSuit.toString();
	}
	

}
