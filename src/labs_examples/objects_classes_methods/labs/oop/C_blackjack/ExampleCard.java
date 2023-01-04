package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class ExampleCard {
    private int value;
    private char suit;

    public ExampleCard(int newCardValue, char suit) {
        this.value  = newCardValue;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }
}
