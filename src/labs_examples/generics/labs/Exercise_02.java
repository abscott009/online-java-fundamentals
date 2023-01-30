package labs_examples.generics.labs;

import java.util.ArrayList;

/**
 * Generics Exercise 2:
 *
 *      Create a class with a generic method that takes in an ArrayList of any Numeric type and returns the sum of all
 *      Numbers in the ArrayList. Demonstrate how to call this method from the main() method.
 */

class Demo{

    public static double sumMethod(ArrayList<? extends Number> arr) {

        double result = 0;

        for (Number i : arr) {
            result += i.doubleValue();
        }

        return result;

        }

    public static void main(String[] args) {

        ArrayList<Number> list = new ArrayList<>();
        list.add(24.1);
        list.add(4.8);
        list.add(35);
        list.add(14f);

        System.out.println("Sum of any value type in ArrayList " + sumMethod(list));


    }



}