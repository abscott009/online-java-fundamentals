package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class ExceptionLabOne {
    public static void main(String[] args) {

            int[] nums = {1, 2, 3};
        try {
        int math = nums[2]/nums[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        }

    }

}