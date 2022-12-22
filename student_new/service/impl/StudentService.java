package service.impl;

import model.Student;
import service.IStudentArray;
import view.StudentView;

import java.util.ArrayList;
import java.util.Collections;

public class StudentService implements IStudentArray {
    ArrayList<Student> studentList = new ArrayList<>();
    private StudentView studentView;

    public StudentService() {
    }



    public StudentService(StudentView studentView) {
        this.studentView = studentView;
    }

    // kiểm tra mã sinh viên trùng lặp
    public Boolean checkID(int idStudent) {
        for (Student value : studentList) {
            if (value.getCode() == idStudent) {
                return true;
            }
        }
        return false;
    }

    // kiểm tra tên đúng định dạng
    public boolean checkName(java.lang.String name) {
        name = name.toLowerCase();
        for (int i = 0; i < name.length() - 1; ++i) {
            if (Character.isLetter(name.charAt(i)) || (name.charAt(i)) == ' ') {
                return true;
            }
        }
        return false;
    }

    // chỉnh sửa tên về đúng form
    public String formatName(String nameStudent) {
        char[] arrayName = nameStudent.toCharArray();
        boolean flag = true;

        //duyệt các phần tử trong mảng
        for (int i = 0; i < arrayName.length; i++) {
            // nếu pt trong mảng là chữ
            if (Character.isLetter(arrayName[i])) {
                // kiểm tra khoảng trắng phía trước có chữ cái
                if (flag) {
                    // đổi chữ hoa thành thường.
                    arrayName[i] = Character.toUpperCase(arrayName[i]);
                    flag = false;
                }
            } else {
                flag = true;
            }
        }
        nameStudent = java.lang.String.valueOf(arrayName);
        return nameStudent;
    }

    // kiểm tra phạm vi điểm
    public boolean checkPoint(double point) {
        return point >= 0 && point <= 10;
    }

    // chèn sinh viên
    @Override
    public void add(Student student) {
        studentList.add(student);
    }

    // tìm kiếm sinh viên theo id
    @Override
    public Student searchId(int code) {
        Student student = new Student();
        for (Student value : studentList) {
            if (value.getCode() == code) {
                student = value;
            }
        }
        return student;
    }


    // xóa sinh viên theo id
    @Override
    public void deleteId(int code) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode() == code) {
                studentList.remove(i);
                return;
            }
        }
    }

    // xóa sinh viên
    @Override
    public void deleteStudent(Student student) {
        this.studentList.remove(student);
    }

    // xóa tất cả sinh viên trong class
    @Override
    public boolean deleteStudent(String nameClass) {
        boolean flag = false;
        for (Student student : studentList) {
            if (student.getClassName().equals(nameClass)) {
                flag = true;
                break;
            }
        }
        if (flag) {
            for (Student student : studentList) {
                if (student.getClassName().equals(nameClass)) {
                    this.deleteStudent(student);
                }
            }
            return true;
        }
        return false;
    }

    // kiểm tra sinh viên có nằm trong class k
    @Override
    public boolean searchClass(String className, int idSearch) {
        for (Student student : studentList) {
            if (student.getClassName().equals(className) && student.getCode() == idSearch) {
                return true;
            }
        }
        return false;
    }

    // tìm sinh viên có điểm coa nhất đầu tie
    @Override
    public Student searchPoint() {
//        System.out.println(studentList.get(0));
        Student student = new Student();
        Collections.sort(studentList);
        if (studentList.size() == 1) {
            student = studentList.get(0);
        } else {
            for (int i = studentList.size() - 1; i >= 0; i--) {
                if (studentList.get(i).getAverageGrade() > studentList.get(i - 1).getAverageGrade()) {
                    student = studentList.get(i);
                    break;
                }
            }
        }
        return student;
    }

    public void showStudentView() {
        studentView.setVisible(true);
    }


    // trả về mảng sinh viên
    public ArrayList<Student> getStudentList() {
        return studentList;
    }
    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }
}
