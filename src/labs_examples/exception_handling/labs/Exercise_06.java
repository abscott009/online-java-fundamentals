package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ExceptionLabSix {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {


        try  {
            System.out.println(ExceptionLabSix.Math(5));
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Index out of bounds");

        }

    }

    private static int Math(Integer index) throws ArrayIndexOutOfBoundsException {

        int[] count = {1, 2, 3, 4, 5};

        int x = 0;

           x = count[2] * count[index];

        return x;
    }
}