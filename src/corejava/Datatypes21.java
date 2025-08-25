package corejava;
import java.util.Scanner;
import java.util.Arrays;
public class Datatypes21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){ arr[i]=sc.nextInt(); }
        Arrays.sort(arr);
        System.out.println("Ascending: " + Arrays.toString(arr));
        System.out.print("Descending: ");
        for(int i=n-1;i>=0;i--){ System.out.print(arr[i] + " "); }
    }
}
