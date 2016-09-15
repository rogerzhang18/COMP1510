package p6;

import java.text.NumberFormat;
//*************************************************************** 
//Shop.java
//
//Uses the Item class to create items and add them to a shopping
//cart stored in an ArrayList.
//****************************

import java.util.ArrayList;
import java.util.Scanner;
/**
 * Shop.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Shop {
    /**
     * Main class.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        // object of class Item.
        Item item;
        String itemName;
        double itemPrice;
        int quantity;
        int count = 0;
        double sum = 0;

        Scanner scan = new Scanner(System.in);
        ArrayList<Item> cart = new ArrayList<Item>();
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        
        String keepShopping = "y";
        do {
            System.out.print("Enter the name of the item: \n");
            itemName = scan.nextLine();
            
            System.out.print("Enter the unit price: ");
            itemPrice = scan.nextDouble();
            
            System.out.print("Enter the quantity: ");
            quantity = scan.nextInt();
            
            // *** create a new item and add it to the cart
            Item newitem = new Item(itemName, itemPrice, quantity);
            cart.add(newitem);
            
            //print the contents of the cart object using println.
            count++;

            int num = 0;

            while (num < count) {
                System.out.println(cart.get(num));
                num++;
            }

            sum = sum + newitem.getQuantity() * newitem.getPrice();
            System.out.println("Sum so far: " + fmt.format(sum));
            
            //clear the scanner
            scan.nextLine();

            System.out.print("Continue shopping (y/n)? ");
            keepShopping = scan.nextLine();
        } while (keepShopping.equalsIgnoreCase("y"));
        scan.close();
    }
}
