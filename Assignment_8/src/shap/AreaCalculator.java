package shap;

class Shape {
    double area(double radius) {
        return Math.PI * radius * radius; // Circle
    }

    double area(double length, double breadth) {
        return length * breadth; // Rectangle
    }

    double area(int side) {
        return side * side; // Square
    }
}

class Triangle extends Shape {
    double area(double base, double height) {
        return 0.5 * base * height; // Triangle (Overridden)
    }
}

public class AreaCalculator {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Triangle triangle = new Triangle();

        System.out.println("--- Area Calculations ---");
        System.out.println("Area of Circle: " + shape.area(5.0));
        System.out.println("Area of Rectangle: " + shape.area(6.0, 4.0));
        System.out.println("Area of Square: " + shape.area(4));
        System.out.println("Area of Triangle: " + triangle.area(6.0, 8.0));
    }
}


