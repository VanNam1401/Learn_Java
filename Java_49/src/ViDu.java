import java.util.Scanner;
import java.util.Set;

public class ViDu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Nhap vao chuoi: ");
		s = sc.nextLine();
		System.out.println("---------");

		// ham length() => do dai
		System.out.println(s.length());
		// charAt(vi tri): lấy ra kí tự tại vị trí nằm trong chuỗi.
		int doDai = s.length();
		for (int i = 0; i < doDai; i++) {
//			if (s.charAt(i) == " ") {
//				continue;
//			} else {
//				
//			}
			System.out.println("Vi tri " + i + " la: " + s.charAt(i));
		}
		// getChars(vị trí bắt đầu lấy, vị trí kết thúc -1, mảng lưu dữ liệu, vị trí bắt đầu lưu của mảng) lấy hàng loạt kí tự ra.
		char[] array = new char[100];
		s.getChars(2, 4, array, 0);
		for (int i = 0; i < s.length(); i++) {
			System.out.println("Giá trị của mảng tại " + i + " là: " + array[i]);
		}
		//getByte(...) = > có 3 cách lấy ra giá trị của các kí tự trong bảng mã ASCII thành một mảng
		byte[] arrayByte = s.getBytes();
		for (byte b : arrayByte) {
			System.out.println(b);
		}
		
	}
}
