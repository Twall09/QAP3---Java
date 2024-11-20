package Problem_4;

public class Triangle extends Shape {
    private double side1, side2, side3; // Sides of the triangle

    // Constructor
    public Triangle(double side1, double side2, double side3) {
        super("Triangle");
        if (side1 + side2 > side3 && side2 + side3 > side1 && side3 + side1 > side2) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Invalid sides for a triangle.");
        }
    }

    // Calculate the perimeter
    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    // Calculate the area
    @Override
    public double getArea() {
        double s = getPerimeter() / 2; 
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    // Implement the scale method to adjust the sides by the scaling factor
    @Override
    public void scale(double factor) {
        this.side1 *= factor;
        this.side2 *= factor;
        this.side3 *= factor;
    }
}
