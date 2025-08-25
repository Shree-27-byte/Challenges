package core_java;

import java.util.Scanner;

public class Overloading25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of sides: ");
        int n = sc.nextInt();
        System.out.print("Enter length of one side: ");
        double side = sc.nextDouble();

        double area = (n * side * side) / (4 * Math.tan(Math.PI / n));
        System.out.println("Area of Regular Polygon: " + area);
    }
}
