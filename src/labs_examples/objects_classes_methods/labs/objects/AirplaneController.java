package labs_examples.objects_classes_methods.labs.objects;

public class AirplaneController {

    public static void main(String[] args) {

        Brand brand = new Brand("American", "AirBus", "A701");
        Capacity capacity = new Capacity(1000, 800, 250, 50);
        EngineType engineType = new EngineType(true, false);
        Fuel fuel = new Fuel(true, false, false, false);


        System.out.println("Flight 1243 is a/an " + brand.getManufacturer() + brand.getModel() + engineType.isJet() + " capable of transporting " + capacity.getPassengers() + ".");






    }

}
