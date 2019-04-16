package deliverable3_luclaffin.application;

import java.util.ArrayList;

public class BlackJackHand extends GroupOfCards {

    private final DeckOfStandardCards deckOfStandardCards = new DeckOfStandardCards(); //create deck of standard cards of size 52
    private final ArrayList<StandardCard> _hand = new ArrayList<>();

    public BlackJackHand(int givenSize) {
        super(givenSize);
        for(int i=0; i < givenSize; i++) {
            _hand.add(deckOfStandardCards.randCard());
        }
    }

    public void addCard() {
        _hand.add(deckOfStandardCards.randCard());
    }

    public ArrayList<StandardCard> showHand() {
        return _hand;
    }

    public int calculateScore() {
        int total = 0;
        for(int i = 0; i < _hand.size(); i++) {
            int value = _hand.get(i).getValue();
            if(value > 10)
                value = 10;
            total += value;
        }
        return total;
    }
}
