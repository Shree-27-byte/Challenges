package core_java;
//Question: Write a program to find the second largest and second smallest elements in an array.

import java.util.Scanner;

public class Array14_challenge {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter size: ");
   int n = sc.nextInt();
   int[] a = new int[n];

   System.out.println("Enter elements:");
   for (int i = 0; i < n; i++) a[i] = sc.nextInt();

   int largest = a[0], secondLargest = Integer.MIN_VALUE;
   int smallest = a[0], secondSmallest = Integer.MAX_VALUE;

   for (int i = 1; i < n; i++) {
       if (a[i] > largest) {
           secondLargest = largest;
           largest = a[i];
       } else if (a[i] > secondLargest && a[i] != largest) {
           secondLargest = a[i];
       }

       if (a[i] < smallest) {
           secondSmallest = smallest;
           smallest = a[i];
       } else if (a[i] < secondSmallest && a[i] != smallest) {
           secondSmallest = a[i];
       }
   }

   System.out.println("Second largest: " + secondLargest);
   System.out.println("Second smallest: " + secondSmallest);
}
}

