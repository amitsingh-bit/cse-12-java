class a{
    void f1(){
        System.out.println("f1 of a");
    }
    final void f2(){
        System.out.println("f2 of a as final");
    }
}
class b extends a{
    void f3(){
        System.out.println("own method of b");
    }
    @Override
    void f1(){
        System.out.println("f1 of b");
    }
    
}
public class index1 {
    public static void main(String[] args) {
        b obj = new b();
        obj.f1();
        obj.f2();
        obj.f3();
    }
}
