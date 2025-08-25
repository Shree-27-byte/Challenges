package core_java;
//Write a program to find the frequency of each element in an array.
import java.util.Scanner;

public class Array07_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int shree = sc.nextInt();
        boolean found = false;

        for (int i = 0; i < n; i++) {
            if (arr[i] == shree) {
                System.out.println(shree + " found at index " + i);
                found = true;
                break;
            }
        }

        if (!found) System.out.println(shree + " not found in array.");
    }
}
