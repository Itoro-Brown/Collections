package itoro;

import java.util.HashMap;

public class Hasmaps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hash = new HashMap<Integer, String> ();  
		
		hash.put(101, "Fish");   // This is how to add a value to hashmap 
		hash.put(102, "Dogs");
		hash.put(104, "Birds");
		
		
		System.out.println(hash.get(104)); // This is how to retrieve values in the hashmap collection
		
		
		for (Integer temp : hash.keySet()) {
			
			System.out.println(temp);
			System.out.println(hash.get(temp));
		}
		
	
	}

}
