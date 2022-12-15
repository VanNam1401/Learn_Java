package view;

import javax.swing.JFrame;

public class ViDu {
	public static void main(String[] args) {
		JFrame jFrame = new JFrame();
		// gắn kích cỡ
		jFrame.setSize(600, 600);
		
		// gắn tên cho JFrame
		jFrame.setTitle("Vi du JFrame");
		
		// gắn vị trí hiển thị
		jFrame.setLocation(300, 300);

		// thoat ra khoi chuong trinh khi dong cua so
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// hiển thị giao diện
		jFrame.setVisible(true);
	}
}
