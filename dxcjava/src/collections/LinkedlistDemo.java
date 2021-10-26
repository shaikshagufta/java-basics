package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {
	
	public static void main(String[] args) {
	
		LinkedList<String> names = new LinkedList<String>();
		names.add("shaggu");
		names.add("shagufta");
		
		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			}
		
	}
	
}
