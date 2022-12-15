package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Hand {

    //Each player/dealer recieves 1 random card - cards is removed from Deck - everyone receives 2nd card -
    //cards removed from Deck.

    //Value of all Hands evaluated.
        //21 = Blackjack
            //If only Dealer blackjack - "Dealer Wins"
                //Take wager from Player
            //If only PLayer blackjack - "You Win!"
                //Double wager back to Player Pot
            //If both blackjack - "Draw"
                //Wager returned to Player Plot


        //Dealer Rules
            //if Hand <= 16 must hit after player turn complete
            //if >= 17 must stand


    ArrayList<Card> cards;
    int handValue;
    ArrayList<Integer> usedCards;
    private ArrayList<Card> mPulledCards;
    private Random mRandom;

    //If Player hits - 3rd/4th/etc random card assigned


//    public int geetHandValue() {
//        int handValue = 0;
//        for (Card c  : cards) {
//            String face = c.face;
//            // if ace: do something to get 1 or 11
//            // if K : do something else
//        }
//
//        return handValue;
//    }

}
