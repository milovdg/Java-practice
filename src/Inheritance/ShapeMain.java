package Inheritance;

public class ShapeMain {
    public static void main(String[] args) {
        Shape shape = new Shape("Common shape", "No color", "Undefined");
        System.out.println("The shape name is: " + shape.getName());
        System.out.println("The shape square is: " + shape.getSquare());
        System.out.println("The shape color is: " + shape.getColor());

        System.out.println("================================");

        Сircle circle = new Сircle("Circle", "Red", 10);
        System.out.println("The shape name is: " + circle.getName());
        System.out.println("The shape radius is: " + circle.getRadius());
        System.out.println("The shape square is: " + circle.getSquare(circle.getRadius()));
        System.out.println("The shape color is: " + circle.getColor());

        System.out.println("================================");

        Rectangle rectangle = new Rectangle("Rectangle", "Blue", 10, 20);
        System.out.println("The shape name is: " + rectangle.getName());
        System.out.println("The shape length is: " + rectangle.getLength());
        System.out.println("The shape width is: " + rectangle.getWidth());
        System.out.println("The shape square is: " + rectangle.getSquare(rectangle.getLength(), rectangle.getWidth()));
        System.out.println("The shape color is: " + rectangle.getColor());

        System.out.println("================================");

        Triangle triangle = new Triangle("Triangle", "Orange", 10, 20, 20);
        System.out.println("The shape name is: " + triangle.getName());
        System.out.println("The shape side_a is: " + triangle.getSide_a());
        System.out.println("The shape side_b is: " + triangle.getSide_b());
        System.out.println("The shape side_c is: " + triangle.getSide_c());
        System.out.println("The shape square is: " + triangle.getSquare(triangle.getSide_a(), triangle.getSide_b(), triangle.getSide_c()));
        System.out.println("The shape color is: " + triangle.getColor());

        System.out.println("================================");

        Ellipse ellipse = new Ellipse("Ellipse", "Pink", 100, 200);
        System.out.println("The shape name is: " + ellipse.getName());
        System.out.println("The shape major_axis is: " + ellipse.getSemi_minor_axis());
        System.out.println("The shape major_axis is: " + ellipse.getSemi_major_axis());
        System.out.println("The shape square is: " + ellipse.getSquare(ellipse.getSemi_minor_axis(), ellipse.getSemi_major_axis()));
        System.out.println("The shape color is: " + ellipse.getColor());

    }
}
