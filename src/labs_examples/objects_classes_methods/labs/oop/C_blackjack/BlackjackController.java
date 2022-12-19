package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {

    public static void main(String[] args){

        //new game

            //# of players
            // player entry

        //start game
            //Player
                //place bet - temp hold from pot

            //radomize deck
            //deal 1 card each - remove from deck - then deal another - remove from deck

            //Hand
                //calculate hand value
                    //rules and exceptions
                        //21 = winner
                        //

            //Player
                //Options: Hit - Stand
                    //Hit - remove card from deck
                    //specials - split or double
                        //remove $ from pot

            //Hand
                //evaluate player hand after each hit - Player can hit until bust or stand

            //Dealer receives cards
                // <= 16 Hit, >= 17 Stand

            // Evaluate player vs dealer
                //





        int index = (int) (Math.random() * 52);

        Deck deck = new Deck();

        System.out.println(deck);

    }
}
