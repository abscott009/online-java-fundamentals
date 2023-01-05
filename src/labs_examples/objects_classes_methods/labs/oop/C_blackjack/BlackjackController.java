package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.Scanner;

public class BlackjackController {
//    public static List<Player> populateTable() {
//        List<String> playerNames = new ArrayList<>();
//
//        List<Player> table = new ArrayList<>();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Number of players at table: ");
//        int numPlayers = sc.nextInt();
//
//        for (int loop = 1; loop <= numPlayers; loop += 1) {
//            boolean nameValid = false;
//
//            while (!nameValid) {
//                System.out.println("Player " + loop + " please enter your name");
//                String playerName = sc.next();
//
//                if (playerNames.contains(playerName)) {
//                    System.out.println("Different name");
//                    continue;
//                }
//
//                if (playerName.length() > 0) {
//                    playerNames.add(playerName);
//
//                    nameValid = true;
//                }
//            }
//        }
//
//        sc.close();
//
//        for (String playerName : playerNames) {
//            Player player = new Player();
//            player.setName(playerName);
//            table.add(player);
//        }
//
//        return table;
//    }

    private static void Count(){
        int playerWin = 0;
        int dealerWin = 0;


    }

    public static void main(String[] args) {

//        Card card = new Card();
        Deck deck = new Deck();
        Player player = new Player();
        Player dealer = new Player();

//        for (Card card : deck.getCards()) {
//            System.out.println(card.getValue() +  " " + card.getSuit());
//        }

        Scanner bet = new Scanner(System.in);


        // for (int betLoop = 1; betLoop <= populateTable().size(); betLoop += 1) {
        System.out.println("Place your bet:");
        int bets = bet.nextInt();

        if (bets > player.getWallet()) {
            System.out.println("Max bet is " + player.getWallet());
            return;
        }

        for (int deal = 1; deal <= 2; deal++) {
            player.addOneCard(deck.dealOneCard());
        }

        for (Card card : player.getHand().getCards()) {
            System.out.println(card);
        }

        Hand playerOneHand = player.getHand();
        int value = playerOneHand.calculateHand();
        System.out.println("HAND VALUE: " + value);

        Scanner hitStand = new Scanner(System.in);
        System.out.println("Hit (H) or Stand (S)? ");
        String call = hitStand.nextLine();

        if (call.equalsIgnoreCase("H")) {
            Card card = deck.dealOneCard();
            System.out.println(card.getValue() + " " + card.getSuit());
        }
        else if (call.equalsIgnoreCase("S")) {
            System.out.println("Player has: " + player.getHand());
        }
        }


//        player.hit(deck.dealOneCard());
//        int playerHandValue = player.hit(deck.dealOneCard());
//
//        System.out.println(playerHandValue);
//
//        if (playerHandValue == 21) {
//            System.out.println("BLACKJACK! You win!");
//            break;
//        } else if (playerHandValue)
//
//    }


                //new game
                // player entry
//        System.out.println("Welcome to Blackjack!");
//
//        List<Player> table = populateTable();
//
//        //Place bets
//        while (player.pot() > 0) {
//
//            System.out.println("Place your bet (type 0 to exit): ");
//            Scanner sc = new Scanner(System.in);
//            int bet = sc.nextInt();
//            int count = 0;
//
//            if (bet < player.pot() || bet > 0)
//                continue;
//            while (true) {
//
//                System.out.println("You hold " + DrawCard() + DrawCard());
//                count += DrawCard();
//                Scanner input = new Scanner(System.in);
//                System.out.println("Hit or Stand? ");
//                String choice = input.nextLine();
//                if (choice.equalsIgnoreCase("hit")) {
//                    System.out.println("You flipped a " + DrawCard());
//                } else if (choice.equalsIgnoreCase("stand")) {
//                    int dealerCount = 0;
//                    for (int t = 0; t < 6; t++) {
//                        System.out.println("Dealer shows: " + deck.getDeck());
//
//                    }
//                }
//
//
//            }

                //Deal cards to player(s)
            }


//
//            for (int d = 0; d < deck.length; d++); {
//                int r = (int)(Math.random() * deck.length);
//                int temp = deck[d];
//                deck[d] = deck[r];
//                deck[r] = temp;
//            }
//            Random random = new Random();
//            int randomSuitIndex = random.nextInt(num_suits);
//            int randomValueIndex = random.nextInt(num_ranks);
//            return deck[randomSuitIndex][randomValueIndex];
//        }
//
//        public static void main(String[] args) {
//            Deck deck = new Deck();
//            Card randomCard = deck.drawRandomCard();

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








