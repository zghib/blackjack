package com.zghib.games.blackjack;

import java.util.ArrayList;
import java.util.List;

/**
 * Player represent a human or dealer player.
 */
public class Player {
    private String name;
    private final List<Card> hand = new ArrayList<>();

    public Player(String name) {
        this.name = name;
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public int getHandSum() {
        int result = 0;
        int value;
        for (int i = 0; i < hand.size(); i++) {
            value = hand.get(i).getValue();
            if (value == 1) { //Ace
                result += 11;
            } else if (value > 10) { //face
                result += 10;
            } else {
                result += value;
            }
        }
        return result;
    }

    public void printHand(boolean showFirstCard) {
        System.out.printf("%s's cards:\n", name);
        for (int i = 0; i < hand.size(); i++) {
            if (i == 0 && !showFirstCard) {
                System.out.println(" Hidden");
            } else {
                System.out.printf(" %s\n", hand.get(i).toString());
            }
        }
        System.out.println();
    }
}
