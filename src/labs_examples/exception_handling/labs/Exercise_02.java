package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */
class ExceptionLabTwo {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        try {
            int div1 = nums[2] * nums[3] / 0;
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        } catch (ArithmeticException a) {
            System.out.println("Invalid math");
        }

    }

}

