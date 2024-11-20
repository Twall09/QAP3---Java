package Problem_3;

// extends bc its a subclass of Ellipse
public class Circle extends Ellipse {
    public Circle(double radius) {
        super(radius, radius); // Circle has equal axes
        super.name = "Circle";
    }
    
}
