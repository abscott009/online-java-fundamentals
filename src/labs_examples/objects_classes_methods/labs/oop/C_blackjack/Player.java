package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Player {
    private String name;
    private int wallet;
    private Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
        this.wallet = 100;
    }


    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int addOneCard(Card card) {
        return hand.addOneCard(card);
    }


}
