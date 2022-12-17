package view;

import java.awt.BorderLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Menu;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;

	public MenuExampleView() {
		// TODO Auto-generated constructor stub
		this.setTitle("Menu Ex");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		// tao controller
		Menu menu = new Menu(this);
		
		// tạo thanh menu
		JMenuBar jMenuBar = new JMenuBar();

		// tạo 1 menu
		JMenu jMenu_file = new JMenu("File");

		// tạo các item menu.
		JMenuItem jMenuItem_open = new JMenuItem("Open");
		jMenuItem_open.addActionListener(menu);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit");
		jMenuItem_exit.addActionListener(menu);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_help = new JMenu("Help");
		JMenuItem jMenuItem_welcom = new JMenuItem("Welcome");
		jMenuItem_welcom.addActionListener(menu);
		jMenu_help.add(jMenuItem_welcom);

		jMenuBar.add(jMenu_file);
		jMenuBar.add(jMenu_help);

		// thêm thanh menu vào chương trình
		this.setJMenuBar(jMenuBar);

		// tạo label hiển thị
		Font font = new Font("Area", Font.BOLD, 50);
		 jLabel = new JLabel();

		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		// TODO Auto-generated method stub
		this.jLabel.setText(s);
		
	}
	
	

}
