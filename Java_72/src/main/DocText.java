package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.List;

public class DocText {
	public static void main(String[] args) {
		// Cach 1
//		File file = new File("D:\\Workspace\\Learn_Java\\Java_72\\file.txt");
//		try {
//			BufferedReader br = Files.newBufferedReader(file.toPath(), StandardCharsets.UTF_8);
//			String line = null;
//			while (true) {
//				line = br.readLine();
//				if (line == null) {
//					break;
//				} else {
//					System.out.println(line);
//				}
//			}
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		// cach 2:
		File file2 = new File("D:\\Workspace\\Learn_Java\\Java_72\\file.txt");
		try {
			List<String> allText = Files.readAllLines(file2.toPath(), StandardCharsets.UTF_8);
			for (String string : allText) {
				System.out.println(string);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
