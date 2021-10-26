package collections;


import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {


		Stack<String> names = new Stack<String>();
		names.add("shaggu");
		names.add("shagufta");
		System.out.println(names);
		System.out.println(names.pop());
		System.out.println(names);

	}
}
