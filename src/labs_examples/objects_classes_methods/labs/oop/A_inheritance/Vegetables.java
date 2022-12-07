package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Vegetables extends Flowering{

    private int timeToProduce;
    private boolean root;
    private String season;

    public Vegetables(){
        super();
        timeToProduce = 0;
        season = null;
    }

    public Vegetables(String name, double phSoil, int waterFrequency, boolean fertilizer, int germinate, int timeToProduce, boolean root, String season){
        super(name, phSoil,waterFrequency, fertilizer, germinate);
        timeToProduce = timeToProduce;
        season = season;

        name = "lettuce";
        phSoil = 6.8;
        waterFrequency = 5;
        fertilizer = true;
        germinate = 40;
        timeToProduce = 60;
        root = false;
        season = "summer";


    }

    @Override
    public void bloom(){
        System.out.println("Time until harvest...");
    }

}
