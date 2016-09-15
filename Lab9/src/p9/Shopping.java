package p9;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 * Shopping.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Shopping {
    /**
     * Main method.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {
        String name;
        double price;
        int quantity;
        double totalprice;
        String again;

        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to shopping mall!");
        ShoppingCart cart = new ShoppingCart();

        do {
            System.out.println("Please enter you item name: ");
            name = scan.nextLine();
            System.out.println("Please enter you item price: ");
            price = scan.nextInt();
            System.out.println("Please enter you item quantity: ");
            quantity = scan.nextInt();

            cart.addToCart(name, price, quantity);

            System.out.println(cart);

            scan.nextLine();
            System.out.println("Continue shopping? (y or n)");
            again = scan.nextLine();

        } while (again.equalsIgnoreCase("y"));

        totalprice = cart.getTotal();
        System.out.println("Thank you for shopping with us!");
        System.out.println("Please pay: " + fmt.format(totalprice));
        
        scan.close();
    }

}
