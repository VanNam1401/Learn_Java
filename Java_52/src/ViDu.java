
public class ViDu {
	public static void main(String[] args) {
		String s1 = "tItv";
		String s2 = ".Vn";

		String s3 = s1 + s2;
		// hàm concat => nối chuỗi.
		String s4 = s1.concat(s2);
		System.out.println("s3 = " + s3);
		System.out.println("s4 = " + s4);

		// hàm replaceAll => thay thế nội dung bên trong chuỗi
		String s5 = "Tung.vn";
		String s6 = s5.replaceAll("Tung", "TITV");
		System.out.println("s5 = " + s6);

		// toLowerCase => chuyển về viết thường
		// toUpperCase => chuyển về viết hoa.
		System.out.println(s3.toLowerCase());
		System.out.println(s3.toUpperCase());

		System.out.println();
		// hàm trim: xóa bỏ khoảng trắng dư thừa ở đầu chuỗi.
		String s9 = " Xin chào các bạn, mình là   ";
		System.out.println(s9.trim());
		
		System.out.println();
		// hàm toCharArray(...): biến đổi chuỗi thành mảng các ký tự.
		// hàm subString (vị trí bắt đầu cắt, vị trí kết thúc - 1) => cắt chuỗi con.
		String s10 = "Xin chào các bạn, mình là";
		String s11 = s10.substring(10);
		String s12 = s10.substring(10, 15);
		System.out.println(s11);
		System.out.println(s12);
	}
}
