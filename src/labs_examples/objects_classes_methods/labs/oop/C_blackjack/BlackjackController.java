package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

public class BlackjackController {

    public static class Dealer{
        public void Dealer() {
            String dealer;
            Hand hand = null;
    }

    }

    public static void main(String[] args) {
        //new game
        // player entry
//        System.out.println("Welcome to Blackjack!");
//
//        List<Player> table = populateTable();

        //start game

        //Player
        //place bet - temp hold from pot

        //shuffle deck



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
//            while(!nameValid) {
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
    }
    }

