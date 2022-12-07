package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Flowering extends Plants{

    public int getTimeGermination() {
        return timeGermination;
    }

    public void setTimeGermination(int timeGermination) {
        this.timeGermination = timeGermination;
    }

    private int timeGermination;

    public Flowering() {
        super();
    }

    public Flowering (int timeGermination){
        super();
        timeGermination = 0;
    }
    public Flowering(String name, double phSoil, int waterFrequency, boolean fertilizer, int germinate){
        super(name, phSoil,waterFrequency, fertilizer);
        timeGermination = germinate;

        name = "Satin Vine";
        phSoil = 7.4;
        waterFrequency = 3;
        germinate = 30;

    }
}
