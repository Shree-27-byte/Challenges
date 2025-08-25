package core_java;

import java.util.Scanner;

public class Overloading02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st float: ");
        float a = sc.nextFloat();
        System.out.print("Enter the 2nd float: ");
        float b = sc.nextFloat();
        System.out.println("Sum: " + (a + b));
    }
}
