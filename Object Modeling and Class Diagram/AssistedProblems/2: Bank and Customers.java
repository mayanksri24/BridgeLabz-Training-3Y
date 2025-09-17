import java.util.*;

class Account {
    private String accNo;
    private double balance;

    public Account(String accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds in account " + accNo);
    }

    public void showAccount() {
        System.out.println("Account: " + accNo + " | Balance: " + balance);
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void showCustomer() {
        System.out.println("Customer: " + name);
        for (Account a : accounts) {
            a.showAccount();
        }
        System.out.println();
    }
}

class Bank {
    private String bankName;
    private List<Customer> customers = new ArrayList<>();

    public Bank(String bankName) {
        this.bankName = bankName;
    }

    public void openAccount(Customer customer, Account account) {
        if (!customers.contains(customer)) customers.add(customer);
        customer.addAccount(account);
        System.out.println("New account " + account + " opened at " + bankName);
    }

    public void showBank() {
        System.out.println("Bank: " + bankName);
        for (Customer c : customers) {
            c.showCustomer();
        }
    }

    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        Customer c1 = new Customer("Meera");
        Customer c2 = new Customer("Arjun");

        Account a1 = new Account("ACC101", 10000);
        Account a2 = new Account("ACC102", 5000);
        Account a3 = new Account("ACC103", 2000);

        bank.openAccount(c1, a1);
        bank.openAccount(c1, a2);
        bank.openAccount(c2, a3);

        bank.showBank();
    }
}
