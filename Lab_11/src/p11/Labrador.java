package p11;

/**
 * Labrador.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Labrador extends Dog {

    /**
     * black, yellow, or chocolate?
     */
    private String color;
    /**
     * Average weight at 75kg.
     */
    private int breedWeight = 75;

    /**
     * Constructor.
     * 
     * @param name
     *            Name of the dog.
     * @param color
     *            Color of the dog.
     */
    public Labrador(String name, String color) {
        super(name);
        this.color = color;
    }

    /**
     * Big bark -- overrides speak method in Dog.
     * 
     * @return Returns the comment.
     */
    public String speak() {
        return "WOOF";
    }

    /**
     * Returns weight.
     * 
     * @return returns the weight.
     */
    public int avgBreedWeight() {
        return breedWeight;
    }
}