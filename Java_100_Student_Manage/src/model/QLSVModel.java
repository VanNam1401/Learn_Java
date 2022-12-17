package model;

import java.util.ArrayList;

public class QLSVModel {
	private ArrayList<ThiSinh> dsThiSinh;

	public QLSVModel() {
		super();
		this.dsThiSinh = new ArrayList<>();
	}

	public QLSVModel(ArrayList<ThiSinh> dsThiSinh) {
		super();
		this.dsThiSinh = dsThiSinh;
	}

	public ArrayList<ThiSinh> getDsThiSinh() {
		return dsThiSinh;
	}

	public void setDsThiSinh(ArrayList<ThiSinh> dsThiSinh) {
		this.dsThiSinh = dsThiSinh;
	}

	public void insert(ThiSinh thiSinh) {
		this.dsThiSinh.add(thiSinh);
	}

	public void remove(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
	}

	public void update(ThiSinh thiSinh) {
		this.dsThiSinh.remove(thiSinh);
		this.dsThiSinh.add(thiSinh);
	}
}
