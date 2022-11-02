
public class HangSanXuat {
	private String tenHangSanXuat;
	private QuocGia quocGia;

	public HangSanXuat(String tenHangSanXuat, QuocGia quocGia) {
		this.tenHangSanXuat = tenHangSanXuat;
		this.quocGia = quocGia;
	}

	public String getTenHangSanXuat() {
		return this.tenHangSanXuat;
	}

	public void setTenHangSanXuat(String tenHangSanXuat) {
		this.tenHangSanXuat = tenHangSanXuat;
	}

	public QuocGia getQuocGia() {
		return this.quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public String tenQuocGiaSx() {
		return this.quocGia.getTenQuocGia();
	}
}
