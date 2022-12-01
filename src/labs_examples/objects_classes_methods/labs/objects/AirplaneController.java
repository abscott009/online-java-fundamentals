package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {

    public static void main(String[] args) {

        Brand brand = new Brand("American", "AirBus", "A701");
        Capacity capacity = new Capacity(1000, 800, 250, 50);
        EngineType engineType = new EngineType("jet");
        Fuel fuel = new Fuel("JP8");

        System.out.println("Flight 1243 is a/an " + brand.getManufacturer() + " " + brand.getModel() + " " + engineType.getEngine() + " capable of transporting " + capacity.getPassengers() + " passengers.");

        brand.setAirline("Delta");
        brand.setManufacturer("Boeing");
        brand.setModel("D8");

        capacity.setFuelCapacity(300);
        capacity.setCurrentFuelLevel(250);
        capacity.setPassengers(12);
        capacity.setCargoWeight(1);

        engineType.setEngine("prop");

        fuel.setFuel("gasoline");


        System.out.println("Flight 7894 is serviced by " + brand.getAirline() + " airlines " + engineType.getEngine() +" engine that runs on " + fuel.getFuel() + " .");


    }

}
