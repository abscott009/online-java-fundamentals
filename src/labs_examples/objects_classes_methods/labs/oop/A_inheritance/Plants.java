package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Plants {

    private String name;
    private double phSoil = 7;
    private int waterFrequency = 7;
    private boolean fertilizer = false;



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

    public boolean isFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(boolean fertilizer) {
        this.fertilizer = fertilizer;
    }

    public Plants() {

    }
    public Plants (String name, double phSoil, int waterFrequency, boolean fertilizer){
        this.name = name;
        this.phSoil = phSoil;
        this.waterFrequency = waterFrequency;
        this.fertilizer = fertilizer;
    }

    public void bloom(){
        System.out.println("Time to bloom... ");
    }
}
