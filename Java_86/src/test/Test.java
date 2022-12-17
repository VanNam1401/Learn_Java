package test;

import javax.swing.UIManager;
import view.TimKiemView;

public class Test {
	public static void main(String[] args) {
		try {
//			com.sun.java.swing.plaf.motif.MotifLookAndFeel
//			com.sun.java.swing.plaf.windows.WindowsLookAndFeel

//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
//			UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");	
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new TimKiemView();
		} catch (Exception ex) {
			ex.printStackTrace();
		}

	}
}
