package com.abuob;

public class DeckRunner {

    public static void main(String[] args) {
        DeckList deckList = new DeckList();

//        System.out.println("BEFORE SHUFFLE");
//        deckList.displayDeckContents();
//        deckList.shuffle();
//        System.out.println("AFTER SHUFFLE");
//        deckList.displayDeckContents();

        System.out.println("------------");

        DeckArray deckArray = new DeckArray();
        System.out.println("BEFORE SHUFFLE");
        deckArray.displayDeckContents();
        deckArray.shuffle2();
        System.out.println("AFTER SHUFFLE");
        deckArray.displayDeckContents();

    }
}
