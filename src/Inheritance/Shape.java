package Inheritance;

public class Shape {

    private String name;
    private String color;
    private String message;

    //constructor
    public Shape(String sName, String sColor, String sMessage) {
        name = sName;
        color = sColor;
        message = sMessage;
    }

    public String getSquare() {return message;}

    //getter
    public String getName() {
            return name;
    }
        public String getColor() {
        return color;
    }

}