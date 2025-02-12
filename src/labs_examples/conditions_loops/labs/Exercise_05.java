package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // prompt user
        System.out.println("Enter two numbers " + "(press enter after each number): ");
        // assign input to variable as int
        int n1, n2, total;
        n1 = scanner.nextInt();
        n2 = scanner.nextInt();
        total = 0;

        for(int i = n1 ; i <= n2; i++) {
            total = total + i;
        }
        System.out.println("Total:" + total);

        double avg = 0;
        int add = 0;
        int den = n2 - n1;

        double total2 = n1;
        int numsBetween = 1;

        for (int i = n1 + 1; i <= n2; i++) {
            total2 += i;
            numsBetween++;
        }

        avg = total2 / numsBetween;
        System.out.println("Average:" + avg);
        }
    }



