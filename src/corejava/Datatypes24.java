package corejava;
import java.util.Scanner;
public class Datatypes24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int r = sc.nextInt();
        System.out.print("Enter columns: ");
        int c = sc.nextInt();
        int[][] mat = new int[r][c];
        int[][] trans = new int[c][r];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
                trans[j][i]=mat[i][j];
            }
        }
        System.out.println("Transposed matrix:");
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
