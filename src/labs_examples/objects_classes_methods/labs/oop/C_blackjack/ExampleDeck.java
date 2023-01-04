package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.List;

public class ExampleDeck {
    private List<ExampleCard> cards = new ArrayList<>();
    private char[] suits = new char[]{'♠', '♦', '♥', '♣'};

    public ExampleDeck() {
        for (char suit : suits) {
            for (int cardValue = 1; cardValue <= 13; cardValue++) {
                // create a new card
                ExampleCard newCard = new ExampleCard(cardValue, suit);

                // add new card to running list of cards
                cards.add(newCard);
            }
        }
    }

    public List<ExampleCard> getCards() {
        return cards;
    }

    public ExampleCard dealOneCard() {
        int max = cards.size() - 1;
        int min = 0;

        int randomIndex = (int) (Math.random() * (max - min + 1) + min);

        ExampleCard card = cards.get(randomIndex);
        cards.remove(randomIndex);


        return card;
    }
}
