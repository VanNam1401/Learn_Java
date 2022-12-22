package main;

import java.io.File;
import java.io.IOException;

public class TaoTapTinVaThuMuc {
	public static void main(String[] args) {

		File folder1 = new File("D:\\Workspace\\Learn_Java\\Java_67");
		File folder2 = new File("D:\\Workspace\\Learn_Java\\Java_68");

		// kiểm tra tồn tại
		System.out.println("Kiem tra folder có tồn tại hay không: " + folder1.exists());
		System.out.println("Kiem tra folder có tồn tại hay không: " + folder2.exists());

		// tạo thư mục
		// method mkdir() => tạo 1 thư mục
		File folder3 = new File("D:\\Workspace\\Learn_Java\\Java_67\\director1");
		folder3.mkdir();

		// method mkdirs() => tạo nhiều thư mục cùng lúc
		File folder4 = new File("D:\\Workspace\\Learn_Java\\Java_67\\director1\\directory2\\director3");
		folder4.mkdirs();
		
		// tạo tập tin (có phần mở rộng: .exe, .txt, .doc...)
		File file1 = new File("D:\\Workspace\\Learn_Java\\Java_67\\director1\\vidu1.txt");
		try {
			file1.createNewFile();
		} catch (IOException e) {
			// k có quyền tạo tập tin.
			// ổ cứng bị đầy
			// đường dẫn bị sai
			e.printStackTrace();
		}
	}
}
