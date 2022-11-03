package labs_examples.arrays.labs;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] calc = new int[10];

        System.out.print("Enter (10) numbers: ");

        for(int i = 0; i < calc.length; i++) {
            calc[i] = sc.nextInt();
        }

        int sum = IntStream.of(calc).sum();

        System.out.println("The sum of the array values is: " + sum);

        int avg = sum / calc.length;

        System.out.println("The average of the array values is: " + avg);



        }



    }
