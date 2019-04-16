package deliverable3_luclaffin.application;

public class Main {
        
    public static void main(String[] args) {
            
        BlackJack game = new BlackJack("BlackJack");
        game.startGame();
        game.play();
        game.declareWinner();
    }
}
