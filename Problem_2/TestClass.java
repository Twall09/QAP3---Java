package Problem_2;

public class TestClass {
    public static void main(String[] args) {
        System.out.println();
        // Test Point class
        Point p1 = new Point(2.0f, 3.0f);
        System.out.println("Point: " + p1);
        
        System.out.println();
        // Test MovablePoint class
        MovablePoint mp1 = new MovablePoint(2.0f, 3.0f, 1.5f, 2.5f);
        System.out.println("MovablePoint (before move): " + mp1);

        System.out.println();
        // Test Move feature
        mp1.move();
        System.out.println("MovablePoint (after move): " + mp1);

        System.out.println();
        // Change speed and move again
        mp1.setSpeed(0.5f, 1.0f);
        mp1.move();
        System.out.println("MovablePoint (after changing speed and move): " + mp1);
        System.out.println();
    }
    
}
