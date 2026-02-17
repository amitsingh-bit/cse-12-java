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
public class main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int result1 = calc.add(10, 20);
        double result2 = calc.add(3.5, 4.2);
        int result3 = calc.add(10, 20, 30);
        System.out.println("Addition of 2 integers: " + result1);
        System.out.println("Addition of 2 doubles : " + result2);
        System.out.println("Addition of 3 integers: " + result3);
    }
}
