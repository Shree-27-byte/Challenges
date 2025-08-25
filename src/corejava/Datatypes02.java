package corejava;

import java.util.Scanner;

public class Datatypes02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first float number: ");
        float f1 = sc.nextFloat();
        System.out.print("Enter second float number: ");
        float f2 = sc.nextFloat();
        System.out.print("Enter first double number: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter second double number: ");
        double d2 = sc.nextDouble();

       
        System.out.println("\n--- Float Operations ---");
        System.out.println("Addition       : " + (f1 + f2));
        System.out.println("Subtraction    : " + (f1 - f2));
        System.out.println("Multiplication : " + (f1 * f2));
        System.out.println("Division       : " + (f1 / f2));

        
        System.out.println("\n--- Double Operations ---");
        System.out.println("Addition       : " + (d1 + d2));
        System.out.println("Subtraction    : " + (d1 - d2));
        System.out.println("Multiplication : " + (d1 * d2));
        System.out.println("Division       : " + (d1 / d2));
    }
}
