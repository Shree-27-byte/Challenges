package core_java;

import java.util.Scanner;

public class Array23_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows and columns of matrix: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter matrix elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < m; i++) {
            int min = arr[i][0], colIndex = 0;
            for (int j = 1; j < n; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    colIndex = j;
                }
            }

            boolean isSaddle = true;
            for (int k = 0; k < m; k++) {
                if (arr[k][colIndex] > min) {
                    isSaddle = false;
                    break;
                }
            }

            if (isSaddle) {
                System.out.println("Saddle point is: " + min);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No saddle point found.");
        }
    }
}
