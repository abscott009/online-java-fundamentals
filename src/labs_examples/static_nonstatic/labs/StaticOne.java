package labs_examples.static_nonstatic.labs;

public class StaticOne {

    public static void main(String[] args) {
        //1.
        StaticOne.MethodOne();
        //2.
        StaticOne obj = new StaticOne();
        obj.Addition(243, 2048);
        //3.
        StaticTwo.StaticTwo();
        //4.
        StaticTwo nonStat = new StaticTwo();
        nonStat.NonStatDiv(6514.651, 6251.12);
        //5.
        StaticOne objTwo = new StaticOne();
        objTwo.Multiply(5, 3);
        //6.
        StaticTwo objThree = new StaticTwo();
        objThree.NonStatCall(6541.654, 451);

    }

    public static void MethodOne()
    {
        String method = "Static method call out.";
        System.out.println(method);
    }

    public int Addition(int a, int b)
    {
        MethodOne(); //7
        int var = a + b;
        System.out.println(var);
        return var;

    }
    //5.
    public int Multiply(int c, int d)
    {
        StaticTwo.StaticTwo(); //8.
        int multi = c * d;
        System.out.println(multi);
        return multi;
    }

}
