package p11;

/**
 * Dog.
 * 
 * @author ROGER
 * @version 1.0
 */
public abstract class Dog {
    /**
     * Name of the dogs.
     */
    protected String name;

    /**
     * Constructor -- store name.
     * 
     * @param name
     *            Name of the dog.
     */
    public Dog(String name) {
        this.name = name;
    }

    /**
     * Returns the dog's name.
     * 
     * @return Name of the dog.
     */
    public String getName() {
        return name;
    }

    /**
     * Returns a string with the dog's comments.
     * 
     * @return Comment of the dog.
     */
    public String speak() {
        return "Woof";
    }

    /**
     * Abstract class for aveBreedWeight since dog is not a specific breed.
     * 
     * @return Average breed weight.
     */
    public abstract int avgBreedWeight();
}