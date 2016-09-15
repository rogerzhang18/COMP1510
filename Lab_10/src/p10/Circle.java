package p10;

import java.awt.*;
import java.util.Random;

/**
 * Circle.
 * 
 * @author ROGER
 * @version 1.0
 */
public class Circle {
    /**
     * Center x and y.
     */
    private int centerX, centerY;
    /**
     * radius.
     */
    private int radius;
    /**
     * color.
     */
    private Color color;
    /**
     * Initialize random object.
     */
    static Random generator = new Random();

    /**
     * Creates a circle with point at center and random radius from 25-74 and
     * color.
     * 
     * @param point
     *            coordinate.
     */
    public Circle(Point point) {
        radius = Math.abs(generator.nextInt()) % 50 + 25;
        color = new Color(Math.abs(generator.nextInt()) % 16777216);
        centerX = point.x;
        centerY = point.y;
    }

    /**
     * Draws circle on the graphics object given.
     * 
     * @param page
     *            Draws the graphic.
     */
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillOval((int) (centerX - radius), 
                (int) (centerY - radius), 
                (int) (radius * 2), 
                (int) (radius * 2));
    }

    /**
     * Check if the point is inside the circle.
     * 
     * @param p
     * @return
     */
    public boolean isInside(Point p) {
        /*
         * Point is inside the circle if the length from it to the center is
         * less than the radius.
         */
        if (Math.sqrt(Math.pow(p.x - this.centerX, 2) 
                + Math.pow(p.y - this.centerY, 2)) < this.radius) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Moves the circle so the center is at point p.
     * 
     * @param p
     *            Center point of circle.
     */
    public void move(Point p) {
        centerX = p.x;
        centerY = p.y;
    }
}