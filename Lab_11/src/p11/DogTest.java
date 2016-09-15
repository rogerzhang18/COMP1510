package p11;

/**
 * DogTest.
 * 
 * @author ROGER
 * @version 1.0
 */
public class DogTest {
    /**
     * Main method.
     * 
     * @param args
     *            unused.
     */
    public static void main(String[] args) {
        // Dog dog = new Dog("Spike");
        // System.out.println(dog.getName() + " says " + dog.speak());
        
        //Creates a new dog breed Labrador.
        Labrador labrador = new Labrador("Ricky", "black");
        System.out.println(labrador.getName() + " says " + labrador.speak());
        
        //Creates a new dog breed Yorkshire.
        Yorkshire yorkshire = new Yorkshire("York", "brown");
        
        System.out.println(yorkshire.getName() + " says " + yorkshire.speak());
        System.out.println("The average breedweight of labrador is " 
        + labrador.avgBreedWeight() + "kg.");
        System.out.println("The average breedweight of yorkshire is " 
        + yorkshire.avgBreedWeight() + "kg.");

    }
}
