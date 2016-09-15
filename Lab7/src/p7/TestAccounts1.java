package p7;

import java.util.Scanner;

/**
 * TestAccounts.
 * 
 * @author ROGER
 * @version 1.0
 */
public class TestAccounts1 {
    /**
     * TestAccounts.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        String name1, name2, name3;

        Account testAcct;

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a name for account1: ");
        name1 = scan.nextLine();
        System.out.println("Please enter a name for account2: ");
        name2 = scan.nextLine();
        System.out.println("Please enter a name for account3: ");
        name3 = scan.nextLine();

        // Create three new accounts.
        Account account1 = new Account(100, name1, 1);
        Account account2 = new Account(100, name2, 2);
        Account account3 = new Account(100, name3, 3);

        //Print the results.
        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        //System.out.println(account1.getNumAccounts());

        //Close account1.
        account1.close();
        Account account4 = account1.consolidate(account2, account3);

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
        System.out.println(account4);
        System.out.println(account1.getNumAccounts());

        System.out.println("How many accounts would you like to create?");

        //Generate a number of new accounts.
        int num = scan.nextInt();
        for (int i = 1; i <= num; i++) {
            testAcct = new Account(100, "Name" + i, i);
            System.out.println("\nCreated account " + testAcct);
            System.out.println("Now there are " 
            + Account.getNumAccounts() + " accounts");
        }
        scan.close();
    }
}