package main;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class XoaFile {

	static void xoaFile(File file) {
		if (file.isFile()) {
			System.out.println("Da xoa: " + file.getAbsolutePath());
			file.delete();
		} else if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (File f : files) {
				xoaFile(f);
			}
			System.out.println("Da xoa: " + file.getAbsolutePath());
			file.delete();
		}
	}

	public static void main(String[] args) {
		// sử dụng class File để xóa tập tin và thư mục.
		File f0 = new File("D:\\Workspace\\Learn_Java\\Java_69\\f0");
		File f0_1 = new File("D:\\Workspace\\Learn_Java\\Java_69\\f0_1");
		File f = new File("D:\\Workspace\\Learn_Java\\Java_69\\Vidu.txt");

//		f0.deleteOnExit(); // xóa k được vì có chwuas thư mục hoặc tập tin bên trong.
//		f0_1.deleteOnExit(); // xóa được vì là thư mục rống
//		f.deleteOnExit(); // xóa được vì là tập tin
//		xoaFile(f0);

		// sử dụng class Files xóa tập tin và thư mục
		Path path = f0.toPath();
		Path path_1 = f0_1.toPath();
		Path path_vidu = f.toPath();
		try {
//			Files.deleteIfExists(path);
			Files.deleteIfExists(path_1);
			Files.deleteIfExists(path_vidu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
