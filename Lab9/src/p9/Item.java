package p9;

import java.text.NumberFormat;

/**
 * Item.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Item {
    /**
     * Name.
     */
    private String name;
    /**
     * Price.
     */
    private double price;
    /**
     * Quantity.
     */
    private int quantity;

    /**
     * Create a new item with the given attributes.
     * 
     * @param itemName
     *            Name of item.
     * @param itemPrice
     *            Price of item.
     * @param numPurchased
     *            Quantity of item purchased.
     */
    public Item(String itemName, double itemPrice, int numPurchased) {
        name = itemName;
        price = itemPrice;
        quantity = numPurchased;
    }

    /**
     * Return a string with the information about the item.
     * 
     * @return String.
     */
    public String toString() {

        NumberFormat fmt = NumberFormat.getCurrencyInstance();

        return (name + "\t\t" + fmt.format(price) 
        + "\t\t" + quantity + "\t\t" + fmt.format(price * quantity));
    }

    /**
     * Returns the unit price of the item.
     * 
     * @return price.
     */
    public double getPrice() {
        return price;
    }

    /**
     * Returns the name of the item.
     * 
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the quantity of the item.
     * 
     * @return quantity.
     */
    public int getQuantity() {
        return quantity;
    }
}