package corejava;

import java.util.Scanner;

public class Datatypes05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        boolean isPositive = num > 0;
        boolean isEven = num % 2 == 0;

        System.out.println("\n--- Boolean Results ---");
        System.out.println("Is the number positive? " + isPositive);
        System.out.println("Is the number even? " + isEven);
    }
}
