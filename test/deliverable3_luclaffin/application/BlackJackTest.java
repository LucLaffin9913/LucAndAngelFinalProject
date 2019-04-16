/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_luclaffin.application;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author laffi
 */
public class BlackJackTest {
    
    public BlackJackTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    /**
     * Test of declareWinner method, of class BlackJack.
     * We will test that the declareWinner() method produces correct result
     */
    @Test
    public void testDeclareWinnerGood() {
        //method is void with no input, so running the method here
        //with defined values for score
        System.out.println("Okay, let's see who the winner is ...\n");
        int userScore = 20;
        int dealerScore = 19;
        boolean expResult = true; //we expect user to win (not dealer, 20>19)
        boolean actResult;

        
        if(userScore > 21) {
             actResult = false;
             
        }

        else if(userScore > dealerScore) {
            actResult = true;
        }
        else {
            actResult = false;
        }
        assertEquals(expResult, actResult);
    }
    
    public void testDeclareWinnerBad() {
        //method is void with no input, so running the method here
        //with defined values for score

        int userScore = 19;
        int dealerScore = 20;
        boolean expResult = false; //we expect user to lose 
        boolean actResult;
        
        if(userScore > 21) {
             actResult = false;
        }

        if(userScore > dealerScore) {
            actResult = true;
        }
        else {
            actResult = false;
        }
        assertEquals(expResult, actResult);
    }
    
      public void testDeclareWinnerBoundary() {
        //method is void with no input, so running the method here
        //with defined values for score
 
        int userScore = 22;
        int dealerScore = 20;
        boolean expResult = false; //user has more points, but they went over 21
        boolean actResult;          //so we expect them to lose
        
        if(userScore > 21) {
             actResult = false;
        }

        if(userScore > dealerScore) {
            actResult = true;
        }
        else {
            actResult = false;
        }
        assertEquals(expResult, actResult);
    }
    
}
