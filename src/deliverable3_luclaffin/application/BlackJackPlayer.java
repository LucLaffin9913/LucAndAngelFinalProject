/*
THIS CLASS PRIMARILY ACTS AS THE CONTROLLER IN MVC PRINCIPALS
IT HANDLES THE LOGIC OF THE GAME BY USING THE VARIOUS CARD CLASSES
*/

package deliverable3_luclaffin.application;

public class BlackJackPlayer extends Player {

    private int _score; //the users score
    private BlackJackHand _hand = new BlackJackHand(2); //always initial hand size of 2

    public BlackJackPlayer(String name) {
        super(name);
        _score = _hand.calculateScore(); //initial score 
    }

    @Override
    public void play() {
        _hand.addCard(); //draw another card
        _score = _hand.calculateScore(); //update score
    }
    
    public boolean checkLoseCondition() { //check if users scores is over 21
        if(_score > 21) {
            return true; //true = score is over 21
        }
        return false;
    }

    public int getScore() {
        return _score;
    }
    
    public void setScore(int score) {
        _score = score;
    }

    public BlackJackHand showHand() {
        return _hand;
    }
}
