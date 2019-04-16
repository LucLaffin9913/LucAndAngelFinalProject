/*
THIS CLASS ACTS AS A VIEW IN MVC PRINCIPALS
IT'S PRIMARY PURPOSE IS TO CALL APPROPRIATE METHODS FROM
OTHER CLASSES AND LET THE USER SEE WHAT IS GOING ON WITH THE GAME
*/

package deliverable3_luclaffin.application;

import java.util.Scanner;

public class BlackJack extends Game {

    BlackJackPlayer _user; //the person playing the game
    BlackJackPlayer _dealer; //the cpu opponent, known as the dealer
    Scanner keys = new Scanner(System.in);

    public BlackJack(String givenName) { //constructor with super call
        super(givenName);
    }

    public void startGame() {
        System.out.println("Hi! Welcome to Black Jack.\n\nWhat is your name?");
        
        //continues ask user for their name until they give a proper string input
        while(true) {
            String userName = keys.nextLine(); //get user input for name
            if(userName.length() > 0) { //make sure the user typed something
                _user = new BlackJackPlayer(userName);
                _dealer = new BlackJackPlayer("Dealer");
                System.out.println("Hi, " + userName + ". Let's start!");
                play(); //call the play method
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
       
       //Keep asking the user if they want another card until they say no
        while(true) {
            System.out.println("\nYour Cards:\n\t" + _user.showHand()); //show hand
            System.out.println("Would you like to draw another card? (Y / N )");
            String ans = keys.nextLine(); //ask if user wants to continue
            
            if(ans.equals("Y") || ans.equals("y")) {
                System.out.println("Okay. Dealing you another card.");
                _user.play(); //deal a card and update player score
                _dealer.play(); //give the dealer a card and update score
                if(_user.checkLoseCondition()) { //check if the user went over 21 points
                     System.out.println("Uh oh. You went over 21 points! "
                            + "Ending game.");
                     declareWinner(); //end game and find a winner if user went over 21
                     break;
                }
            }
            
            else { //treat any input other than Y or y as a no
                System.out.println("Are you sure you don't want to draw "
                        + "any more cards? ( Y / N )"); //confirm with user
                ans = keys.nextLine();
                if(ans.equals("Y") || ans.equals("y")) {
                    declareWinner(); //call method
                    break;
                }
            }
        }
    }
   
    @Override
    public void declareWinner() {
        System.out.println("Okay, let's see who the winner is ...\n");
        int userScore = _user.getScore();  //get the scores
        int dealerScore = _dealer.getScore();
        
        System.out.println("Your score: " + userScore); //show user the scores
        System.out.println("Dealer score: " + dealerScore + "\n");
        
        if(userScore > 21) { //player loses
             System.out.println("You went over 21 points! YOU LOSE!");
        }

        else if(userScore > dealerScore) { //player wins
            System.out.println("And the winner is ..." + _user.getPlayerID() 
                    + "! YOU WIN!!");
        }
        else //player loses if tied points with dealer
            System.out.println("And the winner is ..." + _dealer.getPlayerID() 
                    + "! YOU LOSE!!");
    }
}
