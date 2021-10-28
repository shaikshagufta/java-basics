package collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSort {

	public static void main(String[] args) {
		ArrayList<Integer> names = new ArrayList<Integer>();
		names.add(6);
		names.add(20);
		names.add(45);
		names.add(70);

		//names.add(39);
		System.out.println(names);

		//Sorting the list  
		Collections.sort(names);
		for(Integer name : names)
		{
			System.out.println("the name is "+ name);
		}


		/*

		Iterator<String> itr = names.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			}
		 */		
	}
}
