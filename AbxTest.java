interface Abc{
    void f1();
}
class Bcd implements Abc{
    public void f1(){
        System.out.println("Hello f1");
    }
}
public class AbxTest {
    public static void main(String[] args) {
        Bcd b=new Bcd();
        b.f1();
    }
}
