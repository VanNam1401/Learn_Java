package service;

import model.Student;

public interface IStudentArray {
    void add(Student student);

    Student searchId(int code);

    void deleteId(int code);

    void deleteStudent(Student student);
    boolean deleteStudent(String nameClass);

    boolean searchClass(String student, int idSearch);

    Student searchPoint();
}
