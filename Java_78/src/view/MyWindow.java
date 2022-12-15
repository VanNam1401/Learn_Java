package view;

import javax.swing.JFrame;

public class MyWindow extends JFrame {
	public MyWindow() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void showIt() {
		this.setVisible(true);
	}

	public void showIt(String title) {
		this.setTitle(title);
		this.setVisible(true);
	}

	public void showIt(String title, int width, int height) {
		this.setTitle(title);
		this.setSize(width, height);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		MyWindow myWindow = new MyWindow();
		myWindow.showIt();
		MyWindow myWindow2 = new MyWindow();
		myWindow2.showIt("My Window");
		MyWindow myWindow3 = new MyWindow();
		myWindow3.showIt("Window", 400, 600);
	}
}
