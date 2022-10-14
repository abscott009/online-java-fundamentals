package labs_examples.fundamentals.labs;

import videos_source_code.oop.polymorphism.Scooter;

/**
 * Fundamentals Exercise 4: My Second Program
 *
 *      Write the necessary code to display, declare and print each of Java's primitive data types.
 *      Please declare a single variable of each type, give it an appropriate value, then print that variable.
 *
 */

public class Exercise_04 {

    public static void main(String[] args) {

        int i = 1;
        System.out.println("int i is: " + i);

        // write your code below

        boolean blue = true;

        System.out.println("The sky is blue:" + blue);

        char letter = 'L';

        System.out.println("The capital of Louisville is:" + letter);

        byte chief = 117;

        System.out.println("ID number for Master Chief: " + chief);

        short zip = 18051;

        System.out.println("My zip code is: " + zip);

        int phone = 2998085;

        System.out.println("My phone number is: " + phone);

        long miles = 33900000L;

        System.out.println("Approx distance to Mars is " + miles + "miles");

        float km = 54600000f;

        System.out.println("Approx distance to Mars is " + km + "km");

        double inch = 2144904000000.00;

        System.out.println("Approx distance to Mars is " + inch + "inches");


    }

}
