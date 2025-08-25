package core_java;

import java.util.Scanner;

public class Overloading24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter diagonal1: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter diagonal2: ");
        double d2 = sc.nextDouble();

        double area = (d1 * d2) / 2;
        System.out.println("Area of Rhombus: " + area);
    }
}
