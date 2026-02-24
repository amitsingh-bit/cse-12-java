public class ThreadTester extends Thread{
    public void run(){
        System.out.println("in Run: "+getState());
        System.out.println("Thread is running");
}
public static void main(String[] args) {
    ThreadTester t1 = new ThreadTester();
    System.out.println(t1.getState());
    t1.start();
    System.out.println("ENDING OF MAIN METHOD");
    System.out.println(t1.getState());
    }
}
