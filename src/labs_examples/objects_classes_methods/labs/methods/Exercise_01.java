package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()

        int x = multiply(15, 4);
        System.out.println(x);
        int y = divide(50,2);
        System.out.println(y);
        joke("What is the difference between a well dressed man on a bicycle and a poorly dressed man on a unicycle?");
        int z = time(9);
        System.out.println(z + " seconds");

        int num1 = varArgs("A", "B", "C");
        int num2 = varArgs("you", "and", "me");
        int num3 = varArgs("OUH!");

        System.out.println("Args is num1 = " + num1);
        System.out.println("Args is num2 = " + num2);
        System.out.println("Args is num3 = " + num3);

    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b

    public static int multiply(int a, int b) {

        return a*b;

    }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b

    public static int divide(int a, int b) {

        return a / b;
    }
    // 3) Create a static void method that will print of joke of your choice to the console

        public static void joke(String args){

            System.out.println(args);

        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents

    public static int time(int years) {

        int sec = years * 31536000;

        return sec;


    }

    // 5) Create a varargs method that will return the length of the varargs array passed in

    public static int varArgs(String... args) {
        int count = 0;

        for(String s : args) {
            count++;
        }
        return count;
    }





}
