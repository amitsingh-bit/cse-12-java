import java.util.Scanner;
class Person {
    String name;
    int age;
    void displayPerson() {
        System.out.println("--- Person Details ---");
        System.out.println("Name : " + name);
        System.out.println("Age : " + age);
    }
}
class Student extends Person {
    int rollNo;
    String course;
    void displayStudent() {
        System.out.println("--- Student Details ---");
        System.out.println("Roll No : " + rollNo);
        System.out.println("Course : " + course);
    }
}
public class studentInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        System.out.print("Enter Name: ");
        s.name = sc.nextLine();
        System.out.print("Enter Age: ");
        s.age = sc.nextInt();
        System.out.print("Enter Roll No: ");
        s.rollNo = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Course: ");
        s.course = sc.nextLine();
        System.out.println();
        s.displayPerson();
        s.displayStudent();
        sc.close();
    }
}