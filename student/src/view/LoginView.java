package view;

import controller.LoginController;
import model.User;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.net.URL;

public class LoginView extends JFrame {

	public JPanel contentPane;
	public JTextField userNameField;
	public JPasswordField passwordField;
	public JButton loginBtn;
	public JLabel icongoc;

	public LoginView() {
		ActionListener actionListener = new LoginController(this);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 377, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		// hình ảnh cho JFame.
		URL urllUrl = LoginView.class.getResource("/data/icon.png");
		Image image = Toolkit.getDefaultToolkit().createImage(urllUrl);
		this.setIconImage(image);

		JLabel dangNhap = new JLabel("MEMBER LOGIN");
		dangNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		dangNhap.setBounds(116, 150, 142, 63);
		contentPane.add(dangNhap);

		JLabel userNameLabel = new JLabel("Username");
		userNameLabel.setIcon(
				new ImageIcon(Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/login.png"))));
		userNameLabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		userNameLabel.setBounds(30, 210, 140, 32);
		contentPane.add(userNameLabel);

		JLabel passwordlabel = new JLabel("Password");
		passwordlabel.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/password.png"))));
		passwordlabel.setFont(new Font("Tahoma", Font.ITALIC, 18));
		passwordlabel.setBounds(30, 257, 140, 32);
		contentPane.add(passwordlabel);

		userNameField = new JTextField();
		userNameField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		userNameField.setBounds(163, 212, 156, 28);
		contentPane.add(userNameField);
		userNameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setFont(new Font("Tahoma", Font.PLAIN, 18));
		passwordField.setColumns(10);
		passwordField.setBounds(163, 259, 156, 28);
		contentPane.add(passwordField);

		loginBtn = new JButton("LOGIN");
		loginBtn.setMnemonic(KeyEvent.VK_ENTER);
		loginBtn.addActionListener(actionListener);
		loginBtn.setBackground(Color.CYAN);
		loginBtn.setOpaque(true);
		loginBtn.setBorderPainted(false);
		loginBtn.setFont(new Font("Tahoma", Font.BOLD, 18));
		loginBtn.setBounds(133, 322, 113, 44);
		contentPane.add(loginBtn);

		icongoc = new JLabel("");
		icongoc.setIcon(new ImageIcon(
				Toolkit.getDefaultToolkit().createImage(LoginView.class.getResource("/data/person.png"))));
		icongoc.setFont(new Font("Tahoma", Font.ITALIC, 18));
		icongoc.setBounds(117, 27, 156, 130);
		contentPane.add(icongoc);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	public User getUser() {
		return new User(userNameField.getText(), String.copyValueOf(passwordField.getPassword()));
	}
}
