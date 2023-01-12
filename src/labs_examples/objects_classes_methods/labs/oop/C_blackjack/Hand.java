package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }

    public int addOneCard(Card card) {
        cards.add(card);
        return calculateHand();
    }

    public int calculateHand() {
        int value = 0;

        for (Card myCard : cards) {
            if (myCard.getCardValue() == 11 && value + 11 > 21){
                value += 1;
            } else {
                value += myCard.getCardValue();
            }
        }

        return value;
    }


    public List<Card> getCards() {
        return this.cards;
    }
//    public String winLose() {
//        if (calculateHand() == 21) {
//            System.out.println("Blackjack! You win!");
//        }
//        if (this.dealerHand == 21) {
//            System.out.println("Dealer Blackjack. You lose. ");
//        }
//    }
}

