package core_java;

import java.util.Scanner;

// Q9: Write a program to find the intersection of two arrays.

public class Array09_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of first array: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) a[i] = sc.nextInt();

        System.out.print("Enter size of second array: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) b[i] = sc.nextInt();

        System.out.println("Intersection of arrays:");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                if (a[i] == b[j]) {
                    System.out.print(a[i] + " ");
                    break;
                }
            }
        }
    }
}
