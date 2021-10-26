package collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {

	public static void main(String[] args)
	{
		PriorityQueue<String> names = new PriorityQueue<>();
		names.add("shaggu");
		names.add("shagufta");
		names.add("Shayi");
		names.add("shayasta");

		System.out.println("head"+names.element());
		System.out.println("head"+names.peek());
		System.out.println("iterating the queue(names) elements");

		Iterator<String> itr = names.iterator();
		while (itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		names.remove();
		names.poll();
		System.out.println("after removing 2 elements");

		Iterator<String> itr2 = names.iterator();
		while (itr.hasNext());
		{
			System.out.println(itr2.hasNext());
		}

	}
}
