package com.bridgelabz.oops.leveltwo;

class BankAccount {
    String accName;
    String number;
    double bal;

    BankAccount(String n, String num, double b) {
        accName = n;
        number = num;
        bal = b;
    }

    void deposit(double amt) {
        bal += amt;
        System.out.println("Deposited: " + amt);
    }

    void withdraw(double amt) {
        if (amt <= bal) {
            bal -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void balance() {
        System.out.println("Balance = " + bal);
    }

    public static void main(String[] args) {
        BankAccount a = new BankAccount("Neha", "SB123", 2000);
        a.balance();
        a.deposit(1000);
        a.withdraw(500);
        a.withdraw(5000);
        a.balance();
    }
}
