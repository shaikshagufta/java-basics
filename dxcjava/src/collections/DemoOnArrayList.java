package collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressWarnings("unused")
public class DemoOnArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("shaggu");
		names.add("shagufta");
		//names.add(39);
		System.out.println(names);
		/*for(String name : names)
		{
			System.out.println("the name is "+ name);
		}
		*/
		@SuppressWarnings("rawtypes")
		Iterator itr = names.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			}
		}
}