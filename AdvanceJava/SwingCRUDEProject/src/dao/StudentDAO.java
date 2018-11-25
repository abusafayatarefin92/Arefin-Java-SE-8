package dao;

import domain.Student;
import java.util.List;

public interface StudentDAO {

    void creatTable();

    void insert(Student s);

    void update(Student s);

    void delete(Student s);

    Student getById(Student s);

    List<Student> getStudents();
}
