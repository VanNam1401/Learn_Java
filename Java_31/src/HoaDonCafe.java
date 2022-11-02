
public class HoaDonCafe {
	private String tenLoaiCafe;
	private double giaTien1kg;
	private double khoiLuong;

	public HoaDonCafe(String name, double gia, double kl) {
		this.tenLoaiCafe = name;
		this.giaTien1kg = gia;
		this.khoiLuong = kl;
	}

	public double tinhTongTien() {
		return this.giaTien1kg * this.khoiLuong;
	}

	public boolean kiemTraKhoiLuongLonHon(double kl2) {
//		if(this.khoiLuong > kl2) {
//			return true;
//		} else {
//			return false;
//		}
		return this.khoiLuong > kl2;
	}

	public boolean kiemTraTongTienLonHon500() {
		return this.tinhTongTien() > 500000;
	}

	public double giamGia(double x) {
		if (this.tinhTongTien() > 500000) {
			return this.tinhTongTien() * (x / 100);
		} else {
			return 0;
		}
	}

	public double giaSauKhiGiam(double y) {
		return this.tinhTongTien() - this.giamGia(y);
	}
}
