package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */


    class ExceptionLabSeven {

        public static void main(String[] args) throws MySpecialException {


            try  {
                System.out.println(labs_examples.exception_handling.labs.ExceptionLabSeven.Math(5));
            } catch (MySpecialException a) {
                System.out.println("Index out of bounds");

            }

        }

        private static int Math(Integer index) throws MySpecialException {

            int[] count = {1, 2, 3, 4, 5};

            int x = 0;

            x = count[2] * count[index];

            return x;
        }
    }