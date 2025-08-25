package corejava;

import java.util.Scanner;

public class Datatypes03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        String binaryString = Integer.toBinaryString(number);
        System.out.println("Binary representation: " + binaryString);

        System.out.print("\nEnter a binary number: ");
        String binaryInput = sc.next();
        int decimalValue = Integer.parseInt(binaryInput, 2);
        System.out.println("Decimal value: " + decimalValue);
    }
}
