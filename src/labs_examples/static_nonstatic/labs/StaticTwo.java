package labs_examples.static_nonstatic.labs;

public class StaticTwo {

    public static void StaticTwo()
    {
        String statTwo = "Calling static method from another class.";
        System.out.println(statTwo);
    }

    public double NonStatDiv(double x, double y)
    {
        double div = x / y;
        System.out.println(div);
        return div;
    }

    //6.
    public double NonStatCall(double r, int s)
    {
        double call = r / s;
        System.out.println(call);
        return call;
    }
}
