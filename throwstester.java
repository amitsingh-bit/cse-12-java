class NegativeAmountException extends Exception{
    public NegativeAmountException(String message) {
        super(message);
    }
}
class ATM{
    private int balance=5000;
    public void deposit(int amt) throws NegativeAmountException{
        System.out.println("DEPOSITING AMOUNT: "+amt);
        if(amt<=0){
            throw new NegativeAmountException("AMOUNT SHOULD BE POSITIVE!!");
        }
        balance+=amt;
    }
    public void withdraw(int amt) throws Exception{
        if(amt<=0){
            throw new Exception("AMOUNT SHOULD BE WITHDRAW POSITIVE!!");
        }
        if(amt>balance){
            throw new Exception("INSUFFICIENT BALANCE!!");
        }
        else{
            System.out.println("WITHDRAWING AMOUNT: "+amt);

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
        catch(NegativeAmountException ex){
            System.out.println(ex.getMessage());
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        finally{
            System.out.println("TRANSACTION COMPLETE!!");
        }
    }
    
}
