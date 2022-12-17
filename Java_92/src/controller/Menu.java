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

		if (button.equals("Undo")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Undo");
		} else if (button.equals("Exit")) {
//			this.menuExampleView.setTextJLabel("Ban da kich Jmenu EXIT");
			System.exit(0);
		} else if (button.equals("Redo")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Redo");
		} else if (button.equals("Copy")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Copy");
		} else if (button.equals("Past")) {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Past");
		} else {
			this.menuExampleView.setTextJLabel("Ban da kich Jmenu Cut");
		}

	}

}
