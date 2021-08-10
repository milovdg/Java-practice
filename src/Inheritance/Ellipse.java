package Inheritance;

public class Ellipse extends Shape {

    private double semi_minor_axis;
    private double semi_major_axis;

    //constructor
    public Ellipse(String sName, String sColor, double dSemi_minor_axis, double dSemi_major_axis) {
        super(sName, sColor, "");
        semi_minor_axis = dSemi_minor_axis;
        semi_major_axis = dSemi_major_axis;
    }

    //methods
    public double getSquare(double dSemi_minor_axis, double dSemi_miajor_axis) {
        return Math.PI*dSemi_minor_axis*dSemi_miajor_axis;
    }

//getters
    public double getSemi_minor_axis() { return semi_minor_axis; }
    public double getSemi_major_axis() { return semi_major_axis; }
}
