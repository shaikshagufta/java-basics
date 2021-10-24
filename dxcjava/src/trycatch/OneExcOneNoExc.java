package trycatch;

public class OneExcOneNoExc {
	public static void main(String[] args) {
		try {
			@SuppressWarnings("unused")
			int data = 50/0;  //may throw exception 
			// if exception occurs, the remaining statement will not exceute

			System.out.println("rest of the code");

		}
		// handling the exception 
		catch(ArithmeticException e)  
		{  
			System.out.println(e);  
		}
	}
}