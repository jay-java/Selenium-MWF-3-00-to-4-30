package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOS {
	public static void main(String[] args) throws IOException {
//		String s = "hi this file output stream";
//		System.out.println(s);
//		FileOutputStream fos = new FileOutputStream("myfile.txt");
//		byte b[] = s.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("file written successfully");
		
		
		FileInputStream fis = new FileInputStream("myfile.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
