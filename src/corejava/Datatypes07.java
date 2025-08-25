package corejava;

import java.util.Scanner;

public class Datatypes07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 System.out.print("Enter array size : ");
        int size = sc.nextInt();
 int[] numbers = new int[size];
 System.out.println("Enter " + size + " integer elements:");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
  int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
