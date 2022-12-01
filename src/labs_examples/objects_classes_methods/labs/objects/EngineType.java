package labs_examples.objects_classes_methods.labs.objects;

public class EngineType {
    public EngineType(String engine) {
        this.engine = engine;
    }

    private String engine;

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "EngineType{" +
                "engine='" + engine + '\'' +
                '}';
    }
}
