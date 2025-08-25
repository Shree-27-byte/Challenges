// Datatypes23: Sum of diagonal elements of a matrix
package corejava;
import java.util.Scanner;
public class Datatypes23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows/columns: ");
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int sum = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j] = sc.nextInt();
                if(i==j) 
                	sum += mat[i][j];
            }
        }
        System.out.println("Sum of diagonal elements: " + sum);
    }
}
