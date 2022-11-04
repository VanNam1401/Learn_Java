
public class HinhChuNhat extends Hinh {
	private double chieuRong, chieuCao;

	public HinhChuNhat(ToaDo toaDo, double chieuRong, double chieuCao) {
		super(toaDo);
		this.chieuCao = chieuCao;
		this.chieuRong = chieuRong;
	}

	public double tinhDienTich() {
		return this.chieuCao * this.chieuRong;
	}
	
}
