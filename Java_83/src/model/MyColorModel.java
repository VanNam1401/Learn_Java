package model;

import java.awt.Color;

public class MyColorModel {
	private Color foreground;
	private Color backGround;
	private boolean opaque; // thuộc tính để cho biết co tô màu viền hay không

	public MyColorModel() {
		super();
		this.foreground = Color.black;
		this.backGround = Color.white;
		this.opaque = true;
	}

	public Color getForeground() {
		return foreground;
	}

	public void setForeground(Color foreground) {
		this.foreground = foreground;
	}

	public Color getBackGround() {
		return backGround;
	}

	public void setBackGround(Color backGround) {
		this.backGround = backGround;
	}

	public boolean isOpaque() {
		return opaque;
	}

	public void setOpaque(boolean opaque) {
		this.opaque = opaque;
	}

}
