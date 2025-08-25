package core_java;
class FlyingAnimal {
    String name;
    String type;

    FlyingAnimal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class BirdAnimal extends FlyingAnimal {
    String color;
    double wingspan;

    BirdAnimal(String name, String type, String color, double wingspan) {
        super(name, type);
        this.color = color;
        this.wingspan = wingspan;
    }
}

public class Inheritance27 {
    public static void main(String[] args) {
        BirdAnimal bird = new BirdAnimal("Eagle", "Bird", "Brown", 2.1);
        System.out.println("Bird: " + bird.name + ", Type: " + bird.type + ", Color: " + bird.color + ", Wingspan: " + bird.wingspan + " m");
    }
}

