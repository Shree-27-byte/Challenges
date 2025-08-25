package core_java;
class Animal1 {
    String name;
    int age;

    Animal1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Animal Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog1 extends Animal1 {
    String breed;
    String color;

    Dog1(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    void displayDog() {
        displayInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

class Cat1 extends Animal1 {
    String breed;
    String color;

    Cat1(String name, int age, String breed, String color) {
        super(name, age);
        this.breed = breed;
        this.color = color;
    }

    void displayCat() {
        displayInfo();
        System.out.println("Breed: " + breed);
        System.out.println("Color: " + color);
    }
}

public class Inheritance05 {
    public static void main(String[] args) {
        Dog1 dog = new Dog1("Charlie", 5, "Golden Retriever", "Golden");
        Cat1 cat = new Cat1("Luna", 3, "Persian", "Gray");

        System.out.println("Dog Details:");
        dog.displayDog();

        System.out.println("------------------");

        System.out.println("Cat Details:");
        cat.displayCat();
    }
}
