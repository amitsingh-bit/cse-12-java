import java.util.Scanner;
class NegativeAmountException extends Exception {
    public NegativeAmountException(String message) {
        super(message);
    }
}
public class exceptionNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter Amount: ");
            double amount = sc.nextDouble();
            if (amount < 0) {
                throw new NegativeAmountException("Negative amount is not allowed!");
            }
            System.out.println("Valid Amount: " + amount);
        }
        catch (NegativeAmountException e) {
            System.out.println("Error: " + e.getMessage());
        }
        sc.close();
    }
}