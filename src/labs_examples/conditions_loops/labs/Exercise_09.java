package labs_examples.conditions_loops.labs;

/**
 * Conditions and Loops Exercise 9: break
 *
 *      Demonstrate the use of the "break" statement to exit a loop.
 *
 */

public class Exercise_09 {

    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            if (i == 50) {
                break;
            }
        }
    }
}