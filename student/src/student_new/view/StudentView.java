package view;

import common.AppConstant;
import controller.StudentController;
import model.Student;
import service.impl.StudentService;

import java.awt.*;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.net.URL;

public class StudentView extends JFrame {
    private final JButton btnXoa;
    private final JButton btnHuyBo;
    private final JButton btnLuu;
    private final JButton btnUpdate;
    public StudentService studentService = new StudentService();
    private final ButtonGroup btnSex;
    private final JRadioButton radioButton_nam;
    private final JRadioButton radioButton_nu;
    private final JTextField textField_msv;
    private final JTextField textField_hvt;
    private final JTextField textField_dayBirth;
    private final JTextField textField_class;
    private final JTextField textField_diemTB;
    private final JTable table_thongTin;
    private final JTextField textField_IdSearch;
    private final JTextField textField_ClassSearch;
    private final JTable table_Search;

    public StudentView() {
        ActionListener actionListener = new StudentController(this);
        this.setTitle("STUDENT INFORMATION MANAGEMENT");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 1000, 643);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        URL urllUrl = LoginView.class.getResource("/data/imageStudent/student.icon.png");
        Image image = Toolkit.getDefaultToolkit().createImage(urllUrl);
        this.setIconImage(image);

        JMenu jmenu_File = new JMenu("File");
        jmenu_File.setMnemonic(KeyEvent.VK_F);
        jmenu_File.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuBar.add(jmenu_File);

        JMenuItem jmenu_Open = new JMenuItem("Open", KeyEvent.VK_O);
        jmenu_Open.setIcon(new ImageIcon(
                Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/imageStudent/open.png"))));
        jmenu_Open.addActionListener(actionListener);
        jmenu_Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_DOWN_MASK));
        jmenu_Open.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jmenu_File.add(jmenu_Open);

