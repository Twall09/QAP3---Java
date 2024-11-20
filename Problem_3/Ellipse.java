package Problem_3;

public class Ellipse extends Shape {
    private double majorAxis; // largest value
    private double minorAxis; // smallest value


    // constructor
    public Ellipse(double a, double b) {
        super("Ellipse");
        // Assign larger value to majorAxis
        if (a >= b) {
            this.majorAxis = a;
            this.minorAxis = b;
        } else {
            this.majorAxis = b;
            this.minorAxis = a;
        }
    }

    // essentially the calculations
    @Override
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    @Override
    public double getPerimeter() {
        
        return Math.PI * (3 * (majorAxis + minorAxis) - 
                          Math.sqrt((3 * majorAxis + minorAxis) * (majorAxis + 3 * minorAxis)));
    }
}
