package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String[] dogs = new String[]{"Bruno", "JJ", "Beta", "Sylvie" };

        int n = dogs.length;

        for (int i = n - 1; i >= 0; i--) {
// can't figure every other
            System.out.println(dogs[i]);
        }
    }

}


