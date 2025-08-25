package core_java;

import java.util.Scanner;

public class Overloading08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Minimum: " + Math.min(a, b));
    }
}
