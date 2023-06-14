package collectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {
	public static void main(String[] args) {
		Set set = new HashSet();
		set.add(1);
		set.add(1);
		set.add("java");
		set.add(34.3);
		set.add(false);
		set.add('f');
		System.out.println(set);
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
