class Account {
    private int bal;

    public Account(int bal) {
        this.bal = bal;
    }

    public int getBalance() {
        return bal;
    }

    public void deposit(String uname, int amt) {
        bal += amt;
        System.out.println("Deposited by " + uname + " of " + amt + ", balance: " + bal);
    }

    public void withdraw(String uname, int amt) {
        if (amt > bal) {
            System.out.println("Insufficient Amount to withdraw: " + amt + ", Balance:" + bal);
        } else {
            bal -= amt;
            System.out.println("Withdrawn by " + uname + " of " + amt + ", balance: " + bal);
        }
    }
}

class User extends Thread {
    private Account acc;

    public User(Account acc) {
        this.acc = acc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                acc.deposit(getName(), 1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

class ATM extends Thread {
    private Account account;

    public ATM(Account acc) {
        account = acc;
    }

    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                account.withdraw(getName(), 1000);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

public class SyncTester {
    public static void main(String[] args) throws Exception {
        Account account = new Account(5000);
        System.out.println("Opening Balance:" + account.getBalance());
        User u1 = new User(account);
        User u2 = new User(account);
        ATM a1 = new ATM(account);
        ATM a2 = new ATM(account);
        u1.setName("Harry");
        u2.setName("Berry");
        a1.setName("Sunny");
        a2.setName("Bunny");
        u1.start();
        u2.start();
        a1.start();
        a2.start();
        System.out.println("Final Balance:" + account.getBalance());
    }
}
