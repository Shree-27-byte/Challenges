package core_java;
//Question: Write a program to find the sum of all positive numbers in an array.

import java.util.Scanner;

public class Array11_challenge {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter size: ");
   int n = sc.nextInt();
   int[] a = new int[n];
   int sum = 0;
   System.out.println("Enter elements:");
   for (int i = 0; i < n; i++) {
       a[i] = sc.nextInt();
       if (a[i] > 0) sum += a[i];
   }
   System.out.println("Sum of positive numbers: " + sum);
}
}
