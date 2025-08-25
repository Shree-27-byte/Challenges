package core_java;

import java.util.Scanner;

public class Array06_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i< n-1; i++) {
            for (int j = i + 1; j <n; j++) {
                if (a[i] > a[j]) {
                    
                int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending order: ");
        for (int i = 0; i <n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.print("\nDescending order: ");
        for (int i = n-1; i>= 0; i--) {
            System.out.print(a[i] + " ");
        }
    }
}
