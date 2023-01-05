package labs_examples.packages.labs.package1;

public class ClassOne {

    protected String classOne(){
        return "Package 1, ClassOne, Protected method.";
    }

    public String secondMethod(){
        return classOne();
    }
}
