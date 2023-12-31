package fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class EData implements Serializable {
	private int id;
	private String name, email, address;
	private long contact;

	EData(int id, String name, String email, String address, long contact) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.address = address;
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "id : " + id + " name : " + name + "email : " + email + " address : " + address + " contact : "
				+ contact;
	}
}

public class SerializationNew {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EData e1 = new EData(1, "java", "java@gmail.com", "ahmedabad", 987654321);
		FileOutputStream fos = new FileOutputStream("edata.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);
		oos.flush();
		oos.close();
		System.out.println("data stored");

		FileInputStream fis = new FileInputStream("edata.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		EData e2 = (EData) ois.readObject();
		System.out.println(e2);
	}
}
