package core_java;
public class Inheritance12 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV789", 12000.0, 3.5);
        CurrentAccount ca = new CurrentAccount("CUR321", 25000.0, 5000.0);

        System.out.println("Savings Account:");
        System.out.println("Account Number: " + sa.accountNumber);
        System.out.println("Balance: " + sa.balance);
        System.out.println("Interest Rate: " + sa.interestRate);

        System.out.println("\nCurrent Account:");
        System.out.println("Account Number: " + ca.accountNumber);
        System.out.println("Balance: " + ca.balance);
        System.out.println("Overdraft Limit: " + ca.overdraftLimit);
    }
}
