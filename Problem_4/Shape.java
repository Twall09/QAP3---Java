package Problem_4;

public abstract class Shape implements Scalable {
    protected String name; 

    // Constructor 
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for getArea and getPerimeter like Problem 3
    public abstract double getArea();
    public abstract double getPerimeter();

    // Overridden toString()
    @Override
    public String toString() {
        return "Shape: " + name + ", Area: " + getArea() + ", Perimeter: " + getPerimeter();
    }
}
