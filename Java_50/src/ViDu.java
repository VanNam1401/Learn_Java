
public class ViDu {
	public static void main(String[] args) {

		String s1 = "titv.vn";
		String s2 = "TITV.vn";
		String s3 = "titv.vn";
		// hàm equals: so sánh hai chuỗi giống nhau hay không, có phân biệt hoa thường.
		System.out.println("s1 equals s2: " + s1.equals(s2));
		System.out.println("s1 equals s3: " + s1.equals(s3));

		// hàm equalsIgnoreCase: so sánh hai chuỗi giống nhau không phân biệt chữ hoa
		// chữ thường.
		System.out.println("s1 equalsIgnoreCase s2: " + s1.equalsIgnoreCase(s2));
		System.out.println("s1 equalsIgnoreCase s3: " + s1.equalsIgnoreCase(s3));

		// hàm compareTo() => so sánh chuỗi hoặc đối tượng > < =: giá trị âm thì sv1 <
		// sv2, số dương sv1 > sv3, số 0 là sv1 = sv4
		String sv1 = "Nguyễn Văn A";
		String sv2 = "Nguyễn Văn B";
		String sv3 = "Nguyễn Văn";
		String sv4 = "Nguyễn Văn A";
		System.out.println("sv1 compareTo sv2: " + sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: " + sv1.compareTo(sv3));
		System.out.println("sv1 compareTo sv4: " + sv1.compareTo(sv4));

		// hàm compareTo() => so sánh không phân biệt chữ hoa chữ thường.

		// hàm regionMatches(vị trí bắt đầu, chuỗi cần so sánh,
		// vị trí cần so sánh của chuỗi 2, số kí tự cần so sánh) => so sánh một đoạn
		// chuỗi
		String r1 = "TITV.vn";
		String r2 = "TV.v";
		boolean check = r1.regionMatches(2, r2, 0, 4);
		System.out.println(check);

		// hàm starWith => hàm kiểm tra chuỗi bắt đầu bằng ...
		String stdString = "037456789";
		System.out.println(stdString.startsWith("037"));
		System.out.println(stdString.startsWith("034"));

		// hàm endsWith => hàm kiểm tra chuỗi kết thúc bằng...
		String tenFileString = "I live you.JPG";
		String tenFileString2 = "Học Java.PDF";

		if (tenFileString.endsWith(".JPG")) {
			System.out.println("File 1 hinh anh");
		} else if (tenFileString.endsWith(".PDF")) {
			System.out.println("File 1 la file PDF");
		}
		if (tenFileString2.endsWith(".JPG")) {
			System.out.println("File 2 hinh anh");
		} else if (tenFileString2.endsWith(".PDF")) {
			System.out.println("File 2 la file PDF");
		}
	}
}
