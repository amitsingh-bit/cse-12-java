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
public class stud {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "Amit";
        s.age = 20;
        s.rollNo = 101;
        s.course = "B.Tech CSE";
        s.displayPerson();
        s.displayStudent();
    }
}
