package core_java;
//Question: Write a program to check whether an array is palindrome or not.
import java.util.Scanner;

public class Array10_challenge {
public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("Enter number: ");
   int n = sc.nextInt();
   int[] a = new int[n];
   System.out.println("Enter elements:");
   for (int i = 0; i < n; i++) a[i] = sc.nextInt();

   boolean isPalindrome = true;
   for (int i = 0; i < n / 2; i++) {
       if (a[i] != a[n - 1 - i]) {
           isPalindrome = false;
           break;
       }
   }

   if (isPalindrome)
       System.out.println("Array is palindrome");
   else
       System.out.println("Array is not palindrome");
}
}