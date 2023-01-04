package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class ExamplePlayer {
    private String name;
    private ExampleHand hand;
    private int wallet;

    public ExamplePlayer(String name, int wallet) {
        this.name = name;
        this.hand = new ExampleHand();
        this.wallet = wallet;
    }

    public int hit(ExampleCard card) {
        return hand.addOneCard(card);
    }
}
