package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Deck extends Card {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;
    int[] deck = new int[52];

        for(int i = 0; i <= deck.length; i++) {
            deck[i] = i;
        }

        for(int i = 0; i < deck.length; i++){
            int index = (int)(Math.random() * deck.length);
            int temp = deck[i];

        }

    }

}
