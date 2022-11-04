package labs_examples.arrays.labs;

/**
 *  ArrayLists
 *
 *      Please demonstrate how to create an ArrayList, populate an array list, access elements within an ArrayList.
 *      Also take a moment to explore the many methods that are available to you when you use an ArrayList. By simply
 *      typing the dot operator (".") after the ArrayList object that you create. You should see a menu pop up that
 *      shows a list of methods.
 *
 */
import java.util.ArrayList;
public class Exercise_07 {

    //won't let me import ArrayList utility for String

    public static void main(String[] args) {

        ArrayList<String>  bills = new ArrayList();

        bills.add("CodingNomads");
        bills.add("MetEd");
        bills.add("Verizon");
        bills.add("Vet");
        bills.add("Internet");
        bills.add("Groceries");

        for (String s : bills) {

            System.out.println(s);
        }

        System.out.println();

        bills.set(1, "Electric");

        for (String s : bills) {

            System.out.println(s);
        }

        System.out.println();

        int index = bills.indexOf("Vet");

        System.out.println(index);

        System.out.println();

        String vendor = bills.get(5);

        System.out.println(vendor);

        System.out.println();




    }




}
