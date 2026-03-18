public class Item<T> {
    T a,b;
    public Item(T p,T q){
        a=p;
        b=q;
    }
    void swap(){
        System.out.println("Before swap");
        show();
        T c=a;
        a=b;
        b=c;
        System.out.println("After swap");
        show();
    }
    void show(){
        System.out.println("a"+a+","+"b:"+b);
    }

}
void main(){
    Item<Integer>num=new Item<>(10,20);
    Item<Float>real=new Item<>(10.44f,20.55f);
    Item<String>names=new Item<>("Alice","Bob");
    num.swap();
    real.swap();
    names.swap();
}