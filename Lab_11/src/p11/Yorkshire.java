package p11;

/**
 * Yorkshire.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Yorkshire extends Dog {
    /**
     * Color of yorkshire.
     */
    private String color;

    /**
     * Weight of yorkshire.
     */
    private int breedWeight = 100;

    /**
     * Constructor.
     * 
     * @param name
     *            Name of the dog.
     * @param color
     *            Color of the dog.
     */
    public Yorkshire(String name, String color) {
        super(name);
        this.color = color;
    }

    /**
     * Small bark -- overrides speak method in Dog.
     * 
     * @return small bark comments.
     */
    public String speak() {
        return "woof";
    }

    /**
     * Average breed weight.
     * 
     * @return The average weight of yorkshire.
     */
    public int avgBreedWeight() {
        return breedWeight;
    }
}