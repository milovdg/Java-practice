package Inheritance;

public class Triangle extends Shape {

    private double side_a;
    private double side_b;
    private double side_c;

    //constructor
    public Triangle(String sName, String sColor, double dSide_a, double dSide_b, double dSide_c) {
        super(sName, sColor, "");
        side_a = dSide_a;
        side_b = dSide_b;
        side_c = dSide_c;
    }

    //methods
    public double getSquare(double side_a, double side_b, double side_c) {
        double p = (side_a + side_b + side_c) / 2;
        return Math.sqrt(p*(p-side_a)*(p-side_b)*(p-side_c));
    }

//getters
    public double getSide_a() { return side_a; }
    public double getSide_b() { return side_b; }
    public double getSide_c() { return side_c; }
}
