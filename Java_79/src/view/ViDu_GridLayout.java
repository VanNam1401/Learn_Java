package view;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ViDu_GridLayout extends JFrame {
	public ViDu_GridLayout() {
		this.setTitle("Vi du");
		this.setSize(500, 600);

		// căn giữa cửa số chương trình
		setLocationRelativeTo(null);

		// cài đặt layout
		GridLayout gridLayout = new GridLayout();
		GridLayout gridLayout_1 = new GridLayout(4, 4);
		GridLayout gridLayout_2 = new GridLayout(4, 4, 25, 25);
//		this.setLayout(gridLayout);
//		this.setLayout(gridLayout_1);
		this.setLayout(gridLayout_2);

//		JButton jButton_1 = new JButton("1");
//		JButton jButton_2 = new JButton("2");
//		JButton jButton_3 = new JButton("3");

		for (int i = 0; i < 16; i++) {
			JButton jButton = new JButton(i + "");
			this.add(jButton);
		}

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ViDu_GridLayout();
	}

}
