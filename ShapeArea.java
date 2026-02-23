class Shape {
    void area() {
        System.out.println("Area method in Shape");
    }
}
class Circle extends Shape {
    double radius = 5;
    void area() {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle = " + result);
    }
}
class Rectangle extends Shape {
    double length = 8;
    double width = 5;
    void area() {
        double result = length * width;
        System.out.println("Area of Rectangle = " + result);
    }
}
public class ShapeArea {
    public static void main(String[] args) {
        Shape ref;
        ref = new Circle();
        ref.area();
        ref = new Rectangle();
        ref.area();
    }
}