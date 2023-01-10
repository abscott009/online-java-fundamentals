package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */
class ExceptionLabFour {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        try {
            int div1 = nums[2]/nums[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        } try {
            int div2 = nums[0] / 0;
        } catch (ArithmeticException a) {
            System.out.println("Invalid math");
        }

    }

}
