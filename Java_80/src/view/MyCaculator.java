package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCaculator extends JFrame {
	public MyCaculator() {
		// TODO Auto-generated constructor stub
		this.setTitle("My Calculator");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JTextField jTextField = new JTextField(50);
		JPanel jPanel_head = new JPanel();
		jPanel_head.setLayout(new BorderLayout());
		jPanel_head.add(jTextField, BorderLayout.CENTER);
		
		
		JButton jButton_0 = new JButton("0");
		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");
		JButton jButton_6 = new JButton("6");
		JButton jButton_7 = new JButton("7");
		JButton jButton_8 = new JButton("8");
		JButton jButton_9 = new JButton("9");
		JButton jButton_cong = new JButton("+");
		JButton jButton_tru = new JButton("-");
		JButton jButton_nhan = new JButton("*");
		JButton jButton_chia = new JButton("/");
		JButton jButton_bang = new JButton("=");
		
		JPanel jJPanel_button = new JPanel();
		jJPanel_button.setLayout(new GridLayout(5, 3));
		jJPanel_button.add(jButton_0);
		jJPanel_button.add(jButton_1);
		jJPanel_button.add(jButton_2);
		jJPanel_button.add(jButton_3);
		jJPanel_button.add(jButton_4);
		jJPanel_button.add(jButton_5);
		jJPanel_button.add(jButton_6);
		jJPanel_button.add(jButton_7);
		jJPanel_button.add(jButton_8);
		jJPanel_button.add(jButton_9);
		jJPanel_button.add(jButton_cong);
		jJPanel_button.add(jButton_tru);
		jJPanel_button.add(jButton_nhan);
		jJPanel_button.add(jButton_chia);
		jJPanel_button.add(jButton_bang);

		this.setLayout(new BorderLayout());
		this.add(jPanel_head, BorderLayout.NORTH);
		this.add(jJPanel_button, BorderLayout.CENTER);
		
		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");
			
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCaculator();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
