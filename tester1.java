import java.util.Scanner;

public class tester1 {
    public static void main(String[] args) {
        try {
            Scanner scan = new Scanner(System.in);
            System.out.println("ENTER TOTAL NUMBER: ");
            int count = scan.nextInt();
            int []num={2,4,5,6,10};
            int sum=0;
            
            for(int i=0;i<count;i++){
                sum+=num[i];
                System.out.println("sum is "+sum);
            }
            float avg=sum/count;
            System.out.println("average is "+avg);
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("see you later!!");
        }
    }
}
