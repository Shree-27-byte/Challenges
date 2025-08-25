package core_java;
//Write a program to merge two sorted arrays.
import java.util.Scanner;

public class Array08_challenge {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter size of first sorted array: ");
    int n1 = sc.nextInt(),
    		a[] = new int[n1];
    System.out.println("Enter elements of first array:");
    for (int i = 0; i < n1; i++) 
    	a[i] = sc.nextInt();

    System.out.print("Enter size of second sorted array: ");
    int n2 = sc.nextInt(),
    		b[] = new int[n2];
    System.out.println("Enter elements of second array:");
    for (int i = 0; i < n2; i++)
    	b[i] = sc.nextInt();

    int[] m = new int[n1 + n2];
    int i = 0, j = 0, k = 0;
    while (i < n1 && j < n2) 
    	m[k++] = (a[i] < b[j]) ? a[i++] : b[j++];
    while (i < n1) m[k++] = a[i++];
    while (j < n2) m[k++] = b[j++];

    System.out.println("Merged array:");
    for (int x : m) System.out.print(x + " ");
}
}
