package labs_examples.objects_classes_methods.labs.objects;

public class EngineType {
 public EngineType(boolean jet, boolean prop){

 }

   private boolean jet;

    public boolean isJet() {
        return jet;
    }

    public void setJet(boolean jet) {
        this.jet = jet;
    }

   private boolean prop;

    public boolean isProp() {
        return prop;
    }

    public void setProp(boolean prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "jet=" + jet +
                ", prop=" + prop +
                '}';
    }
}

