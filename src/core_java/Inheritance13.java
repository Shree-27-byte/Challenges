package core_java;
class Shape01 {
    String type;
    String color;

    Shape01(String type, String color) {
        this.type = type;
        this.color = color;
    }
}

class Triangle01 extends Shape01 {
    double base;
    double height;

    Triangle01(String type, String color, double base, double height) {
        super(type, color);
        this.base = base;
        this.height = height;
    }
}

public class Inheritance13 {
    public static void main(String[] args) {
        Triangle01 t = new Triangle01("Triangle", "Red", 10.0, 5.0);
        System.out.println("Shape: " + t.type + ", Color: " + t.color + ", Base: " + t.base + ", Height: " + t.height);
    }
}

