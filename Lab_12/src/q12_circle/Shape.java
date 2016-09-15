package q12_circle;

public abstract class Shape {
    String shapeName;

    public Shape(String shape) {
        shapeName = shape;
    }

    public abstract double area();

    public String toString() {
        return shapeName;
    }

}
