package com.zghib.games.blackjack;


import org.junit.Test;

import java.util.Scanner;

import static org.junit.Assert.assertEquals;

/**
 * Test Card .
 */
public class CardTest {

    @Test
    public void testToString(){
        Card card = new Card(3, Suit.Clubs);
        assertEquals(3, card.getValue());
        assertEquals("3 Clubs", card.toString());
    }
}
