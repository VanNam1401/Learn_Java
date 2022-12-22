package service;

import model.Student;

import java.util.ArrayList;
import java.util.List;

public interface IStudentArray {
    void add(Student student);

    List<Student> searchId(String code);

    void deleteId(String code);

    void deleteAllClass(String className);

    boolean checkClass(Student student);

    ArrayList<Student> searchPoint();
}
