package labs_examples.generics.labs;

public class GenericClass<T> {

   GenericClass() {

    }

    private T input1;
    private T input2;

    public T getInput1() {
        return input1;
    }

    public void setInput1(T input1) {
        this.input1 = input1;
    }

    public T getInput2() {
        return input2;
    }

    public void setInput2(T input2) {
        this.input2 = input2;
    }

}
