package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.ClassOne;

public class ClassTwo {

    ClassOne one = new ClassOne();

    public String classTwo(){
        System.out.println(one.classOne());
        return System.out.println(one.classOne());
    }

    public String fourthMethod(){
        System.out.println(one.secondMethod());
        return one.secondMethod();
    }
}
