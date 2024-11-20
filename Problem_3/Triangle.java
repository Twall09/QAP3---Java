package Problem_3;

public class Triangle extends Shape {
    private double side1, side2, side3;

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

    @Override
    public double getArea() {
        // area of triangle using the formula
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    @Override
    public double getPerimeter() {
        // calulcate perimeter from formula given
        return side1 + side2 + side3;
    }
}
