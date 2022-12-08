package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Plants {

    private String name;
    private double phSoil = 7;
    private int waterFrequency = 7;

    public void grow() {
        System.out.println("grow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPhSoil() {
        return phSoil;
    }

    public void setPhSoil(double phSoil) {
        this.phSoil = phSoil;
    }

    public int getWaterFrequency() {
        return waterFrequency;
    }

    public void setWaterFrequency(int waterFrequency) {
        this.waterFrequency = waterFrequency;
    }

    public Plants(){
        phSoil = 7.4;
        waterFrequency = 3;
    }
}
