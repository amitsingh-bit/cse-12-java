public class tester1 {
    public static void main(String[] args) {
        int []num={2,4,5,6,10};
        int sum=0;
        float count=5;
        for(int a:num){
            sum+=a;
        }
        float avg=sum/count;
        System.out.println("average is "+avg);
    }
}
