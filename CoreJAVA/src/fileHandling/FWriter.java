package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FWriter {
	public static void main(String[] args) throws IOException {
//		String s = "hi this is file writer class";
//		FileWriter fr = new FileWriter("new.txt");
//		fr.write(s);
//		fr.flush();
//		fr.close();
//		System.out.println("done");
		
		FileReader f = new FileReader("new.txt");
		int i;
		while((i = f.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
