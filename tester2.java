import java.util.Scanner;
public class tester2 {
    public static void main(String[] args) {
        int marks,roll;
        try{
        Scanner scan = new Scanner(System.in);
        System.out.println("ENTER ROLL NUMBER: ");
        roll = scan.nextInt();
        if(roll<0){
            throw new Exception("ROLL NUMBER SHOULD BE LARGER THAN ZERO!!");
        }
        System.out.println("ENTER MARKS PERCENTAGE: ");
        marks = scan.nextInt();
        if(marks<0||marks>100){
            throw new Exception("MARKS PERCENTAGE SHOULD BE LESS THAN 100!!");
        }
        System.out.println("ROLL NUMBER: "+roll);
        System.out.println("MARKS: "+marks);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
}
