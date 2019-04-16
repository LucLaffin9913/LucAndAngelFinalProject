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
public class BlackJackPlayerTest {
    
    public BlackJackPlayerTest() {
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
     * Test of showHand method, of class BlackJackPlayer.
     * This test will confirm that the user starts with a hand size
     * of 2 cards when the User is created
     */
    @Test
    public void testShowHand() {
        System.out.println("showHand");
        BlackJackPlayer testPlayer = new BlackJackPlayer("Good String Name");
        BlackJackHand hand = testPlayer.showHand();
        int handSize = hand.getSize();
        int expResult = 2;
        assertEquals(expResult, handSize);
    }
    
    //USE CASE: LOSS CONDITION
    //CHECKING IF USER WENT OVER 21 POINTS 
    //THEREFORE LOSING GAME
    @Test
    public void testCheckLoseConditionGood() {
        BlackJackPlayer testUser = new BlackJackPlayer("Test User");
        testUser.setScore(22); //set user score to over 21
        boolean expResult = true; //we expect the lose condition to be true
        boolean lose = testUser.checkLoseCondition();
        assertEquals(expResult, lose);
    }
    
    @Test
    public void testCheckLoseConditionBad() {
        BlackJackPlayer testUser = new BlackJackPlayer("Test User");
        testUser.setScore(20); //set user score to less 21
        boolean expResult = false; //we expect the lose condition to be false
        boolean lose = testUser.checkLoseCondition();
        assertEquals(expResult, lose);
    }
    
    @Test
    public void testCheckLoseConditionBoundary() {
        BlackJackPlayer testUser = new BlackJackPlayer("Test User");
        testUser.setScore(21); //set user score equal to 21
        boolean expResult = false; //we expect the lose condition to be false
        boolean lose = testUser.checkLoseCondition();
        assertEquals(expResult, lose);
    }
    
}
