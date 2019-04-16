/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deliverable3_luclaffin.application;

import java.util.ArrayList;
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
public class BlackJackHandTest {
    
    public BlackJackHandTest () {
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
     * Test of addCard method, of class BlackJackHand.
     * This test will ensure that a card is being added to the user hand
     * Good input (an initial hand size > 0 will be inputed
     */
    @Test
    public void testAddCardGood() {
        System.out.println("addCard Good");
        BlackJackHand instance = new BlackJackHand(5); //create hand of 5 cards
        ArrayList<StandardCard> hand = instance.showHand(); //get hand
        instance.addCard(); //hand should now have size 6
        instance.addCard(); //hand should now have size 7
        int expResult = 7;
        int size = hand.size(); //actual size of hand
        assertEquals(expResult, size);
    }
    
    /**
     * Test of addCard method, of class BlackJackHand.
     * This test will ensure that a card is being added to the user hand
     * Bad input (an initial hand size less than 0 will be inputed
     * method should default to hand size 0 in this scenario
     */
    @Test
    public void testAddCardBad() {
        System.out.println("addCard Bad");
        BlackJackHand instance = new BlackJackHand(-1); //input invalid handsize
        ArrayList<StandardCard> hand = instance.showHand(); //get hand
        instance.addCard(); //hand should now have size 1 (should default to 0 with an entry of -1)
        instance.addCard(); //hand should now have size 2
        int expResult = 2;
        int size = hand.size(); //actual size of hand
        assertEquals(expResult, size);
    }
    
     /**
     * Test of addCard method, of class BlackJackHand.
     * This test will ensure that a card is being added to the user hand
     * Boundary input with an initial hand size of 0
     */
    @Test
    public void testAddCardBoundary() {
        System.out.println("addCard Boundary");
        BlackJackHand instance = new BlackJackHand(0); //input invalid handsize
        ArrayList<StandardCard> hand = instance.showHand(); //get hand
        instance.addCard(); //hand should now have size 1 (should default to 0 with an entry of -1)
        instance.addCard(); //hand should now have size 2
        int expResult = 2;
        int size = hand.size(); //actual size of hand
        assertEquals(expResult, size);
    }
}
