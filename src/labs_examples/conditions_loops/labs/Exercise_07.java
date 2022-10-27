package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

    public class Exercise_07 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a word: ");

            String s = sc.next();
            int l = s.length();
            int i = 0;
            String str = "aeiou";
            while (i < l) {

                char c = s.charAt(i);
                i++;
                int letter = str.indexOf(c);
                if (letter > -1) {
                    System.out.println("Vowel found:" + c);

                    break;
                }
            }


        }




      /**  while(str == strcharAt(i)) {
            String sc = scanner.next();
            str = sc.next();
            str = str.charAt(i) == 'a';
            str = str.charAt(i) == 'e';
            str = str.charAt(i) == 'i';
            str = str.charAt(i) == 'o';
            str = str.charAt(i) == 'u';

            System.out.println("The first vowel is: " + str);*/

        }

