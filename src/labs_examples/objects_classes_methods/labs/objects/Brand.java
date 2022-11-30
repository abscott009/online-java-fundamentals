package labs_examples.objects_classes_methods.labs.objects;

public class Brand {

    public Brand(String airline, String manufacturer, String model){

    }
    private String airline;
    private String manufacturer;
    private String model;

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }




    @Override
    public String toString() {
        return "Brand{" +
                "airline='" + airline + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}