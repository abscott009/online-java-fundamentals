package labs_examples.objects_classes_methods.labs.objects;

public class Fuel {

    public Fuel(String fuel) {
        this.fuel = fuel;
    }

    String fuel;

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "fuel='" + fuel + '\'' +
                '}';
    }
}
