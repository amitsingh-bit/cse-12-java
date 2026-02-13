abstract class shape{
    abstract void area();
    
}
class Cicle extends shape{
    int rad;
    public Cicle(int r){
        rad = r;
    }
    @Override
    public void area(){
        double a = 3.14*rad*rad;
        System.out.println("Circle Created");
        System.out.println("Area of Circle is: "+a);
        
    }

}
class triangle extends shape{
    int b,h;
    public triangle(int base,int height){
        b=base;
        h=height;
    }
    @Override
    public void area(){
        double a = 0.5*b*h;
        System.out.println("Triangle Created");
        System.out.println("Area of Triangle is: "+a);
    }
}
class rectangle extends shape{
    int l,w;
    public rectangle(int length,int width){
        l=length;
        w=width;
    }
    @Override
    public void area(){
        int a = l*w;
        System.out.println("Rectangle Created");
        System.out.println("Area of Rectangle is: "+a);
    }
}
public class abstractTester {
    public static void main(String[] args) {
        Cicle c = new Cicle(5);
        c.area();
        triangle t = new triangle(10,5);
        t.area();
        rectangle r = new rectangle(10,5);
        r.area();
    }
}
