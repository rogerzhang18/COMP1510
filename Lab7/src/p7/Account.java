package p7;

import java.util.Random;

/**
 * Account.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Account {

    /**
     * Number of accounts.
     */
    private static int numAccounts;

    /**
     * Name of the account holder.
     */
    private String name;

    /**
     * Account number.
     */
    private long acctNumber;

    /**
     * Account balance.
     */
    private double acctBalance;

    /**
     * Constructor.
     */
    public Account() {

    }

    /**
     * Constructor.
     * 
     * @param balance
     *            Balance of the account.
     * @param owner
     *            Owner of the account.
     * @param number
     *            Account number.
     */
    public Account(double balance, String owner, long number) {
        acctBalance = balance;
        name = owner;
        Random generator = new Random();
        long num = generator.nextLong();
        if (num < 0) {
            num *= (-1);
        }
        acctNumber = num;
        numAccounts++;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Account [name=" + name + ", acctNumber=" 
    + acctNumber + ", acctBalance=" + acctBalance + "]";
    }

    /**
     * Gets the number of accounts.
     * 
     * @return Number of accounts.
     */
    public static int getNumAccounts() {
        return numAccounts;
    }

    /**
     * Gets the account number.
     * 
     * @return Account number as type long.
     */
    public long getAcctNumber() {
        return acctNumber;
    }

    /**
     * Gets the account balance.
     * 
     * @return Account balance as double.
     */
    public double getacctBalance() {
        return acctBalance;
    }

    /**
     * Closes the account.
     */
    public void close() {
        acctBalance = 0;
        name = name.concat("CLOSED");
        numAccounts--;
    }

    /**
     * Consolidates the accounts.
     * 
     * @param account1
     *            First account.
     * @param account2
     *            Second account.
     * @return Consolidated account.
     */
    public static Account consolidate(Account account1, Account account2) {

        if (account1.acctNumber == account2.acctNumber) {
            System.out.println("Cannot have the same account.");
            return null;
        } else if (!account1.name.equalsIgnoreCase(account2.name)) {
            System.out.println("\nCannot have different "
                    + "names when consolidating");
            return null;
        } else {
            Account account3 = new Account(account1.acctBalance 
                    + account2.acctBalance, account2.name,
                    account2.getAcctNumber());
            account1.close();
            account2.close();
            return account3;
        }
    }

    /**
     * Withdraws the money.
     * 
     * @param withdraw
     *            Withdraw amount.
     */
    public void withdraw(double withdraw) {
        if (acctBalance >= withdraw) {
            acctBalance = acctBalance - withdraw;
        } else {
            System.out.println("Not enough money.");
        }
    }

    /**
     * Deposits the money.
     * 
     * @param deposit
     *            Deposit amount.
     */
    public void deposit(double deposit) {
        acctBalance += deposit;
    }
}
