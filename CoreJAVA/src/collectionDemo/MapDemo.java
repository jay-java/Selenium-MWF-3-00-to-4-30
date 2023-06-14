package collectionDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapDemo {
	public static void main(String[] args) {
		Map map = new HashMap();
		map.put(1, "manual");//entry
		map.put(2, "selenium");
		map.put(3, "appium");
		map.put(4, "API");
		System.out.println(map);
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			Map.Entry entry =(Entry)itr.next();
			System.out.println("key : "+entry.getKey());
			System.out.println("value : "+entry.getValue());
		}
	}
}
