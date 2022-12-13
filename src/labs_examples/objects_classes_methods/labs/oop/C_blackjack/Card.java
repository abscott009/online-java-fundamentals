package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Card {

    String[] suit = new String[]{"♠", "♦", "♥", "♣"};
    String[] rank = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
    int cardValue;

    ArrayList<Card> cards = new ArrayList<Card>();

    public Card(String suit, String rank) {
    }

    public Card() {

    }

    public void cardDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.length; j++) {
                this.cards.add(new Card(suit[i], rank[j]));

                System.out.println(cards);
            }
        }
    }
}

