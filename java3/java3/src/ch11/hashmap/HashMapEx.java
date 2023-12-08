package ch11.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {

		HashMap<String, Integer> map = new HashMap<>();
		map.put("김자바", 90);
		map.put("김자바", 100);
		map.put("이자바", 100);
		map.put("강자바", 80);
		map.put("안자바", 90);

		Set set = map.entrySet();
		Iterator it = set.iterator();

		while (it.hasNext()) {
			Map.Entry e = (Map.Entry) it.next();
			System.out.println("key" + e.getKey() + "value" + e.getValue());
		}

//	1.	java 1.8 람다식

		map.forEach((key, value) -> System.out.println("키:" + key + ",값:" + value));
//	2.	
		map.forEach(new BiConsumer<>() {

			@Override
			public void accept(String t, Integer u) {
				System.out.println("key" + t + "value" + u);

			}
		});
	}

}
