package core_java;
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
}

class CurrentAccount extends BankAccount {
    double overdraftLimit;

    CurrentAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }
}

public class Inheritance11 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 5000.00, 4.5);
        CurrentAccount ca = new CurrentAccount("CA456", 10000.00, 2000.00);

        System.out.println("Savings Account: " + sa.accountNumber + ", Balance: " + sa.balance + ", Interest Rate: " + sa.interestRate);
        System.out.println("Current Account: " + ca.accountNumber + ", Balance: " + ca.balance + ", Overdraft Limit: " + ca.overdraftLimit);
    }
}

