package example;

//Setter and getter base
//Value set then get

public class Teacher {

    //Step-1: Instance variable decleare
    int id;
    String name;
    String educationQualification;

    //Step-2: Default constructor (optional)
    //Step-3: take a main method or any method (optional)
    //Step-4: create setter method
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEducationQualification(String educationQualification) {
        this.educationQualification = educationQualification;
    }

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        //Step-5: set value within object teacher
        teacher.setId(1000);
        teacher.setName("Mr. Rahim");
        teacher.setEducationQualification("Master's");
        System.out.println("Id: " + teacher.getId() + " Name: " + teacher.getName() + " Qualification: " + teacher.getEducationQualification());

        Teacher teacher2 = new Teacher();
        //Step-5: set value within object teacher
        teacher2.setId(2000);
        teacher2.setName("Mr. Karim");
        teacher2.setEducationQualification("Master's");
        System.out.println("Id: " + teacher2.getId() + " Name: " + teacher2.getName() + " Qualification: " + teacher2.getEducationQualification());
    }

    //Step-6: generate getter
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEducationQualification() {
        return educationQualification;
    }

    //Step-6: Print and get value
}
