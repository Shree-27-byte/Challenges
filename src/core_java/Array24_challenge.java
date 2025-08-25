package core_java;

import java.util.Arrays;
import java.util.Scanner;

public class Array24_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.print("Enter value of k: ");
        int k = sc.nextInt();

        if(k <= 0 || k > n) {
            System.out.println("Invalid value of k.");
        } else {
            System.out.println("Kth smallest: " + arr[k-1]);
            System.out.println("Kth largest: " + arr[n-k]);
        }
    }
}
