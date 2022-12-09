package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;

public class Card {

    char[] suit = new char[]{'♠', '♦', '♥', '♣'};
    String[] face = new String[]{"A","2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    int cardValue;

    static ArrayList<String> deck = new ArrayList<String>();

    public void populateDeck(char[] suit, String[] face){
        for(char s : suit) {
            for (String f : face) {
                String card = f + " of " + s;
                deck.add;

            }


       }
   }

    }

