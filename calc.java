class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) {
        return a + b;
    }
    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class calc {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum1 = calc.add(10, 20);
        double sum2 = calc.add(3.5, 4.2);
        int sum3 = calc.add(10, 20, 30);
        System.out.println("Addition of 2 integers: " + sum1);
        System.out.println("Addition of 2 doubles : " + sum2);
        System.out.println("Addition of 3 integers: " + sum3);
    }
}