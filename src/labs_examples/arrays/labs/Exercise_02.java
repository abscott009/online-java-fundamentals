package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 *  More labs_examples.arrays
 *
 *      Using the array below, take in a number from 1-10 from the user and print out the index of that
 *      element.
 *
 */



public class Exercise_02 {

    public static void main(String[] args) {

        int[] array = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        // write code here
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number between 1 and 10: ");

        int num = sc.nextInt();

        for (int i = 0; i <= array.length-1; i++){
            if (num == array[i]) {
                System.out.println("The position of " + num + " is " + i);
            }
        }

//        List<Integer> myInts = Arrays.stream(array).boxed().toList();
//
//        boolean numFound = false;
//        for (Integer number : myInts) {
//
//            if (number == num) {
//                System.out.println(myInts.indexOf(num));
//                numFound = true;
//                break;
//            }
//        }
//
//        if (!numFound) {
//            System.out.println("Num not found.");
//        }




    }
}