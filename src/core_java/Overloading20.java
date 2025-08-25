package core_java;

import java.util.Scanner;

public class Overloading20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base1: ");
        double base1 = sc.nextDouble();
        System.out.print("Enter base2: ");
        double base2 = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = ((base1 + base2) * height) / 2;
        System.out.println("Area of Trapezoid: " + area);
    }
}
