package Problem_3;

public class TestClass {

    
    public static void main(String[] args) {
        System.out.println();
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];

        // Instantiate different shapes
        shapes[0] = new Circle(5); // Circle with radius 5
        shapes[1] = new Ellipse(6, 4); // Ellipse with major axis 6 and minor axis 4 (largest/smallest)
        shapes[2] = new Triangle(3, 4, 5); // Triangle with sides 3, 4, 5
        shapes[3] = new EquilateralTriangle(6); // Equilateral Triangle with side 6

        // display the details for all the shapes
        
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
        System.out.println();
        
    }
}
