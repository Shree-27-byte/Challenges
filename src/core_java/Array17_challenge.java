package core_java;

import java.util.Scanner;

public class Array17_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();

        int[][] arr = new int[m][n];
        System.out.println("Enter elements:");
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                arr[i][j] = sc.nextInt();

        System.out.print("Spiral Order: ");
        int top = 0, bottom = m - 1, left = 0, right = n - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) System.out.print(arr[top][i] + " ");
            top++;
            for (int i = top; i <= bottom; i++) System.out.print(arr[i][right] + " ");
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) System.out.print(arr[bottom][i] + " ");
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) System.out.print(arr[i][left] + " ");
                left++;
            }
        }
    }
}
