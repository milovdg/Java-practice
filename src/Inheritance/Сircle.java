package Inheritance;

public class Сircle extends Shape {

    private double radius;

    //constructor
    public Сircle(String sName, String sColor, double dRadius) {
        super(sName, sColor, "");
        radius = dRadius;
    }

    //methods
    public double getSquare(double dRadius) {
        return Math.PI*Math.pow(dRadius,2);
    }

//getters
    public double getRadius() { return radius; }
}
