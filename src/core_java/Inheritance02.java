package core_java;
abstract class Shape {
 abstract double getArea();
 abstract double getPerimeter();
}

class Circle extends Shape {
 double radius;

 Circle(double radius) {
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

class Rectangle extends Shape {
 double length, width;

 Rectangle(double length, double width) {
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

public class Inheritance02 {
 public static void main(String[] args) {
     Shape circle = new Circle(5);
     Shape rectangle = new Rectangle(4, 6);

     System.out.println("Circle Area: " + circle.getArea());
     System.out.println("Circle Perimeter: " + circle.getPerimeter());
     System.out.println("---------------");
     System.out.println("Rectangle Area: " + rectangle.getArea());
     System.out.println("Rectangle Perimeter: " + rectangle.getPerimeter());
 }
}
