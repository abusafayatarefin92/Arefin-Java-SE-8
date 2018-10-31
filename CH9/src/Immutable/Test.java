package Immutable;

public class Test {

    public static void main(String[] args) {
        Student student = new Student(100, "Mr. Trump");
        //System.out.println("Student: " + student);
       // System.out.println(student.displayDetails());
        
        student.displayDetails(student);

    }
}
