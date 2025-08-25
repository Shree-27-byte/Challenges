package core_java;
public class Inheritance20 {
    public static void main(String[] args) {
        PetDog dog = new PetDog("Rocky", "Dog", "Beagle", "Brown");
        PetCat cat = new PetCat("Snowy", "Cat", "Persian", "Grey");

        System.out.println("Dog: " + dog.name + ", Breed: " + dog.breed + ", Color: " + dog.color);
        System.out.println("Cat: " + cat.name + ", Breed: " + cat.breed + ", Color: " + cat.color);
    }
}

