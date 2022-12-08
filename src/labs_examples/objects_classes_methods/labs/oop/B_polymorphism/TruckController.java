package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class TruckController {

    public static void main(String[] args){

        HotWheels hotWheels = new HotWheels();
        BoneShaker boneShaker = new BoneShaker();

        hotWheels.name();
        hotWheels.motto();
        hotWheels.engine();

        boneShaker.name();
        boneShaker.motto();
        boneShaker.engine(500);
        boneShaker.driver();
    }
}
