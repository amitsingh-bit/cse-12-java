interface square{
    int calc(int x);
    default void hello() {
        System.out.println("Hello function");
    }
    static void bye() {
        System.out.println("Bye static");
    }
}

void main() {
    square sq = (x) -> x*x;
    System.out.println("square:"+sq.calc(5));
    System.out.println("square:"+sq.calc(25));
    System.out.println("square:"+sq.calc(55));
     

}