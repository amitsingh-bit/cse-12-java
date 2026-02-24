import java.util.Scanner;
public class AgeCheck {
    static void checkAge(int age) throws ArithmeticException {
        if (age < 18) {
            throw new ArithmeticException("Not Eligible: Age must be 18 or above!");
        }
        else {
            System.out.println("Eligible: You can vote!");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Age: ");
            int age = sc.nextInt();

            checkAge(age);
        }
        catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
        System.out.println("This program is run by AMIT SINGH(2400320100171)");
        sc.close();
    }
}