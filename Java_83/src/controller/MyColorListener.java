package controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import view.MyColorView;

public class MyColorListener implements ActionListener {
	private MyColorView myColorView;

	public MyColorListener(MyColorView myColorView) {
		super();
		this.myColorView = myColorView;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String src = e.getActionCommand();
		if (src.equals("Red Text")) {
			this.myColorView.changeTextColor(Color.red);
		} else if (src.equals("Yellow Text")) {
			this.myColorView.changeTextColor(Color.yellow);
		} else if (src.equals("Green Text")) {
			this.myColorView.changeTextColor(Color.green);
		} else if (src.equals("Red Background")) {
			this.myColorView.changeBacgroundColor(Color.red);
		} else if (src.equals("Yellow Background")) {
			this.myColorView.changeBacgroundColor(Color.yellow);
		} else {
			this.myColorView.changeBacgroundColor(Color.green);
		}
	}

}
