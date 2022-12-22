package main;

import java.io.File;
import java.util.Iterator;
import java.util.Scanner;

public class Vidufile {
	File file;

	public Vidufile(String file) {
		super();
		this.file = new File(file);
	}

	public boolean kiemTrathucthi() {
		return this.file.canExecute();
	}

	public boolean kiemTraDoc() {
		return this.file.canRead();
	}

	public boolean kiemTraGhi() {
		return this.file.canWrite();
	}

	public void inDuongDan() {
		System.out.println(this.file.getAbsolutePath());
	}

	public void inTen() {
		System.out.println(this.file.getName());
	}

	public void kiemTraLaThuHayTapTin() {
		if (this.file.isDirectory()) {
			System.out.println("La thu muc");
		} else if (this.file.isFile()) {
			System.out.println("La tap tin.");
		}
	}

	public void inDanhSachFileCon() {
		if (this.file.isDirectory()) {
			System.out.println("Cac tap tin con/thu muc con");
			File[] mangFiles = this.file.listFiles();
			for (File file : mangFiles) {
				System.out.println(file.getAbsolutePath());
			}
		} else if (this.file.isFile()) {
			System.out.println("La tap tin, khong co file con");
		}
	}

	public void inCayThuMuc() {
		this.inChiTietCayThuMuc(this.file, 1);
	}

	public void inChiTietCayThuMuc(File file, int bac) {
		for (int i = 0; i < bac; i++) {
			System.out.print("\t");
		}
		System.out.print("|_");
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] mangFiles = file.listFiles();
			for (File file2 : mangFiles) {
				inChiTietCayThuMuc(file2, bac + 1);
			}
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ten file ");
		String tenFile = scanner.nextLine();
		Vidufile vidufile = new Vidufile(tenFile);
		do {
			System.out.println("Menu --------");
			System.out.println("1, Kiểm tra file có thể thực thi: ");
			System.out.println("2, Kiểm tra file có thể đọc: ");
			System.out.println("3, Kiểm tra file có thể ghi: ");
			System.out.println("4, In đường dẫn: ");
			System.out.println("5, In tên file: ");
			System.out.println("6, Kiểm tra file là thư mục hoặc tập tin: ");
			System.out.println("7, In ra danh sách file con: ");
			System.out.println("8, In ra cây thư mục: ");
			System.out.println("0, Thoát khỏi chương trình.");

			int luachon = scanner.nextInt();
			switch (luachon) {
			case 1:
				System.out.println(vidufile.kiemTrathucthi());
				break;
			case 2:
				System.out.println(vidufile.kiemTraDoc());
				break;
			case 3:
				System.out.println(vidufile.kiemTraGhi());
				break;
			case 4:
				vidufile.inDuongDan();
				break;
			case 5:
				vidufile.inTen();
				break;
			case 6:
				vidufile.kiemTraLaThuHayTapTin();
				break;
			case 7:
				vidufile.inDanhSachFileCon();
				break;
			case 8:
				vidufile.inCayThuMuc();
				break;
			case 0:
				System.exit(0);
			}
		} while (true);
	}
}
