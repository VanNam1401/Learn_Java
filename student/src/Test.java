import javax.swing.UIManager;

import view.LoginView;
import view.StudentView;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
//			new LoginView();
			new StudentView();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
