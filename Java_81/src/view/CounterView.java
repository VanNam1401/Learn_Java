package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.CounterListener;
import model.CounterModel;

public class CounterView extends JFrame {
	private CounterModel counterModel;
	private JButton jButton_up;
	private JButton jButton_down;
	private JButton jButton_reset;
	private JLabel jLabel_value;

	public CounterView() {
		this.counterModel = new CounterModel();
		init();
		this.setVisible(true);

	}

	private void init() {
		this.setTitle("Counter");
		this.setSize(300, 300);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ActionListener ac = new CounterListener(this);

		jButton_up = new JButton("UP");
		jButton_up.addActionListener(ac);
		jButton_down = new JButton("DOWN");
		jButton_down.addActionListener(ac);
		jLabel_value = new JLabel(this.counterModel.getValue() + "", JLabel.CENTER);
		jButton_reset = new JButton("Reset");
		jButton_reset.addActionListener(ac);

		JPanel jaJPanel = new JPanel();
		jaJPanel.setLayout(new BorderLayout(5, 5));
		jaJPanel.add(jButton_up, BorderLayout.WEST);
		jaJPanel.add(jLabel_value, BorderLayout.CENTER);
		jaJPanel.add(jButton_down, BorderLayout.EAST);
		jaJPanel.add(jButton_reset, BorderLayout.SOUTH);

		this.setLayout(new BorderLayout(5, 5));
		this.add(jaJPanel, BorderLayout.CENTER);
	}

	public void increment() {
		this.counterModel.increment();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}

	public void decrement() {
		this.counterModel.decrement();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}

	public void reset() {
		this.counterModel.reset();
		this.jLabel_value.setText(this.counterModel.getValue() + "");
	}
}
