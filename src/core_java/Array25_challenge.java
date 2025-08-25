package core_java;

import java.util.Scanner;

public class Array25_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        int pos = 0, neg = 0, zero = 0;

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > 0) pos++;
            else if (arr[i] < 0) neg++;
            else zero++;
        }

        System.out.println("Positive elements: " + pos);
        System.out.println("Negative elements: " + neg);
        System.out.println("Zero elements: " + zero);
    }
}
