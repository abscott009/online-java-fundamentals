package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class Dealer {

    private Hand dealerHand = new Hand();

    public void dealerPlay(Deck deck){
        System.out.println();

        while (dealerHand.calculateTotal() <= 16) {
            System.out.println("Dealer has " + dealerHand.calculateTotal()+ " and hits");
            dealerHand.addCard(deck.nextCard());
            System.out.println("Dealer " + this.getHandString(true, false));
        }
        if ( dealerHand.calculateTotal() > 21) {
            System.out.println("Dealer busts. " + this.getHandString(true, false));
        } else {
            System.out.println("Dealer stands. " + this.getHandString(true, false));
        }
    }

    private String getHandString(boolean b, boolean b1) {
    }
}
