package Inheritance;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape("Circle", "Red");
        System.out.println("The shape is: " + shape.getType());
        System.out.println("The color is: " + shape.getColor());

        Сircle circle = new Сircle("Circle", "Red", 10);
        System.out.println(circle.getVolume(10));
    }
}
