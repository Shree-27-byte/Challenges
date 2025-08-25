package corejava;

import java.util.Scanner;

public class Datatypes01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age (byte): ");
        byte age = sc.nextByte();
        System.out.print("Enter number of students in your class (short): ");
        short students = sc.nextShort();
        System.out.print("Enter your yearly salary (int): ");
        int salary = sc.nextInt();
        System.out.print("Enter your phone number (long): ");
        long phone = sc.nextLong();
        System.out.print("Enter your height in meters (float): ");
        float height = sc.nextFloat();
        System.out.print("Enter your weight in kilograms (double): ");
        double weight = sc.nextDouble();
        System.out.print("Enter your grade (char): ");
        char grade = sc.next().charAt(0);
        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        System.out.println("\n--- Your Details ---");
        System.out.println("Age (byte)        : " + age);
        System.out.println("Students (short)  : " + students);
        System.out.println("Salary (int)      : " + salary);
        System.out.println("Phone (long)      : " + phone);
        System.out.println("Height (float)    : " + height);
        System.out.println("Weight (double)   : " + weight);
        System.out.println("Grade (char)      : " + grade);
        System.out.println("Is Student? (boolean) : " + isStudent);
    }
}
