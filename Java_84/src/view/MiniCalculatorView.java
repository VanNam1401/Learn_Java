package view;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controller.MiniCalculatorListener;
import model.MiniCalculatorModel;

public class MiniCalculatorView extends JFrame {
	private MiniCalculatorModel miniCalculatorModel;
	private JTextField jTextField_firsValue;
	private JTextField jTextField_secondValue;
	private JTextField jTextField_answer;

	public MiniCalculatorView() throws HeadlessException {
		super();
		this.miniCalculatorModel = new MiniCalculatorModel();
		this.init();
	}

	private void init() {
		// TODO Auto-generated method stub
		this.setTitle("Mini Calculator");
		this.setSize(600, 300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		Font font = new Font("Arial", Font.BOLD, 40);
		JLabel jaJLabel_firstValue = new JLabel("1st Value");
		jaJLabel_firstValue.setFont(font);
		JLabel jaJLabel_secondValueJLabel = new JLabel("2nd Value");
		jaJLabel_secondValueJLabel.setFont(font);
		JLabel jaJLabel_answer = new JLabel("Answer");
		jaJLabel_answer.setFont(font);

		jTextField_firsValue = new JTextField(50);
		jTextField_firsValue.setFont(font);
		jTextField_secondValue = new JTextField(50);
		jTextField_secondValue.setFont(font);
		jTextField_answer = new JTextField(50);
		jTextField_answer.setFont(font);

		JPanel jPanelIO = new JPanel();
		jPanelIO.setLayout(new GridLayout(3, 2, 10, 10));
		jPanelIO.add(jaJLabel_firstValue);
		jPanelIO.add(jTextField_firsValue);
		jPanelIO.add(jaJLabel_secondValueJLabel);
		jPanelIO.add(jTextField_secondValue);
		jPanelIO.add(jaJLabel_answer);
		jPanelIO.add(jTextField_answer);

		MiniCalculatorListener miniCalculatorListener = new MiniCalculatorListener(this);
		JButton jButton_plus = new JButton("+");
		jButton_plus.setFont(font);
		jButton_plus.addActionListener(miniCalculatorListener);
		JButton jButton_minus = new JButton("-");
		jButton_minus.setFont(font);
		jButton_minus.addActionListener(miniCalculatorListener);
		JButton jButton_multiply = new JButton("*");
		jButton_multiply.setFont(font);
		jButton_multiply.addActionListener(miniCalculatorListener);
		JButton jButton_divide = new JButton("/");
		jButton_divide.setFont(font);
		jButton_divide.addActionListener(miniCalculatorListener);
		JButton jButton_pow = new JButton("^");
		jButton_pow.setFont(font);
		jButton_pow.addActionListener(miniCalculatorListener);
		JButton jButton_mod = new JButton("%");
		jButton_mod.setFont(font);
		jButton_mod.addActionListener(miniCalculatorListener);

		JPanel jPanelButtons = new JPanel();
		jPanelButtons.setLayout(new GridLayout(2, 3, 5, 5));
		jPanelButtons.add(jButton_plus);
		jPanelButtons.add(jButton_minus);
		jPanelButtons.add(jButton_multiply);
		jPanelButtons.add(jButton_divide);
		jPanelButtons.add(jButton_pow);
		jPanelButtons.add(jButton_mod);

		this.setLayout(new BorderLayout(10, 10));
		this.add(jPanelIO, BorderLayout.CENTER);
		this.add(jPanelButtons, BorderLayout.SOUTH);
		this.setVisible(true);
	}

	public void plus() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.plus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void minus() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.minus();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void multiply() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.multiply();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void divide() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.divide();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void pow() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.pow();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}

	public void mod() {
		double firstValue = Double.valueOf(jTextField_firsValue.getText());
		double secondValue = Double.valueOf(jTextField_secondValue.getText());
		this.miniCalculatorModel.setFirst_value(firstValue);
		this.miniCalculatorModel.setSecond_value(secondValue);
		this.miniCalculatorModel.mod();
		this.jTextField_answer.setText(this.miniCalculatorModel.getAnswer() + "");
	}
}