        JMenuItem jmenu_Save = new JMenuItem("Save", KeyEvent.VK_S);
        jmenu_Save.setIcon(new ImageIcon(
                Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/imageStudent/save.png"))));
        jmenu_Save.addActionListener(actionListener);
        jmenu_Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
        jmenu_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jmenu_File.add(jmenu_Save);

        JSeparator separator = new JSeparator();
        jmenu_File.add(separator);

        JMenuItem jmenu_Exit = new JMenuItem("Exit", KeyEvent.VK_E);
        jmenu_Exit.setIcon(new ImageIcon(
                Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/imageStudent/exit.png"))));
        jmenu_Exit.addActionListener(actionListener);
        jmenu_Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, InputEvent.CTRL_DOWN_MASK));
        jmenu_Exit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jmenu_File.add(jmenu_Exit);

        JMenu mnNewMenu_1 = new JMenu("Filter");
        mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuBar.add(mnNewMenu_1);

        JMenuItem locMaSinhVien = new JMenuItem("Mã sinh viên");
        locMaSinhVien.addActionListener(actionListener);
        locMaSinhVien.setIcon(new ImageIcon(
                Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/imageStudent/filter.png"))));
        locMaSinhVien.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu_1.add(locMaSinhVien);

        JMenuItem locTheoLop = new JMenuItem("Theo lớp");
        locTheoLop.addActionListener(actionListener);
        locTheoLop.setIcon(new ImageIcon(
                Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/imageStudent/filter.png"))));
        locTheoLop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        mnNewMenu_1.add(locTheoLop);

        JMenu jmenu_About = new JMenu("About");
        jmenu_About.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        menuBar.add(jmenu_About);

        JMenuItem jmenu_About_me = new JMenuItem("About me");
        jmenu_About_me.addActionListener(actionListener);
        jmenu_About_me.setFont(new Font("Segoe UI", Font.PLAIN, 18));
        jmenu_About.add(jmenu_About_me);

        JPanel contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel msinhvien = new JLabel("Mã sinh viên");
        msinhvien.setFont(new Font("Tahoma", Font.BOLD, 18));
        msinhvien.setBounds(29, 63, 118, 22);
        contentPane.add(msinhvien);

        textField_msv = new JTextField();
        textField_msv.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_msv.setBounds(191, 63, 156, 28);
        contentPane.add(textField_msv);
        textField_msv.setColumns(10);

        JLabel lblHVTn = new JLabel("Họ và tên");
        lblHVTn.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblHVTn.setBounds(29, 101, 90, 22);
        contentPane.add(lblHVTn);

        textField_hvt = new JTextField();
        textField_hvt.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_hvt.setColumns(10);
        textField_hvt.setBounds(191, 101, 156, 28);
        contentPane.add(textField_hvt);

        JLabel lblNgySinh = new JLabel("Ngày sinh");
        lblNgySinh.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblNgySinh.setBounds(29, 139, 92, 22);
        contentPane.add(lblNgySinh);

        textField_dayBirth = new JTextField();
        textField_dayBirth.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_dayBirth.setColumns(10);
        textField_dayBirth.setBounds(191, 139, 156, 28);
        contentPane.add(textField_dayBirth);

        JLabel lblLp = new JLabel("Lớp");
        lblLp.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblLp.setBounds(29, 177, 52, 22);
        contentPane.add(lblLp);

        textField_class = new JTextField();
        textField_class.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_class.setColumns(10);
        textField_class.setBounds(191, 174, 156, 28);
        contentPane.add(textField_class);

        JLabel lblimTrungBnh = new JLabel("Điểm trung bình");
        lblimTrungBnh.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblimTrungBnh.setBounds(29, 212, 153, 22);
        contentPane.add(lblimTrungBnh);

        textField_diemTB = new JTextField();
        textField_diemTB.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_diemTB.setColumns(10);
        textField_diemTB.setBounds(191, 209, 156, 28);
        contentPane.add(textField_diemTB);

        JLabel lblNewLabel = new JLabel("Thông tin sinh viên");
        lblNewLabel.setForeground(new Color(0, 255, 255));
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lblNewLabel.setBounds(10, 10, 247, 43);
        contentPane.add(lblNewLabel);

        JSeparator separator_1 = new JSeparator();
        separator_1.setBounds(10, 42, 364, 2);
        contentPane.add(separator_1);

        table_thongTin = new JTable();
        table_thongTin.setModel(new DefaultTableModel(new Object[][]{},
                new java.lang.String[]{"Mã sinh viên", "Họ và tên", "Ngày sinh", "Lớp", "Giới tính", "Điểm trung bình"}));

        JScrollPane scrollPane = new JScrollPane(table_thongTin);
        scrollPane.setBounds(390, 22, 586, 242);
        contentPane.add(scrollPane);

        JSeparator separator_2 = new JSeparator();
        separator_2.setBounds(10, 328, 966, 2);
        contentPane.add(separator_2);

        JLabel label_ID_1 = new JLabel("Giới tính");
        label_ID_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        label_ID_1.setBounds(29, 251, 79, 22);
        contentPane.add(label_ID_1);

        radioButton_nam = new JRadioButton("Nam");
        radioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 18));
        radioButton_nam.setBounds(191, 247, 66, 26);
        contentPane.add(radioButton_nam);

        radioButton_nu = new JRadioButton("Nữ");
        radioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 18));
        radioButton_nu.setBounds(284, 247, 63, 31);
        contentPane.add(radioButton_nu);

        btnSex = new ButtonGroup();
        btnSex.add(radioButton_nam);
        btnSex.add(radioButton_nu);

        JSeparator separator_2_1 = new JSeparator();
        separator_2_1.setBounds(10, 563, 966, 2);
        contentPane.add(separator_2_1);

        JButton btnThem = new JButton("Thêm");
        btnThem.addActionListener(actionListener);
        btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnThem.setBounds(58, 283, 120, 42);
        contentPane.add(btnThem);

        btnLuu = new JButton("Lưu");
        btnLuu.addActionListener(actionListener);
        btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnLuu.setBounds(242, 283, 120, 42);
        contentPane.add(btnLuu);

        btnUpdate = new JButton("Cập nhật");
        btnUpdate.addActionListener(actionListener);
        btnUpdate.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnUpdate.setBounds(427, 283, 120, 42);
        contentPane.add(btnUpdate);

        btnXoa = new JButton("Xóa");
        btnXoa.addActionListener(actionListener);
        btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnXoa.setBounds(612, 283, 120, 42);
        contentPane.add(btnXoa);

        btnHuyBo = new JButton("Hủy bỏ");
        btnHuyBo.addActionListener(actionListener);
        btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnHuyBo.setBounds(809, 283, 120, 42);
        contentPane.add(btnHuyBo);

        JLabel lbliuChnhThng = new JLabel("Điều chỉnh thông tin");
        lbliuChnhThng.setForeground(Color.CYAN);
        lbliuChnhThng.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
        lbliuChnhThng.setBounds(10, 328, 247, 43);
        contentPane.add(lbliuChnhThng);

        textField_IdSearch = new JTextField();
        textField_IdSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_IdSearch.setColumns(10);
        textField_IdSearch.setBounds(191, 372, 156, 28);
        contentPane.add(textField_IdSearch);

        JLabel msinhvie_1 = new JLabel("Mã sinh viên");
        msinhvie_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        msinhvie_1.setBounds(29, 372, 118, 22);
        contentPane.add(msinhvie_1);

        JLabel lblLp_1 = new JLabel("Lớp");
        lblLp_1.setFont(new Font("Tahoma", Font.BOLD, 18));
        lblLp_1.setBounds(29, 413, 52, 22);
        contentPane.add(lblLp_1);

        textField_ClassSearch = new JTextField();
        textField_ClassSearch.setFont(new Font("Tahoma", Font.PLAIN, 18));
        textField_ClassSearch.setColumns(10);
        textField_ClassSearch.setBounds(191, 410, 156, 28);
        contentPane.add(textField_ClassSearch);

        table_Search = new JTable();
        table_Search.setBounds(0, 0, 584, 1);
        contentPane.add(table_Search);

        table_Search.setModel(new DefaultTableModel(new Object[][]{},
                new java.lang.String[]{"Mã sinh viên", "Họ và tên", "Ngày sinh", "Lớp", "Giới tính", "Điểm trung bình"}));
        JScrollPane scrollPane_1 = new JScrollPane(table_Search);
        scrollPane_1.setBounds(390, 365, 586, 178);
        contentPane.add(scrollPane_1);

        JButton btnimTrungBnh = new JButton("Điểm trung bình cao nhất");
        btnimTrungBnh.addActionListener(actionListener);
        btnimTrungBnh.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btnimTrungBnh.setBounds(47, 511, 263, 42);
        contentPane.add(btnimTrungBnh);

        JButton btn_tim = new JButton("Tìm");
        btn_tim.addActionListener(actionListener);
        btn_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
        btn_tim.setBounds(68, 459, 230, 42);
        contentPane.add(btn_tim);


        // xet true folse button
        int row = table_thongTin.getSelectedRow();
        if (row < 0) {
            btnXoa.setEnabled(false);
            btnUpdate.setEnabled(false);
        }
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    // xóa toàn bộ thông tin trên mục nhập
    public void clearTable() {
        textField_msv.setEditable(true);
        textField_msv.setText("");
        textField_hvt.setText("");
        textField_class.setText("");
        textField_dayBirth.setText("");
        textField_diemTB.setText("");
        btnSex.clearSelection();
        btnLuu.setEnabled(true);
    }

    // kiêm tra mã sinh viên
    private boolean validateId() {
        try {
            int id = Integer.parseInt(this.textField_msv.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this,
                    "Student code is not valid.",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // kiểm tra sinh viên tồn tại
    // cập nhật lại sinh viên theo id
    private void checkInformation(Student student) {
        if (!studentService.checkID(student.getCode())) {
            this.studentService.add(student);
            System.out.println(student);
            this.addTable(student, table_thongTin);
            this.clearTable();
        } else {
            int choose = JOptionPane.showConfirmDialog(this,
                    "Mã sinh viên đã tồn tại \n Bạn có muốn cập nhật lại không ?", "Cảnh báo",
                    JOptionPane.YES_NO_OPTION);
            if (choose == JOptionPane.YES_OPTION) {
                this.studentService.deleteId(student.getCode());
                this.loadingTable(table_thongTin);
                this.updateStudent();
                this.addTable(student, table_thongTin);
                this.clearTable();
            }
        }

    }

    // lấy thông tin tên, kiểm tra
    private boolean validateName() {
        java.lang.String nameStudent = studentService.formatName(this.textField_hvt.getText());
        if (!studentService.checkName(nameStudent)) {
            JOptionPane.showMessageDialog(this,
                    "The name does not contain numbers or characters.", //tên không được chứa số hoặc kí tự
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // kiểm tra ngày sinh
    private boolean validateDayBirth() {
        try {
            Date dayBirth = new Date(this.textField_dayBirth.getText());
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this,
                    "Incorrect format dd/MM/yyyy.", //Định dạng không chính xác dd/mm/yyyy
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // kiểm tra giới tính
    private boolean validateSex() {
        // lấy giới tính
        boolean sex = true;
        if (!this.radioButton_nam.isSelected()) {
            if (this.radioButton_nu.isSelected()) {
                sex = false;
            } else {
                JOptionPane.showMessageDialog(this,
                        "Not filled out enough information.", //Không điền đủ thông tin
                        "Inane error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        return true;
    }

    // kiểm tra giới tính
    private boolean validatePoint() {
        try {
            double pointAvg = Double.parseDouble(this.textField_diemTB.getText());
            if (!studentService.checkPoint(pointAvg)) {
                JOptionPane.showMessageDialog(this,
                        "The right point >= 0 or point <= 10.",
                        "Inane error",
                        JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this,
                    "Points do not contain words or characters.",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // kiểm tra class
    private boolean validateClass() {
        java.lang.String className = this.textField_class.getText();
        if ("".equals(className)) {
            JOptionPane.showMessageDialog(this,
                    "Class must not leave empty.",
                    "Inane error",
                    JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    // lấy thông tin từ người nhập .
    public void getStudentInfo() {
// lấy tên lớp
        if (validateId() && validateName() && validateDayBirth() && validateClass() && validatePoint() && validateSex()) {
            int id = Integer.parseInt(this.textField_msv.getText());
            String nameStudent = studentService.formatName(this.textField_hvt.getText());
            String dayBirth = this.textField_dayBirth.getText();
            String className = this.textField_class.getText();
            boolean sex = true;
            if (!this.radioButton_nam.isSelected()) {
                if (this.radioButton_nu.isSelected()) {
                    sex = false;
                }
            }
            double pointAvg = Double.parseDouble(this.textField_diemTB.getText());
            Student student = new Student(id, nameStudent, dayBirth, className, sex ? "Nam" : "Nữ", pointAvg);
            this.checkInformation(student);
            btnXoa.setEnabled(true);
            btnUpdate.setEnabled(true);
        }
    }

    // điền thông tin của hàng được chọn từ bảng student
    // vào các trường tương ứng của student.
    // sinh viên đang được chọn
    private Student fillStudentFromSelectedRow() {
        DefaultTableModel modelTable = (DefaultTableModel) table_thongTin.getModel();
        int row = table_thongTin.getSelectedRow();
        // lấy thông tin từ bảng
        int id = Integer.valueOf(modelTable.getValueAt(row, 0) + "");
        java.lang.String name = modelTable.getValueAt(row, 1) + "";
        java.lang.String dayBirth = modelTable.getValueAt(row, 2) + "";
        java.lang.String className = modelTable.getValueAt(row, 3) + "";
        java.lang.String sex = modelTable.getValueAt(row, 4) + "";
        double avgPoint = Double.valueOf(modelTable.getValueAt(row, 5).toString());
        Student student = new Student(id, name, dayBirth, className, sex, avgPoint);
        btnHuyBo.setEnabled(true);
        btnXoa.setEnabled(true);
        return student;
    }


    // cập nhật thông tin student.
    public void showListStudents() {
        Student student = fillStudentFromSelectedRow();

        this.textField_msv.setText(student.getCode() + "");
        textField_msv.setEditable(false);
        this.textField_hvt.setText(student.getFullName());
        this.textField_dayBirth.setText(student.getBirthYear());
        this.textField_class.setText(student.getClassName());
        if (student.getSex().equals("Nam")) {
            radioButton_nam.setSelected(true);
        } else {
            radioButton_nu.setSelected(true);
        }
        this.textField_diemTB.setText(student.getAverageGrade() + "");
    }

    private void clearTable(JTable table) {
        while (true) {
            DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
            int row = modelTable.getRowCount();
            if (row == 0) {
                break;
            } else {
                try {
                    modelTable.removeRow(0);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    private void addTable(Student student, JTable table) {
        DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
        modelTable.addRow(new Object[]{student.getCode() + "",
                student.getFullName(), student.getBirthYear(),
                student.getClassName(), student.getSex(),
                student.getAverageGrade()});
    }

    // tải lại dữ liệu table
    private void loadingTable(JTable table) {
        while (true) {
            DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
            int row = modelTable.getRowCount();
            if (row == 0) {
                break;
            } else {
                try {
                    modelTable.removeRow(0);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            System.out.println(row);
        }
        for (Student student : this.studentService.getStudentList()) {
            this.addTable(student, table);
        }
    }

    private void loadingTable(Student student, JTable table) {
        while (true) {
            DefaultTableModel modelTable = (DefaultTableModel) table.getModel();
            int row = modelTable.getRowCount();
            if (row == 0) {
                break;
            } else {
                try {
                    modelTable.removeRow(0);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
        this.addTable(student, table);
    }

    // cập nhật lại sinh viên
    private void updateStudent() {
        int id = Integer.parseInt(this.textField_msv.getText());
        String nameStudent = studentService.formatName(this.textField_hvt.getText());
        String dayBirth = this.textField_dayBirth.getText();
        String className = this.textField_class.getText();
        double pointAvg = Double.parseDouble(this.textField_diemTB.getText());
        boolean sex = true;
        if (!this.radioButton_nam.isSelected()) {
            if (this.radioButton_nu.isSelected()) {
                sex = false;
            }
        }
        Student student = new Student(id, nameStudent, dayBirth, className, sex ? "Nam" : "Nữ", pointAvg);
        this.studentService.add(student);
    }

    // xóa sinh viên
    public void deleteStudent() {
        DefaultTableModel modelTable = (DefaultTableModel) table_thongTin.getModel();
        int row = table_thongTin.getSelectedRow();
        int choose = JOptionPane.showConfirmDialog(this, "Bạn có muốn xóa sinh viên này không?", "Cảnh báo", JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            Student student = fillStudentFromSelectedRow();
            this.studentService.deleteStudent(student);
            modelTable.removeRow(row);
        }
    }


    // tìm kiếm sinh viên
    public void searchStudent() {
        try {
            int idSearch = Integer.valueOf(this.textField_IdSearch.getText());
            String nameClass = this.textField_ClassSearch.getText();
            if ("".equals(nameClass)) {
                Student student = this.studentService.searchId(idSearch);
                loadingTable(student, table_Search);
            } else if (this.studentService.searchClass(nameClass, idSearch)) {
                JOptionPane.showMessageDialog(this,
                        "Sinh viên có tồn tại.",
                        "Notification",
                        JOptionPane.PLAIN_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Sinh viên không tồn tại.",
                        "Notification",
                        JOptionPane.PLAIN_MESSAGE);
            }
        } catch (Exception exception) {
            JOptionPane.showMessageDialog(this,
                    "Not filled out enough information.",
                    "Error",
                    JOptionPane.WARNING_MESSAGE);
        }
    }

    // tìm sinh viên có điêm cao nhất đầu tiên
    public String maxAverageScore() {
        Student students = this.studentService.searchPoint();
        System.out.println(students.toString());
        return "Sinh viên có điểm cao nhất: " + students.getFullName() + " với điểm trung bình là: " + students.getAverageGrade();
    }

    // đọc ghi file
    private void writeFile(String path) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this.studentService.getStudentList());
            oos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // lưu file
    public void saveFile() {
        if (this.studentService.getStudentList().size() > 0) {
            writeFile(AppConstant.PATH);
        } else {
            JFileChooser fileChooser = new JFileChooser();
            int returnVal = fileChooser.showSaveDialog(this);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                File file = fileChooser.getSelectedFile();
                writeFile(file.getAbsolutePath());
            }
        }
    }

    private void open(File file) {
        ArrayList<Student> studentsList;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            studentsList = (ArrayList<Student>) objectInputStream.readObject();
            this.studentService.setStudentList(studentsList);
            System.out.println(studentsList);
            objectInputStream.close();
        } catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
    }

    public void openFile() {
        JFileChooser fileChooser = new JFileChooser();
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            open(file);
            this.loadingTable(table_thongTin);
        }
        btnXoa.setEnabled(true);
        btnUpdate.setEnabled(true);
    }

    public void exitProgram() {
        int choose = JOptionPane.showConfirmDialog(this,
                "Bạn có muốn thoảt khỏi chương trình?", "Exit",
                JOptionPane.YES_NO_OPTION);
        if (choose == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void deleteStudentClass() {
        String nameClass = (String) JOptionPane.showInputDialog(
                this,
                "\nNhập lớp muốn xóa: ",
                "Thông báo",
                JOptionPane.PLAIN_MESSAGE);
        try {
            if (this.studentService.deleteStudent(nameClass)) {
                JOptionPane.showMessageDialog(this,
                        "Xóa thành công",
                        "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this,
                        "Không tìm thấy lớp chỉ định",
                        "Thông báo",
                        JOptionPane.WARNING_MESSAGE);

            }
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        this.loadingTable(table_thongTin);
        this.clearTable(table_Search);
    }
}
