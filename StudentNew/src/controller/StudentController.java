package controller;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.LoginView;
import view.StudentView;

import javax.swing.*;

public class StudentController implements ActionListener {
    //        private StudentDao studentDao;
    private final StudentView studentView;


    public StudentController(StudentView studentView) {
        super();
        this.studentView = studentView;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String button = e.getActionCommand();

        if (button.equals("Thêm")) {
            this.studentView.clearTable();
            System.out.println("Da nhan them");
        } else if (button.equals("Lưu")) {
            System.out.println("Da nhan luu");
            try {
                this.studentView.getStudentInfo();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Cập nhật")) {
            System.out.println("Da nhan cập nhật");
            try {
                this.studentView.showListStudents();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Xóa")) {
            try {
                System.out.println("Da nhan xoa");
                this.studentView.deleteStudent();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Hủy bỏ")) {
            try {
                System.out.println("Da nhan hủy bỏ");
                int choose = JOptionPane.showConfirmDialog(new Frame(),
                        "Bạn có muốn hủy bỏ thao tác?",
                        "Cảnh báo", JOptionPane.YES_NO_OPTION);
                if (choose == JOptionPane.YES_OPTION) {
                    this.studentView.clearTable();
                }
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Tìm")) {
            try {
                System.out.println("Dang nhan tìm");
                this.studentView.searchStudent();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Điểm trung bình cao nhất")) {
            System.out.println("Da nhan diem trung binh");
//            Icon icon = new ImageIcon(Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/StudentNew/src/imageStudent/imageStudent/smile-lol-icon.png")));
            JOptionPane.showMessageDialog(new JFrame(),
                    this.studentView.maxAverageScore(),
                    "Inane custom dialog",
                    JOptionPane.INFORMATION_MESSAGE
//                    ,
//                    icon
                    );
        } else if (button.equals("Open")) {
            System.out.println("Da an mo file");
            try {
                this.studentView.openFile();
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println(exception.getMessage());
            }
        } else if (button.equals("Save")) {
            System.out.println("Da nhan save");
            try {
                this.studentView.saveFile();
            } catch (Exception exception) {
                exception.printStackTrace();
                System.out.println(exception.getMessage());
            }
        } else if (button.equals("Exit")) {
            System.out.println("Da nhan exit");
            this.studentView.exitProgram();
        } else if (button.equals("About me")) {
            System.out.println("da nhan about me");
        } else if (button.equals("Theo lớp")) {
            System.out.println("Da nhan xóa sinh viên");
            try {
                this.studentView.deleteStudentClass();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        } else if (button.equals("Mã sinh viên")) {
            try {
                System.out.println("Da nhan ma sinh viên");
                this.studentView.deleteStudentId();
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
                exception.printStackTrace();
            }
        }
    }
}

