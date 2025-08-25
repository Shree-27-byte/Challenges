package core_java;

import java.util.Scanner;

public class Array22_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        boolean isSymmetric = true;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if (arr[i][j] != arr[j][i])
                    isSymmetric = false;

        if (isSymmetric)
            System.out.println("Matrix is symmetric.");
        else
            System.out.println("Matrix is not symmetric.");
    }
}
