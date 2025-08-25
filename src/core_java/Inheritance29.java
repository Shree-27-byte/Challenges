package core_java;
class GeometricShape {
    String type;
    String color;

    GeometricShape(String type, String color) {
        this.type = type;
        this.color = color;
    }
}

class CircleShape extends GeometricShape {
    double radius;
    double area;

    CircleShape(String type, String color, double radius) {
        super(type, color);
        this.radius = radius;
        this.area = Math.PI * radius * radius;
    }
}

