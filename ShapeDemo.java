class Shape {
        void area(double radius) {
        double result = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + result);
    }
    void area(double length, double width) {
        double result = length * width;
        System.out.println("Area of Rectangle: " + result);
    }
}
public class ShapeDemo{
    public static void main(String[] args) {
         System.out.println("this program is coded by Amit Singh 2400320100171");
        Shape obj = new Shape();
        obj.area(5);         
        obj.area(4, 6);       
    }
}