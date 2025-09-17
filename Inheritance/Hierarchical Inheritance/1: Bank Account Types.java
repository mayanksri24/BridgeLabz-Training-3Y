// Base class
class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

// Subclass 1: Savings Account
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

// Subclass 2: Checking Account
class CheckingAccount extends BankAccount {
    int withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, int withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit + " per month");
    }
}

// Subclass 3: Fixed Deposit Account
class FixedDepositAccount extends BankAccount {
    int duration; // in months

    FixedDepositAccount(String accountNumber, double balance, int duration) {
        super(accountNumber, balance);
        this.duration = duration;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Duration: " + duration + " months");
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SAV123", 25000, 4.5);
        CheckingAccount ca = new CheckingAccount("CHK456", 15000, 5);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 50000, 24);

        sa.displayAccountType();
        System.out.println();
        ca.displayAccountType();
        System.out.println();
        fda.displayAccountType();
    }
}

