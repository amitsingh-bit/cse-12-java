interface square{
    int calc(int x);
    default void display(){
        System.out.println("This is a functional interface");
    }   
}
void main(){
    square sq=(x)->x*x;
    System.out.println("Square"+sq.calc(5));
    System.out.println("Square"+sq.calc(25));
    System.out.println("Square"+sq.calc(55));
    sq.display();
}