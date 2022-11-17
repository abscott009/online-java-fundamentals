package labs_examples.objects_classes_methods.labs.methods;

import java.util.Scanner;

public class MethodTraining {
    public static void main(String[] args){

        // 1
        int x = addition(4, 65);
        System.out.print(x);

        // 2
        int a = 4;
        int b = 53;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        passByValue(a, b);

        passByRef();

        // 3
        int z = largestOfFour(1, 2, 3, 451);

        System.out.println("Largest in given array is " + z);

        // 4
        consonants("krankenhaus");

        // 5
        prime(437);

        // 6
        highLow(2, 4, 12, 8, 14, 22, 5);

        // 7

        // 8
        int[] revNums = {12, 5, 65, 125, 3, 54};


    }

//1.Demonstrate method overloading in this class

    public static int addition(int a, int b){
        return a+b;
    }
    public static int addition(int a, int b, int c){
        return a+b+c;
    }
    public static double addition(double a, double b){
        return ((int)(a+b));
    }

//2. Demonstrate the difference between "pass by value" and "pass by reference"

    public static void passByValue(int a, int b) {

        a = a * 1325;
        System.out.println(a);
        b = b + 789;
        System.out.println(b);
    }

        public static void passByRef(String[] args){

        MethodTraining methodTraining = new MethodTraining();

        Dog dog = new Dog("Brown", "German Shepard", "Female");

        System.out.print("The breed is: " + dog.breed());

        public static void changeColor(Dog dog){
            dog.color = "Black";
            }
    }

    //3.Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)
    public static int largestOfFour(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if ([i] >max)
            max = arr[i];

            return max;
        }
    }

    //4.Write a method to count all consonants (the opposite of vowels) in a String
    public static int consonants(String[] args) {

        int count = 0;

        System.out.println("Enter a statement: ");
        Scanner sc = new Scanner(System.in);
        String statement = sc.nextLine();

        for (int i = 0; i <statement.length(); i++) {
            char ch = statement.charAt(i);
            if (ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                System.out.print("");
            }
            else if (ch != ''){
                count++;
            }
        }
System.out.println("There are " + count + " consonants in that statement.");
    }


    //5. Write a method that will determine whether or not a number is prime
    public static boolean prime(int num) {

        if (num <= 1) {
            return false;
        }
        for (int i=2; i<=num/2; i++){
            if((num%1)==0)
                return false;
        }
        return true;

        if(prime(num)){
            System.out.println(num + " is a prime number");
        }
        else {
            System.out.println(num + " is not a prime number");
        }
    }
    //6.Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
    //  which is passed in as an argument
    public static void highLow(String[] nums){

        int count = 0;
        int low = nums[0];
        int high = nums[0];

        while (count < nums.length) {
            if (nums[count] < low) {
                low = nums[count];
            }
            if(nums[count] > high) {
                high = nums[count];
            }
            count++;
        }

        System.out.println(low);
        System.out.println(high);


    }

    //7.Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
    //        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
    //        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
    //        length of the returned list

    public static void divisor(String[] args){

    }

    //8.Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
    //        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
    //        variable is used to temporarily store individual values in the array

    public static int revNums(int[] nums) {
        int temp;

        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;

        }

        System.out.print("Contents of array after for loop - ");

        for (int i : nums) {

            System.out.print(i + " ");
        }

    }


}

