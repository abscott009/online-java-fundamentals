package labs_examples.objects_classes_methods.labs.objects;

public class Capacity {


    private double fuelCapacity;
    private double currentFuelLevel;
    private int passengers;
    private double cargoWeight;

    public double getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(double fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public double getCurrentFuelLevel() {
        return currentFuelLevel;
    }

    public void setCurrentFuelLevel(double currentFuelLevel) {
        this.currentFuelLevel = currentFuelLevel;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public double getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(double cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public Capacity(double fuelCapacity, double currentFuelLevel, int passengers, double cargoWeight) {
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
        this.passengers = passengers;
        this.cargoWeight = cargoWeight;
    }




    @Override
    public String toString() {
        return "Capacity{" +
                "fuelCapacity=" + fuelCapacity +
                ", currentFuelLevel=" + currentFuelLevel +
                ", passengers=" + passengers +
                ", cargoWeight=" + cargoWeight +
                '}';
    }
}
