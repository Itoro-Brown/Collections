package itoro;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		
		//** Hashset do not have indexes as collection and arrays do.**\\
		// Items are not added in any specific patter, they are added randomly 
		//U can not use for loop with hashset, but ForEach loop can be used.
		
		
		HashSet<String> hash = new HashSet<String>();
		
		
		//To add items 
		hash.add("Car");
		hash.add("Bus");
		hash.add("school");
		hash.add("Java");
		
		
		for (String temp : hash) {
			System.out.println(temp); // This is to print out the item on the hash collection 
			
		}
		System.out.println(hash.size()); // This is to printout the size of the hash collection 
		
	}

}
