package q12_circle;

public class Rectangle extends Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;

    }

    public double area() {
        double area = length * width;
        return area;
    }

    public String toString() {
        return super.toString() + " of length " + length + " and width " + width;
    }
}
