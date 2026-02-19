class ATM{
    private int balance=5000;
    public void deposit(int amt){
        balance+=amt;
    }
    public void withdraw(int amt){
        if(amt>balance){
            throw new ArithmeticException("INSUFFICIENT BALANCE!!");
        }
        balance-=amt;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}
public class throwstester {
    
}
