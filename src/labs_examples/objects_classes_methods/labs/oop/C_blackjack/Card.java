package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private int value;
    private char suit;

    public Card(int cardValue, char suit) {
        this.value = cardValue;
        this.suit = suit;
    }

    public Card() {
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






