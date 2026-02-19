class ATM{
    private int balance=5000;
    public void deposit(int amt){
        balance+=amt;
    }
    public void withdraw(int amt){
        if(amt>balance){
            throw new ArithmeticException("INSUFFICIENT BALANCE!!");
        }
        else{
             balance-=amt;
        }
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
public class throwstester {
    public static void main(String[] args) {
        try{
            ATM a1=new ATM();
            System.out.println("CURRENT BALANCE: "+a1.getBalance());
            a1.deposit(6000);
            System.out.println("BALANCE AFTER DEPOSIT: "+a1.getBalance());
            a1.withdraw(2500);
            System.out.println("BALANCE AFTER WITHDRAWAL: "+a1.getBalance());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
