package com.zghib.games.blackjack;

/**
 * Deck represents an ordinary deck of 52 playing cards.
 */
public class Deck {

    // An array of 52 Cards, representing the deck.
    private Card[] deck;
    // How many cards have been dealt from the deck.
    private int cardsUsed;

    public Deck() {
        // Create an unshuffled deck of cards.
        deck = new Card[52];
        int cardIndex = 0;
        for (int suit = 0; suit <= 3; suit++) {
            for (int value = 1; value <= 13; value++) {
                deck[cardIndex] = new Card(value, Suit.values()[suit]);
                cardIndex++;
            }
        }
        cardsUsed = 0;
    }


    public void shuffle() {
        // Put all the used cards back into the deck, and shuffle it into a random order.
        for (int i = 51; i > 0; i--) {
            int rand = (int) (Math.random() * (i + 1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand] = temp;
        }
        cardsUsed = 0;
    }

    public Card dealCard() {
        // Deals one card from the deck and returns it.
        if (cardsUsed == 52)
            shuffle();
        cardsUsed++;
        return deck[cardsUsed - 1];
    }

}