import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of figure: ");
        System.out.println();
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        double user_input = scanner.nextDouble();
        if (user_input == 1) {
            System.out.println("Enter the radius of the circle");
            double radius = scanner.nextDouble();
            Circle circle = new Circle(radius);
            System.out.println("Area of the circle: " + circle.calculateArea());
        }
        else if (user_input == 2) {
            System.out.println("Enter 2 sides of the rectangle");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(side1, side2);
            System.out.println("Area of the rectangle: " + rectangle.calculateArea());
        }
        else if (user_input == 3) {
            System.out.println("Enter the side of the square");
            double side = scanner.nextDouble();
            Square square = new Square(side);
            System.out.println("Area of the circle: " + square.calculateArea());
        }
        else if (user_input == 4) {
            System.out.println("Enter 3 sides of the triangle");
            double side1 = scanner.nextDouble();
            double side2 = scanner.nextDouble();
            double side3 = scanner.nextDouble();
            Triangle triangle = new Triangle(side1, side2, side3);
            System.out.println("Area of the rectangle: " + triangle.calculateArea());
        }
        else
            System.out.println("Something went wrong. Try anymore.");
    }
}
