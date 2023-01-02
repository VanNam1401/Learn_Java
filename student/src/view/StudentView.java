package view;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

import java.awt.Color;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

public class StudentView extends JFrame {

	private JPanel contentPane;
	private JTextField textField_msv;
	private JTextField textField_hvt;
	private JTextField textField_ngaysinh;
	private JTextField textField_class;
	private JTextField textField_diemtb;
	private JTable table_thongTin;
	private JTextField textField;
	private JTextField textField_1;
	private JTable table_timKiem;

	public StudentView() {
//		Font font = new Font("Area", Font.BOLD, 18);
		this.setTitle("STUDENT INFORMATION MANAGEMENT");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 643);

		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu jmenu_File = new JMenu("File");
		jmenu_File.setMnemonic(KeyEvent.VK_F);
		jmenu_File.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(jmenu_File);

		JMenuItem jmenu_Open = new JMenuItem("Open", KeyEvent.VK_O);
		jmenu_Open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmenu_Open.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jmenu_File.add(jmenu_Open);

		JMenuItem jmenu_Save = new JMenuItem("Save", KeyEvent.VK_S);
		jmenu_Save.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmenu_Save.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jmenu_File.add(jmenu_Save);

		JSeparator separator = new JSeparator();
		jmenu_File.add(separator);

		JMenuItem jmenu_Exit = new JMenuItem("Exit", KeyEvent.VK_E);
		jmenu_Exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmenu_Exit.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jmenu_File.add(jmenu_Exit);

		JMenu jmenu_About = new JMenu("About");
		jmenu_About.setMnemonic(KeyEvent.VK_A);
		jmenu_About.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(jmenu_About);

		JMenuItem jmenu_About_me = new JMenuItem("About me", KeyEvent.VK_B);
		jmenu_About_me.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N,InputEvent.CTRL_DOWN_MASK));
		jmenu_About_me.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		jmenu_About.add(jmenu_About_me);
		
		JMenu mnNewMenu_1 = new JMenu("Lọc");
		mnNewMenu_1.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		menuBar.add(mnNewMenu_1);
		
		JMenuItem locMaSinhVien = new JMenuItem("Mã sinh viên");
		locMaSinhVien.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu_1.add(locMaSinhVien);
		
		JMenuItem locTheoLop = new JMenuItem("Theo lớp");
		locTheoLop.setFont(new Font("Segoe UI", Font.PLAIN, 18));
		mnNewMenu_1.add(locTheoLop);

		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel msinhvie = new JLabel("Mã sinh viên");
		msinhvie.setFont(new Font("Tahoma", Font.BOLD, 18));
		msinhvie.setBounds(29, 63, 118, 22);
		contentPane.add(msinhvie);

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

		textField_ngaysinh = new JTextField();
		textField_ngaysinh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_ngaysinh.setColumns(10);
		textField_ngaysinh.setBounds(191, 139, 156, 28);
		contentPane.add(textField_ngaysinh);

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

		textField_diemtb = new JTextField();
		textField_diemtb.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_diemtb.setColumns(10);
		textField_diemtb.setBounds(191, 209, 156, 28);
		contentPane.add(textField_diemtb);

		JLabel lblNewLabel = new JLabel("Thông tin sinh viên");
		lblNewLabel.setForeground(new Color(0, 255, 255));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lblNewLabel.setBounds(10, 10, 247, 43);
		contentPane.add(lblNewLabel);

		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(10, 42, 364, 2);
		contentPane.add(separator_1);

		table_thongTin = new JTable();
		table_thongTin.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 sinh vi\u00EAn", "H\u1ECD v\u00E0 t\u00EAn", "Ng\u00E0y sinh", "L\u1EDBp", "Giới tính", "\u0110i\u1EC3m trung b\u00ECnh"
			}
		));

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

		JRadioButton radioButton_nam = new JRadioButton("Nam");
		radioButton_nam.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_nam.setBounds(191, 247, 66, 26);
		contentPane.add(radioButton_nam);

		JRadioButton radioButton_nu = new JRadioButton("Nữ");
		radioButton_nu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		radioButton_nu.setBounds(284, 247, 63, 31);
		contentPane.add(radioButton_nu);

		ButtonGroup btn_gioiTinh = new ButtonGroup();
		btn_gioiTinh.add(radioButton_nam);
		btn_gioiTinh.add(radioButton_nu);

		JSeparator separator_2_1 = new JSeparator();
		separator_2_1.setBounds(10, 563, 966, 2);
		contentPane.add(separator_2_1);

		JButton btnThem = new JButton("Thêm");
		btnThem.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnThem.setBounds(58, 283, 120, 42);
		contentPane.add(btnThem);

		JButton btnXoa = new JButton("Xóa");
		btnXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnXoa.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnXoa.setBounds(612, 283, 120, 42);
		contentPane.add(btnXoa);

		JButton btnLuu = new JButton("Lưu");
		btnLuu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLuu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnLuu.setBounds(242, 283, 120, 42);
		contentPane.add(btnLuu);

		JButton btnHuyBo = new JButton("Hủy bỏ");
		btnHuyBo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnHuyBo.setBounds(809, 283, 120, 42);
		contentPane.add(btnHuyBo);

		JLabel lbliuChnhThng = new JLabel("Điều chỉnh thông tin");
		lbliuChnhThng.setForeground(Color.CYAN);
		lbliuChnhThng.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lbliuChnhThng.setBounds(10, 328, 247, 43);
		contentPane.add(lbliuChnhThng);

		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField.setColumns(10);
		textField.setBounds(191, 372, 156, 28);
		contentPane.add(textField);

		JLabel msinhvie_1 = new JLabel("Mã sinh viên");
		msinhvie_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		msinhvie_1.setBounds(29, 372, 118, 22);
		contentPane.add(msinhvie_1);

		JLabel lblLp_1 = new JLabel("Lớp");
		lblLp_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLp_1.setBounds(29, 413, 52, 22);
		contentPane.add(lblLp_1);

		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setColumns(10);
		textField_1.setBounds(191, 410, 156, 28);
		contentPane.add(textField_1);

		table_timKiem = new JTable();
		table_timKiem.setBounds(0, 0, 584, 1);
		contentPane.add(table_timKiem);

		table_timKiem.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"M\u00E3 sinh vi\u00EAn", "H\u1ECD v\u00E0 t\u00EAn", "Ng\u00E0y sinh", "L\u1EDBp", "Giới tính", "\u0110i\u1EC3m trung b\u00ECnh"
			}
		));
		JScrollPane scrollPane_1 = new JScrollPane(table_timKiem);
		scrollPane_1.setBounds(390, 365, 586, 178);
		contentPane.add(scrollPane_1);

		JButton btnimTrungBnh = new JButton("Điểm trung bình cao nhất");
		btnimTrungBnh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnimTrungBnh.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnimTrungBnh.setBounds(47, 511, 263, 42);
		contentPane.add(btnimTrungBnh);

		JButton btn_tim = new JButton("Tìm");
		btn_tim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btn_tim.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btn_tim.setBounds(68, 459, 230, 42);
		contentPane.add(btn_tim);
		
		JButton btnCapNhat = new JButton("Cập nhật");
		btnCapNhat.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnCapNhat.setBounds(427, 283, 120, 42);
		contentPane.add(btnCapNhat);
		
//		JButton btnCapNhatlan2 = new JButton("Cập nhật");
//		btnCapNhatlan2.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		btnCapNhatlan2.setBounds(427, 283, 120, 42);
//		contentPane.add(btnCapNhatlan2);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
}
