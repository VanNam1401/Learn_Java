package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.TimKiemListener;
import model.TimKiemModel;

public class TimKiemView extends JFrame {
	private TimKiemModel timKiemModel;
	private JTextArea jTextArea_vanBan;
	private JTextField jTextField_tuKhoa;
	private JLabel jaJLabel_ketQua;

	public TimKiemView() throws HeadlessException {
		super();
		this.timKiemModel = new TimKiemModel();
		this.init();
	}

	private void init() {
		// khai báo cần thiết
		this.setTitle("Tim kiem");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// khai báo font chữ
		Font font = new Font("Arial", Font.BOLD, 40);

		// tạo hàng chữ Văn bản.
		JLabel jLabel_vanBan = new JLabel("Van Ban");
		jLabel_vanBan.setFont(font);

		// tạo vùng nhập văn bản
		jTextArea_vanBan = new JTextArea(10, 100);
		jTextArea_vanBan.setFont(font);

		JScrollPane jScrollPane = new JScrollPane(jTextArea_vanBan, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		jScrollPane.setViewportView(jTextArea_vanBan);
		// Footer
		TimKiemListener listener = new TimKiemListener(this);

		JLabel jLabel_tuKhoa = new JLabel("Tu khoa");
		jLabel_tuKhoa.setFont(font);
		jTextField_tuKhoa = new JTextField();
		jTextField_tuKhoa.setFont(font);

		// khởi tao nút nhấn.
		JButton jButton_thongKe = new JButton("Thong ke");
		jButton_thongKe.setFont(font);
		jButton_thongKe.addActionListener(listener);
		jButton_thongKe.setBackground(Color.blue);

		jaJLabel_ketQua = new JLabel();
		jaJLabel_ketQua.setFont(font);
		jaJLabel_ketQua.setBackground(Color.yellow);
		jaJLabel_ketQua.setOpaque(true);

		JPanel jPanel_footer = new JPanel();
		jPanel_footer.setLayout(new GridLayout(2, 2, 20, 20));
		jPanel_footer.add(jLabel_tuKhoa);
		jPanel_footer.add(jTextField_tuKhoa);
		jPanel_footer.add(jButton_thongKe);
		jPanel_footer.add(jaJLabel_ketQua);

		this.setLayout(new BorderLayout());
		this.add(jLabel_vanBan, BorderLayout.NORTH);
		this.add(jScrollPane, BorderLayout.CENTER);
		this.add(jPanel_footer, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void timKiem() {
		this.timKiemModel.setVanBan(jTextArea_vanBan.getText());
		this.timKiemModel.setTuKhoa(jTextField_tuKhoa.getText());
		this.timKiemModel.timKiem();
		this.jaJLabel_ketQua.setText(this.timKiemModel.getKetQua());
	}
}
