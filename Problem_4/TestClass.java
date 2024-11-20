package Problem_4;

public class TestClass {
    public static void main(String[] args) {
        // Create an array of Scalable objects
        Scalable[] shapes = new Scalable[] {
            new Circle(5),                     // Used same numbers as problem 3
            new Ellipse(8, 4),                 
            new Triangle(3, 4, 5),            
            new EquilateralTriangle(6)         
        };
        
        System.out.println();
        // Print shapes before scaling
        System.out.println("Shapes before scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }

        // Scale all shapes by a factor of 2
        // Chose 2 to demonstrate how the scale method works.
        scaleShapes(shapes, 2.0);

        System.out.println();
        // Print shapes after scaling
        System.out.println("\nShapes after scaling:");
        for (Scalable shape : shapes) {
            System.out.println(shape);
        }
    }

    // Static method to scale all Scalable objects in the array
    public static void scaleShapes(Scalable[] scalables, double factor) {
        for (Scalable scalable : scalables) {
            scalable.scale(factor);
        }
        System.out.println();
    }
    

}
