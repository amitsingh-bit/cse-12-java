import java.util.Scanner;

public class index2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int a,b,c;
        a=scan.nextInt();
        b=scan.nextInt();
        c=a+b;
        System.out.println("The sum is: " + c);
        System.out.printf("sum of %d and %d is %d",a,b,c);
        scan.close();
    }
}
