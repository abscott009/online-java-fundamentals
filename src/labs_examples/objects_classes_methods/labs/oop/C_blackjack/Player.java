package labs_examples.objects_classes_methods.labs.oop.C_blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    public static void Player(String name, Hand hand, int potValue) {
        this.name = name;
        this.hand = hand;
        this.potValue = potValue;

        public String getName() {
        return name;
    }

        public void setName() {
            this.name = name;
        }
    }
    public void addPlayers() {

        ArrayList<Player> table = new ArrayList<Player>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Number of players at table: " );

                int numberOfPLayers = sc.nextInt();

        for (int loop = 1; loop <= NumberOfPlayers; loop++) {

            do {
                System.out.println("Player " + loop + " please enter your name");
                playerName = sc.nextLine();
                if(playerName.length()!=0){
                    valid = true;
                    for(Player play : table)
                        if(play.getName().equalsIgnoreCase(playerName))
                            valid = false;

                    if(valid){
                        Player player = new Player();
                        player.setName(playerName);
                        table.add(player);
                    }
                }
            } while (!valid);
        }
        sc.close();
    }
}
