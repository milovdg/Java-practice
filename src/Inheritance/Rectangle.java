package Inheritance;

public class Rectangle extends Shape {

    private double length;
    private double width;

    //constructor
    public Rectangle(String sName, String sColor, double dLength, double dWidth) {
        super(sName, sColor, "");
        length = dLength;
        width = dWidth;
    }

    //methods
    public double getSquare(double dLength, double dWidth) {
        return dLength*dWidth;
    }

//getters
    public double getLength() { return length; }
    public double getWidth() { return width; }
}
