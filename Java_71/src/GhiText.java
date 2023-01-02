import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

public class GhiText {
public static void main(String[] args) {
	PrintWriter pw;
	try {
		pw = new PrintWriter("D:\\Workspace\\Learn_Java\\Java_71\\file.txt", "UTF-8");
		pw.print("xin chao");
		pw.println("Du lieu: ");
		pw.print(3.14);
		pw.println("PI");
		
		Student student = new Student(10, "Nam");
		pw.println(student);
		pw.flush();
		pw.close();
	} catch (FileNotFoundException | UnsupportedEncodingException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}
