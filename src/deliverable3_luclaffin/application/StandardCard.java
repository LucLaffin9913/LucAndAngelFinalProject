package deliverable3_luclaffin.application;

public class StandardCard extends Card {

    private final String _name;
    private final String _suit;
    private final int _value;
    private enum Suits { HEARTS, SPADES, DIAMONDS, CLUBS };

    public StandardCard(String name, String suit, int value) {
        _name = name;
        _suit = suit;
        _value = value;
    }
  	
    public String getSuit() {
        return _suit;
    }

    public String getName() {
        return _name;
    }
    
    public int getValue() {
        return _value;
    }
    
    @Override
    public String toString() {
        return "[Value: " + _name + ", Suit: " + _suit + "]";
    }

}
