package collections;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>();
		names.add("shaggu");
		names.add("shagufta");
		//names.add(39);
		System.out.println(names);
		for(String name : names)
		{
			System.out.println("the name is "+ name);
		}
	}
}
