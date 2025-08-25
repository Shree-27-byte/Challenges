package core_java;

import java.util.Scanner;

public class Overloading19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double principal = sc.nextDouble();
        System.out.print("Enter Rate (in %): ");
        double rate = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        int time = sc.nextInt();
        System.out.print("Enter number of times interest applied per time period: ");
        int n = sc.nextInt();

        double amount = principal * Math.pow(1 + (rate / (100 * n)), n * time);
        double ci = amount - principal;
        System.out.println("Compound Interest: " + ci);
    }
}
