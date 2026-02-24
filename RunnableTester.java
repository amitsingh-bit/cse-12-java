public class RunnableTester implements Runnable{
    public void run(){
        try {
            System.out.println("in Run: "+ getState());
            Thread.sleep(5000);
            System.out.println("Thread is running");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
}
public static void main(String[] args) throws Exception {
    ThreadTester t1 = new ThreadTester();
    System.out.println(t1.getState());
    t1.start();
    Thread.sleep(1000);
    System.out.println(t1.getState());
    t1.join();
    System.out.println("ENDING OF MAIN METHOD");
    System.out.println(t1.getState());
    }
}
