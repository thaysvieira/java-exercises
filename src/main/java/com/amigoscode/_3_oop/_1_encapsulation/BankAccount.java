package com.amigoscode._3_oop._1_encapsulation;

/**
 * Exercise: Encapsulation with BankAccount
 *
 * Learn how to protect data using private fields, provide controlled access
 * through getters, and enforce business rules in methods.
 *
 * Key concepts:
 * - Private fields to hide internal state
 * - Public methods to provide controlled access
 * - Validation logic inside setters/methods
 * - Private helper methods
 */
public class BankAccount {

    // TODO: 1 - Declare three private fields:
    //   - accountNumber (String)
    //   - balance (double)
    //   - ownerName (String)
    private String accountNumber;
    private String ownerName;
    private double balance;


    // TODO: 2 - Create a constructor that takes accountNumber, ownerName,
    //   and an initialBalance. Validate that initialBalance >= 0,
    //   throwing IllegalArgumentException if not. Assign all fields.

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        if(balance>=0) {
            this.balance = balance;
        }else {
            throw new IllegalArgumentException("Balance can't be negative value");
        }
        this.ownerName = ownerName;
    }


    // TODO: 3 - Create a getter method for balance (getBalance).
    //   Do NOT create a setter for balance — it should only change
    //   through deposit() and withdraw().

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    // TODO: 4 - Create a deposit(double amount) method.
    //   - If amount <= 0, throw IllegalArgumentException with message
    //     "Deposit amount must be positive"
    //   - Add amount to balance
    //   - Call the private logTransaction() helper with a descriptive message
    //   - Return the new balance
    public Double deposit(double amount){
        if(amount<=0){
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        logTransaction("Adding amount to balance");
        return amount+this.balance;
    }

    // TODO: 5 - Create a withdraw(double amount) method.
    //   - If amount <= 0, throw IllegalArgumentException with message
    //     "Withdrawal amount must be positive"
    //   - If amount > balance, throw IllegalStateException with message
    //     "Insufficient funds"
    //   - Subtract amount from balance
    //   - Call the private logTransaction() helper with a descriptive message
    //   - Return the new balance
    public double withdraw(double amount){
        if(amount <= 0){
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        if(amount>this.balance){
            throw new IllegalArgumentException("Insufficient funds");
        }
        logTransaction("Creating withdraw");
        return amount-this.balance;
    }

    // TODO: 6 - Override toString() to return a string in the format:
    //   "BankAccount{accountNumber='XXX', ownerName='XXX', balance=XXX}"


    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                '}';
    }

    // TODO: 7 - Create a private helper method logTransaction(String message)
    //   that prints the message to the console prefixed with
    //   "[Transaction Log] ". This method should NOT be accessible
    //   from outside the class.
        private static void logTransaction(String message){
            System.out.println("[Transaction Log] " +message);
        }


    public static void main(String[] args) {
         BankAccount account = new BankAccount("ACC-001", "Alice", 1000.0);
         System.out.println(account);
         System.out.println("Balance: " + account.getBalance());

         account.deposit(500.0);
         System.out.println("After deposit: " + account.getBalance());

         account.withdraw(200.0);
         System.out.println("After withdrawal: " + account.getBalance());

         // These should throw exceptions:
          account.deposit(-100);
         account.withdraw(999999);
    }
}
