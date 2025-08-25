package corejava;

import java.util.Scanner;

public class Datatypes04{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        if (Character.isLowerCase(ch)) {
            char upper = Character.toUpperCase(ch);
            System.out.println("Uppercase: " + upper);
        } 
        else if (Character.isUpperCase(ch)) {
            char lower = Character.toLowerCase(ch);
            System.out.println("Lowercase: " + lower);
        } 
        else {
            System.out.println("The entered character is not a letter.");
        }
    }
}
