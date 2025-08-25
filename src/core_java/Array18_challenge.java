package core_java;

import java.util.Scanner;
import java.util.Arrays;

public class Array18_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of both arrays: ");
        int n = sc.nextInt();

        int[] arr1 = new int[n];
        int[] arr2 = new int[n];

        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n; i++) arr1[i] = sc.nextInt();

        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n; i++) arr2[i] = sc.nextInt();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean isEqual = Arrays.equals(arr1, arr2);

        if (isEqual)
            System.out.println("Arrays are equal.");
        else
            System.out.println("Arrays are not equal.");
    }
}
