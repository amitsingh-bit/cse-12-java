abstract class Abc{
    abstract void f1();
}
class Bcd extends Abc{
    @Override
    public void f1(){
        System.out.println("Hello f1");
    }
}
public class AbxTest2 {
    public static void main(String[] args) {
        Bcd b=new Bcd();
        b.f1();
    }
}
