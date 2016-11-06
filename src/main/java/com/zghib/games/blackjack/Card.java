package com.zghib.games.blackjack;
/**
   Card represents one of the 52 cards in a standard deck.
*/
public class Card {


    private final Suit suit;   // The suit of this card
    private int value;  // The value of this card, from 1 to 11.

    public Card(int value, Suit suit) {
        this.value = value;
        this.suit = suit;
    }


    public int getValue() {
        return value;
    }

    /**
     * Return a String representing the card's value.
     * @return  String
     */
    public String toString() {
        String result = "";
        switch (value) {
            case 1:
                result =  "Ace";
                break;
            case 2:
                result = "2";
                break;
            case 3:
                result = "3";
                break;
            case 4:
                result =  "4";
                break;
            case 5:
                result = "5";
                break;
            case 6:
                result = "6";
                break;
            case 7:
                result = "7";
                break;
            case 8:
                result = "8";
                break;
            case 9:
                result =  "9";
                break;
            case 10:
                result =  "10";
                break;
            case 11:
                result =  "Jack";
                break;
            case 12:
                result = "Queen";
                break;
            case 13:
                result = "King";
                break;
        }
        return result + " " + suit.toString();
    }




}