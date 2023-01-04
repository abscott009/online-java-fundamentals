package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //Create Deck
    List<Card> deckBuilt = new ArrayList<>();
    static char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    //   private static Suit cardSuit;

    @Override
    public String toString() {
        return "Deck{" +
                "deckBuilt=" + deckBuilt +
                ", num_suits=" + num_suits +
                ", num_ranks=" + num_ranks +
                '}';
    }

    static String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public int num_suits = suits.length;
    public int num_ranks = ranks.length;


    public Deck() {
        for (char suit : suits) {
            for (int cardValue = 1; cardValue <= 13; cardValue++) {
                // create a new card
                Card newCard = new Card(cardValue, suit);

                // add new card to running list of cards
                deckBuilt.add(newCard);

            }
        }
    }

    public List<Card> getCards() {
        return deckBuilt;
    }


        public Card dealOneCard (){
            int max = deckBuilt.size() - 1;
            int min = 0;
        int RandomIndex = (int) (Math.random() * (max - min + 1) + min);
        Card card = deckBuilt.get(RandomIndex);
        deckBuilt.remove(RandomIndex);

        return card;
       }
}

