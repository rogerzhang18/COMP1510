package p8;

/**
 * Compare3.
 * 
 * @author ROGER
 * @version 1.0
 */
public abstract class Compare3 implements Comparable {

    /**
     * Largest method return type Comparable.
     * 
     * @param a
     *            First comparable object.
     * @param b
     *            Second comparable object.
     * @param c
     *            Third comparable object.
     * @return Comparable.
     */
    public static Comparable largest(Comparable a, Comparable b, Comparable c) {

        if (a.compareTo(b) >= 0) {
            if (a.compareTo(c) >= 0) {
                return a;
            } else {
                return c;
            }
        } else {
            if (b.compareTo(c) >= 0) {
                return b;
            } else {
                return c;
            }
        }
    }
}