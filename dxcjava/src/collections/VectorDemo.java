package collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector<String> names = new Vector<String>();

		names.add("shaggu");
		names.add("shagufta");
		Iterator<String> itr = names.iterator();
		while (itr.hasNext());
		{
			System.out.println(itr.next());
		}
	}
}
