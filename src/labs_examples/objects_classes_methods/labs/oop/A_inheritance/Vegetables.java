package labs_examples.objects_classes_methods.labs.oop.A_inheritance;

public class Vegetables extends Plants{

    private int timeToProduce;
    private String season;

    @Override
    public void grow(){
        System.out.println("yield");
    }

     public int getWaterFrequency() {
        return super.getWaterFrequency();
    }



}
