import java.util.ArrayList;

record Student(String name, int roll,int marks){
    @Override
    public String toString(){
        return"""
                [%d,%s,<%d>]
                 """.formatted(roll,name,marks);
    }
}

void main() {
    ArrayList<Student> students = new ArrayList<>();
    students.add(new Student("Alice", 71, 85));
    students.add(new Student("Bob", 21, 90));
    students.add(new Student("Charlie", 3, 80));
    students.add(new Student("Mukesh", 4, 70));
    students.add(new Student("Suresh", 15, 90));
    System.out.println(students);
    
}