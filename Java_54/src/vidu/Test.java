package vidu;

public class Test {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(150, "Dang Van Nam", "Java1", 9);
		SinhVien sv2 = new SinhVien(100, "Nguyen Van N", "Java2", 8);
		SinhVien sv3 = new SinhVien(199, "Nguyen Van A", "Java9", 8);
		
		System.out.println(sv1.compareTo(sv2));
		System.out.println(sv3.compareTo(sv1));
		
	}
}
