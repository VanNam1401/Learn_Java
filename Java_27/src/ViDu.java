import java.util.Scanner;

public class ViDu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		try {
			System.out.println("Nhap vao so nguyen n: ");
			n = scanner.nextInt();

		} catch (Exception e) {
			System.out.println("Nhap du lieu khong dung");
		} finally {
			System.out.println("Finally");
		}
		System.out.println("Gia tri nhap: " + n);
		System.out.println("Ket thuc chuong trinh");
	}

}
