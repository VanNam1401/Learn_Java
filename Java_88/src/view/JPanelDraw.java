package view;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class JPanelDraw extends JPanel {

	public JPanelDraw() {
		// TODO Auto-generated constructor stub
		this.setBackground(Color.white);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		g.setColor(Color.red);
		g.drawLine(15, 15, 50, 150);

		g.setColor(Color.blue);
		g.drawOval(255, 255, 50, 50);

		g.setColor(Color.green);
		g.drawRect(45, 150, 30, 90);

		g.setColor(Color.pink);
		g.fillOval(400, 300, 50, 50);

		g.setColor(Color.darkGray);
		g.fillRect(100, 100, 150, 150);

		g.setColor(Color.CYAN);
		g.fill3DRect(150, 250, 50, 50, false);
		g.fill3DRect(250, 250, 50, 50, true);
	}

}
