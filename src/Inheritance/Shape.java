package Inheritance;

public class Shape {

    private String type;
    private String color;

    //constructor
    public Shape(String sType, String sColor) {
        type = sType;
        color = sColor;
    }

    //getter
    public String getType() {
        return type;
    }

    public String getColor() {
        return color;
    }
}