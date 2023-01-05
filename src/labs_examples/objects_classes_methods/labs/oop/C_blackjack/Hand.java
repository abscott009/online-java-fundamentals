package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private List<Card> cards;

    public Hand() {
        this.cards = new ArrayList<>();
    }

    public int addOneCard(Card card) {
        this.cards.add(card);
        return calculateHand();
    }

    public int calculateHand() {
        int value = 0;
        boolean ace = false;

        for (Card myCard : this.cards) {
            if (myCard.getValue() > 10) {
                value += 10;
            }
                if (myCard.getValue() == 1) {
                ace = true;
                value += 1;
            } else {
                value += myCard.getValue();
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

