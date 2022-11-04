package Jv39b;

public class main {
public static void main(String[] args) {
	ConNguoi cNguoi = new ConNguoi("TITV", 2021);
//	cNguoi.an();
//	cNguoi.ngu();
//	cNguoi.uong();
	
	HocSinh hSinh = new HocSinh("TITV", 2021, "Lớp 1", "Trường 1");
	hSinh.an();
	hSinh.uong();
	hSinh.ngu();
	hSinh.lamBaiTap();
	System.out.println(hSinh.getTenTruong());
}
}
