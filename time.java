public class time {

    private int hh, mm, ss;
    public time(){
        hh=mm=ss=12;
    }

    public time(int h, int m, int s){
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }

    public void show(){
        System.out.printf("Time is %02d:%02d:%02d%n", hh, mm, ss);
    }
    public void add(time t){
        ss= (ss + t.ss)%60;
        mm= mm + t.mm + ss/60;
        ss%=60;
        hh= hh + t.hh + mm/60;
        mm%=60;
    }
    public void add(time t1, time t2){
        ss= (t1.ss + t2.ss)%60;
        mm= t1.mm + t2.mm + ss/60;
        ss%=60;
        hh= t1.hh + t2.hh + mm/60;
        mm%=60;

    }

    public static void main(String[] args) {

        time t1 = new time();
        time t2 = new time();
        time t3 = new time(12, 30, 45);

        t1.show();
        t3.show();
        t2.add(t1, t3);
        t2.show();
        t3.add(t2);
        t3.show();
    }
}
