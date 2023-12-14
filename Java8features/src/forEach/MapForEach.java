package forEach;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapForEach {
	public static void main(String[] args) {
		Map<Integer,Person>map=new HashMap<Integer,Person>();
		map.put(1, new Person("Ramesh",29));
		map.put(2, new Person("Ram",39));
	//forEach loop
	for(Entry<Integer,Person>entry:map.entrySet()) {
		System.out.println(entry.getKey());
		System.out.println(entry.getValue().getName());
	}
	//forEach method
	
	map.forEach((k,v)->{
		System.out.println(k);
		System.out.println(v.getName());
	});
	
}
}