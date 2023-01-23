package labs_examples.enumerations.labs;

import java.util.Scanner;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a separate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a separate class.
 */

class Exercise_01{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of strokes: ");
        int stroke = sc.nextInt();

        switch (stroke){
            case 1:
                System.out.println(Golf.ACE);
                break;

            case 2:
                System.out.println(Golf.EAGLE);
                break;

            case 3:
                System.out.println(Golf.BIRDIE);
                break;

            case 4:
                System.out.println(Golf.PAR);
                break;

            case 5:
                System.out.println(Golf.BOGIE);
                break;

            default:
                System.out.println("Have you considered taking up bowling?");
                break;
        }

    }

     public enum Golf{
        ACE("HOLE IN ONE!"),
         EAGLE("EAGLE! Way to go!"),
         BIRDIE("BIRDIE! Not bad."),
         PAR("Par, right on track."),
         BOGIE("Bogie, keep practicing");

         private String score;

         public String getScore() {
             return score;
         }

         Golf(String score){
             this.score = score;
         }



     }
}