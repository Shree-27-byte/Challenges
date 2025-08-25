package core_java;

import java.util.Scanner;

public class Array21_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++)
                rowSum += arr[i][j];
            System.out.println("Sum of row " + (i + 1) + ": " + rowSum);
        }

        for (int j = 0; j < n; j++) {
            int colSum = 0;
            for (int i = 0; i < m; i++)
                colSum += arr[i][j];
            System.out.println("Sum of column " + (j + 1) + ": " + colSum);
        }
    }
}
