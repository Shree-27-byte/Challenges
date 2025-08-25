package core_java;
import java.util.Scanner;

public class Array03_challenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int size = sc.nextInt();

        int[] original = new int[size];
        int[] copied = new int[size];

        System.out.print("Enter " + size + " elements:");
        for (int i = 0; i < size; i++) {
            original[i] = sc.nextInt();
        }
        for (int i = 0; i < size; i++) {
            copied[i] = original[i];
        }
        System.out.print("Copied array elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(copied[i] + " ");
        }
    }
}
