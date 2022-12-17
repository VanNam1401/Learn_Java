package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;

import controller.Menu;

public class MenuExampleView extends JFrame {
	private JLabel jLabel;

	public MenuExampleView() {
		// TODO Auto-generated constructor stub
		this.setTitle("Menu Ex");
		this.setSize(500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setLayout(new BorderLayout());
		
		// tao controller
		Menu menu = new Menu(this);

		// tạo thanh menu
		JMenuBar jMenuBar = new JMenuBar();

		// tạo 1 menu
		JMenu jMenu_file = new JMenu("File");
		jMenu_file.setMnemonic(KeyEvent.VK_F);

		// tạo các item menu.
		JMenuItem jMenuItem_new = new JMenuItem("New", KeyEvent.VK_N);
		jMenuItem_new.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
		jMenuItem_new.addActionListener(menu);
		JMenuItem jMenuItem_open = new JMenuItem("Open", KeyEvent.VK_O);
		jMenuItem_open.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.ALT_DOWN_MASK));
		jMenuItem_open.addActionListener(menu);
		JMenuItem jMenuItem_exit = new JMenuItem("Exit", KeyEvent.VK_X);
		jMenuItem_exit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_DOWN_MASK));
		jMenuItem_exit.addActionListener(menu);
		jMenu_file.add(jMenuItem_new);
		jMenu_file.add(jMenuItem_open);
		jMenu_file.addSeparator();
		jMenu_file.add(jMenuItem_exit);

		JMenu jMenu_help = new JMenu("Help");
		jMenu_help.setMnemonic(KeyEvent.VK_H);

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

		// tạo thanh công cụ
		JToolBar jToolBar = new JToolBar();

		JButton jButton_undo = new JButton("Undo");
		jButton_undo.setToolTipText("Nhan vao day de quay lai");
		jButton_undo.addActionListener(menu);
//		jButton_undo.setFont(font);
		JButton jButton_redo = new JButton("Redo");
		jButton_redo.addActionListener(menu);
//		jButton_redo.setFont(font);
		JButton jButton_copy = new JButton("Copy");
		jButton_copy.addActionListener(menu);
//		jButton_copy.setFont(font);
		JButton jButton_cut = new JButton("Cut");
		jButton_cut.addActionListener(menu);
//		jButton_cut.setFont(font);
		JButton jButton_past = new JButton("Past");
		jButton_past.addActionListener(menu);
//		jButton_past.setFont(font);

		jToolBar.add(jButton_undo);
		jToolBar.add(jButton_redo);
		jToolBar.add(jButton_copy);
		jToolBar.add(jButton_cut);
		jToolBar.add(jButton_past);

		this.add(jToolBar, BorderLayout.NORTH);
		this.add(jLabel, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public void setTextJLabel(String s) {
		// TODO Auto-generated method stub
		this.jLabel.setText(s);

	}

}
