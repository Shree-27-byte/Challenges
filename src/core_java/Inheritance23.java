package core_java;
class BasicShape {
    String type;
    String color;

    BasicShape(String type, String color) {
        this.type = type;
        this.color = color;
    }
}

class RectangleShape extends BasicShape {
    double length;
    double width;

    RectangleShape(String type, String color, double length, double width) {
        super(type, color);
        this.length = length;
        this.width = width;
    }
}

public class Inheritance23 {
    public static void main(String[] args) {
        RectangleShape rect = new RectangleShape("Rectangle", "Blue", 10.0, 5.0);
        System.out.println("Shape: " + rect.type + ", Color: " + rect.color + ", Length: " + rect.length + ", Width: " + rect.width);
    }
}
