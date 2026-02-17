interface a{
    int y=25;
    void f1();
}
interface b{
    void f2();
}
interface c extends a,b{
    void f3();
}
class d implements c{
    @Override
    public void f1(){
        System.out.println("f1 of a"); 
    }
    public void f2(){
        System.out.println("f2 in d");
    }
    public void f3(){
        System.out.println("f3 in d ");
    }
}
interface m{
    void m1();
}
class e extends d implements a,m{
     
}
public class interfacetester {

}