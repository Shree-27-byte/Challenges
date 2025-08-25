package core_java;
class Vehicle {
    String make;
    String model;
    int year;
    Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayInfo() {
        System.out.println("Vehicle: " + make + " " + model + " (" + year + ")");
    }}
class Car extends Vehicle {
    String color;
    double mileage;
    Car(String make, String model, int year, String color, double mileage) {
        super(make, model, year);
        this.color = color;
        this.mileage = mileage;
    }
    void displayCarInfo() {
        displayInfo();
        System.out.println("Color: " + color);
        System.out.println("Mileage: " + mileage + " km");
    }}
public class Inheritance01 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("Toyota", "Corolla", 2010);
        Car car = new Car("Honda", "Civic", 2020, "Red", 15000.5);

        vehicle.displayInfo();
        System.out.println("---------------");
        car.displayCarInfo();
    }}
