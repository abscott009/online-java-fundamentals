package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class ExampleBlackjackController {

    public static void main(String[] args) {

        ExampleDeck deck = new ExampleDeck();
        ExampleCard card1 = deck.dealOneCard();
        System.out.println("MY CARD IS:" + card1.getValue() + " " + card1.getSuit());


        for (ExampleCard card : deck.getCards()) {
            System.out.println(card.getValue() +  " " + card.getSuit());
        }

        ExamplePlayer player = new ExamplePlayer("jow", 100);
        player.hit(deck.dealOneCard());
        int playerHandValue = player.hit(deck.dealOneCard());

        System.out.println(playerHandValue);
    }


}
