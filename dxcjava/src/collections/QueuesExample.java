package collections;

import java.util.Deque;
import java.util.LinkedList;

public class QueuesExample {
	
	public static void main(String[] args) {
		Deque<String> names = new LinkedList<String>();

	// We can add elements to the queue
	// in various ways

	// Add at the last
	names.add("Element 1 (Tail)");

	// Add at the first
	names.addFirst("Element 2 (Head)");

	// Add at the last
	names.addLast("Element 3 (Tail)");

	// Add at the first
	names.push("Element 4 (Head)");

	// Add at the last
	names.offer("Element 5 (Tail)");

	// Add at the first
	names.offerFirst("Element 6 (Head)");
	
	System.out.println(names + "\n");

	// We can remove the first element
	// or the last element.
	names.removeFirst();
	names.removeLast();
	System.out.println("Deque after removing "
					+ "first and last: "
					+ names);
	}
	

}
