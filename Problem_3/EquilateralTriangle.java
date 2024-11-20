package Problem_3;

public class EquilateralTriangle extends Triangle {
    public EquilateralTriangle(double side) {
        super(side, side, side); // All sides are equal
        super.name = "Equilateral Triangle";
    }
}
