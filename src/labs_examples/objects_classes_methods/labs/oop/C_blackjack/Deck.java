package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    //Create Deck
    List<Card> cards = new ArrayList<>();
    static char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    static String[] ranks = new String[]{"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    public static int num_suits = suits.length;
    public static int num_ranks = ranks.length;


    public Deck() {
        for (char suit : suits) {
            for(String rank : ranks){

//              create a new card
                Card newCard = new Card(rank, suit);

                // add new card to running list of cards
                cards.add(newCard);

            }
        }
    }

    public List<Card> getCards() {
        return cards;
    }


        public Card dealOneCard (){
            int max = cards.size() - 1;
            int min = 0;
        int RandomIndex = (int) (Math.random() * (max - min + 1) + min);
        Card card = cards.get(RandomIndex);
        cards.remove(RandomIndex);

        return card;
       }

    @Override
    public String toString() {
        return "Deck{" +
                "deckBuilt=" + cards +
                ", num_suits=" + num_suits +
                ", num_ranks=" + num_ranks +
                '}';
    }

}

