package core_java;
class TransportVehicle {
    String make;
    String model;
    int year;

    TransportVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class HeavyTruck extends TransportVehicle {
    int capacity;
    double mileage;

    HeavyTruck(String make, String model, int year, int capacity, double mileage) {
        super(make, model, year);
        this.capacity = capacity;
        this.mileage = mileage;
    }
}

public class Inheritance16 {
    public static void main(String[] args) {
        HeavyTruck truck = new HeavyTruck("Tata", "Prima", 2023, 15000, 4.5);
        System.out.println("Truck: " + truck.make + " " + truck.model + " (" + truck.year + ")");
        System.out.println("Capacity: " + truck.capacity + " kg, Mileage: " + truck.mileage + " km/l");
    }
}

