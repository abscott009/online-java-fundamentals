package labs_examples.generics.labs;

public class GenericMain {

    public static void main(String[] args) {

        GenericClass<Integer> genObj = new GenericClass();

        genObj.setInput1(32541);
        genObj.setInput2(115);

        int num = genObj.getInput1() / genObj.getInput2();

        System.out.println(num);


        GenericClass<String> genStr = new GenericClass();

        genStr.setInput1("Hello");
        genStr.setInput2("World");

        System.out.println(genStr.getInput1() + " " + genStr.getInput2());
    }
}
