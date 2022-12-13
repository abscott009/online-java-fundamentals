package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck extends Card {

    Card[] cards = new Card[52];
    ArrayList<Integer> usedCards;

    public class CardsDeck {
        private ArrayList<Card> mCards;
        private ArrayList<Card> mPulledCards;
        private Random mRandom;


//    int[] deck = new int[52];
//
//        for(int i = 0; i <= deck.length; i++) {
//            deck[i] = i;
//        }
//
//        for(int i = 0; i < deck.length; i++){
//            int index = (int)(Math.random() * deck.length);
//            int temp = deck[i];

        }
    public void CardsDeck() {
        mRandom = new Random();
        mPulledCards = new ArrayList<Card>();
        mCards = new ArrayList<Card>(Suit.values().length * Rank.values().length);
        reset();
    }

    public void reset() {
        mPulledCards.clear();
        mCards.clear();
        /* Creating all possible cards... */
        for (Suit s : Suit.values()) {
            for (Rank r : Rank.values()) {
                Card c = new Card(s, r);
                mCards.add(c);
            }

    }

}
