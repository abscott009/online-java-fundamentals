package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Deck extends Card {
    //Create Deck

    public Card[][] deck;
    public int num_suits = Suit.values().length;
    public int num_ranks = Rank.values().length;

    public Deck() {
        super();
        deck = new Card[num_suits][num_ranks];

        Rank[] ranks = Rank.values();
        Suit[] suits = Suit.values();

        for (int i = 0; i < num_suits; i++) {
            Suit suit = suits[i];
            for (int j = 0; j < num_ranks; j++) {
                Rank rank = ranks[j];
                deck[i][j] = new Card(suit, rank);
                
            }
            
        }
    }

    public Card[][] getDeck() {
        return deck;
    }

    public void setDeck(Card[][] cards) {
    }

    public Object nextCard() {
    }
}


