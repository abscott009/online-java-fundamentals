package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class ExampleHand {
    private List<ExampleCard> cards;

    public ExampleHand() {
        cards = new ArrayList<>();
    }

    public int addOneCard(ExampleCard card) {
        this.cards.add(card);
        return calculateHandValue();
    }

    private int calculateHandValue() {
        int value = 0;
        int numAces = 0;

        for (ExampleCard card : this.cards) {
            if (card.getValue() > 10) {
                value += 10;
            } else if (card.getValue() == 1) {
                numAces += 1;
            } else {
                value += card.getValue();
            }
        }

//        for (int i = 0; i <= numAces; i++) {
//            // fix this bug later
//            if (value <= 10) {
//                value += 11;
//            } else {
//                value += 1;
//            }
//        }

        return value;
    }


}
