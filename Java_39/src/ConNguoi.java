
public class ConNguoi {
	private String hoVaTen;
	private int namSinh;

	public ConNguoi(String hoVaTen, int namSinh) {
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
	}

	public String getHoVaTen() {
		return this.hoVaTen;
	}

	public int getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}

	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public void an() {
		System.out.println("mam mam");
	}
	public void uong() {
		System.out.println("uc uc");
	}
	public void ngu() {
		System.out.println("kho kho");
	}
}
