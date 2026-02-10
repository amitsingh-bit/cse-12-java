import java.util.Scanner;
class BankAccount {
    private String accHolder;
    private int accNo;
    private double balance;
    BankAccount(String accHolder, int accNo, double balance) {
        this.accHolder = accHolder;
        this.accNo = accNo;
        this.balance = balance;
    }
    void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposit Successful!");
    }
    void withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }
    void display() {
        System.out.println("--- Account Details ---");
        System.out.println("Account Holder: " + accHolder);
        System.out.println("Account No : " + accNo);
        System.out.println("Balance : " + balance);
    }
}
public class MainBank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount("AMIT", 101, 5000.0);
        int choice;
        do {
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double d = sc.nextDouble();
                    acc.deposit(d);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double w = sc.nextDouble();
                    acc.withdraw(w);
                    break;
                case 3:
                    acc.display();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 4);
    }
}
