package labs_examples.generics.labs;

import java.util.Collection;
import java.util.List;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

public class Exercise_03 {

    private <T extends Number,V extends Number> double genMethod(T a, V b) {

        double sum = a.doubleValue() + b.doubleValue();

        return sum;
    }

    private static <S> int palindrome(Collection<S> collection) {

        S rev = null;
        int count = 0;

        boolean pDrome = false;

       Collection<S> clist = new Collection<>();

        for (int i = clist.length() - 1; i >= 0; i--) {
            rev = rev + args.charAt(i);
        }

        if (args.equals(rev)) {
            pDrome = true;
            count++;
        }

        return count;
    }

    }
