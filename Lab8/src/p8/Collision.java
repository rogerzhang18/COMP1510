package p8;

/**
 * Collision.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Collision {

    /**
     * Main method for Collision class.
     * 
     * @param args
     *            command line arguments.
     */
    public static void main(String[] args) {

        /*
         * Hard-coded values for particle positions.
         */
        int particleA_X = -3;
        int particleA_Y = 0;
        int particleB_X = 3;
        int particleB_Y = 0;
        /*
         * Hard-coded values for the boundary and max steps.
         */
        int boundary = 2000000;
        int maxSteps = 100000;
        
        boolean collide;
        
        /*
         * Number of times the particle collided.
         */
        int bump = 0;

        RandomWalk particle1 = new RandomWalk(maxSteps, 
                boundary, particleA_X, particleA_Y);
        RandomWalk particle2 = new RandomWalk(maxSteps, 
                boundary, particleB_X, particleB_Y);

        for (int i = 1; i < maxSteps; i++) {
            particle1.takeStep();
            particleA_X = particle1.getX();
            particleA_Y = particle1.getY();
            particle2.takeStep();
            particleB_X = particle2.getX();
            particleB_Y = particle2.getY();

            collide = samePosition(particle1, particle2);
            if (collide) {
                bump++;
            }
        }
        System.out.println("The particles collided: " + bump + " times.");
    }

    /**
     * Checks for same position.
     * 
     * @param p1
     *            RandomWalk object1.
     * @param p2
     *            RandomWalk object2.
     * @return True if same position, false if it's not.
     */
    public static boolean samePosition(RandomWalk p1, RandomWalk p2) {
        if (p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
            System.out.println(p1.getX() + "," 
        + p1.getY() + " and " + p2.getX() + "," + p2.getY());
            return true;
        } else {
            return false;
        }
    }
}
