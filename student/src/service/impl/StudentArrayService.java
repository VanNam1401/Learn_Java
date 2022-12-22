package service.impl;

import model.Student;

import service.IStudentArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentArrayService implements IStudentArray {
    ArrayList<Student> studentList = new ArrayList<>();

    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    @Override
    public List<Student> searchId(String code) {
        List<Student> result = new ArrayList<>();
        for (Student student : studentList) {
            if (student.getCode().equals(code)) {
                result.add(student);
            }
        }
        return result;
    }

    @Override
    public void deleteId(String code) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(code)) {
                studentList.remove(i);
                return;
            }
        }
    }

    @Override
    public void deleteAllClass(String className) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getClassName().equals(className)) {
                studentList.remove(i);
            }
        }
    }

    @Override
    public boolean checkClass(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getFullName().equals(student.getFullName())) {
                for (int j = 0; j < studentList.size(); j++) {
                    if (studentList.get(i).getClass().equals(student.getClass())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public ArrayList<Student> searchPoint() {
        ArrayList<Student> maxPoint = new ArrayList<>();
        Collections.sort(studentList);
        for (int i = studentList.size() - 1; i > 0; i--) {
            if (studentList.get(i).getAverageGrade() > studentList.get(i + 1).getAverageGrade()) {
                maxPoint.add(studentList.get(i));
                break;
            }
        }
        return maxPoint;
    }
}
