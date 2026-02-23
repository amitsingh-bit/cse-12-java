interface Phone {
    void makeCall();
    void sendSMS();
}
interface Camera {
    void takePhoto();
    void recordVideo();
}
class SmartPhone implements Phone, Camera {
    public void makeCall() {
        System.out.println("Calling...");
    }
    public void sendSMS() {
        System.out.println("Sending SMS...");
    }
    public void takePhoto() {
        System.out.println("Taking Photo...");
    }
    public void recordVideo() {
        System.out.println("Recording Video...");
    }
}
public class InheritenceInSIngleClass {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.makeCall();
        sp.sendSMS();
        sp.takePhoto();
        sp.recordVideo();
    }
}