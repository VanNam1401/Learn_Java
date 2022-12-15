package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_BorderLayout extends JFrame {
	public ViDu_BorderLayout() {
		this.setTitle("Vi du");
		this.setSize(500, 600);

		// căn giữa cửa số chương trình
		setLocationRelativeTo(null);

		// cài đặt layout
		BorderLayout flowLayout = new BorderLayout(); // k có khoảng cách giữa các thành phàn
		BorderLayout flowLayout_1 = new BorderLayout(5, 5); // có khoảng cách giữa các thành phần

//		this.setLayout(flowLayout);
		this.setLayout(flowLayout_1);

		JButton jButton_1 = new JButton("1");
		JButton jButton_2 = new JButton("2");
		JButton jButton_3 = new JButton("3");
		JButton jButton_4 = new JButton("4");
		JButton jButton_5 = new JButton("5");

		// add thành phần
		this.add(jButton_1, BorderLayout.NORTH);
		this.add(jButton_2, BorderLayout.SOUTH);
		this.add(jButton_3, BorderLayout.WEST);
		this.add(jButton_4, BorderLayout.EAST);
		this.add(jButton_5, BorderLayout.CENTER);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_BorderLayout();
	}

}
