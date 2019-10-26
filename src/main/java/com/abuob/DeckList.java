package com.abuob;

import com.abuob.enums.Rank;
import com.abuob.enums.Suit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckList {

    private List<Card> cardList = new ArrayList<>();

    public DeckList() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cardList.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cardList);
    }

    public void displayDeckContents() {
        System.out.println(cardList);
        // for(Card card : cardList) {
        //     System.out.println(card);
        // }
    }

    public int numberOfCards() {
        return cardList.size();
    }
}
