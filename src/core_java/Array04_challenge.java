package core_java;

import java.util.Scanner;

public class Array04_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < size; i++) {
            boolean D = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    D = true;
                    break;
                }
            }
            if (!D) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
