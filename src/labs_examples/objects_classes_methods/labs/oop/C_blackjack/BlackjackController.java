package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {

    public static void main(String[] args){

        int index = (int) (Math.random() * 52);

        Card cardList = new Card();

        cardList.cardDeck();

    }
}
