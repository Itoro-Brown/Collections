package itoro;

import java.util.ArrayList;

public class collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// In collections group of objects are stored ,whereas in arrays the datatypes is stored 
		
		
		//Traditiinal arrays 
		
		String [] cars = new String [4];
		
		cars[0]= "Toyota";
		cars[1]= "Camry";
		cars[2]= "Lambo";
		cars[3]= "Benz";
		
		
		for (String temp : cars) {
			System.out.println(temp);
		}
		
		
		// ArrayList 
		
		// First we need to create an object for Arraylist 
		
		ArrayList<Integer> list = new ArrayList();  // This can be String, Integer or Boolean 
		
		// To add value we use to object with methods 
		list.add(45);
		list.add(33);
		list.add(11);
		list.add(90);
		list.add(22);
		list.add(50);
		
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		System.out.println("-----------------------------------------");
		System.out.println("The forLoop starts here ");
		
		for (int i = 0; i < list.size(); i++) //To get the length of the arraylist you use the size method 
		
		{
			
			
			
			System.out.println("This is  my index on the arraylist : " + i);// This gets the index of the list
			System.out.println(list.get(i)); // This gets the items in the list 
		}
		
		
		//ForEach could also be used 
		
		System.out.println ("ForEach loop output ");
		for(Integer temp : list) {
			
			System.out.println(temp);
		}
		

	}

}
