package core_java;

import java.util.Scanner;

public class Array16_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Rotate (left/right): ");
        String dir = sc.next();
        System.out.print("Enter number of positions to rotate: ");
        int k = sc.nextInt();
        k = k % n;

        int[] rotated = new int[n];

        if (dir.equalsIgnoreCase("left")) {
            for (int i = 0; i < n; i++) {
                rotated[i] = arr[(i + k) % n];
            }
        } else if (dir.equalsIgnoreCase("right")) {
            for (int i = 0; i < n; i++) {
                rotated[(i + k) % n] = arr[i];
            }
        }

        System.out.print("Rotated array: ");
        for (int val : rotated) {
            System.out.print(val + " ");
        }
    }
}
