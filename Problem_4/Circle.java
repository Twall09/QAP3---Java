package Problem_4;

public class Circle extends Ellipse {
    // Constructor 

    public Circle(double radius) {
        super(radius, radius); // A circle has equal major and minor axes obviously
        this.name = "Circle"; // Override name
    }
}
