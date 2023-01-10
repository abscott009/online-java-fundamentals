package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */

class ExceptionLabFive {

    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {


        System.out.println(ExceptionLabFive.Math(5));

    }

    private static int Math(Integer index) throws ArrayIndexOutOfBoundsException {

        int[] count = {1, 2, 3, 4, 5};

        int x = 0;

        try {

            x = count[2] * count[index];

        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("You accessed something out of bounds");
        }

        return x;
    }
}

