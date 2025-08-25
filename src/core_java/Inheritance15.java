package core_java;
class Vehicle01 {
    String make;
    String model;
    int year;

    Vehicle01(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Truck extends Vehicle01 {
    int capacity;
    double mileage;

    Truck(String make, String model, int year, int capacity, double mileage) {
        super(make, model, year);
        this.capacity = capacity;
        this.mileage = mileage;
    }
}

public class Inheritance15 {
    public static void main(String[] args) {
        Truck t = new Truck("Volvo", "FH16", 2022, 20000, 5.5);
        System.out.println("Truck: " + t.make + ", " + t.model + ", Year: " + t.year + ", Capacity: " + t.capacity + "kg, Mileage: " + t.mileage + " km/l");
    }
}
