package labs_examples.packages.labs.package1;

import labs_examples.packages.labs.package2.ClassTwo;

public class ClassOne {



    protected String classOne() {
        String words = "Package 1, ClassOne, Protected method.";
        return words;
    }

    public String secondMethod() {
        String print = "Public Statement.";
        return print;
    }

    public static void main(String[] args) {
        ClassOne one = new ClassOne();
        ClassTwo two = new ClassTwo();

        System.out.println(one.secondMethod());
        System.out.println(two.classTwo());


    }
}