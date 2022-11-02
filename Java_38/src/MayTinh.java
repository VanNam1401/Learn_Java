
public class MayTinh {
	private HangSanXuat hangSanXuat;
	private Ngay ngaySanXuat;
	private double giaBan;
	private double thoiGianBaoHanh;

	public MayTinh(HangSanXuat hangSanXuat, Ngay ngaySx, double giaBan, double thoiGianBh) {
		this.hangSanXuat = hangSanXuat;
		this.ngaySanXuat = ngaySx;
		this.giaBan = giaBan;
		this.thoiGianBaoHanh = thoiGianBh;
	}

	public HangSanXuat getHangSanXuat() {
		return hangSanXuat;
	}

	public void setHangSangXuat(HangSanXuat hangSanXuat) {
		this.hangSanXuat = hangSanXuat;
	}

	public Ngay getNgaySanXuat() {
		return ngaySanXuat;
	}

	public void setNgaySanXuat(Ngay ngaySanXuat) {
		this.ngaySanXuat = ngaySanXuat;
	}

	public double getGiaBan() {
		return giaBan;
	}

	public void setGiaBan(double giaBan) {
		this.giaBan = giaBan;
	}

	public double getThoiGianBaoHanh() {
		return thoiGianBaoHanh;
	}

	public void setThoiGianBaoHanh(double thoiGianBaoHanh) {
		this.thoiGianBaoHanh = thoiGianBaoHanh;
	}
	
	public boolean kiemTraGiaThapHon(MayTinh mtKhac) {
		return this.getGiaBan() < mtKhac.getGiaBan();
	}

	public String layTenQuocGia() {
		return this.hangSanXuat.tenQuocGiaSx();
	}
}
