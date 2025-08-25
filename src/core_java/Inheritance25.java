package core_java;
class GeneralVehicle {
    String make;
    String model;
    int year;

    GeneralVehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class CarVehicle extends GeneralVehicle {
    String color;
    double mileage;

    CarVehicle(String make, String model, int year, String color, double mileage) {
        super(make, model, year);
        this.color = color;
        this.mileage = mileage;
    }
}

public class Inheritance25 {
    public static void main(String[] args) {
        CarVehicle car = new CarVehicle("Honda", "City", 2022, "Grey", 18.0);
        System.out.println("Car: " + car.make + ", Model: " + car.model + ", Year: " + car.year);
        System.out.println("Color: " + car.color + ", Mileage: " + car.mileage + " km/l");
    }
}
