package q12_circle;

public class Cylinder extends Shape {

    private double radius;
    private double height;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        // TODO Auto-generated constructor stub
        this.radius = radius;
        this.height = height;
    }

    public double area() {
        double area;
        area = Math.PI * radius * height;
        return area;
    }

    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height;
    }

}
