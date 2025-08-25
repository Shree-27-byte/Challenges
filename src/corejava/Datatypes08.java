package corejava;

import java.util.Scanner;

public class Datatypes08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size : ");
        int size = sc.nextInt();
  int[] numbers = new int[size];
        int sum = 0;
 System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
            sum += numbers[i];
        }
 double average = (double) sum / size;
 System.out.println("Average of array elements: " + average);
    }
}
