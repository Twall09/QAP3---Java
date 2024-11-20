package Problem_3;

public abstract class Shape { // added abstract for the getArea and getParimeter
    protected String name;

    // constructor 
    
    public Shape(String name) {
        this.name = name;
    }

    // Abstract methods for area and perimeter
    public abstract double getArea();
    public abstract double getPerimeter();

    @Override
    public String toString() {
        return name + ": Area = " + getArea() + ", Perimeter = " + getPerimeter();
    }
}
