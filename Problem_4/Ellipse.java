package Problem_4;

public class Ellipse extends Shape {
    private double majorAxis; // Larger axes like before
    private double minorAxis; // Smaller axes

    // Constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        if (a >= b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    // Calculate the area
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // calculate the perimeter
    @Override
    public double getPerimeter() {
        return Math.PI * (3 * (majorAxis + minorAxis) - Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }

    // Implement the scale method to adjust the axes by the scaling factor
    @Override
    public void scale(double factor) {
        this.majorAxis *= factor;
        this.minorAxis *= factor;
    }
}
