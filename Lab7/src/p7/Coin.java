package p7;

//******************************************************************* 
// Coin.java Author: Lewis and Loftus
//
//Represents a coin with two sides that can be flipped.
//*******************************************************************
/**
 * Coin.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Coin {

    /**
     * Heads.
     */
    public static final int HEADS = 0;
    /**
     * Tails.
     */
    public static final int TAILS = 1;
    /**
     * Face value.
     */
    private int face;

    /**
     * Sets up the coin by flipping it initially.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips the coin by randomly choosing a face.
     */
    public void flip() {
        face = (int) (Math.random() * 2);
    }

    /**
     * Gets the face value.
     * 
     * @return face value as an integer
     */
    public int getFace() {
        return face;
    }

    /**
     * Returns true if the current face of the coin is heads.
     * 
     * @return true if it is a head flip
     */
    public boolean isHeads() {
        return (face == HEADS);
    }

    /**
     * Returns the current face of the coin as a string.
     */
    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        String faceName;
        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }
        return faceName;

    }
}
