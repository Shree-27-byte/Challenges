package core_java;
//Question: Write a program to find the product of all elements in an array.

import java.util.Scanner;

public class Array13_challenge {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter size: ");
   int n = sc.nextInt();
   int[] a = new int[n];
   int product = 1;
   System.out.println("Enter elements:");
   for (int i = 0; i < n; i++) {
       a[i] = sc.nextInt();
       product *= a[i];
   }
   System.out.println("Product of all elements: " + product);
}
}
