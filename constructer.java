class user{
    static int uid;
    private String email, userId;
    private int age;
    public user(){
        userId= "u" + (++uid);
        System.out.println("user" + uid + " created");
    }
    public user(String email, int age){
        this();
        this.email=email;
        this.age=age;
    }
    public user(int a, String e){
        this();
        email=e;
        age=a;
    }
    public void show(){
        System.out.println("User id: " + userId);
        System.out.println("Email: " + email);
        System.out.println("Age: " + age);
    }
}
public class constructer {
    public static void main(String[] args) {
        user u1 = new user();
        user u2 = new user("user2@example.com", 25);
        user u3 = new user(30, "user3@example.com");
        u1.show();
        u2.show();
        u3.show();
    }
}
