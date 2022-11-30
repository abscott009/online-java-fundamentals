package labs_examples.objects_classes_methods.labs.objects;

public class Fuel {

    public Fuel(boolean jetFuel, boolean gasoline, boolean diesel, boolean solar){

    }

    private boolean jetFuel;

    private boolean gasoline;
    private boolean diesel;
    private boolean solar;

    public Fuel() {

    }

    public boolean isJetFuel() {
        return jetFuel;
    }

    public void setJetFuel(boolean jetFuel) {
        this.jetFuel = jetFuel;
    }

    public boolean isGasoline() {
        return gasoline;
    }

    public void setGasoline(boolean gasoline) {
        this.gasoline = gasoline;
    }

    public boolean isDiesel() {
        return diesel;
    }

    public void setDiesel(boolean diesel) {
        this.diesel = diesel;
    }

    public boolean isSolar() {
        return solar;
    }

    public void setSolar(boolean solar) {
        this.solar = solar;
    }

    @Override
    public String toString() {
        return "Fuel{" +
                "jetFuel=" + jetFuel +
                ", gasoline=" + gasoline +
                ", diesel=" + diesel +
                ", solar=" + solar +
                '}';
    }
}
