package com.zghib.games.blackjack;

import java.util.Scanner;

/**
 *
 */
public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        Player player = new Player("Player");
        Player dealer = new Player("Dealer");
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());
        player.addCard(deck.dealCard());
        dealer.addCard(deck.dealCard());

        System.out.println("Initial Draw");
        dealer.printHand(false);
        player.printHand(true);
        boolean playerStop = false;
        boolean dealerStop = false;
        String ans;
        while (!playerStop) {
            System.out.println("Do you want to draw another card? (Y/N)");
            ans = scanner.next();
            if (ans.compareToIgnoreCase("Y") == 0) {
                player.addCard(deck.dealCard());
                player.printHand(true);
                if (player.getHandSum() > 21) {
                    playerStop = true;
                    dealerStop = true;
                }
            } else {
                playerStop = true;
            }
            System.out.println(player.getHandSum());
        }
        while (!dealerStop) {
            if (!dealerStop) {
                if (dealer.getHandSum() < 17) {
                    System.out.println("The dealer hits");
                    dealer.addCard(deck.dealCard());
                    dealer.printHand(false);
                    if (dealer.getHandSum() > 21) {
                        dealerStop = true;
                    }
                } else {
                    dealerStop = true;
                }
            }
            System.out.println();
        }
        scanner.close();
        player.printHand(true);
        dealer.printHand(true);
        int playerSum = player.getHandSum();
        int dealerSum = dealer.getHandSum();
        if (playerSum > dealerSum && playerSum <= 21 || dealerSum > 21) {
            System.out.println("Player WINS!!!");
        } else {
            System.out.println("Dealer WINS!!!");
        }
    }
}
