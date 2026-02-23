class EvenThread extends Thread {
    public void run() {
        try {
            for (int i = 2; i <= 10; i += 2) {
                System.out.println("Even Thread: " + i);
                Thread.sleep(2000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
class OddThread extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 9; i += 2) {
                System.out.println("Odd Thread: " + i);
                Thread.sleep(5000);
            }
        } 
        catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
public class thread {
    public static void main(String[] args) {
        EvenThread even = new EvenThread();
        OddThread odd = new OddThread();
        even.start();
        odd.start();
    }
}