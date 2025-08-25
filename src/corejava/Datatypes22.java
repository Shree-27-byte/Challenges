// Datatypes22: Second largest and second smallest
package corejava;
import java.util.Scanner;
import java.util.Arrays;
public class Datatypes22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){ arr[i]=sc.nextInt(); }
        Arrays.sort(arr);
        System.out.println("Second smallest: " + arr[1]);
        System.out.println("Second largest: " + arr[n-2]);
    }
}
