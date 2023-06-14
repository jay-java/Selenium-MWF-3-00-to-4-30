package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentP implements Serializable{
	int id;
	String name;
	long contact;
	public StudentP(int id,String name,long contact) {
		this.id=id;
		this.name=name;
		this.contact = contact;
	}
	@Override
	public String toString() {
		return "id : "+id+" name : "+name+ " contact : "+contact;
	}
}
public class SerailizationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		StudentP s1 = new StudentP(1, "selenium", 987654231);
//		FileOutputStream fos  = new FileOutputStream("serialize.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		oos.flush();
//		oos.close();
//		System.out.println("studnet stored successfully");
		
		FileInputStream fis = new FileInputStream("serialize.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentP s = (StudentP)ois.readObject();
		System.out.println(s);
	}
}
