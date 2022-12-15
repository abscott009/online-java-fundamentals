package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Arrays;

public class Deck extends Card {
    //Create Deck

    public Card[][] deck;
    public static final int num_suits = Suit.values().length;
    public static final int num_ranks = Rank.values().length;

    public Deck() {
        super();
        deck = new Card[num_suits][num_ranks];

        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for (int i = 0; i < num_suits; i++) {
            Suit suit = suits[i];
            for (int j = 0; j < num_ranks; j++) {
                Rank rank = ranks[j];
                deck[i][j] = new Card(suit, rank);

                System.out.println(Arrays.toString(deck[j]) + " of " + Arrays.toString(deck[j]));
            }

        }
    }
}

//    ArrayList<Card> deck = new ArrayList<>();
//    getSuit();
//    getRank();
////Shuffle/Randomize Deck
//    public void cardDeck() {
//        for (int i = 0; i < suits.length; i++) {
//            for (int j = 0; j < rank.length; j++) {
//                this.deck.add(new Card(suits[i], rank[j]));
//
//            }
//        }
//    }
//        for(int i = 0; i < deck.length; i++){
//            int index = (int)(Math.random() * deck.length);
//            int temp = deck[i];
//
//    }
//}
