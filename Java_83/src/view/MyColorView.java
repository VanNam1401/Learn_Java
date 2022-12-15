package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MyColorListener;
import model.MyColorModel;

public class MyColorView extends JFrame {
	private MyColorModel myColorModel;
	private JLabel jLabel;

	public MyColorView() {
		this.myColorModel = new MyColorModel();
		this.init();
	}

	private void init() {
		this.setTitle("My Color");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Font font = new Font("Arial", Font.BOLD, 40);
		Font fontText = new Font("Arial", Font.BOLD, 100);
		
		MyColorListener myColorListener = new MyColorListener(this);

		jLabel = new JLabel("Text");
		jLabel.setFont(fontText);

		JPanel jPanel = new JPanel();
		jPanel.setLayout(new GridLayout(2, 3));

		JButton jButton_red = new JButton("Red Text");
		jButton_red.setFont(font);
		jButton_red.setForeground(Color.red);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_red.addActionListener(myColorListener);

		JButton jButton_yellow = new JButton("Yellow Text");
		jButton_yellow.setFont(font);
		jButton_yellow.setForeground(Color.yellow);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_yellow.addActionListener(myColorListener);

		JButton jButton_green = new JButton("Green Text");
		jButton_green.setFont(font);
		jButton_green.setForeground(Color.green);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_green.addActionListener(myColorListener);

		JButton jButton_backgound_redButton = new JButton("Red Background");
		jButton_backgound_redButton.setFont(font);
		jButton_backgound_redButton.setBackground(Color.red);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_backgound_redButton.addActionListener(myColorListener);

		JButton jButton_backgound_yellowButton = new JButton("Yellow Background");
		jButton_backgound_yellowButton.setFont(font);
		jButton_backgound_yellowButton.setBackground(Color.yellow);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_backgound_yellowButton.addActionListener(myColorListener);

		JButton jButton_backgound_greenButton = new JButton("Green Background");
		jButton_backgound_greenButton.setFont(font);
		jButton_backgound_greenButton.setBackground(Color.GREEN);
		jButton_red.setOpaque(true);
//		jButton_red.setBorderPainted(false);
		jButton_backgound_greenButton.addActionListener(myColorListener);

		jPanel.add(jButton_red);
		jPanel.add(jButton_yellow);
		jPanel.add(jButton_green);

		jPanel.add(jButton_backgound_redButton);
		jPanel.add(jButton_backgound_yellowButton);
		jPanel.add(jButton_backgound_greenButton);

		this.setLayout(new BorderLayout());
		this.add(jLabel, BorderLayout.NORTH);
		this.add(jPanel, BorderLayout.CENTER);

		this.setVisible(true);
	}

	public void changeTextColor(Color color) {
		this.jLabel.setForeground(color);
	}

	public void changeBacgroundColor(Color color) {
		this.jLabel.setBackground(color);
		this.jLabel.setOpaque(true);
	}

}
