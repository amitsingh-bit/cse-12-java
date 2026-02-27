@FunctionalInterface
interface Abc{
    void f1();
    default void f2(){
        System.out.println("I am defualt method");
    }
    static void f3(){
        System.out.println("I am static method");
    }
}

public class AbxTest3 {
    public static void main(String[] args) {
        Abc a =() -> System.out.println("Hello functional");
        a.f1();
        a.f2();
        Abc.f3();
    }
}
