package labs_examples.arrays.labs;

/**
 *  2D Array
 *
 *      Creat and populate a 5x5 2D array with multiples of 3, starting with 3. Once populated, print out the results.
 *
 *      The output should look something like this:
 *
 *      3 6 9 12 15
 *      18 21 24 27 30
 *      ...
 *      ...
 *      ...
 *
 */

public class Exercise_03 {

    public static void main(String[] args) {

        int currentCount = 0;

        int[][] three = new int[5][5];

        for (int i = 0; i <= three.length-1; i++) {

           for (int x = 0; x <= three[i].length-1; x++) {

               three[i][x] = currentCount + x * 3 + 3;

               if (x == three.length-1){
                   currentCount = three[i][x];
               }

               System.out.print(three[i][x] + "| ");

               //System.out.print(i * x + "| ");

            }

           System.out.println();

        }
    }
    }
