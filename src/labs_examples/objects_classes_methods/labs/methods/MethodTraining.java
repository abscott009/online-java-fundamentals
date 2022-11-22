package labs_examples.objects_classes_methods.labs.methods;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MethodTraining {
    public static void main(String[] args) {

//         1 WORKS
        double x = addition(4, 65, 45);
        System.out.print(x);

//         2


//        3 WORKS
            int[] myNums = new int[]{1, 5, 8, 13};
            System.out.println("Largest in given array is " + largestOfFour(myNums));
//
//        4 WORKS
            int c = consonants("");
            System.out.println(c + " consonants found.");
//
//        5 WORKS
        if (prime(79)) {
            System.out.println("prime number");
        }
        else {
            System.out.println("not a prime number");
        }

//
//         6. WORKS
       int[] digits = new int[]{2, 4, 12, 8, 14, 22, 5};
       highLow(digits);

//
//        // 7 WORKS
        List<Integer> result = divisor(100, 3,5);
        System.out.println(result);
        System.out.println(result.size());
//
//        // 8 WORKS
        int[] fwdNums = new int[]{12, 5, 65, 125, 3, 54};
        revNums(fwdNums);

//

    }

//1.Demonstrate method overloading in this class

    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static double addition(double a, double b){
        return a+b;
    }
//
// 2. Demonstrate the difference between "pass by value" and "pass by reference"
    public static void passByValue(String[] args) {

        Dog aDog = new Dog("Brown", "Shepard", "F");
        System.out.println(aDog.getColor());
        dyeDog(aDog);
        System.out.println(aDog.getColor());


        Dog bigDog = aDog;

        // fur(aDog);
        String color = aDog.getColor();
        System.out.println(color);
        appendColor(color);
        // "BrownBlue"
        System.out.println(color);

        boolean colorIsBrown = isBrown(color);
        System.out.println(colorIsBrown);

    }



    // pass by reference
    public static void dyeDog(Dog dog) {
        dog.setColor("Blue");
    }

    public static void appendColor(String color) {
        color += "Blue";
    }

    public static boolean isBrown(String color) {
        color = "Blue";

        return color.equals("Brown");
    }



//
//    3.Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
 public static int largestOfFour(int[] arr) {

       int max = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max);
            max = arr[i];

        }
     return max;
    }
//
//    //4.Write a method to count all consonants (the opposite of vowels) in a String
    public static int consonants(String args) {

        int count = 0;

        System.out.println("Enter a statement: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                continue;
            }
            else if(ch >= 'a' && ch <= 'z'){
                count++;
            }

    }
      return count;
    }


//    //5. Write a method that will determine whether or not a number is prime
    public static boolean prime(int num) {

        if (num <= 1)
            return false;

        else if (num == 2)
            return true;

        else if (num % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if ((num % i) == 0)
                return false;
        }
        return true;
    }

//    6.Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
//      which is passed in as an argument
    public static void highLow(int[] val) {

        int low = val[0];
        int high = val[0];

        for (int i = 1; i < val.length; i++)
            if (val[i] > high)
                high = val[i];

        for (int i = 1; i < val.length; i++)
            if (val[i] < low)
                low = val[i];



        System.out.println(low + " is the lowest number.");
        System.out.println(high + " is the highest number.");

    }


//
//    7.Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
//            In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
//           divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
//           length of the returned list

    public static List<Integer> divisor(int maxNum, int divisor1, int divisor2) {

        List<Integer> evens = new ArrayList<>();

        for (int i = 0; i <= maxNum; i++) {
            if (i % divisor1 == 0 && i % divisor2 == 0){
                evens.add(i);
            }
        }
        return evens;
    }


//    8.Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
//          instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
//           variable is used to temporarily store individual values in the array

    public static void revNums(int[] nums) {

        int temp = 0;

        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }

            for (int i : nums) {

                System.out.print(i + " ");
            }
    }

}
