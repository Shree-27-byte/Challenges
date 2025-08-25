package core_java;

import java.util.Scanner;

public class Overloading21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base: ");
        double base = sc.nextDouble();
        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        double area = base * height;
        System.out.println("Area of Parallelogram: " + area);
    }
}
