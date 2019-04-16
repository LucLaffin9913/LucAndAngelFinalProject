package deliverable3_luclaffin.application;

import java.util.ArrayList;

public class DeckOfStandardCards {

    private final ArrayList<StandardCard> _deck = new ArrayList<>();
    private enum Suits { HEARTS, SPADES, DIAMONDS, CLUBS };
    private enum Names {ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, 
                            NINE, TEN, JACK, QUEEN, KING }

    public DeckOfStandardCards() {
    	for(Suits s : Suits.values()) {
            for(Names n : Names.values()) {
                StandardCard card = new StandardCard(n.toString(), 
                        s.toString(), n.ordinal());
                _deck.add(card);
            }
    	}
    }

    public ArrayList<StandardCard> getDeck() {
    	return _deck;
    }

    public StandardCard randCard() {
    	int rand = (int)(Math.random() * 52);
    	return _deck.get(rand);
    }
}
