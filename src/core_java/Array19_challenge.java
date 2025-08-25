package core_java;

import java.util.Scanner;

public class Array19_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++)
            for (int j = i; j < n; j++)
                sum += arr[i][j];

        System.out.println("Sum of upper triangle elements: " + sum);
    }
}
