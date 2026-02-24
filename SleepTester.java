public class SleepTester extends Thread {
    public void run(){
        try{
            for(int i=1; i<10; i++){
                System.out.println(getName()+ ":" + i);
                sleep(1000);
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        SleepTester t1 = new SleepTester();
        SleepTester t2 = new SleepTester();
        t1.setPriority(1);
        t2.setPriority(10);
        t1.setName("Harry");
        t2.setName("Ron");
        t1.start();
        t2.start();
    }
}
