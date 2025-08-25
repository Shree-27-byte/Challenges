package core_java;
abstract class Shape1 {
    abstract double getArea();
    abstract double getPerimeter();
}

class Circle1 extends Shape1 {
    double radius;

    Circle1(double radius) {
        this.radius = radius;
    }

    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle1 extends Shape1 {
    double length, width;

    Rectangle1(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return length * width;
    }

    @Override
    double getPerimeter() {
        return 2 * (length + width);
    }
}

public class Inheritance04 {
    public static void main(String[] args) {
        Circle1 circle = new Circle1(7);
        Rectangle rectangle = new Rectangle(5, 3);

        System.out.println("Circle:");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        System.out.println("------------------");

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());
    }
}

