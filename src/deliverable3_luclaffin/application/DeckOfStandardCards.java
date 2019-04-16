/*
THIS CLASS USES THE STANDARD CARD CLASS TO CREATE A STANDARD PLAYING DECK
OF 52 CARDS THAT IS USED IN MOST GAMES
*/

package deliverable3_luclaffin.application;

import java.util.ArrayList;

public class DeckOfStandardCards {

    private ArrayList<StandardCard> _deck = new ArrayList<>();
    private enum Suits { HEARTS, SPADES, DIAMONDS, CLUBS }; 
    private enum Names {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
                            NINE, TEN, JACK, QUEEN, KING }

    public DeckOfStandardCards() { //loop through suits and names to create deck of 52
    	for(Suits s : Suits.values()) {
            for(Names n : Names.values()) {
                StandardCard card = new StandardCard(n.toString(), 
                        s.toString(), (n.ordinal()+1)); //ordinal = card numeric value
                _deck.add(card); //add StandardCard to deck
            }
    	}
    }

    public ArrayList<StandardCard> getDeck() {
    	return _deck;
    }

    public StandardCard randCard() { //return a random card from the deck
    	int rand = (int)(Math.random() * 52);
    	return _deck.get(rand);
    }
}
