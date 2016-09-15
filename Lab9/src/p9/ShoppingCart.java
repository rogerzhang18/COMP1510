package p9;

import java.text.NumberFormat;

/**
 * ShoppingCart.
 * 
 * @author ROGER
 * @version 1.0
 */
public class ShoppingCart {

    /**
     * Total number of items in the cart.
     */
    private int itemCount;
    /**
     * Total price of items in the cart.
     */
    private double totalPrice;
    /**
     * Current cart capacity.
     */
    private int capacity;
    /**
     * Array of items in the cart.
     */
    private Item[] cart;
    /**
     * Array index.
     */
    private int index;
    /**
     * Price.
     */
    private double price;
    /**
     * Quantity.
     */
    private int quantity;

    /**
     * Creates an empty shopping cart with a capacity of 5 items.
     */

    public ShoppingCart() {
        capacity = 5;
        itemCount = 0;
        totalPrice = 0.0;
        cart = new Item[capacity];
    }

    /**
     * Adds an item to the cart.
     * 
     * @param itemName
     *            name of item.
     * @param price
     *            price of item.
     * @param quantity
     *            quantity.
     */
    public void addToCart(String itemName, double price, int quantity) {
        if (itemCount == capacity) {
            this.increaseSize();
        }
        cart[index] = new Item(itemName, price, quantity);
        ;
        totalPrice += price * quantity;
        index++;
        itemCount++;
    }

    /**
     * Gets the total price.
     * 
     * @return total price.
     */
    public double getTotal() {
        return totalPrice;
    }

    /**
     * Returns the contents of the cart together with summary information.
     * 
     * @return string.
     */
    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        String contents = "\nShopping Cart\n";
        contents += "\nItem\t\tUnit Price\tQuantity\tTotal\n";

        for (int i = 0; i < itemCount; i++) {
            contents += cart[i].toString() + "\n";
        }
        contents += "\nTotal Price: " + fmt.format(totalPrice);
        contents += "\n";
        return contents;
    }

    /**
     * Increases the capacity of the shopping cart by 3.
     */
    private void increaseSize() {
        capacity += 3;
        Item[] newCart = new Item[capacity];
        for (int i = 0; i < capacity; i++) {
            newCart[i] = cart[i];
        }
    }
}