import java.util.*;

public class BlackJackGame {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Deck myDeck = new Deck(1, true);

		Player player1 = new Player("Courtney");
		Player dealer = new Player("Dealer");

		player1.addCard(myDeck.dealNextCard());
		dealer.addCard(myDeck.dealNextCard());

		player1.addCard(myDeck.dealNextCard());
		dealer.addCard(myDeck.dealNextCard());

		//print initial hands

		System.out.println("Cards are dealt\n");
		player1.printPlayerHand(true);
		dealer.printPlayerHand(false);
		System.out.println();

		//flags for when each player is finished hitting
		boolean player1Done = false;
		boolean dealerDone = false;
		String ans;

		while(!player1Done || !dealerDone) {
			//player's turn

			if(!player1Done) {
				System.out.println("Hit or stay?");
				ans = in.next();
				System.out.println();

				//if the player hits
				if(ans.compareToIgnoreCase("H")==0) {
					//adds next card in deck and store whether plays is busted

					player1Done = !player1.addCard(myDeck.dealNextCard());
					dealer.printPlayerHand(true);		

				} else {
					player1Done = true;

				}
				
				//dealer's turn
				if(!dealerDone) {
					if(dealer.getHandSum() < 17) {
						System.out.println("The dealer hits");
						dealerDone = !dealer.addCard(myDeck.dealNextCard());
						dealer.printPlayerHand(false);					
					}
					else {
						System.out.println("The Dealer stay\n");
						dealerDone = true;
					}
				}

				System.out.println();

			}
		}


		//https://www.youtube.com/watch?v=buGFs1aQgaY -- 56:00 

	}

}
