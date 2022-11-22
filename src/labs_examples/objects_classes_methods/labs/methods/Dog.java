package labs_examples.objects_classes_methods.labs.methods;

public class Dog {
    String color;
    String breed;
    String sex;

    public Dog(){}

    public Dog(String color, String breed, String sex){
        this.color = color;
        this.breed = breed;
        this.sex = sex;

    }

    public String getColor() {
        return color;
    }

    public String getBreed() {
        return breed;
    }

    public String getSex() {
        return sex;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
