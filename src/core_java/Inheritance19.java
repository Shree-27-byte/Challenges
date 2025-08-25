package core_java;
class ZooAnimal {
    String name;
    String type;

    ZooAnimal(String name, String type) {
        this.name = name;
        this.type = type;
    }
}

class PetDog extends ZooAnimal {
    String breed;
    String color;

    PetDog(String name, String type, String breed, String color) {
        super(name, type);
        this.breed = breed;
        this.color = color;
    }
}

class PetCat extends ZooAnimal {
    String breed;
    String color;

    PetCat(String name, String type, String breed, String color) {
        super(name, type);
        this.breed = breed;
        this.color = color;
    }
}

public class Inheritance19 {
    public static void main(String[] args) {
        PetDog dog = new PetDog("Buddy", "Dog", "Labrador", "Black");
        PetCat cat = new PetCat("Mimi", "Cat", "Siamese", "White");

        System.out.println("Dog: " + dog.name + ", Type: " + dog.type + ", Breed: " + dog.breed + ", Color: " + dog.color);
        System.out.println("Cat: " + cat.name + ", Type: " + cat.type + ", Breed: " + cat.breed + ", Color: " + cat.color);
    }
}

