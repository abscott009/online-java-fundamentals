package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class ExceptionLabThree {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        try {
            int div1 = nums[2]/nums[3];
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid index");
        } finally {
            System.out.println("Go back to shcool");
        }
        }

    }

