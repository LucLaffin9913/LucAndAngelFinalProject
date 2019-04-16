package deliverable3_luclaffin.application;

import java.util.Scanner;

public class BlackJack extends Game {

    BlackJackPlayer _user; //the person running the game
    BlackJackPlayer _dealer; //the cpu opponent, known as the dealer

    public BlackJack(String givenName) { //constructor with super call
        super(givenName);
    }

    public void startGame() {
        Scanner keys = new Scanner(System.in);
        System.out.println("Hi! Welcome to Black Jack.\n\nWhat is your name?");
        while(true) {
            String userName = keys.nextLine(); //get user input for name
            if(userName.length() > 0) {
                _user = new BlackJackPlayer(userName);
                _dealer = new BlackJackPlayer("Dealer");
                System.out.println("Hi, " + userName + ". Let's start!");
                break;
            }
            else {
                System.out.println("Sorry, please enter a name.");
            }
        }
    }

    @Override
    public void play() {
        
        System.out.println("\nDealing you a staring hand of 2 cards.");
       
        Scanner keys = new Scanner(System.in);
        
        while(true) {
            System.out.println("\nYour Cards:\n\t" +
                            _user.showHand());
            System.out.println("Would you like to draw another card? (Y / N )");
            String ans = keys.nextLine();
            
            if(ans.equals("Y") || ans.equals("y")) {
                _user.play();
                if(_user.getScore() > 21) {
                    System.out.println("Uh oh. You went over 21 points! "
                            + "Ending game.");
                    break;
                }
            }
            
            else {
                System.out.println("Are you sure you don't want to draw "
                        + "any more cards? ( Y / N )");
                ans = keys.nextLine();
                if(ans.equals("Y") || ans.equals("y"))
                    break;
            }
        }
    }
   
    @Override
    public void declareWinner() {
        System.out.println("Okay, let's see who the winner is ...\n");
        int userScore = _user.getScore();
        int dealerScore = _dealer.getScore();
        
        System.out.println("Your score: " + userScore);
        System.out.println("Dealer score: " + dealerScore + "\n");
        
        if(userScore > 21) {
             System.out.println("You went over 21 points! YOU LOSE!");
        }

        else if(userScore > dealerScore) {
            System.out.println("And the winner is ..." + _user.getPlayerID() 
                    + "! YOU WIN!!");
        }
        else
            System.out.println("And the winner is ..." + _dealer.getPlayerID() 
                    + "! YOU LOSE!!");
    }
}
