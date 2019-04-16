/*
THIS CLASS REPRESENTS THE USERS CURRENT HAND
*/

package deliverable3_luclaffin.application;

import java.util.ArrayList;

public class BlackJackHand extends GroupOfCards {

    //create deck of standard cards of size 52
    private DeckOfStandardCards deckOfStandardCards = new DeckOfStandardCards();
    private ArrayList<StandardCard> _hand = new ArrayList<>(); //users hand

    public BlackJackHand(int givenSize) {
        super(givenSize);
        if(givenSize > 0) { //make sure the hand size is greater than 0, no negatives
            for(int i=0; i < givenSize; i++) {
                _hand.add(deckOfStandardCards.randCard()); //initialize hand with 2
            }                                           //random StandardCards from the deck
        }
    }

    public void addCard() {
        _hand.add(deckOfStandardCards.randCard()); //add a random card from 
    }                                              //deck to hand

    public ArrayList<StandardCard> showHand() {
        return _hand;
    }

    public int calculateScore() { //calculate the current score of the players hand
        int total = 0;
        for(int i = 0; i < _hand.size(); i++) {
            int value = _hand.get(i).getValue();
            if(value > 10) //face cards (JACK, QUEEN, KING) are just 10 points
                value = 10;
            total += value;
        }
        return total;
    }
    
    public String toString() {
        return _hand.toString(); //return user friendly string, no reference to array
    }
}
