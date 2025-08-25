package corejava;

import java.util.Scanner;

public class Datatypes06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        int[] numbers = new int[size];
        
        System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("\nArray elements are:");
        for (int i = 0; i < size; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }
    }
}
