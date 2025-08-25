package core_java;
public class Inheritance30 {
    public static void main(String[] args) {
        GeometricShape shape = new GeometricShape("Shape", "Blue");
        CircleShape circle = new CircleShape("Circle", "Red", 7.0);

        System.out.println("Shape Type: " + shape.type + ", Color: " + shape.color);

        System.out.println("Circle Type: " + circle.type + ", Color: " + circle.color);
        System.out.println("Radius: " + circle.radius + ", Area: " + circle.area);
    }
}

