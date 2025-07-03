package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class HashMapTest {
	public static void main(String[] args) {
		HashMap<String, Object> userMap = new HashMap<>(); // value는 어떤 게 들어와도 상관없으니 Object
		userMap.put("id", "sma1234"); 
		userMap.put("password", "1234");
		userMap.put("name", "서민아");
		userMap.put("age", 26);
		
		System.out.println(userMap.size());
		System.out.println(userMap); 
		System.out.println(userMap.get("id")); 
		
		Iterator<Entry<String, Object>> iter = userMap.entrySet().iterator(); // => 통째로가 iterator타입
		
		while(iter.hasNext()) {
			Entry<String, Object> entry = iter.next();
			if(entry.getKey().equals("name")) {
				System.out.println(entry.getValue());
			}
		}
		
	}

}
