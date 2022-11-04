package labs_examples.arrays.labs;

/**
 *  Irregular Arrays
 *
 *      Create and populate a 2 dimensional irregular array of size and contents of your choosing. Using a nested
 *      "for-each" loop, iterate and print out each element of the array.
 *
 */

public class Exercise_04 {

    public static void main(String[] args){

        int[][] iarray = {
                {64,453},
                {54, 45, 15},
                {465, 23}
        };

        for (int[] outer : iarray){

            for(int val : outer){

                System.out.println(val + "");
            }
        }

    }

}
