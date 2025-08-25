package core_java;
public class Inheritance26 {
    public static void main(String[] args) {
        CarVehicle car = new CarVehicle("Hyundai", "i20", 2023, "White", 20.0);
        System.out.println("Car Details: " + car.make + ", " + car.model + ", Year: " + car.year);
        System.out.println("Color: " + car.color + ", Mileage: " + car.mileage + " km/l");
    }
}

