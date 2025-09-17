

public class BankAccount {
    private static final String BANK_NAME = "State Bank of India";
    private static int accountCount = 0;

    private final String accNo;
    private String holder;
    private double balance;

    public BankAccount(String holder, String accNo, double balance) {
        this.holder = holder;
        this.accNo = accNo;
        this.balance = balance;
        accountCount++;
    }

    public static void showTotalAccounts() {
        System.out.println("Total Accounts: " + accountCount);
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("Deposited: " + amt);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            System.out.println("Withdrawn: " + amt);
        } else {
            System.out.println("Transaction failed.");
        }
    }

    public void show() {
        System.out.println(BANK_NAME + " | " + holder + " | " + accNo + " | Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Lynda Princy", "ACC12345", 1000);
        BankAccount a2 = new BankAccount("Prince Danish", "ACC67890", 500);

        a1.show();
        a2.show();
        showTotalAccounts();

        a1.deposit(300);
        a1.withdraw(200);
        a1.show();

        a2.deposit(150);
        a2.withdraw(800);
        a2.show();
    }
}

