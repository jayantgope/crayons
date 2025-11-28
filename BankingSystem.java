import java.util.Scanner;


// BankAccount class (Entity)
class BankAccount {
    private String name;
    private int accountNumber;
    private double balance;

    // Constructor
    public BankAccount(String name, int accountNumber) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = 0.0; // default balance
    }

    // Deposit money
    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("₹" + amount + " deposited successfully.");
    }

    // Withdraw money
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("₹" + amount + " withdrawn successfully.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Balance: ₹" + balance);
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}


// Main class (Simulation)
public class BankingSystem {
    static BankAccount[] accounts = new BankAccount[100]; // allow up to 100 accounts
    static int totalAccounts = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Banking System Menu =====");
            System.out.println("1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Check Total Accounts");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    createAccount(sc);
                    break;

                case 2:
                    depositMoney(sc);
                    break;

                case 3:
                    withdrawMoney(sc);
                    break;

                case 4:
                    checkBalance(sc);
                    break;

                case 5:
                    System.out.println("Total number of accounts: " + totalAccounts);
                    break;

                case 6:
                    System.out.println("Thank you for using the banking system!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }

        } while (choice != 6);

        sc.close();
    }

    // Create a new bank account
    public static void createAccount(Scanner sc) {
        sc.nextLine(); // clear input buffer
        System.out.print("Enter account holder name: ");
        String name = sc.nextLine();

        int accountNumber = 1000 + totalAccounts; // generate simple account number

        BankAccount newAccount = new BankAccount(name, accountNumber);
        accounts[totalAccounts] = newAccount;
        totalAccounts = totalAccounts + 1;

        System.out.println("Account created successfully!");
        System.out.println("Account Number: " + accountNumber);
    }

    // Helper: Find account by account number
    public static BankAccount findAccount(int accNo) {
        for (int i = 0; i < totalAccounts; i++) {
            if (accounts[i].getAccountNumber() == accNo) {
                return accounts[i];
            }
        }
        return null;
    }

    // Deposit money
    public static void depositMoney(Scanner sc) {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to deposit: ");
            double amt = sc.nextDouble();
            acc.deposit(amt);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Withdraw money
    public static void withdrawMoney(Scanner sc) {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            System.out.print("Enter amount to withdraw: ");
            double amt = sc.nextDouble();
            acc.withdraw(amt);
        } else {
            System.out.println("Account not found!");
        }
    }

    // Check balance
    public static void checkBalance(Scanner sc) {
        System.out.print("Enter account number: ");
        int accNo = sc.nextInt();

        BankAccount acc = findAccount(accNo);
        if (acc != null) {
            acc.checkBalance();
        } else {
            System.out.println("Account not found!");
        }
    }
}
