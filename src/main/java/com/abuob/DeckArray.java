package com.abuob;

import com.abuob.enums.Rank;
import com.abuob.enums.Suit;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class DeckArray {

    private final Card[] cards = new Card[52];

    private int numCards;

    public DeckArray() {
        numCards = 0;
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards[numCards] = new Card(suit, rank);
                numCards++;
            }
        }
    }

    public void shuffle() {
        Random random = new Random();

        Card tempCard;
        int r;
        for (int i = 0; i < cards.length; i++) {
            r = random.nextInt(cards.length);
            tempCard = cards[i];
            cards[i] = cards[r];
            cards[r] = tempCard;
        }
    }

    public void shuffle2() {
        Collections.shuffle(Arrays.asList(cards));
    }

    public void displayDeckContents() {
       for (Card card : cards) {
            System.out.println(card);
        }
    }

    public int getNumCards() {
        return numCards;
    }
}
