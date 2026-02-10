import java.util.Scanner;
class student {
    int rollNo;
    String name;
    double marks;
    student(int rollNo, String name, double marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println("--- Student Details ---");
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name : " + name);
        System.out.println("Marks : " + marks);
    }
}
public class MainStudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll No: ");
        int r = sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Name: ");
        String n = sc.nextLine();
        System.out.print("Enter Marks: ");
        double m = sc.nextDouble();
        student s = new student(r, n, m);
        s.display();
    }
}

