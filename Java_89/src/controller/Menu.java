package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MenuExampleView;

public class Menu implements ActionListener {
	private MenuExampleView menuExampleView;

	public Menu(MenuExampleView menuExampleView) {
		super();
		this.menuExampleView = menuExampleView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String button = e.getActionCommand();

		if (button.equals("Open")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu OPEN");
		} else if (button.equals("Exit")) {
//			this.menuExampleView.setTextJLabel("Ban da kich Jmenu EXIT");
			System.exit(0);
		} else if (button.equals("Welcome")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Welcome");
		}

	}

}
