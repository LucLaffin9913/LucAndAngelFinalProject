package deliverable3_luclaffin.application;

public class BlackJackPlayer extends Player {

    private int _score;
    private final BlackJackHand _hand = new BlackJackHand(2);

    public BlackJackPlayer(String name) {
        super(name);
        _score = 0;
    }

    @Override
    public void play() {
        System.out.println("Okay. Dealing you another card.");
        _hand.addCard();
        _score = _hand.calculateScore();
    }

    public int getScore() {
        return _score;
    }

    public BlackJackHand showHand() {
        return _hand;
    }
}
