package p8;

import java.util.Random;

/**
 * Account.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Account {
    /**
     * Balance in the bank account.
     */
    private double balance;
    /**
     * Owner of the account.
     */
    private String name;
    /**
     * Account number.
     */
    private long acctNum;

    /**
     * Constructor -- initializes balance, owner, and account number.
     * 
     * @param initBal
     *            Initial balance.
     * @param owner
     *            Owner of account.
     * @param number
     *            Account number.
     */
    public Account(double initBal, String owner, long number) {
        balance = initBal;
        name = owner;
        acctNum = number;
    }

    /**
     * Constructor -- initializes balance, owner.
     * 
     * @param initBal
     *            Initial balance.
     * @param owner
     *            Owner of account.
     */
    public Account(double initBal, String owner) {
        balance = initBal;
        name = owner;
        Random generator = new Random();
        long num = generator.nextLong();
        if (num < 0) {
            num *= (-1);
        }
        acctNum = num;
    }

    /**
     * Constructor -- initializes balance.
     * 
     * @param owner
     *            Owner of account.
     */
    public Account(String owner) {
        balance = 0;
        name = owner;
        Random generator = new Random();
        long num = generator.nextLong();
        if (num < 0) {
            num *= (-1);
        }
        acctNum = num;
    }

    /**
     * Checks to see if balance is sufficient for withdrawal. If so, decrements
     * balance by amount; if not, prints message.
     * 
     * @param amount
     *            Amount of money to withdraw.
     * @param fee
     *            Fees applied.
     */
    public void withdraw(double amount, double fee) {
        double total = amount + fee;
        if (balance >= total) {
            balance -= total;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Withdraw method with only amount parameter.
     * 
     * @param amount
     *            Amount of money to withdraw.
     */
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient funds");
        }
    }

    /**
     * Adds deposit amount to balance.
     * 
     * @param amount
     *            Amount of money to deposit.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    /**
     * Returns balance.
     * 
     * @return Balance.
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns a string containing the name, account number, and balance.
     * 
     * @return String.
     */
    public String toString() {
        return "Name:" + name + "\nAccount Number: " 
    + acctNum + "\nBalance: " + balance;
    }
}
