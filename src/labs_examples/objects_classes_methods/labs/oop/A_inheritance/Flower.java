package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Flower extends Plants {

    Flower() {
        setName("Magnolia");
        setPhSoil(7.2);
        setWaterFrequency(4);
    }

    private int germination;

    public int getGermination() {
        return germination;
    }

    public void setGermination(int germination) {
        this.germination = germination;
    }

    public void plantMethod() {
        super.grow();
        this.grow();
    }

    @Override
    public void grow() {
        System.out.println("bloom");
    }
}




