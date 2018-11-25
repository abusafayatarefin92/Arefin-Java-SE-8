
package StudentForm;

public class Student {
    private String name;
    private String email;
    private int age;
    private String gender;
    private String education;
    private String round;
    private String note;

    public Student() {
    }

    public Student(String name, String email, int age, String gender, String education, String round, String note) {
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.education = education;
        this.round = round;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getEducation() {
        return education;
    }

    public String getRound() {
        return round;
    }

    public String getNote() {
        return note;
    }
    
    
}
