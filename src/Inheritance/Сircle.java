package Inheritance;

public class Сircle extends Shape {

    private String color;
    private double radius;

    //constructor
    public Сircle(String sType, String sColor, double dRadius) {
        super(sType, sColor);
        dRadius = radius;
    }

    //methods
    public double getVolume(double dRadius) {
        return Math.PI*Math.pow(dRadius,2);
    }

//getters
    public String getColor(){
        return color;
    }

    public double getRadius() { return radius; }
}
