package itoro;

import java.util.ArrayList;
import java.util.Iterator;

public class iteratorMethodAndInterface {

	public static void main(String[] args) {
		
		ArrayList<Integer> alist = new ArrayList<Integer>(); 
		
		alist.add(6);
		alist.add(2);
		alist.add(8);
		alist.add(7);
		
		//Using Iterator () method of predefined method collection 
		
		Iterator<Integer> itr = alist.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.hasNext()); // This is how to view the items in the collection for iterator methods 
		}
		

	}

}
