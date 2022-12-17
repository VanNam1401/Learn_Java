package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.MouseExampleController;
import model.MouseExampleModel;

public class MouseExampleView extends JFrame {
	private MouseExampleModel model;
	private JPanel jPanel_mouse;
	private JLabel jLabel_xJLabel;
	private JLabel jLabel_position;
	private JLabel jLabel_yJLabel;
	private JLabel jLabel_countJLabel;
	private JLabel jLabel_count_valueJLabel;
	private JLabel jLabel_empty_1;
	private JLabel jLabel_check_inJLabel;
	private JLabel jLabel_check_in_valueJLabel;
	private JLabel jLabel_empty_2;

	public MouseExampleView() throws HeadlessException {
		super();
		this.model = new MouseExampleModel();
		this.init();
	}

	private void init() {
		this.setTitle("Mouse Example");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		MouseExampleController mouseExampleController = new MouseExampleController(this);
		Font font = new Font("Arial", Font.BOLD, 20);

		jPanel_mouse = new JPanel();
		jPanel_mouse.setBackground(Color.cyan);
		jPanel_mouse.addMouseListener(mouseExampleController);
		jPanel_mouse.addMouseMotionListener(mouseExampleController);
		JPanel jPanel_info = new JPanel();
		jPanel_info.setLayout(new GridLayout(3, 3));

		jLabel_position = new JLabel("Position");
		jLabel_position.setFont(font);
		jLabel_xJLabel = new JLabel("x = ");
		jLabel_xJLabel.setFont(font);
		jLabel_yJLabel = new JLabel("y = ");
		jLabel_yJLabel.setFont(font);
		jLabel_countJLabel = new JLabel("Number of click: ");
		jLabel_countJLabel.setFont(font);
		jLabel_count_valueJLabel = new JLabel("n");
		jLabel_count_valueJLabel.setFont(font);
		jLabel_empty_1 = new JLabel();
		jLabel_empty_1.setFont(font);
		jLabel_check_inJLabel = new JLabel("Mouse is in component: ");
		jLabel_check_inJLabel.setFont(font);
		jLabel_check_in_valueJLabel = new JLabel("no");
		jLabel_check_in_valueJLabel.setFont(font);
		jLabel_empty_2 = new JLabel();
		jLabel_empty_2.setFont(font);

		jPanel_info.add(jLabel_position);
		jPanel_info.add(jLabel_xJLabel);
		jPanel_info.add(jLabel_yJLabel);
		jPanel_info.add(jLabel_countJLabel);
		jPanel_info.add(jLabel_count_valueJLabel);
		jPanel_info.add(jLabel_empty_1);
		jPanel_info.add(jLabel_check_inJLabel);
		jPanel_info.add(jLabel_check_in_valueJLabel);
		jPanel_info.add(jLabel_empty_2);

		this.setLayout(new BorderLayout());
		this.add(jPanel_mouse, BorderLayout.CENTER);
		this.add(jPanel_info, BorderLayout.SOUTH);

		this.setVisible(true);
	}

	public void addClick() {
		this.model.addClick();
		this.jLabel_count_valueJLabel.setText(this.model.getCount() + "");
	}

	public void enter() {
		this.model.enter();
		this.jLabel_check_in_valueJLabel.setText(this.model.getCheckIn() + "");
	}

	public void exit() {
		this.model.exit();
		this.jLabel_check_in_valueJLabel.setText(this.model.getCheckIn() + "");
	}

	public void update(int x, int y) {
		this.model.setX(x);
		this.model.setY(y);
		this.jLabel_xJLabel.setText(this.model.getX() + "");
		this.jLabel_yJLabel.setText(this.model.getY() + "");
	}
}
