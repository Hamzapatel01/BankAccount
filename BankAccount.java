import java.util.ArrayList;

public class BankAccount {
    private static int accountNumberCounter = 1000; // Static counter for account numbers
    private int accountNumber;
    private double balance;
    private String name;
    private ArrayList<String> transactionHistory;

    // Constructor with only name
    public BankAccount(String name) {
        this.name = name;
        this.balance = 0; // Default balance
        this.accountNumber = ++accountNumberCounter; 
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: $" + balance);
    }

    // Constructor with name and balance
    public BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
        this.accountNumber = ++accountNumberCounter;
        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Account created with balance: $" + balance);
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount >= 500 || amount > balance) {
            System.out.println("Hello! " + this.name);
            System.out.println("The amount is too big to be withdrawn or exceeds your balance.");
        } else {
            System.out.println("Hello! " + this.name);
            System.out.println("Your previous balance was ==> $" + this.balance);
            this.balance -= amount;
            System.out.println("Your new balance is ==> $" + this.balance);
            transactionHistory.add("Withdrawal of $" + amount + ", new balance: $" + this.balance);
        }
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount >= 1000) {
            System.out.println("The amount is too big to be deposited.");
        } else {
            System.out.println("The amount is deposited successfully. Hello! " + this.name);
            System.out.println("Your previous balance was ==> $" + this.balance);
            this.balance += amount;
            System.out.println("Your new balance is ==> $" + this.balance);
            transactionHistory.add("Deposit of $" + amount + ", new balance: $" + this.balance);
        }
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return this.name;
    }

    public double getBalance() {
        return this.balance;
    }

    // Display account information
    public void displayAccountInfo() {
        System.out.println("\nAccount Information:");
        System.out.println("Name: " + this.name);
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: $" + this.balance);
        System.out.println("\nTransaction History:");
        for (String transaction : transactionHistory) {
            System.out.println(transaction);
        }
    }
}
