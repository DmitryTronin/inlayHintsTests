package main.java;

// function overloading test
public class ShapeCalculator {
    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }
    public double calculateArea(double length, double width) {
        return length * width;
    }
    public double calculateArea(double base, double height, String shapeType) {
        if ("triangle".equals(shapeType)) {
            return 0.5 * base * height;
        } else {
            throw new IllegalArgumentException("Unsupported shape: " + shapeType);
        }
    }

    public static void main(String[] args) {
        ShapeCalculator calculator = new ShapeCalculator();

        double circleArea = calculator.calculateArea(5.0);

        double rectangleArea = calculator.calculateArea(4.0, 6.0);

        double triangleArea = calculator.calculateArea(4.0, 3.0, "triangle");

        System.out.println("Area of circle: " + circleArea);
        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
