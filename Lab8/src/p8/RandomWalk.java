package p8;

import java.util.Random;

/**
 * RandomWalk.
 * 
 * @author ROGER
 * @version 1.0
 */
public class RandomWalk {

    /**
     * Boundary.
     */
    private int boundary;
    /**
     * Maximum steps.
     */
    private int maxSteps;
    /**
     * Steps.
     */
    private int steps;
    /**
     * X position.
     */
    private int positionX;
    /**
     * Y position.
     */
    private int positionY;
    /**
     * MaxDistance.
     */
    private int maxDistance;

    /**
     * Constructor -- initializes max steps, boundary.
     * 
     * @param max
     *            Max steps.
     * @param edge
     *            Boundary.
     */
    public RandomWalk(int max, int edge) {
        boundary = edge;
        maxSteps = max;
        positionX = 0;
        positionY = 0;
        maxDistance = 0;
    }

    /**
     * Constructor -- initializes max steps, boundary, X-position and
     * Y-position.
     * 
     * @param max
     *            Max steps.
     * @param edge
     *            Boundary.
     * @param startX
     *            X_position.
     * @param startY
     *            Y_position.
     */
    public RandomWalk(int max, int edge, int startX, int startY) {
        boundary = edge;
        maxSteps = max;
        positionX = startX;
        positionY = startY;

    }

    /**
     * Takes a random step.
     */
    public void takeStep() {
        Random generator = new Random();
        int num = generator.nextInt(4);
        // System.out.println (num);
        switch (num) {
        case 0:
            positionX -= 1;
            break;
        case 1:
            positionX += 1;
            break;
        case 2:
            positionY -= 1;
            break;
        case 3:
            positionY += 1;
            break;
        }
        steps++;
        
        /**
         * This code shows calculates and prints the max distance from each step.
         * If used when run program, it will prints each step and their max distances.
         */
        /*
        maxDistance = this.max(Math.abs(positionX), Math.abs(positionY));
        System.out.println(positionX + "," + positionY + "," + maxDistance);
        */
    }

    /**
     * Gets the largest of the two coordinates.
     * 
     * @param num1
     *            X position.
     * @param num2
     *            Y position.
     * @return Largest of the two from origin.
     */
    private int max(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    /**
     * Gets the maximum distance.
     * 
     * @return Maximum distance.
     */
    public int getMaxDistance() {
        return maxDistance;
    }

    /**
     * Checks for more steps required.
     * 
     * @return True if max steps is greater than the steps. False if its not.
     */
    public boolean moreSteps() {
        // smaller and not equal to maxsteps because steps start with 0.
        if (steps < maxSteps) {
            return true;
        }
        return false;
    }

    /**
     * Checks if its still in boundary.
     * 
     * @return True if it's in boundary, false if it's not.
     */
    public boolean inBounds() {
        if (positionX >= (boundary * (-1)) 
                && positionX <= boundary 
                && positionY >= (boundary * -1)
                && positionY <= boundary) {
            return true;
        }
        return false;
    }

    /**
     * Keeps taking steps.
     */
    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }
    }

    /**
     * Gets X_position.
     * 
     * @return X_position.
     */
    public int getX() {
        return positionX;
    }

    /**
     * Gets Y_position.
     * 
     * @return Y_position.
     */
    public int getY() {
        return positionY;
    }

    /*
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "RandomWalk [Steps=" + steps + "; Position=" 
    + positionX + "," + positionY + "]";
    }

}
