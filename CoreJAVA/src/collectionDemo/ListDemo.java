package collectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//collection -> is framework in java that provides 
//				an architecture to manipulate group of objects.
//Root Interface -> Iterable
//List -> duplication is allowed, insertion order is maintained
//Set-> duplication is not allowed and 
//		insertion order is not maintained
//map->data stored in key value pair (Entry)
//		key->unique,single null key in HashMap
//		value->can be duplicate,multiple null values allowed
//		<generics>
public class ListDemo {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add(1);
		list.add(1);
		list.add("jay");
		list.add(987654321);
		list.add(362.4);
		list.add(false);
		System.out.println(list);
		list.remove(5);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
