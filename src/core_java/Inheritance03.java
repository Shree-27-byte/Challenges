package core_java;
class Animal {
 String name;
 int age;

 Animal(String name, int age) {
     this.name = name;
     this.age = age;
 }

 void displayInfo() {
     System.out.println("Animal: " + name + ", Age: " + age);
 }
}

class Dog extends Animal {
 String breed;
 String color;

 Dog(String name, int age, String breed, String color) {
     super(name, age);
     this.breed = breed;
     this.color = color;
 }

 void displayDogInfo() {
     displayInfo();
     System.out.println("Breed: " + breed);
     System.out.println("Color: " + color);
 }
}

class Cat extends Animal {
 String breed;
 String color;

 Cat(String name, int age, String breed, String color) {
     super(name, age);
     this.breed = breed;
     this.color = color;
 }

 void displayCatInfo() {
     displayInfo();
     System.out.println("Breed: " + breed);
     System.out.println("Color: " + color);
 }
}

public class Inheritance03 {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy", 4, "Labrador", "Brown");
     Cat cat = new Cat("Whiskers", 2, "Siamese", "White");

     dog.displayDogInfo();
     System.out.println("---------------");
     cat.displayCatInfo();
 }
}
