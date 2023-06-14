package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*FileOutputStream->to write data into file
 *FileInputStream->to read data from file
 * FileWriter->to write data into file
 * FileReader->to read data from file
 * */
public class FileOUtputInputStream {
	public static void main(String[] args) throws IOException {
//		String msg="hello this is fiile handling by output input stream";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte b[] = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("data written successfully");

		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while ((i = fis.read()) != -1) {
			System.out.print((char) i);
		}
	}
}
