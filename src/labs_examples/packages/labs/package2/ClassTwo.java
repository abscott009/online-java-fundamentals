package labs_examples.packages.labs.package2;

import labs_examples.packages.labs.package1.ClassOne;

public class ClassTwo {

    ClassOne one = new ClassOne();

    public String classTwo(){
         return one.classOne();
         // cannot print due to protected modifier in ClassOne()
    }

    public String fourthMethod(){
        return one.secondMethod();
    }
}
