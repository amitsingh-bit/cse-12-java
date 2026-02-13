class Customer {

    private int custId;
    private String custName;

    public Customer() {
        System.out.println("Customer");
    }
    public Customer(int cid,String cname){
        custId = cid;
        custName = cname;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int cid) {
        custId = cid;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String cname) {
        custName = cname;
    }
    public void show(){
        System.out.println("Customer Id:"+custId);
        System.out.println("Customer Name:"+custName);
    }
}

class Guest extends Customer {

    private int delCharges;
    public Guest(){
        System.out.println("Guest Customer");
    }
    public Guest(int cid, String cname, int dc){
        super(cid,cname);
        delCharges = dc;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Delivery Charges:"+delCharges);
    }
}

class Regular extends Customer {

    private int disc;
    public Regular(){
        System.out.println("Regular Customer");
    }
    public Regular(int cid,String cname,int d){
        super(cid, cname);
        disc=d;
    }
    public int getDiscount(){
        return disc;
    }
    public void setDiscount(int d){
        disc = d;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Discount:"+disc);
    }
}

class Premium extends Regular {

    private int points;
    public Premium(){
        System.out.println("Premium Customer");
    }
    public Premium(int cid,String cname, int d,int p){
        super(cid,cname,d);
        points = p;
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Points:"+points);
    }
}

public class Tester {

    public static void main(String[] args) {
        // Customer cobj = new Customer(1,"Aditya");
        // cobj.show();

        // Guest oGuest =new Guest(2,"Aman",100);
        // oGuest.show();
        
        // Regular oRegular = new Regular(3,"Ramesh",4);
        // oRegular.show();
        Premium oPremium = new Premium(4,"Roma",4,100);
        oPremium.show();
    }
}