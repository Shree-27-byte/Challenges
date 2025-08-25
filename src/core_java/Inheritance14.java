package core_java;
public class Inheritance14 {
    public static void main(String[] args) {
        // Object of base class
        Shape01 shape = new Shape01("Generic Shape", "Black");
        System.out.println("Shape:");
        System.out.println("Type: " + shape.type);
        System.out.println("Color: " + shape.color);

        System.out.println();

        // Object of derived class
        Triangle01 triangle = new Triangle01("Triangle", "Green", 12.0, 6.0);
        System.out.println("Triangle:");
        System.out.println("Type: " + triangle.type);
        System.out.println("Color: " + triangle.color);
        System.out.println("Base: " + triangle.base);
        System.out.println("Height: " + triangle.height);
    }
}
