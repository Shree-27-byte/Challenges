package core_java;
//Question: Write a program to find the index of a given element in an array.

import java.util.Scanner;

public class Array15_challenge {
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter size: ");
     int n = sc.nextInt();
     int[] a = new int[n];

     System.out.println("Enter elements:");
     for (int i = 0; i < n; i++) a[i] = sc.nextInt();

     System.out.print("Enter element to search: ");
     int key = sc.nextInt();
     boolean found = false;

     for (int i = 0; i < n; i++) {
         if (a[i] == key) {
             System.out.println("Element found at index: " + i);
             found = true;
             break;
         }
     }

     if (!found) System.out.println("Element not found in the array.");
 }
}
