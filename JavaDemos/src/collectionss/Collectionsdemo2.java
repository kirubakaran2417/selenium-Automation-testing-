package collectionss;

import java.util.HashMap;
import java.util.Map;

public class Collectionsdemo2 {

	public static void main(String[] args) {
		
		Map<Integer, String> mymap=new HashMap<>();
		mymap.put(23, "kiruba");
		mymap.put(34, "mary karthick");
		mymap.put(45, "meenakshi");
		
		System.out.println(mymap.keySet());
		System.out.println(mymap.values());

		//for each loop
		for(Integer dhanalakshmi: mymap.keySet()) {
			System.out.println(dhanalakshmi);
		}
		for(String mary: mymap.values()) {
			System.out.println(key);
		}
	}
}
