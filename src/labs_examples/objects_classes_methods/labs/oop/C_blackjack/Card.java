package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    static char[] suits = new char[]{'♠', '♦', '♥', '♣'};
    private static Suit cardSuit;
    private Rank cardRank;

    Card(Suit cardSuit, Rank cardRank) {
        this.cardRank = cardRank;
        this.cardSuit = cardSuit;
    }

    public Card() {

    }

    enum Rank{
        A(1), TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7),
        EIGHT(8), NINE(9), TEN(10), J(10), Q(10), K(10);

        private final int cardValue;
        Rank(int cardValue) {
            this.cardValue = cardValue;
        }
    }

    enum Suit {
        SPADE, DIAMOND, HEART, CLUB;
    }

    public Rank getRank() {
        return cardRank;
    }

    public Suit getSuit() {
        return cardSuit;
    }

    public static Card valueOf(int num){
        int suitNum = num % 4;
        int rankNum = num % 13;
        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();
        Card c = new Card(suits[suitNum], ranks[rankNum]);
        return c;
    }


}







