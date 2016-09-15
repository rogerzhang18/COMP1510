package p6;

// ***************************************************************
//Item.java
//
//Represents an item in a shopping cart.
//***************************************************************
import java.text.NumberFormat;

/**
 * Item.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Item {

    private String name;
    private double price;
    private int quantity;

    // ----------------------------------------------------- --
    // Create a new item with the given attributes.
    // ----------------------------------------------------- --
    /**
     * 
     * @param itemName
     *            reference for the name of an item.
     * @param itemPrice
     *            reference for the price of an item.
     * @param numPurchased
     *            reference for the quantity of the item.
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    // ----------------------------------------------------- --
    // Return a string with the information about the item
    // ----------------------------------------------------- --
    /**
     * toString class. Prints out the name, price, quantity and total price of
     * the items.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (name + "\t" + fmt.format(price) + "\t" + quantity + "\t" 
        + fmt.format(price * quantity));
    }

    // -----------------------------------------------
    // Returns the unit price of the item
    // -----------------------------------------------
    /**
     * Gets the price of the item.
     * 
     * @return price.
     */
    public double getPrice() {
        return price;
    }

    // -----------------------------------------------
    // Returns the name of the item
    // -----------------------------------------------
    /**
     * Gets the name of the item.
     * 
     * @return name.
     */
    public String getName() {
        return name;
    }

    // -----------------------------------------------
    // Returns the quantity of the item
    // -----------------------------------------------
    /**
     * Gets the quantity of the item.
     * 
     * @return quantity.
     */
    public int getQuantity() {
        return quantity;
    }
}
