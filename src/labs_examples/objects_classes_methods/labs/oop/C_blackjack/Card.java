package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Card {

    private String rank;
    private char suit;

    public Card(String rank, char suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getCardValue(){
        if (rank.equals("A")){
            return 11;
        } else if (rank.equals("J") || rank.equals("Q") || rank.equals("K")){
            return 10;
        } else {
            return Integer.parseInt(rank);
        }
    }

    public Card() {
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public char getSuit() {
        return suit;
    }

    public void setSuit(char suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + suit;
    }

}






