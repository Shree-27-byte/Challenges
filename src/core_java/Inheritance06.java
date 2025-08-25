package core_java;
class Animall {
    String name = "Animal";
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog3 extends Animall {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance06 {
    public static void main(String[] args) {
        Dog3 d = new Dog3();
        System.out.println("Name: " + d.name);
        d.sound();
        d.bark();
    }
}

