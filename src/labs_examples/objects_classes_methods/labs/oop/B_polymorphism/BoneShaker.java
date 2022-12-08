package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;

public class BoneShaker extends HotWheels{

    @Override
    public void name() {
        super.setName("Bone Shaker");
        System.out.println(getName());

    }

    @Override
    public void motto(){
        System.out.println("Thrash and Smash!");
    }

    public void engine(int hp){
        System.out.println(hp);
    }

    public void driver(){
        System.out.println("Leroy Jenkins");
    }

}
