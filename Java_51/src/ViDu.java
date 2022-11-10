
public class ViDu {
	public static void main(String[] args) {
		String s1 = "Xin chào cô chú, xin chào các bạn, Xin chào!";
		String s2 = "Xin chào";
		String s3 = "Xin chào 123";
		char c1 = 'ô';

		// hàm indexOf(): tìm kiếm chuỗi, trả về vị trí xuất hiện đầu tiên
		System.out.println("Vị trí của s2 trong s1 la " + s1.indexOf(s2));
		System.out.println("Vị trí của s3 trong s1 la " + s1.indexOf(s3));

		System.out.println();
		// sử dụng bị trí bắt đầu. indexOf(chuỗi, vị trí).
		System.out.println("Vị trí của s2 trong s1 la " + s1.indexOf(s2, 2));

		System.out.println();
		// tìm kiếm char.
		System.out.println("Vị trí của s2 trong s1 la " + s1.indexOf(c1));
		System.out.println("Vị trí của s2 trong s1 la " + s1.indexOf(c1, 20));
		
		System.out.println();
		// hàm lastIndexOf(): tìm kiếm từ phải sang trái.
		System.out.println("Vị trí của s2 trong s1 la " + s1.lastIndexOf(s2));
		System.out.println("Vị trí của s3 trong s1 la " + s1.lastIndexOf(s3));
	}
}
